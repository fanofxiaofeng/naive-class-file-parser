package com.test.present.misc.specific;

import com.test.present.misc.MiscPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ClassFlags1MiscTest extends MiscPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.misc.ClassFlags1"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "public class com.test.cases.misc.ClassFlags1",
                "  minor version: 0",
                "  major version: 61",
                "  flags: (0x0021) ACC_PUBLIC, ACC_SUPER",
                "  this_class: #7                          // com/test/cases/misc/ClassFlags1",
                "  super_class: #2                         // java/lang/Object",
                "  interfaces: 0, fields: 0, methods: 1, attributes: 3"
        );
    }
}
