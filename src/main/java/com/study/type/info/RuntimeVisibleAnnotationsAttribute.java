package com.study.type.info;

import com.study.io.U1InputStream;
import com.study.type.U2;

// todo this class is complex
public class RuntimeVisibleAnnotationsAttribute extends AttributeInfo {
    private U2 numAnnotations;
    private Annotation[] annotations;

    RuntimeVisibleAnnotationsAttribute(AttributeInfo that) {
        super(that);
        numAnnotations = infoStream.readU2();
        int count = numAnnotations.toInt();
        annotations = new Annotation[count];
        for (int i = 0; i < count; i++) {
            annotations[i] = new Annotation(infoStream);
        }
    }

    @Override
    public String describe(int indent) {
        StringBuilder stringBuilder = withIndent(indent).append("RuntimeVisibleAnnotations:\n");
        int count = numAnnotations.toInt();
        for (int i = 0; i < count; i++) {
            Annotation annotation = this.annotations[i];
            stringBuilder.append(String.format("%s%s: #%s()\n", indentedString(indent + 2), i, annotation.typeIndex.toInt()));
            stringBuilder.append(String.format("%s%s\n", indentedString(indent + 4), toHumanReadable(constantPool[annotation.typeIndex.toInt()].desc())));
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

    private class Annotation {
        private U2 typeIndex;
        private U2 numElementValuePairs;
        private ElementValuePairs[] elementValuePairs;

        private class ElementValuePairs {
            private U2 elementNameIndex;
            private ElementValue value;

            ElementValuePairs(U1InputStream u1InputStream) {
                this.elementNameIndex = u1InputStream.readU2();
                this.value = ElementValue.build(u1InputStream);
            }
        }

        Annotation(U1InputStream u1InputStream) {
            this.typeIndex = u1InputStream.readU2();
            this.numElementValuePairs = u1InputStream.readU2();
            int count = numElementValuePairs.toInt();
            if (count > 0) {
                throw new RuntimeException("not supported yet!");
            }
            this.elementValuePairs = new ElementValuePairs[count];
            for (int i = 0; i < count; i++) {
                this.elementValuePairs[i] = new ElementValuePairs(u1InputStream);
            }
        }
    }
}
