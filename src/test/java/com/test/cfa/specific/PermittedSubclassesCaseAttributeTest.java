package com.test.cfa.specific;

import com.test.present.ClassFileAttributePresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class PermittedSubclassesCaseAttributeTest extends ClassFileAttributePresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.attribute.cases.PermittedSubclassesCase"));
    }

    @Test
    public void test_for_SourceFile_Attribute() {
        expectedConsecutiveLines = List.of(
                "SourceFile: \"PermittedSubclassesCase.java\""
        );
    }
    @Test
    public void test_for_PermittedSubclasses_Attribute() {
        expectedConsecutiveLines = List.of(
                "PermittedSubclasses:",
                "  com/test/attribute/cases/PermittedSubclassesCase$C1",
                "  com/test/attribute/cases/PermittedSubclassesCase$C2",
                "  com/test/attribute/cases/PermittedSubclassesCase$C3",
                "  com/test/attribute/cases/PermittedSubclassesCase$C4"
        );
    }
    @Test
    public void test_for_InnerClasses_Attribute() {
        expectedConsecutiveLines = List.of(
                "InnerClasses:",
                "  static final #27= #17 of #7;            // C4=class com/test/attribute/cases/PermittedSubclassesCase$C4 of class com/test/attribute/cases/PermittedSubclassesCase",
                "  static final #28= #19 of #7;            // C3=class com/test/attribute/cases/PermittedSubclassesCase$C3 of class com/test/attribute/cases/PermittedSubclassesCase",
                "  static final #29= #21 of #7;            // C2=class com/test/attribute/cases/PermittedSubclassesCase$C2 of class com/test/attribute/cases/PermittedSubclassesCase",
                "  static final #30= #23 of #7;            // C1=class com/test/attribute/cases/PermittedSubclassesCase$C1 of class com/test/attribute/cases/PermittedSubclassesCase"
        );
    }
}
