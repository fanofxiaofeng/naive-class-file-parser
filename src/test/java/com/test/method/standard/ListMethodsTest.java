package com.test.method.standard;

import com.test.annotations.GeneratedBy;
import com.test.method.MethodPresenterTestBase;
import com.test.method.MethodTestGenerator;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(MethodTestGenerator.class)
public class ListMethodsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.util.List"));
    }

    @Test
    public void test_for_method_1() {
        expectedConsecutiveLines = List.of(
                "  public abstract int size();",
                "    descriptor: ()I",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT"
        );
    }

    @Test
    public void test_for_method_2() {
        expectedConsecutiveLines = List.of(
                "  public abstract boolean isEmpty();",
                "    descriptor: ()Z",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT"
        );
    }

    @Test
    public void test_for_method_3() {
        expectedConsecutiveLines = List.of(
                "  public abstract boolean contains(java.lang.Object);",
                "    descriptor: (Ljava/lang/Object;)Z",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT"
        );
    }

    @Test
    public void test_for_method_4() {
        expectedConsecutiveLines = List.of(
                "  public abstract java.util.Iterator<E> iterator();",
                "    descriptor: ()Ljava/util/Iterator;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #126                         // ()Ljava/util/Iterator<TE;>;"
        );
    }

    @Test
    public void test_for_method_5() {
        expectedConsecutiveLines = List.of(
                "  public abstract java.lang.Object[] toArray();",
                "    descriptor: ()[Ljava/lang/Object;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT"
        );
    }

    @Test
    public void test_for_method_6() {
        expectedConsecutiveLines = List.of(
                "  public abstract <T extends java.lang.Object> T[] toArray(T[]);",
                "    descriptor: ([Ljava/lang/Object;)[Ljava/lang/Object;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #128                         // <T:Ljava/lang/Object;>([TT;)[TT;"
        );
    }

    @Test
    public void test_for_method_7() {
        expectedConsecutiveLines = List.of(
                "  public abstract boolean add(E);",
                "    descriptor: (Ljava/lang/Object;)Z",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #129                         // (TE;)Z"
        );
    }

    @Test
    public void test_for_method_8() {
        expectedConsecutiveLines = List.of(
                "  public abstract boolean remove(java.lang.Object);",
                "    descriptor: (Ljava/lang/Object;)Z",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT"
        );
    }

    @Test
    public void test_for_method_9() {
        expectedConsecutiveLines = List.of(
                "  public abstract boolean containsAll(java.util.Collection<?>);",
                "    descriptor: (Ljava/util/Collection;)Z",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #132                         // (Ljava/util/Collection<*>;)Z"
        );
    }

    @Test
    public void test_for_method_10() {
        expectedConsecutiveLines = List.of(
                "  public abstract boolean addAll(java.util.Collection<? extends E>);",
                "    descriptor: (Ljava/util/Collection;)Z",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #134                         // (Ljava/util/Collection<+TE;>;)Z"
        );
    }

    @Test
    public void test_for_method_11() {
        expectedConsecutiveLines = List.of(
                "  public abstract boolean addAll(int, java.util.Collection<? extends E>);",
                "    descriptor: (ILjava/util/Collection;)Z",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #136                         // (ILjava/util/Collection<+TE;>;)Z"
        );
    }

    @Test
    public void test_for_method_12() {
        expectedConsecutiveLines = List.of(
                "  public abstract boolean removeAll(java.util.Collection<?>);",
                "    descriptor: (Ljava/util/Collection;)Z",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #132                         // (Ljava/util/Collection<*>;)Z"
        );
    }

    @Test
    public void test_for_method_13() {
        expectedConsecutiveLines = List.of(
                "  public abstract boolean retainAll(java.util.Collection<?>);",
                "    descriptor: (Ljava/util/Collection;)Z",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #132                         // (Ljava/util/Collection<*>;)Z"
        );
    }

    @Test
    public void test_for_method_14() {
        expectedConsecutiveLines = List.of(
                "  public default void replaceAll(java.util.function.UnaryOperator<E>);",
                "    descriptor: (Ljava/util/function/UnaryOperator;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Signature: #155                         // (Ljava/util/function/UnaryOperator<TE;>;)V"
        );
    }

    @Test
    public void test_for_method_15() {
        expectedConsecutiveLines = List.of(
                "  public default void sort(java.util.Comparator<? super E>);",
                "    descriptor: (Ljava/util/Comparator;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Signature: #168                         // (Ljava/util/Comparator<-TE;>;)V"
        );
    }

    @Test
    public void test_for_method_16() {
        expectedConsecutiveLines = List.of(
                "  public abstract void clear();",
                "    descriptor: ()V",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT"
        );
    }

    @Test
    public void test_for_method_17() {
        expectedConsecutiveLines = List.of(
                "  public abstract boolean equals(java.lang.Object);",
                "    descriptor: (Ljava/lang/Object;)Z",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT"
        );
    }

    @Test
    public void test_for_method_18() {
        expectedConsecutiveLines = List.of(
                "  public abstract int hashCode();",
                "    descriptor: ()I",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT"
        );
    }

    @Test
    public void test_for_method_19() {
        expectedConsecutiveLines = List.of(
                "  public abstract E get(int);",
                "    descriptor: (I)Ljava/lang/Object;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #172                         // (I)TE;"
        );
    }

    @Test
    public void test_for_method_20() {
        expectedConsecutiveLines = List.of(
                "  public abstract E set(int, E);",
                "    descriptor: (ILjava/lang/Object;)Ljava/lang/Object;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #174                         // (ITE;)TE;"
        );
    }

    @Test
    public void test_for_method_21() {
        expectedConsecutiveLines = List.of(
                "  public abstract void add(int, E);",
                "    descriptor: (ILjava/lang/Object;)V",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #175                         // (ITE;)V"
        );
    }

    @Test
    public void test_for_method_22() {
        expectedConsecutiveLines = List.of(
                "  public abstract E remove(int);",
                "    descriptor: (I)Ljava/lang/Object;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #172                         // (I)TE;"
        );
    }

    @Test
    public void test_for_method_23() {
        expectedConsecutiveLines = List.of(
                "  public abstract int indexOf(java.lang.Object);",
                "    descriptor: (Ljava/lang/Object;)I",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT"
        );
    }

    @Test
    public void test_for_method_24() {
        expectedConsecutiveLines = List.of(
                "  public abstract int lastIndexOf(java.lang.Object);",
                "    descriptor: (Ljava/lang/Object;)I",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT"
        );
    }

    @Test
    public void test_for_method_25() {
        expectedConsecutiveLines = List.of(
                "  public abstract java.util.ListIterator<E> listIterator();",
                "    descriptor: ()Ljava/util/ListIterator;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #179                         // ()Ljava/util/ListIterator<TE;>;"
        );
    }

    @Test
    public void test_for_method_26() {
        expectedConsecutiveLines = List.of(
                "  public abstract java.util.ListIterator<E> listIterator(int);",
                "    descriptor: (I)Ljava/util/ListIterator;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #181                         // (I)Ljava/util/ListIterator<TE;>;"
        );
    }

    @Test
    public void test_for_method_27() {
        expectedConsecutiveLines = List.of(
                "  public abstract java.util.List<E> subList(int, int);",
                "    descriptor: (II)Ljava/util/List;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #184                         // (II)Ljava/util/List<TE;>;"
        );
    }

    @Test
    public void test_for_method_28() {
        expectedConsecutiveLines = List.of(
                "  public default java.util.Spliterator<E> spliterator();",
                "    descriptor: ()Ljava/util/Spliterator;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Signature: #186                         // ()Ljava/util/Spliterator<TE;>;"
        );
    }

    @Test
    public void test_for_method_29() {
        expectedConsecutiveLines = List.of(
                "  public default void addFirst(E);",
                "    descriptor: (Ljava/lang/Object;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Signature: #189                         // (TE;)V"
        );
    }

    @Test
    public void test_for_method_30() {
        expectedConsecutiveLines = List.of(
                "  public default void addLast(E);",
                "    descriptor: (Ljava/lang/Object;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Signature: #189                         // (TE;)V"
        );
    }

    @Test
    public void test_for_method_31() {
        expectedConsecutiveLines = List.of(
                "  public default E getFirst();",
                "    descriptor: ()Ljava/lang/Object;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Signature: #192                         // ()TE;"
        );
    }

    @Test
    public void test_for_method_32() {
        expectedConsecutiveLines = List.of(
                "  public default E getLast();",
                "    descriptor: ()Ljava/lang/Object;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Signature: #192                         // ()TE;"
        );
    }

    @Test
    public void test_for_method_33() {
        expectedConsecutiveLines = List.of(
                "  public default E removeFirst();",
                "    descriptor: ()Ljava/lang/Object;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Signature: #192                         // ()TE;"
        );
    }

    @Test
    public void test_for_method_34() {
        expectedConsecutiveLines = List.of(
                "  public default E removeLast();",
                "    descriptor: ()Ljava/lang/Object;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Signature: #192                         // ()TE;"
        );
    }

    @Test
    public void test_for_method_35() {
        expectedConsecutiveLines = List.of(
                "  public default java.util.List<E> reversed();",
                "    descriptor: ()Ljava/util/List;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Signature: #196                         // ()Ljava/util/List<TE;>;"
        );
    }

    @Test
    public void test_for_method_36() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Object> java.util.List<E> of();",
                "    descriptor: ()Ljava/util/List;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Signature: #197                         // <E:Ljava/lang/Object;>()Ljava/util/List<TE;>;"
        );
    }

    @Test
    public void test_for_method_37() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Object> java.util.List<E> of(E);",
                "    descriptor: (Ljava/lang/Object;)Ljava/util/List;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Signature: #200                         // <E:Ljava/lang/Object;>(TE;)Ljava/util/List<TE;>;"
        );
    }

    @Test
    public void test_for_method_38() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Object> java.util.List<E> of(E, E);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Signature: #203                         // <E:Ljava/lang/Object;>(TE;TE;)Ljava/util/List<TE;>;"
        );
    }

    @Test
    public void test_for_method_39() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Object> java.util.List<E> of(E, E, E);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Signature: #206                         // <E:Ljava/lang/Object;>(TE;TE;TE;)Ljava/util/List<TE;>;"
        );
    }

    @Test
    public void test_for_method_40() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Object> java.util.List<E> of(E, E, E, E);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Signature: #209                         // <E:Ljava/lang/Object;>(TE;TE;TE;TE;)Ljava/util/List<TE;>;"
        );
    }

    @Test
    public void test_for_method_41() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Object> java.util.List<E> of(E, E, E, E, E);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Signature: #212                         // <E:Ljava/lang/Object;>(TE;TE;TE;TE;TE;)Ljava/util/List<TE;>;"
        );
    }

    @Test
    public void test_for_method_42() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Object> java.util.List<E> of(E, E, E, E, E, E);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Signature: #215                         // <E:Ljava/lang/Object;>(TE;TE;TE;TE;TE;TE;)Ljava/util/List<TE;>;"
        );
    }

    @Test
    public void test_for_method_43() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Object> java.util.List<E> of(E, E, E, E, E, E, E);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Signature: #218                         // <E:Ljava/lang/Object;>(TE;TE;TE;TE;TE;TE;TE;)Ljava/util/List<TE;>;"
        );
    }

    @Test
    public void test_for_method_44() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Object> java.util.List<E> of(E, E, E, E, E, E, E, E);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Signature: #221                         // <E:Ljava/lang/Object;>(TE;TE;TE;TE;TE;TE;TE;TE;)Ljava/util/List<TE;>;"
        );
    }

    @Test
    public void test_for_method_45() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Object> java.util.List<E> of(E, E, E, E, E, E, E, E, E);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Signature: #224                         // <E:Ljava/lang/Object;>(TE;TE;TE;TE;TE;TE;TE;TE;TE;)Ljava/util/List<TE;>;"
        );
    }

    @Test
    public void test_for_method_46() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Object> java.util.List<E> of(E, E, E, E, E, E, E, E, E, E);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Signature: #227                         // <E:Ljava/lang/Object;>(TE;TE;TE;TE;TE;TE;TE;TE;TE;TE;)Ljava/util/List<TE;>;"
        );
    }

    @Test
    public void test_for_method_47() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Object> java.util.List<E> of(E...);",
                "    descriptor: ([Ljava/lang/Object;)Ljava/util/List;",
                "    flags: (0x0089) ACC_PUBLIC, ACC_STATIC, ACC_VARARGS",
                "    Signature: #231                         // <E:Ljava/lang/Object;>([TE;)Ljava/util/List<TE;>;"
        );
    }

    @Test
    public void test_for_method_48() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Object> java.util.List<E> copyOf(java.util.Collection<? extends E>);",
                "    descriptor: (Ljava/util/Collection;)Ljava/util/List;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Signature: #238                         // <E:Ljava/lang/Object;>(Ljava/util/Collection<+TE;>;)Ljava/util/List<TE;>;"
        );
    }

    @Test
    public void test_for_method_49() {
        expectedConsecutiveLines = List.of(
                "  public default java.util.SequencedCollection reversed();",
                "    descriptor: ()Ljava/util/SequencedCollection;",
                "    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC"
        );
    }
}
