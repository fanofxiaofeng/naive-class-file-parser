package com.study.type.info.attribute;

import com.study.type.U2;
import com.study.type.U4;

import java.util.List;

// todo this class is complex
public class RuntimeVisibleAnnotationsAttribute extends AbstractRuntimeAnnotationsAttribute {

    public RuntimeVisibleAnnotationsAttribute(U2 attributeNameIndex,
                                              U4 attributeLength,
                                              List<Annotation> annotations) {
        super(attributeNameIndex, attributeLength, annotations);
    }

    @Override
    public String describe(int indent) {
        StringBuilder stringBuilder = withIndent(indent).append("RuntimeVisibleAnnotations:\n");
        int count = annotations.size();
        for (int i = 0; i < count; i++) {
            Annotation annotation = this.annotations.get(i);
            stringBuilder.append(String.format("%s%s: #%s()\n", indentedString(indent + 2), i, annotation.typeIndex().toInt()));
            stringBuilder.append(String.format("%s%s\n", indentedString(indent + 4), toHumanReadable(constantPool.get(annotation.typeIndex()).desc())));
        }
        return stringBuilder.toString();
    }

    private String toHumanReadable(String description) {
        StringBuilder result = new StringBuilder();
        int arrayCount = 0;
        while (description.charAt(arrayCount) == '[') {
            arrayCount++;
        }

        for (int i = arrayCount; i < description.length(); i++) {
            char current = description.charAt(i);
            if (current == 'L') {
                int indexOfSemicolon = description.indexOf(';', i);
                String raw = description.substring(i + 1, indexOfSemicolon);
                result.append(raw.replaceAll("/", "."));
                i = indexOfSemicolon;
            }
        }

        return result.toString();
    }
}
