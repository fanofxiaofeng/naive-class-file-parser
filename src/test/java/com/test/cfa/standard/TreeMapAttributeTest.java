package com.test.cfa.standard;

import com.test.present.ClassFileAttributePresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.TreeMap;
import java.util.List;

public class TreeMapAttributeTest extends ClassFileAttributePresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException {
        buildRealLines(TreeMap.class);
    }

    @Test
    public void test_for_SourceFile_Attribute() {
        expectedConsecutiveLines = List.of(
                "SourceFile: \"TreeMap.java\""
        );
    }
    @Test
    public void test_for_InnerClasses_Attribute() {
        expectedConsecutiveLines = List.of(
                "InnerClasses:",
                "  static final #665= #59 of #8;           // Entry=class java/util/TreeMap$Entry of class java/util/TreeMap",
                "  #666= #242 of #8;                       // EntrySet=class java/util/TreeMap$EntrySet of class java/util/TreeMap",
                "  static final #667= #222 of #8;          // KeySet=class java/util/TreeMap$KeySet of class java/util/TreeMap",
                "  public static #665= #338 of #83;        // Entry=class java/util/Map$Entry of class java/util/Map",
                "  #668= #237 of #8;                       // Values=class java/util/TreeMap$Values of class java/util/TreeMap",
                "  static final #669= #245 of #8;          // DescendingSubMap=class java/util/TreeMap$DescendingSubMap of class java/util/TreeMap",
                "  static final #670= #250 of #8;          // AscendingSubMap=class java/util/TreeMap$AscendingSubMap of class java/util/TreeMap",
                "  final #671= #269 of #8;                 // KeyIterator=class java/util/TreeMap$KeyIterator of class java/util/TreeMap",
                "  final #672= #274 of #8;                 // DescendingKeyIterator=class java/util/TreeMap$DescendingKeyIterator of class java/util/TreeMap",
                "  public static #673= #282 of #2;         // SimpleImmutableEntry=class java/util/AbstractMap$SimpleImmutableEntry of class java/util/AbstractMap",
                "  static abstract #674= #388 of #8;       // NavigableSubMap=class java/util/TreeMap$NavigableSubMap of class java/util/TreeMap",
                "  static final #675= #391 of #8;          // KeySpliterator=class java/util/TreeMap$KeySpliterator of class java/util/TreeMap",
                "  static final #676= #396 of #8;          // DescendingKeySpliterator=class java/util/TreeMap$DescendingKeySpliterator of class java/util/TreeMap",
                "  static final #677= #634 of #8;          // EntrySpliterator=class java/util/TreeMap$EntrySpliterator of class java/util/TreeMap",
                "  static final #678= #636 of #8;          // ValueSpliterator=class java/util/TreeMap$ValueSpliterator of class java/util/TreeMap",
                "  static #679= #638 of #8;                // TreeMapSpliterator=class java/util/TreeMap$TreeMapSpliterator of class java/util/TreeMap",
                "  private #680= #640 of #8;               // SubMap=class java/util/TreeMap$SubMap of class java/util/TreeMap",
                "  final #681= #658 of #8;                 // ValueIterator=class java/util/TreeMap$ValueIterator of class java/util/TreeMap",
                "  final #682= #660 of #8;                 // EntryIterator=class java/util/TreeMap$EntryIterator of class java/util/TreeMap",
                "  abstract #683= #662 of #8;              // PrivateEntryIterator=class java/util/TreeMap$PrivateEntryIterator of class java/util/TreeMap",
                "  final #684= #642 of #245;               // DescendingEntrySetView=class java/util/TreeMap$DescendingSubMap$DescendingEntrySetView of class java/util/TreeMap$DescendingSubMap",
                "  final #685= #644 of #250;               // AscendingEntrySetView=class java/util/TreeMap$AscendingSubMap$AscendingEntrySetView of class java/util/TreeMap$AscendingSubMap",
                "  final #686= #646 of #388;               // DescendingSubMapKeyIterator=class java/util/TreeMap$NavigableSubMap$DescendingSubMapKeyIterator of class java/util/TreeMap$NavigableSubMap",
                "  final #687= #648 of #388;               // SubMapKeyIterator=class java/util/TreeMap$NavigableSubMap$SubMapKeyIterator of class java/util/TreeMap$NavigableSubMap",
                "  final #688= #650 of #388;               // DescendingSubMapEntryIterator=class java/util/TreeMap$NavigableSubMap$DescendingSubMapEntryIterator of class java/util/TreeMap$NavigableSubMap",
                "  final #689= #652 of #388;               // SubMapEntryIterator=class java/util/TreeMap$NavigableSubMap$SubMapEntryIterator of class java/util/TreeMap$NavigableSubMap",
                "  abstract #690= #654 of #388;            // SubMapIterator=class java/util/TreeMap$NavigableSubMap$SubMapIterator of class java/util/TreeMap$NavigableSubMap",
                "  abstract #691= #656 of #388;            // EntrySetView=class java/util/TreeMap$NavigableSubMap$EntrySetView of class java/util/TreeMap$NavigableSubMap"
        );
    }
}
