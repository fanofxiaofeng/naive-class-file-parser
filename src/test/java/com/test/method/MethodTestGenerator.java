package com.test.method;

import com.study.constants.ClassAccessFlags;
import com.test.cases.method.*;
import com.test.generator.AbstractTestGenerator;
import com.test.generator.MemberTestGenerator;
import com.test.generator.TestGeneratorContainer;
import com.test.presenter.C33;
import org.apache.commons.collections4.iterators.PeekingIterator;

import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;

public class MethodTestGenerator extends MemberTestGenerator {

    private int cnt = 0;

    public MethodTestGenerator(Class<?> clazz, String outputDirectory) {
        super(clazz, outputDirectory);
    }

    @Override
    protected void visitHeaderLine() {
        Class<?> parentClass = MethodPresenterTestBase.class;

        testHolder.visitImportStatement(parentClass);
        String headerLine = String.format(
                "public class %sMethodsTest extends %s {%n",
                extractSimpleName(),
                parentClass.getSimpleName()
        );
        testHolder.visitHeaderLine(headerLine);
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
    protected String buildTestFunctionNameForOneItem(List<String> linesForOneItem) {
        return "test_for_method_" + (++cnt);
    }

    @Override
    protected void collectOtherClassesForImportStatements() {
        collectClassForImportStatement(MethodPresenterTestBase.class);
    }

    private List<String> processCodeAttribute(PeekingIterator<String> peekingIterator) {
        List<String> result = new ArrayList<>();

        result.add(peekingIterator.next());
        result.add(peekingIterator.next());

        while (peekingIterator.hasNext()) {
            String originalLine = peekingIterator.peek();
            String strippedLine = originalLine.stripLeading();
            int colonIndex = strippedLine.indexOf(':');
            if (colonIndex < 0) {
                break;
            }

            String numberCandidate = strippedLine.substring(0, colonIndex);
            if (isNum(numberCandidate)) {
                String instructionName = findInstructionName(strippedLine);
                result.add(peekingIterator.next());
                if (isVariableLengthInstruction(instructionName)) {
                    while (!peekingIterator.peek().endsWith("}")) {
                        result.add(peekingIterator.next());
                    }
                    result.add(peekingIterator.next());
                }
            } else {
                break;
            }
        }

        if ("      Exception table:".equals(peekingIterator.peek())) {
            result.add(peekingIterator.next());
            while (peekingIterator.hasNext() && !peekingIterator.peek().contains(":")) {
                result.add(peekingIterator.next());
            }
        }

        while (peekingIterator.hasNext()) {
            String peek = peekingIterator.peek();
            if (peek.equals("      LineNumberTable:")) {
                result.add(peekingIterator.next());
                while (peekingIterator.hasNext() && peekingIterator.peek().stripLeading().startsWith("line ")) {
                    result.add(peekingIterator.next());
                }
            } else if (peek.equals("      LocalVariableTable:") || peek.equals("      LocalVariableTypeTable:")) {
                result.add(peekingIterator.next());
                result.add(peekingIterator.next());
                while (peekingIterator.hasNext() && isNum(peekingIterator.peek().stripLeading().split(" +")[0])) {
                    result.add(peekingIterator.next());
                }
            } else {
                break;
            }
        }

        return result;
    }

    @Override
    protected List<String> filter(List<String> consecutiveLines) {
        List<String> realLines = new ArrayList<>();

        // 0: header, 1: descriptor, 2: flags
        PeekingIterator<String> peekingIterator = new PeekingIterator<>(consecutiveLines.iterator());
        for (int i = 0; i < 3; i++) {
            realLines.add(peekingIterator.next());
        }

        while (peekingIterator.hasNext()) {
            String line = peekingIterator.peek();
            if (line.startsWith("    Signature:")) {
                realLines.add(peekingIterator.next());
            } else if (line.equals("    Exceptions:")) {
                realLines.add(peekingIterator.next());
                realLines.add(peekingIterator.next());
            } else if (line.equals("    Code:")) {
                List<String> codeLines = processCodeAttribute(peekingIterator);
//                realLines.addAll(codeLines);
            } else {
                peekingIterator.next();
            }
        }

        return realLines;
    }

    private static void generateStandardTest() throws IOException, ReflectiveOperationException {
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
//                Class.class
                Enum.class,
                List.class
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

    private static void generateSpecificTest() throws IOException, ReflectiveOperationException {
        Set<Class<?>> classes = Set.of(
                InterfaceCase.class,
                CodeCase.class,
                ReturnValueCase.class,
                ParameterCase.class,
                ThrowsCase.class,
                ClassAccessFlags.class,
                C33.class,
                EnumCase.Temp.class
//                MethodCase.class
        );

        generateTest(classes, "com/test/method/specific");
    }

    private static void generateTest(Set<Class<?>> classes, String outputDirectory) throws IOException, ReflectiveOperationException {
        TestGeneratorContainer testGeneratorContainer = new TestGeneratorContainer();
        testGeneratorContainer.process(classes, outputDirectory, MethodTestGenerator::new);
    }

    public static void main(String[] args) throws Exception {
        AbstractTestGenerator.overrideExistingFile = true;

        generateStandardTest();
        generateSpecificTest();
    }
}