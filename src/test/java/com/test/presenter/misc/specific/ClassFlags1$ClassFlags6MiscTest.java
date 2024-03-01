package com.test.presenter.misc.specific;

import com.test.annotations.GeneratedBy;
import com.test.presenter.misc.MiscPresenterTestBase;
import com.test.presenter.misc.MiscTestGenerator;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(MiscTestGenerator.class)
public class ClassFlags1$ClassFlags6MiscTest extends MiscPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.misc.ClassFlags1$ClassFlags6"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "interface com.test.cases.misc.ClassFlags1$ClassFlags6",
                "  minor version: 0",
                "  major version: 61",
                "  flags: (0x0600) ACC_INTERFACE, ACC_ABSTRACT",
                "  this_class: #1                          // com/test/cases/misc/ClassFlags1$ClassFlags6",
                "  super_class: #3                         // java/lang/Object",
                "  interfaces: 0, fields: 0, methods: 0, attributes: 3"
        );
    }
}
