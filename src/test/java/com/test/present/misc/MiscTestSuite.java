package com.test.present.misc;

import com.test.present.misc.specific.*;
import com.test.present.misc.standard.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses({
//        AnnotationMiscTest.class,
//        ArrayListMiscTest.class,
//        ClassMiscTest.class,
//        EnumMiscTest.class,
//        FunctionMiscTest.class,
//        IntegerMiscTest.class,
//        ListMiscTest.class,
//        NumberMiscTest.class,
//        ObjectMiscTest.class,
//        OverrideMiscTest.class,
//        RecordMiscTest.class,
//        StreamMiscTest.class,

        Case1$C1MiscTest.class,
        Case1$C2MiscTest.class,
        Case1$C3MiscTest.class,
        Case1$C4MiscTest.class,

        ClassFlags1$ClassFlags2MiscTest.class,
        ClassFlags1$ClassFlags3MiscTest.class,
        ClassFlags1$ClassFlags4MiscTest.class,
        ClassFlags1$ClassFlags5MiscTest.class,
        ClassFlags1$ClassFlags6MiscTest.class,
        ClassFlags1$ClassFlags7MiscTest.class,
        ClassFlags1$ClassFlags8MiscTest.class,
        ClassFlags1$ClassFlags9MiscTest.class,
})
@RunWith(Suite.class)
public class MiscTestSuite {
}
