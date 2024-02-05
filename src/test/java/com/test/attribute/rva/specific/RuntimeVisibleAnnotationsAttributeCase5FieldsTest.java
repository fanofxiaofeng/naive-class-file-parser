package com.test.attribute.rva.specific;

import com.test.field.FieldPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase5;
import java.util.List;

public class RuntimeVisibleAnnotationsAttributeCase5FieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException {
        buildRealLines(RuntimeVisibleAnnotationsAttributeCase5.class);
    }

    @Test
    public void test_for_field_f1() {
        expectedConsecutiveLines = List.of(
                "  private int f1;",
                "    descriptor: I",
                "    flags: (0x0002) ACC_PRIVATE",
                "    RuntimeVisibleAnnotations:",
                "      0: #12(#13=[I#14,I#15,I#16],#17=[s#18,s#19])",
                "        com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase5$CaseAnnotation1(",
                "          value=[1,2,42]",
                "          value2=[\"Hello\",\"World   \"]",
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
                "      0: #22(#13=[e#23.#24,e#23.#24,e#23.#25,e#23.#24])",
                "        com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase5$CaseAnnotation2(",
                "          value=[Lcom/test/attribute/cases/rva/RuntimeVisibleAnnotationsAttributeCase5$MyEnum;.DOWN,Lcom/test/attribute/cases/rva/RuntimeVisibleAnnotationsAttributeCase5$MyEnum;.DOWN,Lcom/test/attribute/cases/rva/RuntimeVisibleAnnotationsAttributeCase5$MyEnum;.UP,Lcom/test/attribute/cases/rva/RuntimeVisibleAnnotationsAttributeCase5$MyEnum;.DOWN]",
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
                "      0: #28(#13=[c#29,c#30,c#31,c#32])",
                "        com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase5$CaseAnnotation3(",
                "          value=[class Ljava/lang/Object;,class Ljava/lang/Number;,class Ljava/lang/String;,class Ljava/lang/Class;]",
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
                "      0: #35(#13=[@#36(),@#36()])",
                "        com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase5$CaseAnnotation4(",
                "          value=[@com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase5$MyAnnotation4,@com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase5$MyAnnotation4]",
                "        )"
        );
    }
    @Test
    public void test_for_field_f5() {
        expectedConsecutiveLines = List.of(
                "  private long f5;",
                "    descriptor: J",
                "    flags: (0x0002) ACC_PRIVATE",
                "    RuntimeVisibleAnnotations:",
                "      0: #39(#13=[@#35(#13=[@#36(),@#36()]),@#35(#13=[@#36()]),@#35(#13=[@#36(),@#36(),@#36()])])",
                "        com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase5$CaseAnnotation5(",
                "          value=[@com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase5$CaseAnnotation4(",
                "            value=[@com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase5$MyAnnotation4,@com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase5$MyAnnotation4]",
                "          ),@com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase5$CaseAnnotation4(",
                "            value=[@com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase5$MyAnnotation4]",
                "          ),@com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase5$CaseAnnotation4(",
                "            value=[@com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase5$MyAnnotation4,@com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase5$MyAnnotation4,@com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase5$MyAnnotation4]",
                "          )]",
                "        )"
        );
    }
}
