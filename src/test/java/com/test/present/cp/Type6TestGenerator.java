package com.test.present.cp;

import com.study.constants.ConstantKind;
import com.test.cases.Case6;
import com.test.generator.TestGenerator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Type6TestGenerator {
    public static void main(String[] args) throws IOException {
        Set<Class<?>> classes = Set.of(
                Double.class,
                Math.class,
                Random.class,
                Class.class,
                Object.class,
                Enum.class,
                Case6.class,
                ArrayList.class,
                List.class
        );

        for (Class<?> clazz : classes) {
            TestGenerator testGenerator =
                    new ConstantPoolTestGenerator(
                            clazz,
                            ConstantKind.CONSTANT_Double
                    );
            testGenerator.generate();
        }
    }
}
