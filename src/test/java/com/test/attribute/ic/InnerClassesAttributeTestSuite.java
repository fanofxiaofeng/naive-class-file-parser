package com.test.attribute.ic;


import com.test.attribute.ic.specific.InnerClassesAttributeCaseAttributeTest;
import com.test.attribute.ic.standard.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses({
        ArrayListAttributeTest.class,
        ClassAttributeTest.class,
        HashMapAttributeTest.class,
        IntegerAttributeTest.class,
        ListAttributeTest.class,
        MathAttributeTest.class,
        StringAttributeTest.class,

        InnerClassesAttributeCaseAttributeTest.class
})
@RunWith(Suite.class)
public class InnerClassesAttributeTestSuite {
}
