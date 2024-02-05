package com.test.present.misc.standard;

import com.test.present.misc.MiscPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ObjectMiscTest extends MiscPresenterTestBase {

    @Before
    public void prepare() throws IOException {
        buildRealLines(Object.class);
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "public class java.lang.Object",
                "  minor version: 0",
                "  major version: 65",
                "  flags: (0x0021) ACC_PUBLIC, ACC_SUPER",
                "  this_class: #8                          // java/lang/Object",
                "  super_class: #0",
                "  interfaces: 0, fields: 0, methods: 13, attributes: 1"
        );
    }
}
