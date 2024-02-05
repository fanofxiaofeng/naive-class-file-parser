package com.study.annotations;

import com.study.type.info.attribute.AttributeInfo;

import java.lang.annotation.*;

@Repeatable(SupportedPredefinedAttributeHolder.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SupportedPredefinedAttribute {
    Class<? extends AttributeInfo> value();
}
