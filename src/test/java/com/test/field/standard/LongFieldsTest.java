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
public class LongFieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Long"));
    }

    @ExpectedPredefinedAttribute(ConstantValueAttribute.class)
    @Test
    public void test_for_field_MIN_VALUE() {
        expectedConsecutiveLines = List.of(
                "  public static final long MIN_VALUE;",
                "    descriptor: J",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: long -9223372036854775808l"
        );
    }

    @ExpectedPredefinedAttribute(ConstantValueAttribute.class)
    @Test
    public void test_for_field_MAX_VALUE() {
        expectedConsecutiveLines = List.of(
                "  public static final long MAX_VALUE;",
                "    descriptor: J",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: long 9223372036854775807l"
        );
    }

    @ExpectedPredefinedAttribute(SignatureAttribute.class)
    @Test
    public void test_for_field_TYPE() {
        expectedConsecutiveLines = List.of(
                "  public static final java.lang.Class<java.lang.Long> TYPE;",
                "    descriptor: Ljava/lang/Class;",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    Signature: #375                         // Ljava/lang/Class<Ljava/lang/Long;>;"
        );
    }

    @Test
    public void test_for_field_value() {
        expectedConsecutiveLines = List.of(
                "  private final long value;",
                "    descriptor: J",
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
                "    ConstantValue: int 64"
        );
    }

    @ExpectedPredefinedAttribute(ConstantValueAttribute.class)
    @Test
    public void test_for_field_BYTES() {
        expectedConsecutiveLines = List.of(
                "  public static final int BYTES;",
                "    descriptor: I",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 8"
        );
    }

    @ExpectedPredefinedAttribute(ConstantValueAttribute.class)
    @Test
    public void test_for_field_serialVersionUID() {
        expectedConsecutiveLines = List.of(
                "  private static final long serialVersionUID;",
                "    descriptor: J",
                "    flags: (0x001a) ACC_PRIVATE, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: long 4290774380558885855l"
        );
    }
}
