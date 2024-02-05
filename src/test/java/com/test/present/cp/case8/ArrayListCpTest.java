package com.test.present.cp.case8;

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
                "   #23 = String             #24           // Illegal Capacity:",
                "  #201 = String             #202          // Index:",
                "  #203 = String             #204          // , Size:",
                "  #205 = String             #206          // From Index:",
                "  #207 = String             #208          //  > To Index:",
                "  #259 = String             #260          // Invalid size:"
        );
    }
}
