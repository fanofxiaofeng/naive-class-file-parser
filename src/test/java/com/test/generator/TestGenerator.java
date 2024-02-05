package com.test.generator;

import java.io.IOException;

@FunctionalInterface
public interface TestGenerator {
    void generate() throws IOException;
}
