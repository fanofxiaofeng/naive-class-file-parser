package com.test.field.standard;

import com.test.field.FieldPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class EnumFieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Enum"));
    }

    @Test
    public void test_for_field_name() {
        expectedConsecutiveLines = List.of(
                "  private final java.lang.String name;",
                "    descriptor: Ljava/lang/String;",
                "    flags: (0x0012) ACC_PRIVATE, ACC_FINAL"
        );
    }
    @Test
    public void test_for_field_ordinal() {
        expectedConsecutiveLines = List.of(
                "  private final int ordinal;",
                "    descriptor: I",
                "    flags: (0x0012) ACC_PRIVATE, ACC_FINAL"
        );
    }
    @Test
    public void test_for_field_hash() {
        expectedConsecutiveLines = List.of(
                "  private int hash;",
                "    descriptor: I",
                "    flags: (0x0002) ACC_PRIVATE",
                "    RuntimeVisibleAnnotations:",
                "      0: #118()",
                "        jdk.internal.vm.annotation.Stable"
        );
    }
}
