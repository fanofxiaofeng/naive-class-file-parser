package com.test.cfa.specific;

import com.study.type.info.attribute.EnclosingMethodAttribute;
import com.study.type.info.attribute.InnerClassesAttribute;
import com.study.type.info.attribute.NestHostAttribute;
import com.study.type.info.attribute.SourceFileAttribute;
import com.test.annotations.ExpectedPredefinedAttribute;
import com.test.annotations.GeneratedBy;
import com.test.cfa.ClassFileAttributeTestGenerator;
import com.test.presenter.ClassFileAttributePresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(ClassFileAttributeTestGenerator.class)
public class EnclosingMethodAttributeCase$1CAttributeTest extends ClassFileAttributePresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.attribute.cases.EnclosingMethodAttributeCase$1C"));
    }

    @ExpectedPredefinedAttribute(SourceFileAttribute.class)
    @Test
    public void test_for_SourceFile_Attribute() {
        expectedConsecutiveLines = List.of(
                "SourceFile: \"EnclosingMethodAttributeCase.java\""
        );
    }

    @ExpectedPredefinedAttribute(EnclosingMethodAttribute.class)
    @Test
    public void test_for_EnclosingMethod_Attribute() {
        expectedConsecutiveLines = List.of(
                "EnclosingMethod: #23.#0                 // com.test.attribute.cases.EnclosingMethodAttributeCase"
        );
    }

    @ExpectedPredefinedAttribute(NestHostAttribute.class)
    @Test
    public void test_for_NestHost_Attribute() {
        expectedConsecutiveLines = List.of(
                "NestHost: class com/test/attribute/cases/EnclosingMethodAttributeCase"
        );
    }

    @ExpectedPredefinedAttribute(InnerClassesAttribute.class)
    @Test
    public void test_for_InnerClasses_Attribute() {
        expectedConsecutiveLines = List.of(
                "InnerClasses:",
                "  #27= #2;                                // C=class com/test/attribute/cases/EnclosingMethodAttributeCase$1C"
        );
    }
}
