package com.test.presenter.misc.standard;

import com.test.annotations.GeneratedBy;
import com.test.presenter.misc.MiscPresenterTestBase;
import com.test.presenter.misc.MiscTestGenerator;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(MiscTestGenerator.class)
public class NumberMiscTest extends MiscPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Number"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "public abstract class java.lang.Number implements java.io.Serializable",
                "  minor version: 0",
                "  major version: 65",
                "  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT",
                "  this_class: #8                          // java/lang/Number",
                "  super_class: #2                         // java/lang/Object",
                "  interfaces: 1, fields: 1, methods: 7, attributes: 1"
        );
    }
}
