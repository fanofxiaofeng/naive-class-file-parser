package com.test.field.specific;

import com.test.field.FieldPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ClassAccessFlagsFieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.study.constants.ClassAccessFlags"));
    }

    @Test
    public void test_for_field_ACC_PUBLIC() {
        expectedConsecutiveLines = List.of(
                "  public static final com.study.constants.ClassAccessFlags ACC_PUBLIC;",
                "    descriptor: Lcom/study/constants/ClassAccessFlags;",
                "    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM"
        );
    }
    @Test
    public void test_for_field_ACC_FINAL() {
        expectedConsecutiveLines = List.of(
                "  public static final com.study.constants.ClassAccessFlags ACC_FINAL;",
                "    descriptor: Lcom/study/constants/ClassAccessFlags;",
                "    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM"
        );
    }
    @Test
    public void test_for_field_ACC_SUPER() {
        expectedConsecutiveLines = List.of(
                "  public static final com.study.constants.ClassAccessFlags ACC_SUPER;",
                "    descriptor: Lcom/study/constants/ClassAccessFlags;",
                "    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM"
        );
    }
    @Test
    public void test_for_field_ACC_INTERFACE() {
        expectedConsecutiveLines = List.of(
                "  public static final com.study.constants.ClassAccessFlags ACC_INTERFACE;",
                "    descriptor: Lcom/study/constants/ClassAccessFlags;",
                "    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM"
        );
    }
    @Test
    public void test_for_field_ACC_ABSTRACT() {
        expectedConsecutiveLines = List.of(
                "  public static final com.study.constants.ClassAccessFlags ACC_ABSTRACT;",
                "    descriptor: Lcom/study/constants/ClassAccessFlags;",
                "    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM"
        );
    }
    @Test
    public void test_for_field_ACC_SYNTHETIC() {
        expectedConsecutiveLines = List.of(
                "  public static final com.study.constants.ClassAccessFlags ACC_SYNTHETIC;",
                "    descriptor: Lcom/study/constants/ClassAccessFlags;",
                "    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM"
        );
    }
    @Test
    public void test_for_field_ACC_ANNOTATION() {
        expectedConsecutiveLines = List.of(
                "  public static final com.study.constants.ClassAccessFlags ACC_ANNOTATION;",
                "    descriptor: Lcom/study/constants/ClassAccessFlags;",
                "    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM"
        );
    }
    @Test
    public void test_for_field_ACC_ENUM() {
        expectedConsecutiveLines = List.of(
                "  public static final com.study.constants.ClassAccessFlags ACC_ENUM;",
                "    descriptor: Lcom/study/constants/ClassAccessFlags;",
                "    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM"
        );
    }
    @Test
    public void test_for_field_ACC_MODULE() {
        expectedConsecutiveLines = List.of(
                "  public static final com.study.constants.ClassAccessFlags ACC_MODULE;",
                "    descriptor: Lcom/study/constants/ClassAccessFlags;",
                "    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM"
        );
    }
    @Test
    public void test_for_field_flag() {
        expectedConsecutiveLines = List.of(
                "  private final int flag;",
                "    descriptor: I",
                "    flags: (0x0012) ACC_PRIVATE, ACC_FINAL"
        );
    }
    @Test
    public void test_for_field_$VALUES() {
        expectedConsecutiveLines = List.of(
                "  private static final com.study.constants.ClassAccessFlags[] $VALUES;",
                "    descriptor: [Lcom/study/constants/ClassAccessFlags;",
                "    flags: (0x101a) ACC_PRIVATE, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC"
        );
    }
}
