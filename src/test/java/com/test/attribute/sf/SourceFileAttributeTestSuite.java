package com.test.attribute.sf;

import com.test.attribute.sf.standard.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses({
        BooleanAttributeTest.class,
        IntegerAttributeTest.class,
        ListAttributeTest.class,
        MathAttributeTest.class,
        ObjectAttributeTest.class,
})
@RunWith(Suite.class)
public class SourceFileAttributeTestSuite {
}
