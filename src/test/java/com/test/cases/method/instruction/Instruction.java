package com.test.cases.method.instruction;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(InstructionHolder.class)
public @interface Instruction {
    int value();

    String name();

    boolean needMoreWork() default false;
}