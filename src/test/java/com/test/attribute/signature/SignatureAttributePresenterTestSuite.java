package com.test.attribute.signature;

import com.test.attribute.signature.specific.SignatureAttributeCaseFieldsTest;
import com.test.attribute.signature.standard.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses({
        HashSetFieldsTest.class,
        TreeSetFieldsTest.class,

        SignatureAttributeCaseFieldsTest.class,
})
@RunWith(Suite.class)
public class SignatureAttributePresenterTestSuite {
}