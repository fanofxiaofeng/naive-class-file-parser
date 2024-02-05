package com.test.attribute.cases.rvta;

import java.lang.annotation.*;
import java.util.List;

public class RuntimeVisibleTypeAnnotationsCase1 {

    private List<
            @CaseByte
            @CaseByte(value = 1)
            @CaseByte(value = 2)
                    ? extends Number> f1;

    @Target(ElementType.TYPE_USE)
    @Retention(RetentionPolicy.RUNTIME)
    @Repeatable(CaseByteContainer.class)
    @interface CaseByte {
        byte value() default 42;
    }

    @Target(ElementType.TYPE_USE)
    @Retention(RetentionPolicy.RUNTIME)
    @interface CaseByteContainer {
        CaseByte[] value();
    }
}
