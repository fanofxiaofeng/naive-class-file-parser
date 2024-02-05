package com.test.generator;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class AbstractTestGenerator<T> implements TestGenerator {

    protected final Class<?> targetClass;

    protected final String canonicalName;

    protected final String className;

    protected final String outputDirectory;

    protected PrintStream printStream;

    protected Set<Class<?>> alreadyPrinted = new HashSet<>();

    public static boolean overrideExistingFile = true;

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
    public void generate() throws IOException {
        List<T> filteredLines = hasSomeContent();
        if (filteredLines.isEmpty()) {
            System.out.printf("No test was generated for [%s]%n", canonicalName);
            return;
        }
        String outputFileName = buildOutputFileName();
        File file = new File(outputFileName);
        if (file.exists() && !overrideExistingFile) {
            System.out.printf("%s already exist, nothing will be done", outputFileName);
            return;
//            System.out.printf("%s already exist, stdout will be used instead!%n", outputFileName);
//            printStream = System.out;
        } else {
            printStream = new PrintStream(outputFileName);
        }

        printPackageStatement();
        printImportStatements();
        printHeaderLine();
        printBeforeMethod();

        generateTestMethod(filteredLines);

        printEnd();
    }

    protected abstract void generateTestMethod(List<T> filteredLines);

    protected abstract void printBeforeMethod();

    protected abstract void printHeaderLine();

    protected void printImportStatements() {
        smartPrintImportStatement(Test.class);
        printStream.println();
        smartPrintImportStatement(java.io.IOException.class);
//        if (!(className.startsWith("java.lang.") && count(className, '.') == 2)) {
//            smartPrintImportStatement(targetClass);
//        }
        smartPrintImportStatement(java.util.List.class);
        printStream.println();
    }

    protected String extractSimpleName() {
//        if (canonicalName == null) {
        int index = className.lastIndexOf(".");
//            return className.substring(index + 1).replace("$", "_");
        return className.substring(index + 1);
//        }
//        return targetClass.getSimpleName();
    }

    private long count(String s, char a) {
        return s.chars().filter(e -> e == a).count();
    }

    protected void smartPrintImportStatement(Class<?> clazz) {
        if (alreadyPrinted.contains(clazz)) {
            return;
        }

        if (clazz.getCanonicalName() != null) {
            printStream.printf("import %s;%n", clazz.getCanonicalName());
        }

        alreadyPrinted.add(clazz);
    }

    protected void printPackageStatement() {
        printStream.printf("package %s;%n", outputDirectory.replace('/', '.'));
        printStream.println();
    }

    protected abstract String buildOutputFileName();

    protected abstract List<T> hasSomeContent() throws IOException;

    protected List<String> readLines() throws IOException {
//        String[] cmdArray = new String[]{"javap", "-v", "-p", canonicalName};
//        if (!canonicalName.startsWith("java.")) {
//            cmdArray[3] = "target.test-classes." + canonicalName;
//        }
        String className = targetClass.getName();
        String[] cmdArray = new String[]{"javap", "-v", "-p", className};
        if (!className.startsWith("java.")) {
            if (className.startsWith("com.study")) {
                cmdArray[3] = "target.classes." + className;
            } else if (className.startsWith("com.test")) {
                cmdArray[3] = "target.test-classes." + className;
            } else {
                String message = String.format("Unsupported class: %s", className);
                throw new IllegalArgumentException(message);
            }
        }

        String message = String.format("The command to be executed is: [%s]", String.join(" ", cmdArray));
        System.out.println(message);

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


    protected void printEnd() {
        printStream.println("}");
    }
}
