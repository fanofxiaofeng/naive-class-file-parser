package com.test.present.cp.case5;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class RandomCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.util.Random"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "   #38 = Long               1181783497276652981l",
                "   #57 = Long               25214903917l",
                "   #59 = Long               281474976710655l",
                "   #75 = Long               11l",
                "  #137 = Long               -1l",
                "  #236 = Long               8682522807148012l",
                "  #284 = Long               3905348978240129619l"
        );
    }
}
