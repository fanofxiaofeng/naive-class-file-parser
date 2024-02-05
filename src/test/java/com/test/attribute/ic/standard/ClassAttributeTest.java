package com.test.attribute.ic.standard;

import com.test.present.ClassFileAttributePresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ClassAttributeTest extends ClassFileAttributePresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException {
        buildRealLines(Class.class);
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
