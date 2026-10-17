package com.study.ui.panel;

import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.constant.CpInfo;
import com.study.type.constant.compound.CompoundCpInfo;
import com.study.type.constant.leaf.ConstantUtf8;
import com.study.type.constant.leaf.LeafCpInfo;
import com.study.ui.support.CpReferences;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SortOrder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.RowSorter.SortKey;

/**
 * Constant pool as a filterable table: # / tag / raw description / resolved detail.
 * Double-clicking a row jumps to the {@code #N} entries it references
 * (a popup lets the user pick when there are multiple references).
 */
public class ConstantPoolPanel extends JPanel {

    private final ParseResult result;
    private final ConstantPoolTableModel tableModel;
    private final JTable table;
    private final JTextField filterField;
    private final TableRowSorter<ConstantPoolTableModel> sorter;

    public ConstantPoolPanel(ParseResult result) {
        super(new BorderLayout());
        this.result = result;
        this.tableModel = new ConstantPoolTableModel(buildRows(result));

        this.table = new JTable(tableModel);
        this.sorter = new TableRowSorter<>(tableModel);
        table.setRowSorter(sorter);
        sorter.setSortKeys(List.of(new SortKey(0, SortOrder.ASCENDING)));
        table.getColumnModel().getColumn(0).setPreferredWidth(55);
        table.getColumnModel().getColumn(1).setPreferredWidth(150);
        table.getColumnModel().getColumn(2).setPreferredWidth(220);
        table.getColumnModel().getColumn(3).setPreferredWidth(520);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);

        this.filterField = new JTextField();
        installFilter();
        installNavigation();

        JPanel top = new JPanel(new BorderLayout(6, 0));
        top.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        top.add(new JLabel("Filter (index / tag / text):"), BorderLayout.WEST);
        top.add(filterField, BorderLayout.CENTER);
        add(top, BorderLayout.NORTH);

        add(new JScrollPane(table), BorderLayout.CENTER);

        JLabel hint = new JLabel(" Hint: double-click a row to jump to the #N entry it references; long/double take two slots");
        hint.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
        add(hint, BorderLayout.SOUTH);
    }

    private static List<CpRow> buildRows(ParseResult result) {
        ConstantPool constantPool = result.getConstantPool();
        List<CpRow> rows = new ArrayList<>();
        for (int i = 1; i < constantPool.getCount(); i++) {
            CpInfo cpInfo = constantPool.get(i);
            if (cpInfo == null) {
                rows.add(CpRow.phantom(i, constantPool.get(i - 1)));
                continue;
            }

            String tag = displayTag(cpInfo);
            if (cpInfo instanceof LeafCpInfo leafCpInfo) {
                String description = leafCpInfo.desc();
                if (cpInfo instanceof ConstantUtf8) {
                    description = description.stripTrailing();
                }
                rows.add(new CpRow(i, cpInfo, tag, description, ""));
            } else if (cpInfo instanceof CompoundCpInfo compoundCpInfo) {
                rows.add(new CpRow(i, cpInfo, tag,
                        compoundCpInfo.componentDesc(constantPool),
                        compoundCpInfo.decoratedDetail(constantPool)));
            } else {
                rows.add(new CpRow(i, cpInfo, tag, "(unsupported constant type)", ""));
            }
        }
        return rows;
    }

    private static String displayTag(CpInfo cpInfo) {
        String type = cpInfo.getTag().getType();
        // TODO: add strict check here, if unexpected type is detected, just throw exception
        if (!"todo".equals(type)) {
            return type;
        }
        return cpInfo.getTag().name().substring("CONSTANT_".length());
    }

    private void installFilter() {
        filterField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                applyFilter();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                applyFilter();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                applyFilter();
            }
        });
    }

    private void applyFilter() {
        String query = filterField.getText().trim().toLowerCase();
        if (query.isEmpty()) {
            sorter.setRowFilter(null);
            return;
        }
        sorter.setRowFilter(new RowFilter<>() {
            @Override
            public boolean include(Entry<? extends ConstantPoolTableModel, ? extends Integer> entry) {
                CpRow row = tableModel.getRow(entry.getIdentifier());
                String searchable = ("#" + row.index + " " + row.tag + " " + row.description + " " + row.detail)
                        .toLowerCase();
                return searchable.contains(query);
            }
        });
    }

    private void installNavigation() {
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() != 2) {
                    return;
                }
                int viewRow = table.rowAtPoint(e.getPoint());
                if (viewRow < 0) {
                    return;
                }
                CpRow row = tableModel.getRow(table.convertRowIndexToModel(viewRow));
                List<Integer> references = new ArrayList<>(CpReferences.findIn(row.description, row.detail));
                references.removeIf(index -> index <= 0 || index >= result.getConstantPool().getCount());

                if (references.isEmpty()) {
                    return;
                }
                if (references.size() == 1) {
                    jumpTo(references.get(0));
                    return;
                }

                JPopupMenu popupMenu = new JPopupMenu();
                for (Integer reference : references) {
                    JMenuItem menuItem = new JMenuItem("#" + reference + "  " + describeReference(reference));
                    menuItem.addActionListener(event -> jumpTo(reference));
                    popupMenu.add(menuItem);
                }
                popupMenu.show(table, e.getX(), e.getY());
            }
        });
    }

    private String describeReference(int index) {
        CpInfo cpInfo = result.getConstantPool().get(index);
        if (cpInfo == null) {
            return "(unusable slot)";
        }
        return displayTag(cpInfo);
    }

    /**
     * Selects and scrolls to the constant pool entry with the given 1-based index.
     * If it is hidden by the current filter, the filter is cleared first.
     */
    private void jumpTo(int index) {
        int modelRow = index - 1;
        if (modelRow < 0 || modelRow >= tableModel.getRowCount()) {
            return;
        }
        int viewRow = table.convertRowIndexToView(modelRow);
        if (viewRow < 0) {
            filterField.setText("");
            applyFilter();
            viewRow = table.convertRowIndexToView(modelRow);
        }
        if (viewRow < 0) {
            return;
        }
        table.setRowSelectionInterval(viewRow, viewRow);
        table.scrollRectToVisible(table.getCellRect(viewRow, 0, true));
        table.requestFocusInWindow();
    }

    private record CpRow(int index, CpInfo cpInfo, String tag, String description, String detail) {

        static CpRow phantom(int index, CpInfo previous) {
                // the slot after a Long/Double is valid but unusable (JVMS §4.4.5)
                String description = String.format("(unusable slot: second half of the %s at #%d)",
                        displayTag(previous), index - 1);
                return new CpRow(index, null, "", description, "");
            }
        }

    private static class ConstantPoolTableModel extends AbstractTableModel {

        private static final String[] COLUMNS = {"#", "tag", "raw description", "resolved detail"};

        private final List<CpRow> rows;

        private ConstantPoolTableModel(List<CpRow> rows) {
            this.rows = rows;
        }

        private CpRow getRow(int modelRowIndex) {
            return rows.get(modelRowIndex);
        }

        @Override
        public int getRowCount() {
            return rows.size();
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
        public Class<?> getColumnClass(int columnIndex) {
            return columnIndex == 0 ? Integer.class : String.class;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            CpRow row = rows.get(rowIndex);
            return switch (columnIndex) {
                case 0 -> row.index;
                case 1 -> row.tag;
                case 2 -> row.description;
                case 3 -> row.detail;
                default -> "";
            };
        }
    }
}
