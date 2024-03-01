package com.test.attribute;

import com.test.attribute.ic.InnerClassesAttributeTestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses({
        InnerClassesAttributeTestSuite.class,
})
@RunWith(Suite.class)
public class ClassFileAttributeTestSuite {
}
