package com.test.attribute.cv.standard;

import com.test.field.FieldPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class StringFieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.String"));
    }

    @Test
    public void test_for_field_serialVersionUID() {
        expectedConsecutiveLines = List.of(
                "  private static final long serialVersionUID;",
                "    descriptor: J",
                "    flags: (0x001a) ACC_PRIVATE, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: long -6849794470754667710l"
        );
    }
    @Test
    public void test_for_field_REPL() {
        expectedConsecutiveLines = List.of(
                "  private static final char REPL;",
                "    descriptor: C",
                "    flags: (0x001a) ACC_PRIVATE, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 65533"
        );
    }
    @Test
    public void test_for_field_LATIN1() {
        expectedConsecutiveLines = List.of(
                "  static final byte LATIN1;",
                "    descriptor: B",
                "    flags: (0x0018) ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 0"
        );
    }
    @Test
    public void test_for_field_UTF16() {
        expectedConsecutiveLines = List.of(
                "  static final byte UTF16;",
                "    descriptor: B",
                "    flags: (0x0018) ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 1"
        );
    }
}
