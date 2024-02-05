package com.test.attribute.em;

import com.test.cfa.ClassFileAttributeTestGenerator;
import com.test.present.ClassFileAttributePresenterTestBase;
import org.junit.BeforeClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class AttributeTestGenerator extends ClassFileAttributeTestGenerator {

    private static final String ATTRIBUTE_NAME = "EnclosingMethod";

    public AttributeTestGenerator(Class<?> clazz, String dirName) {
        super(clazz, String.format("com/test/attribute/em/%s", dirName), Set.of(ATTRIBUTE_NAME));
    }

    @Override
    protected void printImportStatements() {
        smartPrintImportStatement(ClassFileAttributePresenterTestBase.class);
        smartPrintImportStatement(BeforeClass.class);
        super.printImportStatements();
    }

    private static void generateSpecificTest() throws IOException, InterruptedException, ClassNotFoundException {
        generateTest(Set.of(
                Class.forName("com.test.attribute.cases.EnclosingMethodAttributeCase$1")
        ), "specific");
    }

    private static void generateStandardTest() throws IOException, InterruptedException {
        Set<Class<?>> classes = Set.of(
                Boolean.class,
//                Short.class,
//                Byte.class,
//                Character.class,
                Integer.class,
//                Long.class,
//                Float.class,
//                Double.class,
                Class.class,
                String.class,
                Math.class,
                List.class,
                ArrayList.class,
                HashMap.class
        );

//        AttributeTestGenerator.overrideExistingFile = false;
        generateTest(classes, "standard");
    }

    private static void generateTest(Set<Class<?>> classes, String dirName) throws IOException, InterruptedException {
        for (Class<?> clazz : classes) {
            new AttributeTestGenerator(clazz, dirName).generate();
            Thread.sleep(500);
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {
//        generateStandardTest();
        generateSpecificTest();
    }
}
