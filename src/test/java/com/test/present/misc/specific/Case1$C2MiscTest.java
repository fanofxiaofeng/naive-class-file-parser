package com.test.present.misc.specific;

import com.test.present.misc.MiscPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class Case1$C2MiscTest extends MiscPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.misc.Case1$C2"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "public interface com.test.cases.misc.Case1$C2 extends java.lang.annotation.Annotation",
                "  minor version: 0",
                "  major version: 61",
                "  flags: (0x2601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT, ACC_ANNOTATION",
                "  this_class: #1                          // com/test/cases/misc/Case1$C2",
                "  super_class: #3                         // java/lang/Object",
                "  interfaces: 1, fields: 0, methods: 0, attributes: 3"
        );
    }
}
