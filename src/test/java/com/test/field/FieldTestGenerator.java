package com.test.field;

import com.study.constants.ClassAccessFlags;
import com.test.cases.FieldCase;
import com.test.generator.AbstractTestGenerator;
import com.test.generator.ConsecutiveLinesTestGenerator;
import com.test.generator.TestGeneratorContainer;
import com.test.present.C22;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;

public class FieldTestGenerator extends ConsecutiveLinesTestGenerator {

    public FieldTestGenerator(Class<?> clazz, String outputDirectory) {
        super(clazz, outputDirectory);
    }

    @Override
    protected int startIndex(List<String> lines) {
        int size = lines.size();
        OptionalInt first = IntStream.range(0, size).filter(index -> {
            String line = lines.get(index);
            return line.equals("{");
        }).findFirst();

        if (first.isEmpty()) {
            throw new IllegalArgumentException();
        }

        return first.getAsInt();
    }

    @Override
    protected String buildOutputFileName() {
        return String.format("src/test/java/%s/%sFieldsTest.java", outputDirectory, extractSimpleName());
    }

    @Override
    protected boolean shouldStop(String line) {
        return line.contains("(");
    }

    /**
     * Whether this line is the start line a field item
     */
    @Override
    protected boolean startOfOneItem(String line) {
        return line.endsWith(";");
    }

    @Override
    protected boolean endOfOneItem(String line) {
        return line.isBlank();
    }

    @Override
    protected void printHeaderLine() {
        printStream.printf(
                "public class %sFieldsTest extends %s {%n",
                extractSimpleName(),
                FieldPresenterTestBase.class.getSimpleName()
        );
    }

    /**
     * Just process all fields
     */
    @Override
    protected boolean shouldProcessThisItem(List<String> linesForOneItem) {
        return true;
    }

    @Override
    protected String buildTestFunctionNameForOneItem(List<String> linesForOneItem) {
        String firstLine = linesForOneItem.get(0);
        firstLine = StringUtils.removeEnd(firstLine, ";");
        String[] components = firstLine.split(" +");
        return "test_for_field_" + components[components.length - 1];
    }

    @Override
    protected void printImportStatements() {
        smartPrintImportStatement(FieldPresenterTestBase.class);
        super.printImportStatements();
    }

    private static void generateStandardTest() throws IOException {
        Set<Class<?>> classes = Set.of(
                Character.class,
                Number.class,
                Integer.class,
                Long.class,
                Float.class,
                Double.class,
                Math.class,
                String.class,
                Class.class,
                Enum.class,
                List.class,
                ArrayList.class,
                LinkedList.class,
                Map.class,
                HashMap.class,
                LinkedHashMap.class,
                TreeMap.class,
                EnumSet.class
        );

        generateTest(classes, "com/test/field/standard");
    }

    private static void generateSpecificTest() throws IOException {
        Set<Class<?>> classes = Set.of(
                ClassAccessFlags.class,
                C22.class,
                FieldCase.class
        );

        generateTest(classes, "com/test/field/specific");
    }

    private static void generateTest(Set<Class<?>> classes, String outputDirectory) throws IOException {
        TestGeneratorContainer testGeneratorContainer = new TestGeneratorContainer();
        testGeneratorContainer.process(classes, outputDirectory, FieldTestGenerator::new);
    }

    public static void main(String[] args) throws Exception {
        AbstractTestGenerator.overrideExistingFile = false;

        generateStandardTest();
        generateSpecificTest();
    }
}