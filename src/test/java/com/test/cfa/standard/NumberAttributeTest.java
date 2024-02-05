package com.test.cfa.standard;

import com.test.present.ClassFileAttributePresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class NumberAttributeTest extends ClassFileAttributePresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException {
        buildRealLines(Number.class);
    }

    @Test
    public void test_for_SourceFile_Attribute() {
        expectedConsecutiveLines = List.of(
                "SourceFile: \"Number.java\""
        );
    }
}
