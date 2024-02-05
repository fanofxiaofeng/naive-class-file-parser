package com.test.field.standard;

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
    public void test_for_field_serialVersionUID() {
        expectedConsecutiveLines = List.of(
                "  private static final long serialVersionUID;",
                "    descriptor: J",
                "    flags: (0x001a) ACC_PRIVATE, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: long 362498820763181265l"
        );
    }
    @Test
    public void test_for_field_DEFAULT_INITIAL_CAPACITY() {
        expectedConsecutiveLines = List.of(
                "  static final int DEFAULT_INITIAL_CAPACITY;",
                "    descriptor: I",
                "    flags: (0x0018) ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 16"
        );
    }
    @Test
    public void test_for_field_MAXIMUM_CAPACITY() {
        expectedConsecutiveLines = List.of(
                "  static final int MAXIMUM_CAPACITY;",
                "    descriptor: I",
                "    flags: (0x0018) ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 1073741824"
        );
    }
    @Test
    public void test_for_field_DEFAULT_LOAD_FACTOR() {
        expectedConsecutiveLines = List.of(
                "  static final float DEFAULT_LOAD_FACTOR;",
                "    descriptor: F",
                "    flags: (0x0018) ACC_STATIC, ACC_FINAL",
                "    ConstantValue: float 0.75f"
        );
    }
    @Test
    public void test_for_field_TREEIFY_THRESHOLD() {
        expectedConsecutiveLines = List.of(
                "  static final int TREEIFY_THRESHOLD;",
                "    descriptor: I",
                "    flags: (0x0018) ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 8"
        );
    }
    @Test
    public void test_for_field_UNTREEIFY_THRESHOLD() {
        expectedConsecutiveLines = List.of(
                "  static final int UNTREEIFY_THRESHOLD;",
                "    descriptor: I",
                "    flags: (0x0018) ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 6"
        );
    }
    @Test
    public void test_for_field_MIN_TREEIFY_CAPACITY() {
        expectedConsecutiveLines = List.of(
                "  static final int MIN_TREEIFY_CAPACITY;",
                "    descriptor: I",
                "    flags: (0x0018) ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 64"
        );
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
    @Test
    public void test_for_field_size() {
        expectedConsecutiveLines = List.of(
                "  transient int size;",
                "    descriptor: I",
                "    flags: (0x0080) ACC_TRANSIENT"
        );
    }
    @Test
    public void test_for_field_modCount() {
        expectedConsecutiveLines = List.of(
                "  transient int modCount;",
                "    descriptor: I",
                "    flags: (0x0080) ACC_TRANSIENT"
        );
    }
    @Test
    public void test_for_field_threshold() {
        expectedConsecutiveLines = List.of(
                "  int threshold;",
                "    descriptor: I",
                "    flags: (0x0000)"
        );
    }
    @Test
    public void test_for_field_loadFactor() {
        expectedConsecutiveLines = List.of(
                "  final float loadFactor;",
                "    descriptor: F",
                "    flags: (0x0010) ACC_FINAL"
        );
    }
}
