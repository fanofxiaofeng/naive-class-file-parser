package com.test.field;

import com.test.field.specific.C22FieldsTest;
import com.test.field.specific.ClassAccessFlagsFieldsTest;
import com.test.field.specific.FieldCaseFieldsTest;
import com.test.field.standard.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses({
        ArrayListFieldsTest.class,
        ClassFieldsTest.class,
        CharacterFieldsTest.class,
        DoubleFieldsTest.class,
        EnumFieldsTest.class,
        EnumSetFieldsTest.class,
        FloatFieldsTest.class,
        HashMapFieldsTest.class,
        IntegerFieldsTest.class,
        LinkedHashMapFieldsTest.class,
        LinkedListFieldsTest.class,
        LongFieldsTest.class,
        MathFieldsTest.class,
        NumberFieldsTest.class,
        StringFieldsTest.class,
        TreeMapFieldsTest.class,

        C22FieldsTest.class,
        ClassAccessFlagsFieldsTest.class,
        FieldCaseFieldsTest.class,
})
@RunWith(Suite.class)
public class FieldsTestSuite {
}
