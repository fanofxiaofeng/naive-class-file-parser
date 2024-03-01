package com.test.presenter.cp;

import com.study.constants.ConstantKind;
import com.test.cases.Case5;
import com.test.generator.TestGenerator;

import java.io.IOException;
import java.util.Set;

public class Type5TestGenerator {
    public static void main(String[] args) throws IOException, ReflectiveOperationException {
        Set<Class<?>> classes = Set.of(
                Case5.class
        );

        for (Class<?> clazz : classes) {
            TestGenerator testGenerator =
                    new ConstantPoolTestGenerator(
                            clazz,
                            ConstantKind.CONSTANT_Long
                    );
            testGenerator.generate();
        }
    }
}
