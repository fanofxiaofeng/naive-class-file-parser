package com.test.presenter.cp;

import com.study.constants.ConstantKind;
import com.test.cases.Case10;
import com.test.generator.TestGenerator;

import java.io.IOException;
import java.util.List;
import java.util.Set;

public class Type10TestGenerator {
    public static void main(String[] args) throws IOException, ReflectiveOperationException {
        Set<Class<?>> classes = Set.of(
                Double.class,
                Enum.class,
                Case10.class,
                List.class,
                java.lang.annotation.Annotation.class,
                Record.class
        );

        for (Class<?> clazz : classes) {
            TestGenerator testGenerator =
                    new ConstantPoolTestGenerator(
                            clazz,
                            ConstantKind.CONSTANT_Methodref
                    );
            testGenerator.generate();
        }
    }
}
