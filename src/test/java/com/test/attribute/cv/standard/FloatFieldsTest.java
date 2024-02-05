package com.test.attribute.cv.standard;

import com.test.field.FieldPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class FloatFieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Float"));
    }

    @Test
    public void test_for_field_POSITIVE_INFINITY() {
        expectedConsecutiveLines = List.of(
                "  public static final float POSITIVE_INFINITY;",
                "    descriptor: F",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: float Infinityf"
        );
    }
    @Test
    public void test_for_field_NEGATIVE_INFINITY() {
        expectedConsecutiveLines = List.of(
                "  public static final float NEGATIVE_INFINITY;",
                "    descriptor: F",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: float -Infinityf"
        );
    }
    @Test
    public void test_for_field_NaN() {
        expectedConsecutiveLines = List.of(
                "  public static final float NaN;",
                "    descriptor: F",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: float NaNf"
        );
    }
    @Test
    public void test_for_field_MAX_VALUE() {
        expectedConsecutiveLines = List.of(
                "  public static final float MAX_VALUE;",
                "    descriptor: F",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: float 3.4028235E38f"
        );
    }
    @Test
    public void test_for_field_MIN_NORMAL() {
        expectedConsecutiveLines = List.of(
                "  public static final float MIN_NORMAL;",
                "    descriptor: F",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: float 1.1754944E-38f"
        );
    }
    @Test
    public void test_for_field_MIN_VALUE() {
        expectedConsecutiveLines = List.of(
                "  public static final float MIN_VALUE;",
                "    descriptor: F",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: float 1.4E-45f"
        );
    }
    @Test
    public void test_for_field_SIZE() {
        expectedConsecutiveLines = List.of(
                "  public static final int SIZE;",
                "    descriptor: I",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 32"
        );
    }
    @Test
    public void test_for_field_PRECISION() {
        expectedConsecutiveLines = List.of(
                "  public static final int PRECISION;",
                "    descriptor: I",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 24"
        );
    }
    @Test
    public void test_for_field_MAX_EXPONENT() {
        expectedConsecutiveLines = List.of(
                "  public static final int MAX_EXPONENT;",
                "    descriptor: I",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 127"
        );
    }
    @Test
    public void test_for_field_MIN_EXPONENT() {
        expectedConsecutiveLines = List.of(
                "  public static final int MIN_EXPONENT;",
                "    descriptor: I",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int -126"
        );
    }
    @Test
    public void test_for_field_BYTES() {
        expectedConsecutiveLines = List.of(
                "  public static final int BYTES;",
                "    descriptor: I",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 4"
        );
    }
    @Test
    public void test_for_field_serialVersionUID() {
        expectedConsecutiveLines = List.of(
                "  private static final long serialVersionUID;",
                "    descriptor: J",
                "    flags: (0x001a) ACC_PRIVATE, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: long -2671257302660747028l"
        );
    }
}
