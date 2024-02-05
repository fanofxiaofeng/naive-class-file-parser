package com.test.present.cp.case1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses({
        AnnotationCpTest.class,
        ArrayListCpTest.class,
        ClassCpTest.class,
        DoubleCpTest.class,
        EnumCpTest.class,
        HashMapCpTest.class,
        ListCpTest.class,
        ObjectCpTest.class,
        RecordCpTest.class,
        StringCpTest.class,
})
@RunWith(Suite.class)
public class Case1TestSuite {
}
