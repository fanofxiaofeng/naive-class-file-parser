package com.study.io;

import com.study.type.U1;
import com.study.type.U2;
import com.study.type.U4;

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
        U2 u2 = new U2(data[index], data[index + 1]);
        index += 2;
        return u2;
    }

    public U4 readU4() {
        U4 u4 = new U4(data[index], data[index + 1], data[index + 2], data[index + 3]);
        index += 4;
        return u4;
    }

    public U1[] readU1Array(int length) {
        U1[] u1s = new U1[length];
        System.arraycopy(data, index, u1s, 0, length);
        index += length;
        return u1s;
    }
}
