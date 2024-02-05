package com.test.attribute.rva.standard;

import com.test.field.FieldPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class StringFieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException {
        buildRealLines(String.class);
    }

    @Test
    public void test_for_field_value() {
        expectedConsecutiveLines = List.of(
                "  private final byte[] value;",
                "    descriptor: [B",
                "    flags: (0x0012) ACC_PRIVATE, ACC_FINAL",
                "    RuntimeVisibleAnnotations:",
                "      0: #1108()",
                "        jdk.internal.vm.annotation.Stable"
        );
    }
}
