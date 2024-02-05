package com.test.present.cp.case11;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class StringCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.String"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "   #139 = InterfaceMethodref #137.#140    // sun/nio/cs/ArrayDecoder.isASCIICompatible:()Z",
                "   #143 = InterfaceMethodref #137.#144    // sun/nio/cs/ArrayDecoder.isLatin1Decodable:()Z",
                "   #146 = InterfaceMethodref #137.#147    // sun/nio/cs/ArrayDecoder.decodeToLatin1:([BII[B)I",
                "   #173 = InterfaceMethodref #137.#174    // sun/nio/cs/ArrayDecoder.decode:([BII[C)I",
                "   #273 = InterfaceMethodref #271.#140    // sun/nio/cs/ArrayEncoder.isASCIICompatible:()Z",
                "   #279 = InterfaceMethodref #271.#280    // sun/nio/cs/ArrayEncoder.encodeFromLatin1:([BII[B)I",
                "   #282 = InterfaceMethodref #271.#283    // sun/nio/cs/ArrayEncoder.encodeFromUTF16:([BII[B)I",
                "   #569 = InterfaceMethodref #570.#501    // java/lang/CharSequence.length:()I",
                "   #572 = InterfaceMethodref #570.#573    // java/lang/CharSequence.charAt:(I)C",
                "   #596 = InterfaceMethodref #597.#598    // java/util/Comparator.compare:(Ljava/lang/Object;Ljava/lang/Object;)I",
                "   #705 = InterfaceMethodref #570.#457    // java/lang/CharSequence.toString:()Ljava/lang/String;",
                "   #793 = InterfaceMethodref #794.#795    // java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;",
                "   #817 = InterfaceMethodref #818.#819    // java/lang/Iterable.iterator:()Ljava/util/Iterator;",
                "   #823 = InterfaceMethodref #824.#825    // java/util/Iterator.hasNext:()Z",
                "   #828 = InterfaceMethodref #824.#829    // java/util/Iterator.next:()Ljava/lang/Object;",
                "   #892 = InterfaceMethodref #893.#894    // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;",
                "   #915 = InterfaceMethodref #893.#916    // java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;",
                "   #926 = InterfaceMethodref #893.#927    // java/util/stream/Stream.toList:()Ljava/util/List;",
                "   #934 = InterfaceMethodref #794.#935    // java/util/List.stream:()Ljava/util/stream/Stream;",
                "   #939 = InterfaceMethodref #794.#819    // java/util/List.iterator:()Ljava/util/Iterator;",
                "   #943 = InterfaceMethodref #794.#783    // java/util/List.size:()I",
                "   #944 = InterfaceMethodref #794.#786    // java/util/List.get:(I)Ljava/lang/Object;",
                "   #968 = InterfaceMethodref #969.#970    // java/util/function/Function.apply:(Ljava/lang/Object;)Ljava/lang/Object;"
        );
    }
}
