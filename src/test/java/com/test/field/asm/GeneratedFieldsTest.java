package com.test.field.asm;

import com.study.type.info.attribute.SyntheticAttribute;
import com.test.annotations.ExpectedPredefinedAttribute;
import com.test.annotations.GeneratedBy;
import com.test.field.FieldPresenterTestBase;
import com.test.field.FieldTestGenerator;
import com.test.util.GeneratedClassClassLoader;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(FieldTestGenerator.class)
public class GeneratedFieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        ClassLoader classLoader = new GeneratedClassClassLoader();
        Class<?> clazz = classLoader.loadClass("com.generated.attribute.synthetic.Generated");
        buildRealLines(clazz);
    }

    @ExpectedPredefinedAttribute(SyntheticAttribute.class)
    @Test
    public void test_for_field_fieldOne() {
        expectedConsecutiveLines = List.of(
                "  private int fieldOne;",
                "    descriptor: I",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Synthetic: true"
        );
    }
}
