package com.test.present.cp.case12;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class RecordCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Record"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "   #3 = NameAndType        #5:#6          // \"<init>\":()V"
        );
    }
}
