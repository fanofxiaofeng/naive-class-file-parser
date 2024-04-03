package com.test.instruction.standard;

import com.test.annotations.GeneratedBy;
import com.test.cases.method.instruction.Instruction;
import com.test.instruction.InstructionTestGenerator;
import com.test.method.MethodPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(InstructionTestGenerator.class)
public class MapInstructionsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.util.Map"));
    }

    @Test
    public void test_1() {
        expectedConsecutiveLines = List.of(
                "  public abstract int size();",
                "    descriptor: ()I",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT"
        );
    }

    @Test
    public void test_2() {
        expectedConsecutiveLines = List.of(
                "  public abstract boolean isEmpty();",
                "    descriptor: ()Z",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT"
        );
    }

    @Test
    public void test_3() {
        expectedConsecutiveLines = List.of(
                "  public abstract boolean containsKey(java.lang.Object);",
                "    descriptor: (Ljava/lang/Object;)Z",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT"
        );
    }

    @Test
    public void test_4() {
        expectedConsecutiveLines = List.of(
                "  public abstract boolean containsValue(java.lang.Object);",
                "    descriptor: (Ljava/lang/Object;)Z",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT"
        );
    }

    @Test
    public void test_5() {
        expectedConsecutiveLines = List.of(
                "  public abstract V get(java.lang.Object);",
                "    descriptor: (Ljava/lang/Object;)Ljava/lang/Object;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #124                         // (Ljava/lang/Object;)TV;"
        );
    }

    @Test
    public void test_6() {
        expectedConsecutiveLines = List.of(
                "  public abstract V put(K, V);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #125                         // (TK;TV;)TV;"
        );
    }

    @Test
    public void test_7() {
        expectedConsecutiveLines = List.of(
                "  public abstract V remove(java.lang.Object);",
                "    descriptor: (Ljava/lang/Object;)Ljava/lang/Object;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #124                         // (Ljava/lang/Object;)TV;"
        );
    }

    @Test
    public void test_8() {
        expectedConsecutiveLines = List.of(
                "  public abstract void putAll(java.util.Map<? extends K, ? extends V>);",
                "    descriptor: (Ljava/util/Map;)V",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #128                         // (Ljava/util/Map<+TK;+TV;>;)V"
        );
    }

    @Test
    public void test_9() {
        expectedConsecutiveLines = List.of(
                "  public abstract void clear();",
                "    descriptor: ()V",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT"
        );
    }

    @Test
    public void test_10() {
        expectedConsecutiveLines = List.of(
                "  public abstract java.util.Set<K> keySet();",
                "    descriptor: ()Ljava/util/Set;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #132                         // ()Ljava/util/Set<TK;>;"
        );
    }

    @Test
    public void test_11() {
        expectedConsecutiveLines = List.of(
                "  public abstract java.util.Collection<V> values();",
                "    descriptor: ()Ljava/util/Collection;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #135                         // ()Ljava/util/Collection<TV;>;"
        );
    }

    @Test
    public void test_12() {
        expectedConsecutiveLines = List.of(
                "  public abstract java.util.Set<java.util.Map$Entry<K, V>> entrySet();",
                "    descriptor: ()Ljava/util/Set;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #136                         // ()Ljava/util/Set<Ljava/util/Map$Entry<TK;TV;>;>;"
        );
    }

    @Test
    public void test_13() {
        expectedConsecutiveLines = List.of(
                "  public abstract boolean equals(java.lang.Object);",
                "    descriptor: (Ljava/lang/Object;)Z",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT"
        );
    }

    @Test
    public void test_14() {
        expectedConsecutiveLines = List.of(
                "  public abstract int hashCode();",
                "    descriptor: ()I",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x4e, name = "astore_3")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xc7, name = "ifnonnull")
    @Test
    public void test_15() {
        expectedConsecutiveLines = List.of(
                "  public default V getOrDefault(java.lang.Object, V);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=4, args_size=3",
                "         0: aload_0",
                "         1: aload_1",
                "         2: invokeinterface #1,  2            // InterfaceMethod get:(Ljava/lang/Object;)Ljava/lang/Object;",
                "         7: dup",
                "         8: astore_3",
                "         9: ifnonnull     22",
                "        12: aload_0",
                "        13: aload_1",
                "        14: invokeinterface #7,  2            // InterfaceMethod containsKey:(Ljava/lang/Object;)Z",
                "        19: ifeq          26",
                "        22: aload_3",
                "        23: goto          27",
                "        26: aload_2",
                "        27: areturn",
                "      LineNumberTable:",
                "        line 691: 0",
                "        line 692: 22",
                "        line 693: 26",
                "        line 691: 27",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      28     0  this   Ljava/util/Map;",
                "            0      28     1   key   Ljava/lang/Object;",
                "            0      28     2 defaultValue   Ljava/lang/Object;",
                "            9      19     3     v   Ljava/lang/Object;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      28     0  this   Ljava/util/Map<TK;TV;>;",
                "            0      28     2 defaultValue   TV;",
                "            9      19     3     v   TV;",
                "      StackMapTable: number_of_entries = 3",
                "        frame_type = 252 /* append */",
                "          offset_delta = 22",
                "          locals = [ class java/lang/Object ]",
                "        frame_type = 3 /* same */",
                "        frame_type = 64 /* same_locals_1_stack_item */",
                "          stack = [ class java/lang/Object ]",
                "    Signature: #152                         // (Ljava/lang/Object;TV;)TV;"
        );
    }

    @Instruction(value = 0x19, name = "aload")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x3a, name = "astore")
    @Instruction(value = 0x4d, name = "astore_2")
    @Instruction(value = 0x4e, name = "astore_3")
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xb1, name = "return")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbf, name = "athrow")
    @Instruction(value = 0xc0, name = "checkcast")
    @Test
    public void test_16() {
        expectedConsecutiveLines = List.of(
                "  public default void forEach(java.util.function.BiConsumer<? super K, ? super V>);",
                "    descriptor: (Ljava/util/function/BiConsumer;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=7, args_size=2",
                "         0: aload_1",
                "         1: invokestatic  #11                 // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "         4: pop",
                "         5: aload_0",
                "         6: invokeinterface #16,  1           // InterfaceMethod entrySet:()Ljava/util/Set;",
                "        11: invokeinterface #20,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;",
                "        16: astore_2",
                "        17: aload_2",
                "        18: invokeinterface #26,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z",
                "        23: ifeq          80",
                "        26: aload_2",
                "        27: invokeinterface #32,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;",
                "        32: checkcast     #36                 // class java/util/Map$Entry",
                "        35: astore_3",
                "        36: aload_3",
                "        37: invokeinterface #38,  1           // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;",
                "        42: astore        4",
                "        44: aload_3",
                "        45: invokeinterface #41,  1           // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;",
                "        50: astore        5",
                "        52: goto          67",
                "        55: astore        6",
                "        57: new           #46                 // class java/util/ConcurrentModificationException",
                "        60: dup",
                "        61: aload         6",
                "        63: invokespecial #48                 // Method java/util/ConcurrentModificationException.\"<init>\":(Ljava/lang/Throwable;)V",
                "        66: athrow",
                "        67: aload_1",
                "        68: aload         4",
                "        70: aload         5",
                "        72: invokeinterface #52,  3           // InterfaceMethod java/util/function/BiConsumer.accept:(Ljava/lang/Object;Ljava/lang/Object;)V",
                "        77: goto          17",
                "        80: return",
                "      Exception table:",
                "         from    to  target type",
                "            36    52    55   Class java/lang/IllegalStateException",
                "      LineNumberTable:",
                "        line 722: 0",
                "        line 723: 5",
                "        line 727: 36",
                "        line 728: 44",
                "        line 732: 52",
                "        line 729: 55",
                "        line 731: 57",
                "        line 733: 67",
                "        line 734: 77",
                "        line 735: 80",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "           44      11     4     k   Ljava/lang/Object;",
                "           52       3     5     v   Ljava/lang/Object;",
                "           57      10     6   ise   Ljava/lang/IllegalStateException;",
                "           67      10     4     k   Ljava/lang/Object;",
                "           67      10     5     v   Ljava/lang/Object;",
                "           36      41     3 entry   Ljava/util/Map$Entry;",
                "            0      81     0  this   Ljava/util/Map;",
                "            0      81     1 action   Ljava/util/function/BiConsumer;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "           44      11     4     k   TK;",
                "           52       3     5     v   TV;",
                "           67      10     4     k   TK;",
                "           67      10     5     v   TV;",
                "           36      41     3 entry   Ljava/util/Map$Entry<TK;TV;>;",
                "            0      81     0  this   Ljava/util/Map<TK;TV;>;",
                "            0      81     1 action   Ljava/util/function/BiConsumer<-TK;-TV;>;",
                "      StackMapTable: number_of_entries = 4",
                "        frame_type = 252 /* append */",
                "          offset_delta = 17",
                "          locals = [ class java/util/Iterator ]",
                "        frame_type = 255 /* full_frame */",
                "          offset_delta = 37",
                "          locals = [ class java/util/Map, class java/util/function/BiConsumer, class java/util/Iterator, class java/util/Map$Entry ]",
                "          stack = [ class java/lang/IllegalStateException ]",
                "        frame_type = 253 /* append */",
                "          offset_delta = 11",
                "          locals = [ class java/lang/Object, class java/lang/Object ]",
                "        frame_type = 255 /* full_frame */",
                "          offset_delta = 12",
                "          locals = [ class java/util/Map, class java/util/function/BiConsumer ]",
                "          stack = []",
                "    Signature: #165                         // (Ljava/util/function/BiConsumer<-TK;-TV;>;)V"
        );
    }

    @Instruction(value = 0x19, name = "aload")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x3a, name = "astore")
    @Instruction(value = 0x4d, name = "astore_2")
    @Instruction(value = 0x4e, name = "astore_3")
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xb1, name = "return")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbf, name = "athrow")
    @Instruction(value = 0xc0, name = "checkcast")
    @Test
    public void test_17() {
        expectedConsecutiveLines = List.of(
                "  public default void replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V>);",
                "    descriptor: (Ljava/util/function/BiFunction;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=7, args_size=2",
                "         0: aload_1",
                "         1: invokestatic  #11                 // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "         4: pop",
                "         5: aload_0",
                "         6: invokeinterface #16,  1           // InterfaceMethod entrySet:()Ljava/util/Set;",
                "        11: invokeinterface #20,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;",
                "        16: astore_2",
                "        17: aload_2",
                "        18: invokeinterface #26,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z",
                "        23: ifeq          106",
                "        26: aload_2",
                "        27: invokeinterface #32,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;",
                "        32: checkcast     #36                 // class java/util/Map$Entry",
                "        35: astore_3",
                "        36: aload_3",
                "        37: invokeinterface #38,  1           // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;",
                "        42: astore        4",
                "        44: aload_3",
                "        45: invokeinterface #41,  1           // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;",
                "        50: astore        5",
                "        52: goto          67",
                "        55: astore        6",
                "        57: new           #46                 // class java/util/ConcurrentModificationException",
                "        60: dup",
                "        61: aload         6",
                "        63: invokespecial #48                 // Method java/util/ConcurrentModificationException.\"<init>\":(Ljava/lang/Throwable;)V",
                "        66: athrow",
                "        67: aload_1",
                "        68: aload         4",
                "        70: aload         5",
                "        72: invokeinterface #58,  3           // InterfaceMethod java/util/function/BiFunction.apply:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
                "        77: astore        5",
                "        79: aload_3",
                "        80: aload         5",
                "        82: invokeinterface #64,  2           // InterfaceMethod java/util/Map$Entry.setValue:(Ljava/lang/Object;)Ljava/lang/Object;",
                "        87: pop",
                "        88: goto          103",
                "        91: astore        6",
                "        93: new           #46                 // class java/util/ConcurrentModificationException",
                "        96: dup",
                "        97: aload         6",
                "        99: invokespecial #48                 // Method java/util/ConcurrentModificationException.\"<init>\":(Ljava/lang/Throwable;)V",
                "       102: athrow",
                "       103: goto          17",
                "       106: return",
                "      Exception table:",
                "         from    to  target type",
                "            36    52    55   Class java/lang/IllegalStateException",
                "            79    88    91   Class java/lang/IllegalStateException",
                "      LineNumberTable:",
                "        line 772: 0",
                "        line 773: 5",
                "        line 777: 36",
                "        line 778: 44",
                "        line 782: 52",
                "        line 779: 55",
                "        line 781: 57",
                "        line 785: 67",
                "        line 788: 79",
                "        line 792: 88",
                "        line 789: 91",
                "        line 791: 93",
                "        line 793: 103",
                "        line 794: 106",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "           44      11     4     k   Ljava/lang/Object;",
                "           52       3     5     v   Ljava/lang/Object;",
                "           57      10     6   ise   Ljava/lang/IllegalStateException;",
                "           93      10     6   ise   Ljava/lang/IllegalStateException;",
                "           67      36     4     k   Ljava/lang/Object;",
                "           67      36     5     v   Ljava/lang/Object;",
                "           36      67     3 entry   Ljava/util/Map$Entry;",
                "            0     107     0  this   Ljava/util/Map;",
                "            0     107     1 function   Ljava/util/function/BiFunction;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "           44      11     4     k   TK;",
                "           52       3     5     v   TV;",
                "           67      36     4     k   TK;",
                "           67      36     5     v   TV;",
                "           36      67     3 entry   Ljava/util/Map$Entry<TK;TV;>;",
                "            0     107     0  this   Ljava/util/Map<TK;TV;>;",
                "            0     107     1 function   Ljava/util/function/BiFunction<-TK;-TV;+TV;>;",
                "      StackMapTable: number_of_entries = 6",
                "        frame_type = 252 /* append */",
                "          offset_delta = 17",
                "          locals = [ class java/util/Iterator ]",
                "        frame_type = 255 /* full_frame */",
                "          offset_delta = 37",
                "          locals = [ class java/util/Map, class java/util/function/BiFunction, class java/util/Iterator, class java/util/Map$Entry ]",
                "          stack = [ class java/lang/IllegalStateException ]",
                "        frame_type = 253 /* append */",
                "          offset_delta = 11",
                "          locals = [ class java/lang/Object, class java/lang/Object ]",
                "        frame_type = 87 /* same_locals_1_stack_item */",
                "          stack = [ class java/lang/IllegalStateException ]",
                "        frame_type = 248 /* chop */",
                "          offset_delta = 11",
                "        frame_type = 250 /* chop */",
                "          offset_delta = 2",
                "    Signature: #171                         // (Ljava/util/function/BiFunction<-TK;-TV;+TV;>;)V"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x4e, name = "astore_3")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xc7, name = "ifnonnull")
    @Test
    public void test_18() {
        expectedConsecutiveLines = List.of(
                "  public default V putIfAbsent(K, V);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=4, args_size=3",
                "         0: aload_0",
                "         1: aload_1",
                "         2: invokeinterface #1,  2            // InterfaceMethod get:(Ljava/lang/Object;)Ljava/lang/Object;",
                "         7: astore_3",
                "         8: aload_3",
                "         9: ifnonnull     21",
                "        12: aload_0",
                "        13: aload_1",
                "        14: aload_2",
                "        15: invokeinterface #67,  3           // InterfaceMethod put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
                "        20: astore_3",
                "        21: aload_3",
                "        22: areturn",
                "      LineNumberTable:",
                "        line 838: 0",
                "        line 839: 8",
                "        line 840: 12",
                "        line 843: 21",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      23     0  this   Ljava/util/Map;",
                "            0      23     1   key   Ljava/lang/Object;",
                "            0      23     2 value   Ljava/lang/Object;",
                "            8      15     3     v   Ljava/lang/Object;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      23     0  this   Ljava/util/Map<TK;TV;>;",
                "            0      23     1   key   TK;",
                "            0      23     2 value   TV;",
                "            8      15     3     v   TV;",
                "      StackMapTable: number_of_entries = 1",
                "        frame_type = 252 /* append */",
                "          offset_delta = 21",
                "          locals = [ class java/lang/Object ]",
                "    Signature: #125                         // (TK;TV;)TV;"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x4e, name = "astore_3")
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0x9a, name = "ifne")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xc7, name = "ifnonnull")
    @Test
    public void test_19() {
        expectedConsecutiveLines = List.of(
                "  public default boolean remove(java.lang.Object, java.lang.Object);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)Z",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=4, args_size=3",
                "         0: aload_0",
                "         1: aload_1",
                "         2: invokeinterface #1,  2            // InterfaceMethod get:(Ljava/lang/Object;)Ljava/lang/Object;",
                "         7: astore_3",
                "         8: aload_3",
                "         9: aload_2",
                "        10: invokestatic  #70                 // Method java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z",
                "        13: ifeq          30",
                "        16: aload_3",
                "        17: ifnonnull     32",
                "        20: aload_0",
                "        21: aload_1",
                "        22: invokeinterface #7,  2            // InterfaceMethod containsKey:(Ljava/lang/Object;)Z",
                "        27: ifne          32",
                "        30: iconst_0",
                "        31: ireturn",
                "        32: aload_0",
                "        33: aload_1",
                "        34: invokeinterface #74,  2           // InterfaceMethod remove:(Ljava/lang/Object;)Ljava/lang/Object;",
                "        39: pop",
                "        40: iconst_1",
                "        41: ireturn",
                "      LineNumberTable:",
                "        line 881: 0",
                "        line 882: 8",
                "        line 883: 22",
                "        line 884: 30",
                "        line 886: 32",
                "        line 887: 40",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      42     0  this   Ljava/util/Map;",
                "            0      42     1   key   Ljava/lang/Object;",
                "            0      42     2 value   Ljava/lang/Object;",
                "            8      34     3 curValue   Ljava/lang/Object;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      42     0  this   Ljava/util/Map<TK;TV;>;",
                "      StackMapTable: number_of_entries = 2",
                "        frame_type = 252 /* append */",
                "          offset_delta = 30",
                "          locals = [ class java/lang/Object ]",
                "        frame_type = 1 /* same */"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x19, name = "aload")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x3a, name = "astore")
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0x9a, name = "ifne")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xc7, name = "ifnonnull")
    @Test
    public void test_20() {
        expectedConsecutiveLines = List.of(
                "  public default boolean replace(K, V, V);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=5, args_size=4",
                "         0: aload_0",
                "         1: aload_1",
                "         2: invokeinterface #1,  2            // InterfaceMethod get:(Ljava/lang/Object;)Ljava/lang/Object;",
                "         7: astore        4",
                "         9: aload         4",
                "        11: aload_2",
                "        12: invokestatic  #70                 // Method java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z",
                "        15: ifeq          33",
                "        18: aload         4",
                "        20: ifnonnull     35",
                "        23: aload_0",
                "        24: aload_1",
                "        25: invokeinterface #7,  2            // InterfaceMethod containsKey:(Ljava/lang/Object;)Z",
                "        30: ifne          35",
                "        33: iconst_0",
                "        34: ireturn",
                "        35: aload_0",
                "        36: aload_1",
                "        37: aload_3",
                "        38: invokeinterface #67,  3           // InterfaceMethod put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
                "        43: pop",
                "        44: iconst_1",
                "        45: ireturn",
                "      LineNumberTable:",
                "        line 931: 0",
                "        line 932: 9",
                "        line 933: 25",
                "        line 934: 33",
                "        line 936: 35",
                "        line 937: 44",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      46     0  this   Ljava/util/Map;",
                "            0      46     1   key   Ljava/lang/Object;",
                "            0      46     2 oldValue   Ljava/lang/Object;",
                "            0      46     3 newValue   Ljava/lang/Object;",
                "            9      37     4 curValue   Ljava/lang/Object;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      46     0  this   Ljava/util/Map<TK;TV;>;",
                "            0      46     1   key   TK;",
                "            0      46     2 oldValue   TV;",
                "            0      46     3 newValue   TV;",
                "      StackMapTable: number_of_entries = 2",
                "        frame_type = 252 /* append */",
                "          offset_delta = 33",
                "          locals = [ class java/lang/Object ]",
                "        frame_type = 1 /* same */",
                "    Signature: #179                         // (TK;TV;TV;)Z"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x4e, name = "astore_3")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xc7, name = "ifnonnull")
    @Test
    public void test_21() {
        expectedConsecutiveLines = List.of(
                "  public default V replace(K, V);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=4, args_size=3",
                "         0: aload_0",
                "         1: aload_1",
                "         2: invokeinterface #1,  2            // InterfaceMethod get:(Ljava/lang/Object;)Ljava/lang/Object;",
                "         7: dup",
                "         8: astore_3",
                "         9: ifnonnull     22",
                "        12: aload_0",
                "        13: aload_1",
                "        14: invokeinterface #7,  2            // InterfaceMethod containsKey:(Ljava/lang/Object;)Z",
                "        19: ifeq          31",
                "        22: aload_0",
                "        23: aload_1",
                "        24: aload_2",
                "        25: invokeinterface #67,  3           // InterfaceMethod put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
                "        30: astore_3",
                "        31: aload_3",
                "        32: areturn",
                "      LineNumberTable:",
                "        line 980: 0",
                "        line 981: 22",
                "        line 983: 31",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      33     0  this   Ljava/util/Map;",
                "            0      33     1   key   Ljava/lang/Object;",
                "            0      33     2 value   Ljava/lang/Object;",
                "            9      24     3 curValue   Ljava/lang/Object;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      33     0  this   Ljava/util/Map<TK;TV;>;",
                "            0      33     1   key   TK;",
                "            0      33     2 value   TV;",
                "            9      24     3 curValue   TV;",
                "      StackMapTable: number_of_entries = 2",
                "        frame_type = 252 /* append */",
                "          offset_delta = 22",
                "          locals = [ class java/lang/Object ]",
                "        frame_type = 8 /* same */",
                "    Signature: #125                         // (TK;TV;)TV;"
        );
    }

    @Instruction(value = 0x19, name = "aload")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x3a, name = "astore")
    @Instruction(value = 0x4e, name = "astore_3")
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xc6, name = "ifnull")
    @Instruction(value = 0xc7, name = "ifnonnull")
    @Test
    public void test_22() {
        expectedConsecutiveLines = List.of(
                "  public default V computeIfAbsent(K, java.util.function.Function<? super K, ? extends V>);",
                "    descriptor: (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=5, args_size=3",
                "         0: aload_2",
                "         1: invokestatic  #11                 // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "         4: pop",
                "         5: aload_0",
                "         6: aload_1",
                "         7: invokeinterface #1,  2            // InterfaceMethod get:(Ljava/lang/Object;)Ljava/lang/Object;",
                "        12: dup",
                "        13: astore_3",
                "        14: ifnonnull     43",
                "        17: aload_2",
                "        18: aload_1",
                "        19: invokeinterface #77,  2           // InterfaceMethod java/util/function/Function.apply:(Ljava/lang/Object;)Ljava/lang/Object;",
                "        24: dup",
                "        25: astore        4",
                "        27: ifnull        43",
                "        30: aload_0",
                "        31: aload_1",
                "        32: aload         4",
                "        34: invokeinterface #67,  3           // InterfaceMethod put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
                "        39: pop",
                "        40: aload         4",
                "        42: areturn",
                "        43: aload_3",
                "        44: areturn",
                "      LineNumberTable:",
                "        line 1062: 0",
                "        line 1064: 5",
                "        line 1066: 17",
                "        line 1067: 30",
                "        line 1068: 40",
                "        line 1072: 43",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "           27      16     4 newValue   Ljava/lang/Object;",
                "            0      45     0  this   Ljava/util/Map;",
                "            0      45     1   key   Ljava/lang/Object;",
                "            0      45     2 mappingFunction   Ljava/util/function/Function;",
                "           14      31     3     v   Ljava/lang/Object;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "           27      16     4 newValue   TV;",
                "            0      45     0  this   Ljava/util/Map<TK;TV;>;",
                "            0      45     1   key   TK;",
                "            0      45     2 mappingFunction   Ljava/util/function/Function<-TK;+TV;>;",
                "           14      31     3     v   TV;",
                "      StackMapTable: number_of_entries = 1",
                "        frame_type = 252 /* append */",
                "          offset_delta = 43",
                "          locals = [ class java/lang/Object ]",
                "    Signature: #185                         // (TK;Ljava/util/function/Function<-TK;+TV;>;)TV;"
        );
    }

    @Instruction(value = 0x01, name = "aconst_null")
    @Instruction(value = 0x19, name = "aload")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x3a, name = "astore")
    @Instruction(value = 0x4e, name = "astore_3")
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xc6, name = "ifnull")
    @Test
    public void test_23() {
        expectedConsecutiveLines = List.of(
                "  public default V computeIfPresent(K, java.util.function.BiFunction<? super K, ? super V, ? extends V>);",
                "    descriptor: (Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=5, args_size=3",
                "         0: aload_2",
                "         1: invokestatic  #11                 // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "         4: pop",
                "         5: aload_0",
                "         6: aload_1",
                "         7: invokeinterface #1,  2            // InterfaceMethod get:(Ljava/lang/Object;)Ljava/lang/Object;",
                "        12: dup",
                "        13: astore_3",
                "        14: ifnull        55",
                "        17: aload_2",
                "        18: aload_1",
                "        19: aload_3",
                "        20: invokeinterface #58,  3           // InterfaceMethod java/util/function/BiFunction.apply:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
                "        25: astore        4",
                "        27: aload         4",
                "        29: ifnull        45",
                "        32: aload_0",
                "        33: aload_1",
                "        34: aload         4",
                "        36: invokeinterface #67,  3           // InterfaceMethod put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
                "        41: pop",
                "        42: aload         4",
                "        44: areturn",
                "        45: aload_0",
                "        46: aload_1",
                "        47: invokeinterface #74,  2           // InterfaceMethod remove:(Ljava/lang/Object;)Ljava/lang/Object;",
                "        52: pop",
                "        53: aconst_null",
                "        54: areturn",
                "        55: aconst_null",
                "        56: areturn",
                "      LineNumberTable:",
                "        line 1139: 0",
                "        line 1141: 5",
                "        line 1142: 17",
                "        line 1143: 27",
                "        line 1144: 32",
                "        line 1145: 42",
                "        line 1147: 45",
                "        line 1148: 53",
                "        line 1151: 55",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "           27      28     4 newValue   Ljava/lang/Object;",
                "            0      57     0  this   Ljava/util/Map;",
                "            0      57     1   key   Ljava/lang/Object;",
                "            0      57     2 remappingFunction   Ljava/util/function/BiFunction;",
                "           14      43     3 oldValue   Ljava/lang/Object;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "           27      28     4 newValue   TV;",
                "            0      57     0  this   Ljava/util/Map<TK;TV;>;",
                "            0      57     1   key   TK;",
                "            0      57     2 remappingFunction   Ljava/util/function/BiFunction<-TK;-TV;+TV;>;",
                "           14      43     3 oldValue   TV;",
                "      StackMapTable: number_of_entries = 2",
                "        frame_type = 253 /* append */",
                "          offset_delta = 45",
                "          locals = [ class java/lang/Object, class java/lang/Object ]",
                "        frame_type = 250 /* chop */",
                "          offset_delta = 9",
                "    Signature: #189                         // (TK;Ljava/util/function/BiFunction<-TK;-TV;+TV;>;)TV;"
        );
    }

    @Instruction(value = 0x01, name = "aconst_null")
    @Instruction(value = 0x19, name = "aload")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x3a, name = "astore")
    @Instruction(value = 0x4e, name = "astore_3")
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xc7, name = "ifnonnull")
    @Test
    public void test_24() {
        expectedConsecutiveLines = List.of(
                "  public default V compute(K, java.util.function.BiFunction<? super K, ? super V, ? extends V>);",
                "    descriptor: (Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=5, args_size=3",
                "         0: aload_2",
                "         1: invokestatic  #11                 // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "         4: pop",
                "         5: aload_0",
                "         6: aload_1",
                "         7: invokeinterface #1,  2            // InterfaceMethod get:(Ljava/lang/Object;)Ljava/lang/Object;",
                "        12: astore_3",
                "        13: aload_2",
                "        14: aload_1",
                "        15: aload_3",
                "        16: invokeinterface #58,  3           // InterfaceMethod java/util/function/BiFunction.apply:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
                "        21: astore        4",
                "        23: aload         4",
                "        25: ifnonnull     54",
                "        28: aload_3",
                "        29: ifnonnull     42",
                "        32: aload_0",
                "        33: aload_1",
                "        34: invokeinterface #7,  2            // InterfaceMethod containsKey:(Ljava/lang/Object;)Z",
                "        39: ifeq          52",
                "        42: aload_0",
                "        43: aload_1",
                "        44: invokeinterface #74,  2           // InterfaceMethod remove:(Ljava/lang/Object;)Ljava/lang/Object;",
                "        49: pop",
                "        50: aconst_null",
                "        51: areturn",
                "        52: aconst_null",
                "        53: areturn",
                "        54: aload_0",
                "        55: aload_1",
                "        56: aload         4",
                "        58: invokeinterface #67,  3           // InterfaceMethod put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
                "        63: pop",
                "        64: aload         4",
                "        66: areturn",
                "      LineNumberTable:",
                "        line 1225: 0",
                "        line 1226: 5",
                "        line 1228: 13",
                "        line 1229: 23",
                "        line 1231: 28",
                "        line 1233: 42",
                "        line 1234: 50",
                "        line 1237: 52",
                "        line 1241: 54",
                "        line 1242: 64",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      67     0  this   Ljava/util/Map;",
                "            0      67     1   key   Ljava/lang/Object;",
                "            0      67     2 remappingFunction   Ljava/util/function/BiFunction;",
                "           13      54     3 oldValue   Ljava/lang/Object;",
                "           23      44     4 newValue   Ljava/lang/Object;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      67     0  this   Ljava/util/Map<TK;TV;>;",
                "            0      67     1   key   TK;",
                "            0      67     2 remappingFunction   Ljava/util/function/BiFunction<-TK;-TV;+TV;>;",
                "           13      54     3 oldValue   TV;",
                "           23      44     4 newValue   TV;",
                "      StackMapTable: number_of_entries = 3",
                "        frame_type = 253 /* append */",
                "          offset_delta = 42",
                "          locals = [ class java/lang/Object, class java/lang/Object ]",
                "        frame_type = 9 /* same */",
                "        frame_type = 1 /* same */",
                "    Signature: #189                         // (TK;Ljava/util/function/BiFunction<-TK;-TV;+TV;>;)TV;"
        );
    }

    @Instruction(value = 0x19, name = "aload")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x3a, name = "astore")
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xc7, name = "ifnonnull")
    @Test
    public void test_25() {
        expectedConsecutiveLines = List.of(
                "  public default V merge(K, V, java.util.function.BiFunction<? super V, ? super V, ? extends V>);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=6, args_size=4",
                "         0: aload_3",
                "         1: invokestatic  #11                 // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "         4: pop",
                "         5: aload_2",
                "         6: invokestatic  #11                 // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "         9: pop",
                "        10: aload_0",
                "        11: aload_1",
                "        12: invokeinterface #1,  2            // InterfaceMethod get:(Ljava/lang/Object;)Ljava/lang/Object;",
                "        17: astore        4",
                "        19: aload         4",
                "        21: ifnonnull     28",
                "        24: aload_2",
                "        25: goto          37",
                "        28: aload_3",
                "        29: aload         4",
                "        31: aload_2",
                "        32: invokeinterface #58,  3           // InterfaceMethod java/util/function/BiFunction.apply:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
                "        37: astore        5",
                "        39: aload         5",
                "        41: ifnonnull     55",
                "        44: aload_0",
                "        45: aload_1",
                "        46: invokeinterface #74,  2           // InterfaceMethod remove:(Ljava/lang/Object;)Ljava/lang/Object;",
                "        51: pop",
                "        52: goto          65",
                "        55: aload_0",
                "        56: aload_1",
                "        57: aload         5",
                "        59: invokeinterface #67,  3           // InterfaceMethod put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
                "        64: pop",
                "        65: aload         5",
                "        67: areturn",
                "      LineNumberTable:",
                "        line 1323: 0",
                "        line 1324: 5",
                "        line 1325: 10",
                "        line 1326: 19",
                "        line 1327: 28",
                "        line 1328: 39",
                "        line 1329: 44",
                "        line 1331: 55",
                "        line 1333: 65",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      68     0  this   Ljava/util/Map;",
                "            0      68     1   key   Ljava/lang/Object;",
                "            0      68     2 value   Ljava/lang/Object;",
                "            0      68     3 remappingFunction   Ljava/util/function/BiFunction;",
                "           19      49     4 oldValue   Ljava/lang/Object;",
                "           39      29     5 newValue   Ljava/lang/Object;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      68     0  this   Ljava/util/Map<TK;TV;>;",
                "            0      68     1   key   TK;",
                "            0      68     2 value   TV;",
                "            0      68     3 remappingFunction   Ljava/util/function/BiFunction<-TV;-TV;+TV;>;",
                "           19      49     4 oldValue   TV;",
                "           39      29     5 newValue   TV;",
                "      StackMapTable: number_of_entries = 4",
                "        frame_type = 252 /* append */",
                "          offset_delta = 28",
                "          locals = [ class java/lang/Object ]",
                "        frame_type = 72 /* same_locals_1_stack_item */",
                "          stack = [ class java/lang/Object ]",
                "        frame_type = 252 /* append */",
                "          offset_delta = 17",
                "          locals = [ class java/lang/Object ]",
                "        frame_type = 9 /* same */",
                "    Signature: #194                         // (TK;TV;Ljava/util/function/BiFunction<-TV;-TV;+TV;>;)TV;"
        );
    }

    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb2, name = "getstatic")
    @Test
    public void test_26() {
        expectedConsecutiveLines = List.of(
                "  public static <K extends java.lang.Object, V extends java.lang.Object> java.util.Map<K, V> of();",
                "    descriptor: ()Ljava/util/Map;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=1, locals=0, args_size=0",
                "         0: getstatic     #81                 // Field java/util/ImmutableCollections.EMPTY_MAP:Ljava/util/ImmutableCollections$MapN;",
                "         3: areturn",
                "      LineNumberTable:",
                "        line 1348: 0",
                "    Signature: #195                         // <K:Ljava/lang/Object;V:Ljava/lang/Object;>()Ljava/util/Map<TK;TV;>;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xbb, name = "new")
    @Test
    public void test_27() {
        expectedConsecutiveLines = List.of(
                "  public static <K extends java.lang.Object, V extends java.lang.Object> java.util.Map<K, V> of(K, V);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=2, args_size=2",
                "         0: new           #87                 // class java/util/ImmutableCollections$Map1",
                "         3: dup",
                "         4: aload_0",
                "         5: aload_1",
                "         6: invokespecial #89                 // Method java/util/ImmutableCollections$Map1.\"<init>\":(Ljava/lang/Object;Ljava/lang/Object;)V",
                "         9: areturn",
                "      LineNumberTable:",
                "        line 1365: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      10     0    k1   Ljava/lang/Object;",
                "            0      10     1    v1   Ljava/lang/Object;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      10     0    k1   TK;",
                "            0      10     1    v1   TV;",
                "    Signature: #199                         // <K:Ljava/lang/Object;V:Ljava/lang/Object;>(TK;TV;)Ljava/util/Map<TK;TV;>;"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x05, name = "iconst_2")
    @Instruction(value = 0x06, name = "iconst_3")
    @Instruction(value = 0x07, name = "iconst_4")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x53, name = "aastore")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbd, name = "anewarray")
    @Test
    public void test_28() {
        expectedConsecutiveLines = List.of(
                "  public static <K extends java.lang.Object, V extends java.lang.Object> java.util.Map<K, V> of(K, V, K, V);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=6, locals=4, args_size=4",
                "         0: new           #91                 // class java/util/ImmutableCollections$MapN",
                "         3: dup",
                "         4: iconst_4",
                "         5: anewarray     #93                 // class java/lang/Object",
                "         8: dup",
                "         9: iconst_0",
                "        10: aload_0",
                "        11: aastore",
                "        12: dup",
                "        13: iconst_1",
                "        14: aload_1",
                "        15: aastore",
                "        16: dup",
                "        17: iconst_2",
                "        18: aload_2",
                "        19: aastore",
                "        20: dup",
                "        21: iconst_3",
                "        22: aload_3",
                "        23: aastore",
                "        24: invokespecial #95                 // Method java/util/ImmutableCollections$MapN.\"<init>\":([Ljava/lang/Object;)V",
                "        27: areturn",
                "      LineNumberTable:",
                "        line 1385: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      28     0    k1   Ljava/lang/Object;",
                "            0      28     1    v1   Ljava/lang/Object;",
                "            0      28     2    k2   Ljava/lang/Object;",
                "            0      28     3    v2   Ljava/lang/Object;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      28     0    k1   TK;",
                "            0      28     1    v1   TV;",
                "            0      28     2    k2   TK;",
                "            0      28     3    v2   TV;",
                "    Signature: #203                         // <K:Ljava/lang/Object;V:Ljava/lang/Object;>(TK;TV;TK;TV;)Ljava/util/Map<TK;TV;>;"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x05, name = "iconst_2")
    @Instruction(value = 0x06, name = "iconst_3")
    @Instruction(value = 0x07, name = "iconst_4")
    @Instruction(value = 0x08, name = "iconst_5")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x19, name = "aload")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x53, name = "aastore")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbd, name = "anewarray")
    @Test
    public void test_29() {
        expectedConsecutiveLines = List.of(
                "  public static <K extends java.lang.Object, V extends java.lang.Object> java.util.Map<K, V> of(K, V, K, V, K, V);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=6, locals=6, args_size=6",
                "         0: new           #91                 // class java/util/ImmutableCollections$MapN",
                "         3: dup",
                "         4: bipush        6",
                "         6: anewarray     #93                 // class java/lang/Object",
                "         9: dup",
                "        10: iconst_0",
                "        11: aload_0",
                "        12: aastore",
                "        13: dup",
                "        14: iconst_1",
                "        15: aload_1",
                "        16: aastore",
                "        17: dup",
                "        18: iconst_2",
                "        19: aload_2",
                "        20: aastore",
                "        21: dup",
                "        22: iconst_3",
                "        23: aload_3",
                "        24: aastore",
                "        25: dup",
                "        26: iconst_4",
                "        27: aload         4",
                "        29: aastore",
                "        30: dup",
                "        31: iconst_5",
                "        32: aload         5",
                "        34: aastore",
                "        35: invokespecial #95                 // Method java/util/ImmutableCollections$MapN.\"<init>\":([Ljava/lang/Object;)V",
                "        38: areturn",
                "      LineNumberTable:",
                "        line 1407: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      39     0    k1   Ljava/lang/Object;",
                "            0      39     1    v1   Ljava/lang/Object;",
                "            0      39     2    k2   Ljava/lang/Object;",
                "            0      39     3    v2   Ljava/lang/Object;",
                "            0      39     4    k3   Ljava/lang/Object;",
                "            0      39     5    v3   Ljava/lang/Object;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      39     0    k1   TK;",
                "            0      39     1    v1   TV;",
                "            0      39     2    k2   TK;",
                "            0      39     3    v2   TV;",
                "            0      39     4    k3   TK;",
                "            0      39     5    v3   TV;",
                "    Signature: #207                         // <K:Ljava/lang/Object;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;)Ljava/util/Map<TK;TV;>;"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x05, name = "iconst_2")
    @Instruction(value = 0x06, name = "iconst_3")
    @Instruction(value = 0x07, name = "iconst_4")
    @Instruction(value = 0x08, name = "iconst_5")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x19, name = "aload")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x53, name = "aastore")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbd, name = "anewarray")
    @Test
    public void test_30() {
        expectedConsecutiveLines = List.of(
                "  public static <K extends java.lang.Object, V extends java.lang.Object> java.util.Map<K, V> of(K, V, K, V, K, V, K, V);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=6, locals=8, args_size=8",
                "         0: new           #91                 // class java/util/ImmutableCollections$MapN",
                "         3: dup",
                "         4: bipush        8",
                "         6: anewarray     #93                 // class java/lang/Object",
                "         9: dup",
                "        10: iconst_0",
                "        11: aload_0",
                "        12: aastore",
                "        13: dup",
                "        14: iconst_1",
                "        15: aload_1",
                "        16: aastore",
                "        17: dup",
                "        18: iconst_2",
                "        19: aload_2",
                "        20: aastore",
                "        21: dup",
                "        22: iconst_3",
                "        23: aload_3",
                "        24: aastore",
                "        25: dup",
                "        26: iconst_4",
                "        27: aload         4",
                "        29: aastore",
                "        30: dup",
                "        31: iconst_5",
                "        32: aload         5",
                "        34: aastore",
                "        35: dup",
                "        36: bipush        6",
                "        38: aload         6",
                "        40: aastore",
                "        41: dup",
                "        42: bipush        7",
                "        44: aload         7",
                "        46: aastore",
                "        47: invokespecial #95                 // Method java/util/ImmutableCollections$MapN.\"<init>\":([Ljava/lang/Object;)V",
                "        50: areturn",
                "      LineNumberTable:",
                "        line 1431: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      51     0    k1   Ljava/lang/Object;",
                "            0      51     1    v1   Ljava/lang/Object;",
                "            0      51     2    k2   Ljava/lang/Object;",
                "            0      51     3    v2   Ljava/lang/Object;",
                "            0      51     4    k3   Ljava/lang/Object;",
                "            0      51     5    v3   Ljava/lang/Object;",
                "            0      51     6    k4   Ljava/lang/Object;",
                "            0      51     7    v4   Ljava/lang/Object;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      51     0    k1   TK;",
                "            0      51     1    v1   TV;",
                "            0      51     2    k2   TK;",
                "            0      51     3    v2   TV;",
                "            0      51     4    k3   TK;",
                "            0      51     5    v3   TV;",
                "            0      51     6    k4   TK;",
                "            0      51     7    v4   TV;",
                "    Signature: #211                         // <K:Ljava/lang/Object;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;)Ljava/util/Map<TK;TV;>;"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x05, name = "iconst_2")
    @Instruction(value = 0x06, name = "iconst_3")
    @Instruction(value = 0x07, name = "iconst_4")
    @Instruction(value = 0x08, name = "iconst_5")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x19, name = "aload")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x53, name = "aastore")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbd, name = "anewarray")
    @Test
    public void test_31() {
        expectedConsecutiveLines = List.of(
                "  public static <K extends java.lang.Object, V extends java.lang.Object> java.util.Map<K, V> of(K, V, K, V, K, V, K, V, K, V);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=6, locals=10, args_size=10",
                "         0: new           #91                 // class java/util/ImmutableCollections$MapN",
                "         3: dup",
                "         4: bipush        10",
                "         6: anewarray     #93                 // class java/lang/Object",
                "         9: dup",
                "        10: iconst_0",
                "        11: aload_0",
                "        12: aastore",
                "        13: dup",
                "        14: iconst_1",
                "        15: aload_1",
                "        16: aastore",
                "        17: dup",
                "        18: iconst_2",
                "        19: aload_2",
                "        20: aastore",
                "        21: dup",
                "        22: iconst_3",
                "        23: aload_3",
                "        24: aastore",
                "        25: dup",
                "        26: iconst_4",
                "        27: aload         4",
                "        29: aastore",
                "        30: dup",
                "        31: iconst_5",
                "        32: aload         5",
                "        34: aastore",
                "        35: dup",
                "        36: bipush        6",
                "        38: aload         6",
                "        40: aastore",
                "        41: dup",
                "        42: bipush        7",
                "        44: aload         7",
                "        46: aastore",
                "        47: dup",
                "        48: bipush        8",
                "        50: aload         8",
                "        52: aastore",
                "        53: dup",
                "        54: bipush        9",
                "        56: aload         9",
                "        58: aastore",
                "        59: invokespecial #95                 // Method java/util/ImmutableCollections$MapN.\"<init>\":([Ljava/lang/Object;)V",
                "        62: areturn",
                "      LineNumberTable:",
                "        line 1457: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      63     0    k1   Ljava/lang/Object;",
                "            0      63     1    v1   Ljava/lang/Object;",
                "            0      63     2    k2   Ljava/lang/Object;",
                "            0      63     3    v2   Ljava/lang/Object;",
                "            0      63     4    k3   Ljava/lang/Object;",
                "            0      63     5    v3   Ljava/lang/Object;",
                "            0      63     6    k4   Ljava/lang/Object;",
                "            0      63     7    v4   Ljava/lang/Object;",
                "            0      63     8    k5   Ljava/lang/Object;",
                "            0      63     9    v5   Ljava/lang/Object;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      63     0    k1   TK;",
                "            0      63     1    v1   TV;",
                "            0      63     2    k2   TK;",
                "            0      63     3    v2   TV;",
                "            0      63     4    k3   TK;",
                "            0      63     5    v3   TV;",
                "            0      63     6    k4   TK;",
                "            0      63     7    v4   TV;",
                "            0      63     8    k5   TK;",
                "            0      63     9    v5   TV;",
                "    Signature: #215                         // <K:Ljava/lang/Object;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Ljava/util/Map<TK;TV;>;"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x05, name = "iconst_2")
    @Instruction(value = 0x06, name = "iconst_3")
    @Instruction(value = 0x07, name = "iconst_4")
    @Instruction(value = 0x08, name = "iconst_5")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x19, name = "aload")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x53, name = "aastore")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbd, name = "anewarray")
    @Test
    public void test_32() {
        expectedConsecutiveLines = List.of(
                "  public static <K extends java.lang.Object, V extends java.lang.Object> java.util.Map<K, V> of(K, V, K, V, K, V, K, V, K, V, K, V);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=6, locals=12, args_size=12",
                "         0: new           #91                 // class java/util/ImmutableCollections$MapN",
                "         3: dup",
                "         4: bipush        12",
                "         6: anewarray     #93                 // class java/lang/Object",
                "         9: dup",
                "        10: iconst_0",
                "        11: aload_0",
                "        12: aastore",
                "        13: dup",
                "        14: iconst_1",
                "        15: aload_1",
                "        16: aastore",
                "        17: dup",
                "        18: iconst_2",
                "        19: aload_2",
                "        20: aastore",
                "        21: dup",
                "        22: iconst_3",
                "        23: aload_3",
                "        24: aastore",
                "        25: dup",
                "        26: iconst_4",
                "        27: aload         4",
                "        29: aastore",
                "        30: dup",
                "        31: iconst_5",
                "        32: aload         5",
                "        34: aastore",
                "        35: dup",
                "        36: bipush        6",
                "        38: aload         6",
                "        40: aastore",
                "        41: dup",
                "        42: bipush        7",
                "        44: aload         7",
                "        46: aastore",
                "        47: dup",
                "        48: bipush        8",
                "        50: aload         8",
                "        52: aastore",
                "        53: dup",
                "        54: bipush        9",
                "        56: aload         9",
                "        58: aastore",
                "        59: dup",
                "        60: bipush        10",
                "        62: aload         10",
                "        64: aastore",
                "        65: dup",
                "        66: bipush        11",
                "        68: aload         11",
                "        70: aastore",
                "        71: invokespecial #95                 // Method java/util/ImmutableCollections$MapN.\"<init>\":([Ljava/lang/Object;)V",
                "        74: areturn",
                "      LineNumberTable:",
                "        line 1486: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      75     0    k1   Ljava/lang/Object;",
                "            0      75     1    v1   Ljava/lang/Object;",
                "            0      75     2    k2   Ljava/lang/Object;",
                "            0      75     3    v2   Ljava/lang/Object;",
                "            0      75     4    k3   Ljava/lang/Object;",
                "            0      75     5    v3   Ljava/lang/Object;",
                "            0      75     6    k4   Ljava/lang/Object;",
                "            0      75     7    v4   Ljava/lang/Object;",
                "            0      75     8    k5   Ljava/lang/Object;",
                "            0      75     9    v5   Ljava/lang/Object;",
                "            0      75    10    k6   Ljava/lang/Object;",
                "            0      75    11    v6   Ljava/lang/Object;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      75     0    k1   TK;",
                "            0      75     1    v1   TV;",
                "            0      75     2    k2   TK;",
                "            0      75     3    v2   TV;",
                "            0      75     4    k3   TK;",
                "            0      75     5    v3   TV;",
                "            0      75     6    k4   TK;",
                "            0      75     7    v4   TV;",
                "            0      75     8    k5   TK;",
                "            0      75     9    v5   TV;",
                "            0      75    10    k6   TK;",
                "            0      75    11    v6   TV;",
                "    Signature: #219                         // <K:Ljava/lang/Object;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Ljava/util/Map<TK;TV;>;"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x05, name = "iconst_2")
    @Instruction(value = 0x06, name = "iconst_3")
    @Instruction(value = 0x07, name = "iconst_4")
    @Instruction(value = 0x08, name = "iconst_5")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x19, name = "aload")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x53, name = "aastore")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbd, name = "anewarray")
    @Test
    public void test_33() {
        expectedConsecutiveLines = List.of(
                "  public static <K extends java.lang.Object, V extends java.lang.Object> java.util.Map<K, V> of(K, V, K, V, K, V, K, V, K, V, K, V, K, V);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=6, locals=14, args_size=14",
                "         0: new           #91                 // class java/util/ImmutableCollections$MapN",
                "         3: dup",
                "         4: bipush        14",
                "         6: anewarray     #93                 // class java/lang/Object",
                "         9: dup",
                "        10: iconst_0",
                "        11: aload_0",
                "        12: aastore",
                "        13: dup",
                "        14: iconst_1",
                "        15: aload_1",
                "        16: aastore",
                "        17: dup",
                "        18: iconst_2",
                "        19: aload_2",
                "        20: aastore",
                "        21: dup",
                "        22: iconst_3",
                "        23: aload_3",
                "        24: aastore",
                "        25: dup",
                "        26: iconst_4",
                "        27: aload         4",
                "        29: aastore",
                "        30: dup",
                "        31: iconst_5",
                "        32: aload         5",
                "        34: aastore",
                "        35: dup",
                "        36: bipush        6",
                "        38: aload         6",
                "        40: aastore",
                "        41: dup",
                "        42: bipush        7",
                "        44: aload         7",
                "        46: aastore",
                "        47: dup",
                "        48: bipush        8",
                "        50: aload         8",
                "        52: aastore",
                "        53: dup",
                "        54: bipush        9",
                "        56: aload         9",
                "        58: aastore",
                "        59: dup",
                "        60: bipush        10",
                "        62: aload         10",
                "        64: aastore",
                "        65: dup",
                "        66: bipush        11",
                "        68: aload         11",
                "        70: aastore",
                "        71: dup",
                "        72: bipush        12",
                "        74: aload         12",
                "        76: aastore",
                "        77: dup",
                "        78: bipush        13",
                "        80: aload         13",
                "        82: aastore",
                "        83: invokespecial #95                 // Method java/util/ImmutableCollections$MapN.\"<init>\":([Ljava/lang/Object;)V",
                "        86: areturn",
                "      LineNumberTable:",
                "        line 1518: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      87     0    k1   Ljava/lang/Object;",
                "            0      87     1    v1   Ljava/lang/Object;",
                "            0      87     2    k2   Ljava/lang/Object;",
                "            0      87     3    v2   Ljava/lang/Object;",
                "            0      87     4    k3   Ljava/lang/Object;",
                "            0      87     5    v3   Ljava/lang/Object;",
                "            0      87     6    k4   Ljava/lang/Object;",
                "            0      87     7    v4   Ljava/lang/Object;",
                "            0      87     8    k5   Ljava/lang/Object;",
                "            0      87     9    v5   Ljava/lang/Object;",
                "            0      87    10    k6   Ljava/lang/Object;",
                "            0      87    11    v6   Ljava/lang/Object;",
                "            0      87    12    k7   Ljava/lang/Object;",
                "            0      87    13    v7   Ljava/lang/Object;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      87     0    k1   TK;",
                "            0      87     1    v1   TV;",
                "            0      87     2    k2   TK;",
                "            0      87     3    v2   TV;",
                "            0      87     4    k3   TK;",
                "            0      87     5    v3   TV;",
                "            0      87     6    k4   TK;",
                "            0      87     7    v4   TV;",
                "            0      87     8    k5   TK;",
                "            0      87     9    v5   TV;",
                "            0      87    10    k6   TK;",
                "            0      87    11    v6   TV;",
                "            0      87    12    k7   TK;",
                "            0      87    13    v7   TV;",
                "    Signature: #223                         // <K:Ljava/lang/Object;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Ljava/util/Map<TK;TV;>;"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x05, name = "iconst_2")
    @Instruction(value = 0x06, name = "iconst_3")
    @Instruction(value = 0x07, name = "iconst_4")
    @Instruction(value = 0x08, name = "iconst_5")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x19, name = "aload")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x53, name = "aastore")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbd, name = "anewarray")
    @Test
    public void test_34() {
        expectedConsecutiveLines = List.of(
                "  public static <K extends java.lang.Object, V extends java.lang.Object> java.util.Map<K, V> of(K, V, K, V, K, V, K, V, K, V, K, V, K, V, K, V);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=6, locals=16, args_size=16",
                "         0: new           #91                 // class java/util/ImmutableCollections$MapN",
                "         3: dup",
                "         4: bipush        16",
                "         6: anewarray     #93                 // class java/lang/Object",
                "         9: dup",
                "        10: iconst_0",
                "        11: aload_0",
                "        12: aastore",
                "        13: dup",
                "        14: iconst_1",
                "        15: aload_1",
                "        16: aastore",
                "        17: dup",
                "        18: iconst_2",
                "        19: aload_2",
                "        20: aastore",
                "        21: dup",
                "        22: iconst_3",
                "        23: aload_3",
                "        24: aastore",
                "        25: dup",
                "        26: iconst_4",
                "        27: aload         4",
                "        29: aastore",
                "        30: dup",
                "        31: iconst_5",
                "        32: aload         5",
                "        34: aastore",
                "        35: dup",
                "        36: bipush        6",
                "        38: aload         6",
                "        40: aastore",
                "        41: dup",
                "        42: bipush        7",
                "        44: aload         7",
                "        46: aastore",
                "        47: dup",
                "        48: bipush        8",
                "        50: aload         8",
                "        52: aastore",
                "        53: dup",
                "        54: bipush        9",
                "        56: aload         9",
                "        58: aastore",
                "        59: dup",
                "        60: bipush        10",
                "        62: aload         10",
                "        64: aastore",
                "        65: dup",
                "        66: bipush        11",
                "        68: aload         11",
                "        70: aastore",
                "        71: dup",
                "        72: bipush        12",
                "        74: aload         12",
                "        76: aastore",
                "        77: dup",
                "        78: bipush        13",
                "        80: aload         13",
                "        82: aastore",
                "        83: dup",
                "        84: bipush        14",
                "        86: aload         14",
                "        88: aastore",
                "        89: dup",
                "        90: bipush        15",
                "        92: aload         15",
                "        94: aastore",
                "        95: invokespecial #95                 // Method java/util/ImmutableCollections$MapN.\"<init>\":([Ljava/lang/Object;)V",
                "        98: areturn",
                "      LineNumberTable:",
                "        line 1552: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      99     0    k1   Ljava/lang/Object;",
                "            0      99     1    v1   Ljava/lang/Object;",
                "            0      99     2    k2   Ljava/lang/Object;",
                "            0      99     3    v2   Ljava/lang/Object;",
                "            0      99     4    k3   Ljava/lang/Object;",
                "            0      99     5    v3   Ljava/lang/Object;",
                "            0      99     6    k4   Ljava/lang/Object;",
                "            0      99     7    v4   Ljava/lang/Object;",
                "            0      99     8    k5   Ljava/lang/Object;",
                "            0      99     9    v5   Ljava/lang/Object;",
                "            0      99    10    k6   Ljava/lang/Object;",
                "            0      99    11    v6   Ljava/lang/Object;",
                "            0      99    12    k7   Ljava/lang/Object;",
                "            0      99    13    v7   Ljava/lang/Object;",
                "            0      99    14    k8   Ljava/lang/Object;",
                "            0      99    15    v8   Ljava/lang/Object;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      99     0    k1   TK;",
                "            0      99     1    v1   TV;",
                "            0      99     2    k2   TK;",
                "            0      99     3    v2   TV;",
                "            0      99     4    k3   TK;",
                "            0      99     5    v3   TV;",
                "            0      99     6    k4   TK;",
                "            0      99     7    v4   TV;",
                "            0      99     8    k5   TK;",
                "            0      99     9    v5   TV;",
                "            0      99    10    k6   TK;",
                "            0      99    11    v6   TV;",
                "            0      99    12    k7   TK;",
                "            0      99    13    v7   TV;",
                "            0      99    14    k8   TK;",
                "            0      99    15    v8   TV;",
                "    Signature: #227                         // <K:Ljava/lang/Object;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Ljava/util/Map<TK;TV;>;"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x05, name = "iconst_2")
    @Instruction(value = 0x06, name = "iconst_3")
    @Instruction(value = 0x07, name = "iconst_4")
    @Instruction(value = 0x08, name = "iconst_5")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x19, name = "aload")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x53, name = "aastore")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbd, name = "anewarray")
    @Test
    public void test_35() {
        expectedConsecutiveLines = List.of(
                "  public static <K extends java.lang.Object, V extends java.lang.Object> java.util.Map<K, V> of(K, V, K, V, K, V, K, V, K, V, K, V, K, V, K, V, K, V);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=6, locals=18, args_size=18",
                "         0: new           #91                 // class java/util/ImmutableCollections$MapN",
                "         3: dup",
                "         4: bipush        18",
                "         6: anewarray     #93                 // class java/lang/Object",
                "         9: dup",
                "        10: iconst_0",
                "        11: aload_0",
                "        12: aastore",
                "        13: dup",
                "        14: iconst_1",
                "        15: aload_1",
                "        16: aastore",
                "        17: dup",
                "        18: iconst_2",
                "        19: aload_2",
                "        20: aastore",
                "        21: dup",
                "        22: iconst_3",
                "        23: aload_3",
                "        24: aastore",
                "        25: dup",
                "        26: iconst_4",
                "        27: aload         4",
                "        29: aastore",
                "        30: dup",
                "        31: iconst_5",
                "        32: aload         5",
                "        34: aastore",
                "        35: dup",
                "        36: bipush        6",
                "        38: aload         6",
                "        40: aastore",
                "        41: dup",
                "        42: bipush        7",
                "        44: aload         7",
                "        46: aastore",
                "        47: dup",
                "        48: bipush        8",
                "        50: aload         8",
                "        52: aastore",
                "        53: dup",
                "        54: bipush        9",
                "        56: aload         9",
                "        58: aastore",
                "        59: dup",
                "        60: bipush        10",
                "        62: aload         10",
                "        64: aastore",
                "        65: dup",
                "        66: bipush        11",
                "        68: aload         11",
                "        70: aastore",
                "        71: dup",
                "        72: bipush        12",
                "        74: aload         12",
                "        76: aastore",
                "        77: dup",
                "        78: bipush        13",
                "        80: aload         13",
                "        82: aastore",
                "        83: dup",
                "        84: bipush        14",
                "        86: aload         14",
                "        88: aastore",
                "        89: dup",
                "        90: bipush        15",
                "        92: aload         15",
                "        94: aastore",
                "        95: dup",
                "        96: bipush        16",
                "        98: aload         16",
                "       100: aastore",
                "       101: dup",
                "       102: bipush        17",
                "       104: aload         17",
                "       106: aastore",
                "       107: invokespecial #95                 // Method java/util/ImmutableCollections$MapN.\"<init>\":([Ljava/lang/Object;)V",
                "       110: areturn",
                "      LineNumberTable:",
                "        line 1588: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0     111     0    k1   Ljava/lang/Object;",
                "            0     111     1    v1   Ljava/lang/Object;",
                "            0     111     2    k2   Ljava/lang/Object;",
                "            0     111     3    v2   Ljava/lang/Object;",
                "            0     111     4    k3   Ljava/lang/Object;",
                "            0     111     5    v3   Ljava/lang/Object;",
                "            0     111     6    k4   Ljava/lang/Object;",
                "            0     111     7    v4   Ljava/lang/Object;",
                "            0     111     8    k5   Ljava/lang/Object;",
                "            0     111     9    v5   Ljava/lang/Object;",
                "            0     111    10    k6   Ljava/lang/Object;",
                "            0     111    11    v6   Ljava/lang/Object;",
                "            0     111    12    k7   Ljava/lang/Object;",
                "            0     111    13    v7   Ljava/lang/Object;",
                "            0     111    14    k8   Ljava/lang/Object;",
                "            0     111    15    v8   Ljava/lang/Object;",
                "            0     111    16    k9   Ljava/lang/Object;",
                "            0     111    17    v9   Ljava/lang/Object;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0     111     0    k1   TK;",
                "            0     111     1    v1   TV;",
                "            0     111     2    k2   TK;",
                "            0     111     3    v2   TV;",
                "            0     111     4    k3   TK;",
                "            0     111     5    v3   TV;",
                "            0     111     6    k4   TK;",
                "            0     111     7    v4   TV;",
                "            0     111     8    k5   TK;",
                "            0     111     9    v5   TV;",
                "            0     111    10    k6   TK;",
                "            0     111    11    v6   TV;",
                "            0     111    12    k7   TK;",
                "            0     111    13    v7   TV;",
                "            0     111    14    k8   TK;",
                "            0     111    15    v8   TV;",
                "            0     111    16    k9   TK;",
                "            0     111    17    v9   TV;",
                "    Signature: #231                         // <K:Ljava/lang/Object;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Ljava/util/Map<TK;TV;>;"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x05, name = "iconst_2")
    @Instruction(value = 0x06, name = "iconst_3")
    @Instruction(value = 0x07, name = "iconst_4")
    @Instruction(value = 0x08, name = "iconst_5")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x19, name = "aload")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x53, name = "aastore")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbd, name = "anewarray")
    @Test
    public void test_36() {
        expectedConsecutiveLines = List.of(
                "  public static <K extends java.lang.Object, V extends java.lang.Object> java.util.Map<K, V> of(K, V, K, V, K, V, K, V, K, V, K, V, K, V, K, V, K, V, K, V);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=6, locals=20, args_size=20",
                "         0: new           #91                 // class java/util/ImmutableCollections$MapN",
                "         3: dup",
                "         4: bipush        20",
                "         6: anewarray     #93                 // class java/lang/Object",
                "         9: dup",
                "        10: iconst_0",
                "        11: aload_0",
                "        12: aastore",
                "        13: dup",
                "        14: iconst_1",
                "        15: aload_1",
                "        16: aastore",
                "        17: dup",
                "        18: iconst_2",
                "        19: aload_2",
                "        20: aastore",
                "        21: dup",
                "        22: iconst_3",
                "        23: aload_3",
                "        24: aastore",
                "        25: dup",
                "        26: iconst_4",
                "        27: aload         4",
                "        29: aastore",
                "        30: dup",
                "        31: iconst_5",
                "        32: aload         5",
                "        34: aastore",
                "        35: dup",
                "        36: bipush        6",
                "        38: aload         6",
                "        40: aastore",
                "        41: dup",
                "        42: bipush        7",
                "        44: aload         7",
                "        46: aastore",
                "        47: dup",
                "        48: bipush        8",
                "        50: aload         8",
                "        52: aastore",
                "        53: dup",
                "        54: bipush        9",
                "        56: aload         9",
                "        58: aastore",
                "        59: dup",
                "        60: bipush        10",
                "        62: aload         10",
                "        64: aastore",
                "        65: dup",
                "        66: bipush        11",
                "        68: aload         11",
                "        70: aastore",
                "        71: dup",
                "        72: bipush        12",
                "        74: aload         12",
                "        76: aastore",
                "        77: dup",
                "        78: bipush        13",
                "        80: aload         13",
                "        82: aastore",
                "        83: dup",
                "        84: bipush        14",
                "        86: aload         14",
                "        88: aastore",
                "        89: dup",
                "        90: bipush        15",
                "        92: aload         15",
                "        94: aastore",
                "        95: dup",
                "        96: bipush        16",
                "        98: aload         16",
                "       100: aastore",
                "       101: dup",
                "       102: bipush        17",
                "       104: aload         17",
                "       106: aastore",
                "       107: dup",
                "       108: bipush        18",
                "       110: aload         18",
                "       112: aastore",
                "       113: dup",
                "       114: bipush        19",
                "       116: aload         19",
                "       118: aastore",
                "       119: invokespecial #95                 // Method java/util/ImmutableCollections$MapN.\"<init>\":([Ljava/lang/Object;)V",
                "       122: areturn",
                "      LineNumberTable:",
                "        line 1626: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0     123     0    k1   Ljava/lang/Object;",
                "            0     123     1    v1   Ljava/lang/Object;",
                "            0     123     2    k2   Ljava/lang/Object;",
                "            0     123     3    v2   Ljava/lang/Object;",
                "            0     123     4    k3   Ljava/lang/Object;",
                "            0     123     5    v3   Ljava/lang/Object;",
                "            0     123     6    k4   Ljava/lang/Object;",
                "            0     123     7    v4   Ljava/lang/Object;",
                "            0     123     8    k5   Ljava/lang/Object;",
                "            0     123     9    v5   Ljava/lang/Object;",
                "            0     123    10    k6   Ljava/lang/Object;",
                "            0     123    11    v6   Ljava/lang/Object;",
                "            0     123    12    k7   Ljava/lang/Object;",
                "            0     123    13    v7   Ljava/lang/Object;",
                "            0     123    14    k8   Ljava/lang/Object;",
                "            0     123    15    v8   Ljava/lang/Object;",
                "            0     123    16    k9   Ljava/lang/Object;",
                "            0     123    17    v9   Ljava/lang/Object;",
                "            0     123    18   k10   Ljava/lang/Object;",
                "            0     123    19   v10   Ljava/lang/Object;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0     123     0    k1   TK;",
                "            0     123     1    v1   TV;",
                "            0     123     2    k2   TK;",
                "            0     123     3    v2   TV;",
                "            0     123     4    k3   TK;",
                "            0     123     5    v3   TV;",
                "            0     123     6    k4   TK;",
                "            0     123     7    v4   TV;",
                "            0     123     8    k5   TK;",
                "            0     123     9    v5   TV;",
                "            0     123    10    k6   TK;",
                "            0     123    11    v6   TV;",
                "            0     123    12    k7   TK;",
                "            0     123    13    v7   TV;",
                "            0     123    14    k8   TK;",
                "            0     123    15    v8   TV;",
                "            0     123    16    k9   TK;",
                "            0     123    17    v9   TV;",
                "            0     123    18   k10   TK;",
                "            0     123    19   v10   TV;",
                "    Signature: #235                         // <K:Ljava/lang/Object;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Ljava/util/Map<TK;TV;>;"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x15, name = "iload")
    @Instruction(value = 0x19, name = "aload")
    @Instruction(value = 0x1c, name = "iload_2")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x32, name = "aaload")
    @Instruction(value = 0x36, name = "istore")
    @Instruction(value = 0x3a, name = "astore")
    @Instruction(value = 0x3d, name = "istore_2")
    @Instruction(value = 0x4c, name = "astore_1")
    @Instruction(value = 0x4e, name = "astore_3")
    @Instruction(value = 0x53, name = "aastore")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0x78, name = "ishl")
    @Instruction(value = 0x84, name = "iinc")
    @Instruction(value = 0x9a, name = "ifne")
    @Instruction(value = 0xa0, name = "if_icmpne")
    @Instruction(value = 0xa2, name = "if_icmpge")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb2, name = "getstatic")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbd, name = "anewarray")
    @Instruction(value = 0xbe, name = "arraylength")
    @Test
    public void test_37() {
        expectedConsecutiveLines = List.of(
                "  public static <K extends java.lang.Object, V extends java.lang.Object> java.util.Map<K, V> ofEntries(java.util.Map$Entry<? extends K, ? extends V>...);",
                "    descriptor: ([Ljava/util/Map$Entry;)Ljava/util/Map;",
                "    flags: (0x0089) ACC_PUBLIC, ACC_STATIC, ACC_VARARGS",
                "    Code:",
                "      stack=5, locals=7, args_size=1",
                "         0: aload_0",
                "         1: arraylength",
                "         2: ifne          11",
                "         5: getstatic     #81                 // Field java/util/ImmutableCollections.EMPTY_MAP:Ljava/util/ImmutableCollections$MapN;",
                "         8: astore_1",
                "         9: aload_1",
                "        10: areturn",
                "        11: aload_0",
                "        12: arraylength",
                "        13: iconst_1",
                "        14: if_icmpne     41",
                "        17: new           #87                 // class java/util/ImmutableCollections$Map1",
                "        20: dup",
                "        21: aload_0",
                "        22: iconst_0",
                "        23: aaload",
                "        24: invokeinterface #38,  1           // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;",
                "        29: aload_0",
                "        30: iconst_0",
                "        31: aaload",
                "        32: invokeinterface #41,  1           // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;",
                "        37: invokespecial #89                 // Method java/util/ImmutableCollections$Map1.\"<init>\":(Ljava/lang/Object;Ljava/lang/Object;)V",
                "        40: areturn",
                "        41: aload_0",
                "        42: arraylength",
                "        43: iconst_1",
                "        44: ishl",
                "        45: anewarray     #93                 // class java/lang/Object",
                "        48: astore_1",
                "        49: iconst_0",
                "        50: istore_2",
                "        51: aload_0",
                "        52: astore_3",
                "        53: aload_3",
                "        54: arraylength",
                "        55: istore        4",
                "        57: iconst_0",
                "        58: istore        5",
                "        60: iload         5",
                "        62: iload         4",
                "        64: if_icmpge     105",
                "        67: aload_3",
                "        68: iload         5",
                "        70: aaload",
                "        71: astore        6",
                "        73: aload_1",
                "        74: iload_2",
                "        75: iinc          2, 1",
                "        78: aload         6",
                "        80: invokeinterface #38,  1           // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;",
                "        85: aastore",
                "        86: aload_1",
                "        87: iload_2",
                "        88: iinc          2, 1",
                "        91: aload         6",
                "        93: invokeinterface #41,  1           // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;",
                "        98: aastore",
                "        99: iinc          5, 1",
                "       102: goto          60",
                "       105: new           #91                 // class java/util/ImmutableCollections$MapN",
                "       108: dup",
                "       109: aload_1",
                "       110: invokespecial #95                 // Method java/util/ImmutableCollections$MapN.\"<init>\":([Ljava/lang/Object;)V",
                "       113: areturn",
                "      LineNumberTable:",
                "        line 1664: 0",
                "        line 1666: 5",
                "        line 1667: 9",
                "        line 1668: 11",
                "        line 1670: 17",
                "        line 1671: 32",
                "        line 1670: 40",
                "        line 1673: 41",
                "        line 1674: 49",
                "        line 1675: 51",
                "        line 1677: 73",
                "        line 1678: 86",
                "        line 1675: 99",
                "        line 1680: 105",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            9       2     1   map   Ljava/util/Map;",
                "           73      26     6 entry   Ljava/util/Map$Entry;",
                "           49      65     1   kva   [Ljava/lang/Object;",
                "           51      63     2     a   I",
                "            0     114     0 entries   [Ljava/util/Map$Entry;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            9       2     1   map   Ljava/util/Map<TK;TV;>;",
                "           73      26     6 entry   Ljava/util/Map$Entry<+TK;+TV;>;",
                "            0     114     0 entries   [Ljava/util/Map$Entry<+TK;+TV;>;",
                "      StackMapTable: number_of_entries = 4",
                "        frame_type = 11 /* same */",
                "        frame_type = 29 /* same */",
                "        frame_type = 255 /* full_frame */",
                "          offset_delta = 18",
                "          locals = [ class \"[Ljava/util/Map$Entry;\", class \"[Ljava/lang/Object;\", int, class \"[Ljava/util/Map$Entry;\", int, int ]",
                "          stack = []",
                "        frame_type = 248 /* chop */",
                "          offset_delta = 44",
                "    Signature: #245                         // <K:Ljava/lang/Object;V:Ljava/lang/Object;>([Ljava/util/Map$Entry<+TK;+TV;>;)Ljava/util/Map<TK;TV;>;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xbb, name = "new")
    @Test
    public void test_38() {
        expectedConsecutiveLines = List.of(
                "  public static <K extends java.lang.Object, V extends java.lang.Object> java.util.Map$Entry<K, V> entry(K, V);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=2, args_size=2",
                "         0: new           #98                 // class java/util/KeyValueHolder",
                "         3: dup",
                "         4: aload_0",
                "         5: aload_1",
                "         6: invokespecial #100                // Method java/util/KeyValueHolder.\"<init>\":(Ljava/lang/Object;Ljava/lang/Object;)V",
                "         9: areturn",
                "      LineNumberTable:",
                "        line 1721: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      10     0     k   Ljava/lang/Object;",
                "            0      10     1     v   Ljava/lang/Object;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      10     0     k   TK;",
                "            0      10     1     v   TV;",
                "    Signature: #249                         // <K:Ljava/lang/Object;V:Ljava/lang/Object;>(TK;TV;)Ljava/util/Map$Entry<TK;TV;>;"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xbd, name = "anewarray")
    @Instruction(value = 0xc0, name = "checkcast")
    @Instruction(value = 0xc1, name = "instanceof")
    @Test
    public void test_39() {
        expectedConsecutiveLines = List.of(
                "  public static <K extends java.lang.Object, V extends java.lang.Object> java.util.Map<K, V> copyOf(java.util.Map<? extends K, ? extends V>);",
                "    descriptor: (Ljava/util/Map;)Ljava/util/Map;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: instanceof    #101                // class java/util/ImmutableCollections$AbstractImmutableMap",
                "         4: ifeq          9",
                "         7: aload_0",
                "         8: areturn",
                "         9: aload_0",
                "        10: invokeinterface #103,  1          // InterfaceMethod isEmpty:()Z",
                "        15: ifeq          22",
                "        18: invokestatic  #106                // InterfaceMethod of:()Ljava/util/Map;",
                "        21: areturn",
                "        22: aload_0",
                "        23: invokeinterface #16,  1           // InterfaceMethod entrySet:()Ljava/util/Set;",
                "        28: iconst_0",
                "        29: anewarray     #36                 // class java/util/Map$Entry",
                "        32: invokeinterface #110,  2          // InterfaceMethod java/util/Set.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;",
                "        37: checkcast     #114                // class \"[Ljava/util/Map$Entry;\"",
                "        40: invokestatic  #116                // InterfaceMethod ofEntries:([Ljava/util/Map$Entry;)Ljava/util/Map;",
                "        43: areturn",
                "      LineNumberTable:",
                "        line 1743: 0",
                "        line 1744: 7",
                "        line 1745: 9",
                "        line 1746: 18",
                "        line 1748: 22",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      44     0   map   Ljava/util/Map;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      44     0   map   Ljava/util/Map<+TK;+TV;>;",
                "      StackMapTable: number_of_entries = 2",
                "        frame_type = 9 /* same */",
                "        frame_type = 12 /* same */",
                "    Signature: #253                         // <K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/util/Map<+TK;+TV;>;)Ljava/util/Map<TK;TV;>;"
        );
    }
}
