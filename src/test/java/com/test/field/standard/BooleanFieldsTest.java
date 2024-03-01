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
public class BooleanFieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Boolean"));
    }

    @Test
    public void test_for_field_TRUE() {
        expectedConsecutiveLines = List.of(
                "  public static final java.lang.Boolean TRUE;",
                "    descriptor: Ljava/lang/Boolean;",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL"
        );
    }

    @Test
    public void test_for_field_FALSE() {
        expectedConsecutiveLines = List.of(
                "  public static final java.lang.Boolean FALSE;",
                "    descriptor: Ljava/lang/Boolean;",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL"
        );
    }

    @ExpectedPredefinedAttribute(SignatureAttribute.class)
    @Test
    public void test_for_field_TYPE() {
        expectedConsecutiveLines = List.of(
                "  public static final java.lang.Class<java.lang.Boolean> TYPE;",
                "    descriptor: Ljava/lang/Class;",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    Signature: #96                          // Ljava/lang/Class<Ljava/lang/Boolean;>;"
        );
    }

    @Test
    public void test_for_field_value() {
        expectedConsecutiveLines = List.of(
                "  private final boolean value;",
                "    descriptor: Z",
                "    flags: (0x0012) ACC_PRIVATE, ACC_FINAL"
        );
    }

    @ExpectedPredefinedAttribute(ConstantValueAttribute.class)
    @Test
    public void test_for_field_serialVersionUID() {
        expectedConsecutiveLines = List.of(
                "  private static final long serialVersionUID;",
                "    descriptor: J",
                "    flags: (0x001a) ACC_PRIVATE, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: long -3665804199014368530l"
        );
    }
}
