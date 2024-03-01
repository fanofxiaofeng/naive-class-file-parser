package com.test.cfa.standard;

import com.study.type.info.attribute.BootstrapMethodsAttribute;
import com.study.type.info.attribute.InnerClassesAttribute;
import com.study.type.info.attribute.NestMembersAttribute;
import com.study.type.info.attribute.SignatureAttribute;
import com.study.type.info.attribute.SourceFileAttribute;
import com.test.annotations.ExpectedPredefinedAttribute;
import com.test.annotations.GeneratedBy;
import com.test.cfa.ClassFileAttributeTestGenerator;
import com.test.presenter.ClassFileAttributePresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(ClassFileAttributeTestGenerator.class)
public class StringAttributeTest extends ClassFileAttributePresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.String"));
    }

    @ExpectedPredefinedAttribute(SignatureAttribute.class)
    @Test
    public void test_for_Signature_Attribute() {
        expectedConsecutiveLines = List.of(
                "Signature: #1407                        // Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Comparable<Ljava/lang/String;>;Ljava/lang/CharSequence;Ljava/lang/constant/Constable;Ljava/lang/constant/ConstantDesc;"
        );
    }

    @ExpectedPredefinedAttribute(SourceFileAttribute.class)
    @Test
    public void test_for_SourceFile_Attribute() {
        expectedConsecutiveLines = List.of(
                "SourceFile: \"String.java\""
        );
    }

    @ExpectedPredefinedAttribute(NestMembersAttribute.class)
    @Test
    public void test_for_NestMembers_Attribute() {
        expectedConsecutiveLines = List.of(
                "NestMembers:",
                "  java/lang/String$CaseInsensitiveComparator"
        );
    }

    @ExpectedPredefinedAttribute(BootstrapMethodsAttribute.class)
    @Test
    public void test_for_BootstrapMethods_Attribute() {
        expectedConsecutiveLines = List.of(
                "BootstrapMethods:",
                "  0: #1426 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;",
                "    Method arguments:",
                "      #1412 (Ljava/lang/Object;)Ljava/lang/Object;",
                "      #1413 REF_invokeStatic java/lang/String.lambda$indent$0:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;",
                "      #1416 (Ljava/lang/String;)Ljava/lang/String;",
                "  1: #1426 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;",
                "    Method arguments:",
                "      #1412 (Ljava/lang/Object;)Ljava/lang/Object;",
                "      #1417 REF_invokeStatic java/lang/String.lambda$indent$1:(Ljava/lang/String;)Ljava/lang/String;",
                "      #1416 (Ljava/lang/String;)Ljava/lang/String;",
                "  2: #1426 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;",
                "    Method arguments:",
                "      #1412 (Ljava/lang/Object;)Ljava/lang/Object;",
                "      #1420 REF_invokeStatic java/lang/String.lambda$indent$2:(ILjava/lang/String;)Ljava/lang/String;",
                "      #1416 (Ljava/lang/String;)Ljava/lang/String;",
                "  3: #1426 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;",
                "    Method arguments:",
                "      #1412 (Ljava/lang/Object;)Ljava/lang/Object;",
                "      #1423 REF_invokeStatic java/lang/String.lambda$stripIndent$3:(ILjava/lang/String;)Ljava/lang/String;",
                "      #1416 (Ljava/lang/String;)Ljava/lang/String;"
        );
    }

    @ExpectedPredefinedAttribute(InnerClassesAttribute.class)
    @Test
    public void test_for_InnerClasses_Attribute() {
        expectedConsecutiveLines = List.of(
                "InnerClasses:",
                "  static #1434= #972 of #42;              // CharsSpliterator=class java/lang/StringLatin1$CharsSpliterator of class java/lang/StringLatin1",
                "  static #1434= #978 of #48;              // CharsSpliterator=class java/lang/StringUTF16$CharsSpliterator of class java/lang/StringUTF16",
                "  public static #1435= #1356 of #974;     // OfInt=class java/util/Spliterator$OfInt of class java/util/Spliterator",
                "  static #1436= #987 of #48;              // CodePointsSpliterator=class java/lang/StringUTF16$CodePointsSpliterator of class java/lang/StringUTF16",
                "  public static final #1441= #1437 of #1439; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles",
                "  private static #1442= #1096 of #10;     // CaseInsensitiveComparator=class java/lang/String$CaseInsensitiveComparator of class java/lang/String"
        );
    }
}
