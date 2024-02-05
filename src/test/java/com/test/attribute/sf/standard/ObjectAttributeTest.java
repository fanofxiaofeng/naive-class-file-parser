package com.test.attribute.sf.standard;

import com.test.present.ClassFileAttributePresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ObjectAttributeTest extends ClassFileAttributePresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException {
        buildRealLines(Object.class);
    }

    @Test
    public void test_for_SourceFile_Attribute() {
        expectedConsecutiveLines = List.of(
                "SourceFile: \"Object.java\""
        );
    }
}