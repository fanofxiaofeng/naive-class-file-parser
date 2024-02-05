package com.study.constants;

import com.study.annotations.SupportedPredefinedAttribute;
import com.study.type.info.attribute.*;

public enum PresentKind {

    HEADER,

    VERSION,

    ACCESS_FLAGS,

    THIS_CLASS,

    SUPER_CLASS,

    COUNT,

    CONSTANT_POOL,

    @SupportedPredefinedAttribute(ConstantValueAttribute.class)
    @SupportedPredefinedAttribute(SyntheticAttribute.class)
    @SupportedPredefinedAttribute(DeprecatedAttribute.class)
    @SupportedPredefinedAttribute(SignatureAttribute.class)
    @SupportedPredefinedAttribute(RuntimeVisibleAnnotationsAttribute.class)
    @SupportedPredefinedAttribute(RuntimeInvisibleAnnotationsAttribute.class)
    // todo: 2 more
    FIELDS,

    METHODS,

    ATTRIBUTES
}
