package com.test.field.standard;

import com.study.type.info.attribute.ConstantValueAttribute;
import com.test.annotations.ExpectedPredefinedAttribute;
import com.test.annotations.GeneratedBy;
import com.test.field.FieldPresenterTestBase;
import com.test.field.FieldTestGenerator;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(FieldTestGenerator.class)
public class ArrayListFieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.util.ArrayList"));
    }

    @ExpectedPredefinedAttribute(ConstantValueAttribute.class)
    @Test
    public void test_for_field_serialVersionUID() {
        expectedConsecutiveLines = List.of(
                "  private static final long serialVersionUID;",
                "    descriptor: J",
                "    flags: (0x001a) ACC_PRIVATE, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: long 8683452581122892189l"
        );
    }

    @ExpectedPredefinedAttribute(ConstantValueAttribute.class)
    @Test
    public void test_for_field_DEFAULT_CAPACITY() {
        expectedConsecutiveLines = List.of(
                "  private static final int DEFAULT_CAPACITY;",
                "    descriptor: I",
                "    flags: (0x001a) ACC_PRIVATE, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 10"
        );
    }

    @Test
    public void test_for_field_EMPTY_ELEMENTDATA() {
        expectedConsecutiveLines = List.of(
                "  private static final java.lang.Object[] EMPTY_ELEMENTDATA;",
                "    descriptor: [Ljava/lang/Object;",
                "    flags: (0x001a) ACC_PRIVATE, ACC_STATIC, ACC_FINAL"
        );
    }

    @Test
    public void test_for_field_DEFAULTCAPACITY_EMPTY_ELEMENTDATA() {
        expectedConsecutiveLines = List.of(
                "  private static final java.lang.Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA;",
                "    descriptor: [Ljava/lang/Object;",
                "    flags: (0x001a) ACC_PRIVATE, ACC_STATIC, ACC_FINAL"
        );
    }

    @Test
    public void test_for_field_elementData() {
        expectedConsecutiveLines = List.of(
                "  transient java.lang.Object[] elementData;",
                "    descriptor: [Ljava/lang/Object;",
                "    flags: (0x0080) ACC_TRANSIENT"
        );
    }

    @Test
    public void test_for_field_size() {
        expectedConsecutiveLines = List.of(
                "  private int size;",
                "    descriptor: I",
                "    flags: (0x0002) ACC_PRIVATE"
        );
    }
}
