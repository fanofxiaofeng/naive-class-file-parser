package com.test.presenter.misc.standard;

import com.test.annotations.GeneratedBy;
import com.test.presenter.misc.MiscPresenterTestBase;
import com.test.presenter.misc.MiscTestGenerator;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(MiscTestGenerator.class)
public class ObjectMiscTest extends MiscPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "public class java.lang.Object",
                "  minor version: 0",
                "  major version: 65",
                "  flags: (0x0021) ACC_PUBLIC, ACC_SUPER",
                "  this_class: #8                          // java/lang/Object",
                "  super_class: #0",
                "  interfaces: 0, fields: 0, methods: 13, attributes: 1"
        );
    }
}
