package com.test.attribute;

import com.test.attribute.ic.InnerClassesAttributeTestSuite;
import com.test.attribute.sf.SourceFileAttributeTestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses({
        SourceFileAttributeTestSuite.class,
        InnerClassesAttributeTestSuite.class,
})
@RunWith(Suite.class)
public class ClassFileAttributeTestSuite {
}
