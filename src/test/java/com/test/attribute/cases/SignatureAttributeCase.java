package com.test.attribute.cases;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SignatureAttributeCase {
    private static Class<? extends Number>[][][][][] f1;

    private List<Map<List<? super Number>, Set<? extends String>[][][]>> f2;

    private Supplier<Map<? super String, Object>> f3;

    private Consumer<C1<? extends String>.C2<?>.C3<? super Object>> f4;

    class C1<T1> {
        class C2<T2> {
            class C3<T3> {

            }
        }
    }

}
