package com.test.presenter.cp.case11;

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
public class EnumCpTest extends ConstantPoolPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Enum"));
    }

    @ExpectedConstantKind(ConstantKind.CONSTANT_InterfaceMethodref)
    @Test
    public void test() {
        expectedLines = List.of(
                "   #62 = InterfaceMethodref #63.#64       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;"
        );
    }
}
