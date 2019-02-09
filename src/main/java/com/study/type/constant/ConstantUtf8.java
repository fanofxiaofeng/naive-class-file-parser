package com.study.type.constant;

import com.study.type.U1;
import com.study.type.U2;

import java.util.ArrayList;
import java.util.List;

/**
 * 格式参考
 * <p>
 * #19 = Utf8               Lcom/study/parser/Naive;
 */
public class ConstantUtf8 extends AbstractConstant {
    private U2 length;
    private U1[] bytes;

    private char[] content;

    public ConstantUtf8(U2 length, U1[] bytes) {
        this.tag = new U1(1);
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
                case '\b':
                    // U+0008
                    stringBuilder.append("\\b");
                    break;
                case '\t':
                    // U+0009
                    stringBuilder.append("\\t");
                    break;
                case '\n':
                    // U+000a
                    stringBuilder.append("\\n");
                    break;
                case '\f':
                    // U+000c
                    stringBuilder.append("\\f");
                    break;
                case '\r':
                    // U+000d
                    stringBuilder.append("\\r");
                    break;
                case '\"':
                    stringBuilder.append("\\\"");
                    break;
                case '\'':
                    stringBuilder.append("\\'");
                    break;
                case '\\':
                    stringBuilder.append("\\\\");
                    break;
                case '\u0000':
                case '\u0001':
                case '\u0002':
                case '\u0003':
                case '\u0004':
                case '\u0005':
                case '\u0006':
                case '\u0007':
                case '\u000b':
                case '\u000e':
                case '\u000f':
                case '\u0010':
                case '\u0011':
                case '\u0012':
                case '\u0013':
                case '\u0014':
                case '\u0015':
                case '\u0016':
                case '\u0017':
                case '\u0018':
                case '\u0019':
                case '\u001a':
                case '\u001b':
                case '\u001c':
                case '\u001d':
                case '\u001e':
                case '\u001f':
                case '\u007f':
                    stringBuilder.append('\\').append('u').append(String.format("%04x", (int) c));
                    break;
                default:
                    stringBuilder.append(c);
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
        if (this.tag.toInt() != 1) {
            throw new AssertionError();
        }
    }
}
