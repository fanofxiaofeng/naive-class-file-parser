package com.test.field;

import com.study.constants.PresentKind;
import com.test.presenter.PresenterTestBase;
import org.apache.commons.lang3.StringUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class FieldPresenterTestBase extends PresenterTestBase {

    protected static Map<String, List<String>> realLineMap = new LinkedHashMap<>();

    protected List<String> expectedConsecutiveLines;

    private static final String FOUR_SPACES = StringUtils.repeat(' ', 4);
    private static final String FIVE_SPACES = StringUtils.repeat(' ', 5);

    private final Set<String> skippedNames = Set.of("descriptor", "flags");

    private static final Map<String, Integer> DETECTED_ATTRIBUTE_NAMES = new TreeMap<>();
    protected static final Logger logger = LoggerFactory.getLogger(FieldPresenterTestBase.class);

    protected static void buildRealLines(Class<?> clazz) throws IOException {
        String[] results = (clazz.getCanonicalName().startsWith("com.generated.")) ?
                getResults(new FileInputStream("src/test/resources/" + clazz.getCanonicalName().replace('.', '/') + ".class"), EnumSet.of(PresentKind.FIELDS))
                : getResults(clazz, PresentKind.FIELDS);
        List<String> realLines = Arrays.stream(results).toList();

        int startIndex = 0;
        while (!realLines.get(startIndex).equals("{")) {
            startIndex++;
        }

        realLineMap.clear();
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

    private void validateHeaderLine(String headerLine) {
        if (realLineMap.containsKey(headerLine)) {
            return;
        }

        logger.info("headerLine not found: [{}]", headerLine);
        throw new IllegalStateException();
    }

    @After
    public void validate() {
        String headerLine = expectedConsecutiveLines.get(0);
        validateHeaderLine(headerLine);

        int expectedLineNumber = 0;
        int realLineNumber = 0;
        List<String> realLines = realLineMap.get(headerLine);
        while (expectedLineNumber < expectedConsecutiveLines.size()) {
            String expectedLine = expectedConsecutiveLines.get(expectedLineNumber);

            boolean matchLineFound = false;
            while (realLineNumber < realLines.size()) {
                if (expectedLine.equals(realLines.get(realLineNumber))) {
                    matchLineFound = true;
                    break;
                }
                realLineNumber++;
            }
            String message = String.format("Expected line not found: [%s]", expectedLine);
            Assert.assertTrue(message, matchLineFound);

            expectedLineNumber++;
        }

        logger.info("HeaderLine: [{}]", expectedConsecutiveLines.get(0));
        logger.info("Expected lines found. Count: [{}]", expectedConsecutiveLines.size());
        logger.info("");

        analyzeAttributeSummaryForOneField();
    }

    private void analyzeAttributeSummaryForOneField() {
        Map<String, Integer> attributeNames = new TreeMap<>();
        for (String expectedLine : expectedConsecutiveLines) {
            boolean attributeHeaderLine =
                    StringUtils.startsWith(expectedLine, FOUR_SPACES) &&
                            !StringUtils.startsWith(expectedLine, FIVE_SPACES);
            if (!attributeHeaderLine) {
                continue;
            }

            int colonIndex = expectedLine.indexOf(":");
            String attributeName = expectedLine.substring(0, colonIndex).stripLeading();
            if (skippedNames.contains(attributeName)) {
                continue;
            }
            int previousCount = attributeNames.getOrDefault(attributeName, 0);
            attributeNames.put(attributeName, previousCount + 1);
        }

//        attributeNames.keySet().forEach(attributeName ->
//                logger.info("Detected attributeName: [{}]", attributeName));
        attributeNames.forEach((key, value) -> {
            int previousCount = DETECTED_ATTRIBUTE_NAMES.getOrDefault(key, 0);
            DETECTED_ATTRIBUTE_NAMES.put(key, previousCount + value);
        });
    }

    @AfterClass
    public static void analyzeAttributeSummaryForClass() {
        logger.info("Attribute analysis result:");
        DETECTED_ATTRIBUTE_NAMES.forEach((key, value) ->
                logger.info("Detected attributeName: [{}] (count: {})", key, value));
    }
}
