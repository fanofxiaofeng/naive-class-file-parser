package com.test.instruction;

import com.test.cases.method.instruction.*;
import com.test.generator.AbstractTestGenerator;
import com.test.generator.MemberTestGenerator;
import com.test.generator.TestGeneratorContainer;
import com.test.method.MethodPresenterTestBase;
import com.test.util.GeneratedClassClassLoader;
import com.test.util.Instructions;
import org.apache.commons.collections4.SetUtils;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InstructionTestGenerator extends MemberTestGenerator {

    private final Set<String> instructionNames = new HashSet<>();

    private final Map<Integer, Instruction> instructionMap = new HashMap<>();
    private final Map<Integer, WideDecoratedInstruction> wideDecoratedInstructionMap = new HashMap<>();

    public InstructionTestGenerator(Class<?> clazz, String outputDirectory) {
        super(clazz, outputDirectory);
    }

    @Override
    protected void prepare() throws ReflectiveOperationException {
        if (InstructionAnalyzer.class.isAssignableFrom(targetClass)) {
            instructionMap.putAll(((InstructionAnalyzer) targetClass.getDeclaredConstructor().newInstance()).buildInstructionMap());
            wideDecoratedInstructionMap.putAll(((InstructionAnalyzer) targetClass.getDeclaredConstructor().newInstance()).buildWideDecoratedInstructionMap());
        }
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
        return String.format("src/test/java/%s/%sInstructionsTest.java", outputDirectory, extractSimpleName());
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
        Optional<String> methodName = findMethodName(linesForOneItem.get(0));
        if (methodName.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return methodName.get();
    }

    private Optional<String> findMethodName(String headerLine) {
        // should be something like this
        // "  public static void test_0x3b_to_0x3e(int, int, int, int);",
        int index = headerLine.indexOf('(');
        if (index < 0) {
            return Optional.empty();
        }

        int methodNameEndIndex = index - 1;
        while (headerLine.charAt(methodNameEndIndex) == ' ') {
            methodNameEndIndex--;
        }

        int methodNameStartIndex = methodNameEndIndex - 1;
        while (headerLine.charAt(methodNameStartIndex - 1) != ' ') {
            methodNameStartIndex--;
        }
        String methodName = headerLine.substring(methodNameStartIndex, methodNameEndIndex + 1);
        if (methodName.startsWith("test")) {
            return Optional.of(methodName);
        }
        return Optional.empty();
    }

    @Override
    protected List<String> filter(List<String> consecutiveLines) {
        List<String> realLines = new ArrayList<>();
        Optional<String> methodName = findMethodName(consecutiveLines.get(0));
        if (methodName.isEmpty()) {
            return Collections.emptyList();
        }
        for (int i = 0; i < 3; i++) {
            realLines.add(consecutiveLines.get(i));
        }

        for (int i = 3; i < consecutiveLines.size(); ) {
            String line = consecutiveLines.get(i);
            if (line.startsWith("    Signature:")) {
                realLines.add(line);
                i++;
            } else if (line.equals("    Exceptions:")) {
                realLines.add(line);
                realLines.add(consecutiveLines.get(i + 1));
                i += 2;
            } else if (line.equals("    Code:")) {
                realLines.add(line);
                realLines.add(consecutiveLines.get(i + 1));
                int delta = 2;
                while (i + delta < consecutiveLines.size()) {
                    String tempLine = consecutiveLines.get(i + delta);
                    String strippedLine = tempLine.stripLeading();
                    int index = strippedLine.indexOf(':');
                    if (index < 0) {
                        i += delta;
                        break;
                    }
                    String numberCandidate = strippedLine.substring(0, index);
                    boolean isNum = true;
                    for (char c : numberCandidate.toCharArray()) {
                        if (c >= '0' && c <= '9') {
                            continue;
                        }
                        isNum = false;
                        break;
                    }
                    if (isNum) {
                        realLines.add(tempLine);
                        String instructionName = findInstructionName(tempLine);
                        instructionNames.add(instructionName);
                        delta++;
                        continue;
                    }
                    i += delta;
                    break;
                }
            } else {
                i++;
            }
        }

        return realLines;
    }


    @Override
    protected List<String> beforeGenerateTestMethod(List<String> realLines) {
        int start = 0;
        boolean found = false;
        for (int i = 0; i < realLines.size(); i++) {
            String line = realLines.get(i);
            if (line.equals("    Code:")) {
                start = i;
                found = true;
                break;
            }
        }
        if (!found) {
            testHolder.visitImportStatement(Test.class);
            return List.of(String.format("    @Test%n"));
        }

        List<String> result = new ArrayList<>();
        Map<Integer, String> appearedInstructions = new TreeMap<>();
        for (int current = start + 2; current < realLines.size(); current++) {
            String tempLine = realLines.get(current);
            String strippedLine = tempLine.stripLeading();
            int colonIndex = strippedLine.indexOf(':');
            if (colonIndex < 0) {
                break;
            }

            String numberCandidate = strippedLine.substring(0, colonIndex);
            boolean isNum = true;
            for (char c : numberCandidate.toCharArray()) {
                if (c >= '0' && c <= '9') {
                    continue;
                }
                isNum = false;
                break;
            }
            if (isNum) {
//                realLines.add(tempLine);
                String instructionName = findInstructionName(tempLine);
                int order = Instructions.getOrder(instructionName);
                if (instructionMap.containsKey(order)) {
                    appearedInstructions.put(order, instructionName);
                } else if (wideDecoratedInstructionMap.containsKey(order)) {
                    appearedInstructions.put(order, instructionName);
                }
            }
        }
        if (!appearedInstructions.isEmpty()) {
            appearedInstructions.forEach((order, instructionName) -> {
                result.add(String.format("    @Instruction(value = 0x%02x, name = \"%s\")%n", order, instructionName));
            });
//            result.add(String.format("// todo: Please fix wrong value inside each @Instruction%n"));
            testHolder.visitImportStatement(Instruction.class);
        }
        testHolder.visitImportStatement(Test.class);
        result.add(String.format("    @Test%n"));

        return result;
    }

    private String findInstructionName(String tempLine) {
        return tempLine.stripLeading().split(" ")[1];
    }

    @Override
    protected void postGenerate() {
        if (!InstructionAnalyzer.class.isAssignableFrom(targetClass)) {
            return;
        }

        Set<String> realInstructionNames = new HashSet<>(instructionNames);
        try {
            Constructor<? extends InstructionAnalyzer> constructor = ((Class<? extends InstructionAnalyzer>) targetClass).getConstructor();
            Map<Integer, Instruction> expectedInstructionMap = constructor.newInstance().buildInstructionMap();
            Set<String> expectedInstructionNames = expectedInstructionMap.values().stream().map(Instruction::name).collect(Collectors.toSet());
            Set<String> remained = SetUtils.difference(expectedInstructionNames, realInstructionNames);
            if (remained.isEmpty()) {
                System.out.printf("%s: %s%n", targetClass.getSimpleName(), remained);
            } else {
                System.out.println("Below instructions are expected to appear but they didn't");
                System.out.printf("%s: %s%n", targetClass.getSimpleName(), remained);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void visitHeaderLine() {
        Class<?> parentClass = MethodPresenterTestBase.class;
        String headerLine = String.format(
                "public class %sInstructionsTest extends %s {%n",
                extractSimpleName(),
                parentClass.getSimpleName()
        );
        testHolder.visitImportStatement(parentClass);
        testHolder.visitHeaderLine(headerLine);
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

        generateTest(classes, "com/test/instruction/standard");
    }

    private static void generateSpecificTest() throws IOException, ReflectiveOperationException {
        Set<Class<?>> classes = Set.of(
                LoadAndStoreInstructionsIntCase.class,
                LoadAndStoreInstructionsLongCase.class,
                LoadAndStoreInstructionsFloatCase.class,
                LoadAndStoreInstructionsDoubleCase.class,
                LoadAndStoreInstructionsObjectCase.class,
                new GeneratedClassClassLoader().loadClass("com.generated.cases.method.instruction.DupX2Case"),
                new GeneratedClassClassLoader().loadClass("com.generated.cases.method.instruction.Dup2Case"),
                LoadAndStoreInstructionsWideCase.class,
                StackInstructionsCase.class,
                ArithmeticInstructionsCase.class
//                NopContainer.class
        );

        generateTest(classes, "com/test/instruction/specific");
    }

    private static void generateTest(Set<Class<?>> classes, String outputDirectory) throws IOException, ReflectiveOperationException {
        TestGeneratorContainer testGeneratorContainer = new TestGeneratorContainer();
        testGeneratorContainer.process(classes, outputDirectory, InstructionTestGenerator::new);
    }

    public static void main(String[] args) throws Exception {
        AbstractTestGenerator.overrideExistingFile = true;

//        generateStandardTest();
        generateSpecificTest();
    }
}
