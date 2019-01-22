package com.study.io;

import com.study.type.U4;

import java.io.IOException;
import java.io.InputStream;

public class BasicInputStream extends InputStream {
    private InputStream inputStream;

    public BasicInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public int read() throws IOException {
        return 0;
    }

    public U4 readU4() throws IOException {
        int a = inputStream.read();
        int b = inputStream.read();
        int c = inputStream.read();
        int d = inputStream.read();
        return new U4(a, b, c, d);
    }
}
