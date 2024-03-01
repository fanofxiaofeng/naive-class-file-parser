package com.test.presenter.cp;

import com.study.constants.ConstantKind;
import com.test.generator.TestGenerator;

import java.io.IOException;

// todo: no test was generated...
public class Type17TestGenerator {
    public static void main(String[] args) throws IOException, ReflectiveOperationException {
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
