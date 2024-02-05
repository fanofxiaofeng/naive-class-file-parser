package com.test.field.standard;

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
    public void test_for_field_serialVersionUID() {
        expectedConsecutiveLines = List.of(
                "  private static final long serialVersionUID;",
                "    descriptor: J",
                "    flags: (0x001a) ACC_PRIVATE, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: long 3801124242820219131l"
        );
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
    @Test
    public void test_for_field_accessOrder() {
        expectedConsecutiveLines = List.of(
                "  final boolean accessOrder;",
                "    descriptor: Z",
                "    flags: (0x0010) ACC_FINAL"
        );
    }
    @Test
    public void test_for_field_PUT_NORM() {
        expectedConsecutiveLines = List.of(
                "  static final int PUT_NORM;",
                "    descriptor: I",
                "    flags: (0x0018) ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 0"
        );
    }
    @Test
    public void test_for_field_PUT_FIRST() {
        expectedConsecutiveLines = List.of(
                "  static final int PUT_FIRST;",
                "    descriptor: I",
                "    flags: (0x0018) ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 1"
        );
    }
    @Test
    public void test_for_field_PUT_LAST() {
        expectedConsecutiveLines = List.of(
                "  static final int PUT_LAST;",
                "    descriptor: I",
                "    flags: (0x0018) ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 2"
        );
    }
    @Test
    public void test_for_field_putMode() {
        expectedConsecutiveLines = List.of(
                "  transient int putMode;",
                "    descriptor: I",
                "    flags: (0x0080) ACC_TRANSIENT"
        );
    }
}
