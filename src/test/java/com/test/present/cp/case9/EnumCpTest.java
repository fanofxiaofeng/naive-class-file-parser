package com.test.present.cp.case9;

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
                "    #1 = Fieldref           #2.#3         // java/lang/Enum.name:Ljava/lang/String;",
                "    #7 = Fieldref           #2.#8         // java/lang/Enum.ordinal:I",
                "   #17 = Fieldref           #2.#18        // java/lang/Enum.hash:I"
        );
    }
}
