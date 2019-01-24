package com.study.type.constant;

import com.study.type.U1;
import com.study.type.U2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConstantUtf8 extends AbstractConstant {
    private U2 length;
    private U1[] bytes;

    private char[] content;

    public ConstantUtf8(U2 length, U1[] bytes) {
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
        System.out.println(Arrays.toString(content));
    }

    private void fillCodePoints(int codePoint, List<Character> characterList) {
        String s = new String(new int[]{codePoint}, 0, 1);
//        System.out.println(s);
//        System.out.println(Integer.toHexString(codePoint));
        char[] temp = s.toCharArray();
//        System.out.println("~~~~");
//        System.out.println(Arrays.toString(temp));
//        System.out.println(destPos);
        for (char item : temp) {
            characterList.add(item);
        }
    }

    @Override
    public String desc() {
        return desc(content);
    }

    @Override
    protected String type() {
        return "Utf8";
    }
}
