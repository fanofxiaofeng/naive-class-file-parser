package com.test.cfa;

import com.test.attribute.cases.BootstrapMethodsAttributeCase;
import com.test.attribute.cases.PermittedSubclassesCase;
import com.test.generator.AbstractTestGenerator;
import com.test.generator.TestGenerator;
import com.test.present.ClassFileAttributePresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;

public class ClassFileAttributeTestGenerator extends AbstractTestGenerator<List<String>> {

    private final Set<String> acceptedAttributeNames;

    public ClassFileAttributeTestGenerator(Class<?> clazz, String outputDirectory, Set<String> acceptedAttributeNames) {
        super(clazz, outputDirectory);
        this.acceptedAttributeNames = acceptedAttributeNames;
    }

    @Override
    protected void generateTestMethod(List<List<String>> filteredLines) {
        for (List<String> linesForOneAttribute : filteredLines) {
            String attributeName = findAttributeName(linesForOneAttribute.get(0));
            if (!acceptedAttributeNames.contains(attributeName)) {
                continue;
            }

            doGenerateTestMethod(attributeName, linesForOneAttribute);
        }
    }

    protected void doGenerateTestMethod(String attributeName, List<String> consecutiveLines) {
        printStream.printf("    @%s%n", Test.class.getSimpleName());
        String testFunctionName = buildTestFunctionNameForOneItem(attributeName);
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

    private String buildTestFunctionNameForOneItem(String attributeName) {
        return String.format("test_for_%s_Attribute", attributeName);
    }

    private String findAttributeName(String line) {
        int index = line.indexOf(':');
        return line.substring(0, index);
    }

    @Override
    protected void printBeforeMethod() {
        boolean special = targetClass.getCanonicalName() == null;

        printStream.println();
        printStream.printf("    @%s%n", BeforeClass.class.getSimpleName());
        if (special) {
            printStream.printf("    public static void prepare() throws %s, %s {%n",
                    IOException.class.getSimpleName(),
                    ClassNotFoundException.class.getSimpleName()
            );
            printStream.printf("        buildRealLines(Class.forName(\"%s\"));%n", className);
        } else {
            printStream.printf("    public static void prepare() throws %s {%n",
                    IOException.class.getSimpleName()
            );
            printStream.printf("        buildRealLines(%s.class);%n", extractSimpleName());
        }
        printStream.printf("    }%n");
        printStream.println();
    }

    protected int findStartIndex(List<String> lines) {
        int size = lines.size();

        for (int i = 0; i < size; i++) {
            String line = lines.get(i);

            if (line.equals("}")) {
                return i + 1;
            }
        }

        throw new IllegalArgumentException();
    }

    private boolean shouldProcess(List<String> linesForOneAttribute) {
        String attributeName = findAttributeName(linesForOneAttribute.get(0));
        return acceptedAttributeNames.contains(attributeName);
    }

    @Override
    protected List<List<String>> hasSomeContent() throws IOException {
        List<String> lines = readLines();

        int startIndex = findStartIndex(lines);

        int size = lines.size();
        if (startIndex >= size) {
            return Collections.emptyList();
        }

        List<List<String>> attributes = new ArrayList<>();
        int index = startIndex;

        while (index < size) {
            int start = index;
            int end = start + 1;
            while (end < size && !startOfOneAttribute(lines.get(end))) {
                end++;
            }

            List<String> linesForOneAttribute = lines.subList(start, end);
            if (shouldProcess(linesForOneAttribute)) {
                attributes.add(linesForOneAttribute);
            }

            index = end;
        }

        return attributes;
    }


    protected boolean startOfOneAttribute(String line) {
        return !line.isEmpty() && !Character.isWhitespace(line.codePointAt(0));
    }

    @Override
    protected String buildOutputFileName() {
        return String.format("src/test/java/%s/%sAttributeTest.java", outputDirectory, extractSimpleName());
    }

    @Override
    protected void printHeaderLine() {
        printStream.printf(
                "public class %sAttributeTest extends %s {%n",
                extractSimpleName(),
                ClassFileAttributePresenterTestBase.class.getSimpleName()
        );
    }


    @Override
    protected void printImportStatements() {
        smartPrintImportStatement(ClassFileAttributePresenterTestBase.class);
        smartPrintImportStatement(BeforeClass.class);
        super.printImportStatements();
    }

    public static void main(String[] args) throws Exception {
        Set<Class<?>> classes = Set.of(
//                Character.class,
//                Number.class,
//                Integer.class,
//                Long.class,
//                Float.class,
//                Double.class,
//                Math.class,
//                String.class,
//                Class.class,
//                Enum.class,
//                List.class,
                ArrayList.class,
//                LinkedList.class,
//                Map.class,
//                HashMap.class,
//                LinkedHashMap.class,
//                TreeMap.class,

                Class.forName("com.test.attribute.cases.EnclosingMethodAttributeCase$1"),
                Class.forName("com.test.attribute.cases.EnclosingMethodAttributeCase$1C"),
                Class.forName("com.test.attribute.cases.EnclosingMethodAttributeCase$2C"),
                Class.forName("com.test.attribute.cases.EnclosingMethodAttributeCase$3C"),

                BootstrapMethodsAttributeCase.class,
                PermittedSubclassesCase.class
        );
        for (Class<?> clazz : classes) {
            Set<String> acceptedAttributeNames =
                    Set.of(
                            "SourceFile",
                            "InnerClasses",
                            "EnclosingMethod",
                            "BootstrapMethods",
                            "PermittedSubclasses",
                            "Signature"
                    );

            String outputDirectory =
                    (!clazz.getName().startsWith("java.")) ?
                            "com/test/cfa/specific" :
                            "com/test/cfa/standard";

            TestGenerator testGenerator =
                    new ClassFileAttributeTestGenerator(clazz,
                            outputDirectory,
                            acceptedAttributeNames
                    );

            testGenerator.generate();
        }
    }
}
