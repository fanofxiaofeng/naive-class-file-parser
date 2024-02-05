package com.test.attribute.ic.standard;

import com.test.present.ClassFileAttributePresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArrayListAttributeTest extends ClassFileAttributePresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException {
        buildRealLines(ArrayList.class);
    }

    @Test
    public void test_for_InnerClasses_Attribute() {
        expectedConsecutiveLines = List.of(
                "InnerClasses:",
                "  private #505= #262 of #10;              // ListItr=class java/util/ArrayList$ListItr of class java/util/ArrayList",
                "  private #506= #267 of #10;              // Itr=class java/util/ArrayList$Itr of class java/util/ArrayList",
                "  private static #507= #276 of #10;       // SubList=class java/util/ArrayList$SubList of class java/util/ArrayList",
                "  final #508= #290 of #10;                // ArrayListSpliterator=class java/util/ArrayList$ArrayListSpliterator of class java/util/ArrayList",
                "  #500;                                   // class java/util/ArrayList$SubList$2",
                "  #502;                                   // class java/util/ArrayList$SubList$1"
        );
    }
}
