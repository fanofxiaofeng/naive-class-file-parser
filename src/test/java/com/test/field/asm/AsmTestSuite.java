package com.test.field.asm;

import org.junit.runners.Suite;
import com.test.generator.SuiteGeneratorImpl;
import org.junit.runner.RunWith;
import com.test.annotations.GeneratedBy;

@GeneratedBy(SuiteGeneratorImpl.class)
@Suite.SuiteClasses({
        GeneratedFieldsTest.class,
})
@RunWith(Suite.class)
public class AsmTestSuite {
}
