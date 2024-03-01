package com.test.cases;

import java.util.function.*;

public class Case16 {

    public BiConsumer<Integer, Integer> f1() {
        return (a, b) -> System.out.println(a + b);
    }

    public Consumer<String> f2() {
        return s -> {
        };
    }

    public Supplier<Float> f3() {
        return () -> 42f;
    }

    public Predicate<String> f4() {
        return s -> s.length() > 10;
    }

    public UnaryOperator<Integer> f5() {
        return n -> n + 1;
    }
}
