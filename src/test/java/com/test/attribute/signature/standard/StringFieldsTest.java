package com.test.attribute.signature.standard;

import com.test.field.FieldPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class StringFieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.String"));
    }

    @Test
    public void test_for_field_CASE_INSENSITIVE_ORDER() {
        expectedConsecutiveLines = List.of(
                "  public static final java.util.Comparator<java.lang.String> CASE_INSENSITIVE_ORDER;",
                "    descriptor: Ljava/util/Comparator;",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    Signature: #1117                        // Ljava/util/Comparator<Ljava/lang/String;>;"
        );
    }
}
