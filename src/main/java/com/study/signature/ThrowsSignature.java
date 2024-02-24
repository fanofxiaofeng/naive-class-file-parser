package com.study.signature;

public sealed class ThrowsSignature<T extends ReferenceTypeSignature> implements Signature
        permits ThrowsSignature.CaseOne, ThrowsSignature.CaseTwo {

    protected final T component;

    public String desc() {
        return component.desc();
    }

    public ThrowsSignature(T component) {
        this.component = component;
    }

    public static final class CaseOne extends ThrowsSignature<ClassTypeSignature> {
        public CaseOne(ClassTypeSignature component) {
            super(component);
        }
    }

    public static final class CaseTwo extends ThrowsSignature<TypeVariableSignature> {
        public CaseTwo(TypeVariableSignature component) {
            super(component);
        }
    }
}
