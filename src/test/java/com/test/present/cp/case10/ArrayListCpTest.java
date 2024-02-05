package com.test.present.cp.case10;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ArrayListCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.util.ArrayList"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "    #1 = Methodref          #2.#3         // java/util/AbstractList.\"<init>\":()V",
                "   #22 = Methodref          #20.#3        // java/lang/StringBuilder.\"<init>\":()V",
                "   #25 = Methodref          #20.#26       // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "   #29 = Methodref          #20.#30       // java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;",
                "   #32 = Methodref          #20.#33       // java/lang/StringBuilder.toString:()Ljava/lang/String;",
                "   #36 = Methodref          #18.#37       // java/lang/IllegalArgumentException.\"<init>\":(Ljava/lang/String;)V",
                "   #57 = Methodref          #58.#59       // java/util/Arrays.copyOf:([Ljava/lang/Object;ILjava/lang/Class;)[Ljava/lang/Object;",
                "   #66 = Methodref          #58.#67       // java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;",
                "   #69 = Methodref          #10.#70       // java/util/ArrayList.grow:(I)[Ljava/lang/Object;",
                "   #73 = Methodref          #74.#75       // jdk/internal/util/ArraysSupport.newLength:(III)I",
                "   #79 = Methodref          #80.#81       // java/lang/Math.max:(II)I",
                "   #85 = Methodref          #10.#86       // java/util/ArrayList.indexOf:(Ljava/lang/Object;)I",
                "   #89 = Methodref          #10.#90       // java/util/ArrayList.indexOfRange:(Ljava/lang/Object;II)I",
                "   #93 = Methodref          #7.#94        // java/lang/Object.equals:(Ljava/lang/Object;)Z",
                "   #97 = Methodref          #10.#98       // java/util/ArrayList.lastIndexOfRange:(Ljava/lang/Object;II)I",
                "  #100 = Methodref          #7.#101       // java/lang/Object.clone:()Ljava/lang/Object;",
                "  #108 = Methodref          #106.#109     // java/lang/InternalError.\"<init>\":(Ljava/lang/Throwable;)V",
                "  #111 = Methodref          #7.#53        // java/lang/Object.getClass:()Ljava/lang/Class;",
                "  #112 = Methodref          #113.#114     // java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V",
                "  #118 = Methodref          #119.#120     // java/util/Objects.checkIndex:(II)I",
                "  #123 = Methodref          #10.#124      // java/util/ArrayList.elementData:(I)Ljava/lang/Object;",
                "  #128 = Methodref          #126.#3       // java/util/NoSuchElementException.\"<init>\":()V",
                "  #129 = Methodref          #10.#130      // java/util/ArrayList.grow:()[Ljava/lang/Object;",
                "  #131 = Methodref          #10.#132      // java/util/ArrayList.add:(Ljava/lang/Object;[Ljava/lang/Object;I)V",
                "  #135 = Methodref          #10.#136      // java/util/ArrayList.rangeCheckForAdd:(I)V",
                "  #139 = Methodref          #10.#140      // java/util/ArrayList.add:(ILjava/lang/Object;)V",
                "  #142 = Methodref          #10.#143      // java/util/ArrayList.add:(Ljava/lang/Object;)Z",
                "  #144 = Methodref          #10.#145      // java/util/ArrayList.fastRemove:([Ljava/lang/Object;I)V",
                "  #150 = Methodref          #10.#151      // java/util/ArrayList.equalsArrayList:(Ljava/util/ArrayList;)Z",
                "  #154 = Methodref          #10.#155      // java/util/ArrayList.equalsRange:(Ljava/util/List;II)Z",
                "  #158 = Methodref          #10.#159      // java/util/ArrayList.checkForComodification:(I)V",
                "  #163 = Methodref          #161.#3       // java/util/ConcurrentModificationException.\"<init>\":()V",
                "  #177 = Methodref          #119.#178     // java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z",
                "  #180 = Methodref          #10.#181      // java/util/ArrayList.hashCodeRange:(II)I",
                "  #183 = Methodref          #7.#184       // java/lang/Object.hashCode:()I",
                "  #189 = Methodref          #10.#190      // java/util/ArrayList.outOfBoundsMsg:(II)Ljava/lang/String;",
                "  #193 = Methodref          #187.#37      // java/lang/IndexOutOfBoundsException.\"<init>\":(Ljava/lang/String;)V",
                "  #194 = Methodref          #10.#195      // java/util/ArrayList.shiftTailOverGap:([Ljava/lang/Object;II)V",
                "  #198 = Methodref          #10.#199      // java/util/ArrayList.outOfBoundsMsg:(I)Ljava/lang/String;",
                "  #209 = Methodref          #10.#210      // java/util/ArrayList.batchRemove:(Ljava/util/Collection;ZII)Z",
                "  #213 = Methodref          #119.#214     // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "  #222 = Methodref          #223.#224     // java/io/ObjectOutputStream.defaultWriteObject:()V",
                "  #227 = Methodref          #223.#228     // java/io/ObjectOutputStream.writeInt:(I)V",
                "  #230 = Methodref          #223.#231     // java/io/ObjectOutputStream.writeObject:(Ljava/lang/Object;)V",
                "  #234 = Methodref          #235.#236     // java/io/ObjectInputStream.defaultReadObject:()V",
                "  #239 = Methodref          #235.#240     // java/io/ObjectInputStream.readInt:()I",
                "  #242 = Methodref          #243.#244     // jdk/internal/access/SharedSecrets.getJavaObjectInputStreamAccess:()Ljdk/internal/access/JavaObjectInputStreamAccess;",
                "  #254 = Methodref          #235.#255     // java/io/ObjectInputStream.readObject:()Ljava/lang/Object;",
                "  #261 = Methodref          #257.#37      // java/io/InvalidObjectException.\"<init>\":(Ljava/lang/String;)V",
                "  #264 = Methodref          #262.#265     // java/util/ArrayList$ListItr.\"<init>\":(Ljava/util/ArrayList;I)V",
                "  #269 = Methodref          #267.#270     // java/util/ArrayList$Itr.\"<init>\":(Ljava/util/ArrayList;)V",
                "  #272 = Methodref          #10.#273      // java/util/ArrayList.subListRangeCheck:(III)V",
                "  #278 = Methodref          #276.#279     // java/util/ArrayList$SubList.\"<init>\":(Ljava/util/ArrayList;II)V",
                "  #281 = Methodref          #10.#282      // java/util/ArrayList.elementAt:([Ljava/lang/Object;I)Ljava/lang/Object;",
                "  #292 = Methodref          #290.#293     // java/util/ArrayList$ArrayListSpliterator.\"<init>\":(Ljava/util/ArrayList;III)V",
                "  #295 = Methodref          #10.#296      // java/util/ArrayList.removeIf:(Ljava/util/function/Predicate;II)Z",
                "  #304 = Methodref          #10.#305      // java/util/ArrayList.nBits:(I)[J",
                "  #308 = Methodref          #10.#309      // java/util/ArrayList.setBit:([JI)V",
                "  #312 = Methodref          #10.#313      // java/util/ArrayList.isClear:([JI)Z",
                "  #316 = Methodref          #10.#317      // java/util/ArrayList.replaceAllRange:(Ljava/util/function/UnaryOperator;II)V",
                "  #325 = Methodref          #58.#326      // java/util/Arrays.sort:([Ljava/lang/Object;IILjava/util/Comparator;)V"
        );
    }
}
