package com.test.generator;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

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

    protected List<String> hasSomeContent() throws IOException {
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
    protected void printBeforeMethod() {
        printStream.println();
        printStream.printf("    @%s%n", Before.class.getSimpleName());
        printStream.printf("    public void prepare() throws %s, %s {%n",
                IOException.class.getSimpleName(),
                ClassNotFoundException.class.getSimpleName()
        );
        printStream.printf("        buildRealLines(Class.forName(\"%s\"));%n", className);
        printStream.printf("    }%n");
        printStream.println();
    }

    @Override
    protected void printImportStatements() {
        smartPrintImportStatement(Before.class);
        super.printImportStatements();
    }


    protected abstract boolean shouldProcessThisItem(String line);


    protected void generateTestMethod(List<String> filteredLines) {
        printStream.printf("    @%s%n", Test.class.getSimpleName());
        printStream.printf("    public void test() {%n");
        printStream.printf("        expectedLines = List.of(%n");
        int size = filteredLines.size();
        IntStream.range(0, size).forEach(index -> {
            String line = filteredLines.get(index);
            printStream.print("                ");
            printStream.print('"');
            line.chars().forEach(c -> {
                switch (c) {
                    case '"' -> printStream.print("\\\"");
                    case '\'' -> printStream.print("'");
                    case '\\' -> printStream.print("\\\\");
                    default -> printStream.print((char) c);
                }
            });
            printStream.print("\"");
            if (index + 1 < size) {
                printStream.print(",");
            }
            printStream.println();
        });
        printStream.println("        );");
        printStream.println("    }");
    }
}