package com.test.instruction.standard;

import com.test.annotations.GeneratedBy;
import org.junit.runner.RunWith;
import com.test.generator.SuiteGeneratorImpl;
import org.junit.runners.Suite;

@GeneratedBy(SuiteGeneratorImpl.class)
@Suite.SuiteClasses({
        EnumInstructionsTest.class,
        IntegerInstructionsTest.class,
        ListInstructionsTest.class,
        NumberInstructionsTest.class,
        ObjectInstructionsTest.class,
        StreamInstructionsTest.class,
})
@RunWith(Suite.class)
public class StandardTestSuite {
}
