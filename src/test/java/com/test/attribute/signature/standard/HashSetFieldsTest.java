package com.test.attribute.signature.standard;

import com.test.field.FieldPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class HashSetFieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.util.HashSet"));
    }

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
