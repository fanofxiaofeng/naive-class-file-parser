package com.test.presenter.misc.specific;

import com.test.annotations.GeneratedBy;
import com.test.presenter.misc.MiscPresenterTestBase;
import com.test.presenter.misc.MiscTestGenerator;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(MiscTestGenerator.class)
public class CaseInterfaceMiscTest extends MiscPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.misc.CaseInterface"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "public class com.test.cases.misc.CaseInterface implements com.test.cases.misc.C1,com.test.cases.misc.C2,com.test.cases.misc.C3",
                "  minor version: 0",
                "  major version: 61",
                "  flags: (0x0021) ACC_PUBLIC, ACC_SUPER",
                "  this_class: #7                          // com/test/cases/misc/CaseInterface",
                "  super_class: #2                         // java/lang/Object",
                "  interfaces: 3, fields: 0, methods: 1, attributes: 1"
        );
    }
}
