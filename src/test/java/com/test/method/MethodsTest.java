package com.test.method;

import com.study.constants.ClassAccessFlags;
import com.study.constants.PresentKind;
import com.test.presenter.C33;
import com.test.presenter.PresenterTestBase;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class MethodsTest extends PresenterTestBase {
    @Test
    public void test1() throws IOException {
        String[] result = getResults(C33.class, PresentKind.METHODS);
        List<String> realLines = Arrays.stream(result).toList();
        // how to generate the following lines inside List.of()?
        // javap -p C33  | grep ';' | sed -e 's/^/"/' -e 's/$/",/'
        List<String> expectedLines = List.of(
                "  private synchronized int f1(int, int);",
                "  abstract long f2(long, long, long, long...);",
                "  abstract float f3(float...);",
                "  abstract double f4(double);",
                "  abstract java.lang.String f5(java.lang.String, int[]...);",
                "  abstract java.util.Map f6(int, java.util.Map[]...);",
                "  abstract java.util.List f7(java.util.List[], java.util.List...);",
                "  abstract com.test.present.C33$Level2 f8(com.test.present.C33$Level2[], com.test.present.C33$Level2...);",
                "  abstract com.test.present.C33$Level2$Level3 f9(com.test.present.C33$Level2$Level3...);",
                "  abstract com.test.present.C33$SC f10(com.test.present.C33$SC, com.test.present.C33$SC, com.test.present.C33$SC, com.test.present.C33$SC[], com.test.present.C33$SC...);",
                "  abstract int[][][][][][][] f11(int[][][][][][][]...);",
                "  abstract com.test.present.C33$Level2$Level3[][][][][][][][][][][] f12(com.test.present.C33$Level2$Level3[][][][][][][][][][][]...);",
                "  static java.util.List[][][][][][] f13(java.util.List[][][][][][], int[][][][][][][], boolean[][][][][][][], java.lang.Boolean[][][][][][][], java.lang.Integer[][][][][], java.util.function.Function[][][][], java.util.function.BiConsumer[][][], java.lang.Object...);",
                "  private com.test.present.C33(java.lang.String[]...);",
                "  public com.test.present.C33(java.lang.String...);",
                "  protected com.test.present.C33(java.lang.String);",
                "  com.test.present.C33(java.lang.String, int[]...);",
                "  static {};"
        );

        expectedLines.forEach(line -> {
            long count = realLines.stream().filter(e -> e.equals(line)).count();
            String message = String.format("expected line content: [%s] not found!", line);
            Assert.assertEquals(message, 1, count);
        });
    }

    @Test
    public void test2() throws IOException {
        String[] result = getResults(ClassAccessFlags.class, PresentKind.METHODS);
        List<String> realLines = Arrays.stream(result).toList();
        // how to generate the following lines inside List.of()?
        // javap -p ClassAccessFlags | grep ';' | grep -E '\(|\{' | sed -e 's/^/"/' -e 's/$/",/'
        List<String> expectedLines = List.of(
                "  public static com.study.constants.ClassAccessFlags[] values();",
                "  public static com.study.constants.ClassAccessFlags valueOf(java.lang.String);",
                "  private com.study.constants.ClassAccessFlags(int);",
                "  public int getFlag();",
                "  public java.lang.String getSimpleName();",
                "  private static com.study.constants.ClassAccessFlags[] $values();",
                "  static {};"
        );

        expectedLines.forEach(line -> {
            long count = realLines.stream().filter(e -> e.equals(line)).count();
            String message = String.format("expected line content: [%s] not found!", line);
            Assert.assertEquals(message, 1, count);
        });
    }

    @Test
    public void test3() throws IOException {
        String[] result = getResults(Temp.class, PresentKind.METHODS);
        List<String> realLines = Arrays.stream(result).toList();
    }

    enum Temp {
        A(2, 0, 8),
        B(2, 3, 4);
        private final int[] data;

        Temp(int... data) {
            this.data = data;
        }
    }
}
