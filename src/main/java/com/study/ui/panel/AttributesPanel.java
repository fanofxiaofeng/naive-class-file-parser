package com.study.ui.panel;

import com.study.parser.ParseResult;
import com.study.present.attribute.AbstractAttributePresenter;
import com.study.type.info.attribute.AttributeInfo;
import com.study.ui.support.TextCapture;
import com.study.ui.support.TextAreas;

import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.Component;
import java.util.List;

/**
 * Class-level attributes list on the left, presenter-produced detail on the right.
 * Attributes whose presenter is not implemented yet are listed, but their detail
 * pane shows a placeholder instead of failing.
 */
public class AttributesPanel extends JPanel {

    private final ParseResult result;
    private final JTextArea detailArea = TextAreas.readOnlyMonospace();

    public AttributesPanel(ParseResult result) {
        super(new BorderLayout());
        this.result = result;

        List<AttributeInfo> attributes = result.getAttributes().items();

        JList<AttributeInfo> attributeList = new JList<>(attributes.toArray(new AttributeInfo[0]));
        attributeList.setCellRenderer(new AttributeNameRenderer());
        attributeList.addListSelectionListener(event -> {
            if (event.getValueIsAdjusting()) {
                return;
            }
            AttributeInfo selected = attributeList.getSelectedValue();
            if (selected != null) {
                showDetail(selected);
            }
        });

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                new JScrollPane(attributeList), new JScrollPane(detailArea));
        splitPane.setResizeWeight(0.25);
        splitPane.setContinuousLayout(true);

        JLabel countLabel = new JLabel(" Class attributes: " + attributes.size());
        countLabel.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
        add(countLabel, BorderLayout.NORTH);
        add(splitPane, BorderLayout.CENTER);

        if (!attributes.isEmpty()) {
            attributeList.setSelectedIndex(0);
        }
    }

    private void showDetail(AttributeInfo attribute) {
        String name = result.getConstantPool().desc(attribute.getAttributeNameIndex());
        String text = TextCapture.safeCapture(wrapper ->
                AbstractAttributePresenter.build(result, wrapper, attribute, 0).present());
        if (text.isBlank()) {
            text = String.format("%s:%n  (detailed presentation for this attribute is not implemented yet; attribute_length = %d)%n",
                    name, attribute.getAttributeLength().toInt());
        }
        detailArea.setText(text);
        detailArea.setCaretPosition(0);
    }

    private class AttributeNameRenderer extends DefaultListCellRenderer {
        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                                                      boolean isSelected, boolean cellHasFocus) {
            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            if (value instanceof AttributeInfo attribute) {
                String name = result.getConstantPool().desc(attribute.getAttributeNameIndex());
                setText((index + 1) + ". " + name);
            }
            return this;
        }
    }
}
