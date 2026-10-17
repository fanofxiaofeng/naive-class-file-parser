package com.study.ui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetAdapter;
import java.awt.dnd.DropTargetDropEvent;
import java.io.File;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.ExecutionException;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.SwingWorker;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;

import com.study.parser.ParseResult;
import com.study.ui.panel.AttributesPanel;
import com.study.ui.panel.ConstantPoolPanel;
import com.study.ui.panel.FieldsPanel;
import com.study.ui.panel.MethodsPanel;
import com.study.ui.panel.OverviewPanel;

public class MainFrame extends JFrame {

    private enum Section {
        OVERVIEW("Overview"),
        CONSTANT_POOL("Constant Pool"),
        FIELDS("Fields"),
        METHODS("Methods"),
        ATTRIBUTES("Attributes");

        private final String label;

        Section(String label) {
            this.label = label;
        }

        @Override
        public String toString() {
            return label;
        }
    }

    private static final String PLACEHOLDER_CARD = "placeholder";

    private final CardLayout cardLayout = new CardLayout();
    private final JPanel cardPanel = new JPanel(cardLayout);
    private final JTree navigationTree;
    private final DefaultMutableTreeNode rootNode;
    private final JLabel statusLabel = new JLabel(" ");

    private ParseResult result;

    public MainFrame() {
        super("Naive Class File Parser");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setJMenuBar(buildMenuBar());

        this.rootNode = new DefaultMutableTreeNode("(no file opened)");
        for (Section section : Section.values()) {
            rootNode.add(new DefaultMutableTreeNode(section));
        }
        this.navigationTree = new JTree(rootNode);
        navigationTree.setRootVisible(true);
        navigationTree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        navigationTree.addTreeSelectionListener(event -> {
            if (result == null) {
                return;
            }
            Object selected = ((DefaultMutableTreeNode)
                    event.getPath().getLastPathComponent()).getUserObject();
            if (selected instanceof Section section) {
                cardLayout.show(cardPanel, section.name());
            }
        });

        JScrollPane navigationScroll = new JScrollPane(navigationTree);
        navigationScroll.setBorder(BorderFactory.createEmptyBorder());

        showPlaceholder("Open a .class file via \"File -> Open...\", or drag and drop a file onto this window");

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                navigationScroll, cardPanel);
        splitPane.setDividerLocation(170);
        splitPane.setContinuousLayout(true);

        add(buildToolBar(), BorderLayout.NORTH);
        add(splitPane, BorderLayout.CENTER);
        statusLabel.setBorder(BorderFactory.createEmptyBorder(2, 6, 2, 6));
        add(statusLabel, BorderLayout.SOUTH);

        setSize(1100, 720);
        setLocationRelativeTo(null);
        enableDragAndDrop();
    }

    private JMenuBar buildMenuBar() {
        JMenu fileMenu = new JMenu("File");
        fileMenu.add(new JMenuItem(new AbstractAction("Open...") {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                chooseFileAndOpen();
            }
        }));
        fileMenu.addSeparator();
        fileMenu.add(new JMenuItem(new AbstractAction("Exit") {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                dispose();
            }
        }));

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(fileMenu);
        return menuBar;
    }

    private JComponent buildToolBar() {
        JPanel toolBar = new JPanel(new BorderLayout());
        JButton openButton = new JButton("Open .class File");
        openButton.addActionListener(e -> chooseFileAndOpen());
        toolBar.add(openButton, BorderLayout.WEST);
        toolBar.setBorder(BorderFactory.createEmptyBorder(4, 6, 4, 6));
        return toolBar;
    }

    private void showPlaceholder(String message) {
        cardPanel.removeAll();
        JPanel placeholder = new JPanel(new BorderLayout());
        JLabel label = new JLabel(message, JLabel.CENTER);
        label.setFont(label.getFont().deriveFont(Font.PLAIN, 14f));
        placeholder.add(label, BorderLayout.CENTER);
        cardPanel.add(placeholder, PLACEHOLDER_CARD);
        cardLayout.show(cardPanel, PLACEHOLDER_CARD);
        cardPanel.revalidate();
        cardPanel.repaint();
    }

    private void chooseFileAndOpen() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select a class file");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Java class files (*.class)", "class"));
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            openFile(fileChooser.getSelectedFile().toPath());
        }
    }

    /**
     * Parses the file on a background thread (large class files must not block the EDT),
     * then rebuilds all panels on success.
     */
    public void openFile(Path path) {
        if (path == null) {
            return;
        }
        statusLabel.setText("Parsing: " + path);
        new SwingWorker<ParseResult, Void>() {
            @Override
            protected ParseResult doInBackground() throws Exception {
                return ClassFileParsingService.parse(path);
            }

            @Override
            protected void done() {
                try {
                    showResult(path, get());
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause() == null ? e : e.getCause();
                    JOptionPane.showMessageDialog(MainFrame.this,
                            "Failed to parse the class file:\n" + cause.getClass().getSimpleName()
                                    + ": " + cause.getMessage(),
                            "Parse failed", JOptionPane.ERROR_MESSAGE);
                    statusLabel.setText("Parse failed: " + path);
                }
            }
        }.execute();
    }

    private void showResult(Path path, ParseResult parseResult) {
        this.result = parseResult;

        rootNode.setUserObject(parseResult.getConstantPool().detail(parseResult.getThisClass()));
        navigationTree.updateUI();

        cardPanel.removeAll();
        cardPanel.add(new OverviewPanel(result, path), Section.OVERVIEW.name());
        cardPanel.add(new ConstantPoolPanel(result), Section.CONSTANT_POOL.name());
        cardPanel.add(new FieldsPanel(result), Section.FIELDS.name());
        cardPanel.add(new MethodsPanel(result), Section.METHODS.name());
        cardPanel.add(new AttributesPanel(result), Section.ATTRIBUTES.name());
        cardLayout.show(cardPanel, Section.OVERVIEW.name());
        cardPanel.revalidate();
        cardPanel.repaint();

        // row 0 is the root; row 1 is the "Overview" node
        navigationTree.setSelectionRow(1);

        String className = result.getConstantPool().detail(result.getThisClass());
        setTitle("Naive Class File Parser — " + className + "  (" + path + ")");
        statusLabel.setText("Loaded: " + path);
    }

    private void enableDragAndDrop() {
        new DropTarget(this, DnDConstants.ACTION_COPY, new DropTargetAdapter() {
            @Override
            public void drop(DropTargetDropEvent event) {
                try {
                    event.acceptDrop(DnDConstants.ACTION_COPY);
                    @SuppressWarnings("unchecked")
                    List<File> files = (List<File>) event.getTransferable()
                            .getTransferData(DataFlavor.javaFileListFlavor);
                    files.stream()
                            .filter(file -> file.getName().endsWith(".class"))
                            .findFirst()
                            .ifPresent(file -> openFile(file.toPath()));
                    event.dropComplete(true);
                } catch (Exception e) {
                    event.dropComplete(false);
                }
            }
        });
    }
}
