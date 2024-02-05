package com.test.present.misc.specific;

import com.test.present.misc.MiscPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class Case1$C1MiscTest extends MiscPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.misc.Case1$C1"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "public interface com.test.cases.misc.Case1$C1",
                "  minor version: 0",
                "  major version: 61",
                "  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT",
                "  this_class: #1                          // com/test/cases/misc/Case1$C1",
                "  super_class: #3                         // java/lang/Object",
                "  interfaces: 0, fields: 0, methods: 0, attributes: 3"
        );
    }
}