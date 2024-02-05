package com.test.generator;


import java.io.IOException;
import java.util.Set;
import java.util.function.BiFunction;

public class TestGeneratorContainer {

    public void process(Set<Class<?>> classes,
                        String outputDirectory,
                        BiFunction<Class<?>, String, TestGenerator> biFunction
    ) throws IOException {
        for (Class<?> clazz : classes) {
            biFunction.apply(clazz, outputDirectory).generate();
        }
    }
}
