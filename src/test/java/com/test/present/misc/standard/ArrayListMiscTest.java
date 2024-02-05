package com.test.present.misc.standard;

import com.test.present.misc.MiscPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArrayListMiscTest extends MiscPresenterTestBase {

    @Before
    public void prepare() throws IOException {
        buildRealLines(ArrayList.class);
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "public class java.util.ArrayList<E extends java.lang.Object> extends java.util.AbstractList<E> implements java.util.List<E>, java.util.RandomAccess, java.lang.Cloneable, java.io.Serializable",
                "  minor version: 0",
                "  major version: 65",
                "  flags: (0x0021) ACC_PUBLIC, ACC_SUPER",
                "  this_class: #10                         // java/util/ArrayList",
                "  super_class: #2                         // java/util/AbstractList",
                "  interfaces: 4, fields: 6, methods: 68, attributes: 4"
        );
    }
}
