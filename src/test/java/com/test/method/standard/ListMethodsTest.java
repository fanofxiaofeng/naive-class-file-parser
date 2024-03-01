package com.test.method.standard;

import com.test.method.MethodPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

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
                "    Code:",
                "      stack=3, locals=3, args_size=2",
                "         0: aload_1",
                "         1: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "         4: pop",
                "         5: aload_0",
                "         6: invokeinterface #7,  1            // InterfaceMethod listIterator:()Ljava/util/ListIterator;",
                "        11: astore_2",
                "        12: aload_2",
                "        13: invokeinterface #13,  1           // InterfaceMethod java/util/ListIterator.hasNext:()Z",
                "        18: ifeq          42",
                "        21: aload_2",
                "        22: aload_1",
                "        23: aload_2",
                "        24: invokeinterface #19,  1           // InterfaceMethod java/util/ListIterator.next:()Ljava/lang/Object;",
                "        29: invokeinterface #23,  2           // InterfaceMethod java/util/function/UnaryOperator.apply:(Ljava/lang/Object;)Ljava/lang/Object;",
                "        34: invokeinterface #28,  2           // InterfaceMethod java/util/ListIterator.set:(Ljava/lang/Object;)V",
                "        39: goto          12",
                "        42: return",
                "    Signature: #155                         // (Ljava/util/function/UnaryOperator<TE;>;)V"
        );
    }
    @Test
    public void test_for_method_15() {
        expectedConsecutiveLines = List.of(
                "  public default void sort(java.util.Comparator<? super E>);",
                "    descriptor: (Ljava/util/Comparator;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=8, args_size=2",
                "         0: aload_0",
                "         1: invokeinterface #32,  1           // InterfaceMethod toArray:()[Ljava/lang/Object;",
                "         6: astore_2",
                "         7: aload_2",
                "         8: aload_1",
                "         9: invokestatic  #36                 // Method java/util/Arrays.sort:([Ljava/lang/Object;Ljava/util/Comparator;)V",
                "        12: aload_0",
                "        13: invokeinterface #7,  1            // InterfaceMethod listIterator:()Ljava/util/ListIterator;",
                "        18: astore_3",
                "        19: aload_2",
                "        20: astore        4",
                "        22: aload         4",
                "        24: arraylength",
                "        25: istore        5",
                "        27: iconst_0",
                "        28: istore        6",
                "        30: iload         6",
                "        32: iload         5",
                "        34: if_icmpge     65",
                "        37: aload         4",
                "        39: iload         6",
                "        41: aaload",
                "        42: astore        7",
                "        44: aload_3",
                "        45: invokeinterface #19,  1           // InterfaceMethod java/util/ListIterator.next:()Ljava/lang/Object;",
                "        50: pop",
                "        51: aload_3",
                "        52: aload         7",
                "        54: invokeinterface #28,  2           // InterfaceMethod java/util/ListIterator.set:(Ljava/lang/Object;)V",
                "        59: iinc          6, 1",
                "        62: goto          30",
                "        65: return",
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
                "    Code:",
                "      stack=3, locals=1, args_size=1",
                "         0: aload_0",
                "         1: instanceof    #42                 // class java/util/RandomAccess",
                "         4: ifeq          16",
                "         7: new           #44                 // class java/util/AbstractList$RandomAccessSpliterator",
                "        10: dup",
                "        11: aload_0",
                "        12: invokespecial #46                 // Method java/util/AbstractList$RandomAccessSpliterator.\"<init>\":(Ljava/util/List;)V",
                "        15: areturn",
                "        16: aload_0",
                "        17: bipush        16",
                "        19: invokestatic  #52                 // Method java/util/Spliterators.spliterator:(Ljava/util/Collection;I)Ljava/util/Spliterator;",
                "        22: areturn",
                "    Signature: #186                         // ()Ljava/util/Spliterator<TE;>;"
        );
    }
    @Test
    public void test_for_method_29() {
        expectedConsecutiveLines = List.of(
                "  public default void addFirst(E);",
                "    descriptor: (Ljava/lang/Object;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=2, args_size=2",
                "         0: aload_0",
                "         1: iconst_0",
                "         2: aload_1",
                "         3: invokeinterface #58,  3           // InterfaceMethod add:(ILjava/lang/Object;)V",
                "         8: return",
                "    Signature: #189                         // (TE;)V"
        );
    }
    @Test
    public void test_for_method_30() {
        expectedConsecutiveLines = List.of(
                "  public default void addLast(E);",
                "    descriptor: (Ljava/lang/Object;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_0",
                "         1: aload_1",
                "         2: invokeinterface #62,  2           // InterfaceMethod add:(Ljava/lang/Object;)Z",
                "         7: pop",
                "         8: return",
                "    Signature: #189                         // (TE;)V"
        );
    }
    @Test
    public void test_for_method_31() {
        expectedConsecutiveLines = List.of(
                "  public default E getFirst();",
                "    descriptor: ()Ljava/lang/Object;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: invokeinterface #65,  1           // InterfaceMethod isEmpty:()Z",
                "         6: ifeq          17",
                "         9: new           #68                 // class java/util/NoSuchElementException",
                "        12: dup",
                "        13: invokespecial #70                 // Method java/util/NoSuchElementException.\"<init>\":()V",
                "        16: athrow",
                "        17: aload_0",
                "        18: iconst_0",
                "        19: invokeinterface #73,  2           // InterfaceMethod get:(I)Ljava/lang/Object;",
                "        24: areturn",
                "    Signature: #192                         // ()TE;"
        );
    }
    @Test
    public void test_for_method_32() {
        expectedConsecutiveLines = List.of(
                "  public default E getLast();",
                "    descriptor: ()Ljava/lang/Object;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=1, args_size=1",
                "         0: aload_0",
                "         1: invokeinterface #65,  1           // InterfaceMethod isEmpty:()Z",
                "         6: ifeq          17",
                "         9: new           #68                 // class java/util/NoSuchElementException",
                "        12: dup",
                "        13: invokespecial #70                 // Method java/util/NoSuchElementException.\"<init>\":()V",
                "        16: athrow",
                "        17: aload_0",
                "        18: aload_0",
                "        19: invokeinterface #77,  1           // InterfaceMethod size:()I",
                "        24: iconst_1",
                "        25: isub",
                "        26: invokeinterface #73,  2           // InterfaceMethod get:(I)Ljava/lang/Object;",
                "        31: areturn",
                "    Signature: #192                         // ()TE;"
        );
    }
    @Test
    public void test_for_method_33() {
        expectedConsecutiveLines = List.of(
                "  public default E removeFirst();",
                "    descriptor: ()Ljava/lang/Object;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: invokeinterface #65,  1           // InterfaceMethod isEmpty:()Z",
                "         6: ifeq          17",
                "         9: new           #68                 // class java/util/NoSuchElementException",
                "        12: dup",
                "        13: invokespecial #70                 // Method java/util/NoSuchElementException.\"<init>\":()V",
                "        16: athrow",
                "        17: aload_0",
                "        18: iconst_0",
                "        19: invokeinterface #81,  2           // InterfaceMethod remove:(I)Ljava/lang/Object;",
                "        24: areturn",
                "    Signature: #192                         // ()TE;"
        );
    }
    @Test
    public void test_for_method_34() {
        expectedConsecutiveLines = List.of(
                "  public default E removeLast();",
                "    descriptor: ()Ljava/lang/Object;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=1, args_size=1",
                "         0: aload_0",
                "         1: invokeinterface #65,  1           // InterfaceMethod isEmpty:()Z",
                "         6: ifeq          17",
                "         9: new           #68                 // class java/util/NoSuchElementException",
                "        12: dup",
                "        13: invokespecial #70                 // Method java/util/NoSuchElementException.\"<init>\":()V",
                "        16: athrow",
                "        17: aload_0",
                "        18: aload_0",
                "        19: invokeinterface #77,  1           // InterfaceMethod size:()I",
                "        24: iconst_1",
                "        25: isub",
                "        26: invokeinterface #81,  2           // InterfaceMethod remove:(I)Ljava/lang/Object;",
                "        31: areturn",
                "    Signature: #192                         // ()TE;"
        );
    }
    @Test
    public void test_for_method_35() {
        expectedConsecutiveLines = List.of(
                "  public default java.util.List<E> reversed();",
                "    descriptor: ()Ljava/util/List;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: iconst_1",
                "         2: invokestatic  #84                 // Method java/util/ReverseOrderListView.of:(Ljava/util/List;Z)Ljava/util/List;",
                "         5: areturn",
                "    Signature: #196                         // ()Ljava/util/List<TE;>;"
        );
    }
    @Test
    public void test_for_method_36() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Object> java.util.List<E> of();",
                "    descriptor: ()Ljava/util/List;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=1, locals=0, args_size=0",
                "         0: getstatic     #90                 // Field java/util/ImmutableCollections.EMPTY_LIST:Ljava/util/ImmutableCollections$ListN;",
                "         3: areturn",
                "    Signature: #197                         // <E:Ljava/lang/Object;>()Ljava/util/List<TE;>;"
        );
    }
    @Test
    public void test_for_method_37() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Object> java.util.List<E> of(E);",
                "    descriptor: (Ljava/lang/Object;)Ljava/util/List;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=3, locals=1, args_size=1",
                "         0: new           #96                 // class java/util/ImmutableCollections$List12",
                "         3: dup",
                "         4: aload_0",
                "         5: invokespecial #98                 // Method java/util/ImmutableCollections$List12.\"<init>\":(Ljava/lang/Object;)V",
                "         8: areturn",
                "    Signature: #200                         // <E:Ljava/lang/Object;>(TE;)Ljava/util/List<TE;>;"
        );
    }
    @Test
    public void test_for_method_38() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Object> java.util.List<E> of(E, E);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=2, args_size=2",
                "         0: new           #96                 // class java/util/ImmutableCollections$List12",
                "         3: dup",
                "         4: aload_0",
                "         5: aload_1",
                "         6: invokespecial #100                // Method java/util/ImmutableCollections$List12.\"<init>\":(Ljava/lang/Object;Ljava/lang/Object;)V",
                "         9: areturn",
                "    Signature: #203                         // <E:Ljava/lang/Object;>(TE;TE;)Ljava/util/List<TE;>;"
        );
    }
    @Test
    public void test_for_method_39() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Object> java.util.List<E> of(E, E, E);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=3, args_size=3",
                "         0: iconst_3",
                "         1: anewarray     #103                // class java/lang/Object",
                "         4: dup",
                "         5: iconst_0",
                "         6: aload_0",
                "         7: aastore",
                "         8: dup",
                "         9: iconst_1",
                "        10: aload_1",
                "        11: aastore",
                "        12: dup",
                "        13: iconst_2",
                "        14: aload_2",
                "        15: aastore",
                "        16: invokestatic  #105                // Method java/util/ImmutableCollections.listFromTrustedArray:([Ljava/lang/Object;)Ljava/util/List;",
                "        19: areturn",
                "    Signature: #206                         // <E:Ljava/lang/Object;>(TE;TE;TE;)Ljava/util/List<TE;>;"
        );
    }
    @Test
    public void test_for_method_40() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Object> java.util.List<E> of(E, E, E, E);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=4, args_size=4",
                "         0: iconst_4",
                "         1: anewarray     #103                // class java/lang/Object",
                "         4: dup",
                "         5: iconst_0",
                "         6: aload_0",
                "         7: aastore",
                "         8: dup",
                "         9: iconst_1",
                "        10: aload_1",
                "        11: aastore",
                "        12: dup",
                "        13: iconst_2",
                "        14: aload_2",
                "        15: aastore",
                "        16: dup",
                "        17: iconst_3",
                "        18: aload_3",
                "        19: aastore",
                "        20: invokestatic  #105                // Method java/util/ImmutableCollections.listFromTrustedArray:([Ljava/lang/Object;)Ljava/util/List;",
                "        23: areturn",
                "    Signature: #209                         // <E:Ljava/lang/Object;>(TE;TE;TE;TE;)Ljava/util/List<TE;>;"
        );
    }
    @Test
    public void test_for_method_41() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Object> java.util.List<E> of(E, E, E, E, E);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=5, args_size=5",
                "         0: iconst_5",
                "         1: anewarray     #103                // class java/lang/Object",
                "         4: dup",
                "         5: iconst_0",
                "         6: aload_0",
                "         7: aastore",
                "         8: dup",
                "         9: iconst_1",
                "        10: aload_1",
                "        11: aastore",
                "        12: dup",
                "        13: iconst_2",
                "        14: aload_2",
                "        15: aastore",
                "        16: dup",
                "        17: iconst_3",
                "        18: aload_3",
                "        19: aastore",
                "        20: dup",
                "        21: iconst_4",
                "        22: aload         4",
                "        24: aastore",
                "        25: invokestatic  #105                // Method java/util/ImmutableCollections.listFromTrustedArray:([Ljava/lang/Object;)Ljava/util/List;",
                "        28: areturn",
                "    Signature: #212                         // <E:Ljava/lang/Object;>(TE;TE;TE;TE;TE;)Ljava/util/List<TE;>;"
        );
    }
    @Test
    public void test_for_method_42() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Object> java.util.List<E> of(E, E, E, E, E, E);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=6, args_size=6",
                "         0: bipush        6",
                "         2: anewarray     #103                // class java/lang/Object",
                "         5: dup",
                "         6: iconst_0",
                "         7: aload_0",
                "         8: aastore",
                "         9: dup",
                "        10: iconst_1",
                "        11: aload_1",
                "        12: aastore",
                "        13: dup",
                "        14: iconst_2",
                "        15: aload_2",
                "        16: aastore",
                "        17: dup",
                "        18: iconst_3",
                "        19: aload_3",
                "        20: aastore",
                "        21: dup",
                "        22: iconst_4",
                "        23: aload         4",
                "        25: aastore",
                "        26: dup",
                "        27: iconst_5",
                "        28: aload         5",
                "        30: aastore",
                "        31: invokestatic  #105                // Method java/util/ImmutableCollections.listFromTrustedArray:([Ljava/lang/Object;)Ljava/util/List;",
                "        34: areturn",
                "    Signature: #215                         // <E:Ljava/lang/Object;>(TE;TE;TE;TE;TE;TE;)Ljava/util/List<TE;>;"
        );
    }
    @Test
    public void test_for_method_43() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Object> java.util.List<E> of(E, E, E, E, E, E, E);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=7, args_size=7",
                "         0: bipush        7",
                "         2: anewarray     #103                // class java/lang/Object",
                "         5: dup",
                "         6: iconst_0",
                "         7: aload_0",
                "         8: aastore",
                "         9: dup",
                "        10: iconst_1",
                "        11: aload_1",
                "        12: aastore",
                "        13: dup",
                "        14: iconst_2",
                "        15: aload_2",
                "        16: aastore",
                "        17: dup",
                "        18: iconst_3",
                "        19: aload_3",
                "        20: aastore",
                "        21: dup",
                "        22: iconst_4",
                "        23: aload         4",
                "        25: aastore",
                "        26: dup",
                "        27: iconst_5",
                "        28: aload         5",
                "        30: aastore",
                "        31: dup",
                "        32: bipush        6",
                "        34: aload         6",
                "        36: aastore",
                "        37: invokestatic  #105                // Method java/util/ImmutableCollections.listFromTrustedArray:([Ljava/lang/Object;)Ljava/util/List;",
                "        40: areturn",
                "    Signature: #218                         // <E:Ljava/lang/Object;>(TE;TE;TE;TE;TE;TE;TE;)Ljava/util/List<TE;>;"
        );
    }
    @Test
    public void test_for_method_44() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Object> java.util.List<E> of(E, E, E, E, E, E, E, E);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=8, args_size=8",
                "         0: bipush        8",
                "         2: anewarray     #103                // class java/lang/Object",
                "         5: dup",
                "         6: iconst_0",
                "         7: aload_0",
                "         8: aastore",
                "         9: dup",
                "        10: iconst_1",
                "        11: aload_1",
                "        12: aastore",
                "        13: dup",
                "        14: iconst_2",
                "        15: aload_2",
                "        16: aastore",
                "        17: dup",
                "        18: iconst_3",
                "        19: aload_3",
                "        20: aastore",
                "        21: dup",
                "        22: iconst_4",
                "        23: aload         4",
                "        25: aastore",
                "        26: dup",
                "        27: iconst_5",
                "        28: aload         5",
                "        30: aastore",
                "        31: dup",
                "        32: bipush        6",
                "        34: aload         6",
                "        36: aastore",
                "        37: dup",
                "        38: bipush        7",
                "        40: aload         7",
                "        42: aastore",
                "        43: invokestatic  #105                // Method java/util/ImmutableCollections.listFromTrustedArray:([Ljava/lang/Object;)Ljava/util/List;",
                "        46: areturn",
                "    Signature: #221                         // <E:Ljava/lang/Object;>(TE;TE;TE;TE;TE;TE;TE;TE;)Ljava/util/List<TE;>;"
        );
    }
    @Test
    public void test_for_method_45() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Object> java.util.List<E> of(E, E, E, E, E, E, E, E, E);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=9, args_size=9",
                "         0: bipush        9",
                "         2: anewarray     #103                // class java/lang/Object",
                "         5: dup",
                "         6: iconst_0",
                "         7: aload_0",
                "         8: aastore",
                "         9: dup",
                "        10: iconst_1",
                "        11: aload_1",
                "        12: aastore",
                "        13: dup",
                "        14: iconst_2",
                "        15: aload_2",
                "        16: aastore",
                "        17: dup",
                "        18: iconst_3",
                "        19: aload_3",
                "        20: aastore",
                "        21: dup",
                "        22: iconst_4",
                "        23: aload         4",
                "        25: aastore",
                "        26: dup",
                "        27: iconst_5",
                "        28: aload         5",
                "        30: aastore",
                "        31: dup",
                "        32: bipush        6",
                "        34: aload         6",
                "        36: aastore",
                "        37: dup",
                "        38: bipush        7",
                "        40: aload         7",
                "        42: aastore",
                "        43: dup",
                "        44: bipush        8",
                "        46: aload         8",
                "        48: aastore",
                "        49: invokestatic  #105                // Method java/util/ImmutableCollections.listFromTrustedArray:([Ljava/lang/Object;)Ljava/util/List;",
                "        52: areturn",
                "    Signature: #224                         // <E:Ljava/lang/Object;>(TE;TE;TE;TE;TE;TE;TE;TE;TE;)Ljava/util/List<TE;>;"
        );
    }
    @Test
    public void test_for_method_46() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Object> java.util.List<E> of(E, E, E, E, E, E, E, E, E, E);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=10, args_size=10",
                "         0: bipush        10",
                "         2: anewarray     #103                // class java/lang/Object",
                "         5: dup",
                "         6: iconst_0",
                "         7: aload_0",
                "         8: aastore",
                "         9: dup",
                "        10: iconst_1",
                "        11: aload_1",
                "        12: aastore",
                "        13: dup",
                "        14: iconst_2",
                "        15: aload_2",
                "        16: aastore",
                "        17: dup",
                "        18: iconst_3",
                "        19: aload_3",
                "        20: aastore",
                "        21: dup",
                "        22: iconst_4",
                "        23: aload         4",
                "        25: aastore",
                "        26: dup",
                "        27: iconst_5",
                "        28: aload         5",
                "        30: aastore",
                "        31: dup",
                "        32: bipush        6",
                "        34: aload         6",
                "        36: aastore",
                "        37: dup",
                "        38: bipush        7",
                "        40: aload         7",
                "        42: aastore",
                "        43: dup",
                "        44: bipush        8",
                "        46: aload         8",
                "        48: aastore",
                "        49: dup",
                "        50: bipush        9",
                "        52: aload         9",
                "        54: aastore",
                "        55: invokestatic  #105                // Method java/util/ImmutableCollections.listFromTrustedArray:([Ljava/lang/Object;)Ljava/util/List;",
                "        58: areturn",
                "    Signature: #227                         // <E:Ljava/lang/Object;>(TE;TE;TE;TE;TE;TE;TE;TE;TE;TE;)Ljava/util/List<TE;>;"
        );
    }
    @Test
    public void test_for_method_47() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Object> java.util.List<E> of(E...);",
                "    descriptor: ([Ljava/lang/Object;)Ljava/util/List;",
                "    flags: (0x0089) ACC_PUBLIC, ACC_STATIC, ACC_VARARGS",
                "    Code:",
                "      stack=5, locals=2, args_size=1",
                "         0: aload_0",
                "         1: arraylength",
                "         2: tableswitch   { // 0 to 2",
                "                       0: 28",
                "                       1: 34",
                "                       2: 45",
                "    Signature: #231                         // <E:Ljava/lang/Object;>([TE;)Ljava/util/List<TE;>;"
        );
    }
    @Test
    public void test_for_method_48() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Object> java.util.List<E> copyOf(java.util.Collection<? extends E>);",
                "    descriptor: (Ljava/util/Collection;)Ljava/util/List;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: invokestatic  #112                // Method java/util/ImmutableCollections.listCopy:(Ljava/util/Collection;)Ljava/util/List;",
                "         4: areturn",
                "    Signature: #238                         // <E:Ljava/lang/Object;>(Ljava/util/Collection<+TE;>;)Ljava/util/List<TE;>;"
        );
    }
    @Test
    public void test_for_method_49() {
        expectedConsecutiveLines = List.of(
                "  public default java.util.SequencedCollection reversed();",
                "    descriptor: ()Ljava/util/SequencedCollection;",
                "    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: invokeinterface #116,  1          // InterfaceMethod reversed:()Ljava/util/List;",
                "         6: areturn"
        );
    }
}
