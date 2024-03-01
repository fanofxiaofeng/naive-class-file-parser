package com.test.field.standard;

import com.study.type.info.attribute.ConstantValueAttribute;
import com.study.type.info.attribute.RuntimeVisibleAnnotationsAttribute;
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
public class StringFieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.String"));
    }

    @ExpectedPredefinedAttribute(RuntimeVisibleAnnotationsAttribute.class)
    @Test
    public void test_for_field_value() {
        expectedConsecutiveLines = List.of(
                "  private final byte[] value;",
                "    descriptor: [B",
                "    flags: (0x0012) ACC_PRIVATE, ACC_FINAL",
                "    RuntimeVisibleAnnotations:",
                "      0: #1108()",
                "        jdk.internal.vm.annotation.Stable"
        );
    }

    @Test
    public void test_for_field_coder() {
        expectedConsecutiveLines = List.of(
                "  private final byte coder;",
                "    descriptor: B",
                "    flags: (0x0012) ACC_PRIVATE, ACC_FINAL"
        );
    }

    @Test
    public void test_for_field_hash() {
        expectedConsecutiveLines = List.of(
                "  private int hash;",
                "    descriptor: I",
                "    flags: (0x0002) ACC_PRIVATE"
        );
    }

    @Test
    public void test_for_field_hashIsZero() {
        expectedConsecutiveLines = List.of(
                "  private boolean hashIsZero;",
                "    descriptor: Z",
                "    flags: (0x0002) ACC_PRIVATE"
        );
    }

    @ExpectedPredefinedAttribute(ConstantValueAttribute.class)
    @Test
    public void test_for_field_serialVersionUID() {
        expectedConsecutiveLines = List.of(
                "  private static final long serialVersionUID;",
                "    descriptor: J",
                "    flags: (0x001a) ACC_PRIVATE, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: long -6849794470754667710l"
        );
    }

    @Test
    public void test_for_field_COMPACT_STRINGS() {
        expectedConsecutiveLines = List.of(
                "  static final boolean COMPACT_STRINGS;",
                "    descriptor: Z",
                "    flags: (0x0018) ACC_STATIC, ACC_FINAL"
        );
    }

    @Test
    public void test_for_field_serialPersistentFields() {
        expectedConsecutiveLines = List.of(
                "  private static final java.io.ObjectStreamField[] serialPersistentFields;",
                "    descriptor: [Ljava/io/ObjectStreamField;",
                "    flags: (0x001a) ACC_PRIVATE, ACC_STATIC, ACC_FINAL"
        );
    }

    @ExpectedPredefinedAttribute(ConstantValueAttribute.class)
    @Test
    public void test_for_field_REPL() {
        expectedConsecutiveLines = List.of(
                "  private static final char REPL;",
                "    descriptor: C",
                "    flags: (0x001a) ACC_PRIVATE, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 65533"
        );
    }

    @ExpectedPredefinedAttribute(SignatureAttribute.class)
    @Test
    public void test_for_field_CASE_INSENSITIVE_ORDER() {
        expectedConsecutiveLines = List.of(
                "  public static final java.util.Comparator<java.lang.String> CASE_INSENSITIVE_ORDER;",
                "    descriptor: Ljava/util/Comparator;",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    Signature: #1117                        // Ljava/util/Comparator<Ljava/lang/String;>;"
        );
    }

    @ExpectedPredefinedAttribute(ConstantValueAttribute.class)
    @Test
    public void test_for_field_LATIN1() {
        expectedConsecutiveLines = List.of(
                "  static final byte LATIN1;",
                "    descriptor: B",
                "    flags: (0x0018) ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 0"
        );
    }

    @ExpectedPredefinedAttribute(ConstantValueAttribute.class)
    @Test
    public void test_for_field_UTF16() {
        expectedConsecutiveLines = List.of(
                "  static final byte UTF16;",
                "    descriptor: B",
                "    flags: (0x0018) ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 1"
        );
    }
}
