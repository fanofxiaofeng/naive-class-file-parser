package com.test.annotations;

import com.study.type.info.attribute.AttributeInfo;

import java.lang.annotation.*;

@Repeatable(ExpectedPredefinedAttributeHolder.class)
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ExpectedPredefinedAttribute {
    Class<? extends AttributeInfo> value();
}
