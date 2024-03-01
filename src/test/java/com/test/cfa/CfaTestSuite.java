package com.test.cfa;

import org.junit.runners.Suite;
import com.test.generator.SuiteGeneratorImpl;
import org.junit.runner.RunWith;
import com.test.annotations.GeneratedBy;
import com.test.cfa.specific.SpecificTestSuite;
import com.test.cfa.standard.StandardTestSuite;

@GeneratedBy(SuiteGeneratorImpl.class)
@Suite.SuiteClasses({
        SpecificTestSuite.class,
        StandardTestSuite.class,
})
@RunWith(Suite.class)
public class CfaTestSuite {
}
