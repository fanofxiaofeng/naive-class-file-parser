package com.test.cases;

import java.util.function.Consumer;

public class FieldCase<T> {
    static class C1<A> {}

    class C2<B> {
        class C22<BB> {}
    }

    private C2<String>.C22<Integer> c2;

    public void f() {
        class C3<C> {}

        new Consumer<C3>() {

            @Override
            public void accept(C3 c3) {
            }
        };
    }
}
