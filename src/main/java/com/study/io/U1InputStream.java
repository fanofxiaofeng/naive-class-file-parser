package com.study.io;

import com.study.type.U1;
import com.study.type.U2;
import com.study.type.U4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

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

    public List<U1> readU1List(int length) {
        List<U1> u1List = new ArrayList<>(length);
        IntStream.range(0, length).forEach(e -> u1List.add(readU1()));
        return u1List;
    }

    public List<U2> readU2List(int length) {
        List<U2> u2List = new ArrayList<>(length);
        IntStream.range(0, length).forEach(e -> u2List.add(readU2()));
        return u2List;
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
