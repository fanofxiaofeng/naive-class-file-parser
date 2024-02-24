package com.test.cfa;

import com.test.cfa.specific.*;
import com.test.cfa.standard.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses({
        BootstrapMethodsAttributeCaseAttributeTest.class,
        EnclosingMethodAttributeCase$1AttributeTest.class,
        EnclosingMethodAttributeCase$1CAttributeTest.class,
        EnclosingMethodAttributeCase$2CAttributeTest.class,
        EnclosingMethodAttributeCase$3CAttributeTest.class,
        PermittedSubclassesCaseAttributeTest.class,

        ArrayListAttributeTest.class,
        CharacterAttributeTest.class,
        ClassAttributeTest.class,
        EnumAttributeTest.class,
        IntegerAttributeTest.class,
        ListAttributeTest.class,
        LongAttributeTest.class,
        NumberAttributeTest.class,
        TreeMapAttributeTest.class,
})
@RunWith(Suite.class)
public class ClassFileAttributeTestSuite {
}
