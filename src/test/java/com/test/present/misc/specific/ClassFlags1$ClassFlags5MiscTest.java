package com.test.present.misc.specific;

import com.test.present.misc.MiscPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ClassFlags1$ClassFlags5MiscTest extends MiscPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.misc.ClassFlags1$ClassFlags5"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "final class com.test.cases.misc.ClassFlags1$ClassFlags5",
                "  minor version: 0",
                "  major version: 61",
                "  flags: (0x0030) ACC_FINAL, ACC_SUPER",
                "  this_class: #2                          // com/test/cases/misc/ClassFlags1$ClassFlags5",
                "  super_class: #8                         // java/lang/Object",
                "  interfaces: 0, fields: 1, methods: 1, attributes: 3"
        );
    }
}
