package com.test.present.misc.standard;

import com.test.present.misc.MiscPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class RunnableMiscTest extends MiscPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Runnable"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "public interface java.lang.Runnable",
                "  minor version: 0",
                "  major version: 65",
                "  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT",
                "  this_class: #1                          // java/lang/Runnable",
                "  super_class: #3                         // java/lang/Object",
                "  interfaces: 0, fields: 0, methods: 1, attributes: 2"
        );
    }
}
