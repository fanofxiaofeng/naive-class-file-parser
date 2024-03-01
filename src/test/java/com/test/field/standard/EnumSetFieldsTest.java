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
public class EnumSetFieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.util.EnumSet"));
    }

    @ExpectedPredefinedAttribute(ConstantValueAttribute.class)
    @Test
    public void test_for_field_serialVersionUID() {
        expectedConsecutiveLines = List.of(
                "  private static final long serialVersionUID;",
                "    descriptor: J",
                "    flags: (0x001a) ACC_PRIVATE, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: long 1009687484059888093l"
        );
    }

    @ExpectedPredefinedAttribute(SignatureAttribute.class)
    @Test
    public void test_for_field_elementType() {
        expectedConsecutiveLines = List.of(
                "  final transient java.lang.Class<E> elementType;",
                "    descriptor: Ljava/lang/Class;",
                "    flags: (0x0090) ACC_FINAL, ACC_TRANSIENT",
                "    Signature: #168                         // Ljava/lang/Class<TE;>;"
        );
    }

    @ExpectedPredefinedAttribute(SignatureAttribute.class)
    @Test
    public void test_for_field_universe() {
        expectedConsecutiveLines = List.of(
                "  final transient java.lang.Enum<?>[] universe;",
                "    descriptor: [Ljava/lang/Enum;",
                "    flags: (0x0090) ACC_FINAL, ACC_TRANSIENT",
                "    Signature: #169                         // [Ljava/lang/Enum<*>;"
        );
    }
}
