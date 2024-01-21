package com.study.signature;

public class AbstractSignature implements Signature {

    @Override
    public String desc() {
        return null;
    }

    @Override
    public String toString() {
        return desc();
    }
}
