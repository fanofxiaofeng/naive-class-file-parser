package com.test.cfa.standard;

import com.test.present.ClassFileAttributePresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ClassAttributeTest extends ClassFileAttributePresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Class"));
    }

    @Test
    public void test_for_Signature_Attribute() {
        expectedConsecutiveLines = List.of(
                "Signature: #1630                        // <T:Ljava/lang/Object;>Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/reflect/GenericDeclaration;Ljava/lang/reflect/Type;Ljava/lang/reflect/AnnotatedElement;Ljava/lang/invoke/TypeDescriptor$OfField<Ljava/lang/Class<*>;>;Ljava/lang/constant/Constable;"
        );
    }
    @Test
    public void test_for_SourceFile_Attribute() {
        expectedConsecutiveLines = List.of(
                "SourceFile: \"Class.java\""
        );
    }
    @Test
    public void test_for_BootstrapMethods_Attribute() {
        expectedConsecutiveLines = List.of(
                "BootstrapMethods:",
                "  0: #1664 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;",
                "    Method arguments:",
                "      #1635 (Ljava/lang/Object;)Ljava/lang/Object;",
                "      #1636 REF_invokeStatic java/lang/Class.typeVarBounds:(Ljava/lang/reflect/TypeVariable;)Ljava/lang/String;",
                "      #1639 (Ljava/lang/reflect/TypeVariable;)Ljava/lang/String;",
                "  1: #1664 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;",
                "    Method arguments:",
                "      #1635 (Ljava/lang/Object;)Ljava/lang/Object;",
                "      #1640 REF_invokeInterface java/lang/reflect/Type.getTypeName:()Ljava/lang/String;",
                "      #1643 (Ljava/lang/reflect/Type;)Ljava/lang/String;",
                "  2: #1664 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;",
                "    Method arguments:",
                "      #1645 ()Ljava/lang/Object;",
                "      #1646 REF_invokeVirtual java/lang/Module.getClassLoader:()Ljava/lang/ClassLoader;",
                "      #1647 ()Ljava/lang/ClassLoader;",
                "  3: #1664 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;",
                "    Method arguments:",
                "      #1635 (Ljava/lang/Object;)Ljava/lang/Object;",
                "      #1648 REF_invokeStatic java/lang/Class.lambda$methodToString$0:(Ljava/lang/Class;)Ljava/lang/String;",
                "      #1651 (Ljava/lang/Class;)Ljava/lang/String;",
                "  4: #1664 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;",
                "    Method arguments:",
                "      #1652 (Ljava/lang/Object;)Z",
                "      #1653 REF_invokeVirtual java/lang/Class.lambda$getPermittedSubclasses$1:(Ljava/lang/Class;)Z",
                "      #1656 (Ljava/lang/Class;)Z",
                "  5: #1664 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;",
                "    Method arguments:",
                "      #1652 (Ljava/lang/Object;)Z",
                "      #1657 REF_invokeVirtual java/lang/Class.isDirectSubType:(Ljava/lang/Class;)Z",
                "      #1656 (Ljava/lang/Class;)Z",
                "  6: #1664 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;",
                "    Method arguments:",
                "      #1658 (I)Ljava/lang/Object;",
                "      #1660 REF_invokeStatic java/lang/Class.lambda$getPermittedSubclasses$2:(I)[Ljava/lang/Class;",
                "      #1663 (I)[Ljava/lang/Class;"
        );
    }
    @Test
    public void test_for_InnerClasses_Attribute() {
        expectedConsecutiveLines = List.of(
                "InnerClasses:",
                "  #260;                                   // class java/lang/Class$1",
                "  private static #1672= #363 of #8;       // ReflectionData=class java/lang/Class$ReflectionData of class java/lang/Class",
                "  public static final #1673= #388 of #400; // Location=class java/lang/reflect/AccessFlag$Location of class java/lang/reflect/AccessFlag",
                "  private static final #1674= #410 of #8; // EnclosingMethodInfo=class java/lang/Class$EnclosingMethodInfo of class java/lang/Class",
                "  #581;                                   // class java/lang/Class$2",
                "  private static #1675= #843 of #8;       // Atomic=class java/lang/Class$Atomic of class java/lang/Class",
                "  static final #1676= #963 of #938;       // MethodList=class java/lang/PublicMethods$MethodList of class java/lang/PublicMethods",
                "  public static final #1677= #1009 of #255; // GetReflectionFactoryAction=class jdk/internal/reflect/ReflectionFactory$GetReflectionFactoryAction of class jdk/internal/reflect/ReflectionFactory",
                "  #1026;                                  // class java/lang/Class$3",
                "  private static #1678= #1078 of #8;      // AnnotationData=class java/lang/Class$AnnotationData of class java/lang/Class",
                "  public static #1679= #1136 of #1056;    // Entry=class java/util/Map$Entry of class java/util/Map",
                "  public static #1682= #1310 of #1680;    // OfField=class java/lang/invoke/TypeDescriptor$OfField of class java/lang/invoke/TypeDescriptor",
                "  static #1687= #1683 of #1685;           // ClassValueMap=class java/lang/ClassValue$ClassValueMap of class java/lang/ClassValue",
                "  public static final #1692= #1688 of #1690; // Feature=class jdk/internal/javac/PreviewFeature$Feature of class jdk/internal/javac/PreviewFeature",
                "  public static final #1697= #1693 of #1695; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles"
        );
    }
}
