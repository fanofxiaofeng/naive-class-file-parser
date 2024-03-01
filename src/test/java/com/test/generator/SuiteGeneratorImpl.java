package com.test.generator;

import com.test.annotations.GeneratedBy;
import org.apache.commons.lang3.StringUtils;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

public class SuiteGeneratorImpl implements SuiteGenerator {

    private final String pathname;
    private final boolean useAutomaticOutputFileName;

    private static final Logger logger = LoggerFactory.getLogger(SuiteGeneratorImpl.class);

    protected SuiteGeneratorImpl(String pathname, boolean useAutomaticOutputFileName) {
        this.pathname = StringUtils.removeEnd(pathname, "/");
        this.useAutomaticOutputFileName = useAutomaticOutputFileName;
    }

    protected SuiteGeneratorImpl(String pathname) {
        this(pathname, true);
    }

    private String getOutputClassName() {
        if (useAutomaticOutputFileName) {
            int lastIndex = pathname.lastIndexOf("/");
            return StringUtils.capitalize(pathname.substring(lastIndex + 1)) + "TestSuite";
        }

        Scanner scanner = new Scanner(System.in);
        String expectedSuffix = "TestSuite";
        System.out.printf("Please input class name for this suite: (it should be something like xxx%s)%n", expectedSuffix);
        String name = scanner.next();

        while (!name.endsWith(expectedSuffix)) {
            System.out.printf("Class name should end with \"%s\", please try again...%n", expectedSuffix);
            name = scanner.next();
        }
        return name;
    }

    @Override
    public String generate() throws FileNotFoundException {
        File specifiedDirectory = new File(pathname);
        if (!specifiedDirectory.exists()) {
            logger.error("Path: {} does not exist, please check!", pathname);
            throw new IllegalArgumentException();
        }
        if (!specifiedDirectory.isDirectory()) {
            logger.error("{} is not a directory, please check!", pathname);
            throw new IllegalArgumentException();
        }

        File[] files = specifiedDirectory.listFiles();
        assert files != null;
        List<File> testFilesInSpecifiedDirectory = Arrays.stream(files).filter(File::isFile).filter(e -> e.getName().endsWith("Test.java")).sorted().toList();
        List<File> subDirectories = Arrays.stream(files).filter(File::isDirectory).toList();
        List<String> strings = new ArrayList<>(subDirectories.size());
        for (File subDirectory : subDirectories) {
            String suiteNameInSubDirectory = new SuiteGeneratorImpl(String.format("%s/%s", pathname, subDirectory.getName())).generate();
            logger.info("suiteNameInSubDirectory: {}", suiteNameInSubDirectory);
            strings.add(suiteNameInSubDirectory);
        }
//        for (File f : filesInSpecifiedDirectory) {
//            if (f.getName().endsWith("TestSuite.java")) {
//                System.out.println("Suite already exist...");
//                return;
//            }
//        }

        Set<Class<?>> classesToBeImported = new HashSet<>();
        classesToBeImported.add(RunWith.class);
        classesToBeImported.add(Suite.class);
        classesToBeImported.add(GeneratedBy.class);
        classesToBeImported.add(this.getClass());
//        filesInSpecifiedDirectory.forEach(e -> {
//            classNames.add(b + StringUtils.removeEnd(e.getName(), ".java"));
//        });

        StringBuilder builder = new StringBuilder();
        builder.append(String.format("package %s;%n", StringUtils.removeStart(pathname, "src/test/java/").replace('/', '.')));
        builder.append(System.lineSeparator());
        classesToBeImported.forEach(clazz -> builder.append(String.format("import %s;%n", clazz.getCanonicalName())));
        strings.forEach(s -> {
            String className = StringUtils.removeStart(StringUtils.removeEnd(s, ".java"), "src/test/java/").replace('/', '.');
            builder.append(String.format("import %s;%n", className));
        });
        builder.append(System.lineSeparator());
        builder.append(String.format("@GeneratedBy(%s.class)%n", SuiteGeneratorImpl.class.getSimpleName()));

        builder.append(String.format("@Suite.SuiteClasses({%n"));
        testFilesInSpecifiedDirectory.
                forEach(e -> builder.append(String.format("        %s.class,%n", StringUtils.removeEnd(e.getName(), ".java"))));
        strings.forEach(e -> {
            int index = e.lastIndexOf('/');
            builder.append(String.format("        %s.class,%n", StringUtils.removeEnd(e.substring(index + 1), ".java")));
        });
        builder.append(String.format("})%n"));
        builder.append(String.format("@RunWith(Suite.class)%n"));

        String outputClassName = getOutputClassName();
        builder.append(String.format("public class %s {%n", outputClassName));
        builder.append(String.format("}%n"));
        System.out.println(builder);
        String outputFileName = String.format("%s/%s.java", pathname, outputClassName);
        try (PrintStream printStream = new PrintStream(outputFileName)) {
            printStream.print(builder);
        }
        return outputFileName;
    }

    public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException {
        new SuiteGeneratorImpl("src/test/java/com/test/instruction/specific", true).generate();
//        new SuiteGeneratorImpl("src/test/java/com/test/cfa", true).generate();
    }
}
