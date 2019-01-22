package com.study.parser;

import com.study.io.BasicInputStream;
import com.study.type.U4;

import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) throws Exception {
//        System.out.println(Arrays.tolString(args));
        FileInputStream inputStream = new FileInputStream(args[0]);
        BasicInputStream basicInputStream = new BasicInputStream(inputStream);
//        byte[] bytes = new byte[1024];
        U4 magic = basicInputStream.readU4();
        magic.show();
    }
}
