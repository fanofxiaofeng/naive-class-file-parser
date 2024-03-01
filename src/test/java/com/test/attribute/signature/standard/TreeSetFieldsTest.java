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
public class TreeSetFieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.util.TreeSet"));
    }

    @ExpectedPredefinedAttribute(SignatureAttribute.class)
    @Test
    public void test_for_field_m() {
        expectedConsecutiveLines = List.of(
                "  private transient java.util.NavigableMap<E, java.lang.Object> m;",
                "    descriptor: Ljava/util/NavigableMap;",
                "    flags: (0x0082) ACC_PRIVATE, ACC_TRANSIENT",
                "    Signature: #222                         // Ljava/util/NavigableMap<TE;Ljava/lang/Object;>;"
        );
    }
}
