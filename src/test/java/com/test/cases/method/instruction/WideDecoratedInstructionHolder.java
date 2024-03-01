package com.test.cases.method.instruction;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface WideDecoratedInstructionHolder {
    WideDecoratedInstruction[] value();
}
