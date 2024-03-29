package com.test.attribute.rva.specific;

import com.test.field.FieldPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase1;
import java.util.List;

public class RuntimeVisibleAnnotationsAttributeCase1FieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException {
        buildRealLines(RuntimeVisibleAnnotationsAttributeCase1.class);
    }

    @Test
    public void test_for_field_byte1() {
        expectedConsecutiveLines = List.of(
                "  private byte byte1;",
                "    descriptor: B",
                "    flags: (0x0002) ACC_PRIVATE",
                "    RuntimeVisibleAnnotations:",
                "      0: #12(#13=[@#14(#13=B#15),@#14(#13=B#16),@#14(#13=B#17),@#14(#13=B#18),@#14(#13=B#19),@#14(#13=B#20)])",
                "        com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase1$CaseByteContainer(",
                "          value=[@com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase1$CaseByte(",
                "            value=(byte) 0",
                "          ),@com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase1$CaseByte(",
                "            value=(byte) 2",
                "          ),@com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase1$CaseByte(",
                "            value=(byte) 12",
                "          ),@com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase1$CaseByte(",
                "            value=(byte) 42",
                "          ),@com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase1$CaseByte(",
                "            value=(byte) 100",
                "          ),@com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase1$CaseByte(",
                "            value=(byte) 127",
                "          )]",
                "        )"
        );
    }
    @Test
    public void test_for_field_byte2() {
        expectedConsecutiveLines = List.of(
                "  private byte byte2;",
                "    descriptor: B",
                "    flags: (0x0002) ACC_PRIVATE",
                "    RuntimeVisibleAnnotations:",
                "      0: #14(#13=B#18)",
                "        com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase1$CaseByte(",
                "          value=(byte) 42",
                "        )"
        );
    }
    @Test
    public void test_for_field_char1() {
        expectedConsecutiveLines = List.of(
                "  private char char1;",
                "    descriptor: C",
                "    flags: (0x0002) ACC_PRIVATE",
                "    RuntimeVisibleAnnotations:",
                "      0: #24(#13=[@#25(#13=C#15),@#25(#13=C#26),@#25(#13=C#27),@#25(#13=C#28),@#25(#13=C#29),@#25(#13=C#30)])",
                "        com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase1$CaseCharContainer(",
                "          value=[@com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase1$CaseChar(",
                "            value=' '",
                "          ),@com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase1$CaseChar(",
                "            value=''",
                "          ),@com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase1$CaseChar(",
                "            value=''",
                "          ),@com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase1$CaseChar(",
                "            value='\"'",
                "          ),@com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase1$CaseChar(",
                "            value='''",
                "          ),@com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase1$CaseChar(",
                "            value='ÿ'",
                "          )]",
                "        )"
        );
    }
    @Test
    public void test_for_field_char2() {
        expectedConsecutiveLines = List.of(
                "  private char char2;",
                "    descriptor: C",
                "    flags: (0x0002) ACC_PRIVATE",
                "    RuntimeVisibleAnnotations:",
                "      0: #14(#13=B#32)",
                "        com.test.attribute.cases.rva.RuntimeVisibleAnnotationsAttributeCase1$CaseByte(",
                "          value=(byte) 66",
                "        )"
        );
    }
    @Test
    public void test_for_field_aDouble() {
        expectedConsecutiveLines = List.of(
                "  private double aDouble;",
                "    descriptor: D",
                "    flags: (0x0002) ACC_PRIVATE",
                "    RuntimeVisibleAnnotations:",
                "      0: #35(#13=[@#36(#13=D#37),@#36(#13=D#39),@#36(#13=D#41),@#36(#13=D#43),@#36(#13=D#45),@#36(#13=D#47),@#36(#13=D#49)])",
                "        com.test.attribute.cases.rva.CaseDoubleContainer(",
                "          value=[@com.test.attribute.cases.rva.CaseDouble(",
                "            value=3.141592653589793d",
                "          ),@com.test.attribute.cases.rva.CaseDouble(",
                "            value=2.718281828459045d",
                "          ),@com.test.attribute.cases.rva.CaseDouble(",
                "            value=Infinityd",
                "          ),@com.test.attribute.cases.rva.CaseDouble(",
                "            value=NaNd",
                "          ),@com.test.attribute.cases.rva.CaseDouble(",
                "            value=-Infinityd",
                "          ),@com.test.attribute.cases.rva.CaseDouble(",
                "            value=1.7976931348623157E308d",
                "          ),@com.test.attribute.cases.rva.CaseDouble(",
                "            value=4.9E-324d",
                "          )]",
                "        )"
        );
    }
    @Test
    public void test_for_field_float1() {
        expectedConsecutiveLines = List.of(
                "  private float float1;",
                "    descriptor: F",
                "    flags: (0x0002) ACC_PRIVATE",
                "    RuntimeVisibleAnnotations:",
                "      0: #53(#13=F#54)",
                "        com.test.attribute.cases.rva.CaseFloat(",
                "          value=3.1415927f",
                "        )"
        );
    }
    @Test
    public void test_for_field_float2() {
        expectedConsecutiveLines = List.of(
                "  private float float2;",
                "    descriptor: F",
                "    flags: (0x0002) ACC_PRIVATE",
                "    RuntimeVisibleAnnotations:",
                "      0: #53(#13=F#56)",
                "        com.test.attribute.cases.rva.CaseFloat(",
                "          value=Infinityf",
                "        )"
        );
    }
    @Test
    public void test_for_field_anInt() {
        expectedConsecutiveLines = List.of(
                "  private int anInt;",
                "    descriptor: I",
                "    flags: (0x0002) ACC_PRIVATE",
                "    RuntimeVisibleAnnotations:",
                "      0: #59(#13=I#60)",
                "        com.test.attribute.cases.rva.CaseInt(",
                "          value=123456789",
                "        )"
        );
    }
    @Test
    public void test_for_field_aLong() {
        expectedConsecutiveLines = List.of(
                "  private long aLong;",
                "    descriptor: J",
                "    flags: (0x0002) ACC_PRIVATE",
                "    RuntimeVisibleAnnotations:",
                "      0: #63(#13=J#64)",
                "        com.test.attribute.cases.rva.CaseLong(",
                "          value=12345678987654321l",
                "        )"
        );
    }
    @Test
    public void test_for_field_short1() {
        expectedConsecutiveLines = List.of(
                "  private short short1;",
                "    descriptor: S",
                "    flags: (0x0002) ACC_PRIVATE",
                "    RuntimeVisibleAnnotations:",
                "      0: #68(#13=S#26)",
                "        com.test.attribute.cases.rva.CaseShort(",
                "          value=(short) 1",
                "        )"
        );
    }
    @Test
    public void test_for_field_short2() {
        expectedConsecutiveLines = List.of(
                "  private short short2;",
                "    descriptor: S",
                "    flags: (0x0002) ACC_PRIVATE",
                "    RuntimeVisibleAnnotations:",
                "      0: #68(#13=S#18)",
                "        com.test.attribute.cases.rva.CaseShort(",
                "          value=(short) 42",
                "        )"
        );
    }
    @Test
    public void test_for_field_boolean1() {
        expectedConsecutiveLines = List.of(
                "  private boolean boolean1;",
                "    descriptor: Z",
                "    flags: (0x0002) ACC_PRIVATE",
                "    RuntimeVisibleAnnotations:",
                "      0: #72(#13=Z#15)",
                "        com.test.attribute.cases.rva.CaseBoolean(",
                "          value=false",
                "        )"
        );
    }
    @Test
    public void test_for_field_boolean2() {
        expectedConsecutiveLines = List.of(
                "  private boolean boolean2;",
                "    descriptor: Z",
                "    flags: (0x0002) ACC_PRIVATE",
                "    RuntimeVisibleAnnotations:",
                "      0: #72(#13=Z#26)",
                "        com.test.attribute.cases.rva.CaseBoolean(",
                "          value=true",
                "        )"
        );
    }
    @Test
    public void test_for_field_aString() {
        expectedConsecutiveLines = List.of(
                "  private java.lang.String aString;",
                "    descriptor: Ljava/lang/String;",
                "    flags: (0x0002) ACC_PRIVATE",
                "    RuntimeVisibleAnnotations:",
                "      0: #76(#13=[@#77(#13=s#78),@#77(#13=s#79),@#77(#13=s#80),@#77(#13=s#81)])",
                "        com.test.attribute.cases.rva.CaseStringContainer(",
                "          value=[@com.test.attribute.cases.rva.CaseString(",
                "            value=\" left\"",
                "          ),@com.test.attribute.cases.rva.CaseString(",
                "            value=\" middle \"",
                "          ),@com.test.attribute.cases.rva.CaseString(",
                "            value=\" right\"",
                "          ),@com.test.attribute.cases.rva.CaseString(",
                "            value=\"Hello   world \\t \\t \"",
                "          )]",
                "        )"
        );
    }
}
