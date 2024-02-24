package com.test.cfa.specific;

import com.test.present.ClassFileAttributePresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class BootstrapMethodsAttributeCaseAttributeTest extends ClassFileAttributePresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.attribute.cases.BootstrapMethodsAttributeCase"));
    }

    @Test
    public void test_for_SourceFile_Attribute() {
        expectedConsecutiveLines = List.of(
                "SourceFile: \"BootstrapMethodsAttributeCase.java\""
        );
    }
    @Test
    public void test_for_BootstrapMethods_Attribute() {
        expectedConsecutiveLines = List.of(
                "BootstrapMethods:",
                "  0: #61 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;",
                "    Method arguments:",
                "      #54 ()V",
                "      #55 REF_invokeStatic com/test/attribute/cases/BootstrapMethodsAttributeCase.lambda$new$0:()V",
                "      #54 ()V",
                "  1: #61 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;",
                "    Method arguments:",
                "      #54 ()V",
                "      #58 REF_invokeVirtual com/test/attribute/cases/BootstrapMethodsAttributeCase.lambda$new$1:()V",
                "      #54 ()V"
        );
    }
    @Test
    public void test_for_InnerClasses_Attribute() {
        expectedConsecutiveLines = List.of(
                "InnerClasses:",
                "  public static final #73= #69 of #71;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles"
        );
    }
}
