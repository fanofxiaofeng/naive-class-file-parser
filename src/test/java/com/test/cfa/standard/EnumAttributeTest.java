package com.test.cfa.standard;

import com.study.type.info.attribute.BootstrapMethodsAttribute;
import com.study.type.info.attribute.InnerClassesAttribute;
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
public class EnumAttributeTest extends ClassFileAttributePresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Enum"));
    }

    @ExpectedPredefinedAttribute(SignatureAttribute.class)
    @Test
    public void test_for_Signature_Attribute() {
        expectedConsecutiveLines = List.of(
                "Signature: #180                         // <E:Ljava/lang/Enum<TE;>;>Ljava/lang/Object;Ljava/lang/constant/Constable;Ljava/lang/Comparable<TE;>;Ljava/io/Serializable;"
        );
    }

    @ExpectedPredefinedAttribute(SourceFileAttribute.class)
    @Test
    public void test_for_SourceFile_Attribute() {
        expectedConsecutiveLines = List.of(
                "SourceFile: \"Enum.java\""
        );
    }

    @ExpectedPredefinedAttribute(BootstrapMethodsAttribute.class)
    @Test
    public void test_for_BootstrapMethods_Attribute() {
        expectedConsecutiveLines = List.of(
                "BootstrapMethods:",
                "  0: #190 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;",
                "    Method arguments:",
                "      #185 (Ljava/lang/Object;)Ljava/lang/Object;",
                "      #186 REF_invokeVirtual java/lang/Enum.lambda$describeConstable$0:(Ljava/lang/constant/ClassDesc;)Ljava/lang/Enum$EnumDesc;",
                "      #189 (Ljava/lang/constant/ClassDesc;)Ljava/lang/Enum$EnumDesc;"
        );
    }

    @ExpectedPredefinedAttribute(InnerClassesAttribute.class)
    @Test
    public void test_for_InnerClasses_Attribute() {
        expectedConsecutiveLines = List.of(
                "InnerClasses:",
                "  public static final #198= #106 of #2;   // EnumDesc=class java/lang/Enum$EnumDesc of class java/lang/Enum",
                "  public static final #203= #199 of #201; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles"
        );
    }
}
