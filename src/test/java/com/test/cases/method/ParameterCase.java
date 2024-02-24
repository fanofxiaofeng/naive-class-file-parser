package com.test.cases.method;

import org.apache.commons.lang3.tuple.Pair;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public abstract class ParameterCase {
    abstract void f1(int a, int b, int c, int... d);

    abstract int f2(List<int[][][]>[][] a, Optional<Set<long[][]>>... b);

    abstract void f3(List<Integer> a, List<Integer>[] b, List<Integer>[][]... c);

    abstract void f4(Map<String, Long> a, Map<String, Long>[] b, Map<String, Long>[][]... c);

    abstract void f5(Set<ReturnValueCase.C<? super String, ? extends Integer, Runnable, Function<Long, Enum<?>>>> a,
                     Set<ReturnValueCase.C<? super String, ? extends Integer, Runnable, Function<Long, Enum<?>>>>[][]... b);

    abstract <A_LONG_NAME, B> void f6(Map<A_LONG_NAME, B> a, Map<A_LONG_NAME, B>[][]... b);

    abstract <X extends String & Runnable & Supplier<? extends Number>> Function<Function<? super Object, ? extends String>, ? extends Runnable> f7(Set<List<X>[][]>[]... a);

    abstract <TC1 extends Number & Runnable & Supplier<Long> & Consumer<Integer> & Map<Number, Thread>, TC2 extends Consumer<Integer>, TC3 extends String, TC4>
    void f8(List<List<List<Set<List<ReturnValueCase.C<TC1[][], List<TC2>, BiConsumer<TC3, Void>, Pair<Object, TC4>>>>>>[][][]>[][] a);

    static class C<TC1, TC2, TC3, TC4> {
    }
}
