package com.test.attribute.signature.standard;

import com.test.field.FieldPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class LinkedHashMapFieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.util.LinkedHashMap"));
    }

    @Test
    public void test_for_field_head() {
        expectedConsecutiveLines = List.of(
                "  transient java.util.LinkedHashMap$Entry<K, V> head;",
                "    descriptor: Ljava/util/LinkedHashMap$Entry;",
                "    flags: (0x0080) ACC_TRANSIENT",
                "    Signature: #213                         // Ljava/util/LinkedHashMap$Entry<TK;TV;>;"
        );
    }
    @Test
    public void test_for_field_tail() {
        expectedConsecutiveLines = List.of(
                "  transient java.util.LinkedHashMap$Entry<K, V> tail;",
                "    descriptor: Ljava/util/LinkedHashMap$Entry;",
                "    flags: (0x0080) ACC_TRANSIENT",
                "    Signature: #213                         // Ljava/util/LinkedHashMap$Entry<TK;TV;>;"
        );
    }
}
