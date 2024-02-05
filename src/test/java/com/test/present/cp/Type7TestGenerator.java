package com.test.present.cp;

import com.study.constants.ConstantKind;
import com.test.cases.Case7;
import com.test.generator.TestGenerator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Type7TestGenerator {
    public static void main(String[] args) throws IOException {
        Set<Class<?>> classes = Set.of(
                Double.class,
                Class.class,
                Object.class,
                Enum.class,
                Case7.class,
                ArrayList.class,
                List.class,
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
