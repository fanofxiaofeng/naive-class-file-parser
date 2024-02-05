package com.test.attribute.deprecated;

import com.test.field.FieldPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class DeprecatedCaseFieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.attribute.cases.DeprecatedCase"));
    }

    @Test
    public void test_for_field_a() {
        expectedConsecutiveLines = List.of(
                "  private int a;",
                "    descriptor: I",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Deprecated: true",
                "    RuntimeVisibleAnnotations:",
                "      0: #13()",
                "        java.lang.Deprecated"
        );
    }
    @Test
    public void test_for_field_b() {
        expectedConsecutiveLines = List.of(
                "  private static int b;",
                "    descriptor: I",
                "    flags: (0x000a) ACC_PRIVATE, ACC_STATIC",
                "    Deprecated: true",
                "    RuntimeVisibleAnnotations:",
                "      0: #13()",
                "        java.lang.Deprecated"
        );
    }
}
