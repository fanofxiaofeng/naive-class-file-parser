package com.test.cfa.specific;

import com.study.type.info.attribute.BootstrapMethodsAttribute;
import com.study.type.info.attribute.InnerClassesAttribute;
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
public class BootstrapMethodsAttributeCaseAttributeTest extends ClassFileAttributePresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.attribute.cases.BootstrapMethodsAttributeCase"));
    }

    @ExpectedPredefinedAttribute(SourceFileAttribute.class)
    @Test
    public void test_for_SourceFile_Attribute() {
        expectedConsecutiveLines = List.of(
                "SourceFile: \"BootstrapMethodsAttributeCase.java\""
        );
    }

    @ExpectedPredefinedAttribute(BootstrapMethodsAttribute.class)
    @Test
    public void test_for_BootstrapMethods_Attribute() {
        expectedConsecutiveLines = List.of(
                "BootstrapMethods:",
                "  0: #62 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;",
                "    Method arguments:",
                "      #55 ()V",
                "      #56 REF_invokeStatic com/test/attribute/cases/BootstrapMethodsAttributeCase.lambda$new$0:()V",
                "      #55 ()V",
                "  1: #62 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;",
                "    Method arguments:",
                "      #55 ()V",
                "      #59 REF_invokeVirtual com/test/attribute/cases/BootstrapMethodsAttributeCase.lambda$new$1:()V",
                "      #55 ()V"
        );
    }

    @ExpectedPredefinedAttribute(InnerClassesAttribute.class)
    @Test
    public void test_for_InnerClasses_Attribute() {
        expectedConsecutiveLines = List.of(
                "InnerClasses:",
                "  public static final #74= #70 of #72;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles"
        );
    }
}
