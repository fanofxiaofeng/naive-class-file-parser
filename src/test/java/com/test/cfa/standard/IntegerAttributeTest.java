package com.test.cfa.standard;

import com.test.present.ClassFileAttributePresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class IntegerAttributeTest extends ClassFileAttributePresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException {
        buildRealLines(Integer.class);
    }

    @Test
    public void test_for_SourceFile_Attribute() {
        expectedConsecutiveLines = List.of(
                "SourceFile: \"Integer.java\""
        );
    }
    @Test
    public void test_for_InnerClasses_Attribute() {
        expectedConsecutiveLines = List.of(
                "InnerClasses:",
                "  private static #447= #189 of #1;        // IntegerCache=class java/lang/Integer$IntegerCache of class java/lang/Integer",
                "  public static final #452= #448 of #450; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles"
        );
    }
}
