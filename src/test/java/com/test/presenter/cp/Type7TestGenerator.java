package com.test.presenter.cp;

import com.study.constants.ConstantKind;
import com.test.cases.Case7;
import com.test.generator.TestGenerator;

import java.io.IOException;
import java.util.Set;

public class Type7TestGenerator {
    public static void main(String[] args) throws IOException, ReflectiveOperationException {
        Set<Class<?>> classes = Set.of(
                Enum.class,
                Case7.class,
                java.lang.annotation.Annotation.class,
                Record.class
        );
        for (Class<?> clazz : classes) {

            TestGenerator testGenerator =
                    new ConstantPoolTestGenerator(
                            clazz,
                            ConstantKind.CONSTANT_Class
                    );
            testGenerator.generate();
        }
    }
}
