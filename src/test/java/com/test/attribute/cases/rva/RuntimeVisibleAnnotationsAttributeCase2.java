package com.test.attribute.cases.rva;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class RuntimeVisibleAnnotationsAttributeCase2 {

    @CaseEnum(value = C1.C2.MyEnum.EAST)
    private int f1;

    @CaseEnum
    private int f2;
}


@Retention(RetentionPolicy.RUNTIME)
@interface CaseEnum {
    C1.C2.MyEnum value() default C1.C2.MyEnum.SOUTH;
}


class C1<T1> {
     static class C2<T2> {
        enum MyEnum {
            EAST,
            WEST,
            NORTH,
            SOUTH,
            ;
        }
    }
}