package com.test.attribute.signature.standard;

import com.test.field.FieldPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class LinkedListFieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.util.LinkedList"));
    }

    @Test
    public void test_for_field_first() {
        expectedConsecutiveLines = List.of(
                "  transient java.util.LinkedList$Node<E> first;",
                "    descriptor: Ljava/util/LinkedList$Node;",
                "    flags: (0x0080) ACC_TRANSIENT",
                "    Signature: #242                         // Ljava/util/LinkedList$Node<TE;>;"
        );
    }
    @Test
    public void test_for_field_last() {
        expectedConsecutiveLines = List.of(
                "  transient java.util.LinkedList$Node<E> last;",
                "    descriptor: Ljava/util/LinkedList$Node;",
                "    flags: (0x0080) ACC_TRANSIENT",
                "    Signature: #242                         // Ljava/util/LinkedList$Node<TE;>;"
        );
    }
}
