package com.test.attribute.signature.standard;

import com.test.field.FieldPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class TreeMapFieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.util.TreeMap"));
    }

    @Test
    public void test_for_field_comparator() {
        expectedConsecutiveLines = List.of(
                "  private final java.util.Comparator<? super K> comparator;",
                "    descriptor: Ljava/util/Comparator;",
                "    flags: (0x0012) ACC_PRIVATE, ACC_FINAL",
                "    Signature: #408                         // Ljava/util/Comparator<-TK;>;"
        );
    }
    @Test
    public void test_for_field_root() {
        expectedConsecutiveLines = List.of(
                "  private transient java.util.TreeMap$Entry<K, V> root;",
                "    descriptor: Ljava/util/TreeMap$Entry;",
                "    flags: (0x0082) ACC_PRIVATE, ACC_TRANSIENT",
                "    Signature: #409                         // Ljava/util/TreeMap$Entry<TK;TV;>;"
        );
    }
    @Test
    public void test_for_field_entrySet() {
        expectedConsecutiveLines = List.of(
                "  private transient java.util.TreeMap<K, V>.EntrySet entrySet;",
                "    descriptor: Ljava/util/TreeMap$EntrySet;",
                "    flags: (0x0082) ACC_PRIVATE, ACC_TRANSIENT",
                "    Signature: #410                         // Ljava/util/TreeMap<TK;TV;>.EntrySet;"
        );
    }
    @Test
    public void test_for_field_navigableKeySet() {
        expectedConsecutiveLines = List.of(
                "  private transient java.util.TreeMap$KeySet<K> navigableKeySet;",
                "    descriptor: Ljava/util/TreeMap$KeySet;",
                "    flags: (0x0082) ACC_PRIVATE, ACC_TRANSIENT",
                "    Signature: #411                         // Ljava/util/TreeMap$KeySet<TK;>;"
        );
    }
    @Test
    public void test_for_field_descendingMap() {
        expectedConsecutiveLines = List.of(
                "  private transient java.util.NavigableMap<K, V> descendingMap;",
                "    descriptor: Ljava/util/NavigableMap;",
                "    flags: (0x0082) ACC_PRIVATE, ACC_TRANSIENT",
                "    Signature: #412                         // Ljava/util/NavigableMap<TK;TV;>;"
        );
    }
}
