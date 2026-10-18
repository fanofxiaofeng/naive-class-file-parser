package com.study.ui.support;

import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.List;

/**
 * Renders a JVMS access-flags table (Flag name / Value / Set / Interpretation):
 * one row per flag, rows whose flag is set are highlighted (green background +
 * bold), mirroring the presentation used by {@code javap}-style documentation
 * tables. Used by the overview panel (Table 4.1-A) and the fields panel
 * (Table 4.5-A); callers supply the rows and the flags value to mark.
 */
public class AccessFlagsTable extends JTable {

    private static final String[] COLUMNS = {"Flag name", "Value", "Set", "Interpretation"};

    private static final Color ACTIVE_ROW_BACKGROUND = new Color(0xE8, 0xF5, 0xE9);

    private final Model model;

    /**
     * @param name  flag name as spelled by the JVMS table, e.g. {@code ACC_PUBLIC}
     * @param value flag bit, e.g. {@code 0x0001}
     * @param meaning the Interpretation column text from the JVMS table
     */
    public record FlagRow(String name, int value, String meaning) {
    }

    public AccessFlagsTable(List<FlagRow> rows, int flags) {
        super(new Model(rows, flags));
        this.model = (Model) getModel();
        setDefaultRenderer(Object.class, new ActiveFlagRenderer(model));
        setRowSelectionAllowed(false);
        setShowGrid(true);
        setGridColor(getTableHeader().getBackground());
        getColumnModel().getColumn(0).setPreferredWidth(160);
        getColumnModel().getColumn(1).setPreferredWidth(60);
        getColumnModel().getColumn(2).setPreferredWidth(45);
        getColumnModel().getColumn(3).setPreferredWidth(520);
        setPreferredScrollableViewportSize(getPreferredSize());
    }

    /**
     * Re-marks the Set column against the given flags value.
     */
    public void setFlags(int flags) {
        model.setFlags(flags);
    }

    private static class Model extends AbstractTableModel {

        private final List<FlagRow> rows;
        private int flags;

        private Model(List<FlagRow> rows, int flags) {
            this.rows = rows;
            this.flags = flags;
        }

        private boolean isSet(int rowIndex) {
            return (flags & rows.get(rowIndex).value()) != 0;
        }

        private void setFlags(int flags) {
            this.flags = flags;
            fireTableDataChanged();
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
        public Object getValueAt(int rowIndex, int columnIndex) {
            FlagRow row = rows.get(rowIndex);
            return switch (columnIndex) {
                case 0 -> row.name();
                case 1 -> String.format("0x%04x", row.value());
                case 2 -> isSet(rowIndex) ? "✓" : "";
                case 3 -> row.meaning();
                default -> "";
            };
        }
    }

    /**
     * Highlights rows whose flag is set: green background + bold text.
     */
    private static class ActiveFlagRenderer extends DefaultTableCellRenderer {

        private final Model model;

        private ActiveFlagRenderer(Model model) {
            this.model = model;
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                                                       boolean isSelected, boolean hasFocus,
                                                       int row, int column) {
            Component component = super.getTableCellRendererComponent(
                    table, value, isSelected, hasFocus, row, column);
            boolean active = model.isSet(row);
            component.setBackground(active ? ACTIVE_ROW_BACKGROUND : table.getBackground());
            Font baseFont = table.getFont();
            component.setFont(active ? baseFont.deriveFont(Font.BOLD) : baseFont);
            return component;
        }
    }
}
