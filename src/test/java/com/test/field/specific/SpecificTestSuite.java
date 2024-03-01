package com.test.field.specific;

import org.junit.runners.Suite;
import com.test.generator.SuiteGeneratorImpl;
import org.junit.runner.RunWith;
import com.test.annotations.GeneratedBy;

@GeneratedBy(SuiteGeneratorImpl.class)
@Suite.SuiteClasses({
        C22FieldsTest.class,
        ClassAccessFlagsFieldsTest.class,
        DeprecatedCaseFieldsTest.class,
        FieldCaseFieldsTest.class,
})
@RunWith(Suite.class)
public class SpecificTestSuite {
}
