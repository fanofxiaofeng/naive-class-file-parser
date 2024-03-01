package com.test.presenter.cp;

import com.study.constants.ConstantKind;
import com.test.annotations.ExpectedConstantKind;
import com.test.generator.UniqueLineTestGenerator;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.*;
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
            return "com/test/presenter/cp/caseAll";
        }
        if (constantKinds.size() != 1) {
            String message = "Please provide 1 ConstantKind or ALL ConstantKinds";
            throw new IllegalArgumentException(message);
        }
        return "com/test/presenter/cp/case" + constantKinds.iterator().next().getTag();
    }

    public ConstantPoolTestGenerator(Class<?> clazz, ConstantKind constantKind) throws FileNotFoundException {
        this(clazz, EnumSet.of(constantKind));
    }

    @Override
    protected void visitHeaderLine() {
        Class<?> parentClass = ConstantPoolPresenterTestBase.class;
        testHolder.visitImportStatement(parentClass);
        String headerLine = String.format(
                "public class %sCpTest extends %s {%n",
                extractSimpleName(),
                parentClass.getSimpleName()
        );
        testHolder.visitHeaderLine(headerLine);
    }

    @Override
    protected void collectOtherClassesForImportStatements() {
        collectClassForImportStatement(ConstantPoolPresenterTestBase.class);
        collectClassForImportStatement(ExpectedConstantKind.class);
        collectClassForImportStatement(ConstantKind.class);
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
    protected List<String> beforeVisitTestMethod(List<String> filteredLines) {
        Set<ConstantKind> cs = EnumSet.noneOf(ConstantKind.class);
        for (String line : filteredLines) {
            String[] components = line.stripLeading().split(" +");
            Arrays.stream(ConstantKind.values()).filter(e -> e.getType().equals(components[2])).forEach(cs::add);
        }
        if (cs.isEmpty()) {
            testHolder.visitImportStatement(Test.class);
            return List.of(String.format("    @%s%n", Test.class.getSimpleName()));
        }

        List<String> lines = new ArrayList<>();
        testHolder.visitImportStatement(ExpectedConstantKind.class);
        testHolder.visitImportStatement(ConstantKind.class);
        for (ConstantKind constantKind : cs) {
            lines.add(String.format("    @ExpectedConstantKind(ConstantKind.%s)%n", constantKind));
        }
        lines.add(String.format("    @%s%n", Test.class.getSimpleName()));
        return lines;
    }

    @Override
    protected boolean shouldProcessThisItem(String line) {
        return constantKinds.stream().anyMatch(constantKind -> {
            int number = parseNumber(line);
            String expectedContent = String.format("#%s = %s", number, constantKind.getType());
            return line.stripLeading().startsWith(expectedContent);
        });
    }


    protected int parseNumber(String line) {
        line = line.stripLeading();
        int index = line.indexOf(' ');
        // Skip the '#' character
        return Integer.parseInt(line.substring(1, index));
    }
}