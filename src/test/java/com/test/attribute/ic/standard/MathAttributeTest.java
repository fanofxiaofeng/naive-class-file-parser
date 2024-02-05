package com.test.attribute.ic.standard;

import com.test.present.ClassFileAttributePresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class MathAttributeTest extends ClassFileAttributePresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException {
        buildRealLines(Math.class);
    }

    @Test
    public void test_for_InnerClasses_Attribute() {
        expectedConsecutiveLines = List.of(
                "InnerClasses:",
                "  private static final #459= #98 of #1;   // RandomNumberGeneratorHolder=class java/lang/Math$RandomNumberGeneratorHolder of class java/lang/Math"
        );
    }
}
