package com.test.presenter.cp.case10;

import com.study.constants.ConstantKind;
import com.test.annotations.ExpectedConstantKind;
import com.test.annotations.GeneratedBy;
import com.test.presenter.cp.ConstantPoolPresenterTestBase;
import com.test.presenter.cp.ConstantPoolTestGenerator;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(ConstantPoolTestGenerator.class)
public class ListCpTest extends ConstantPoolPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.util.List"));
    }

    @ExpectedConstantKind(ConstantKind.CONSTANT_Methodref)
    @Test
    public void test() {
        expectedLines = List.of(
                "    #1 = Methodref          #2.#3         // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "   #36 = Methodref          #37.#38       // java/util/Arrays.sort:([Ljava/lang/Object;Ljava/util/Comparator;)V",
                "   #46 = Methodref          #44.#47       // java/util/AbstractList$RandomAccessSpliterator.\"<init>\":(Ljava/util/List;)V",
                "   #52 = Methodref          #53.#54       // java/util/Spliterators.spliterator:(Ljava/util/Collection;I)Ljava/util/Spliterator;",
                "   #70 = Methodref          #68.#71       // java/util/NoSuchElementException.\"<init>\":()V",
                "   #84 = Methodref          #85.#86       // java/util/ReverseOrderListView.of:(Ljava/util/List;Z)Ljava/util/List;",
                "   #98 = Methodref          #96.#99       // java/util/ImmutableCollections$List12.\"<init>\":(Ljava/lang/Object;)V",
                "  #100 = Methodref          #96.#101      // java/util/ImmutableCollections$List12.\"<init>\":(Ljava/lang/Object;Ljava/lang/Object;)V",
                "  #105 = Methodref          #91.#106      // java/util/ImmutableCollections.listFromTrustedArray:([Ljava/lang/Object;)Ljava/util/List;",
                "  #109 = Methodref          #91.#110      // java/util/ImmutableCollections.listFromArray:([Ljava/lang/Object;)Ljava/util/List;",
                "  #112 = Methodref          #91.#113      // java/util/ImmutableCollections.listCopy:(Ljava/util/Collection;)Ljava/util/List;"
        );
    }
}
