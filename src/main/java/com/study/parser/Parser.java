package com.study.parser;

@FunctionalInterface
public interface Parser<T> {

    T parse();
}
