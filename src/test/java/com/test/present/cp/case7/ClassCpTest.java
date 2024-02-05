package com.test.present.cp.case7;

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
                "     #2 = Class              #4           // java/lang/Object",
                "     #8 = Class              #10          // java/lang/Class",
                "    #35 = Class              #37          // java/lang/String",
                "    #43 = Class              #44          // java/lang/StringBuilder",
                "    #62 = Class              #64          // java/lang/reflect/Modifier",
                "    #94 = Class              #96          // java/util/Arrays",
                "   #104 = Class              #106         // java/util/stream/Stream",
                "   #116 = Class              #118         // java/util/stream/Collectors",
                "   #132 = Class              #134         // java/lang/reflect/TypeVariable",
                "   #138 = Class              #140         // java/lang/reflect/Type",
                "   #153 = Class              #155         // jdk/internal/reflect/Reflection",
                "   #162 = Class              #164         // java/lang/ClassLoader",
                "   #176 = Class              #178         // java/lang/System",
                "   #184 = Class              #186         // sun/security/util/SecurityConstants",
                "   #190 = Class              #192         // java/lang/SecurityManager",
                "   #199 = Class              #201         // java/util/Objects",
                "   #213 = Class              #215         // java/security/AccessController",
                "   #219 = Class              #221         // java/lang/Module",
                "   #227 = Class              #228         // jdk/internal/loader/BootLoader",
                "   #229 = Class              #230         // java/lang/reflect/Member",
                "   #239 = Class              #240         // java/lang/IllegalAccessException",
                "   #255 = Class              #257         // jdk/internal/reflect/ReflectionFactory",
                "   #260 = Class              #261         // java/lang/Class$1",
                "   #265 = Class              #266         // java/lang/NoSuchMethodException",
                "   #267 = Class              #268         // java/lang/InstantiationException",
                "   #278 = Class              #279         // java/lang/reflect/InvocationTargetException",
                "   #281 = Class              #283         // jdk/internal/misc/Unsafe",
                "   #318 = Class              #319         // sun/reflect/generics/repository/ClassRepository",
                "   #363 = Class              #365         // java/lang/Class$ReflectionData",
                "   #369 = Class              #367         // \"[Ljava/lang/Class;\"",
                "   #388 = Class              #390         // java/lang/reflect/AccessFlag$Location",
                "   #400 = Class              #402         // java/lang/reflect/AccessFlag",
                "   #410 = Class              #412         // java/lang/Class$EnclosingMethodInfo",
                "   #422 = Class              #424         // sun/reflect/generics/repository/MethodRepository",
                "   #445 = Class              #446         // java/lang/reflect/Method",
                "   #464 = Class              #465         // java/lang/InternalError",
                "   #476 = Class              #477         // java/lang/reflect/GenericArrayType",
                "   #482 = Class              #484         // java/lang/reflect/Array",
                "   #493 = Class              #495         // sun/reflect/generics/repository/ConstructorRepository",
                "   #530 = Class              #531         // java/lang/Throwable",
                "   #558 = Class              #560         // jdk/internal/misc/PreviewFeatures",
                "   #581 = Class              #582         // java/lang/Class$2",
                "   #610 = Class              #611         // java/lang/NoSuchFieldException",
                "   #645 = Class              #646         // java/util/ArrayList",
                "   #651 = Class              #653         // java/util/List",
                "   #662 = Class              #664         // jdk/internal/module/Resources",
                "   #676 = Class              #677         // jdk/internal/loader/BuiltinClassLoader",
                "   #684 = Class              #686         // java/net/URL",
                "   #689 = Class              #690         // java/io/IOException",
                "   #691 = Class              #692         // java/lang/SecurityException",
                "   #715 = Class              #717         // java/lang/module/ModuleDescriptor",
                "   #721 = Class              #723         // java/util/Set",
                "   #745 = Class              #746         // java/security/Permissions",
                "   #754 = Class              #755         // java/security/ProtectionDomain",
                "   #763 = Class              #765         // sun/reflect/misc/ReflectUtil",
                "   #775 = Class              #777         // java/lang/reflect/Proxy",
                "   #789 = Class              #790         // java/util/HashSet",
                "   #803 = Class              #805         // java/util/Iterator",
                "   #827 = Class              #829         // java/lang/ref/SoftReference",
                "   #843 = Class              #845         // java/lang/Class$Atomic",
                "   #849 = Class              #851         // sun/reflect/generics/scope/ClassScope",
                "   #854 = Class              #856         // sun/reflect/generics/factory/CoreReflectionFactory",
                "   #892 = Class              #893         // java/util/LinkedHashSet",
                "   #899 = Class              #900         // java/lang/reflect/Field",
                "   #905 = Class              #878         // \"[Ljava/lang/reflect/Field;\"",
                "   #907 = Class              #908         // java/util/Collection",
                "   #916 = Class              #917         // java/lang/reflect/Constructor",
                "   #938 = Class              #939         // java/lang/PublicMethods",
                "   #963 = Class              #965         // java/lang/PublicMethods$MethodList",
                "   #977 = Class              #912         // \"[Ljava/lang/reflect/Constructor;\"",
                "   #998 = Class              #999         // java/lang/Enum",
                "  #1000 = Class              #1001        // java/lang/Record",
                "  #1009 = Class              #1010        // jdk/internal/reflect/ReflectionFactory$GetReflectionFactoryAction",
                "  #1016 = Class              #1017        // \"[Ljava/lang/Object;\"",
                "  #1026 = Class              #1027        // java/lang/Class$3",
                "  #1035 = Class              #1036        // java/lang/NullPointerException",
                "  #1037 = Class              #1038        // java/lang/ClassCastException",
                "  #1042 = Class              #1043        // java/lang/IllegalArgumentException",
                "  #1048 = Class              #1050        // java/util/HashMap",
                "  #1056 = Class              #1058        // java/util/Map",
                "  #1078 = Class              #1080        // java/lang/Class$AnnotationData",
                "  #1084 = Class              #1085        // java/lang/annotation/Annotation",
                "  #1087 = Class              #1089        // java/lang/reflect/GenericDeclaration",
                "  #1095 = Class              #1097        // sun/reflect/annotation/AnnotationSupport",
                "  #1101 = Class              #1103        // sun/reflect/annotation/AnnotationParser",
                "  #1136 = Class              #1137        // java/util/Map$Entry",
                "  #1142 = Class              #1144        // sun/reflect/annotation/AnnotationType",
                "  #1154 = Class              #1156        // java/lang/Math",
                "  #1163 = Class              #1165        // java/util/LinkedHashMap",
                "  #1187 = Class              #1189        // java/lang/Void",
                "  #1195 = Class              #1197        // sun/reflect/annotation/TypeAnnotationParser",
                "  #1214 = Class              #1216        // sun/invoke/util/Wrapper",
                "  #1233 = Class              #1234        // java/lang/UnsupportedOperationException",
                "  #1238 = Class              #1240        // java/util/Optional",
                "  #1244 = Class              #1246        // java/lang/constant/ClassDesc",
                "  #1300 = Class              #1301        // java/io/ObjectStreamField",
                "  #1306 = Class              #1307        // java/io/Serializable",
                "  #1308 = Class              #1309        // java/lang/reflect/AnnotatedElement",
                "  #1310 = Class              #1311        // java/lang/invoke/TypeDescriptor$OfField",
                "  #1312 = Class              #1313        // java/lang/constant/Constable",
                "  #1354 = Class              #1352        // \"[Ljava/lang/reflect/TypeVariable;\"",
                "  #1362 = Class              #1360        // \"[Ljava/lang/reflect/Type;\"",
                "  #1368 = Class              #1369        // java/lang/ClassNotFoundException",
                "  #1411 = Class              #1412        // java/lang/Package",
                "  #1443 = Class              #924         // \"[Ljava/lang/reflect/Method;\"",
                "  #1500 = Class              #1501        // java/io/InputStream",
                "  #1502 = Class              #1503        // java/lang/Exception",
                "  #1666 = Class              #1668        // java/lang/invoke/LambdaMetafactory",
                "  #1680 = Class              #1681        // java/lang/invoke/TypeDescriptor",
                "  #1683 = Class              #1684        // java/lang/ClassValue$ClassValueMap",
                "  #1685 = Class              #1686        // java/lang/ClassValue",
                "  #1688 = Class              #1689        // jdk/internal/javac/PreviewFeature$Feature",
                "  #1690 = Class              #1691        // jdk/internal/javac/PreviewFeature",
                "  #1693 = Class              #1694        // java/lang/invoke/MethodHandles$Lookup",
                "  #1695 = Class              #1696        // java/lang/invoke/MethodHandles"
        );
    }
}
