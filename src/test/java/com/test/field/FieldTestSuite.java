package com.test.field;

import com.test.field.specific.SpecificTestSuite;
import org.junit.runners.Suite;
import com.test.generator.SuiteGeneratorImpl;
import com.test.field.asm.AsmTestSuite;
import org.junit.runner.RunWith;
import com.test.annotations.GeneratedBy;
import com.test.field.standard.StandardTestSuite;

@GeneratedBy(SuiteGeneratorImpl.class)
@Suite.SuiteClasses({
        SpecificTestSuite.class,
        AsmTestSuite.class,
        StandardTestSuite.class,
})
@RunWith(Suite.class)
public class FieldTestSuite {
}
