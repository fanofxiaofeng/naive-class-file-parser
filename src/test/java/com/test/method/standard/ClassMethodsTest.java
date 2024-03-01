package com.test.method.standard;

import com.test.method.MethodPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ClassMethodsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Class"));
    }

    @Test
    public void test_for_method_1() {
        expectedConsecutiveLines = List.of(
                "  private static native void registerNatives();",
                "    descriptor: ()V",
                "    flags: (0x010a) ACC_PRIVATE, ACC_STATIC, ACC_NATIVE"
        );
    }
    @Test
    public void test_for_method_2() {
        expectedConsecutiveLines = List.of(
                "  private java.lang.Class(java.lang.ClassLoader, java.lang.Class<?>);",
                "    descriptor: (Ljava/lang/ClassLoader;Ljava/lang/Class;)V",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=2, locals=3, args_size=3",
                "    Signature: #1342                        // (Ljava/lang/ClassLoader;Ljava/lang/Class<*>;)V"
        );
    }
    @Test
    public void test_for_method_3() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.String toString();",
                "    descriptor: ()Ljava/lang/String;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=1"
        );
    }
    @Test
    public void test_for_method_4() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.String toGenericString();",
                "    descriptor: ()Ljava/lang/String;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=5, locals=5, args_size=1"
        );
    }
    @Test
    public void test_for_method_5() {
        expectedConsecutiveLines = List.of(
                "  static java.lang.String typeVarBounds(java.lang.reflect.TypeVariable<?>);",
                "    descriptor: (Ljava/lang/reflect/TypeVariable;)Ljava/lang/String;",
                "    flags: (0x0008) ACC_STATIC",
                "    Code:",
                "      stack=3, locals=2, args_size=1",
                "    Signature: #1363                        // (Ljava/lang/reflect/TypeVariable<*>;)Ljava/lang/String;"
        );
    }
    @Test
    public void test_for_method_6() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.Class<?> forName(java.lang.String) throws java.lang.ClassNotFoundException;",
                "    descriptor: (Ljava/lang/String;)Ljava/lang/Class;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=2, args_size=1",
                "    Exceptions:",
                "      throws java.lang.ClassNotFoundException",
                "    Signature: #1370                        // (Ljava/lang/String;)Ljava/lang/Class<*>;"
        );
    }
    @Test
    public void test_for_method_7() {
        expectedConsecutiveLines = List.of(
                "  private static java.lang.Class<?> forName(java.lang.String, java.lang.Class<?>) throws java.lang.ClassNotFoundException;",
                "    descriptor: (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Class;",
                "    flags: (0x000a) ACC_PRIVATE, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=3, args_size=2",
                "    Exceptions:",
                "      throws java.lang.ClassNotFoundException",
                "    Signature: #1373                        // (Ljava/lang/String;Ljava/lang/Class<*>;)Ljava/lang/Class<*>;"
        );
    }
    @Test
    public void test_for_method_8() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.Class<?> forName(java.lang.String, boolean, java.lang.ClassLoader) throws java.lang.ClassNotFoundException;",
                "    descriptor: (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=5, args_size=3",
                "    Exceptions:",
                "      throws java.lang.ClassNotFoundException",
                "    Signature: #1381                        // (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class<*>;"
        );
    }
    @Test
    public void test_for_method_9() {
        expectedConsecutiveLines = List.of(
                "  private static java.lang.Class<?> forName(java.lang.String, boolean, java.lang.ClassLoader, java.lang.Class<?>) throws java.lang.ClassNotFoundException;",
                "    descriptor: (Ljava/lang/String;ZLjava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Class;",
                "    flags: (0x000a) ACC_PRIVATE, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=6, args_size=4",
                "    Exceptions:",
                "      throws java.lang.ClassNotFoundException",
                "    Signature: #1383                        // (Ljava/lang/String;ZLjava/lang/ClassLoader;Ljava/lang/Class<*>;)Ljava/lang/Class<*>;"
        );
    }
    @Test
    public void test_for_method_10() {
        expectedConsecutiveLines = List.of(
                "  private static native java.lang.Class<?> forName0(java.lang.String, boolean, java.lang.ClassLoader, java.lang.Class<?>) throws java.lang.ClassNotFoundException;",
                "    descriptor: (Ljava/lang/String;ZLjava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Class;",
                "    flags: (0x010a) ACC_PRIVATE, ACC_STATIC, ACC_NATIVE",
                "    Exceptions:",
                "      throws java.lang.ClassNotFoundException",
                "    Signature: #1383                        // (Ljava/lang/String;ZLjava/lang/ClassLoader;Ljava/lang/Class<*>;)Ljava/lang/Class<*>;"
        );
    }
    @Test
    public void test_for_method_11() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.Class<?> forName(java.lang.Module, java.lang.String);",
                "    descriptor: (Ljava/lang/Module;Ljava/lang/String;)Ljava/lang/Class;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=3, locals=4, args_size=2",
                "    Signature: #1384                        // (Ljava/lang/Module;Ljava/lang/String;)Ljava/lang/Class<*>;"
        );
    }
    @Test
    public void test_for_method_12() {
        expectedConsecutiveLines = List.of(
                "  private static java.lang.Class<?> forName(java.lang.Module, java.lang.String, java.lang.Class<?>);",
                "    descriptor: (Ljava/lang/Module;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Class;",
                "    flags: (0x000a) ACC_PRIVATE, ACC_STATIC",
                "    Code:",
                "      stack=3, locals=6, args_size=3",
                "    Signature: #1389                        // (Ljava/lang/Module;Ljava/lang/String;Ljava/lang/Class<*>;)Ljava/lang/Class<*>;"
        );
    }
    @Test
    public void test_for_method_13() {
        expectedConsecutiveLines = List.of(
                "  public T newInstance() throws java.lang.InstantiationException, java.lang.IllegalAccessException;",
                "    descriptor: ()Ljava/lang/Object;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=5, locals=5, args_size=1",
                "    Exceptions:",
                "      throws java.lang.InstantiationException, java.lang.IllegalAccessException",
                "    Signature: #1396                        // ()TT;"
        );
    }
    @Test
    public void test_for_method_14() {
        expectedConsecutiveLines = List.of(
                "  public native boolean isInstance(java.lang.Object);",
                "    descriptor: (Ljava/lang/Object;)Z",
                "    flags: (0x0101) ACC_PUBLIC, ACC_NATIVE"
        );
    }
    @Test
    public void test_for_method_15() {
        expectedConsecutiveLines = List.of(
                "  public native boolean isAssignableFrom(java.lang.Class<?>);",
                "    descriptor: (Ljava/lang/Class;)Z",
                "    flags: (0x0101) ACC_PUBLIC, ACC_NATIVE",
                "    Signature: #1401                        // (Ljava/lang/Class<*>;)Z"
        );
    }
    @Test
    public void test_for_method_16() {
        expectedConsecutiveLines = List.of(
                "  public native boolean isInterface();",
                "    descriptor: ()Z",
                "    flags: (0x0101) ACC_PUBLIC, ACC_NATIVE"
        );
    }
    @Test
    public void test_for_method_17() {
        expectedConsecutiveLines = List.of(
                "  public native boolean isArray();",
                "    descriptor: ()Z",
                "    flags: (0x0101) ACC_PUBLIC, ACC_NATIVE"
        );
    }
    @Test
    public void test_for_method_18() {
        expectedConsecutiveLines = List.of(
                "  public native boolean isPrimitive();",
                "    descriptor: ()Z",
                "    flags: (0x0101) ACC_PUBLIC, ACC_NATIVE"
        );
    }
    @Test
    public void test_for_method_19() {
        expectedConsecutiveLines = List.of(
                "  public boolean isAnnotation();",
                "    descriptor: ()Z",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1"
        );
    }
    @Test
    public void test_for_method_20() {
        expectedConsecutiveLines = List.of(
                "  public boolean isSynthetic();",
                "    descriptor: ()Z",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1"
        );
    }
    @Test
    public void test_for_method_21() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.String getName();",
                "    descriptor: ()Ljava/lang/String;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=2, args_size=1"
        );
    }
    @Test
    public void test_for_method_22() {
        expectedConsecutiveLines = List.of(
                "  private native java.lang.String initClassName();",
                "    descriptor: ()Ljava/lang/String;",
                "    flags: (0x0102) ACC_PRIVATE, ACC_NATIVE"
        );
    }
    @Test
    public void test_for_method_23() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.ClassLoader getClassLoader();",
                "    descriptor: ()Ljava/lang/ClassLoader;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=3, args_size=1"
        );
    }
    @Test
    public void test_for_method_24() {
        expectedConsecutiveLines = List.of(
                "  java.lang.ClassLoader getClassLoader0();",
                "    descriptor: ()Ljava/lang/ClassLoader;",
                "    flags: (0x0000)",
                "    Code:",
                "      stack=1, locals=1, args_size=1"
        );
    }
    @Test
    public void test_for_method_25() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Module getModule();",
                "    descriptor: ()Ljava/lang/Module;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1"
        );
    }
    @Test
    public void test_for_method_26() {
        expectedConsecutiveLines = List.of(
                "  java.lang.Object getClassData();",
                "    descriptor: ()Ljava/lang/Object;",
                "    flags: (0x0000)",
                "    Code:",
                "      stack=1, locals=1, args_size=1"
        );
    }
    @Test
    public void test_for_method_27() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.reflect.TypeVariable<java.lang.Class<T>>[] getTypeParameters();",
                "    descriptor: ()[Ljava/lang/reflect/TypeVariable;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=2, args_size=1",
                "    Signature: #1406                        // ()[Ljava/lang/reflect/TypeVariable<Ljava/lang/Class<TT;>;>;"
        );
    }
    @Test
    public void test_for_method_28() {
        expectedConsecutiveLines = List.of(
                "  public native java.lang.Class<? super T> getSuperclass();",
                "    descriptor: ()Ljava/lang/Class;",
                "    flags: (0x0101) ACC_PUBLIC, ACC_NATIVE",
                "    Signature: #1407                        // ()Ljava/lang/Class<-TT;>;"
        );
    }
    @Test
    public void test_for_method_29() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.reflect.Type getGenericSuperclass();",
                "    descriptor: ()Ljava/lang/reflect/Type;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=2, args_size=1"
        );
    }
    @Test
    public void test_for_method_30() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Package getPackage();",
                "    descriptor: ()Ljava/lang/Package;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=1"
        );
    }
    @Test
    public void test_for_method_31() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.String getPackageName();",
                "    descriptor: ()Ljava/lang/String;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=5, args_size=1"
        );
    }
    @Test
    public void test_for_method_32() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Class<?>[] getInterfaces();",
                "    descriptor: ()[Ljava/lang/Class;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "    Signature: #1416                        // ()[Ljava/lang/Class<*>;"
        );
    }
    @Test
    public void test_for_method_33() {
        expectedConsecutiveLines = List.of(
                "  private java.lang.Class<?>[] getInterfaces(boolean);",
                "    descriptor: (Z)[Ljava/lang/Class;",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=2, locals=4, args_size=2",
                "    Signature: #1421                        // (Z)[Ljava/lang/Class<*>;"
        );
    }
    @Test
    public void test_for_method_34() {
        expectedConsecutiveLines = List.of(
                "  private native java.lang.Class<?>[] getInterfaces0();",
                "    descriptor: ()[Ljava/lang/Class;",
                "    flags: (0x0102) ACC_PRIVATE, ACC_NATIVE",
                "    Signature: #1416                        // ()[Ljava/lang/Class<*>;"
        );
    }
    @Test
    public void test_for_method_35() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.reflect.Type[] getGenericInterfaces();",
                "    descriptor: ()[Ljava/lang/reflect/Type;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=2, args_size=1"
        );
    }
    @Test
    public void test_for_method_36() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Class<?> getComponentType();",
                "    descriptor: ()Ljava/lang/Class;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "    Signature: #1423                        // ()Ljava/lang/Class<*>;"
        );
    }
    @Test
    public void test_for_method_37() {
        expectedConsecutiveLines = List.of(
                "  private java.lang.Class<?> elementType();",
                "    descriptor: ()Ljava/lang/Class;",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=1, locals=2, args_size=1",
                "    Signature: #1423                        // ()Ljava/lang/Class<*>;"
        );
    }
    @Test
    public void test_for_method_38() {
        expectedConsecutiveLines = List.of(
                "  public native int getModifiers();",
                "    descriptor: ()I",
                "    flags: (0x0101) ACC_PUBLIC, ACC_NATIVE"
        );
    }
    @Test
    public void test_for_method_39() {
        expectedConsecutiveLines = List.of(
                "  public java.util.Set<java.lang.reflect.AccessFlag> accessFlags();",
                "    descriptor: ()Ljava/util/Set;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=1",
                "    Signature: #1426                        // ()Ljava/util/Set<Ljava/lang/reflect/AccessFlag;>;"
        );
    }
    @Test
    public void test_for_method_40() {
        expectedConsecutiveLines = List.of(
                "  public native java.lang.Object[] getSigners();",
                "    descriptor: ()[Ljava/lang/Object;",
                "    flags: (0x0101) ACC_PUBLIC, ACC_NATIVE"
        );
    }
    @Test
    public void test_for_method_41() {
        expectedConsecutiveLines = List.of(
                "  native void setSigners(java.lang.Object[]);",
                "    descriptor: ([Ljava/lang/Object;)V",
                "    flags: (0x0100) ACC_NATIVE"
        );
    }
    @Test
    public void test_for_method_42() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.reflect.Method getEnclosingMethod() throws java.lang.SecurityException;",
                "    descriptor: ()Ljava/lang/reflect/Method;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=5, locals=14, args_size=1",
                "    Exceptions:",
                "      throws java.lang.SecurityException"
        );
    }
    @Test
    public void test_for_method_43() {
        expectedConsecutiveLines = List.of(
                "  private native java.lang.Object[] getEnclosingMethod0();",
                "    descriptor: ()[Ljava/lang/Object;",
                "    flags: (0x0102) ACC_PRIVATE, ACC_NATIVE"
        );
    }
    @Test
    public void test_for_method_44() {
        expectedConsecutiveLines = List.of(
                "  private java.lang.Class$EnclosingMethodInfo getEnclosingMethodInfo();",
                "    descriptor: ()Ljava/lang/Class$EnclosingMethodInfo;",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=3, locals=2, args_size=1"
        );
    }
    @Test
    public void test_for_method_45() {
        expectedConsecutiveLines = List.of(
                "  private static java.lang.Class<?> toClass(java.lang.reflect.Type);",
                "    descriptor: (Ljava/lang/reflect/Type;)Ljava/lang/Class;",
                "    flags: (0x000a) ACC_PRIVATE, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "    Signature: #1446                        // (Ljava/lang/reflect/Type;)Ljava/lang/Class<*>;"
        );
    }
    @Test
    public void test_for_method_46() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.reflect.Constructor<?> getEnclosingConstructor() throws java.lang.SecurityException;",
                "    descriptor: ()Ljava/lang/reflect/Constructor;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=5, locals=13, args_size=1",
                "    Exceptions:",
                "      throws java.lang.SecurityException",
                "    Signature: #1452                        // ()Ljava/lang/reflect/Constructor<*>;"
        );
    }
    @Test
    public void test_for_method_47() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Class<?> getDeclaringClass() throws java.lang.SecurityException;",
                "    descriptor: ()Ljava/lang/Class;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=4, locals=3, args_size=1",
                "    Exceptions:",
                "      throws java.lang.SecurityException",
                "    Signature: #1423                        // ()Ljava/lang/Class<*>;"
        );
    }
    @Test
    public void test_for_method_48() {
        expectedConsecutiveLines = List.of(
                "  private native java.lang.Class<?> getDeclaringClass0();",
                "    descriptor: ()Ljava/lang/Class;",
                "    flags: (0x0102) ACC_PRIVATE, ACC_NATIVE",
                "    Signature: #1423                        // ()Ljava/lang/Class<*>;"
        );
    }
    @Test
    public void test_for_method_49() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Class<?> getEnclosingClass() throws java.lang.SecurityException;",
                "    descriptor: ()Ljava/lang/Class;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=4, locals=4, args_size=1",
                "    Exceptions:",
                "      throws java.lang.SecurityException",
                "    Signature: #1423                        // ()Ljava/lang/Class<*>;"
        );
    }
    @Test
    public void test_for_method_50() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.String getSimpleName();",
                "    descriptor: ()Ljava/lang/String;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=3, args_size=1"
        );
    }
    @Test
    public void test_for_method_51() {
        expectedConsecutiveLines = List.of(
                "  private java.lang.String getSimpleName0();",
                "    descriptor: ()Ljava/lang/String;",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=3, locals=2, args_size=1"
        );
    }
    @Test
    public void test_for_method_52() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.String getTypeName();",
                "    descriptor: ()Ljava/lang/String;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=3, args_size=1"
        );
    }
    @Test
    public void test_for_method_53() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.String getCanonicalName();",
                "    descriptor: ()Ljava/lang/String;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=3, args_size=1"
        );
    }
    @Test
    public void test_for_method_54() {
        expectedConsecutiveLines = List.of(
                "  private java.lang.String getCanonicalName0();",
                "    descriptor: ()Ljava/lang/String;",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=4, locals=4, args_size=1"
        );
    }
    @Test
    public void test_for_method_55() {
        expectedConsecutiveLines = List.of(
                "  public boolean isUnnamedClass();",
                "    descriptor: ()Z",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1"
        );
    }
    @Test
    public void test_for_method_56() {
        expectedConsecutiveLines = List.of(
                "  public boolean isAnonymousClass();",
                "    descriptor: ()Z",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1"
        );
    }
    @Test
    public void test_for_method_57() {
        expectedConsecutiveLines = List.of(
                "  public boolean isLocalClass();",
                "    descriptor: ()Z",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1"
        );
    }
    @Test
    public void test_for_method_58() {
        expectedConsecutiveLines = List.of(
                "  public boolean isMemberClass();",
                "    descriptor: ()Z",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1"
        );
    }
    @Test
    public void test_for_method_59() {
        expectedConsecutiveLines = List.of(
                "  private java.lang.String getSimpleBinaryName();",
                "    descriptor: ()Ljava/lang/String;",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=1, locals=2, args_size=1"
        );
    }
    @Test
    public void test_for_method_60() {
        expectedConsecutiveLines = List.of(
                "  private native java.lang.String getSimpleBinaryName0();",
                "    descriptor: ()Ljava/lang/String;",
                "    flags: (0x0102) ACC_PRIVATE, ACC_NATIVE"
        );
    }
    @Test
    public void test_for_method_61() {
        expectedConsecutiveLines = List.of(
                "  private boolean isTopLevelClass();",
                "    descriptor: ()Z",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=1, locals=1, args_size=1"
        );
    }
    @Test
    public void test_for_method_62() {
        expectedConsecutiveLines = List.of(
                "  private boolean isLocalOrAnonymousClass();",
                "    descriptor: ()Z",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=1, locals=1, args_size=1"
        );
    }
    @Test
    public void test_for_method_63() {
        expectedConsecutiveLines = List.of(
                "  private boolean hasEnclosingMethodInfo();",
                "    descriptor: ()Z",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=1, locals=2, args_size=1"
        );
    }
    @Test
    public void test_for_method_64() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Class<?>[] getClasses();",
                "    descriptor: ()[Ljava/lang/Class;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=5, locals=2, args_size=1",
                "    Signature: #1416                        // ()[Ljava/lang/Class<*>;"
        );
    }
    @Test
    public void test_for_method_65() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.reflect.Field[] getFields() throws java.lang.SecurityException;",
                "    descriptor: ()[Ljava/lang/reflect/Field;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=5, locals=2, args_size=1",
                "    Exceptions:",
                "      throws java.lang.SecurityException"
        );
    }
    @Test
    public void test_for_method_66() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.reflect.Method[] getMethods() throws java.lang.SecurityException;",
                "    descriptor: ()[Ljava/lang/reflect/Method;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=5, locals=2, args_size=1",
                "    Exceptions:",
                "      throws java.lang.SecurityException"
        );
    }
    @Test
    public void test_for_method_67() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.reflect.Constructor<?>[] getConstructors() throws java.lang.SecurityException;",
                "    descriptor: ()[Ljava/lang/reflect/Constructor;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=5, locals=2, args_size=1",
                "    Exceptions:",
                "      throws java.lang.SecurityException",
                "    Signature: #1470                        // ()[Ljava/lang/reflect/Constructor<*>;"
        );
    }
    @Test
    public void test_for_method_68() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.reflect.Field getField(java.lang.String) throws java.lang.NoSuchFieldException, java.lang.SecurityException;",
                "    descriptor: (Ljava/lang/String;)Ljava/lang/reflect/Field;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=5, locals=4, args_size=2",
                "    Exceptions:",
                "      throws java.lang.NoSuchFieldException, java.lang.SecurityException"
        );
    }
    @Test
    public void test_for_method_69() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.reflect.Method getMethod(java.lang.String, java.lang.Class<?>...) throws java.lang.NoSuchMethodException, java.lang.SecurityException;",
                "    descriptor: (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;",
                "    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS",
                "    Code:",
                "      stack=5, locals=5, args_size=3",
                "    Exceptions:",
                "      throws java.lang.NoSuchMethodException, java.lang.SecurityException",
                "    Signature: #1475                        // (Ljava/lang/String;[Ljava/lang/Class<*>;)Ljava/lang/reflect/Method;"
        );
    }
    @Test
    public void test_for_method_70() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.reflect.Constructor<T> getConstructor(java.lang.Class<?>...) throws java.lang.NoSuchMethodException, java.lang.SecurityException;",
                "    descriptor: ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;",
                "    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS",
                "    Code:",
                "      stack=5, locals=3, args_size=2",
                "    Exceptions:",
                "      throws java.lang.NoSuchMethodException, java.lang.SecurityException",
                "    Signature: #1478                        // ([Ljava/lang/Class<*>;)Ljava/lang/reflect/Constructor<TT;>;"
        );
    }
    @Test
    public void test_for_method_71() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Class<?>[] getDeclaredClasses() throws java.lang.SecurityException;",
                "    descriptor: ()[Ljava/lang/Class;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=5, locals=2, args_size=1",
                "    Exceptions:",
                "      throws java.lang.SecurityException",
                "    Signature: #1416                        // ()[Ljava/lang/Class<*>;"
        );
    }
    @Test
    public void test_for_method_72() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.reflect.Field[] getDeclaredFields() throws java.lang.SecurityException;",
                "    descriptor: ()[Ljava/lang/reflect/Field;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=5, locals=2, args_size=1",
                "    Exceptions:",
                "      throws java.lang.SecurityException"
        );
    }
    @Test
    public void test_for_method_73() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.reflect.RecordComponent[] getRecordComponents();",
                "    descriptor: ()[Ljava/lang/reflect/RecordComponent;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=5, locals=2, args_size=1"
        );
    }
    @Test
    public void test_for_method_74() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.reflect.Method[] getDeclaredMethods() throws java.lang.SecurityException;",
                "    descriptor: ()[Ljava/lang/reflect/Method;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=5, locals=2, args_size=1",
                "    Exceptions:",
                "      throws java.lang.SecurityException"
        );
    }
    @Test
    public void test_for_method_75() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.reflect.Constructor<?>[] getDeclaredConstructors() throws java.lang.SecurityException;",
                "    descriptor: ()[Ljava/lang/reflect/Constructor;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=5, locals=2, args_size=1",
                "    Exceptions:",
                "      throws java.lang.SecurityException",
                "    Signature: #1470                        // ()[Ljava/lang/reflect/Constructor<*>;"
        );
    }
    @Test
    public void test_for_method_76() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.reflect.Field getDeclaredField(java.lang.String) throws java.lang.NoSuchFieldException, java.lang.SecurityException;",
                "    descriptor: (Ljava/lang/String;)Ljava/lang/reflect/Field;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=5, locals=4, args_size=2",
                "    Exceptions:",
                "      throws java.lang.NoSuchFieldException, java.lang.SecurityException"
        );
    }
    @Test
    public void test_for_method_77() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.reflect.Method getDeclaredMethod(java.lang.String, java.lang.Class<?>...) throws java.lang.NoSuchMethodException, java.lang.SecurityException;",
                "    descriptor: (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;",
                "    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS",
                "    Code:",
                "      stack=5, locals=5, args_size=3",
                "    Exceptions:",
                "      throws java.lang.NoSuchMethodException, java.lang.SecurityException",
                "    Signature: #1475                        // (Ljava/lang/String;[Ljava/lang/Class<*>;)Ljava/lang/reflect/Method;"
        );
    }
    @Test
    public void test_for_method_78() {
        expectedConsecutiveLines = List.of(
                "  java.util.List<java.lang.reflect.Method> getDeclaredPublicMethods(java.lang.String, java.lang.Class<?>...);",
                "    descriptor: (Ljava/lang/String;[Ljava/lang/Class;)Ljava/util/List;",
                "    flags: (0x0080) ACC_VARARGS",
                "    Code:",
                "      stack=3, locals=10, args_size=3",
                "    Signature: #1493                        // (Ljava/lang/String;[Ljava/lang/Class<*>;)Ljava/util/List<Ljava/lang/reflect/Method;>;"
        );
    }
    @Test
    public void test_for_method_79() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.reflect.Constructor<T> getDeclaredConstructor(java.lang.Class<?>...) throws java.lang.NoSuchMethodException, java.lang.SecurityException;",
                "    descriptor: ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;",
                "    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS",
                "    Code:",
                "      stack=5, locals=3, args_size=2",
                "    Exceptions:",
                "      throws java.lang.NoSuchMethodException, java.lang.SecurityException",
                "    Signature: #1478                        // ([Ljava/lang/Class<*>;)Ljava/lang/reflect/Constructor<TT;>;"
        );
    }
    @Test
    public void test_for_method_80() {
        expectedConsecutiveLines = List.of(
                "  public java.io.InputStream getResourceAsStream(java.lang.String);",
                "    descriptor: (Ljava/lang/String;)Ljava/io/InputStream;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=6, args_size=2"
        );
    }
    @Test
    public void test_for_method_81() {
        expectedConsecutiveLines = List.of(
                "  public java.net.URL getResource(java.lang.String);",
                "    descriptor: (Ljava/lang/String;)Ljava/net/URL;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=6, args_size=2"
        );
    }
    @Test
    public void test_for_method_82() {
        expectedConsecutiveLines = List.of(
                "  private boolean isOpenToCaller(java.lang.String, java.lang.Class<?>);",
                "    descriptor: (Ljava/lang/String;Ljava/lang/Class;)Z",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=3, locals=6, args_size=3",
                "    Signature: #1507                        // (Ljava/lang/String;Ljava/lang/Class<*>;)Z"
        );
    }
    @Test
    public void test_for_method_83() {
        expectedConsecutiveLines = List.of(
                "  public java.security.ProtectionDomain getProtectionDomain();",
                "    descriptor: ()Ljava/security/ProtectionDomain;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=1"
        );
    }
    @Test
    public void test_for_method_84() {
        expectedConsecutiveLines = List.of(
                "  java.security.ProtectionDomain protectionDomain();",
                "    descriptor: ()Ljava/security/ProtectionDomain;",
                "    flags: (0x0000)",
                "    Code:",
                "      stack=4, locals=3, args_size=1"
        );
    }
    @Test
    public void test_for_method_85() {
        expectedConsecutiveLines = List.of(
                "  private native java.security.ProtectionDomain getProtectionDomain0();",
                "    descriptor: ()Ljava/security/ProtectionDomain;",
                "    flags: (0x0102) ACC_PRIVATE, ACC_NATIVE"
        );
    }
    @Test
    public void test_for_method_86() {
        expectedConsecutiveLines = List.of(
                "  static native java.lang.Class<?> getPrimitiveClass(java.lang.String);",
                "    descriptor: (Ljava/lang/String;)Ljava/lang/Class;",
                "    flags: (0x0108) ACC_STATIC, ACC_NATIVE",
                "    Signature: #1370                        // (Ljava/lang/String;)Ljava/lang/Class<*>;"
        );
    }
    @Test
    public void test_for_method_87() {
        expectedConsecutiveLines = List.of(
                "  private void checkMemberAccess(java.lang.SecurityManager, int, java.lang.Class<?>, boolean);",
                "    descriptor: (Ljava/lang/SecurityManager;ILjava/lang/Class;Z)V",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=4, locals=7, args_size=5",
                "    Signature: #1515                        // (Ljava/lang/SecurityManager;ILjava/lang/Class<*>;Z)V"
        );
    }
    @Test
    public void test_for_method_88() {
        expectedConsecutiveLines = List.of(
                "  private void checkPackageAccess(java.lang.SecurityManager, java.lang.ClassLoader, boolean);",
                "    descriptor: (Ljava/lang/SecurityManager;Ljava/lang/ClassLoader;Z)V",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=3, locals=6, args_size=4"
        );
    }
    @Test
    public void test_for_method_89() {
        expectedConsecutiveLines = List.of(
                "  private static void checkPackageAccessForPermittedSubclasses(java.lang.SecurityManager, java.lang.ClassLoader, java.lang.Class<?>[]);",
                "    descriptor: (Ljava/lang/SecurityManager;Ljava/lang/ClassLoader;[Ljava/lang/Class;)V",
                "    flags: (0x000a) ACC_PRIVATE, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=10, args_size=3",
                "    Signature: #1520                        // (Ljava/lang/SecurityManager;Ljava/lang/ClassLoader;[Ljava/lang/Class<*>;)V"
        );
    }
    @Test
    public void test_for_method_90() {
        expectedConsecutiveLines = List.of(
                "  private java.lang.String resolveName(java.lang.String);",
                "    descriptor: (Ljava/lang/String;)Ljava/lang/String;",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=4, locals=5, args_size=2"
        );
    }
    @Test
    public void test_for_method_91() {
        expectedConsecutiveLines = List.of(
                "  private java.lang.Class$ReflectionData<T> reflectionData();",
                "    descriptor: ()Ljava/lang/Class$ReflectionData;",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=3, locals=4, args_size=1",
                "    Signature: #1523                        // ()Ljava/lang/Class$ReflectionData<TT;>;"
        );
    }
    @Test
    public void test_for_method_92() {
        expectedConsecutiveLines = List.of(
                "  private java.lang.Class$ReflectionData<T> newReflectionData(java.lang.ref.SoftReference<java.lang.Class$ReflectionData<T>>, int);",
                "    descriptor: (Ljava/lang/ref/SoftReference;I)Ljava/lang/Class$ReflectionData;",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=5, locals=4, args_size=3",
                "    Signature: #1525                        // (Ljava/lang/ref/SoftReference<Ljava/lang/Class$ReflectionData<TT;>;>;I)Ljava/lang/Class$ReflectionData<TT;>;"
        );
    }
    @Test
    public void test_for_method_93() {
        expectedConsecutiveLines = List.of(
                "  private native java.lang.String getGenericSignature0();",
                "    descriptor: ()Ljava/lang/String;",
                "    flags: (0x0102) ACC_PRIVATE, ACC_NATIVE"
        );
    }
    @Test
    public void test_for_method_94() {
        expectedConsecutiveLines = List.of(
                "  private sun.reflect.generics.factory.GenericsFactory getFactory();",
                "    descriptor: ()Lsun/reflect/generics/factory/GenericsFactory;",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=2, locals=1, args_size=1"
        );
    }
    @Test
    public void test_for_method_95() {
        expectedConsecutiveLines = List.of(
                "  private sun.reflect.generics.repository.ClassRepository getGenericInfo();",
                "    descriptor: ()Lsun/reflect/generics/repository/ClassRepository;",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=2, locals=3, args_size=1"
        );
    }
    @Test
    public void test_for_method_96() {
        expectedConsecutiveLines = List.of(
                "  native byte[] getRawAnnotations();",
                "    descriptor: ()[B",
                "    flags: (0x0100) ACC_NATIVE"
        );
    }
    @Test
    public void test_for_method_97() {
        expectedConsecutiveLines = List.of(
                "  native byte[] getRawTypeAnnotations();",
                "    descriptor: ()[B",
                "    flags: (0x0100) ACC_NATIVE"
        );
    }
    @Test
    public void test_for_method_98() {
        expectedConsecutiveLines = List.of(
                "  static byte[] getExecutableTypeAnnotationBytes(java.lang.reflect.Executable);",
                "    descriptor: (Ljava/lang/reflect/Executable;)[B",
                "    flags: (0x0008) ACC_STATIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1"
        );
    }
    @Test
    public void test_for_method_99() {
        expectedConsecutiveLines = List.of(
                "  native jdk.internal.reflect.ConstantPool getConstantPool();",
                "    descriptor: ()Ljdk/internal/reflect/ConstantPool;",
                "    flags: (0x0100) ACC_NATIVE"
        );
    }
    @Test
    public void test_for_method_100() {
        expectedConsecutiveLines = List.of(
                "  private java.lang.reflect.Field[] privateGetDeclaredFields(boolean);",
                "    descriptor: (Z)[Ljava/lang/reflect/Field;",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=3, locals=4, args_size=2"
        );
    }
    @Test
    public void test_for_method_101() {
        expectedConsecutiveLines = List.of(
                "  private java.lang.reflect.Field[] privateGetPublicFields();",
                "    descriptor: ()[Ljava/lang/reflect/Field;",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=3, locals=8, args_size=1"
        );
    }
    @Test
    public void test_for_method_102() {
        expectedConsecutiveLines = List.of(
                "  private static void addAll(java.util.Collection<java.lang.reflect.Field>, java.lang.reflect.Field[]);",
                "    descriptor: (Ljava/util/Collection;[Ljava/lang/reflect/Field;)V",
                "    flags: (0x000a) ACC_PRIVATE, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=6, args_size=2",
                "    Signature: #1539                        // (Ljava/util/Collection<Ljava/lang/reflect/Field;>;[Ljava/lang/reflect/Field;)V"
        );
    }
    @Test
    public void test_for_method_103() {
        expectedConsecutiveLines = List.of(
                "  private java.lang.reflect.Constructor<T>[] privateGetDeclaredConstructors(boolean);",
                "    descriptor: (Z)[Ljava/lang/reflect/Constructor;",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=2, locals=5, args_size=2",
                "    Signature: #1542                        // (Z)[Ljava/lang/reflect/Constructor<TT;>;"
        );
    }
    @Test
    public void test_for_method_104() {
        expectedConsecutiveLines = List.of(
                "  private java.lang.reflect.Method[] privateGetDeclaredMethods(boolean);",
                "    descriptor: (Z)[Ljava/lang/reflect/Method;",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=3, locals=4, args_size=2"
        );
    }
    @Test
    public void test_for_method_105() {
        expectedConsecutiveLines = List.of(
                "  private java.lang.reflect.Method[] privateGetPublicMethods();",
                "    descriptor: ()[Ljava/lang/reflect/Method;",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=2, locals=13, args_size=1"
        );
    }
    @Test
    public void test_for_method_106() {
        expectedConsecutiveLines = List.of(
                "  private static java.lang.reflect.Field searchFields(java.lang.reflect.Field[], java.lang.String);",
                "    descriptor: ([Ljava/lang/reflect/Field;Ljava/lang/String;)Ljava/lang/reflect/Field;",
                "    flags: (0x000a) ACC_PRIVATE, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=6, args_size=2"
        );
    }
    @Test
    public void test_for_method_107() {
        expectedConsecutiveLines = List.of(
                "  private java.lang.reflect.Field getField0(java.lang.String);",
                "    descriptor: (Ljava/lang/String;)Ljava/lang/reflect/Field;",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=2, locals=8, args_size=2"
        );
    }
    @Test
    public void test_for_method_108() {
        expectedConsecutiveLines = List.of(
                "  private static java.lang.reflect.Method searchMethods(java.lang.reflect.Method[], java.lang.String, java.lang.Class<?>[]);",
                "    descriptor: ([Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;",
                "    flags: (0x000a) ACC_PRIVATE, ACC_STATIC",
                "    Code:",
                "      stack=3, locals=9, args_size=3",
                "    Signature: #1546                        // ([Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Class<*>;)Ljava/lang/reflect/Method;"
        );
    }
    @Test
    public void test_for_method_109() {
        expectedConsecutiveLines = List.of(
                "  private java.lang.reflect.Method getMethod0(java.lang.String, java.lang.Class<?>[]);",
                "    descriptor: (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=4, locals=4, args_size=3",
                "    Signature: #1475                        // (Ljava/lang/String;[Ljava/lang/Class<*>;)Ljava/lang/reflect/Method;"
        );
    }
    @Test
    public void test_for_method_110() {
        expectedConsecutiveLines = List.of(
                "  private java.lang.PublicMethods$MethodList getMethodsRecursive(java.lang.String, java.lang.Class<?>[], boolean);",
                "    descriptor: (Ljava/lang/String;[Ljava/lang/Class;Z)Ljava/lang/PublicMethods$MethodList;",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=5, locals=11, args_size=4",
                "    Signature: #1549                        // (Ljava/lang/String;[Ljava/lang/Class<*>;Z)Ljava/lang/PublicMethods$MethodList;"
        );
    }
    @Test
    public void test_for_method_111() {
        expectedConsecutiveLines = List.of(
                "  private java.lang.reflect.Constructor<T> getConstructor0(java.lang.Class<?>[], int) throws java.lang.NoSuchMethodException;",
                "    descriptor: ([Ljava/lang/Class;I)Ljava/lang/reflect/Constructor;",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=5, locals=9, args_size=3",
                "    Exceptions:",
                "      throws java.lang.NoSuchMethodException",
                "    Signature: #1552                        // ([Ljava/lang/Class<*>;I)Ljava/lang/reflect/Constructor<TT;>;"
        );
    }
    @Test
    public void test_for_method_112() {
        expectedConsecutiveLines = List.of(
                "  private static boolean arrayContentsEq(java.lang.Object[], java.lang.Object[]);",
                "    descriptor: ([Ljava/lang/Object;[Ljava/lang/Object;)Z",
                "    flags: (0x000a) ACC_PRIVATE, ACC_STATIC",
                "    Code:",
                "      stack=3, locals=3, args_size=2"
        );
    }
    @Test
    public void test_for_method_113() {
        expectedConsecutiveLines = List.of(
                "  private static java.lang.reflect.Field[] copyFields(java.lang.reflect.Field[]);",
                "    descriptor: ([Ljava/lang/reflect/Field;)[Ljava/lang/reflect/Field;",
                "    flags: (0x000a) ACC_PRIVATE, ACC_STATIC",
                "    Code:",
                "      stack=5, locals=4, args_size=1"
        );
    }
    @Test
    public void test_for_method_114() {
        expectedConsecutiveLines = List.of(
                "  private static java.lang.reflect.Method[] copyMethods(java.lang.reflect.Method[]);",
                "    descriptor: ([Ljava/lang/reflect/Method;)[Ljava/lang/reflect/Method;",
                "    flags: (0x000a) ACC_PRIVATE, ACC_STATIC",
                "    Code:",
                "      stack=5, locals=4, args_size=1"
        );
    }
    @Test
    public void test_for_method_115() {
        expectedConsecutiveLines = List.of(
                "  private static <U extends java.lang.Object> java.lang.reflect.Constructor<U>[] copyConstructors(java.lang.reflect.Constructor<U>[]);",
                "    descriptor: ([Ljava/lang/reflect/Constructor;)[Ljava/lang/reflect/Constructor;",
                "    flags: (0x000a) ACC_PRIVATE, ACC_STATIC",
                "    Code:",
                "      stack=5, locals=4, args_size=1",
                "    Signature: #1558                        // <U:Ljava/lang/Object;>([Ljava/lang/reflect/Constructor<TU;>;)[Ljava/lang/reflect/Constructor<TU;>;"
        );
    }
    @Test
    public void test_for_method_116() {
        expectedConsecutiveLines = List.of(
                "  private native java.lang.reflect.Field[] getDeclaredFields0(boolean);",
                "    descriptor: (Z)[Ljava/lang/reflect/Field;",
                "    flags: (0x0102) ACC_PRIVATE, ACC_NATIVE"
        );
    }
    @Test
    public void test_for_method_117() {
        expectedConsecutiveLines = List.of(
                "  private native java.lang.reflect.Method[] getDeclaredMethods0(boolean);",
                "    descriptor: (Z)[Ljava/lang/reflect/Method;",
                "    flags: (0x0102) ACC_PRIVATE, ACC_NATIVE"
        );
    }
    @Test
    public void test_for_method_118() {
        expectedConsecutiveLines = List.of(
                "  private native java.lang.reflect.Constructor<T>[] getDeclaredConstructors0(boolean);",
                "    descriptor: (Z)[Ljava/lang/reflect/Constructor;",
                "    flags: (0x0102) ACC_PRIVATE, ACC_NATIVE",
                "    Signature: #1542                        // (Z)[Ljava/lang/reflect/Constructor<TT;>;"
        );
    }
    @Test
    public void test_for_method_119() {
        expectedConsecutiveLines = List.of(
                "  private native java.lang.Class<?>[] getDeclaredClasses0();",
                "    descriptor: ()[Ljava/lang/Class;",
                "    flags: (0x0102) ACC_PRIVATE, ACC_NATIVE",
                "    Signature: #1416                        // ()[Ljava/lang/Class<*>;"
        );
    }
    @Test
    public void test_for_method_120() {
        expectedConsecutiveLines = List.of(
                "  private native java.lang.reflect.RecordComponent[] getRecordComponents0();",
                "    descriptor: ()[Ljava/lang/reflect/RecordComponent;",
                "    flags: (0x0102) ACC_PRIVATE, ACC_NATIVE"
        );
    }
    @Test
    public void test_for_method_121() {
        expectedConsecutiveLines = List.of(
                "  private native boolean isRecord0();",
                "    descriptor: ()Z",
                "    flags: (0x0102) ACC_PRIVATE, ACC_NATIVE"
        );
    }
    @Test
    public void test_for_method_122() {
        expectedConsecutiveLines = List.of(
                "  private java.lang.String methodToString(java.lang.String, java.lang.Class<?>[]);",
                "    descriptor: (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/String;",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=5, locals=3, args_size=3",
                "    Signature: #1560                        // (Ljava/lang/String;[Ljava/lang/Class<*>;)Ljava/lang/String;"
        );
    }
    @Test
    public void test_for_method_123() {
        expectedConsecutiveLines = List.of(
                "  public boolean desiredAssertionStatus();",
                "    descriptor: ()Z",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=4, args_size=1"
        );
    }
    @Test
    public void test_for_method_124() {
        expectedConsecutiveLines = List.of(
                "  private static native boolean desiredAssertionStatus0(java.lang.Class<?>);",
                "    descriptor: (Ljava/lang/Class;)Z",
                "    flags: (0x010a) ACC_PRIVATE, ACC_STATIC, ACC_NATIVE",
                "    Signature: #1401                        // (Ljava/lang/Class<*>;)Z"
        );
    }
    @Test
    public void test_for_method_125() {
        expectedConsecutiveLines = List.of(
                "  public boolean isEnum();",
                "    descriptor: ()Z",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1"
        );
    }
    @Test
    public void test_for_method_126() {
        expectedConsecutiveLines = List.of(
                "  public boolean isRecord();",
                "    descriptor: ()Z",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1"
        );
    }
    @Test
    public void test_for_method_127() {
        expectedConsecutiveLines = List.of(
                "  private static jdk.internal.reflect.ReflectionFactory getReflectionFactory();",
                "    descriptor: ()Ljdk/internal/reflect/ReflectionFactory;",
                "    flags: (0x000a) ACC_PRIVATE, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=1, args_size=0"
        );
    }
    @Test
    public void test_for_method_128() {
        expectedConsecutiveLines = List.of(
                "  public T[] getEnumConstants();",
                "    descriptor: ()[Ljava/lang/Object;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=2, args_size=1",
                "    Signature: #1562                        // ()[TT;"
        );
    }
    @Test
    public void test_for_method_129() {
        expectedConsecutiveLines = List.of(
                "  T[] getEnumConstantsShared();",
                "    descriptor: ()[Ljava/lang/Object;",
                "    flags: (0x0000)",
                "    Code:",
                "      stack=4, locals=4, args_size=1",
                "    Signature: #1562                        // ()[TT;"
        );
    }
    @Test
    public void test_for_method_130() {
        expectedConsecutiveLines = List.of(
                "  java.util.Map<java.lang.String, T> enumConstantDirectory();",
                "    descriptor: ()Ljava/util/Map;",
                "    flags: (0x0000)",
                "    Code:",
                "      stack=4, locals=7, args_size=1",
                "    Signature: #1570                        // ()Ljava/util/Map<Ljava/lang/String;TT;>;"
        );
    }
    @Test
    public void test_for_method_131() {
        expectedConsecutiveLines = List.of(
                "  public T cast(java.lang.Object);",
                "    descriptor: (Ljava/lang/Object;)Ljava/lang/Object;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=4, locals=2, args_size=2",
                "    Signature: #1573                        // (Ljava/lang/Object;)TT;"
        );
    }
    @Test
    public void test_for_method_132() {
        expectedConsecutiveLines = List.of(
                "  private java.lang.String cannotCastMsg(java.lang.Object);",
                "    descriptor: (Ljava/lang/Object;)Ljava/lang/String;",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=2, locals=2, args_size=2"
        );
    }
    @Test
    public void test_for_method_133() {
        expectedConsecutiveLines = List.of(
                "  public <U extends java.lang.Object> java.lang.Class<? extends U> asSubclass(java.lang.Class<U>);",
                "    descriptor: (Ljava/lang/Class;)Ljava/lang/Class;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=2, args_size=2",
                "    Signature: #1578                        // <U:Ljava/lang/Object;>(Ljava/lang/Class<TU;>;)Ljava/lang/Class<+TU;>;"
        );
    }
    @Test
    public void test_for_method_134() {
        expectedConsecutiveLines = List.of(
                "  public <A extends java.lang.annotation.Annotation> A getAnnotation(java.lang.Class<A>);",
                "    descriptor: (Ljava/lang/Class;)Ljava/lang/annotation/Annotation;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "    Signature: #1583                        // <A::Ljava/lang/annotation/Annotation;>(Ljava/lang/Class<TA;>;)TA;"
        );
    }
    @Test
    public void test_for_method_135() {
        expectedConsecutiveLines = List.of(
                "  public boolean isAnnotationPresent(java.lang.Class<? extends java.lang.annotation.Annotation>);",
                "    descriptor: (Ljava/lang/Class;)Z",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "    Signature: #1585                        // (Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Z"
        );
    }
    @Test
    public void test_for_method_136() {
        expectedConsecutiveLines = List.of(
                "  public <A extends java.lang.annotation.Annotation> A[] getAnnotationsByType(java.lang.Class<A>);",
                "    descriptor: (Ljava/lang/Class;)[Ljava/lang/annotation/Annotation;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=3, args_size=2",
                "    Signature: #1588                        // <A::Ljava/lang/annotation/Annotation;>(Ljava/lang/Class<TA;>;)[TA;"
        );
    }
    @Test
    public void test_for_method_137() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.annotation.Annotation[] getAnnotations();",
                "    descriptor: ()[Ljava/lang/annotation/Annotation;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1"
        );
    }
    @Test
    public void test_for_method_138() {
        expectedConsecutiveLines = List.of(
                "  public <A extends java.lang.annotation.Annotation> A getDeclaredAnnotation(java.lang.Class<A>);",
                "    descriptor: (Ljava/lang/Class;)Ljava/lang/annotation/Annotation;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "    Signature: #1583                        // <A::Ljava/lang/annotation/Annotation;>(Ljava/lang/Class<TA;>;)TA;"
        );
    }
    @Test
    public void test_for_method_139() {
        expectedConsecutiveLines = List.of(
                "  public <A extends java.lang.annotation.Annotation> A[] getDeclaredAnnotationsByType(java.lang.Class<A>);",
                "    descriptor: (Ljava/lang/Class;)[Ljava/lang/annotation/Annotation;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "    Signature: #1588                        // <A::Ljava/lang/annotation/Annotation;>(Ljava/lang/Class<TA;>;)[TA;"
        );
    }
    @Test
    public void test_for_method_140() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.annotation.Annotation[] getDeclaredAnnotations();",
                "    descriptor: ()[Ljava/lang/annotation/Annotation;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1"
        );
    }
    @Test
    public void test_for_method_141() {
        expectedConsecutiveLines = List.of(
                "  private java.lang.Class$AnnotationData annotationData();",
                "    descriptor: ()Ljava/lang/Class$AnnotationData;",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=3, locals=4, args_size=1"
        );
    }
    @Test
    public void test_for_method_142() {
        expectedConsecutiveLines = List.of(
                "  private java.lang.Class$AnnotationData createAnnotationData(int);",
                "    descriptor: (I)Ljava/lang/Class$AnnotationData;",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=5, locals=9, args_size=2"
        );
    }
    @Test
    public void test_for_method_143() {
        expectedConsecutiveLines = List.of(
                "  boolean casAnnotationType(sun.reflect.annotation.AnnotationType, sun.reflect.annotation.AnnotationType);",
                "    descriptor: (Lsun/reflect/annotation/AnnotationType;Lsun/reflect/annotation/AnnotationType;)Z",
                "    flags: (0x0000)",
                "    Code:",
                "      stack=3, locals=3, args_size=3"
        );
    }
    @Test
    public void test_for_method_144() {
        expectedConsecutiveLines = List.of(
                "  sun.reflect.annotation.AnnotationType getAnnotationType();",
                "    descriptor: ()Lsun/reflect/annotation/AnnotationType;",
                "    flags: (0x0000)",
                "    Code:",
                "      stack=1, locals=1, args_size=1"
        );
    }
    @Test
    public void test_for_method_145() {
        expectedConsecutiveLines = List.of(
                "  java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>, java.lang.annotation.Annotation> getDeclaredAnnotationMap();",
                "    descriptor: ()Ljava/util/Map;",
                "    flags: (0x0000)",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "    Signature: #1606                        // ()Ljava/util/Map<Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;Ljava/lang/annotation/Annotation;>;"
        );
    }
    @Test
    public void test_for_method_146() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.reflect.AnnotatedType getAnnotatedSuperclass();",
                "    descriptor: ()Ljava/lang/reflect/AnnotatedType;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=1, args_size=1"
        );
    }
    @Test
    public void test_for_method_147() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.reflect.AnnotatedType[] getAnnotatedInterfaces();",
                "    descriptor: ()[Ljava/lang/reflect/AnnotatedType;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=1, args_size=1"
        );
    }
    @Test
    public void test_for_method_148() {
        expectedConsecutiveLines = List.of(
                "  private native java.lang.Class<?> getNestHost0();",
                "    descriptor: ()Ljava/lang/Class;",
                "    flags: (0x0102) ACC_PRIVATE, ACC_NATIVE",
                "    Signature: #1423                        // ()Ljava/lang/Class<*>;"
        );
    }
    @Test
    public void test_for_method_149() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Class<?> getNestHost();",
                "    descriptor: ()Ljava/lang/Class;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=4, locals=3, args_size=1",
                "    Signature: #1423                        // ()Ljava/lang/Class<*>;"
        );
    }
    @Test
    public void test_for_method_150() {
        expectedConsecutiveLines = List.of(
                "  public boolean isNestmateOf(java.lang.Class<?>);",
                "    descriptor: (Ljava/lang/Class;)Z",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "    Signature: #1401                        // (Ljava/lang/Class<*>;)Z"
        );
    }
    @Test
    public void test_for_method_151() {
        expectedConsecutiveLines = List.of(
                "  private native java.lang.Class<?>[] getNestMembers0();",
                "    descriptor: ()[Ljava/lang/Class;",
                "    flags: (0x0102) ACC_PRIVATE, ACC_NATIVE",
                "    Signature: #1416                        // ()[Ljava/lang/Class<*>;"
        );
    }
    @Test
    public void test_for_method_152() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Class<?>[] getNestMembers();",
                "    descriptor: ()[Ljava/lang/Class;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=4, locals=3, args_size=1",
                "    Signature: #1416                        // ()[Ljava/lang/Class<*>;"
        );
    }
    @Test
    public void test_for_method_153() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.String descriptorString();",
                "    descriptor: ()Ljava/lang/String;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=4, locals=3, args_size=1"
        );
    }
    @Test
    public void test_for_method_154() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Class<?> componentType();",
                "    descriptor: ()Ljava/lang/Class;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "    Signature: #1423                        // ()Ljava/lang/Class<*>;"
        );
    }
    @Test
    public void test_for_method_155() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Class<?> arrayType();",
                "    descriptor: ()Ljava/lang/Class;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=2, args_size=1",
                "    Signature: #1423                        // ()Ljava/lang/Class<*>;"
        );
    }
    @Test
    public void test_for_method_156() {
        expectedConsecutiveLines = List.of(
                "  public java.util.Optional<java.lang.constant.ClassDesc> describeConstable();",
                "    descriptor: ()Ljava/util/Optional;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=2, args_size=1",
                "    Signature: #1619                        // ()Ljava/util/Optional<Ljava/lang/constant/ClassDesc;>;"
        );
    }
    @Test
    public void test_for_method_157() {
        expectedConsecutiveLines = List.of(
                "  public native boolean isHidden();",
                "    descriptor: ()Z",
                "    flags: (0x0101) ACC_PUBLIC, ACC_NATIVE"
        );
    }
    @Test
    public void test_for_method_158() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Class<?>[] getPermittedSubclasses();",
                "    descriptor: ()[Ljava/lang/Class;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=3, args_size=1",
                "    Signature: #1416                        // ()[Ljava/lang/Class<*>;"
        );
    }
    @Test
    public void test_for_method_159() {
        expectedConsecutiveLines = List.of(
                "  private boolean isDirectSubType(java.lang.Class<?>);",
                "    descriptor: (Ljava/lang/Class;)Z",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=2, locals=6, args_size=2",
                "    Signature: #1401                        // (Ljava/lang/Class<*>;)Z"
        );
    }
    @Test
    public void test_for_method_160() {
        expectedConsecutiveLines = List.of(
                "  public boolean isSealed();",
                "    descriptor: ()Z",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1"
        );
    }
    @Test
    public void test_for_method_161() {
        expectedConsecutiveLines = List.of(
                "  private native java.lang.Class<?>[] getPermittedSubclasses0();",
                "    descriptor: ()[Ljava/lang/Class;",
                "    flags: (0x0102) ACC_PRIVATE, ACC_NATIVE",
                "    Signature: #1416                        // ()[Ljava/lang/Class<*>;"
        );
    }
    @Test
    public void test_for_method_162() {
        expectedConsecutiveLines = List.of(
                "  private int getClassFileVersion();",
                "    descriptor: ()I",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=1, locals=2, args_size=1"
        );
    }
    @Test
    public void test_for_method_163() {
        expectedConsecutiveLines = List.of(
                "  private native int getClassFileVersion0();",
                "    descriptor: ()I",
                "    flags: (0x0102) ACC_PRIVATE, ACC_NATIVE"
        );
    }
    @Test
    public void test_for_method_164() {
        expectedConsecutiveLines = List.of(
                "  private int getClassAccessFlagsRaw();",
                "    descriptor: ()I",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=1, locals=2, args_size=1"
        );
    }
    @Test
    public void test_for_method_165() {
        expectedConsecutiveLines = List.of(
                "  private native int getClassAccessFlagsRaw0();",
                "    descriptor: ()I",
                "    flags: (0x0102) ACC_PRIVATE, ACC_NATIVE"
        );
    }
    @Test
    public void test_for_method_166() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.invoke.TypeDescriptor$OfField arrayType();",
                "    descriptor: ()Ljava/lang/invoke/TypeDescriptor$OfField;",
                "    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1"
        );
    }
    @Test
    public void test_for_method_167() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.invoke.TypeDescriptor$OfField componentType();",
                "    descriptor: ()Ljava/lang/invoke/TypeDescriptor$OfField;",
                "    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1"
        );
    }
    @Test
    public void test_for_method_168() {
        expectedConsecutiveLines = List.of(
                "  private static java.lang.Class[] lambda$getPermittedSubclasses$2(int);",
                "    descriptor: (I)[Ljava/lang/Class;",
                "    flags: (0x100a) ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1"
        );
    }
    @Test
    public void test_for_method_169() {
        expectedConsecutiveLines = List.of(
                "  private boolean lambda$getPermittedSubclasses$1(java.lang.Class);",
                "    descriptor: (Ljava/lang/Class;)Z",
                "    flags: (0x1002) ACC_PRIVATE, ACC_SYNTHETIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2"
        );
    }
    @Test
    public void test_for_method_170() {
        expectedConsecutiveLines = List.of(
                "  private static java.lang.String lambda$methodToString$0(java.lang.Class);",
                "    descriptor: (Ljava/lang/Class;)Ljava/lang/String;",
                "    flags: (0x100a) ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1"
        );
    }
}
