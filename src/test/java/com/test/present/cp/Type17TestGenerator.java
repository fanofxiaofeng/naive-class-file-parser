package com.test.present.cp;

import com.study.constants.ConstantKind;
import com.test.generator.TestGenerator;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

// todo: no test was generated...
public class Type17TestGenerator {
    public static void main(String[] args) throws IOException {
        Class<?>[] classes = new Class[]{
                ClassLoader.class,
        };
        for (Class<?> clazz : classes) {
            TestGenerator testGenerator =
                    new ConstantPoolTestGenerator(
                            clazz,
                            ConstantKind.CONSTANT_Dynamic
                    );
            testGenerator.generate();
        }
    }
}
