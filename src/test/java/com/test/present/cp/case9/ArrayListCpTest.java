package com.test.present.cp.case9;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ArrayListCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.util.ArrayList"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "    #9 = Fieldref           #10.#11       // java/util/ArrayList.elementData:[Ljava/lang/Object;",
                "   #15 = Fieldref           #10.#16       // java/util/ArrayList.EMPTY_ELEMENTDATA:[Ljava/lang/Object;",
                "   #39 = Fieldref           #10.#40       // java/util/ArrayList.DEFAULTCAPACITY_EMPTY_ELEMENTDATA:[Ljava/lang/Object;",
                "   #48 = Fieldref           #10.#49       // java/util/ArrayList.size:I",
                "   #63 = Fieldref           #10.#64       // java/util/ArrayList.modCount:I"
        );
    }
}
