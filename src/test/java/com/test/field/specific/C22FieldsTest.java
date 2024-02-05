package com.test.field.specific;

import com.test.field.FieldPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class C22FieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.present.C22"));
    }

    @Test
    public void test_for_field_f1() {
        expectedConsecutiveLines = List.of(
                "  private int f1;",
                "    descriptor: I",
                "    flags: (0x0002) ACC_PRIVATE"
        );
    }
    @Test
    public void test_for_field_f2() {
        expectedConsecutiveLines = List.of(
                "  private long f2;",
                "    descriptor: J",
                "    flags: (0x0002) ACC_PRIVATE"
        );
    }
    @Test
    public void test_for_field_f3() {
        expectedConsecutiveLines = List.of(
                "  private float f3;",
                "    descriptor: F",
                "    flags: (0x0002) ACC_PRIVATE"
        );
    }
    @Test
    public void test_for_field_f4() {
        expectedConsecutiveLines = List.of(
                "  private double f4;",
                "    descriptor: D",
                "    flags: (0x0002) ACC_PRIVATE"
        );
    }
    @Test
    public void test_for_field_f5() {
        expectedConsecutiveLines = List.of(
                "  private java.lang.String f5;",
                "    descriptor: Ljava/lang/String;",
                "    flags: (0x0002) ACC_PRIVATE"
        );
    }
    @Test
    public void test_for_field_f6() {
        expectedConsecutiveLines = List.of(
                "  private java.util.Map f6;",
                "    descriptor: Ljava/util/Map;",
                "    flags: (0x0002) ACC_PRIVATE"
        );
    }
    @Test
    public void test_for_field_f7() {
        expectedConsecutiveLines = List.of(
                "  private java.util.List f7;",
                "    descriptor: Ljava/util/List;",
                "    flags: (0x0002) ACC_PRIVATE"
        );
    }
    @Test
    public void test_for_field_f8() {
        expectedConsecutiveLines = List.of(
                "  private com.test.present.C22$Level2 f8;",
                "    descriptor: Lcom/test/present/C22$Level2;",
                "    flags: (0x0002) ACC_PRIVATE"
        );
    }
    @Test
    public void test_for_field_f9() {
        expectedConsecutiveLines = List.of(
                "  private com.test.present.C22$Level2$Level3 f9;",
                "    descriptor: Lcom/test/present/C22$Level2$Level3;",
                "    flags: (0x0002) ACC_PRIVATE"
        );
    }
    @Test
    public void test_for_field_f10() {
        expectedConsecutiveLines = List.of(
                "  private static com.test.present.C22$SC f10;",
                "    descriptor: Lcom/test/present/C22$SC;",
                "    flags: (0x000a) ACC_PRIVATE, ACC_STATIC"
        );
    }
    @Test
    public void test_for_field_f11() {
        expectedConsecutiveLines = List.of(
                "  int[][][][][][][] f11;",
                "    descriptor: [[[[[[[I",
                "    flags: (0x0000)"
        );
    }
    @Test
    public void test_for_field_f12() {
        expectedConsecutiveLines = List.of(
                "  com.test.present.C22$Level2$Level3[][][][][][][][][][][] f12;",
                "    descriptor: [[[[[[[[[[[Lcom/test/present/C22$Level2$Level3;",
                "    flags: (0x0000)"
        );
    }
    @Test
    public void test_for_field_f13() {
        expectedConsecutiveLines = List.of(
                "  java.util.List[][][][][][] f13;",
                "    descriptor: [[[[[[Ljava/util/List;",
                "    flags: (0x0000)"
        );
    }
    @Test
    public void test_for_field_f14() {
        expectedConsecutiveLines = List.of(
                "  public static final boolean f14;",
                "    descriptor: Z",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 0"
        );
    }
    @Test
    public void test_for_field_f15() {
        expectedConsecutiveLines = List.of(
                "  protected char f15;",
                "    descriptor: C",
                "    flags: (0x0004) ACC_PROTECTED"
        );
    }
    @Test
    public void test_for_field_f16() {
        expectedConsecutiveLines = List.of(
                "  protected volatile transient byte f16;",
                "    descriptor: B",
                "    flags: (0x00c4) ACC_PROTECTED, ACC_VOLATILE, ACC_TRANSIENT"
        );
    }
}
