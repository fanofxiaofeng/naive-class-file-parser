package com.test.attribute.cases.rva;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class RuntimeVisibleAnnotationsAttributeCase5 {

    @CaseAnnotation1(value = {1, 2, 42}, value2 = {"Hello", "World   "})
    private int f1;

    @CaseAnnotation2(value = {MyEnum.DOWN, MyEnum.DOWN, MyEnum.UP, MyEnum.DOWN})
    private boolean f2;

    @CaseAnnotation3(value = {Object.class, Number.class, String.class, Class.class})
    private byte f3;

    @CaseAnnotation4(value = {@MyAnnotation4, @MyAnnotation4})
    private char f4;

    @CaseAnnotation5(value = {
            @CaseAnnotation4(value = {@MyAnnotation4, @MyAnnotation4}),
            @CaseAnnotation4(value = {@MyAnnotation4}),
            @CaseAnnotation4(value = {@MyAnnotation4, @MyAnnotation4, @MyAnnotation4}),
    })
    private long f5;

    @Retention(RetentionPolicy.RUNTIME)
    @interface CaseAnnotation1 {
        int[] value();

        String[] value2();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @interface CaseAnnotation2 {
        MyEnum[] value();
    }


    @Retention(RetentionPolicy.RUNTIME)
    @interface CaseAnnotation3 {
        Class<?>[] value();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @interface CaseAnnotation4 {
        MyAnnotation4[] value();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @interface CaseAnnotation5 {
        CaseAnnotation4[] value();
    }


    @Retention(RetentionPolicy.RUNTIME)
    @interface MyAnnotation4 {
    }

    enum MyEnum {
        UP,
        DOWN,
        ;
    }
}


