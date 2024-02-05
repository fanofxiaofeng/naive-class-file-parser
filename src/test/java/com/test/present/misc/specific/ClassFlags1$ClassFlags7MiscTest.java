package com.test.present.misc.specific;

import com.test.present.misc.MiscPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ClassFlags1$ClassFlags7MiscTest extends MiscPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.misc.ClassFlags1$ClassFlags7"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "abstract class com.test.cases.misc.ClassFlags1$ClassFlags7",
                "  minor version: 0",
                "  major version: 61",
                "  flags: (0x0420) ACC_SUPER, ACC_ABSTRACT",
                "  this_class: #2                          // com/test/cases/misc/ClassFlags1$ClassFlags7",
                "  super_class: #8                         // java/lang/Object",
                "  interfaces: 0, fields: 1, methods: 1, attributes: 3"
        );
    }
}
