package com.test.present.cp.case9;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ClassCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Class"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "     #7 = Fieldref           #8.#9        // java/lang/Class.classLoader:Ljava/lang/ClassLoader;",
                "    #13 = Fieldref           #8.#14       // java/lang/Class.componentType:Ljava/lang/Class;",
                "   #183 = Fieldref           #184.#185    // sun/security/util/SecurityConstants.GET_CLASSLOADER_PERMISSION:Ljava/lang/RuntimePermission;",
                "   #235 = Fieldref           #8.#236      // java/lang/Class.cachedConstructor:Ljava/lang/reflect/Constructor;",
                "   #294 = Fieldref           #8.#295      // java/lang/Class.name:Ljava/lang/String;",
                "   #305 = Fieldref           #8.#306      // java/lang/Class.module:Ljava/lang/Module;",
                "   #309 = Fieldref           #8.#310      // java/lang/Class.classData:Ljava/lang/Object;",
                "   #331 = Fieldref           #8.#332      // java/lang/Class.packageName:Ljava/lang/String;",
                "   #362 = Fieldref           #363.#364    // java/lang/Class$ReflectionData.interfaces:[Ljava/lang/Class;",
                "   #387 = Fieldref           #388.#389    // java/lang/reflect/AccessFlag$Location.INNER_CLASS:Ljava/lang/reflect/AccessFlag$Location;",
                "   #393 = Fieldref           #388.#394    // java/lang/reflect/AccessFlag$Location.CLASS:Ljava/lang/reflect/AccessFlag$Location;",
                "   #516 = Fieldref           #363.#517    // java/lang/Class$ReflectionData.simpleName:Ljava/lang/String;",
                "   #532 = Fieldref           #363.#533    // java/lang/Class$ReflectionData.canonicalName:Ljava/lang/String;",
                "   #538 = Fieldref           #363.#539    // java/lang/Class$ReflectionData.NULL_SENTINEL:Ljava/lang/String;",
                "   #731 = Fieldref           #184.#732    // sun/security/util/SecurityConstants.GET_PD_PERMISSION:Ljava/lang/RuntimePermission;",
                "   #741 = Fieldref           #8.#742      // java/lang/Class.allPermDomain:Ljava/security/ProtectionDomain;",
                "   #748 = Fieldref           #184.#749    // sun/security/util/SecurityConstants.ALL_PERMISSION:Ljava/security/AllPermission;",
                "   #759 = Fieldref           #184.#760    // sun/security/util/SecurityConstants.CHECK_MEMBER_ACCESS_PERMISSION:Ljava/lang/RuntimePermission;",
                "   #819 = Fieldref           #8.#820      // java/lang/Class.reflectionData:Ljava/lang/ref/SoftReference;",
                "   #822 = Fieldref           #8.#823      // java/lang/Class.classRedefinedCount:I",
                "   #831 = Fieldref           #363.#832    // java/lang/Class$ReflectionData.redefinedCount:I",
                "   #858 = Fieldref           #8.#859      // java/lang/Class.genericInfo:Lsun/reflect/generics/repository/ClassRepository;",
                "   #865 = Fieldref           #318.#866    // sun/reflect/generics/repository/ClassRepository.NONE:Lsun/reflect/generics/repository/ClassRepository;",
                "   #875 = Fieldref           #363.#876    // java/lang/Class$ReflectionData.declaredPublicFields:[Ljava/lang/reflect/Field;",
                "   #879 = Fieldref           #363.#880    // java/lang/Class$ReflectionData.declaredFields:[Ljava/lang/reflect/Field;",
                "   #889 = Fieldref           #363.#890    // java/lang/Class$ReflectionData.publicFields:[Ljava/lang/reflect/Field;",
                "   #909 = Fieldref           #363.#910    // java/lang/Class$ReflectionData.publicConstructors:[Ljava/lang/reflect/Constructor;",
                "   #913 = Fieldref           #363.#914    // java/lang/Class$ReflectionData.declaredConstructors:[Ljava/lang/reflect/Constructor;",
                "   #921 = Fieldref           #363.#922    // java/lang/Class$ReflectionData.declaredPublicMethods:[Ljava/lang/reflect/Method;",
                "   #925 = Fieldref           #363.#926    // java/lang/Class$ReflectionData.declaredMethods:[Ljava/lang/reflect/Method;",
                "   #935 = Fieldref           #363.#936    // java/lang/Class$ReflectionData.publicMethods:[Ljava/lang/reflect/Method;",
                "   #955 = Fieldref           #8.#956      // java/lang/Class.EMPTY_CLASS_ARRAY:[Ljava/lang/Class;",
                "   #988 = Fieldref           #162.#989    // java/lang/ClassLoader.assertionLock:Ljava/lang/Object;",
                "   #991 = Fieldref           #162.#992    // java/lang/ClassLoader.classAssertionStatus:Ljava/util/Map;",
                "  #1005 = Fieldref           #8.#1006     // java/lang/Class.reflectionFactory:Ljdk/internal/reflect/ReflectionFactory;",
                "  #1018 = Fieldref           #8.#1019     // java/lang/Class.enumConstants:[Ljava/lang/Object;",
                "  #1039 = Fieldref           #8.#1040     // java/lang/Class.enumConstantDirectory:Ljava/util/Map;",
                "  #1077 = Fieldref           #1078.#1079  // java/lang/Class$AnnotationData.annotations:Ljava/util/Map;",
                "  #1091 = Fieldref           #1078.#1092  // java/lang/Class$AnnotationData.declaredAnnotations:Ljava/util/Map;",
                "  #1109 = Fieldref           #8.#1110     // java/lang/Class.annotationData:Ljava/lang/Class$AnnotationData;",
                "  #1112 = Fieldref           #1078.#832   // java/lang/Class$AnnotationData.redefinedCount:I",
                "  #1182 = Fieldref           #8.#1183     // java/lang/Class.annotationType:Lsun/reflect/annotation/AnnotationType;",
                "  #1186 = Fieldref           #1187.#1188  // java/lang/Void.TYPE:Ljava/lang/Class;",
                "  #1302 = Fieldref           #8.#1303     // java/lang/Class.serialPersistentFields:[Ljava/io/ObjectStreamField;"
        );
    }
}
