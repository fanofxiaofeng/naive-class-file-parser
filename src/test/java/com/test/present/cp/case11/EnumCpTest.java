package com.test.present.cp.case11;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class EnumCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Enum"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "   #62 = InterfaceMethodref #63.#64       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;"
        );
    }
}
