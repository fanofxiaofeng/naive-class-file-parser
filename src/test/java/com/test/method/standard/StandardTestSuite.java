package com.test.method.standard;

import com.test.annotations.GeneratedBy;
import org.junit.runner.RunWith;
import com.test.generator.SuiteGeneratorImpl;
import org.junit.runners.Suite;

@GeneratedBy(SuiteGeneratorImpl.class)
@Suite.SuiteClasses({
        ClassMethodsTest.class,
        EnumMethodsTest.class,
        ListMethodsTest.class,
        ObjectMethodsTest.class,
})
@RunWith(Suite.class)
public class StandardTestSuite {
}
