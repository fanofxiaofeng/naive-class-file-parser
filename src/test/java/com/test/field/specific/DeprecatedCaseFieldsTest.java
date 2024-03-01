package com.test.field.specific;

import com.study.type.info.attribute.DeprecatedAttribute;
import com.study.type.info.attribute.RuntimeVisibleAnnotationsAttribute;
import com.test.annotations.ExpectedPredefinedAttribute;
import com.test.annotations.GeneratedBy;
import com.test.field.FieldPresenterTestBase;
import com.test.field.FieldTestGenerator;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(FieldTestGenerator.class)
public class DeprecatedCaseFieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.attribute.cases.DeprecatedCase"));
    }

    @ExpectedPredefinedAttribute(DeprecatedAttribute.class)
    @ExpectedPredefinedAttribute(RuntimeVisibleAnnotationsAttribute.class)
    @Test
    public void test_for_field_a() {
        expectedConsecutiveLines = List.of(
                "  private int a;",
                "    descriptor: I",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Deprecated: true",
                "    RuntimeVisibleAnnotations:",
                "      0: #13()",
                "        java.lang.Deprecated"
        );
    }

    @ExpectedPredefinedAttribute(DeprecatedAttribute.class)
    @ExpectedPredefinedAttribute(RuntimeVisibleAnnotationsAttribute.class)
    @Test
    public void test_for_field_b() {
        expectedConsecutiveLines = List.of(
                "  private static int b;",
                "    descriptor: I",
                "    flags: (0x000a) ACC_PRIVATE, ACC_STATIC",
                "    Deprecated: true",
                "    RuntimeVisibleAnnotations:",
                "      0: #13()",
                "        java.lang.Deprecated"
        );
    }
}
