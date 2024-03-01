package com.test.presenter.cp;

import com.study.constants.ConstantKind;
import com.test.cases.Case9;
import com.test.generator.TestGenerator;

import java.io.IOException;
import java.util.List;
import java.util.Set;

public class Type9TestGenerator {
    public static void main(String[] args) throws IOException, ReflectiveOperationException {
        Set<Class<?>> classes = Set.of(
                Case9.class,
                List.class,
                java.lang.annotation.Annotation.class,
                Record.class
        );

        for (Class<?> clazz : classes) {
            TestGenerator testGenerator =
                    new ConstantPoolTestGenerator(
                            clazz,
                            ConstantKind.CONSTANT_Fieldref
                    );
            testGenerator.generate();
        }
    }
}
