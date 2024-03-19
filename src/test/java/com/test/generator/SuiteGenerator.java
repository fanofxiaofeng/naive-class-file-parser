package com.test.generator;

import java.io.FileNotFoundException;
import java.util.Optional;

@FunctionalInterface
public interface SuiteGenerator {
    Optional<String> generate() throws FileNotFoundException;
}
