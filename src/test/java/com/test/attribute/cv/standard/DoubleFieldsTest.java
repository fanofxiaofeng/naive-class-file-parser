package com.test.attribute.cv.standard;

import com.test.field.FieldPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class DoubleFieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Double"));
    }

    @Test
    public void test_for_field_POSITIVE_INFINITY() {
        expectedConsecutiveLines = List.of(
                "  public static final double POSITIVE_INFINITY;",
                "    descriptor: D",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: double Infinityd"
        );
    }
    @Test
    public void test_for_field_NEGATIVE_INFINITY() {
        expectedConsecutiveLines = List.of(
                "  public static final double NEGATIVE_INFINITY;",
                "    descriptor: D",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: double -Infinityd"
        );
    }
    @Test
    public void test_for_field_NaN() {
        expectedConsecutiveLines = List.of(
                "  public static final double NaN;",
                "    descriptor: D",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: double NaNd"
        );
    }
    @Test
    public void test_for_field_MAX_VALUE() {
        expectedConsecutiveLines = List.of(
                "  public static final double MAX_VALUE;",
                "    descriptor: D",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: double 1.7976931348623157E308d"
        );
    }
    @Test
    public void test_for_field_MIN_NORMAL() {
        expectedConsecutiveLines = List.of(
                "  public static final double MIN_NORMAL;",
                "    descriptor: D",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: double 2.2250738585072014E-308d"
        );
    }
    @Test
    public void test_for_field_MIN_VALUE() {
        expectedConsecutiveLines = List.of(
                "  public static final double MIN_VALUE;",
                "    descriptor: D",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: double 4.9E-324d"
        );
    }
    @Test
    public void test_for_field_SIZE() {
        expectedConsecutiveLines = List.of(
                "  public static final int SIZE;",
                "    descriptor: I",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 64"
        );
    }
    @Test
    public void test_for_field_PRECISION() {
        expectedConsecutiveLines = List.of(
                "  public static final int PRECISION;",
                "    descriptor: I",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 53"
        );
    }
    @Test
    public void test_for_field_MAX_EXPONENT() {
        expectedConsecutiveLines = List.of(
                "  public static final int MAX_EXPONENT;",
                "    descriptor: I",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 1023"
        );
    }
    @Test
    public void test_for_field_MIN_EXPONENT() {
        expectedConsecutiveLines = List.of(
                "  public static final int MIN_EXPONENT;",
                "    descriptor: I",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int -1022"
        );
    }
    @Test
    public void test_for_field_BYTES() {
        expectedConsecutiveLines = List.of(
                "  public static final int BYTES;",
                "    descriptor: I",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 8"
        );
    }
    @Test
    public void test_for_field_serialVersionUID() {
        expectedConsecutiveLines = List.of(
                "  private static final long serialVersionUID;",
                "    descriptor: J",
                "    flags: (0x001a) ACC_PRIVATE, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: long -9172774392245257468l"
        );
    }
}
