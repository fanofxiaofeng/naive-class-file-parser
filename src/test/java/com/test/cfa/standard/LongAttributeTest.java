package com.test.cfa.standard;

import com.test.present.ClassFileAttributePresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class LongAttributeTest extends ClassFileAttributePresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException {
        buildRealLines(Long.class);
    }

    @Test
    public void test_for_SourceFile_Attribute() {
        expectedConsecutiveLines = List.of(
                "SourceFile: \"Long.java\""
        );
    }
    @Test
    public void test_for_InnerClasses_Attribute() {
        expectedConsecutiveLines = List.of(
                "InnerClasses:",
                "  private static #518= #235 of #1;        // LongCache=class java/lang/Long$LongCache of class java/lang/Long",
                "  public static final #523= #519 of #521; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles"
        );
    }
}
