package com.study.ui.panel;

import java.awt.BorderLayout;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.table.AbstractTableModel;

import com.study.constants.FieldAccessFlags;
import com.study.parser.ParseResult;
import com.study.present.FieldInfoPresenter;
import com.study.type.ConstantPool;
import com.study.type.info.FieldInfo;
import com.study.ui.support.AccessFlagsTable;
import com.study.ui.support.TextAreas;
import com.study.ui.support.TextCapture;

/**
 * Fields table plus a detail pane. The detail pane reuses
 * {@link FieldInfoPresenter}, so its content stays identical to the CLI output.
 * The selected field's access flags are rendered as the embedded JVMS
 * Table 4.5-A, with the set rows highlighted.
 */
public class FieldsPanel extends JPanel {

    /**
     * JVMS §4.5 Table 4.5-A: field access and property modifiers.
     */
    private static final Map<FieldAccessFlags, String> FLAG_MEANINGS = new EnumMap<>(Map.ofEntries(
            Map.entry(FieldAccessFlags.ACC_PUBLIC,
                    "Declared public; may be accessed from outside its package."),
            Map.entry(FieldAccessFlags.ACC_PRIVATE,
                    "Declared private; accessible only within the defining class "
                            + "and other classes belonging to the same nest (§5.4.4)."),
            Map.entry(FieldAccessFlags.ACC_PROTECTED,
                    "Declared protected; may be accessed within subclasses."),
            Map.entry(FieldAccessFlags.ACC_STATIC,
                    "Declared static."),
            Map.entry(FieldAccessFlags.ACC_FINAL,
                    "Declared final; never directly assigned to after object construction (JLS §17.5)."),
            Map.entry(FieldAccessFlags.ACC_VOLATILE,
                    "Declared volatile; cannot be cached."),
            Map.entry(FieldAccessFlags.ACC_TRANSIENT,
                    "Declared transient; not written or read by a persistent object manager."),
            Map.entry(FieldAccessFlags.ACC_SYNTHETIC,
                    "Declared synthetic; not present in the source code."),
            Map.entry(FieldAccessFlags.ACC_ENUM,
                    "Declared as an element of an enum class.")
    ));

    private static final List<AccessFlagsTable.FlagRow> FLAG_ROWS = Arrays.stream(FieldAccessFlags.values())
            .map(flag -> new AccessFlagsTable.FlagRow(flag.name(), flag.getFlag(), FLAG_MEANINGS.get(flag)))
            .toList();

    private final ParseResult result;
    private final JTextArea detailArea = TextAreas.readOnlyMonospace();
    private final AccessFlagsTable flagsTable;

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

        this.flagsTable = new AccessFlagsTable(FLAG_ROWS,
                fields.isEmpty() ? 0 : fields.get(0).getAccessFlags().toInt());
        JScrollPane flagsPane = new JScrollPane(flagsTable);
        flagsPane.setBorder(BorderFactory.createTitledBorder("access_flags (JVMS Table 4.5-A)"));

        table.getSelectionModel().addListSelectionListener(event -> {
            if (event.getValueIsAdjusting()) {
                return;
            }
            int selected = table.getSelectedRow();
            if (selected >= 0) {
                showDetail(fields.get(table.convertRowIndexToModel(selected)));
            }
        });

        JSplitPane detailSplit = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
                flagsPane, new JScrollPane(detailArea));
        detailSplit.setResizeWeight(0.45);
        detailSplit.setContinuousLayout(true);

        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
                new JScrollPane(table), detailSplit);
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
        flagsTable.setFlags(fieldInfo.getAccessFlags().toInt());
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
                case 0 -> field.buildAccessFlagsLine().replaceAll("^flags: \\(0x[0-9a-f]+\\)\\s*", "");
                case 1 -> constantPool.desc(field.getNameIndex());
                case 2 -> field.buildHumanReadableTypeDesc(constantPool);
                case 3 -> constantPool.desc(field.getDescriptorIndex());
                case 4 -> field.getAttributes().getCount();
                default -> "";
            };
        }
    }
}
