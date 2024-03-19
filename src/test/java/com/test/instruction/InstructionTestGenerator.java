package com.test.instruction;

import com.test.cases.method.instruction.*;
import com.test.generator.AbstractTestGenerator;
import com.test.generator.MemberTestGenerator;
import com.test.generator.TestGeneratorContainer;
import com.test.method.MethodPresenterTestBase;
import com.test.util.GeneratedClassClassLoader;
import com.test.util.InstructionUtils;
import com.test.util.Instructions;
import com.test.util.WideDecoratedInstructionUtils;
import org.apache.commons.collections4.SetUtils;
import org.apache.commons.collections4.iterators.PeekingIterator;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InstructionTestGenerator extends MemberTestGenerator {

    private final boolean isSpecificClass;
    private final Set<String> instructionNames = new HashSet<>();

    private final Map<String, String> testMethodNameForNormalClass = new HashMap<>();
    private int cnt;

    public InstructionTestGenerator(Class<?> clazz, String outputDirectory) {
        super(clazz, outputDirectory);
        isSpecificClass = (InstructionAnalyzer.class.isAssignableFrom(targetClass));
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
        if (!isSpecificClass) {
            if (!testMethodNameForNormalClass.containsKey(headerLine)) {
                cnt++;
                testMethodNameForNormalClass.put(headerLine, "test_" + (cnt));
            }
            return Optional.of(testMethodNameForNormalClass.get(headerLine));
        }
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
                instructionNames.add(instructionName);
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
        Optional<String> methodName = findMethodName(consecutiveLines.get(0));
        if (methodName.isEmpty()) {
            return Collections.emptyList();
        }

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
                realLines.addAll(codeLines);
            } else {
                peekingIterator.next();
            }
        }

        return realLines;
    }

    @Override
    protected List<String> beforeGenerateTestMethod(List<String> realLines) {
        OptionalInt codeStartIndex = IntStream.range(0, realLines.size()).
                filter(index -> realLines.get(index).equals("    Code:")).
                findFirst();
        if (codeStartIndex.isEmpty()) {
            testHolder.visitImportStatement(Test.class);
            return List.of(String.format("    @Test%n"));
        }

        List<String> result = new ArrayList<>();
        Map<Integer, String> appearedInstructions = new TreeMap<>();
        for (int current = codeStartIndex.getAsInt() + 2; current < realLines.size(); current++) {
            String originalLine = realLines.get(current);
            String strippedLine = originalLine.stripLeading();
            int colonIndex = strippedLine.indexOf(':');
            if (colonIndex < 0) {
                break;
            }

            String numberCandidate = strippedLine.substring(0, colonIndex);
            if (isNum(numberCandidate)) {
                String instructionName = findInstructionName(strippedLine);
                if (isVariableLengthInstruction(instructionName)) {
                    // Advance to the end line for tableswitch/lookupswitch instruction
                    while (!realLines.get(current).endsWith("}")) {
                        current++;
                    }
                }
                int order = Instructions.getOrder(instructionName);
                if (isSpecificClass) {
                    Optional<String> methodName = findMethodName(realLines.get(0));
                    if (methodName.isEmpty()) {
                        throw new IllegalArgumentException("Failed to find methods name...");
                    }
                    System.out.printf("Method name is: %s%n", methodName.get());
                    Method[] methods = targetClass.getDeclaredMethods();
                    Method method = Arrays.stream(methods).filter(e -> e.getName().equals(methodName.get())).findAny().orElseThrow();
                    Map<Integer, Instruction> instructionMap = InstructionUtils.analyze(method);
                    Map<Integer, WideDecoratedInstruction> wideDecoratedInstructionMap = WideDecoratedInstructionUtils.analyze(method);

                    if (instructionMap.containsKey(order)) {
                        appearedInstructions.put(order, instructionName);
                    } else if (wideDecoratedInstructionMap.containsKey(order)) {
                        appearedInstructions.put(order, instructionName);
                    }
                } else {
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

    @Override
    protected void postGenerate() {
        if (!InstructionAnalyzer.class.isAssignableFrom(targetClass)) {
            return;
        }

        if (targetClass.isInterface()) {
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
                Number.class,
                Integer.class,
//                Long.class,
//                Float.class,
//                Double.class,
//                Math.class,
//                String.class,
//                Class.class
                Enum.class,
                List.class,
//                ArrayList.class,
//                LinkedList.class,
//                Map.class,
//                HashMap.class,
//                LinkedHashMap.class,
//                TreeMap.class,
//                EnumSet.class
                Stream.class

//                CodeCase.class
        );

        generateTest(classes, "com/test/instruction/standard");
    }

    private static void generateSpecificTest() throws IOException, ReflectiveOperationException {
        ClassLoader generatedClassClassLoader = new GeneratedClassClassLoader();
        Set<Class<?>> classes = Set.of(
                LoadAndStoreInstructionsIntCase.class,
                LoadAndStoreInstructionsLongCase.class,
                LoadAndStoreInstructionsFloatCase.class,
                LoadAndStoreInstructionsDoubleCase.class,
                LoadAndStoreInstructionsObjectCase.class,
                LoadAndStoreInstructionsWideCase.class,
                OperandStackManagementInstructionsCase.class,
                ArithmeticInstructionsCase.class,
                TypeConversionInstructionsCase.class,
                ObjectCreationAndManipulationInstructionsCase.class,

                ControlTransferInstructionsCase.class,
                TableSwitchInstructionCase.class,
                TableSwitchInstructionSpecialCase.class,
                LookupSwitchInstructionCase.class,
                LookupSwitchInstructionSpecialCase.class,
                MethodInvocationAndReturnInstructionsCase.class,
                InvokeInterfaceInstructionCase.class,
                generatedClassClassLoader.loadClass("com.generated.cases.method.instruction.Dup2Case"),
                generatedClassClassLoader.loadClass("com.generated.cases.method.instruction.Dup2X1Case"),
                generatedClassClassLoader.loadClass("com.generated.cases.method.instruction.Dup2X2Case"),
                generatedClassClassLoader.loadClass("com.generated.cases.method.instruction.DupX2Case"),
                generatedClassClassLoader.loadClass("com.generated.cases.method.instruction.SwapCase"),

                ThrowingExceptionsInstructionCase.class,
                SynchronizationInstructionsCase.class

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

        generateStandardTest();
        generateSpecificTest();
    }
}
