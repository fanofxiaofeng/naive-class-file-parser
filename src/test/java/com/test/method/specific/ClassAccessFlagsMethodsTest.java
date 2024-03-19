package com.test.method.specific;

import com.test.annotations.GeneratedBy;
import com.test.method.MethodPresenterTestBase;
import com.test.method.MethodTestGenerator;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(MethodTestGenerator.class)
public class ClassAccessFlagsMethodsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.study.constants.ClassAccessFlags"));
    }

    @Test
    public void test_for_method_1() {
        expectedConsecutiveLines = List.of(
                "  public static com.study.constants.ClassAccessFlags[] values();",
                "    descriptor: ()[Lcom/study/constants/ClassAccessFlags;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC"
        );
    }

    @Test
    public void test_for_method_2() {
        expectedConsecutiveLines = List.of(
                "  public static com.study.constants.ClassAccessFlags valueOf(java.lang.String);",
                "    descriptor: (Ljava/lang/String;)Lcom/study/constants/ClassAccessFlags;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC"
        );
    }

    @Test
    public void test_for_method_3() {
        expectedConsecutiveLines = List.of(
                "  private com.study.constants.ClassAccessFlags(int);",
                "    descriptor: (Ljava/lang/String;II)V",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Signature: #85                          // (I)V"
        );
    }

    @Test
    public void test_for_method_4() {
        expectedConsecutiveLines = List.of(
                "  public int getFlag();",
                "    descriptor: ()I",
                "    flags: (0x0001) ACC_PUBLIC"
        );
    }

    @Test
    public void test_for_method_5() {
        expectedConsecutiveLines = List.of(
                "  private static com.study.constants.ClassAccessFlags[] $values();",
                "    descriptor: ()[Lcom/study/constants/ClassAccessFlags;",
                "    flags: (0x100a) ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC"
        );
    }
}
