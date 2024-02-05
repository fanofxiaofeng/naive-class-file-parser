package com.test.present.cp.case7;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class AnnotationCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.annotation.Annotation"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "   #1 = Class              #2             // java/lang/annotation/Annotation",
                "   #3 = Class              #4             // java/lang/Object"
        );
    }
}
