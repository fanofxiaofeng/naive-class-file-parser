package com.test.present.cp;

import com.study.constants.ConstantKind;
import com.test.generator.UniqueLineTestGenerator;

import java.io.FileNotFoundException;
import java.util.EnumSet;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.IntStream;

public class ConstantPoolTestGenerator extends UniqueLineTestGenerator {
    private final Set<ConstantKind> constantKinds;

    public ConstantPoolTestGenerator(Class<?> clazz, Package p, Set<ConstantKind> constantKinds) throws FileNotFoundException {
        super(clazz, p);
        this.constantKinds = constantKinds;
    }

    public ConstantPoolTestGenerator(Class<?> clazz, String outputDirectory, Set<ConstantKind> constantKinds) throws FileNotFoundException {
        super(clazz, outputDirectory);
        this.constantKinds = constantKinds;
    }

    public ConstantPoolTestGenerator(Class<?> clazz, Set<ConstantKind> constantKinds) throws FileNotFoundException {
        super(clazz, buildOutputDirectory(constantKinds));
        this.constantKinds = constantKinds;
    }

    private static String buildOutputDirectory(Set<ConstantKind> constantKinds) {
        if (constantKinds.equals(EnumSet.allOf(ConstantKind.class))) {
            return "com/test/present/cp/case_all";
        }
        if (constantKinds.size() != 1) {
            String message = "Please provide 1 ConstantKind or all ConstantKinds";
            throw new IllegalArgumentException(message);
        }
        return "com/test/present/cp/case" + constantKinds.iterator().next().getTag();
    }

    public ConstantPoolTestGenerator(Class<?> clazz, ConstantKind constantKind) throws FileNotFoundException {
        this(clazz, EnumSet.of(constantKind));
    }

    @Override
    protected void printImportStatements() {
        smartPrintImportStatement(ConstantPoolPresenterTestBase.class);
        super.printImportStatements();
    }

    @Override
    protected String buildOutputFileName() {
        return String.format("src/test/java/%s/%sCpTest.java", outputDirectory, extractSimpleName());
    }

    @Override
    protected boolean shouldStop(String line) {
        return !line.stripLeading().startsWith("#");
    }

    @Override
    protected int findStartIndex(List<String> lines) {
        int size = lines.size();
        OptionalInt first = IntStream.range(0, size).filter(index -> {
            String line = lines.get(index);
            return line.stripLeading().startsWith("#");
        }).findFirst();
        if (first.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return first.getAsInt();
    }

    @Override
    protected void printHeaderLine() {
        printStream.printf(
                "public class %sCpTest extends %s {%n",
                extractSimpleName(),
                ConstantPoolPresenterTestBase.class.getSimpleName()
        );
    }

    @Override
    protected boolean shouldProcessThisItem(String line) {
        return constantKinds.stream().anyMatch(constantKind -> {
            int number = parseNumber(line);
            String expectedContent = String.format("#%s = %s", number, constantKind.getType());
            return line.trim().startsWith(expectedContent);
        });
    }


    protected int parseNumber(String line) {
        line = line.trim();
        int index = line.indexOf(' ');
        // Skip the '#' character
        return Integer.parseInt(line.substring(1, index));
    }
}