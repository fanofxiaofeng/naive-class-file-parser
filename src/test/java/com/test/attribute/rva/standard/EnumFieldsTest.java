package com.test.attribute.rva.standard;

import com.test.field.FieldPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class EnumFieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException {
        buildRealLines(Enum.class);
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
