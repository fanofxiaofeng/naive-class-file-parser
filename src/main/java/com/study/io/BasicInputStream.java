package com.study.io;

import com.study.type.U1;
import com.study.type.U2;
import com.study.type.U4;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class BasicInputStream extends InputStream implements ContentReader {
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

    @Override
    public U4 readU4() {
        int a = read();
        int b = read();
        int c = read();
        int d = read();
        return new U4(a, b, c, d);
    }

    @Override
    public U2 readU2() {
        int a = read();
        int b = read();
        return new U2(a, b);
    }

    @Override
    public U1 readU1() {
        int a = read();
        return new U1(a);
    }

    @Override
    public U1[] readU1Array(int length) {
        U1[] u1s = new U1[length];
        for (int i = 0; i < length; i++) {
            u1s[i] = readU1();
        }
        return u1s;
    }

    @Override
    public List<U2> readU2List(U2 size) {
        return readU2List(size.toInt());
    }

    public List<U2> readU2List(int length) {
        if (length == 0) {
            return Collections.emptyList();
        }

        List<U2> u2List = new ArrayList<>(length);

        IntStream.range(0, length).forEach(index -> u2List.add(readU2()));

        return u2List;
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
