package com.test.cfa;

import com.study.type.info.attribute.*;
import com.test.annotations.ExpectedPredefinedAttribute;
import com.test.attribute.cases.BootstrapMethodsAttributeCase;
import com.test.attribute.cases.NestMembersAttributeCase;
import com.test.attribute.cases.PermittedSubclassesCase;
import com.test.generator.AbstractTestGenerator;
import com.test.generator.TestGenerator;
import com.test.presenter.ClassFileAttributePresenterTestBase;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClassFileAttributeTestGenerator extends AbstractTestGenerator<List<String>> {

    private final Set<String> acceptedAttributeNames;

    public ClassFileAttributeTestGenerator(Class<?> clazz, String outputDirectory, Set<String> acceptedAttributeNames) {
        super(clazz, outputDirectory);
        this.acceptedAttributeNames = acceptedAttributeNames;
    }

    protected void doGenerateTestMethod(String attributeName, List<String> consecutiveLines) {
        List<String> pre = new ArrayList<>();
        pre.add(String.format("    @ExpectedPredefinedAttribute(%sAttribute.class)%n", attributeName));
        pre.add(String.format("    @%s%n", Test.class.getSimpleName()));

        String testFunctionName = buildTestFunctionNameForOneItem(attributeName);
        String headerLine = String.format("    public void %s() {%n", testFunctionName);

        testHolder.visitTestMethod(pre, headerLine, consecutiveLines, "expectedConsecutiveLines");
    }

    private String buildTestFunctionNameForOneItem(String attributeName) {
        return String.format("test_for_%s_Attribute", attributeName);
    }

    private String findAttributeName(String line) {
        int index = line.indexOf(':');
        return line.substring(0, index);
    }

    @Override
    protected void visitBeforeClassMethod() {
        testHolder.visitBeforeClassMethod(className);
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
    protected List<List<String>> filterContent() throws IOException {
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
                String attributeName = findAttributeName(linesForOneAttribute.get(0));
                try {
                    collectClassForImportStatement(Class.forName(String.format("com.study.type.info.attribute.%sAttribute", attributeName)));
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
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
    protected void visitTestMethods(List<List<String>> filteredLines) {
        for (List<String> linesForOneAttribute : filteredLines) {
            String attributeName = findAttributeName(linesForOneAttribute.get(0));
            if (!acceptedAttributeNames.contains(attributeName)) {
                continue;
            }

            doGenerateTestMethod(attributeName, linesForOneAttribute);
        }
    }

    @Override
    protected void visitHeaderLine() {
        Class<?> parentClass = ClassFileAttributePresenterTestBase.class;
        String headerLine = String.format(
                "public class %sAttributeTest extends %s {%n",
                extractSimpleName(),
                parentClass.getSimpleName()
        );
        testHolder.visitHeaderLine(headerLine);
    }

    @Override
    protected void collectOtherClassesForImportStatements() {
        collectClassForImportStatement(ClassFileAttributePresenterTestBase.class);
        collectClassForImportStatement(ExpectedPredefinedAttribute.class);
    }

    public static void main(String[] args) throws Exception {
        AbstractTestGenerator.overrideExistingFile = false;

        Set<Class<?>> classes = Set.of(
                Boolean.class,
                Character.class,
                Number.class,
                Integer.class,
                Long.class,
                Object.class,
//                Float.class,
//                Double.class,
                Math.class,
                String.class,
                Class.class,
                Enum.class,
                List.class,
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
                Class.forName("java.lang.String$CaseInsensitiveComparator"),

                BootstrapMethodsAttributeCase.class,
                PermittedSubclassesCase.class,
                NestMembersAttributeCase.class
        );
        for (Class<?> clazz : classes) {
            Set<String> acceptedAttributeNames = Stream.of(
                            SourceFileAttribute.class,
                            InnerClassesAttribute.class,
                            EnclosingMethodAttribute.class,
                            BootstrapMethodsAttribute.class,
                            PermittedSubclassesAttribute.class,
                            SignatureAttribute.class,
                            NestHostAttribute.class,
                            NestMembersAttribute.class
                    ).
                    map(Class::getSimpleName).
                    map(e -> StringUtils.removeEnd(e, "Attribute")).
                    collect(Collectors.toSet());

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
