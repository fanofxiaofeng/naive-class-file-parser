package com.test.cfa;

import com.test.cfa.specific.*;
import com.test.cfa.standard.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses({
        EnclosingMethodAttributeCase$1AttributeTest.class,
        EnclosingMethodAttributeCase$1CAttributeTest.class,
        EnclosingMethodAttributeCase$2CAttributeTest.class,
        EnclosingMethodAttributeCase$3CAttributeTest.class,

        BootstrapMethodsAttributeCaseAttributeTest.class,

        PermittedSubclassesCaseAttributeTest.class,

        CharacterAttributeTest.class,
        IntegerAttributeTest.class,
        LongAttributeTest.class,
        NumberAttributeTest.class,
        TreeMapAttributeTest.class,
})
@RunWith(Suite.class)
public class ClassFileAttributeTestSuite {
}
