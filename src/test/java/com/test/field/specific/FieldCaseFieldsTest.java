package com.test.field.specific;

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
public class FieldCaseFieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.FieldCase"));
    }

    @ExpectedPredefinedAttribute(SignatureAttribute.class)
    @Test
    public void test_for_field_c2() {
        expectedConsecutiveLines = List.of(
                "  private com.test.cases.FieldCase<T>.C2<java.lang.String>.C22<java.lang.Integer> c2;",
                "    descriptor: Lcom/test/cases/FieldCase$C2$C22;",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Signature: #17                          // Lcom/test/cases/FieldCase<TT;>.C2<Ljava/lang/String;>.C22<Ljava/lang/Integer;>;"
        );
    }
}
