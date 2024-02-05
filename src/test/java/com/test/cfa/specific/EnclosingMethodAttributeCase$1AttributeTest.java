package com.test.cfa.specific;

import com.test.present.ClassFileAttributePresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class EnclosingMethodAttributeCase$1AttributeTest extends ClassFileAttributePresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.attribute.cases.EnclosingMethodAttributeCase$1"));
    }

    @Test
    public void test_for_SourceFile_Attribute() {
        expectedConsecutiveLines = List.of(
                "SourceFile: \"EnclosingMethodAttributeCase.java\""
        );
    }
    @Test
    public void test_for_EnclosingMethod_Attribute() {
        expectedConsecutiveLines = List.of(
                "EnclosingMethod: #40.#42                // com.test.attribute.cases.EnclosingMethodAttributeCase.f2"
        );
    }
    @Test
    public void test_for_InnerClasses_Attribute() {
        expectedConsecutiveLines = List.of(
                "InnerClasses:",
                "  #2;                                     // class com/test/attribute/cases/EnclosingMethodAttributeCase$1"
        );
    }
}
