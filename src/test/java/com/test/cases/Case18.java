package com.test.cases;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Case18 {
    public Runnable f1() {
        return () -> {
        };
    }

    public Consumer<String> f2() {
        return s -> {
        };
    }

    public Supplier<Integer> f3() {
        return () -> 42;
    }

    public UnaryOperator<String> f4() {
        return s -> s + s;
    }
}
