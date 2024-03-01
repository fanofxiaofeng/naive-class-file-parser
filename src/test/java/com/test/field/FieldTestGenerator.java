package com.test.field;

import com.study.constants.ClassAccessFlags;
import com.study.type.info.attribute.*;
import com.test.annotations.ExpectedPredefinedAttribute;
import com.test.attribute.cases.DeprecatedCase;
import com.test.cases.FieldCase;
import com.test.generator.AbstractTestGenerator;
import com.test.generator.MemberTestGenerator;
import com.test.generator.TestGeneratorContainer;
import com.test.presenter.C22;
import com.test.util.GeneratedClassClassLoader;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;

public class FieldTestGenerator extends MemberTestGenerator {

    private final Set<String> skippedNames = Set.of("descriptor", "flags");

    public FieldTestGenerator(Class<?> clazz, String outputDirectory) {
        super(clazz, outputDirectory);
    }

    @Override
    protected void visitHeaderLine() {
        Class<?> parentClass = FieldPresenterTestBase.class;
        String headerLine = String.format(
                "public class %sFieldsTest extends %s {%n",
                extractSimpleName(),
                parentClass.getSimpleName()
        );
        testHolder.visitImportStatement(parentClass);
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
    protected String buildTestFunctionNameForOneItem(List<String> linesForOneItem) {
        String firstLine = linesForOneItem.get(0);
        firstLine = StringUtils.removeEnd(firstLine, ";");
        String[] components = firstLine.split(" +");
        return "test_for_field_" + components[components.length - 1];
    }

    @Override
    protected void collectOtherClassesForImportStatements() {
        collectClassForImportStatement(FieldPresenterTestBase.class);
        super.collectOtherClassesForImportStatements();
    }

    private Map<String, Integer> parseAttributeNames(List<String> consecutiveLines) {
        Map<String, Integer> attributeNames = new TreeMap<>();
        for (String line : consecutiveLines) {
            boolean attributeHeaderLine =
                    StringUtils.startsWith(line, FOUR_SPACES) &&
                            !StringUtils.startsWith(line, FIVE_SPACES);
            if (!attributeHeaderLine) {
                continue;
            }

            int colonIndex = line.indexOf(":");
            String attributeName = line.substring(0, colonIndex).stripLeading();
            if (skippedNames.contains(attributeName)) {
                continue;
            }
            int previousCount = attributeNames.getOrDefault(attributeName, 0);
            attributeNames.put(attributeName, previousCount + 1);
        }
        return attributeNames;
    }

    private Class<? extends AttributeInfo> toAttribute(String attributeName) {
        return switch (attributeName) {
            case "Synthetic" -> SyntheticAttribute.class;
            case "ConstantValue" -> ConstantValueAttribute.class;
            case "Deprecated" -> DeprecatedAttribute.class;
            case "Signature" -> SignatureAttribute.class;
            case "RuntimeVisibleAnnotations" -> RuntimeVisibleAnnotationsAttribute.class;
            default -> null;
        };
    }

    @Override
    protected List<String> beforeGenerateTestMethod(List<String> realLines) {
        Map<String, Integer> attributeNames = parseAttributeNames(realLines);

        if (attributeNames.isEmpty()) {
            return List.of(String.format("    @%s%n", Test.class.getSimpleName()));
        }

        testHolder.visitImportStatement(ExpectedPredefinedAttribute.class);
        List<String> lines = new ArrayList<>();
        attributeNames.forEach((key, value) -> {
            Class<?> attributeClass = toAttribute(key);
            testHolder.visitImportStatement(attributeClass);
            lines.add(String.format("    @ExpectedPredefinedAttribute(%s.class)%n", attributeClass.getSimpleName()));
        });
        lines.add(String.format("    @%s%n", Test.class.getSimpleName()));

        return lines;
    }

    private static void generateStandardTest() throws IOException, ReflectiveOperationException {
        Set<Class<?>> classes = Set.of(
                Boolean.class,
                Byte.class,
                Short.class,
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

    private static void generateSpecificTest() throws IOException, ReflectiveOperationException {
        Set<Class<?>> classes = Set.of(
                ClassAccessFlags.class,
                C22.class,
                FieldCase.class,
                DeprecatedCase.class
        );

        generateTest(classes, "com/test/field/specific");
    }

    private static void generateAsmBasedTest() throws ReflectiveOperationException, IOException {
        ClassLoader classLoader = new GeneratedClassClassLoader();
        Class<?> clazz = classLoader.loadClass("com.generated.attribute.synthetic.Generated");
        generateTest(Set.of(clazz), "com/test/field/asm");
    }

    private static void generateTest(Set<Class<?>> classes, String outputDirectory) throws IOException, ReflectiveOperationException {
        TestGeneratorContainer testGeneratorContainer = new TestGeneratorContainer();
        testGeneratorContainer.process(classes, outputDirectory, FieldTestGenerator::new);
    }

    public static void main(String[] args) throws Exception {
        AbstractTestGenerator.overrideExistingFile = false;

        generateStandardTest();
        generateSpecificTest();
        generateAsmBasedTest();
    }
}