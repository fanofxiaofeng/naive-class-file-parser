package com.study.ui.panel;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.table.AbstractTableModel;

import com.study.parser.ParseResult;
import com.study.present.FieldInfoPresenter;
import com.study.type.ConstantPool;
import com.study.type.info.FieldInfo;
import com.study.ui.support.TextAreas;
import com.study.ui.support.TextCapture;

/**
 * Fields table plus a detail pane. The detail pane reuses
 * {@link FieldInfoPresenter}, so its content stays identical to the CLI output.
 */
public class FieldsPanel extends JPanel {

    private final ParseResult result;
    private final JTextArea detailArea = TextAreas.readOnlyMonospace();

    public FieldsPanel(ParseResult result) {
        super(new BorderLayout());
        this.result = result;

        List<FieldInfo> fields = result.getFields().items();
        JTable table = new JTable(new FieldsTableModel(result.getConstantPool(), fields));
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.getColumnModel().getColumn(0).setPreferredWidth(160);
        table.getColumnModel().getColumn(1).setPreferredWidth(160);
        table.getColumnModel().getColumn(2).setPreferredWidth(240);
        table.getColumnModel().getColumn(3).setPreferredWidth(200);
        table.getColumnModel().getColumn(4).setPreferredWidth(70);

        table.getSelectionModel().addListSelectionListener(event -> {
            if (event.getValueIsAdjusting()) {
                return;
            }
            int selected = table.getSelectedRow();
            if (selected >= 0) {
                showDetail(fields.get(table.convertRowIndexToModel(selected)));
            }
        });

        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
                new JScrollPane(table), new JScrollPane(detailArea));
        splitPane.setResizeWeight(0.55);
        splitPane.setContinuousLayout(true);

        JLabel countLabel = new JLabel(" Fields: " + fields.size());
        countLabel.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
        add(countLabel, BorderLayout.NORTH);
        add(splitPane, BorderLayout.CENTER);

        if (!fields.isEmpty()) {
            table.setRowSelectionInterval(0, 0);
        }
    }

    private void showDetail(FieldInfo fieldInfo) {
        String text = TextCapture.safeCapture(wrapper ->
                new FieldInfoPresenter(result, wrapper, fieldInfo).present());
        detailArea.setText(text);
        detailArea.setCaretPosition(0);
    }

    private static class FieldsTableModel extends AbstractTableModel {

        private static final String[] COLUMNS = {"access flags", "name", "type", "descriptor", "attributes"};

        private final ConstantPool constantPool;
        private final List<FieldInfo> fields;

        private FieldsTableModel(ConstantPool constantPool, List<FieldInfo> fields) {
            this.constantPool = constantPool;
            this.fields = fields;
        }

        @Override
        public int getRowCount() {
            return fields.size();
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
            FieldInfo field = fields.get(rowIndex);
            return switch (columnIndex) {
                case 0 -> field.buildHumanReadableFlagsDesc();
                case 1 -> constantPool.desc(field.getNameIndex());
                case 2 -> field.buildHumanReadableTypeDesc(constantPool);
                case 3 -> constantPool.desc(field.getDescriptorIndex());
                case 4 -> field.getAttributes().getCount();
                default -> "";
            };
        }
    }
}
