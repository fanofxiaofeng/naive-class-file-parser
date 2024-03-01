package com.test.presenter.misc.standard;

import com.test.annotations.GeneratedBy;
import com.test.presenter.misc.MiscPresenterTestBase;
import com.test.presenter.misc.MiscTestGenerator;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(MiscTestGenerator.class)
public class RecordMiscTest extends MiscPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Record"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "public abstract class java.lang.Record",
                "  minor version: 0",
                "  major version: 65",
                "  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT",
                "  this_class: #7                          // java/lang/Record",
                "  super_class: #2                         // java/lang/Object",
                "  interfaces: 0, fields: 0, methods: 4, attributes: 1"
        );
    }
}
