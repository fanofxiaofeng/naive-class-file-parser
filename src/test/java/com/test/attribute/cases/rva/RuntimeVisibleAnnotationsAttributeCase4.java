package com.test.attribute.cases.rva;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class RuntimeVisibleAnnotationsAttributeCase4 {

    @CaseAnnotation1(value = @MyAnnotation1(value = 42))
    private int f1;

    @CaseAnnotation2(value = @MyAnnotation2(value = 100, value2 = 31415926535L, value3 = "Hello world   "))
    private boolean f2;

    @CaseAnnotation3(value = @MyAnnotation3(MyEnum.DOWN))
    private byte f3;

    @CaseAnnotation4(value = @MyAnnotation4(MyClass.Inner.class))
    private char f4;
}

@Retention(RetentionPolicy.RUNTIME)
@interface CaseAnnotation1 {
    MyAnnotation1 value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface CaseAnnotation2 {
    MyAnnotation2 value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface CaseAnnotation3 {
    MyAnnotation3 value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface CaseAnnotation4 {
    MyAnnotation4 value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation1 {
    int value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2 {
    int value();

    long value2();

    String value3();
}


@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3 {
    MyEnum value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation4 {
    Class<MyClass.Inner> value();
}

enum MyEnum {
    UP,
    DOWN,
    ;
}

class MyClass<T1> {
    class Inner<T2> {

    }
}
