package com.test.present.cp.case12;

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
                "    #3 = NameAndType        #5:#6         // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "    #9 = NameAndType        #11:#12       // listIterator:()Ljava/util/ListIterator;",
                "   #15 = NameAndType        #17:#18       // hasNext:()Z",
                "   #20 = NameAndType        #21:#22       // next:()Ljava/lang/Object;",
                "   #25 = NameAndType        #27:#6        // apply:(Ljava/lang/Object;)Ljava/lang/Object;",
                "   #29 = NameAndType        #30:#31       // set:(Ljava/lang/Object;)V",
                "   #33 = NameAndType        #34:#35       // toArray:()[Ljava/lang/Object;",
                "   #38 = NameAndType        #40:#41       // sort:([Ljava/lang/Object;Ljava/util/Comparator;)V",
                "   #47 = NameAndType        #48:#49       // \"<init>\":(Ljava/util/List;)V",
                "   #54 = NameAndType        #56:#57       // spliterator:(Ljava/util/Collection;I)Ljava/util/Spliterator;",
                "   #59 = NameAndType        #60:#61       // add:(ILjava/lang/Object;)V",
                "   #63 = NameAndType        #60:#64       // add:(Ljava/lang/Object;)Z",
                "   #66 = NameAndType        #67:#18       // isEmpty:()Z",
                "   #71 = NameAndType        #48:#72       // \"<init>\":()V",
                "   #74 = NameAndType        #75:#76       // get:(I)Ljava/lang/Object;",
                "   #78 = NameAndType        #79:#80       // size:()I",
                "   #82 = NameAndType        #83:#76       // remove:(I)Ljava/lang/Object;",
                "   #86 = NameAndType        #88:#89       // of:(Ljava/util/List;Z)Ljava/util/List;",
                "   #92 = NameAndType        #94:#95       // EMPTY_LIST:Ljava/util/ImmutableCollections$ListN;",
                "   #99 = NameAndType        #48:#31       // \"<init>\":(Ljava/lang/Object;)V",
                "  #101 = NameAndType        #48:#102      // \"<init>\":(Ljava/lang/Object;Ljava/lang/Object;)V",
                "  #106 = NameAndType        #107:#108     // listFromTrustedArray:([Ljava/lang/Object;)Ljava/util/List;",
                "  #110 = NameAndType        #111:#108     // listFromArray:([Ljava/lang/Object;)Ljava/util/List;",
                "  #113 = NameAndType        #114:#115     // listCopy:(Ljava/util/Collection;)Ljava/util/List;",
                "  #117 = NameAndType        #118:#119     // reversed:()Ljava/util/List;"
        );
    }
}
