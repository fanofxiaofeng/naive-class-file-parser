package com.test.cfa.standard;

import com.study.type.info.attribute.InnerClassesAttribute;
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
public class MathAttributeTest extends ClassFileAttributePresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Math"));
    }

    @ExpectedPredefinedAttribute(SourceFileAttribute.class)
    @Test
    public void test_for_SourceFile_Attribute() {
        expectedConsecutiveLines = List.of(
                "SourceFile: \"Math.java\""
        );
    }

    @ExpectedPredefinedAttribute(InnerClassesAttribute.class)
    @Test
    public void test_for_InnerClasses_Attribute() {
        expectedConsecutiveLines = List.of(
                "InnerClasses:",
                "  private static final #459= #98 of #1;   // RandomNumberGeneratorHolder=class java/lang/Math$RandomNumberGeneratorHolder of class java/lang/Math"
        );
    }
}
