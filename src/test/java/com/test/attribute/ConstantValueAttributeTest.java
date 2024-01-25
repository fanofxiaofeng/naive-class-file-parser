package com.test.attribute;

import com.study.constants.PresentKind;
import com.test.attribute.cases.ConstantValueAttributeCase;
import com.test.present.PresenterTestBase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConstantValueAttributeTest extends PresenterTestBase {

    private List<String> realLines;
    private List<String> expectedLines;

    private void buildRealLines(Class<?> clazz) throws IOException {
        String[] results = getResults(clazz, PresentKind.FIELDS);
        realLines = Arrays.stream(results).toList();
    }

    @After
    public void validate() {
        Map<String, Long> expectedCountMap = expectedLines.
                stream().
                collect(Collectors.groupingBy(Function.identity(), Collectors.summingLong(line -> 1L)));
        expectedCountMap.forEach((line, expectedCount) -> {
            long realCount = realLines.stream().filter(e -> e.equals(line)).count();
            String message = String.format("expected line content: [%s] not found!", line);
            Assert.assertEquals(message, expectedCount.longValue(), realCount);
        });
        System.out.println("Test passed...");
    }

    @Test
    public void testForIntegerClass() throws IOException {
        buildRealLines(Integer.class);

        // javap -v -p 'java.lang.Integer' | grep '^ *ConstantValue' | sed -e 's/^/"/' -e 's/$/",/'
        expectedLines = List.of(
                "    ConstantValue: int -2147483648",
                "    ConstantValue: int 2147483647",
                "    ConstantValue: int 32",
                "    ConstantValue: int 4",
                "    ConstantValue: long 1360826667806852920l"
        );

    }

    @Test
    public void testForLongClass() throws IOException {
        buildRealLines(Long.class);

        // javap -v -p 'java.lang.Long' | grep '^ *ConstantValue' | sed -e 's/^/"/' -e 's/$/",/'
        expectedLines = List.of(
                "    ConstantValue: long -9223372036854775808l",
                "    ConstantValue: long 9223372036854775807l",
                "    ConstantValue: int 64",
                "    ConstantValue: int 8",
                "    ConstantValue: long 4290774380558885855l"
        );
    }

    @Test
    public void testForByteClass() throws IOException {
        buildRealLines(Byte.class);

        // javap -v -p 'java.lang.Byte' | grep '^ *ConstantValue' | sed -e 's/^/"/' -e 's/$/",/'
        expectedLines = List.of(
                "    ConstantValue: int -128",
                "    ConstantValue: int 127",
                "    ConstantValue: int 8",
                "    ConstantValue: int 1",
                "    ConstantValue: long -7183698231559129828l"
        );
    }

    @Test
    public void testForCharacterClass() throws IOException {
        buildRealLines(Character.class);

        // javap -v -p 'java.lang.Character' | grep '^ *ConstantValue' | sed -e 's/^/"/' -e 's/$/",/'
        expectedLines = List.of(
                "    ConstantValue: int 2",
                "    ConstantValue: int 36",
                "    ConstantValue: int 0",
                "    ConstantValue: int 65535",
                "    ConstantValue: int 0",
                "    ConstantValue: int 1",
                "    ConstantValue: int 2",
                "    ConstantValue: int 3",
                "    ConstantValue: int 4",
                "    ConstantValue: int 5",
                "    ConstantValue: int 6",
                "    ConstantValue: int 7",
                "    ConstantValue: int 8",
                "    ConstantValue: int 9",
                "    ConstantValue: int 10",
                "    ConstantValue: int 11",
                "    ConstantValue: int 12",
                "    ConstantValue: int 13",
                "    ConstantValue: int 14",
                "    ConstantValue: int 15",
                "    ConstantValue: int 16",
                "    ConstantValue: int 18",
                "    ConstantValue: int 19",
                "    ConstantValue: int 20",
                "    ConstantValue: int 21",
                "    ConstantValue: int 22",
                "    ConstantValue: int 23",
                "    ConstantValue: int 24",
                "    ConstantValue: int 25",
                "    ConstantValue: int 26",
                "    ConstantValue: int 27",
                "    ConstantValue: int 28",
                "    ConstantValue: int 29",
                "    ConstantValue: int 30",
                "    ConstantValue: int -1",
                "    ConstantValue: int -1",
                "    ConstantValue: int 0",
                "    ConstantValue: int 1",
                "    ConstantValue: int 2",
                "    ConstantValue: int 3",
                "    ConstantValue: int 4",
                "    ConstantValue: int 5",
                "    ConstantValue: int 6",
                "    ConstantValue: int 7",
                "    ConstantValue: int 8",
                "    ConstantValue: int 9",
                "    ConstantValue: int 10",
                "    ConstantValue: int 11",
                "    ConstantValue: int 12",
                "    ConstantValue: int 13",
                "    ConstantValue: int 14",
                "    ConstantValue: int 15",
                "    ConstantValue: int 16",
                "    ConstantValue: int 17",
                "    ConstantValue: int 18",
                "    ConstantValue: int 19",
                "    ConstantValue: int 20",
                "    ConstantValue: int 21",
                "    ConstantValue: int 22",
                "    ConstantValue: int 55296",
                "    ConstantValue: int 56319",
                "    ConstantValue: int 56320",
                "    ConstantValue: int 57343",
                "    ConstantValue: int 55296",
                "    ConstantValue: int 57343",
                "    ConstantValue: int 65536",
                "    ConstantValue: int 0",
                "    ConstantValue: int 1114111",
                "    ConstantValue: long 3786198910865385080l",
                "    ConstantValue: int 16",
                "    ConstantValue: int 2"
        );
    }

    @Test
    public void testForFloatClass() throws IOException {
        buildRealLines(Float.class);

        // javap -v -p 'java.lang.Float' | grep '^ *ConstantValue' | sed -e 's/^/"/' -e 's/$/",/'
        expectedLines = List.of(
                "    ConstantValue: float Infinityf",
                "    ConstantValue: float -Infinityf",
                "    ConstantValue: float NaNf",
                "    ConstantValue: float 3.4028235E38f",
                "    ConstantValue: float 1.1754944E-38f",
                "    ConstantValue: float 1.4E-45f",
                "    ConstantValue: int 32",
                "    ConstantValue: int 24",
                "    ConstantValue: int 127",
                "    ConstantValue: int -126",
                "    ConstantValue: int 4",
                "    ConstantValue: long -2671257302660747028l"
        );
    }

    @Test
    public void testForDoubleClass() throws IOException {
        buildRealLines(Double.class);

        // javap -v -p 'java.lang.Double' | grep '^ *ConstantValue' | sed -e 's/^/"/' -e 's/$/",/'
        expectedLines = List.of(
                "    ConstantValue: double Infinityd",
                "    ConstantValue: double -Infinityd",
                "    ConstantValue: double NaNd",
                "    ConstantValue: double 1.7976931348623157E308d",
                "    ConstantValue: double 2.2250738585072014E-308d",
                "    ConstantValue: double 4.9E-324d",
                "    ConstantValue: int 64",
                "    ConstantValue: int 53",
                "    ConstantValue: int 1023",
                "    ConstantValue: int -1022",
                "    ConstantValue: int 8",
                "    ConstantValue: long -9172774392245257468l"
        );
    }

    @Test
    public void testForStringClass() throws IOException {
        buildRealLines(String.class);

        // javap -v -p 'java.lang.String' | grep '^ *ConstantValue' | sed -e 's/^/"/' -e 's/$/",/'
        expectedLines = List.of(
                "    ConstantValue: long -6849794470754667710l",
                "    ConstantValue: int 65533",
                "    ConstantValue: int 0",
                "    ConstantValue: int 1"
        );
    }

    @Test
    public void testForMathClass() throws IOException {
        buildRealLines(Math.class);

        // javap -v -p 'java.lang.Math' | grep '^ *ConstantValue' | sed -e 's/^/"/' -e 's/$/",/'
        expectedLines = List.of(
                "    ConstantValue: double 2.718281828459045d",
                "    ConstantValue: double 3.141592653589793d",
                "    ConstantValue: double 6.283185307179586d",
                "    ConstantValue: double 0.017453292519943295d",
                "    ConstantValue: double 57.29577951308232d"
        );
    }

    @Test
    public void test() throws IOException {
        buildRealLines(ConstantValueAttributeCase.class);

        // javap -v -p 'java.lang.Math' | grep '^ *ConstantValue' | sed -e 's/^/"/' -e 's/$/",/'
        // Please note that the first element has several escaped characters, so I copied this line manually
        expectedLines = List.of(
                "    ConstantValue: String \\\"Hello world\\\"\\'\\\"\\'",
                "    ConstantValue: long 1234567898765l",
                "    ConstantValue: double 1234.5678987654321d"
        );
    }
}
