package com.test.attribute.signature.standard;

import com.test.field.FieldPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class EnumSetFieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.util.EnumSet"));
    }

    @Test
    public void test_for_field_elementType() {
        expectedConsecutiveLines = List.of(
                "  final transient java.lang.Class<E> elementType;",
                "    descriptor: Ljava/lang/Class;",
                "    flags: (0x0090) ACC_FINAL, ACC_TRANSIENT",
                "    Signature: #168                         // Ljava/lang/Class<TE;>;"
        );
    }
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
