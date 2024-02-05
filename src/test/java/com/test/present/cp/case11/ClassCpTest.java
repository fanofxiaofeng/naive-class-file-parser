package com.test.present.cp.case11;

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
                "   #103 = InterfaceMethodref #104.#105    // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;",
                "   #121 = InterfaceMethodref #104.#122    // java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;",
                "   #131 = InterfaceMethodref #132.#133    // java/lang/reflect/TypeVariable.getBounds:()[Ljava/lang/reflect/Type;",
                "   #137 = InterfaceMethodref #138.#139    // java/lang/reflect/Type.equals:(Ljava/lang/Object;)Z",
                "   #143 = InterfaceMethodref #132.#31     // java/lang/reflect/TypeVariable.getName:()Ljava/lang/String;",
                "   #478 = InterfaceMethodref #476.#479    // java/lang/reflect/GenericArrayType.getGenericComponentType:()Ljava/lang/reflect/Type;",
                "   #650 = InterfaceMethodref #651.#652    // java/util/List.add:(Ljava/lang/Object;)Z",
                "   #720 = InterfaceMethodref #721.#722    // java/util/Set.contains:(Ljava/lang/Object;)Z",
                "   #797 = InterfaceMethodref #721.#652    // java/util/Set.add:(Ljava/lang/Object;)Z",
                "   #798 = InterfaceMethodref #721.#799    // java/util/Set.iterator:()Ljava/util/Iterator;",
                "   #802 = InterfaceMethodref #803.#804    // java/util/Iterator.hasNext:()Z",
                "   #807 = InterfaceMethodref #803.#808    // java/util/Iterator.next:()Ljava/lang/Object;",
                "   #906 = InterfaceMethodref #907.#652    // java/util/Collection.add:(Ljava/lang/Object;)Z",
                "  #1055 = InterfaceMethodref #1056.#1057  // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
                "  #1082 = InterfaceMethodref #1056.#1083  // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;",
                "  #1086 = InterfaceMethodref #1087.#1088  // java/lang/reflect/GenericDeclaration.isAnnotationPresent:(Ljava/lang/Class;)Z",
                "  #1133 = InterfaceMethodref #1056.#1134  // java/util/Map.entrySet:()Ljava/util/Set;",
                "  #1138 = InterfaceMethodref #1136.#1139  // java/util/Map$Entry.getKey:()Ljava/lang/Object;",
                "  #1150 = InterfaceMethodref #1056.#1151  // java/util/Map.size:()I",
                "  #1168 = InterfaceMethodref #1136.#1169  // java/util/Map$Entry.getValue:()Ljava/lang/Object;",
                "  #1171 = InterfaceMethodref #1056.#1172  // java/util/Map.putAll:(Ljava/util/Map;)V",
                "  #1243 = InterfaceMethodref #1244.#1245  // java/lang/constant/ClassDesc.ofDescriptor:(Ljava/lang/String;)Ljava/lang/constant/ClassDesc;",
                "  #1260 = InterfaceMethodref #104.#1261   // java/util/stream/Stream.anyMatch:(Ljava/util/function/Predicate;)Z",
                "  #1265 = InterfaceMethodref #104.#1266   // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;",
                "  #1271 = InterfaceMethodref #104.#1272   // java/util/stream/Stream.toArray:(Ljava/util/function/IntFunction;)[Ljava/lang/Object;",
                "  #1641 = InterfaceMethodref #138.#1642   // java/lang/reflect/Type.getTypeName:()Ljava/lang/String;"
        );
    }
}
