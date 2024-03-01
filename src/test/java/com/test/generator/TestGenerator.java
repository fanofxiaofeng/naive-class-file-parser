package com.test.generator;

import java.io.IOException;

@FunctionalInterface
public interface TestGenerator {

    /**
     * Generate a test class and save it to some file
     */
    void generate() throws IOException, ReflectiveOperationException;
}
