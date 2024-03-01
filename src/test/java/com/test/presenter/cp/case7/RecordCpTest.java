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
public class RecordCpTest extends ConstantPoolPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Record"));
    }

    @ExpectedConstantKind(ConstantKind.CONSTANT_Class)
    @Test
    public void test() {
        expectedLines = List.of(
                "   #2 = Class              #4             // java/lang/Object",
                "   #7 = Class              #8             // java/lang/Record"
        );
    }
}
