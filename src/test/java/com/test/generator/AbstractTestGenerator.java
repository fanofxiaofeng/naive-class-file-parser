package com.test.generator;

import com.study.util.ClassNameUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public abstract class AbstractTestGenerator<T> implements TestGenerator {

    protected final Class<?> targetClass;

    protected final String canonicalName;

    protected final String className;

    protected final String outputDirectory;

    protected final TestHolder testHolder = new TestHolder();

    public static boolean overrideExistingFile = true;

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    public AbstractTestGenerator(Class<?> clazz, Package p) {
        this.targetClass = clazz;
        this.canonicalName = clazz.getCanonicalName();
        this.className = clazz.getName();
        this.outputDirectory = p.getName().replace('.', '/');
    }

    public AbstractTestGenerator(Class<?> clazz, String outputDirectory) {
        this.targetClass = clazz;
        this.canonicalName = clazz.getCanonicalName();
        this.className = clazz.getName();
        this.outputDirectory = StringUtils.removeEnd(outputDirectory, "/");
    }

    @Override
    public void generate() throws IOException, ReflectiveOperationException {
        String outputFileName = buildOutputFileName();
        File file = new File(outputFileName);
        if (file.exists() && !overrideExistingFile) {
            logger.info("{} already exist, nothing will be done", outputFileName);
            return;
        }

        List<T> filteredContent = filterContent();
        if (filteredContent.isEmpty()) {
            logger.info("No test was generated for [{}]", canonicalName);
            return;
        }

        prepare();
        visitPackageStatement();

        visitImportStatements();

        testHolder.visitBeforeHeaderLine(this.getClass());
        visitHeaderLine();
        visitBeforeClassMethod();

        visitTestMethods(filteredContent);

        testHolder.visitEnd();

        postGenerate();

        PrintStream printStream = new PrintStream(outputFileName);
        testHolder.write(printStream);
    }

    protected void prepare() throws ReflectiveOperationException {

    }

    protected void postGenerate() {

    }

    protected abstract void visitTestMethods(List<T> filteredLines) throws NoSuchMethodException;

    protected abstract void visitBeforeClassMethod();

    protected abstract void visitHeaderLine();

    protected void visitImportStatements() {
        collectCommonClassesForImportStatements();
        collectOtherClassesForImportStatements();
    }

    protected void collectOtherClassesForImportStatements() {
    }

    private void collectCommonClassesForImportStatements() {
        testHolder.visitImportStatement(Test.class);
    }

    protected String extractSimpleName() {
        int index = className.lastIndexOf(".");
        return className.substring(index + 1);
    }

    protected void collectClassForImportStatement(Class<?>... classes) {
        for (Class<?> clazz : classes) {
            testHolder.visitImportStatement(clazz);
        }
    }

    protected void visitPackageStatement() {
        String packageStatement = String.format("package %s;%n", ClassNameUtils.slashToDot(outputDirectory));
        testHolder.visitPackageStatement(packageStatement);
    }

    protected abstract String buildOutputFileName();

    protected abstract List<T> filterContent() throws IOException;

    protected List<String> readLines() throws IOException {
        String className = targetClass.getName();
        String[] cmdArray = new String[]{"javap", "-v", "-p", className};
        if (!className.startsWith("java.")) {
            if (className.startsWith("com.study")) {
                cmdArray[3] = "target.classes." + className;
            } else if (className.startsWith("com.test")) {
                cmdArray[3] = "target.test-classes." + className;
            } else if (className.startsWith("kotlin.")) {
                cmdArray = new String[]{"javap", "-v", "-p", "--class-path", System.getProperty("java.class.path"), className};
            } else if (className.startsWith("com.generated.")) {
                cmdArray = new String[]{"javap", "-v", "-p", "--class-path", "src/test/resources", className};
            } else {
                String message = String.format("Unsupported class: %s", className);
                throw new IllegalArgumentException(message);
            }
        }

        logger.info("The command to be executed is: [{}]", String.join(" ", cmdArray));

        Process process = Runtime.getRuntime().exec(cmdArray);

        BufferedReader stdInput = new BufferedReader(new
                InputStreamReader(process.getInputStream()));

        List<String> lines = new ArrayList<>();
        String line;
        while ((line = stdInput.readLine()) != null) {
            lines.add(line);
        }

        return lines;
    }
}
