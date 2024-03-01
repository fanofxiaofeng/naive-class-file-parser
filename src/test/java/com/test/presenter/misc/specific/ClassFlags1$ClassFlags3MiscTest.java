package com.test.presenter.misc.specific;

import com.test.annotations.GeneratedBy;
import com.test.presenter.misc.MiscPresenterTestBase;
import com.test.presenter.misc.MiscTestGenerator;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(MiscTestGenerator.class)
public class ClassFlags1$ClassFlags3MiscTest extends MiscPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.misc.ClassFlags1$ClassFlags3"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "class com.test.cases.misc.ClassFlags1$ClassFlags3",
                "  minor version: 0",
                "  major version: 61",
                "  flags: (0x0020) ACC_SUPER",
                "  this_class: #2                          // com/test/cases/misc/ClassFlags1$ClassFlags3",
                "  super_class: #8                         // java/lang/Object",
                "  interfaces: 0, fields: 1, methods: 1, attributes: 3"
        );
    }
}
