package com.test.cfa.specific;

import com.test.present.ClassFileAttributePresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class EnclosingMethodAttributeCase$3CAttributeTest extends ClassFileAttributePresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.attribute.cases.EnclosingMethodAttributeCase$3C"));
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
                "EnclosingMethod: #23.#25                // com.test.attribute.cases.EnclosingMethodAttributeCase.f1"
        );
    }
    @Test
    public void test_for_InnerClasses_Attribute() {
        expectedConsecutiveLines = List.of(
                "InnerClasses:",
                "  #30= #2;                                // C=class com/test/attribute/cases/EnclosingMethodAttributeCase$3C"
        );
    }
}
