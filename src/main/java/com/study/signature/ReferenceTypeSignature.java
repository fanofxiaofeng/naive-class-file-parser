package com.study.signature;

public abstract sealed class ReferenceTypeSignature
        implements JavaTypeSignature
        permits ClassTypeSignature, TypeVariableSignature, ArrayTypeSignature {
}
