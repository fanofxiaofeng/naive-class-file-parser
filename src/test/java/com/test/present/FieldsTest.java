package com.test.present;

import com.study.constants.ClassAccessFlags;
import com.study.constants.PresentKind;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class FieldsTest extends PresenterTestBase {

    @Test
    public void test1() throws IOException {
        String[] result = getResults(C22.class, PresentKind.FIELDS);
        List<String> realLines = Arrays.stream(result).toList();

        // how to generate the following lines inside List.of()?
        // javap -v -p C22 | grep -B1 'descriptor:' | grep -v 'descriptor:' | grep ';'  | grep -v '(' | sed -e 's/^/"/' -e 's/$/",/'
        List<String> expectedLines = List.of(
                "  private int f1;",
                "  private long f2;",
                "  private float f3;",
                "  private double f4;",
                "  private java.lang.String f5;",
                "  private java.util.Map f6;",
                "  private java.util.List f7;",
                "  private com.test.present.C22$Level2 f8;",
                "  private com.test.present.C22$Level2$Level3 f9;",
                "  private static com.test.present.C22$SC f10;",
                "  int[][][][][][][] f11;",
                "  com.test.present.C22$Level2$Level3[][][][][][][][][][][] f12;",
                "  java.util.List[][][][][][] f13;",
                "  public static final boolean f14;",
                "  protected char f15;",
                "  protected volatile transient byte f16;"
        );
        expectedLines.forEach(line -> {
            long count = realLines.stream().filter(e -> e.equals(line)).count();
            String message = String.format("expected line content: [%s] not found!", line);
            Assert.assertEquals(message, 1, count);
        });
    }

    @Test
    public void test2() throws IOException {
        String[] result = getResults(ClassAccessFlags.class, PresentKind.FIELDS);
        List<String> realLines = Arrays.stream(result).toList();

        // how to generate the following lines inside List.of()?
        // javap -p ClassAccessFlags | grep ';' | grep -v '(' | grep -v '{' | sed -e 's/^/"/' -e 's/$/",/'
        List<String> expectedLines = List.of(
                "  public static final com.study.constants.ClassAccessFlags ACC_PUBLIC;",
                "  public static final com.study.constants.ClassAccessFlags ACC_FINAL;",
                "  public static final com.study.constants.ClassAccessFlags ACC_SUPER;",
                "  public static final com.study.constants.ClassAccessFlags ACC_INTERFACE;",
                "  public static final com.study.constants.ClassAccessFlags ACC_ABSTRACT;",
                "  public static final com.study.constants.ClassAccessFlags ACC_SYNTHETIC;",
                "  public static final com.study.constants.ClassAccessFlags ACC_ANNOTATION;",
                "  public static final com.study.constants.ClassAccessFlags ACC_ENUM;",
                "  public static final com.study.constants.ClassAccessFlags ACC_MODULE;",
                "  private final int flag;",
                "  private static final com.study.constants.ClassAccessFlags[] $VALUES;"
        );
        expectedLines.forEach(line -> {
            long count = realLines.stream().filter(e -> e.equals(line)).count();
            String message = String.format("expected line content: [%s] not found!", line);
            Assert.assertEquals(message, 1, count);
        });
    }
}
