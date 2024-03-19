package com.test.generator;

import com.test.util.GeneratedClassClassLoader;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class MemberTestGenerator extends AbstractTestGenerator<List<String>> {

    protected static final String FOUR_SPACES = StringUtils.repeat(' ', 4);
    protected static final String FIVE_SPACES = StringUtils.repeat(' ', 5);

    public MemberTestGenerator(Class<?> clazz, String outputDirectory) {
        super(clazz, outputDirectory);
    }

    protected abstract boolean shouldStop(String line);

    protected abstract int startIndex(List<String> lines);

    protected abstract boolean startOfOneItem(String line);

    protected abstract boolean endOfOneItem(String line);

    protected List<List<String>> filterContent() throws IOException {
        List<String> lines = readLines();
        List<List<String>> result = new ArrayList<>();
        for (int index = startIndex(lines); index < lines.size(); index++) {
            String line = lines.get(index);

            if (shouldStop(line)) {
                break;
            }

            if (startOfOneItem(line)) {
                List<String> consecutiveLines = new ArrayList<>();
                while (!endOfOneItem(line)) {
                    consecutiveLines.add(line);
                    if (index + 1 < lines.size()) {
                        index++;
                        line = lines.get(index);
                    } else {
                        break;
                    }
                }

                if (shouldProcessThisItem(consecutiveLines)) {
                    result.add(consecutiveLines);
                }
            }
        }

        return result;
    }

    protected void beforeAdd(List<String> consecutiveLines) {
    }

    protected boolean isVariableLengthInstruction(String instructionName) {
        return instructionName.equals("tableswitch") ||
                instructionName.equals("lookupswitch");
    }

    protected String findInstructionName(String strippedLine) {
        return strippedLine.split(" +")[1];
    }

    protected boolean isNum(String numberCandidate) {
        return numberCandidate.codePoints().allMatch(c -> c >= '0' && c <= '9');
    }

    @Override
    protected void visitBeforeClassMethod() {
        testHolder.visitBeforeClassMethod(className);
    }

    @Override
    protected void collectOtherClassesForImportStatements() {
        if (className.startsWith("com.generated.")) {
            collectClassForImportStatement(GeneratedClassClassLoader.class);
        }
    }

    protected boolean shouldProcessThisItem(List<String> linesForOneItem) {
        return true;
    }

    protected abstract String buildTestFunctionNameForOneItem(List<String> linesForOneItem);

    @Override
    protected void visitTestMethods(List<List<String>> filteredLines) throws NoSuchMethodException {
        for (List<String> consecutiveLines : filteredLines) {
            List<String> realLines = filter(consecutiveLines);
            if (!realLines.isEmpty()) {
                doGenerateTestMethod(realLines);
            }
        }
    }

    protected List<String> beforeGenerateTestMethod(List<String> realLines) throws NoSuchMethodException {
        return List.of(String.format("    @%s%n", Test.class.getSimpleName()));
    }

    protected List<String> filter(List<String> consecutiveLines) {
        return consecutiveLines;
    }

    private void doGenerateTestMethod(List<String> consecutiveLines) throws NoSuchMethodException {
        List<String> linesBeforeHeader = beforeGenerateTestMethod(consecutiveLines);
        String testFunctionName = buildTestFunctionNameForOneItem(consecutiveLines);
        String headerLine = String.format("    public void %s() {%n", testFunctionName);

        testHolder.visitTestMethod(linesBeforeHeader, headerLine, consecutiveLines, "expectedConsecutiveLines");
    }
}