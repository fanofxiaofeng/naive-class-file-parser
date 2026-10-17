package com.study.ui.panel;

import com.study.parser.ParseResult;
import com.study.present.MethodInfoPresenter;
import com.study.type.ConstantPool;
import com.study.type.info.MethodInfo;
import com.study.ui.support.TextCapture;
import com.study.ui.support.TextAreas;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.table.AbstractTableModel;
import java.awt.BorderLayout;
import java.util.List;

/**
 * Method table plus a detail pane. The detail pane reuses
 * {@link MethodInfoPresenter}, which renders the header line (with the
 * human-readable signature), descriptor, flags and all attributes
 * (including Code: instructions, exception table, line number table, ...).
 */
public class MethodsPanel extends JPanel {

    private final ParseResult result;
    private final JTextArea detailArea = TextAreas.readOnlyMonospace();

    public MethodsPanel(ParseResult result) {
        super(new BorderLayout());
        this.result = result;

        List<MethodInfo> methods = result.getMethods().items();
        JTable table = new JTable(new MethodsTableModel(result.getConstantPool(), methods));
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.getColumnModel().getColumn(0).setPreferredWidth(180);
        table.getColumnModel().getColumn(1).setPreferredWidth(180);
        table.getColumnModel().getColumn(2).setPreferredWidth(380);
        table.getColumnModel().getColumn(3).setPreferredWidth(70);

        table.getSelectionModel().addListSelectionListener(event -> {
            if (event.getValueIsAdjusting()) {
                return;
            }
            int selected = table.getSelectedRow();
            if (selected >= 0) {
                showDetail(methods.get(table.convertRowIndexToModel(selected)));
            }
        });

        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
                new JScrollPane(table), new JScrollPane(detailArea));
        splitPane.setResizeWeight(0.55);
        splitPane.setContinuousLayout(true);

        JLabel countLabel = new JLabel(" Methods: " + methods.size());
        countLabel.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
        add(countLabel, BorderLayout.NORTH);
        add(splitPane, BorderLayout.CENTER);

        if (!methods.isEmpty()) {
            table.setRowSelectionInterval(0, 0);
        }
    }

    private void showDetail(MethodInfo methodInfo) {
        String text = TextCapture.safeCapture(wrapper ->
                new MethodInfoPresenter(result, wrapper, methodInfo).present());
        detailArea.setText(text);
        detailArea.setCaretPosition(0);
    }

    private static class MethodsTableModel extends AbstractTableModel {

        private static final String[] COLUMNS = {"access flags", "name", "descriptor", "attributes"};

        private final ConstantPool constantPool;
        private final List<MethodInfo> methods;

        private MethodsTableModel(ConstantPool constantPool, List<MethodInfo> methods) {
            this.constantPool = constantPool;
            this.methods = methods;
        }

        @Override
        public int getRowCount() {
            return methods.size();
        }

        @Override
        public int getColumnCount() {
            return COLUMNS.length;
        }

        @Override
        public String getColumnName(int column) {
            return COLUMNS[column];
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            MethodInfo method = methods.get(rowIndex);
            return switch (columnIndex) {
                case 0 -> method.buildAccessFlagsLine().replaceAll("^flags: \\(0x[0-9a-f]+\\)\\s*", "");
                case 1 -> constantPool.desc(method.getNameIndex());
                case 2 -> constantPool.desc(method.getDescriptorIndex());
                case 3 -> method.getAttributes().getCount();
                default -> "";
            };
        }
    }
}
