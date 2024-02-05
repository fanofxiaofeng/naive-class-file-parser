package com.test.attribute.cases.rva;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class RuntimeVisibleAnnotationsAttributeCase3 {

    @CaseClass1(value = Integer.class)
    private int f1;

    @CaseClass2(value = Case3C1.Case3C2.Case3C3.class)
    private int f2;
}

@Retention(RetentionPolicy.RUNTIME)
@interface CaseClass1 {
    Class<? extends Number> value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface CaseClass2 {
    Class<Case3C1.Case3C2.Case3C3> value();
}

class Case3C1<T1> {
    class Case3C2<T2> {
        class Case3C3 {
        }
    }
}