package com.test.cases.method.instruction;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(WideDecoratedInstructionHolder.class)
public @interface WideDecoratedInstruction {
    int value();

    String name();

}

