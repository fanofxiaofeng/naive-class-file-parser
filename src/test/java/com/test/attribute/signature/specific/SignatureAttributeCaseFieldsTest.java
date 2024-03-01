package com.test.attribute.signature.specific;

import com.study.type.info.attribute.SignatureAttribute;
import com.test.annotations.ExpectedPredefinedAttribute;
import com.test.annotations.GeneratedBy;
import com.test.attribute.signature.TestGenerator;
import com.test.field.FieldPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(TestGenerator.class)
public class SignatureAttributeCaseFieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.attribute.cases.SignatureAttributeCase"));
    }

    @ExpectedPredefinedAttribute(SignatureAttribute.class)
    @Test
    public void test_for_field_f1() {
        expectedConsecutiveLines = List.of(
                "  private static java.lang.Class<? extends java.lang.Number>[][][][][] f1;",
                "    descriptor: [[[[[Ljava/lang/Class;",
                "    flags: (0x000a) ACC_PRIVATE, ACC_STATIC",
                "    Signature: #12                          // [[[[[Ljava/lang/Class<+Ljava/lang/Number;>;"
        );
    }

    @ExpectedPredefinedAttribute(SignatureAttribute.class)
    @Test
    public void test_for_field_f2() {
        expectedConsecutiveLines = List.of(
                "  private java.util.List<java.util.Map<java.util.List<? super java.lang.Number>, java.util.Set<? extends java.lang.String>[][][]>> f2;",
                "    descriptor: Ljava/util/List;",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Signature: #15                          // Ljava/util/List<Ljava/util/Map<Ljava/util/List<-Ljava/lang/Number;>;[[[Ljava/util/Set<+Ljava/lang/String;>;>;>;"
        );
    }

    @ExpectedPredefinedAttribute(SignatureAttribute.class)
    @Test
    public void test_for_field_f3() {
        expectedConsecutiveLines = List.of(
                "  private java.util.function.Supplier<java.util.Map<? super java.lang.String, java.lang.Object>> f3;",
                "    descriptor: Ljava/util/function/Supplier;",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Signature: #18                          // Ljava/util/function/Supplier<Ljava/util/Map<-Ljava/lang/String;Ljava/lang/Object;>;>;"
        );
    }

    @ExpectedPredefinedAttribute(SignatureAttribute.class)
    @Test
    public void test_for_field_f4() {
        expectedConsecutiveLines = List.of(
                "  private java.util.function.Consumer<com.test.attribute.cases.SignatureAttributeCase$C1<? extends java.lang.String>.C2<?>.C3<? super java.lang.Object>> f4;",
                "    descriptor: Ljava/util/function/Consumer;",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Signature: #21                          // Ljava/util/function/Consumer<Lcom/test/attribute/cases/SignatureAttributeCase$C1<+Ljava/lang/String;>.C2<*>.C3<-Ljava/lang/Object;>;>;"
        );
    }
}
