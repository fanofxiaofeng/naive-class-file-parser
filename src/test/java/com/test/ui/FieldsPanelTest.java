package com.test.ui;

import com.study.parser.ParseResult;
import com.study.ui.panel.FieldsPanel;
import org.junit.Test;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Verifies the fields table (one row per field, names and descriptors), the
 * detail pane filled with the presenter output (identical to the CLI), and
 * the embedded JVMS Table 4.5-A mirroring the selected field's access flags.
 */
public class FieldsPanelTest {

    private static final String CASE = "com/test/ui/cases/GuiShowcaseCase.class";

    @Test
    public void listsEveryFieldWithItsDescriptor() {
        ParseResult result = GuiTestSupport.parse(CASE);
        GuiTestSupport.onEdt(() -> {
            FieldsPanel panel = new FieldsPanel(result);
            JTable table = fieldsTable(panel);

            assertEquals(result.getFields().getCount(), table.getRowCount());
            assertEquals("access flags", table.getColumnName(0));
            assertEquals("name", table.getColumnName(1));
            assertEquals("type", table.getColumnName(2));
            assertEquals("descriptor", table.getColumnName(3));
            assertEquals("attributes", table.getColumnName(4));

            JLabel countLabel = GuiTestSupport.findComponent(panel, JLabel.class);
            assertEquals(" Fields: " + result.getFields().getCount(), countLabel.getText());

            int counterRow = GuiTestSupport.findRow(table, 1, "counter");
            assertTrue(counterRow >= 0);
            assertEquals("I", table.getValueAt(counterRow, 3));
            // ACC_* style, consistent with the methods table and the flags tables
            assertEquals("ACC_PRIVATE", table.getValueAt(counterRow, 0));

            int longRow = GuiTestSupport.findRow(table, 1, "LONG_CONSTANT");
            assertTrue(longRow >= 0);
            assertEquals("J", table.getValueAt(longRow, 3));
            assertEquals("ACC_PUBLIC, ACC_STATIC, ACC_FINAL", table.getValueAt(longRow, 0));

            int textRow = GuiTestSupport.findRow(table, 1, "text");
            assertTrue(textRow >= 0);
            assertEquals("Ljava/lang/String;", table.getValueAt(textRow, 3));
        });
    }

    @Test
    public void selectingARowShowsThePresenterOutput() {
        ParseResult result = GuiTestSupport.parse(CASE);
        GuiTestSupport.onEdt(() -> {
            FieldsPanel panel = new FieldsPanel(result);
            JTable table = fieldsTable(panel);
            JTextArea detail = GuiTestSupport.findComponent(panel, JTextArea.class);

            // the first row is pre-selected, so the detail pane is already filled
            assertFalse(detail.getText().isBlank());

            int counterRow = GuiTestSupport.findRow(table, 1, "counter");
            table.setRowSelectionInterval(counterRow, counterRow);
            assertTrue(detail.getText().contains("counter"));
            assertTrue(detail.getText().contains("descriptor: I"));

            int longRow = GuiTestSupport.findRow(table, 1, "LONG_CONSTANT");
            table.setRowSelectionInterval(longRow, longRow);
            assertTrue(detail.getText().contains("LONG_CONSTANT"));
            assertTrue(detail.getText().contains("descriptor: J"));
            // ConstantValue is a field attribute whose presenter exists
            assertTrue(detail.getText().contains("ConstantValue"));
        });
    }

    @Test
    public void accessFlagsTableMirrorsSelectedField() {
        ParseResult result = GuiTestSupport.parse(CASE);
        GuiTestSupport.onEdt(() -> {
            FieldsPanel panel = new FieldsPanel(result);
            JTable table = fieldsTable(panel);
            JTable flags = flagsTable(panel);

            // JVMS Table 4.5-A: nine flags, four columns
            assertEquals(9, flags.getRowCount());
            assertEquals(4, flags.getColumnCount());
            assertEquals("Flag name", flags.getColumnName(0));
            assertEquals("Value", flags.getColumnName(1));
            assertEquals("Set", flags.getColumnName(2));
            assertEquals("Interpretation", flags.getColumnName(3));

            // exact spec wording (SE 27 Table 4.5-A)
            int publicRow = GuiTestSupport.findRow(flags, 0, "ACC_PUBLIC");
            assertEquals("Declared public; may be accessed from outside its package.",
                    flags.getValueAt(publicRow, 3));
            int staticRow = GuiTestSupport.findRow(flags, 0, "ACC_STATIC");
            assertEquals("Declared static.", flags.getValueAt(staticRow, 3));
            int finalRow = GuiTestSupport.findRow(flags, 0, "ACC_FINAL");
            assertEquals("Declared final; never directly assigned to after object construction (JLS §17.5).",
                    flags.getValueAt(finalRow, 3));

            // initial selection is row 0 (INT_CONSTANT): public static final
            assertSetFlags(flags, "ACC_PUBLIC", "ACC_STATIC", "ACC_FINAL");
            assertUnsetFlags(flags, "ACC_PRIVATE");

            // selecting an instance field flips to ACC_PRIVATE only
            int counterRow = GuiTestSupport.findRow(table, 1, "counter");
            table.setRowSelectionInterval(counterRow, counterRow);
            assertSetFlags(flags, "ACC_PRIVATE");
            assertUnsetFlags(flags, "ACC_PUBLIC", "ACC_STATIC", "ACC_FINAL");

            // selecting a static final constant flips back
            int longRow = GuiTestSupport.findRow(table, 1, "LONG_CONSTANT");
            table.setRowSelectionInterval(longRow, longRow);
            assertSetFlags(flags, "ACC_PUBLIC", "ACC_STATIC", "ACC_FINAL");
            assertUnsetFlags(flags, "ACC_PRIVATE", "ACC_VOLATILE", "ACC_ENUM");
        });
    }

    private static JTable fieldsTable(FieldsPanel panel) {
        return GuiTestSupport.findComponent(panel, JTable.class);
    }

    private static JTable flagsTable(FieldsPanel panel) {
        List<JTable> tables = GuiTestSupport.findAll(panel, JTable.class);
        Optional<JTable> flags = tables.stream()
                .filter(table -> table.getColumnCount() == 4 && "Flag name".equals(table.getColumnName(0)))
                .findFirst();
        assertTrue("access flags table not found among " + tables.size() + " tables", flags.isPresent());
        return flags.get();
    }

    private static void assertSetFlags(JTable flags, String... names) {
        for (String name : names) {
            int row = GuiTestSupport.findRow(flags, 0, name);
            assertTrue("row not found: " + name, row >= 0);
            assertEquals("Set column for " + name, "✓", flags.getValueAt(row, 2));
        }
    }

    private static void assertUnsetFlags(JTable flags, String... names) {
        for (String name : names) {
            int row = GuiTestSupport.findRow(flags, 0, name);
            assertTrue("row not found: " + name, row >= 0);
            assertEquals("Set column for " + name, "", flags.getValueAt(row, 2));
        }
    }
}
