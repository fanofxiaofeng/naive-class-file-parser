package com.test.present.misc.standard;

import com.test.present.misc.MiscPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.function.Function;
import java.util.List;

public class FunctionMiscTest extends MiscPresenterTestBase {

    @Before
    public void prepare() throws IOException {
        buildRealLines(Function.class);
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "public interface java.util.function.Function<T extends java.lang.Object, R extends java.lang.Object>",
                "  minor version: 0",
                "  major version: 65",
                "  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT",
                "  this_class: #16                         // java/util/function/Function",
                "  super_class: #19                        // java/lang/Object",
                "  interfaces: 0, fields: 0, methods: 7, attributes: 5"
        );
    }
}
