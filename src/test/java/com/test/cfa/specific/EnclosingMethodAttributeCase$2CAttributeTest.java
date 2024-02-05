package com.test.cfa.specific;

import com.test.present.ClassFileAttributePresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class EnclosingMethodAttributeCase$2CAttributeTest extends ClassFileAttributePresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.attribute.cases.EnclosingMethodAttributeCase$2C"));
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
                "EnclosingMethod: #17.#0                 // com.test.attribute.cases.EnclosingMethodAttributeCase"
        );
    }
    @Test
    public void test_for_InnerClasses_Attribute() {
        expectedConsecutiveLines = List.of(
                "InnerClasses:",
                "  #21= #7;                                // C=class com/test/attribute/cases/EnclosingMethodAttributeCase$2C"
        );
    }
}
