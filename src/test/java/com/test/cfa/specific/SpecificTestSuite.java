package com.test.cfa.specific;

import org.junit.runners.Suite;
import com.test.generator.SuiteGeneratorImpl;
import org.junit.runner.RunWith;
import com.test.annotations.GeneratedBy;

@GeneratedBy(SuiteGeneratorImpl.class)
@Suite.SuiteClasses({
        BootstrapMethodsAttributeCaseAttributeTest.class,
        EnclosingMethodAttributeCase$1AttributeTest.class,
        EnclosingMethodAttributeCase$1CAttributeTest.class,
        EnclosingMethodAttributeCase$2CAttributeTest.class,
        EnclosingMethodAttributeCase$3CAttributeTest.class,
        NestMembersAttributeCaseAttributeTest.class,
        PermittedSubclassesCaseAttributeTest.class,
})
@RunWith(Suite.class)
public class SpecificTestSuite {
}
