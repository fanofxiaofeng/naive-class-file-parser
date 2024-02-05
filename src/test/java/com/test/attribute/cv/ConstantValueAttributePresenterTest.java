package com.test.attribute.cv;

import com.test.attribute.cv.standard.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses({
        BooleanFieldsTest.class,
        ByteFieldsTest.class,
        ShortFieldsTest.class,
        CharacterFieldsTest.class,
        IntegerFieldsTest.class,
        LongFieldsTest.class,
        FloatFieldsTest.class,
        DoubleFieldsTest.class,
        StringFieldsTest.class,
        MathFieldsTest.class,
})
@RunWith(Suite.class)
public class ConstantValueAttributePresenterTest {

}