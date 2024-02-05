package com.test.present.cp.case12;

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
                "    #3 = NameAndType        #5:#6         // \"<init>\":()V",
                "   #11 = NameAndType        #13:#14       // elementData:[Ljava/lang/Object;",
                "   #16 = NameAndType        #17:#14       // EMPTY_ELEMENTDATA:[Ljava/lang/Object;",
                "   #26 = NameAndType        #27:#28       // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "   #30 = NameAndType        #27:#31       // append:(I)Ljava/lang/StringBuilder;",
                "   #33 = NameAndType        #34:#35       // toString:()Ljava/lang/String;",
                "   #37 = NameAndType        #5:#38        // \"<init>\":(Ljava/lang/String;)V",
                "   #40 = NameAndType        #41:#14       // DEFAULTCAPACITY_EMPTY_ELEMENTDATA:[Ljava/lang/Object;",
                "   #44 = NameAndType        #46:#47       // toArray:()[Ljava/lang/Object;",
                "   #49 = NameAndType        #50:#51       // size:I",
                "   #53 = NameAndType        #54:#55       // getClass:()Ljava/lang/Class;",
                "   #59 = NameAndType        #61:#62       // copyOf:([Ljava/lang/Object;ILjava/lang/Class;)[Ljava/lang/Object;",
                "   #64 = NameAndType        #65:#51       // modCount:I",
                "   #67 = NameAndType        #61:#68       // copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;",
                "   #70 = NameAndType        #71:#72       // grow:(I)[Ljava/lang/Object;",
                "   #75 = NameAndType        #77:#78       // newLength:(III)I",
                "   #81 = NameAndType        #83:#84       // max:(II)I",
                "   #86 = NameAndType        #87:#88       // indexOf:(Ljava/lang/Object;)I",
                "   #90 = NameAndType        #91:#92       // indexOfRange:(Ljava/lang/Object;II)I",
                "   #94 = NameAndType        #95:#96       // equals:(Ljava/lang/Object;)Z",
                "   #98 = NameAndType        #99:#92       // lastIndexOfRange:(Ljava/lang/Object;II)I",
                "  #101 = NameAndType        #102:#103     // clone:()Ljava/lang/Object;",
                "  #109 = NameAndType        #5:#110       // \"<init>\":(Ljava/lang/Throwable;)V",
                "  #114 = NameAndType        #116:#117     // arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V",
                "  #120 = NameAndType        #122:#84      // checkIndex:(II)I",
                "  #124 = NameAndType        #13:#125      // elementData:(I)Ljava/lang/Object;",
                "  #130 = NameAndType        #71:#47       // grow:()[Ljava/lang/Object;",
                "  #132 = NameAndType        #133:#134     // add:(Ljava/lang/Object;[Ljava/lang/Object;I)V",
                "  #136 = NameAndType        #137:#138     // rangeCheckForAdd:(I)V",
                "  #140 = NameAndType        #133:#141     // add:(ILjava/lang/Object;)V",
                "  #143 = NameAndType        #133:#96      // add:(Ljava/lang/Object;)Z",
                "  #145 = NameAndType        #146:#147     // fastRemove:([Ljava/lang/Object;I)V",
                "  #151 = NameAndType        #152:#153     // equalsArrayList:(Ljava/util/ArrayList;)Z",
                "  #155 = NameAndType        #156:#157     // equalsRange:(Ljava/util/List;II)Z",
                "  #159 = NameAndType        #160:#138     // checkForComodification:(I)V",
                "  #165 = NameAndType        #166:#167     // iterator:()Ljava/util/Iterator;",
                "  #170 = NameAndType        #172:#173     // hasNext:()Z",
                "  #175 = NameAndType        #176:#103     // next:()Ljava/lang/Object;",
                "  #178 = NameAndType        #95:#179      // equals:(Ljava/lang/Object;Ljava/lang/Object;)Z",
                "  #181 = NameAndType        #182:#84      // hashCodeRange:(II)I",
                "  #184 = NameAndType        #185:#186     // hashCode:()I",
                "  #190 = NameAndType        #191:#192     // outOfBoundsMsg:(II)Ljava/lang/String;",
                "  #195 = NameAndType        #196:#197     // shiftTailOverGap:([Ljava/lang/Object;II)V",
                "  #199 = NameAndType        #191:#200     // outOfBoundsMsg:(I)Ljava/lang/String;",
                "  #210 = NameAndType        #211:#212     // batchRemove:(Ljava/util/Collection;ZII)Z",
                "  #214 = NameAndType        #215:#216     // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "  #218 = NameAndType        #219:#96      // contains:(Ljava/lang/Object;)Z",
                "  #224 = NameAndType        #226:#6       // defaultWriteObject:()V",
                "  #228 = NameAndType        #229:#138     // writeInt:(I)V",
                "  #231 = NameAndType        #232:#233     // writeObject:(Ljava/lang/Object;)V",
                "  #236 = NameAndType        #238:#6       // defaultReadObject:()V",
                "  #240 = NameAndType        #241:#186     // readInt:()I",
                "  #244 = NameAndType        #246:#247     // getJavaObjectInputStreamAccess:()Ljdk/internal/access/JavaObjectInputStreamAccess;",
                "  #250 = NameAndType        #252:#253     // checkArray:(Ljava/io/ObjectInputStream;Ljava/lang/Class;I)V",
                "  #255 = NameAndType        #256:#103     // readObject:()Ljava/lang/Object;",
                "  #265 = NameAndType        #5:#266       // \"<init>\":(Ljava/util/ArrayList;I)V",
                "  #270 = NameAndType        #5:#271       // \"<init>\":(Ljava/util/ArrayList;)V",
                "  #273 = NameAndType        #274:#275     // subListRangeCheck:(III)V",
                "  #279 = NameAndType        #5:#280       // \"<init>\":(Ljava/util/ArrayList;II)V",
                "  #282 = NameAndType        #283:#284     // elementAt:([Ljava/lang/Object;I)Ljava/lang/Object;",
                "  #287 = NameAndType        #289:#233     // accept:(Ljava/lang/Object;)V",
                "  #293 = NameAndType        #5:#294       // \"<init>\":(Ljava/util/ArrayList;III)V",
                "  #296 = NameAndType        #297:#298     // removeIf:(Ljava/util/function/Predicate;II)Z",
                "  #301 = NameAndType        #303:#96      // test:(Ljava/lang/Object;)Z",
                "  #305 = NameAndType        #306:#307     // nBits:(I)[J",
                "  #309 = NameAndType        #310:#311     // setBit:([JI)V",
                "  #313 = NameAndType        #314:#315     // isClear:([JI)Z",
                "  #317 = NameAndType        #318:#319     // replaceAllRange:(Ljava/util/function/UnaryOperator;II)V",
                "  #322 = NameAndType        #324:#216     // apply:(Ljava/lang/Object;)Ljava/lang/Object;",
                "  #326 = NameAndType        #327:#328     // sort:([Ljava/lang/Object;IILjava/util/Comparator;)V"
        );
    }
}
