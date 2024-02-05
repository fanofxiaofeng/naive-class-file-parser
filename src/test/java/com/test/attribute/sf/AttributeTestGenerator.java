package com.test.attribute.sf;

import com.test.cfa.ClassFileAttributeTestGenerator;
import com.test.present.ClassFileAttributePresenterTestBase;
import org.junit.BeforeClass;

import java.io.IOException;
import java.util.List;
import java.util.Set;

public class AttributeTestGenerator extends ClassFileAttributeTestGenerator {

    private static final String ATTRIBUTE_NAME = "SourceFile";

    public AttributeTestGenerator(Class<?> clazz) {
        super(clazz, "com/test/attribute/sf/standard", Set.of(ATTRIBUTE_NAME));
    }


    @Override
    protected void printImportStatements() {
        smartPrintImportStatement(ClassFileAttributePresenterTestBase.class);
        smartPrintImportStatement(BeforeClass.class);
        super.printImportStatements();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Set<Class<?>> classes = Set.of(
                Object.class,
                Boolean.class,
//                Short.class,
//                Byte.class,
//                Character.class,
                Integer.class,
//                Long.class,
//                Float.class,
//                Double.class,
//                String.class,
                Math.class,
                List.class
        );

//        AttributeTestGenerator.overrideExistingFile = false;
        for (Class<?> clazz : classes) {
            new AttributeTestGenerator(clazz).generate();
            Thread.sleep(500);
        }
    }
}
