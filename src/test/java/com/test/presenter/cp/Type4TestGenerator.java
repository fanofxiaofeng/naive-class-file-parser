package com.test.presenter.cp;

import com.study.constants.ConstantKind;
import com.test.cases.Case4;
import com.test.generator.TestGenerator;

import java.io.IOException;
import java.util.Set;

public class Type4TestGenerator {
    public static void main(String[] args) throws IOException, ReflectiveOperationException {
        Set<Class<?>> classes = Set.of(
                Case4.class,
                Float.class
        );

        for (Class<?> clazz : classes) {
            TestGenerator testGenerator =
                    new ConstantPoolTestGenerator(
                            clazz,
                            ConstantKind.CONSTANT_Float
                    );
            testGenerator.generate();
        }
    }
}
