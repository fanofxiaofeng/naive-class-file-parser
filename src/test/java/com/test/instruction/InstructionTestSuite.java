package com.test.instruction;

import com.test.annotations.GeneratedBy;
import org.junit.runner.RunWith;
import com.test.generator.SuiteGeneratorImpl;
import org.junit.runners.Suite;
import com.test.instruction.specific.SpecificTestSuite;
import com.test.instruction.standard.StandardTestSuite;

@GeneratedBy(SuiteGeneratorImpl.class)
@Suite.SuiteClasses({
        SpecificTestSuite.class,
        StandardTestSuite.class,
})
@RunWith(Suite.class)
public class InstructionTestSuite {
}
