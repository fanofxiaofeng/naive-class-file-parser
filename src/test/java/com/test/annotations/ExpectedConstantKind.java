package com.test.annotations;

import com.study.constants.ConstantKind;

import java.lang.annotation.*;

@Repeatable(ExpectedConstantKindHolder.class)
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ExpectedConstantKind {
    ConstantKind value();
}
