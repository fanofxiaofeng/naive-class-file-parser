package com.test.generator;

import java.io.FileNotFoundException;

@FunctionalInterface
public interface SuiteGenerator {
    String generate() throws FileNotFoundException;
}
