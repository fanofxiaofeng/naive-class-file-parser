package com.test.attribute.cv.standard;

import com.test.field.FieldPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class IntegerFieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Integer"));
    }

    @Test
    public void test_for_field_MIN_VALUE() {
        expectedConsecutiveLines = List.of(
                "  public static final int MIN_VALUE;",
                "    descriptor: I",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int -2147483648"
        );
    }
    @Test
    public void test_for_field_MAX_VALUE() {
        expectedConsecutiveLines = List.of(
                "  public static final int MAX_VALUE;",
                "    descriptor: I",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 2147483647"
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
                "    ConstantValue: long 1360826667806852920l"
        );
    }
}
