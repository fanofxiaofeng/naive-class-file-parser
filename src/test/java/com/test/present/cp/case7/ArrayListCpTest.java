package com.test.present.cp.case7;

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
                "    #2 = Class              #4            // java/util/AbstractList",
                "    #7 = Class              #8            // java/lang/Object",
                "   #10 = Class              #12           // java/util/ArrayList",
                "   #18 = Class              #19           // java/lang/IllegalArgumentException",
                "   #20 = Class              #21           // java/lang/StringBuilder",
                "   #43 = Class              #45           // java/util/Collection",
                "   #56 = Class              #14           // \"[Ljava/lang/Object;\"",
                "   #58 = Class              #60           // java/util/Arrays",
                "   #74 = Class              #76           // jdk/internal/util/ArraysSupport",
                "   #80 = Class              #82           // java/lang/Math",
                "  #104 = Class              #105          // java/lang/CloneNotSupportedException",
                "  #106 = Class              #107          // java/lang/InternalError",
                "  #113 = Class              #115          // java/lang/System",
                "  #119 = Class              #121          // java/util/Objects",
                "  #126 = Class              #127          // java/util/NoSuchElementException",
                "  #148 = Class              #149          // java/util/List",
                "  #161 = Class              #162          // java/util/ConcurrentModificationException",
                "  #169 = Class              #171          // java/util/Iterator",
                "  #187 = Class              #188          // java/lang/IndexOutOfBoundsException",
                "  #220 = Class              #221          // java/lang/Throwable",
                "  #223 = Class              #225          // java/io/ObjectOutputStream",
                "  #235 = Class              #237          // java/io/ObjectInputStream",
                "  #243 = Class              #245          // jdk/internal/access/SharedSecrets",
                "  #249 = Class              #251          // jdk/internal/access/JavaObjectInputStreamAccess",
                "  #257 = Class              #258          // java/io/InvalidObjectException",
                "  #262 = Class              #263          // java/util/ArrayList$ListItr",
                "  #267 = Class              #268          // java/util/ArrayList$Itr",
                "  #276 = Class              #277          // java/util/ArrayList$SubList",
                "  #286 = Class              #288          // java/util/function/Consumer",
                "  #290 = Class              #291          // java/util/ArrayList$ArrayListSpliterator",
                "  #300 = Class              #302          // java/util/function/Predicate",
                "  #321 = Class              #323          // java/util/function/UnaryOperator",
                "  #329 = Class              #330          // java/util/RandomAccess",
                "  #331 = Class              #332          // java/lang/Cloneable",
                "  #333 = Class              #334          // java/io/Serializable",
                "  #446 = Class              #447          // java/io/IOException",
                "  #451 = Class              #452          // java/lang/ClassNotFoundException",
                "  #481 = Class              #473          // \"[J\"",
                "  #500 = Class              #501          // java/util/ArrayList$SubList$2",
                "  #502 = Class              #503          // java/util/ArrayList$SubList$1"
        );
    }
}
