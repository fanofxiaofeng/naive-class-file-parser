package com.test.presenter.misc.standard;

import com.test.annotations.GeneratedBy;
import com.test.presenter.misc.MiscPresenterTestBase;
import com.test.presenter.misc.MiscTestGenerator;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(MiscTestGenerator.class)
public class EnumMiscTest extends MiscPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Enum"));
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
