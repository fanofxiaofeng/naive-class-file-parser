package com.test.ui;

import com.study.constants.ConstantKind;
import com.study.parser.ParseResult;
import com.study.ui.panel.ConstantPoolPanel;
import org.junit.Test;

import javax.swing.JTable;
import javax.swing.JTextField;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

/**
 * Verifies the constant pool table: one row per constant pool slot, the tag
 * names in the second column, leaf values, resolved details for compound
 * entries, the unusable-slot rows after Long/Double, and the filter box.
 */
public class ConstantPoolPanelTest {

    private static final String CASE = "com/test/ui/cases/GuiShowcaseCase.class";

    @Test
    public void hasOneRowPerConstantPoolSlot() {
        ParseResult result = GuiTestSupport.parse(CASE);
        GuiTestSupport.onEdt(() -> {
            ConstantPoolPanel panel = new ConstantPoolPanel(result);
            JTable table = GuiTestSupport.findComponent(panel, JTable.class);

            assertEquals(result.getConstantPool().getCount() - 1, table.getRowCount());
            assertEquals("#", table.getColumnName(0));
            assertEquals("tag", table.getColumnName(1));
            assertEquals("raw description", table.getColumnName(2));
            assertEquals("resolved detail", table.getColumnName(3));

            // sorted by index ascending: view row r shows constant pool index r + 1
            for (int row = 0; row < table.getRowCount(); row++) {
                assertEquals(row + 1, table.getValueAt(row, 0));
            }
        });
    }

    @Test
    public void coversAllTagsProducedByTheFixture() {
        ParseResult result = GuiTestSupport.parse(CASE);
        GuiTestSupport.onEdt(() -> {
            ConstantPoolPanel panel = new ConstantPoolPanel(result);
            JTable table = GuiTestSupport.findComponent(panel, JTable.class);

            Set<String> tags = new HashSet<>();
            for (int row = 0; row < table.getRowCount(); row++) {
                tags.add((String) table.getValueAt(row, 1));
            }
            Set<String> expected = Set.of(
                    "Utf8", "Integer", "Float", "Long", "Double", "Class", "String",
                    "Fieldref", "Methodref", "InterfaceMethodref", "NameAndType",
                    "MethodHandle", "MethodType", "InvokeDynamic");
            assertTrue("missing tags: " + expected.stream().filter(tag -> !tags.contains(tag)).toList(),
                    tags.containsAll(expected));
        });
    }

    @Test
    public void showsLeafValuesAndResolvedDetails() {
        ParseResult result = GuiTestSupport.parse(CASE);
        GuiTestSupport.onEdt(() -> {
            ConstantPoolPanel panel = new ConstantPoolPanel(result);
            JTable table = GuiTestSupport.findComponent(panel, JTable.class);

            // leaf entries: raw description holds the value, resolved detail stays empty
            int integerRow = rowOf(table, ConstantKind.CONSTANT_Integer, "98765");
            assertTrue(integerRow >= 0);
            assertEquals("", table.getValueAt(integerRow, 3));

            assertTrue(rowOf(table, ConstantKind.CONSTANT_Float, "98765.0f") >= 0);
            assertTrue(rowOf(table, ConstantKind.CONSTANT_Long, "-4294967296l") >= 0);
            assertTrue(rowOf(table, ConstantKind.CONSTANT_Double, "1.0d") >= 0);

            // compound entries: raw description keeps the #N references,
            // resolved detail renders the human-readable form
            int classRow = rowWithDetail(table, ConstantKind.CONSTANT_Class, "com/test/ui/cases/GuiShowcaseCase");
            assertTrue(classRow >= 0);
            assertTrue(((String) table.getValueAt(classRow, 2)).matches("#\\d+"));

            int stringRow = rowWithDetail(table, ConstantKind.CONSTANT_String, "abc");
            assertTrue(stringRow >= 0);
            assertTrue(((String) table.getValueAt(stringRow, 2)).matches("#\\d+"));

            int interfaceRefRow = rowWithDetail(table, ConstantKind.CONSTANT_InterfaceMethodref, "java/util/List.size");
            assertTrue(interfaceRefRow >= 0);
            assertTrue(((String) table.getValueAt(interfaceRefRow, 2)).matches("#\\d+\\.#\\d+"));

            assertTrue(rowOf(table, ConstantKind.CONSTANT_Methodref, null) >= 0);
            assertTrue(rowOf(table, ConstantKind.CONSTANT_NameAndType, null) >= 0);
            assertTrue(rowOf(table, ConstantKind.CONSTANT_MethodHandle, null) >= 0);
            assertTrue(rowOf(table, ConstantKind.CONSTANT_MethodType, null) >= 0);
            assertTrue(rowOf(table, ConstantKind.CONSTANT_InvokeDynamic, null) >= 0);
        });
    }

    @Test
    public void longAndDoubleLeaveUnusableSlots() {
        ParseResult result = GuiTestSupport.parse(CASE);
        GuiTestSupport.onEdt(() -> {
            ConstantPoolPanel panel = new ConstantPoolPanel(result);
            JTable table = GuiTestSupport.findComponent(panel, JTable.class);

            Set<String> slotDescriptions = new HashSet<>();
            for (int row = 0; row < table.getRowCount(); row++) {
                String description = (String) table.getValueAt(row, 2);
                if (description.startsWith("(unusable slot:")) {
                    slotDescriptions.add(description);
                    int index = (Integer) table.getValueAt(row, 0);
                    // the slot must reference the entry right before it
                    assertTrue(description.endsWith("at #" + (index - 1) + ")"));
                    assertEquals("", table.getValueAt(row, 1));
                }
            }
            // the fixture has exactly one Long and one Double constant
            assertEquals(2, slotDescriptions.size());
            assertTrue(slotDescriptions.stream().anyMatch(d -> d.contains("second half of the Long at #")));
            assertTrue(slotDescriptions.stream().anyMatch(d -> d.contains("second half of the Double at #")));
        });
    }

    @Test
    public void filterNarrowsAndRestoresRows() {
        ParseResult result = GuiTestSupport.parse(CASE);
        GuiTestSupport.onEdt(() -> {
            ConstantPoolPanel panel = new ConstantPoolPanel(result);
            JTable table = GuiTestSupport.findComponent(panel, JTable.class);
            JTextField filter = GuiTestSupport.findComponent(panel, JTextField.class);

            int total = table.getRowCount();
            filter.setText("Utf8");
            int filtered = table.getRowCount();
            assertTrue(filtered > 0);
            assertTrue(filtered < total);
            for (int row = 0; row < filtered; row++) {
                assertEquals("Utf8", table.getValueAt(row, 1));
            }

            filter.setText("");
            assertEquals(total, table.getRowCount());

            // filtering by index works too: every row matches its own "#N"
            filter.setText("#1");
            assertNotEquals(0, table.getRowCount());
        });
    }

    private static int rowOf(JTable table, ConstantKind kind, String descriptionPart) {
        for (int row = 0; row < table.getRowCount(); row++) {
            if (!kind.getType().equals(table.getValueAt(row, 1))) {
                continue;
            }
            String description = (String) table.getValueAt(row, 2);
            if (descriptionPart == null || description.contains(descriptionPart)) {
                return row;
            }
        }
        return -1;
    }

    private static int rowWithDetail(JTable table, ConstantKind kind, String detailPart) {
        for (int row = 0; row < table.getRowCount(); row++) {
            if (kind.getType().equals(table.getValueAt(row, 1))
                    && ((String) table.getValueAt(row, 3)).contains(detailPart)) {
                return row;
            }
        }
        return -1;
    }
}
