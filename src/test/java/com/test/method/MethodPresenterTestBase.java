package com.test.method;

import com.study.constants.PresentKind;
import com.test.presenter.PresenterTestBase;
import org.junit.After;
import org.junit.Assert;

import java.io.IOException;
import java.util.*;

public class MethodPresenterTestBase extends PresenterTestBase {

    protected static Map<String, List<String>> realLineMap = new LinkedHashMap<>();

    protected List<String> expectedConsecutiveLines;

    protected static void buildRealLines(Class<?> clazz) throws IOException {
        String[] results = getResults(clazz, EnumSet.of(PresentKind.METHODS, PresentKind.CONSTANT_POOL));
        List<String> realLines = Arrays.stream(results).toList();
        int startIndex = 0;
        while (!realLines.get(startIndex).equals("{")) {
            startIndex++;
        }
        int currentIndex = startIndex + 1;
        while (true) {
            String line = realLines.get(currentIndex);
            if (line.equals("}")) {
                return;
            }

            String headerLine = line;
            List<String> linesForOneField = new ArrayList<>();
            linesForOneField.add(headerLine);
            while (true) {
                currentIndex++;
                line = realLines.get(currentIndex);
                if (line.isEmpty()) {
                    currentIndex++;
                    break;
                }
                if (line.equals("}")) {
                    break;
                }
                linesForOneField.add(line);
            }

            realLineMap.put(headerLine, linesForOneField);
        }
    }

    @After
    public void validate() {
        String headerLine = expectedConsecutiveLines.get(0);
        if (!realLineMap.containsKey(headerLine)) {
            System.out.printf("headerLine not found: [%s]%n", headerLine);
            throw new IllegalStateException();
        }

        int leftIndex = 0;
        int rightIndex = 0;
        List<String> rightLines = realLineMap.get(headerLine);
        while (leftIndex < expectedConsecutiveLines.size()) {
            String leftLine = expectedConsecutiveLines.get(leftIndex);

            boolean matchLineFound = false;
            while (rightIndex < rightLines.size()) {
                if (leftLine.equals(rightLines.get(rightIndex))) {
                    matchLineFound = true;
                    break;
                }
                rightIndex++;
            }
            if (!matchLineFound) {
                System.out.println("At least one line inside the following lines can not be found...");
                System.out.println(String.join(System.lineSeparator(), expectedConsecutiveLines));
            }
            String message = String.format("Line not found: [%s]", leftLine);
            Assert.assertTrue(message, matchLineFound);

            leftIndex++;
        }

        System.out.printf("HeaderLine: [%s]%n", expectedConsecutiveLines.get(0));
        System.out.printf("Expected lines found. Count: [%s]%n%n", expectedConsecutiveLines.size());
    }
}
