package com.test.presenter.misc.standard;

import com.test.annotations.GeneratedBy;
import com.test.presenter.misc.MiscPresenterTestBase;
import com.test.presenter.misc.MiscTestGenerator;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(MiscTestGenerator.class)
public class IntegerMiscTest extends MiscPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Integer"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "public final class java.lang.Integer extends java.lang.Number implements java.lang.Comparable<java.lang.Integer>, java.lang.constant.Constable, java.lang.constant.ConstantDesc",
                "  minor version: 0",
                "  major version: 65",
                "  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER",
                "  this_class: #1                          // java/lang/Integer",
                "  super_class: #203                       // java/lang/Number",
                "  interfaces: 3, fields: 10, methods: 65, attributes: 5"
        );
    }
}
