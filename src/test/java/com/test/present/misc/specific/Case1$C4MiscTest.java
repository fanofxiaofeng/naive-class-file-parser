package com.test.present.misc.specific;

import com.test.present.misc.MiscPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class Case1$C4MiscTest extends MiscPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.misc.Case1$C4"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "public final class com.test.cases.misc.Case1$C4 extends java.lang.Record",
                "  minor version: 0",
                "  major version: 61",
                "  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER",
                "  this_class: #8                          // com/test/cases/misc/Case1$C4",
                "  super_class: #2                         // java/lang/Record",
                "  interfaces: 0, fields: 1, methods: 5, attributes: 5"
        );
    }
}
