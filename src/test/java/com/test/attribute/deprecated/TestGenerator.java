package com.test.attribute.deprecated;

import com.test.attribute.cases.DeprecatedCase;
import com.test.field.FieldPresenterTestBase;
import com.test.field.FieldTestGenerator;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class TestGenerator extends FieldTestGenerator {
    public TestGenerator(Class<?> clazz) throws FileNotFoundException {
        super(clazz, "com/test/attribute/deprecated");
    }

    @Override
    protected void printImportStatements() {
        smartPrintImportStatement(FieldPresenterTestBase.class);
        super.printImportStatements();
    }

    @Override
    protected boolean shouldProcessThisItem(List<String> linesForOneItem) {
        return linesForOneItem.stream().anyMatch(line -> line.startsWith("    Deprecated:"));
    }

    public static void main(String[] args) {
        Class<?>[] classes = new Class[]{
                DeprecatedCase.class
        };
        Arrays.stream(classes).forEach(clazz -> {
            try {
                new TestGenerator(clazz).generate();
                Thread.sleep(300);
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
