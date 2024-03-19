package com.test.method;

import com.test.annotations.GeneratedBy;
import org.junit.runner.RunWith;
import com.test.generator.SuiteGeneratorImpl;
import org.junit.runners.Suite;
import com.test.method.specific.SpecificTestSuite;
import com.test.method.standard.StandardTestSuite;

@GeneratedBy(SuiteGeneratorImpl.class)
@Suite.SuiteClasses({
        SpecificTestSuite.class,
        StandardTestSuite.class,
})
@RunWith(Suite.class)
public class MethodTestSuite {
}
