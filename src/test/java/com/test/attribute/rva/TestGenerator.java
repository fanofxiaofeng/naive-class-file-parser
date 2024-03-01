package com.test.attribute.rva;

import com.test.attribute.cases.rva.*;
import com.test.field.FieldTestGenerator;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Set;

public class TestGenerator extends FieldTestGenerator {

    private static final String BASE_DIR = "com/test/attribute/rva";

    public TestGenerator(Class<?> clazz, String outputDirectory) throws FileNotFoundException {
        super(clazz, outputDirectory);
    }

    @Override
    protected boolean shouldProcessThisItem(List<String> linesForOneItem) {
        return linesForOneItem.stream().
                anyMatch(line -> line.startsWith("    RuntimeVisibleAnnotations:"));
    }

    private static void generateStandardTest() throws IOException, InterruptedException, ReflectiveOperationException {
        String outputDirectory = BASE_DIR + "/standard";
        Set<Class<?>> classes = Set.of(
                Enum.class,
                String.class,
                Object.class,
                Class.class
        );

        generateTest(classes, outputDirectory);
    }

    private static void generateSpecificTest() throws IOException, InterruptedException, ReflectiveOperationException {
        String outputDirectory = BASE_DIR + "/specific";
        Set<Class<?>> classes = Set.of(
                RuntimeVisibleAnnotationsAttributeCase1.class,
                RuntimeVisibleAnnotationsAttributeCase2.class,
                RuntimeVisibleAnnotationsAttributeCase3.class,
                RuntimeVisibleAnnotationsAttributeCase4.class,
                RuntimeVisibleAnnotationsAttributeCase5.class
        );

        generateTest(classes, outputDirectory);
    }

    private static void generateTest(Set<Class<?>> classes, String outputDirectory) throws IOException, InterruptedException, ReflectiveOperationException {
        for (Class<?> clazz : classes) {
            TestGenerator testGenerator = new TestGenerator(clazz, outputDirectory);
            testGenerator.generate();
            Thread.sleep(300);
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException, ReflectiveOperationException {
//        generateStandardTest();
        generateSpecificTest();
    }
}
