package com.test.attribute.cases.rvpa;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class RuntimeVisibleParameterAnnotationsCase1 {

    public void f(@CaseByte(value = 1)
                  @CaseByte(value = 2)
                  @CaseByte(value = 3)
                  int a,

                  @CaseByte(value = 4)
                  int b,

                  @CaseByte
                  int c
    ) {

    }

    @Repeatable(CaseByteContainer.class)
    @Retention(RetentionPolicy.CLASS)
    @interface CaseByte {
        byte value() default 42;
    }

    @Retention(RetentionPolicy.CLASS)
    @interface CaseByteContainer {
        CaseByte[] value();
    }
}
