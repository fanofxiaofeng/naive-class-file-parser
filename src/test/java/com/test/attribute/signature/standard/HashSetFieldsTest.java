package com.test.attribute.signature.standard;

import com.study.type.info.attribute.SignatureAttribute;
import com.test.annotations.ExpectedPredefinedAttribute;
import com.test.annotations.GeneratedBy;
import com.test.attribute.signature.TestGenerator;
import com.test.field.FieldPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(TestGenerator.class)
public class HashSetFieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.util.HashSet"));
    }

    @ExpectedPredefinedAttribute(SignatureAttribute.class)
    @Test
    public void test_for_field_map() {
        expectedConsecutiveLines = List.of(
                "  transient java.util.HashMap<E, java.lang.Object> map;",
                "    descriptor: Ljava/util/HashMap;",
                "    flags: (0x0080) ACC_TRANSIENT",
                "    Signature: #236                         // Ljava/util/HashMap<TE;Ljava/lang/Object;>;"
        );
    }
}
