package com.test.present.misc.standard;

import com.test.present.misc.MiscPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class RecordMiscTest extends MiscPresenterTestBase {

    @Before
    public void prepare() throws IOException {
        buildRealLines(Record.class);
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "public abstract class java.lang.Record",
                "  minor version: 0",
                "  major version: 65",
                "  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT",
                "  this_class: #7                          // java/lang/Record",
                "  super_class: #2                         // java/lang/Object",
                "  interfaces: 0, fields: 0, methods: 4, attributes: 1"
        );
    }
}
