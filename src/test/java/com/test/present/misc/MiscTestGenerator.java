package com.test.present.misc;

import com.study.constants.PresentKind;
import com.test.generator.TestGenerator;
import com.test.generator.UniqueLineTestGenerator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Generate test cases for the following items
 * 1. {@link PresentKind#HEADER}
 * 2. {@link PresentKind#VERSION}
 * 3. {@link PresentKind#ACCESS_FLAGS}
 * 4. {@link PresentKind#THIS_CLASS}
 * 5. {@link PresentKind#SUPER_CLASS}
 * 6. {@link PresentKind#COUNT}
 * <p>
 * You can refer to {@link MiscPresenterTestBase} for more details.
 */
public class MiscTestGenerator extends UniqueLineTestGenerator {

    public MiscTestGenerator(Class<?> clazz, String outputDirectory) {
        super(clazz, outputDirectory);
    }


    @Override
    protected String buildOutputFileName() {
        return String.format("src/test/java/%s/%sMiscTest.java", outputDirectory, extractSimpleName());
    }

    @Override
    protected int findStartIndex(List<String> lines) {
        // line 0~3 look like this, we can ignore them
        // Classfile jrt:/java.base/java/lang/Object.class
        //   Last modified 2023年10月5日; size 2487 bytes
        //   SHA-256 checksum 10cc90d1....
        //   Compiled from "Object.java"
        return 4;
    }

    @Override
    protected boolean shouldStop(String line) {
        // When we see constant pool items, we can break
        return line.equals("Constant pool:");
    }

    @Override
    protected void printHeaderLine() {
        printStream.printf(
                "public class %sMiscTest extends %s {%n",
                extractSimpleName(),
                MiscPresenterTestBase.class.getSimpleName()
        );
    }

    @Override
    protected boolean shouldProcessThisItem(String line) {
        if (!Character.isWhitespace(line.codePointAt(0))) {
            // this is the header line
            return true;
        }

        String strippedLine = line.stripLeading();
        return strippedLine.startsWith("minor version:") ||
                strippedLine.startsWith("major version:") ||
                strippedLine.startsWith("flags:") ||
                strippedLine.startsWith("this_class:") ||
                strippedLine.startsWith("super_class:") ||
                strippedLine.startsWith("interfaces:");
    }

    @Override
    protected void printImportStatements() {
        smartPrintImportStatement(MiscPresenterTestBase.class);
        super.printImportStatements();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Set<Class<?>> classSet = Set.of(
//                Object.class,
//                Class.class,
//                Enum.class,
//                Record.class,
//                java.lang.annotation.Annotation.class,
//                List.class,
//                ArrayList.class,
//                Override.class,
//                Function.class,
//                Stream.class,
//                Number.class,
//                Integer.class,
//
                com.test.cases.misc.Case1.C1.class,
                com.test.cases.misc.Case1.C2.class,
                com.test.cases.misc.Case1.C3.class,
                com.test.cases.misc.Case1.C4.class,

                Class.forName("com.test.cases.misc.ClassFlags1"),
                Class.forName("com.test.cases.misc.ClassFlags1$ClassFlags2"),
                Class.forName("com.test.cases.misc.ClassFlags1$ClassFlags3"),
                Class.forName("com.test.cases.misc.ClassFlags1$ClassFlags4"),
                Class.forName("com.test.cases.misc.ClassFlags1$ClassFlags5"),
                Class.forName("com.test.cases.misc.ClassFlags1$ClassFlags6"),
                Class.forName("com.test.cases.misc.ClassFlags1$ClassFlags7"),
                Class.forName("com.test.cases.misc.ClassFlags1$ClassFlags8"),
                Class.forName("com.test.cases.misc.ClassFlags1$ClassFlags9")
        );
        for (Class<?> clazz : classSet) {
            String outputDirectory = buildOutputDirectory(clazz);
            TestGenerator testGenerator = new MiscTestGenerator(clazz, outputDirectory);
            testGenerator.generate();
        }
    }

    private static String buildOutputDirectory(Class<?> clazz) {
        if (clazz.getName().startsWith("java.")) {
            return "com/test/present/misc/standard";
        }
        return "com/test/present/misc/specific";
    }
}