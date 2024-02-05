package com.test.attribute.signature.standard;

import com.test.field.FieldPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class HashMapFieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.util.HashMap"));
    }

    @Test
    public void test_for_field_table() {
        expectedConsecutiveLines = List.of(
                "  transient java.util.HashMap$Node<K, V>[] table;",
                "    descriptor: [Ljava/util/HashMap$Node;",
                "    flags: (0x0080) ACC_TRANSIENT",
                "    Signature: #412                         // [Ljava/util/HashMap$Node<TK;TV;>;"
        );
    }
    @Test
    public void test_for_field_entrySet() {
        expectedConsecutiveLines = List.of(
                "  transient java.util.Set<java.util.Map$Entry<K, V>> entrySet;",
                "    descriptor: Ljava/util/Set;",
                "    flags: (0x0080) ACC_TRANSIENT",
                "    Signature: #413                         // Ljava/util/Set<Ljava/util/Map$Entry<TK;TV;>;>;"
        );
    }
}
