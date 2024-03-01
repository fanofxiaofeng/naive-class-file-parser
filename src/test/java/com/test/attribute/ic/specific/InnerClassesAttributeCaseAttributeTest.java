package com.test.attribute.ic.specific;

import com.test.presenter.ClassFileAttributePresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import com.test.attribute.cases.InnerClassesAttributeCase;
import java.util.List;

public class InnerClassesAttributeCaseAttributeTest extends ClassFileAttributePresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException {
        buildRealLines(InnerClassesAttributeCase.class);
    }

    @Test
    public void test_for_InnerClasses_Attribute() {
        expectedConsecutiveLines = List.of(
                "InnerClasses:",
                "  #7;                                     // class com/test/attribute/cases/InnerClassesAttributeCase$1",
                "  public #38= #25 of #12;                 // C5=class com/test/attribute/cases/InnerClassesAttributeCase$C5 of class com/test/attribute/cases/InnerClassesAttributeCase",
                "  static #39= #27 of #12;                 // C4=class com/test/attribute/cases/InnerClassesAttributeCase$C4 of class com/test/attribute/cases/InnerClassesAttributeCase",
                "  static #40= #29 of #12;                 // C3=class com/test/attribute/cases/InnerClassesAttributeCase$C3 of class com/test/attribute/cases/InnerClassesAttributeCase",
                "  static final #41= #31 of #12;           // C2=class com/test/attribute/cases/InnerClassesAttributeCase$C2 of class com/test/attribute/cases/InnerClassesAttributeCase",
                "  private static #42= #33 of #12;         // C1=class com/test/attribute/cases/InnerClassesAttributeCase$C1 of class com/test/attribute/cases/InnerClassesAttributeCase",
                "  #43= #35;                               // C6=class com/test/attribute/cases/InnerClassesAttributeCase$1C6"
        );
    }
}
