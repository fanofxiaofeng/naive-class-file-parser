package com.test.present.misc.specific;

import com.test.present.misc.MiscPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ClassFlags1$ClassFlags9MiscTest extends MiscPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.misc.ClassFlags1$ClassFlags9"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "final class com.test.cases.misc.ClassFlags1$ClassFlags9 extends java.lang.Enum<com.test.cases.misc.ClassFlags1$ClassFlags9>",
                "  minor version: 0",
                "  major version: 61",
                "  flags: (0x4030) ACC_FINAL, ACC_SUPER, ACC_ENUM",
                "  this_class: #1                          // com/test/cases/misc/ClassFlags1$ClassFlags9",
                "  super_class: #13                        // java/lang/Enum",
                "  interfaces: 0, fields: 1, methods: 5, attributes: 4"
        );
    }
}
