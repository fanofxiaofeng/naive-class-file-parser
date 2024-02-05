package com.test.attribute.ic.standard;

import com.test.present.ClassFileAttributePresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class HashMapAttributeTest extends ClassFileAttributePresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException {
        buildRealLines(HashMap.class);
    }

    @Test
    public void test_for_InnerClasses_Attribute() {
        expectedConsecutiveLines = List.of(
                "InnerClasses:",
                "  static #613= #163 of #40;               // Node=class java/util/HashMap$Node of class java/util/HashMap",
                "  public static #614= #141 of #101;       // Entry=class java/util/Map$Entry of class java/util/Map",
                "  static final #615= #180 of #40;         // TreeNode=class java/util/HashMap$TreeNode of class java/util/HashMap",
                "  final #616= #243 of #40;                // KeySet=class java/util/HashMap$KeySet of class java/util/HashMap",
                "  final #617= #263 of #40;                // Values=class java/util/HashMap$Values of class java/util/HashMap",
                "  final #618= #268 of #40;                // EntrySet=class java/util/HashMap$EntrySet of class java/util/HashMap",
                "  public static abstract #619= #331 of #324; // GetField=class java/io/ObjectInputStream$GetField of class java/io/ObjectInputStream",
                "  private static final #620= #346 of #40; // UnsafeHolder=class java/util/HashMap$UnsafeHolder of class java/util/HashMap",
                "  static final #621= #596 of #40;         // EntrySpliterator=class java/util/HashMap$EntrySpliterator of class java/util/HashMap",
                "  static final #622= #598 of #40;         // ValueSpliterator=class java/util/HashMap$ValueSpliterator of class java/util/HashMap",
                "  static final #623= #600 of #40;         // KeySpliterator=class java/util/HashMap$KeySpliterator of class java/util/HashMap",
                "  static #624= #602 of #40;               // HashMapSpliterator=class java/util/HashMap$HashMapSpliterator of class java/util/HashMap",
                "  final #625= #604 of #40;                // EntryIterator=class java/util/HashMap$EntryIterator of class java/util/HashMap",
                "  final #626= #606 of #40;                // ValueIterator=class java/util/HashMap$ValueIterator of class java/util/HashMap",
                "  final #627= #608 of #40;                // KeyIterator=class java/util/HashMap$KeyIterator of class java/util/HashMap",
                "  abstract #628= #610 of #40;             // HashIterator=class java/util/HashMap$HashIterator of class java/util/HashMap"
        );
    }
}
