package com.test.present.misc.standard;

import com.test.present.misc.MiscPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class BiFunctionMiscTest extends MiscPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.util.function.BiFunction"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "public interface java.util.function.BiFunction<T extends java.lang.Object, U extends java.lang.Object, R extends java.lang.Object>",
                "  minor version: 0",
                "  major version: 65",
                "  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT",
                "  this_class: #12                         // java/util/function/BiFunction",
                "  super_class: #20                        // java/lang/Object",
                "  interfaces: 0, fields: 0, methods: 3, attributes: 5"
        );
    }
}
