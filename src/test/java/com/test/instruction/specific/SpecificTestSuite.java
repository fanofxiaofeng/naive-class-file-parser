package com.test.instruction.specific;

import com.test.annotations.GeneratedBy;
import com.test.generator.SuiteGeneratorImpl;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@GeneratedBy(SuiteGeneratorImpl.class)
@Suite.SuiteClasses({
        ArithmeticInstructionsCaseInstructionsTest.class,
        Dup2CaseInstructionsTest.class,
        DupX2CaseInstructionsTest.class,
        LoadAndStoreInstructionsDoubleCaseInstructionsTest.class,
        LoadAndStoreInstructionsFloatCaseInstructionsTest.class,
        LoadAndStoreInstructionsIntCaseInstructionsTest.class,
        LoadAndStoreInstructionsLongCaseInstructionsTest.class,
        LoadAndStoreInstructionsObjectCaseInstructionsTest.class,
        LoadAndStoreInstructionsWideCaseInstructionsTest.class,
        StackInstructionsCaseInstructionsTest.class,
})
@RunWith(Suite.class)
public class SpecificTestSuite {
}
