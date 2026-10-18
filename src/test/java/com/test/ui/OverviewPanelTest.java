package com.test.ui;

import com.study.constants.ClassAccessFlags;
import com.study.parser.ParseResult;
import com.study.ui.panel.OverviewPanel;
import org.junit.Test;

import javax.swing.JTable;
import javax.swing.JTextField;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Verifies the strings the overview panel puts into its form fields and the
 * access flags table, using the fixture compiled from
 * {@code com.test.ui.cases.GuiShowcaseCase}.
 */
public class OverviewPanelTest {

    private static final String CASE = "com/test/ui/cases/GuiShowcaseCase.class";

    @Test
    public void showsClassFileHeaderFields() {
        ParseResult result = GuiTestSupport.parse(CASE);
        GuiTestSupport.onEdt(() -> {
            OverviewPanel panel = new OverviewPanel(result, Path.of("GuiShowcaseCase.class"));
            Map<String, String> values = formValues(panel);

            assertEquals("0xCAFEBABE", values.get("magic"));
            assertEquals("0", values.get("minor version"));
            assertEquals("61 (Java 17)", values.get("major version"));

            String accessFlags = values.get("access flags");
            assertNotNull(accessFlags);
            assertTrue(accessFlags.startsWith("0x0021"));
            assertTrue(accessFlags.contains(ClassAccessFlags.ACC_PUBLIC.toString()));
            assertTrue(accessFlags.contains(ClassAccessFlags.ACC_SUPER.toString()));

            String thisClass = values.get("this_class");
            assertNotNull(thisClass);
            assertTrue(thisClass.startsWith("#"));
            assertTrue(thisClass.endsWith("// com/test/ui/cases/GuiShowcaseCase"));

            String superClass = values.get("super_class");
            assertNotNull(superClass);
            assertTrue(superClass.endsWith("// java/lang/Object"));

            String constantPoolCount = values.get("constant_pool_count");
            assertNotNull(constantPoolCount);
            assertTrue(constantPoolCount.matches("\\d+ {2}\\(\\d+ valid entries\\)"));

            assertEquals(String.valueOf(result.getFields().getCount()), values.get("fields_count"));
            assertEquals(String.valueOf(result.getMethods().getCount()), values.get("methods_count"));
            assertEquals(String.valueOf(result.getAttributes().getCount()), values.get("attributes_count"));
        });
    }

    @Test
    public void accessFlagsTableMarksSetFlags() {
        ParseResult result = GuiTestSupport.parse(CASE);
        GuiTestSupport.onEdt(() -> {
            OverviewPanel panel = new OverviewPanel(result, null);
            JTable table = GuiTestSupport.findComponent(panel, JTable.class);

            // JVMS Table 4.1-A: nine flags, four columns
            assertEquals(9, table.getRowCount());
            assertEquals(4, table.getColumnCount());
            assertEquals("Flag name", table.getColumnName(0));
            assertEquals("Value", table.getColumnName(1));
            assertEquals("Set", table.getColumnName(2));
            assertEquals("Interpretation", table.getColumnName(3));

            int publicRow = GuiTestSupport.findRow(table, 0, ClassAccessFlags.ACC_PUBLIC.toString());
            assertTrue(publicRow >= 0);
            assertEquals("0x0001", table.getValueAt(publicRow, 1));
            assertEquals("✓", table.getValueAt(publicRow, 2));
            assertEquals("Declared public; may be accessed from outside its package.",
                    table.getValueAt(publicRow, 3));

            int superRow = GuiTestSupport.findRow(table, 0, ClassAccessFlags.ACC_SUPER.toString());
            assertTrue(superRow >= 0);
            assertEquals("0x0020", table.getValueAt(superRow, 1));
            assertEquals("✓", table.getValueAt(superRow, 2));

            int interfaceRow = GuiTestSupport.findRow(table, 0, ClassAccessFlags.ACC_INTERFACE.toString());
            assertTrue(interfaceRow >= 0);
            assertEquals("0x0200", table.getValueAt(interfaceRow, 1));
            assertEquals("", table.getValueAt(interfaceRow, 2));
        });
    }

    /**
     * The form rows are (key ":", value) pairs of read-only text fields;
     * collect them in order into a map keyed without the colon.
     */
    private static Map<String, String> formValues(OverviewPanel panel) {
        List<JTextField> fields = GuiTestSupport.findAll(panel, JTextField.class);
        Map<String, String> values = new LinkedHashMap<>();
        for (int i = 0; i + 1 < fields.size(); i++) {
            String key = fields.get(i).getText();
            if (key != null && key.endsWith(":")) {
                values.put(key.substring(0, key.length() - 1), fields.get(i + 1).getText());
                i++;
            }
        }
        return values;
    }
}
