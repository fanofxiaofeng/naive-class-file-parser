package com.study.io;

import com.study.type.U1;
import com.study.type.U2;
import com.study.type.U4;

import java.util.Arrays;

public class U1InputStream {
    private U1[] data;
    private int index;

    public U1InputStream(U1[] data) {
        this.index = 0;
        this.data = data;
    }

    public U1 readU1() {
        return data[index++];
    }

    public U2 readU2() {
        U1 a = readU1();
        U1 b = readU1();
        return new U2(a, b);
    }

    public U4 readU4() {
        U1 a = readU1();
        U1 b = readU1();
        U1 c = readU1();
        U1 d = readU1();
        return new U4(a, b, c, d);
    }

    public U1[] readU1Array(int length) {
        System.out.println(length);
        U1[] u1s = new U1[length];
        System.out.println(Arrays.toString(u1s));
        System.arraycopy(data, index, u1s, 0, length);
        System.out.println(Arrays.toString(u1s));
        index += length;
        return u1s;
    }

    public U2[] readU2Array(int length) {
        U2[] u2s = new U2[length];
        for (int i = 0; i < length; i++) {
            u2s[i] = readU2();
        }
        return u2s;
    }

    public int length() {
        if (index != 0) {
            throw new AssertionError("index must be 0!");
        }
        return data.length;
    }

    public boolean justFinished() {
        return data.length == index;
    }
}
