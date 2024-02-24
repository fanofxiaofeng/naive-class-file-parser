package com.test.method;

import com.test.cases.method.ParameterCase;
import com.test.cases.method.ReturnValueCase;
import com.test.cases.method.ThrowsCase;
import com.test.generator.AbstractTestGenerator;
import com.test.generator.ConsecutiveLinesTestGenerator;
import com.test.generator.TestGeneratorContainer;
import com.test.present.C33;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.IntStream;

public class MethodTestGenerator extends ConsecutiveLinesTestGenerator {

    private int cnt = 0;

    public MethodTestGenerator(Class<?> clazz, String outputDirectory) {
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
        return String.format("src/test/java/%s/%sMethodsTest.java", outputDirectory, extractSimpleName());
    }

    @Override
    protected boolean shouldStop(String line) {
        return line.contains("}");
    }

    /**
     * Whether this line is the start line a method item
     */
    @Override
    protected boolean startOfOneItem(String line) {
        return line.endsWith(";") && line.indexOf('(') >= 0 && line.indexOf(')') >= 0;
    }

    @Override
    protected boolean endOfOneItem(String line) {
        return line.isBlank();
    }

    @Override
    protected void printHeaderLine() {
        printStream.printf(
                "public class %sMethodsTest extends %s {%n",
                extractSimpleName(),
                MethodPresenterTestBase.class.getSimpleName()
        );
    }

    @Override
    protected String buildTestFunctionNameForOneItem(List<String> linesForOneItem) {
        return "test_for_method_" + (++cnt);
    }

    @Override
    protected void printImportStatements() {
        smartPrintImportStatement(MethodPresenterTestBase.class);
        super.printImportStatements();
    }


    @Override
    protected List<String> filter(List<String> consecutiveLines) {
        List<String> realLines = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            realLines.add(consecutiveLines.get(i));
        }

        for (int i = 3; i < consecutiveLines.size(); i++) {
            String line = consecutiveLines.get(i);
            if (line.startsWith("    Signature:")) {
                realLines.add(line);
            } else if (line.equals("    Exceptions:")) {
                realLines.add(line);
                i++;
                realLines.add(consecutiveLines.get(i));
            }
        }

        return realLines;
    }

    private static void generateStandardTest() throws IOException {
        Set<Class<?>> classes = Set.of(
                Object.class,
//                Character.class,
//                Number.class,
//                Integer.class,
//                Long.class,
//                Float.class,
//                Double.class,
//                Math.class,
//                String.class,
                Class.class
//                Enum.class,
//                List.class,
//                ArrayList.class,
//                LinkedList.class,
//                Map.class,
//                HashMap.class,
//                LinkedHashMap.class,
//                TreeMap.class,
//                EnumSet.class
        );

        generateTest(classes, "com/test/method/standard");
    }

    private static void generateSpecificTest() throws IOException {
        Set<Class<?>> classes = Set.of(
                ReturnValueCase.class,
                ParameterCase.class,
                ThrowsCase.class,
//                ClassAccessFlags.class,
                C33.class
//                MethodCase.class
        );

        generateTest(classes, "com/test/method/specific");
    }

    private static void generateTest(Set<Class<?>> classes, String outputDirectory) throws IOException {
        TestGeneratorContainer testGeneratorContainer = new TestGeneratorContainer();
        testGeneratorContainer.process(classes, outputDirectory, MethodTestGenerator::new);
    }

    public static void main(String[] args) throws Exception {
        AbstractTestGenerator.overrideExistingFile = false;

        generateStandardTest();
        generateSpecificTest();
    }
}