package com.test.cases.method;

import org.apache.commons.lang3.tuple.Pair;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public abstract class ReturnValueCase {
    abstract void f1();

    abstract int f2();

    abstract List<Integer> f3();

    abstract Map<String, Long> f4();

    abstract Set<C<? super String, ? extends Integer, Runnable, Function<Long, Enum<?>>>> f5();

    abstract <A_LONG_NAME, B> Map<A_LONG_NAME, B> f6();

    abstract <X extends String & Runnable & Supplier<? extends Number>> Function<Function<? super Object, ? extends String>, ? extends Runnable> f7();

    abstract <TC1 extends Number & Runnable & Supplier<Long> & Consumer<Integer> & Map<Number, Thread>, TC2 extends Consumer<Integer>, TC3 extends String, TC4>
    List<List<List<Set<List<C<TC1[][], List<TC2>, BiConsumer<TC3, Void>, Pair<Object, TC4>>>>>>[][][]>[][] f8();

    class C<TC1, TC2, TC3, TC4> {
    }
}
