package com.test.generator;

import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class UniqueLineTestGenerator extends AbstractTestGenerator<String> {

    public UniqueLineTestGenerator(Class<?> clazz, Package p) {
        super(clazz, p);
    }

    public UniqueLineTestGenerator(Class<?> clazz, String outputDirectory) {
        super(clazz, outputDirectory);
    }

    protected abstract String buildOutputFileName();


    protected abstract boolean shouldStop(String line);

    protected int findStartIndex(List<String> lines) {
        return 0;
    }

    protected List<String> filterContent() throws IOException {
        List<String> lines = readLines();
        List<String> filteredLines = new ArrayList<>();
        for (int index = findStartIndex(lines); index < lines.size(); index++) {
            String line = lines.get(index);

            if (shouldStop(line)) {
                break;
            }

            if (shouldProcessThisItem(line)) {
                filteredLines.add(line);
            }
        }
        return filteredLines;
    }

    @Override
    protected void visitBeforeClassMethod() {
        testHolder.visitBeforeClassMethod(className);
    }

    protected abstract boolean shouldProcessThisItem(String line);

    protected List<String> beforeVisitTestMethod(List<String> filteredLines) {
        return List.of(String.format("    @%s%n", Test.class.getSimpleName()));
    }

    @Override
    protected void visitTestMethods(List<String> filteredLines) {
        List<String> pre = beforeVisitTestMethod(filteredLines);

        String headerLine = String.format("    public void test() {%n");

        testHolder.visitTestMethod(pre, headerLine, filteredLines, "expectedLines");
    }
}