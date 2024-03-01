package com.test.presenter.cp.case9;

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
public class ListCpTest extends ConstantPoolPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.util.List"));
    }

    @ExpectedConstantKind(ConstantKind.CONSTANT_Fieldref)
    @Test
    public void test() {
        expectedLines = List.of(
                "   #90 = Fieldref           #91.#92       // java/util/ImmutableCollections.EMPTY_LIST:Ljava/util/ImmutableCollections$ListN;"
        );
    }
}
