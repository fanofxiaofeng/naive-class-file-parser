package com.test.present.cp.case7;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ListCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.util.List"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "    #2 = Class              #4            // java/util/Objects",
                "    #8 = Class              #10           // java/util/List",
                "   #14 = Class              #16           // java/util/ListIterator",
                "   #24 = Class              #26           // java/util/function/UnaryOperator",
                "   #37 = Class              #39           // java/util/Arrays",
                "   #42 = Class              #43           // java/util/RandomAccess",
                "   #44 = Class              #45           // java/util/AbstractList$RandomAccessSpliterator",
                "   #50 = Class              #51           // java/util/Spliterator",
                "   #53 = Class              #55           // java/util/Spliterators",
                "   #68 = Class              #69           // java/util/NoSuchElementException",
                "   #85 = Class              #87           // java/util/ReverseOrderListView",
                "   #91 = Class              #93           // java/util/ImmutableCollections",
                "   #96 = Class              #97           // java/util/ImmutableCollections$List12",
                "  #103 = Class              #104          // java/lang/Object",
                "  #120 = Class              #121          // java/util/SequencedCollection",
                "  #165 = Class              #166          // java/util/Comparator",
                "  #167 = Class              #162          // \"[Ljava/lang/Object;\"",
                "  #244 = Class              #245          // java/util/AbstractList",
                "  #247 = Class              #248          // java/util/ImmutableCollections$ListN"
        );
    }
}
