package com.test.method.specific;

import com.test.annotations.GeneratedBy;
import com.test.method.MethodPresenterTestBase;
import com.test.method.MethodTestGenerator;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(MethodTestGenerator.class)
public class EnumCase$TempMethodsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.method.EnumCase$Temp"));
    }

    @Test
    public void test_for_method_1() {
        expectedConsecutiveLines = List.of(
                "  public static com.test.cases.method.EnumCase$Temp[] values();",
                "    descriptor: ()[Lcom/test/cases/method/EnumCase$Temp;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC"
        );
    }

    @Test
    public void test_for_method_2() {
        expectedConsecutiveLines = List.of(
                "  public static com.test.cases.method.EnumCase$Temp valueOf(java.lang.String);",
                "    descriptor: (Ljava/lang/String;)Lcom/test/cases/method/EnumCase$Temp;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC"
        );
    }

    @Test
    public void test_for_method_3() {
        expectedConsecutiveLines = List.of(
                "  private com.test.cases.method.EnumCase$Temp(int...);",
                "    descriptor: (Ljava/lang/String;I[I)V",
                "    flags: (0x0082) ACC_PRIVATE, ACC_VARARGS",
                "    Signature: #54                          // ([I)V"
        );
    }

    @Test
    public void test_for_method_4() {
        expectedConsecutiveLines = List.of(
                "  private static com.test.cases.method.EnumCase$Temp[] $values();",
                "    descriptor: ()[Lcom/test/cases/method/EnumCase$Temp;",
                "    flags: (0x100a) ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC"
        );
    }
}
