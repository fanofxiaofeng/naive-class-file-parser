package com.test.attribute.ic.standard;

import com.test.presenter.ClassFileAttributePresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class StringAttributeTest extends ClassFileAttributePresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException {
        buildRealLines(String.class);
    }

    @Test
    public void test_for_InnerClasses_Attribute() {
        expectedConsecutiveLines = List.of(
                "InnerClasses:",
                "  static #1434= #972 of #42;              // CharsSpliterator=class java/lang/StringLatin1$CharsSpliterator of class java/lang/StringLatin1",
                "  static #1434= #978 of #48;              // CharsSpliterator=class java/lang/StringUTF16$CharsSpliterator of class java/lang/StringUTF16",
                "  public static #1435= #1356 of #974;     // OfInt=class java/util/Spliterator$OfInt of class java/util/Spliterator",
                "  static #1436= #987 of #48;              // CodePointsSpliterator=class java/lang/StringUTF16$CodePointsSpliterator of class java/lang/StringUTF16",
                "  public static final #1441= #1437 of #1439; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles",
                "  private static #1442= #1096 of #10;     // CaseInsensitiveComparator=class java/lang/String$CaseInsensitiveComparator of class java/lang/String"
        );
    }
}
