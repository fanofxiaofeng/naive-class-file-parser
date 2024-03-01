package com.test.field.standard;

import com.study.type.info.attribute.ConstantValueAttribute;
import com.study.type.info.attribute.SignatureAttribute;
import com.test.annotations.ExpectedPredefinedAttribute;
import com.test.annotations.GeneratedBy;
import com.test.field.FieldPresenterTestBase;
import com.test.field.FieldTestGenerator;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(FieldTestGenerator.class)
public class LinkedListFieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.util.LinkedList"));
    }

    @Test
    public void test_for_field_size() {
        expectedConsecutiveLines = List.of(
                "  transient int size;",
                "    descriptor: I",
                "    flags: (0x0080) ACC_TRANSIENT"
        );
    }

    @ExpectedPredefinedAttribute(SignatureAttribute.class)
    @Test
    public void test_for_field_first() {
        expectedConsecutiveLines = List.of(
                "  transient java.util.LinkedList$Node<E> first;",
                "    descriptor: Ljava/util/LinkedList$Node;",
                "    flags: (0x0080) ACC_TRANSIENT",
                "    Signature: #242                         // Ljava/util/LinkedList$Node<TE;>;"
        );
    }

    @ExpectedPredefinedAttribute(SignatureAttribute.class)
    @Test
    public void test_for_field_last() {
        expectedConsecutiveLines = List.of(
                "  transient java.util.LinkedList$Node<E> last;",
                "    descriptor: Ljava/util/LinkedList$Node;",
                "    flags: (0x0080) ACC_TRANSIENT",
                "    Signature: #242                         // Ljava/util/LinkedList$Node<TE;>;"
        );
    }

    @ExpectedPredefinedAttribute(ConstantValueAttribute.class)
    @Test
    public void test_for_field_serialVersionUID() {
        expectedConsecutiveLines = List.of(
                "  private static final long serialVersionUID;",
                "    descriptor: J",
                "    flags: (0x001a) ACC_PRIVATE, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: long 876323262645176354l"
        );
    }
}
