package com.test.attribute.rva.specific;

import com.test.field.FieldPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase3;
import java.util.List;

public class RuntimeVisibleAnnotationsAttributeCase3FieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException {
        buildRealLines(RuntimeVisibleAnnotationsAttributeCase3.class);
    }

    @Test
    public void test_for_field_f1() {
        expectedConsecutiveLines = List.of(
                "  private int f1;",
                "    descriptor: I",
                "    flags: (0x0002) ACC_PRIVATE",
                "    RuntimeVisibleAnnotations:",
                "      0: #12(#13=c#14)",
                "        com.test.attribute.cases.rva.CaseClass1(",
                "          value=class Ljava/lang/Integer;",
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
                "      0: #16(#13=c#17)",
                "        com.test.attribute.cases.rva.CaseClass2(",
                "          value=class Lcom/test/attribute/cases/rva/Case3C1$Case3C2$Case3C3;",
                "        )"
        );
    }
}
