package com.test.attribute.cv;

import com.test.field.FieldPresenterTestBase;
import com.test.field.FieldTestGenerator;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Set;

public class TestGenerator extends FieldTestGenerator {
    public TestGenerator(Class<?> clazz) throws FileNotFoundException {
        super(clazz, "com/test/attribute/cv/standard");
    }

    @Override
    protected void printImportStatements() {
        smartPrintImportStatement(FieldPresenterTestBase.class);
        super.printImportStatements();
    }

    @Override
    protected boolean shouldProcessThisItem(List<String> linesForOneItem) {
        return linesForOneItem.stream().anyMatch(line -> line.startsWith("    ConstantValue:"));
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Set<Class<?>> classes = Set.of(
                Boolean.class,
                Short.class,
                Byte.class,
                Character.class,
                Integer.class,
                Long.class,
                Float.class,
                Double.class,
                String.class,
                Math.class
        );

//        AttributeTestGenerator.overrideExistingFile = false;
        for (Class<?> clazz : classes) {
            new TestGenerator(clazz).generate();
            Thread.sleep(500);
        }
    }
}
