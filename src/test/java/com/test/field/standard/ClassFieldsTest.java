package com.test.field.standard;

import com.test.field.FieldPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ClassFieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Class"));
    }

    @Test
    public void test_for_field_ANNOTATION() {
        expectedConsecutiveLines = List.of(
                "  private static final int ANNOTATION;",
                "    descriptor: I",
                "    flags: (0x001a) ACC_PRIVATE, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 8192"
        );
    }
    @Test
    public void test_for_field_ENUM() {
        expectedConsecutiveLines = List.of(
                "  private static final int ENUM;",
                "    descriptor: I",
                "    flags: (0x001a) ACC_PRIVATE, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 16384"
        );
    }
    @Test
    public void test_for_field_SYNTHETIC() {
        expectedConsecutiveLines = List.of(
                "  private static final int SYNTHETIC;",
                "    descriptor: I",
                "    flags: (0x001a) ACC_PRIVATE, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 4096"
        );
    }
    @Test
    public void test_for_field_cachedConstructor() {
        expectedConsecutiveLines = List.of(
                "  private volatile transient java.lang.reflect.Constructor<T> cachedConstructor;",
                "    descriptor: Ljava/lang/reflect/Constructor;",
                "    flags: (0x00c2) ACC_PRIVATE, ACC_VOLATILE, ACC_TRANSIENT",
                "    Signature: #1322                        // Ljava/lang/reflect/Constructor<TT;>;"
        );
    }
    @Test
    public void test_for_field_name() {
        expectedConsecutiveLines = List.of(
                "  private transient java.lang.String name;",
                "    descriptor: Ljava/lang/String;",
                "    flags: (0x0082) ACC_PRIVATE, ACC_TRANSIENT"
        );
    }
    @Test
    public void test_for_field_module() {
        expectedConsecutiveLines = List.of(
                "  private transient java.lang.Module module;",
                "    descriptor: Ljava/lang/Module;",
                "    flags: (0x0082) ACC_PRIVATE, ACC_TRANSIENT"
        );
    }
    @Test
    public void test_for_field_classLoader() {
        expectedConsecutiveLines = List.of(
                "  private final java.lang.ClassLoader classLoader;",
                "    descriptor: Ljava/lang/ClassLoader;",
                "    flags: (0x0012) ACC_PRIVATE, ACC_FINAL"
        );
    }
    @Test
    public void test_for_field_classData() {
        expectedConsecutiveLines = List.of(
                "  private transient java.lang.Object classData;",
                "    descriptor: Ljava/lang/Object;",
                "    flags: (0x0082) ACC_PRIVATE, ACC_TRANSIENT"
        );
    }
    @Test
    public void test_for_field_packageName() {
        expectedConsecutiveLines = List.of(
                "  private transient java.lang.String packageName;",
                "    descriptor: Ljava/lang/String;",
                "    flags: (0x0082) ACC_PRIVATE, ACC_TRANSIENT"
        );
    }
    @Test
    public void test_for_field_componentType() {
        expectedConsecutiveLines = List.of(
                "  private final java.lang.Class<?> componentType;",
                "    descriptor: Ljava/lang/Class;",
                "    flags: (0x0012) ACC_PRIVATE, ACC_FINAL",
                "    Signature: #1323                        // Ljava/lang/Class<*>;"
        );
    }
    @Test
    public void test_for_field_allPermDomain() {
        expectedConsecutiveLines = List.of(
                "  private static java.security.ProtectionDomain allPermDomain;",
                "    descriptor: Ljava/security/ProtectionDomain;",
                "    flags: (0x000a) ACC_PRIVATE, ACC_STATIC"
        );
    }
    @Test
    public void test_for_field_reflectionData() {
        expectedConsecutiveLines = List.of(
                "  private volatile transient java.lang.ref.SoftReference<java.lang.Class$ReflectionData<T>> reflectionData;",
                "    descriptor: Ljava/lang/ref/SoftReference;",
                "    flags: (0x00c2) ACC_PRIVATE, ACC_VOLATILE, ACC_TRANSIENT",
                "    Signature: #1324                        // Ljava/lang/ref/SoftReference<Ljava/lang/Class$ReflectionData<TT;>;>;"
        );
    }
    @Test
    public void test_for_field_classRedefinedCount() {
        expectedConsecutiveLines = List.of(
                "  private volatile transient int classRedefinedCount;",
                "    descriptor: I",
                "    flags: (0x00c2) ACC_PRIVATE, ACC_VOLATILE, ACC_TRANSIENT"
        );
    }
    @Test
    public void test_for_field_genericInfo() {
        expectedConsecutiveLines = List.of(
                "  private volatile transient sun.reflect.generics.repository.ClassRepository genericInfo;",
                "    descriptor: Lsun/reflect/generics/repository/ClassRepository;",
                "    flags: (0x00c2) ACC_PRIVATE, ACC_VOLATILE, ACC_TRANSIENT"
        );
    }
    @Test
    public void test_for_field_EMPTY_CLASS_ARRAY() {
        expectedConsecutiveLines = List.of(
                "  private static final java.lang.Class<?>[] EMPTY_CLASS_ARRAY;",
                "    descriptor: [Ljava/lang/Class;",
                "    flags: (0x001a) ACC_PRIVATE, ACC_STATIC, ACC_FINAL",
                "    Signature: #1325                        // [Ljava/lang/Class<*>;"
        );
    }
    @Test
    public void test_for_field_serialVersionUID() {
        expectedConsecutiveLines = List.of(
                "  private static final long serialVersionUID;",
                "    descriptor: J",
                "    flags: (0x001a) ACC_PRIVATE, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: long 3206093459760846163l"
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
    @Test
    public void test_for_field_reflectionFactory() {
        expectedConsecutiveLines = List.of(
                "  private static jdk.internal.reflect.ReflectionFactory reflectionFactory;",
                "    descriptor: Ljdk/internal/reflect/ReflectionFactory;",
                "    flags: (0x000a) ACC_PRIVATE, ACC_STATIC"
        );
    }
    @Test
    public void test_for_field_enumConstants() {
        expectedConsecutiveLines = List.of(
                "  private volatile transient T[] enumConstants;",
                "    descriptor: [Ljava/lang/Object;",
                "    flags: (0x00c2) ACC_PRIVATE, ACC_VOLATILE, ACC_TRANSIENT",
                "    Signature: #1330                        // [TT;"
        );
    }
    @Test
    public void test_for_field_enumConstantDirectory() {
        expectedConsecutiveLines = List.of(
                "  private volatile transient java.util.Map<java.lang.String, T> enumConstantDirectory;",
                "    descriptor: Ljava/util/Map;",
                "    flags: (0x00c2) ACC_PRIVATE, ACC_VOLATILE, ACC_TRANSIENT",
                "    Signature: #1331                        // Ljava/util/Map<Ljava/lang/String;TT;>;"
        );
    }
    @Test
    public void test_for_field_annotationData() {
        expectedConsecutiveLines = List.of(
                "  private volatile transient java.lang.Class$AnnotationData annotationData;",
                "    descriptor: Ljava/lang/Class$AnnotationData;",
                "    flags: (0x00c2) ACC_PRIVATE, ACC_VOLATILE, ACC_TRANSIENT"
        );
    }
    @Test
    public void test_for_field_annotationType() {
        expectedConsecutiveLines = List.of(
                "  private volatile transient sun.reflect.annotation.AnnotationType annotationType;",
                "    descriptor: Lsun/reflect/annotation/AnnotationType;",
                "    flags: (0x00c2) ACC_PRIVATE, ACC_VOLATILE, ACC_TRANSIENT"
        );
    }
    @Test
    public void test_for_field_classValueMap() {
        expectedConsecutiveLines = List.of(
                "  transient java.lang.ClassValue$ClassValueMap classValueMap;",
                "    descriptor: Ljava/lang/ClassValue$ClassValueMap;",
                "    flags: (0x0080) ACC_TRANSIENT"
        );
    }
}
