package com.test.attribute.cv.standard;

import com.test.field.FieldPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class MathFieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Math"));
    }

    @Test
    public void test_for_field_E() {
        expectedConsecutiveLines = List.of(
                "  public static final double E;",
                "    descriptor: D",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: double 2.718281828459045d"
        );
    }
    @Test
    public void test_for_field_PI() {
        expectedConsecutiveLines = List.of(
                "  public static final double PI;",
                "    descriptor: D",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: double 3.141592653589793d"
        );
    }
    @Test
    public void test_for_field_TAU() {
        expectedConsecutiveLines = List.of(
                "  public static final double TAU;",
                "    descriptor: D",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: double 6.283185307179586d"
        );
    }
    @Test
    public void test_for_field_DEGREES_TO_RADIANS() {
        expectedConsecutiveLines = List.of(
                "  private static final double DEGREES_TO_RADIANS;",
                "    descriptor: D",
                "    flags: (0x001a) ACC_PRIVATE, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: double 0.017453292519943295d"
        );
    }
    @Test
    public void test_for_field_RADIANS_TO_DEGREES() {
        expectedConsecutiveLines = List.of(
                "  private static final double RADIANS_TO_DEGREES;",
                "    descriptor: D",
                "    flags: (0x001a) ACC_PRIVATE, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: double 57.29577951308232d"
        );
    }
}