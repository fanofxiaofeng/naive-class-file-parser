package com.test.attribute;

import com.test.attribute.cv.ConstantValueAttributePresenterTest;
import com.test.attribute.deprecated.DeprecatedCaseFieldsTest;
import com.test.attribute.rva.RuntimeVisibleAnnotationsAttributePresenterTest;
import com.test.attribute.signature.SignatureAttributePresenterTestSuite;
import com.test.attribute.synthetic.SyntheticAttributePresenterTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ConstantValueAttributePresenterTest.class,
        SyntheticAttributePresenterTest.class,
        DeprecatedCaseFieldsTest.class,
        SignatureAttributePresenterTestSuite.class,
        RuntimeVisibleAnnotationsAttributePresenterTest.class,
})
public class FieldAttributeTestSuite {
}
