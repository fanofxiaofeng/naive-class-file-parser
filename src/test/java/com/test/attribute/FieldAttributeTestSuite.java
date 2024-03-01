package com.test.attribute;

import com.test.attribute.rva.RuntimeVisibleAnnotationsAttributePresenterTest;
import com.test.attribute.signature.SignatureAttributePresenterTestSuite;
import com.test.attribute.synthetic.SyntheticAttributePresenterTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        SyntheticAttributePresenterTest.class,
        SignatureAttributePresenterTestSuite.class,
        RuntimeVisibleAnnotationsAttributePresenterTest.class,
})
public class FieldAttributeTestSuite {
}
