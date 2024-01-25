package com.study.constants;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated
@Retention(RetentionPolicy.RUNTIME)
public @interface Some {

    byte b();

    char ch();

    long f();

    int n() default 42;

    String s();

    int[] data();

    Class c();

    Class[] cs();

    ClassAccessFlags caf();

    III[] iiis();

    III iii();

//    I2 i2();

//    I2[] i2s();

    ClassAccessFlags[] cafs();

}

@Retention(RetentionPolicy.RUNTIME)
@interface III {
    long v1();

    int v2();

    float v3();

    String v4();

}

@Retention(RetentionPolicy.RUNTIME)
@interface I2 {

}

@Retention(RetentionPolicy.RUNTIME)
@interface I3 {

}

@Retention(RetentionPolicy.RUNTIME)
@interface I4 {

}

@Retention(RetentionPolicy.RUNTIME)
@interface I5 {

}

@Retention(RetentionPolicy.RUNTIME)
@interface I6 {

}

@Retention(RetentionPolicy.RUNTIME)
@interface I7 {

}

@Retention(RetentionPolicy.RUNTIME)
@interface I8 {

}

@Retention(RetentionPolicy.RUNTIME)
@interface I9 {

}

@Retention(RetentionPolicy.RUNTIME)
@interface I10 {

}

@Retention(RetentionPolicy.RUNTIME)
@interface I11 {

}
