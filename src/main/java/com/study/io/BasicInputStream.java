package com.study.io;

import com.study.type.U1;
import com.study.type.U2;
import com.study.type.U4;

import java.io.IOException;
import java.io.InputStream;

public class BasicInputStream extends InputStream {
    private InputStream inputStream;

    public BasicInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public int read() {
        try {
            int r = inputStream.read();
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
}
