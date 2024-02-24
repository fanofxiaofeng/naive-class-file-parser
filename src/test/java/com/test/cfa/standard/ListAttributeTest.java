package com.test.cfa.standard;

import com.test.present.ClassFileAttributePresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ListAttributeTest extends ClassFileAttributePresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.util.List"));
    }

    @Test
    public void test_for_Signature_Attribute() {
        expectedConsecutiveLines = List.of(
                "Signature: #240                         // <E:Ljava/lang/Object;>Ljava/lang/Object;Ljava/util/SequencedCollection<TE;>;"
        );
    }
    @Test
    public void test_for_SourceFile_Attribute() {
        expectedConsecutiveLines = List.of(
                "SourceFile: \"List.java\""
        );
    }
    @Test
    public void test_for_InnerClasses_Attribute() {
        expectedConsecutiveLines = List.of(
                "InnerClasses:",
                "  static final #246= #44 of #244;         // RandomAccessSpliterator=class java/util/AbstractList$RandomAccessSpliterator of class java/util/AbstractList",
                "  static final #249= #247 of #91;         // ListN=class java/util/ImmutableCollections$ListN of class java/util/ImmutableCollections",
                "  static final #250= #96 of #91;          // List12=class java/util/ImmutableCollections$List12 of class java/util/ImmutableCollections"
        );
    }
}
