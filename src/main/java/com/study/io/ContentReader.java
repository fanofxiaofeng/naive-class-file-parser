package com.study.io;

import com.study.type.U1;
import com.study.type.U2;
import com.study.type.U4;

import java.util.List;

public interface ContentReader {

    U1 readU1();

    U2 readU2();

    U4 readU4();

    U1[] readU1Array(int size);

    List<U2> readU2List(U2 size);
}
