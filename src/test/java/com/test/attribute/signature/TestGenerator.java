package com.test.attribute.signature;

import com.test.attribute.cases.SignatureAttributeCase;
import com.test.field.FieldPresenterTestBase;
import com.test.generator.MemberTestGenerator;
import com.test.field.FieldTestGenerator;

import java.io.IOException;
import java.util.*;

public class TestGenerator extends FieldTestGenerator {
    public TestGenerator(Class<?> clazz, String outputDirectory) {
        super(clazz, outputDirectory);
    }

    @Override
    protected boolean shouldProcessThisItem(List<String> linesForOneItem) {
        return linesForOneItem.stream().
                anyMatch(line -> line.startsWith("    Signature:"));
    }

    @Override
    protected void collectOtherClassesForImportStatements() {
        collectClassForImportStatement(FieldPresenterTestBase.class);
    }

    private static void generateStandardTest() throws IOException, InterruptedException, ReflectiveOperationException {
        String outputDirectory = "com/test/attribute/signature/standard";
        Set<Class<?>> classes = Set.of(
                TreeSet.class,
                HashSet.class
        );

        generateTest(classes, outputDirectory);
    }

    private static void generateSpecificTest() throws IOException, InterruptedException, ReflectiveOperationException {
        String outputDirectory = "com/test/attribute/signature/specific";
        Set<Class<?>> classes = Set.of(
                SignatureAttributeCase.class
        );

        generateTest(classes, outputDirectory);
    }

    private static void generateTest(Set<Class<?>> classes, String outputDirectory) throws IOException, InterruptedException, ReflectiveOperationException {
        for (Class<?> clazz : classes) {
            MemberTestGenerator testGenerator = new TestGenerator(clazz, outputDirectory);
            testGenerator.generate();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException, ReflectiveOperationException {
        generateStandardTest();
        generateSpecificTest();
    }
}
