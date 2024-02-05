package com.test.present.cp.case9;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ListCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.util.List"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "   #90 = Fieldref           #91.#92       // java/util/ImmutableCollections.EMPTY_LIST:Ljava/util/ImmutableCollections$ListN;"
        );
    }
}
