package com.study.io;

import com.study.type.U1;
import com.study.type.U2;
import com.study.type.U4;

import java.io.IOException;
import java.io.InputStream;

public class BasicInputStream extends InputStream {
    private final InputStream inputStream;

    public BasicInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    /**
     * If this function returns normally, then the return value will always be in [0, 255]
     */
    @Override
    public int read() {
        try {
            int r = inputStream.read();
            if (r < 0 || r > 0xFF) {
                throw new RuntimeException("r is bad, r = " + r);
            }
            return r;
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("IOException");
        }
    }

    public U4 readU4() {
        int a = read();
        int b = read();
        int c = read();
        int d = read();
        return new U4(a, b, c, d);
    }

    public U2 readU2() {
        int a = read();
        int b = read();
        return new U2(a, b);
    }

    public U1 readU1() {
        int a = read();
        return new U1(a);
    }

    public U1[] readU1Array(int length) {
        U1[] u1s = new U1[length];
        for (int i = 0; i < length; i++) {
            u1s[i] = readU1();
        }
        return u1s;
    }

    public U2[] readU2Array(int length) {
        U2[] u2s = new U2[length];
        for (int i = 0; i < length; i++) {
            u2s[i] = readU2();
        }
        return u2s;
    }

    public boolean justFinished() {
        try {
            int r = inputStream.read();
            return r == -1;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
