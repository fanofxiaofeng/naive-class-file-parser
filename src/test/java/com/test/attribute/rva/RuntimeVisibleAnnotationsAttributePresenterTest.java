package com.test.attribute.rva;

import com.test.attribute.rva.specific.*;
import com.test.attribute.rva.standard.EnumFieldsTest;
import com.test.attribute.rva.standard.StringFieldsTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses({
        EnumFieldsTest.class,
        StringFieldsTest.class,
        RuntimeVisibleAnnotationsAttributeCase1FieldsTest.class,
        RuntimeVisibleAnnotationsAttributeCase2FieldsTest.class,
        RuntimeVisibleAnnotationsAttributeCase3FieldsTest.class,
        RuntimeVisibleAnnotationsAttributeCase4FieldsTest.class,
        RuntimeVisibleAnnotationsAttributeCase5FieldsTest.class,
})
@RunWith(Suite.class)
public class RuntimeVisibleAnnotationsAttributePresenterTest {
}
