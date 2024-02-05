package com.test.attribute.cases.rva;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


public class RuntimeVisibleAnnotationsAttributeCase1 {

    @CaseByte(value = 0)
    @CaseByte(value = 2)
    @CaseByte(value = 12)
    @CaseByte(value = 42)
    @CaseByte(value = 100)
    @CaseByte(value = 127)
    private byte byte1;

    @CaseByte(value = 42)
    private byte byte2;

    @CaseChar(value = 0x0)
    @CaseChar(value = 0x1)
//    @CaseChar(value = 0x0A) // todo: ignore for now
    @CaseChar(value = 0x10)
    @CaseChar(value = 0x22)
    @CaseChar(value = 0x27)
    @CaseChar(value = 0xFF)
    private char char1;

    @CaseByte(value = 0x42)
    private char char2;

    @CaseDouble(value = Math.PI)
    @CaseDouble(value = Math.E)
    @CaseDouble(value = Double.POSITIVE_INFINITY)
    @CaseDouble(value = Double.NaN)
    @CaseDouble(value = Double.NEGATIVE_INFINITY)
    @CaseDouble(value = Double.MAX_VALUE)
    @CaseDouble(value = Double.MIN_VALUE)
    private double aDouble;

    @CaseFloat(value = (float) Math.PI)
    private float float1;

    @CaseFloat(value = Float.POSITIVE_INFINITY)
    private float float2;

    @CaseInt(value = 123456789)
    private int anInt;

    @CaseLong(value = 12345678987654321L)
    private long aLong;

    @CaseShort(value = 1)
    private short short1;

    @CaseShort(value = 42)
    private short short2;

    @CaseBoolean(value = false)
    private boolean boolean1;

    @CaseBoolean(value = true)
    private boolean boolean2;

    @CaseString(" left")
    @CaseString(" middle ")
    @CaseString(" right")
    @CaseString("Hello   world \t \t ")
    private String aString;

    /*
    B	byte	const_value_index	CONSTANT_Integer
C	char	const_value_index	CONSTANT_Integer
D	double	const_value_index	CONSTANT_Double
F	float	const_value_index	CONSTANT_Float
I	int	const_value_index	CONSTANT_Integer
J	long	const_value_index	CONSTANT_Long
S	short	const_value_index	CONSTANT_Integer
Z	boolean	const_value_index	CONSTANT_Integer
s	String	const_value_index	CONSTANT_Utf8
e	Enum class	enum_const_value	Not applicable
c	Class	class_info_index	Not applicable
@	Annotation interface	annotation_value	Not applicable
[	Array type	array_value	Not applicable
     */
    @Repeatable(CaseByteContainer.class)
    @Retention(RetentionPolicy.RUNTIME)
    @interface CaseByte {
        byte value();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @interface CaseByteContainer {
        CaseByte[] value();
    }

    @Repeatable(CaseCharContainer.class)
    @Retention(RetentionPolicy.RUNTIME)
    @interface CaseChar {
        char value();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @interface CaseCharContainer {
        CaseChar[] value();
    }
}


@Repeatable(CaseDoubleContainer.class)
@Retention(RetentionPolicy.RUNTIME)
@interface CaseDouble {
    double value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface CaseDoubleContainer {
    CaseDouble[] value();
}


@Retention(RetentionPolicy.RUNTIME)
@interface CaseFloat {
    float value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface CaseInt {
    int value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface CaseLong {
    long value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface CaseShort {
    short value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface CaseBoolean {
    boolean value();
}

@Repeatable(CaseStringContainer.class)
@Retention(RetentionPolicy.RUNTIME)
@interface CaseString {
    String value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface CaseStringContainer {
    CaseString[] value();
}