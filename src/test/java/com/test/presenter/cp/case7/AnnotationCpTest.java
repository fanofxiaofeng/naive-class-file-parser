package com.test.presenter.cp.case7;

import com.study.constants.ConstantKind;
import com.test.annotations.ExpectedConstantKind;
import com.test.annotations.GeneratedBy;
import com.test.presenter.cp.ConstantPoolPresenterTestBase;
import com.test.presenter.cp.ConstantPoolTestGenerator;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(ConstantPoolTestGenerator.class)
public class AnnotationCpTest extends ConstantPoolPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.annotation.Annotation"));
    }

    @ExpectedConstantKind(ConstantKind.CONSTANT_Class)
    @Test
    public void test() {
        expectedLines = List.of(
                "   #1 = Class              #2             // java/lang/annotation/Annotation",
                "   #3 = Class              #4             // java/lang/Object"
        );
    }
}
