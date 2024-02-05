package com.test.attribute.rva.specific;

import com.test.field.FieldPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase4;
import java.util.List;

public class RuntimeVisibleAnnotationsAttributeCase4FieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException {
        buildRealLines(RuntimeVisibleAnnotationsAttributeCase4.class);
    }

    @Test
    public void test_for_field_f1() {
        expectedConsecutiveLines = List.of(
                "  private int f1;",
                "    descriptor: I",
                "    flags: (0x0002) ACC_PRIVATE",
                "    RuntimeVisibleAnnotations:",
                "      0: #12(#13=@#14(#13=I#15))",
                "        com.test.attribute.cases.rva.CaseAnnotation1(",
                "          value=@com.test.attribute.cases.rva.MyAnnotation1(",
                "            value=42",
                "          )",
                "        )"
        );
    }
    @Test
    public void test_for_field_f2() {
        expectedConsecutiveLines = List.of(
                "  private boolean f2;",
                "    descriptor: Z",
                "    flags: (0x0002) ACC_PRIVATE",
                "    RuntimeVisibleAnnotations:",
                "      0: #18(#13=@#19(#13=I#20,#21=J#22,#24=s#25))",
                "        com.test.attribute.cases.rva.CaseAnnotation2(",
                "          value=@com.test.attribute.cases.rva.MyAnnotation2(",
                "            value=100",
                "            value2=31415926535l",
                "            value3=\"Hello world   \"",
                "          )",
                "        )"
        );
    }
    @Test
    public void test_for_field_f3() {
        expectedConsecutiveLines = List.of(
                "  private byte f3;",
                "    descriptor: B",
                "    flags: (0x0002) ACC_PRIVATE",
                "    RuntimeVisibleAnnotations:",
                "      0: #28(#13=@#29(#13=e#30.#31))",
                "        com.test.attribute.cases.rva.CaseAnnotation3(",
                "          value=@com.test.attribute.cases.rva.MyAnnotation3(",
                "            value=Lcom/test/attribute/cases/rva/MyEnum;.DOWN",
                "          )",
                "        )"
        );
    }
    @Test
    public void test_for_field_f4() {
        expectedConsecutiveLines = List.of(
                "  private char f4;",
                "    descriptor: C",
                "    flags: (0x0002) ACC_PRIVATE",
                "    RuntimeVisibleAnnotations:",
                "      0: #34(#13=@#35(#13=c#36))",
                "        com.test.attribute.cases.rva.CaseAnnotation4(",
                "          value=@com.test.attribute.cases.rva.MyAnnotation4(",
                "            value=class Lcom/test/attribute/cases/rva/MyClass$Inner;",
                "          )",
                "        )"
        );
    }
}
