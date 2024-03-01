package com.test.generator;

import com.test.annotations.GeneratedBy;
import com.test.util.GeneratedClassClassLoader;
import org.junit.BeforeClass;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class TestHolder {

    private String packageStatement;

    private final Set<String> toBeImportedClassNames = new TreeSet<>();

    private String beforeHeaderLine;

    private String headerLine;

    private List<String> beforeClassMethod;

    private final List<List<String>> testMethods = new ArrayList<>();
    private final StringBuilder builder = new StringBuilder();

    public void visitPackageStatement(String packageStatement) {
        this.packageStatement = packageStatement;
    }

    public void visitImportStatement(Class<?> clazz) {
        toBeImportedClassNames.add(clazz.getCanonicalName());
    }

    public void visitBeforeHeaderLine(Class<?> clazz) {
        beforeHeaderLine = String.format("@GeneratedBy(%s.class)%n", clazz.getSimpleName());
        visitImportStatement(GeneratedBy.class);
        visitImportStatement(clazz);
    }

    public void visitHeaderLine(String headerLine) {
        this.headerLine = headerLine;
    }

    public void visitBeforeClassMethod(String className) {
        List<String> lines = new ArrayList<>();

        lines.add(String.format("    @%s%n", BeforeClass.class.getSimpleName()));
        lines.add(String.format("    public static void prepare() throws %s, %s {%n",
                IOException.class.getSimpleName(),
                ClassNotFoundException.class.getSimpleName()
        ));
        if (className.startsWith("com.generated.")) {
            visitImportStatement(GeneratedClassClassLoader.class);
            lines.add(String.format("        ClassLoader classLoader = new GeneratedClassClassLoader();%n"));
            lines.add(String.format("        Class<?> clazz = classLoader.loadClass(\"%s\");%n", className));
            lines.add(String.format("        buildRealLines(clazz);%n"));
        } else {
            lines.add(String.format("        buildRealLines(Class.forName(\"%s\"));%n", className));
        }
        lines.add(String.format("    }%n"));

        visitImportStatement(BeforeClass.class);
        visitImportStatement(IOException.class);

        beforeClassMethod = lines;
    }

    private List<String> generateBodyLinesInTestMethod(List<String> rawLines, String variableName) {
        List<String> bodyLines = new ArrayList<>();

        bodyLines.add(String.format("        %s = List.of(%n", variableName));
        visitImportStatement(List.class);

        int size = rawLines.size();
        IntStream.range(0, size).forEach(index -> {
            StringBuilder builder = new StringBuilder();
            builder.append("                ");
            builder.append('"');

            rawLines.get(index).chars().forEach(c -> {
                switch (c) {
                    case '"' -> builder.append("\\\"");
                    case '\'' -> builder.append("'");
                    case '\\' -> builder.append("\\\\");
                    // todo: how to handle '\n'?
                    default -> builder.append((char) c);
                }
            });
            builder.append("\"");
            if (index + 1 < size) {
                builder.append(",");
            }
            builder.append(System.lineSeparator());

            String bodyLine = builder.toString();
            bodyLines.add(bodyLine);
        });

        bodyLines.add(String.format("        );%n"));

        return bodyLines;
    }

    public void visitTestMethod(List<String> linesBeforeHeader, String testMethodHeaderLine, List<String> lines, String variableName) {
        List<String> testMethodLines = new ArrayList<>(linesBeforeHeader);
        testMethodLines.add(testMethodHeaderLine);
        testMethodLines.addAll(generateBodyLinesInTestMethod(lines, variableName));
        testMethodLines.add(String.format("    }%n"));

        testMethods.add(testMethodLines);
    }

    public int visitEnd() {
        return 1;
    }

    public int postGenerate() {
        return 1;
    }

    private int handleImportStatements() {
        int cnt = 0;
        List<String> partOne = toBeImportedClassNames.stream().filter(e -> !e.startsWith("java")).toList();
        List<String> partTwo = toBeImportedClassNames.stream().filter(e -> e.startsWith("java")).toList();

        partOne.forEach(clazzName -> builder.append(String.format("import %s;%n", clazzName)));
        cnt += partOne.size();

        if (!partOne.isEmpty() && !partTwo.isEmpty()) {
            builder.append(System.lineSeparator());
            cnt++;
        }

        partTwo.forEach(clazzName -> builder.append(String.format("import %s;%n", clazzName)));

        cnt += partTwo.size();

        return cnt;
    }

    public void write(PrintStream printStream) {
        builder.append(packageStatement).append(System.lineSeparator());

        handleImportStatements();
        builder.append(System.lineSeparator());
        builder.append(beforeHeaderLine);
        builder.append(headerLine).append(System.lineSeparator());
        beforeClassMethod.forEach(builder::append);

        testMethods.forEach(testMethod -> {
            builder.append(System.lineSeparator());
            testMethod.forEach(builder::append);
        });

        builder.append("}").append(System.lineSeparator());

        printStream.print(builder);
    }
}
