package com.test.field.standard;

import org.junit.runners.Suite;
import com.test.generator.SuiteGeneratorImpl;
import org.junit.runner.RunWith;
import com.test.annotations.GeneratedBy;

@GeneratedBy(SuiteGeneratorImpl.class)
@Suite.SuiteClasses({
        ArrayListFieldsTest.class,
        CharacterFieldsTest.class,
        ClassFieldsTest.class,
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
})
@RunWith(Suite.class)
public class StandardTestSuite {
}
