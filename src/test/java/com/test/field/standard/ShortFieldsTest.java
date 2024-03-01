package com.test.field.standard;

import com.study.type.info.attribute.ConstantValueAttribute;
import com.study.type.info.attribute.SignatureAttribute;
import com.test.annotations.ExpectedPredefinedAttribute;
import com.test.annotations.GeneratedBy;
import com.test.field.FieldPresenterTestBase;
import com.test.field.FieldTestGenerator;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(FieldTestGenerator.class)
public class ShortFieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Short"));
    }

    @ExpectedPredefinedAttribute(ConstantValueAttribute.class)
    @Test
    public void test_for_field_MIN_VALUE() {
        expectedConsecutiveLines = List.of(
                "  public static final short MIN_VALUE;",
                "    descriptor: S",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int -32768"
        );
    }

    @ExpectedPredefinedAttribute(ConstantValueAttribute.class)
    @Test
    public void test_for_field_MAX_VALUE() {
        expectedConsecutiveLines = List.of(
                "  public static final short MAX_VALUE;",
                "    descriptor: S",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 32767"
        );
    }

    @ExpectedPredefinedAttribute(SignatureAttribute.class)
    @Test
    public void test_for_field_TYPE() {
        expectedConsecutiveLines = List.of(
                "  public static final java.lang.Class<java.lang.Short> TYPE;",
                "    descriptor: Ljava/lang/Class;",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    Signature: #154                         // Ljava/lang/Class<Ljava/lang/Short;>;"
        );
    }

    @Test
    public void test_for_field_value() {
        expectedConsecutiveLines = List.of(
                "  private final short value;",
                "    descriptor: S",
                "    flags: (0x0012) ACC_PRIVATE, ACC_FINAL"
        );
    }

    @ExpectedPredefinedAttribute(ConstantValueAttribute.class)
    @Test
    public void test_for_field_SIZE() {
        expectedConsecutiveLines = List.of(
                "  public static final int SIZE;",
                "    descriptor: I",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 16"
        );
    }

    @ExpectedPredefinedAttribute(ConstantValueAttribute.class)
    @Test
    public void test_for_field_BYTES() {
        expectedConsecutiveLines = List.of(
                "  public static final int BYTES;",
                "    descriptor: I",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 2"
        );
    }

    @ExpectedPredefinedAttribute(ConstantValueAttribute.class)
    @Test
    public void test_for_field_serialVersionUID() {
        expectedConsecutiveLines = List.of(
                "  private static final long serialVersionUID;",
                "    descriptor: J",
                "    flags: (0x001a) ACC_PRIVATE, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: long 7515723908773894738l"
        );
    }
}
