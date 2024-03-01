package com.test.presenter.cp;

import com.study.constants.ConstantKind;
import com.test.cases.Case3;
import com.test.generator.TestGenerator;

import java.io.IOException;
import java.util.*;

public class Type3TestGenerator {

    public static void main(String[] args) throws IOException, ReflectiveOperationException {
        Set<Class<?>> classes = Set.of(
                Case3.class
        );
        for (Class<?> clazz : classes) {
            TestGenerator testGenerator =
                    new ConstantPoolTestGenerator(
                            clazz,
                            ConstantKind.CONSTANT_Integer
                    );
            testGenerator.generate();
        }
    }
}
