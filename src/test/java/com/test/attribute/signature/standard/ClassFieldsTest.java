package com.test.attribute.signature.standard;

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
    public void test_for_field_cachedConstructor() {
        expectedConsecutiveLines = List.of(
                "  private volatile transient java.lang.reflect.Constructor<T> cachedConstructor;",
                "    descriptor: Ljava/lang/reflect/Constructor;",
                "    flags: (0x00c2) ACC_PRIVATE, ACC_VOLATILE, ACC_TRANSIENT",
                "    Signature: #1322                        // Ljava/lang/reflect/Constructor<TT;>;"
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
    public void test_for_field_reflectionData() {
        expectedConsecutiveLines = List.of(
                "  private volatile transient java.lang.ref.SoftReference<java.lang.Class$ReflectionData<T>> reflectionData;",
                "    descriptor: Ljava/lang/ref/SoftReference;",
                "    flags: (0x00c2) ACC_PRIVATE, ACC_VOLATILE, ACC_TRANSIENT",
                "    Signature: #1324                        // Ljava/lang/ref/SoftReference<Ljava/lang/Class$ReflectionData<TT;>;>;"
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
}
