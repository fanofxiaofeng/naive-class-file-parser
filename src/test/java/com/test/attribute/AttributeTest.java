package com.test.attribute;

import com.test.attribute.cv.ConstantValueAttributePresenterTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        FieldSignatureTest.class,
//        MethodSignatureTest.class,
        ConstantValueAttributePresenterTest.class,
//        SourceFileAttributeTest.class,
        ExceptionsAttributePresenterTest.class,
//        InnerClassesAttributePresenterTest.class,
})
public class AttributeTest {
}
