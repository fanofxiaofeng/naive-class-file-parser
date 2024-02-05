package com.test.present.misc.standard;

import com.test.present.misc.MiscPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class EnumMiscTest extends MiscPresenterTestBase {

    @Before
    public void prepare() throws IOException {
        buildRealLines(Enum.class);
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "public abstract class java.lang.Enum<E extends java.lang.Enum<E>> extends java.lang.Object implements java.lang.constant.Constable, java.lang.Comparable<E>, java.io.Serializable",
                "  minor version: 0",
                "  major version: 65",
                "  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT",
                "  this_class: #2                          // java/lang/Enum",
                "  super_class: #12                        // java/lang/Object",
                "  interfaces: 3, fields: 3, methods: 16, attributes: 5"
        );
    }
}
