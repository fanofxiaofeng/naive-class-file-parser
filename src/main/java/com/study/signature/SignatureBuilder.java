package com.study.signature;

public interface SignatureBuilder<T> {

    T build(String raw);
}
