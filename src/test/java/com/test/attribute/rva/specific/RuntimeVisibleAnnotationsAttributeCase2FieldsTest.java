package com.test.attribute.rva.specific;

import com.test.field.FieldPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase2;
import java.util.List;

public class RuntimeVisibleAnnotationsAttributeCase2FieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException {
        buildRealLines(RuntimeVisibleAnnotationsAttributeCase2.class);
    }

    @Test
    public void test_for_field_f1() {
        expectedConsecutiveLines = List.of(
                "  private int f1;",
                "    descriptor: I",
                "    flags: (0x0002) ACC_PRIVATE",
                "    RuntimeVisibleAnnotations:",
                "      0: #12(#13=e#14.#15)",
                "        com.test.attribute.cases.rva.CaseEnum(",
                "          value=Lcom/test/attribute/cases/rva/C1$C2$MyEnum;.EAST",
                "        )"
        );
    }
    @Test
    public void test_for_field_f2() {
        expectedConsecutiveLines = List.of(
                "  private int f2;",
                "    descriptor: I",
                "    flags: (0x0002) ACC_PRIVATE",
                "    RuntimeVisibleAnnotations:",
                "      0: #12()",
                "        com.test.attribute.cases.rva.CaseEnum"
        );
    }
}
