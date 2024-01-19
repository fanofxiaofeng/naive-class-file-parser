package com.study.type.constant;

import com.study.constants.ConstantKind;
import com.study.type.U1;
import com.study.type.U2;

import java.util.ArrayList;
import java.util.List;


/**
 * Format
 * <p>
 * #19 = Utf8               Lcom/study/parser/Naive;
 */
public class ConstantUtf8 extends AbstractConstant {
    private final U2 length;
    private final U1[] bytes;

    private char[] content;

    public ConstantUtf8(U2 length, U1[] bytes) {
        super(ConstantKind.CONSTANT_Utf8);
        this.length = length;
        this.bytes = bytes;
        fillContent();
    }

    /**
     * Code points in the range '\u0001' to '\u007F' are represented by a single byte
     * The null code point ('\u0000') and code points in the range '\u0080' to '\u07FF' are represented by a pair of bytes x and y
     */
    private void fillContent() {
        int length = this.length.toInt();
        List<Character> chars = new ArrayList<>();
        for (int i = 0; i < length; ) {
            int firstByte = bytes[i].toInt();
            if (firstByte >= 0x1 && firstByte <= 0x7F) {
                i++;
                fillCodePoints(firstByte, chars);
            } else if ((firstByte >> 5) == 6) {
                int x = bytes[i++].toInt();
                int y = bytes[i++].toInt();
                int result = ((x & 0x1F) << 6) + (y & 0x3F);
                fillCodePoints(result, chars);
            } else if ((firstByte >> 4) == 14) {
                int x = bytes[i++].toInt();
                int y = bytes[i++].toInt();
                int z = bytes[i++].toInt();
                int result = ((x & 0xF) << 12) + ((y & 0x3F) << 6) + (z & 0x3F);
                fillCodePoints(result, chars);
            } else {
                int u = bytes[i++].toInt();
                int v = bytes[i++].toInt();
                int w = bytes[i++].toInt();
                int x = bytes[i++].toInt();
                int y = bytes[i++].toInt();
                int z = bytes[i++].toInt();
                int result = 0x10000 + ((v & 0x0f) << 16) + ((w & 0x3f) << 10) +
                        ((y & 0x0f) << 6) + (z & 0x3f);
                fillCodePoints(result, chars);
            }
        }
        this.content = new char[chars.size()];
        for (int i = 0; i < this.content.length; i++) {
            this.content[i] = chars.get(i);
        }
    }

    private void fillCodePoints(int codePoint, List<Character> characterList) {
        String s = new String(new int[]{codePoint}, 0, 1);
        char[] temp = s.toCharArray();
        for (char item : temp) {
            characterList.add(item);
        }
    }

    @Override
    public String desc() {
        String raw = desc(content);
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : raw.toCharArray()) {
            switch (c) {
                case '\b' ->
                    // U+0008
                        stringBuilder.append("\\b");
                case '\t' ->
                    // U+0009
                        stringBuilder.append("\\t");
                case '\n' ->
                    // U+000a
                        stringBuilder.append("\\n");
                case '\f' ->
                    // U+000c
                        stringBuilder.append("\\f");
                case '\r' ->
                    // U+000d
                        stringBuilder.append("\\r");
                case '\"' -> stringBuilder.append("\\\"");
                case '\'' -> stringBuilder.append("\\'");
                case '\\' -> stringBuilder.append("\\\\");
                case '\u0000', '\u0001', '\u0002', '\u0003', '\u0004', '\u0005', '\u0006', '\u0007', '\u000b', '\u000e', '\u000f', '\u0010', '\u0011', '\u0012', '\u0013', '\u0014', '\u0015', '\u0016', '\u0017', '\u0018', '\u0019', '\u001a', '\u001b', '\u001c', '\u001d', '\u001e', '\u001f', '\u007f' ->
                        stringBuilder.append('\\').append('u').append(String.format("%04x", (int) c));
                default -> stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public String type() {
        return "Utf8";
    }

    @Override
    public void validate() {
        if (this.tag != ConstantKind.CONSTANT_Utf8) {
            throw new AssertionError();
        }
    }
}
