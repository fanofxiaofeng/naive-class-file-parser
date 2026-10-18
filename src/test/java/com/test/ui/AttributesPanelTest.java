package com.test.ui;

import com.study.parser.ParseResult;
import com.study.type.info.attribute.AttributeInfo;
import com.study.ui.panel.AttributesPanel;
import org.junit.Test;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Verifies the class-level attributes panel: the list shows every attribute,
 * selecting one fills the detail pane with the presenter output, and an
 * attribute whose presenter is not implemented yet gets the placeholder text
 * instead of breaking the panel.
 */
public class AttributesPanelTest {

    private static final String SHOWCASE = "com/test/ui/cases/GuiShowcaseCase.class";
    private static final String RECORD = "com/test/ui/cases/GuiRecordCase.class";

    @Test
    public void listsEveryClassAttribute() {
        ParseResult result = GuiTestSupport.parse(SHOWCASE);
        GuiTestSupport.onEdt(() -> {
            AttributesPanel panel = new AttributesPanel(result);
            JList<?> list = GuiTestSupport.findComponent(panel, JList.class);
            JTextArea detail = GuiTestSupport.findComponent(panel, JTextArea.class);

            List<AttributeInfo> attributes = result.getAttributes().items();
            assertEquals(attributes.size(), list.getModel().getSize());

            JLabel countLabel = GuiTestSupport.findComponent(panel, JLabel.class);
            assertEquals(" Class attributes: " + attributes.size(), countLabel.getText());

            // every attribute of the fixture has an implemented presenter
            for (int i = 0; i < attributes.size(); i++) {
                list.setSelectedIndex(i);
                assertFalse("detail is blank for " + attributeName(result, attributes.get(i)),
                        detail.getText().isBlank());
            }

            int sourceFileIndex = indexOf(result, attributes, "SourceFile");
            assertTrue("SourceFile attribute not found", sourceFileIndex >= 0);
            list.setSelectedIndex(sourceFileIndex);
            assertTrue(detail.getText().contains("SourceFile:"));
            assertTrue(detail.getText().contains("GuiShowcaseCase.java"));
        });
    }

    @Test
    public void unimplementedAttributeGetsPlaceholderText() {
        ParseResult result = GuiTestSupport.parse(RECORD);
        GuiTestSupport.onEdt(() -> {
            AttributesPanel panel = new AttributesPanel(result);
            JList<?> list = GuiTestSupport.findComponent(panel, JList.class);
            JTextArea detail = GuiTestSupport.findComponent(panel, JTextArea.class);

            List<AttributeInfo> attributes = result.getAttributes().items();
            int recordIndex = indexOf(result, attributes, "Record");
            assertTrue("Record attribute not found", recordIndex >= 0);

            list.setSelectedIndex(recordIndex);
            String text = detail.getText();
            assertTrue(text.startsWith("Record:"));
            assertTrue(text.contains(
                    "(detailed presentation for this attribute is not implemented yet; attribute_length = "));
        });
    }

    private static String attributeName(ParseResult result, AttributeInfo attribute) {
        return result.getConstantPool().desc(attribute.getAttributeNameIndex());
    }

    private static int indexOf(ParseResult result, List<AttributeInfo> attributes, String name) {
        for (int i = 0; i < attributes.size(); i++) {
            if (name.equals(attributeName(result, attributes.get(i)))) {
                return i;
            }
        }
        return -1;
    }
}
