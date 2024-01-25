package com.test.attribute;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        FieldSignatureTest.class,
        MethodSignatureTest.class,
        ConstantValueAttributeTest.class
})
public class AttributeTest {
}
