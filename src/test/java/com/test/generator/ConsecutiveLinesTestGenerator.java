package com.test.generator;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public abstract class ConsecutiveLinesTestGenerator extends AbstractTestGenerator<List<String>> {

    public ConsecutiveLinesTestGenerator(Class<?> clazz, String outputDirectory) {
        super(clazz, outputDirectory);
    }

    protected abstract boolean shouldStop(String line);

    protected abstract int startIndex(List<String> lines);

    protected abstract boolean startOfOneItem(String line);

    protected abstract boolean endOfOneItem(String line);

    protected List<List<String>> hasSomeContent() throws IOException {
        List<String> lines = readLines();
        List<List<String>> result = new ArrayList<>();
        for (int index = startIndex(lines); index < lines.size(); index++) {
            String line = lines.get(index);

            if (shouldStop(line)) {
                break;
            }

            if (startOfOneItem(line)) {
                List<String> consecutiveLines = new ArrayList<>();
                while (!endOfOneItem(line)) {
                    consecutiveLines.add(line);
                    if (index + 1 < lines.size()) {
                        index++;
                        line = lines.get(index);
                    } else {
                        break;
                    }
                }

                if (shouldProcessThisItem(consecutiveLines)) {
                    result.add(consecutiveLines);
                }
            }
        }

        return result;
    }

    @Override
    protected void printBeforeMethod() {
        printStream.println();
        printStream.printf("    @%s%n", BeforeClass.class.getSimpleName());
        printStream.printf("    public static void prepare() throws %s, %s {%n",
                IOException.class.getSimpleName(),
                ClassNotFoundException.class.getSimpleName()
        );
        printStream.printf("        buildRealLines(Class.forName(\"%s\"));%n", className);
        printStream.printf("    }%n");
        printStream.println();
    }

    protected void printImportStatements() {
        smartPrintImportStatement(BeforeClass.class);
        super.printImportStatements();
    }

    protected boolean shouldProcessThisItem(List<String> linesForOneItem) {
        return true;
    }

    protected abstract String buildTestFunctionNameForOneItem(List<String> linesForOneItem);

    @Override
    protected void generateTestMethod(List<List<String>> filteredLines) {
        for (List<String> consecutiveLines : filteredLines) {
            List<String> realLines = filter(consecutiveLines);
            doGenerateTestMethod(realLines);
        }
    }

    protected List<String> filter(List<String> consecutiveLines) {
        return consecutiveLines;
    }

    private void doGenerateTestMethod(List<String> consecutiveLines) {
        printStream.printf("    @%s%n", Test.class.getSimpleName());
        String testFunctionName = buildTestFunctionNameForOneItem(consecutiveLines);
        printStream.printf("    public void %s() {%n", testFunctionName);
        printStream.printf("        expectedConsecutiveLines = List.of(%n");
        int size = consecutiveLines.size();
        IntStream.range(0, size).forEach(index -> {
            String line = consecutiveLines.get(index);
            printStream.print("                ");
            printStream.print('"');
            line.chars().forEach(c -> {
                switch (c) {
                    case '"' -> printStream.print("\\\"");
                    case '\'' -> printStream.print("'");
                    case '\\' -> printStream.print("\\\\");
                    // todo: how to handle '\n'?
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