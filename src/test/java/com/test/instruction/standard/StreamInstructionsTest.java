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
public class StreamInstructionsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.util.stream.Stream"));
    }

    @Test
    public void test_1() {
        expectedConsecutiveLines = List.of(
                "  public abstract java.util.stream.Stream<T> filter(java.util.function.Predicate<? super T>);",
                "    descriptor: (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #183                         // (Ljava/util/function/Predicate<-TT;>;)Ljava/util/stream/Stream<TT;>;"
        );
    }

    @Test
    public void test_2() {
        expectedConsecutiveLines = List.of(
                "  public abstract <R extends java.lang.Object> java.util.stream.Stream<R> map(java.util.function.Function<? super T, ? extends R>);",
                "    descriptor: (Ljava/util/function/Function;)Ljava/util/stream/Stream;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #185                         // <R:Ljava/lang/Object;>(Ljava/util/function/Function<-TT;+TR;>;)Ljava/util/stream/Stream<TR;>;"
        );
    }

    @Test
    public void test_3() {
        expectedConsecutiveLines = List.of(
                "  public abstract java.util.stream.IntStream mapToInt(java.util.function.ToIntFunction<? super T>);",
                "    descriptor: (Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #188                         // (Ljava/util/function/ToIntFunction<-TT;>;)Ljava/util/stream/IntStream;"
        );
    }

    @Test
    public void test_4() {
        expectedConsecutiveLines = List.of(
                "  public abstract java.util.stream.LongStream mapToLong(java.util.function.ToLongFunction<? super T>);",
                "    descriptor: (Ljava/util/function/ToLongFunction;)Ljava/util/stream/LongStream;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #191                         // (Ljava/util/function/ToLongFunction<-TT;>;)Ljava/util/stream/LongStream;"
        );
    }

    @Test
    public void test_5() {
        expectedConsecutiveLines = List.of(
                "  public abstract java.util.stream.DoubleStream mapToDouble(java.util.function.ToDoubleFunction<? super T>);",
                "    descriptor: (Ljava/util/function/ToDoubleFunction;)Ljava/util/stream/DoubleStream;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #194                         // (Ljava/util/function/ToDoubleFunction<-TT;>;)Ljava/util/stream/DoubleStream;"
        );
    }

    @Test
    public void test_6() {
        expectedConsecutiveLines = List.of(
                "  public abstract <R extends java.lang.Object> java.util.stream.Stream<R> flatMap(java.util.function.Function<? super T, ? extends java.util.stream.Stream<? extends R>>);",
                "    descriptor: (Ljava/util/function/Function;)Ljava/util/stream/Stream;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #195                         // <R:Ljava/lang/Object;>(Ljava/util/function/Function<-TT;+Ljava/util/stream/Stream<+TR;>;>;)Ljava/util/stream/Stream<TR;>;"
        );
    }

    @Test
    public void test_7() {
        expectedConsecutiveLines = List.of(
                "  public abstract java.util.stream.IntStream flatMapToInt(java.util.function.Function<? super T, ? extends java.util.stream.IntStream>);",
                "    descriptor: (Ljava/util/function/Function;)Ljava/util/stream/IntStream;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #196                         // (Ljava/util/function/Function<-TT;+Ljava/util/stream/IntStream;>;)Ljava/util/stream/IntStream;"
        );
    }

    @Test
    public void test_8() {
        expectedConsecutiveLines = List.of(
                "  public abstract java.util.stream.LongStream flatMapToLong(java.util.function.Function<? super T, ? extends java.util.stream.LongStream>);",
                "    descriptor: (Ljava/util/function/Function;)Ljava/util/stream/LongStream;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #197                         // (Ljava/util/function/Function<-TT;+Ljava/util/stream/LongStream;>;)Ljava/util/stream/LongStream;"
        );
    }

    @Test
    public void test_9() {
        expectedConsecutiveLines = List.of(
                "  public abstract java.util.stream.DoubleStream flatMapToDouble(java.util.function.Function<? super T, ? extends java.util.stream.DoubleStream>);",
                "    descriptor: (Ljava/util/function/Function;)Ljava/util/stream/DoubleStream;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #198                         // (Ljava/util/function/Function<-TT;+Ljava/util/stream/DoubleStream;>;)Ljava/util/stream/DoubleStream;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xba, name = "invokedynamic")
    @Test
    public void test_10() {
        expectedConsecutiveLines = List.of(
                "  public default <R extends java.lang.Object> java.util.stream.Stream<R> mapMulti(java.util.function.BiConsumer<? super T, ? super java.util.function.Consumer<R>>);",
                "    descriptor: (Ljava/util/function/BiConsumer;)Ljava/util/stream/Stream;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_1",
                "         1: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "         4: pop",
                "         5: aload_0",
                "         6: aload_1",
                "         7: invokedynamic #7,  0              // InvokeDynamic #0:apply:(Ljava/util/function/BiConsumer;)Ljava/util/function/Function;",
                "        12: invokeinterface #11,  2           // InterfaceMethod flatMap:(Ljava/util/function/Function;)Ljava/util/stream/Stream;",
                "        17: areturn",
                "      LineNumberTable:",
                "        line 427: 0",
                "        line 428: 5",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      18     0  this   Ljava/util/stream/Stream;",
                "            0      18     1 mapper   Ljava/util/function/BiConsumer;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      18     0  this   Ljava/util/stream/Stream<TT;>;",
                "            0      18     1 mapper   Ljava/util/function/BiConsumer<-TT;-Ljava/util/function/Consumer<TR;>;>;",
                "    Signature: #211                         // <R:Ljava/lang/Object;>(Ljava/util/function/BiConsumer<-TT;-Ljava/util/function/Consumer<TR;>;>;)Ljava/util/stream/Stream<TR;>;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xba, name = "invokedynamic")
    @Test
    public void test_11() {
        expectedConsecutiveLines = List.of(
                "  public default java.util.stream.IntStream mapMultiToInt(java.util.function.BiConsumer<? super T, ? super java.util.function.IntConsumer>);",
                "    descriptor: (Ljava/util/function/BiConsumer;)Ljava/util/stream/IntStream;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_1",
                "         1: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "         4: pop",
                "         5: aload_0",
                "         6: aload_1",
                "         7: invokedynamic #17,  0             // InvokeDynamic #1:apply:(Ljava/util/function/BiConsumer;)Ljava/util/function/Function;",
                "        12: invokeinterface #18,  2           // InterfaceMethod flatMapToInt:(Ljava/util/function/Function;)Ljava/util/stream/IntStream;",
                "        17: areturn",
                "      LineNumberTable:",
                "        line 465: 0",
                "        line 466: 5",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      18     0  this   Ljava/util/stream/Stream;",
                "            0      18     1 mapper   Ljava/util/function/BiConsumer;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      18     0  this   Ljava/util/stream/Stream<TT;>;",
                "            0      18     1 mapper   Ljava/util/function/BiConsumer<-TT;-Ljava/util/function/IntConsumer;>;",
                "    Signature: #215                         // (Ljava/util/function/BiConsumer<-TT;-Ljava/util/function/IntConsumer;>;)Ljava/util/stream/IntStream;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xba, name = "invokedynamic")
    @Test
    public void test_12() {
        expectedConsecutiveLines = List.of(
                "  public default java.util.stream.LongStream mapMultiToLong(java.util.function.BiConsumer<? super T, ? super java.util.function.LongConsumer>);",
                "    descriptor: (Ljava/util/function/BiConsumer;)Ljava/util/stream/LongStream;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_1",
                "         1: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "         4: pop",
                "         5: aload_0",
                "         6: aload_1",
                "         7: invokedynamic #22,  0             // InvokeDynamic #2:apply:(Ljava/util/function/BiConsumer;)Ljava/util/function/Function;",
                "        12: invokeinterface #23,  2           // InterfaceMethod flatMapToLong:(Ljava/util/function/Function;)Ljava/util/stream/LongStream;",
                "        17: areturn",
                "      LineNumberTable:",
                "        line 503: 0",
                "        line 504: 5",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      18     0  this   Ljava/util/stream/Stream;",
                "            0      18     1 mapper   Ljava/util/function/BiConsumer;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      18     0  this   Ljava/util/stream/Stream<TT;>;",
                "            0      18     1 mapper   Ljava/util/function/BiConsumer<-TT;-Ljava/util/function/LongConsumer;>;",
                "    Signature: #219                         // (Ljava/util/function/BiConsumer<-TT;-Ljava/util/function/LongConsumer;>;)Ljava/util/stream/LongStream;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xba, name = "invokedynamic")
    @Test
    public void test_13() {
        expectedConsecutiveLines = List.of(
                "  public default java.util.stream.DoubleStream mapMultiToDouble(java.util.function.BiConsumer<? super T, ? super java.util.function.DoubleConsumer>);",
                "    descriptor: (Ljava/util/function/BiConsumer;)Ljava/util/stream/DoubleStream;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_1",
                "         1: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "         4: pop",
                "         5: aload_0",
                "         6: aload_1",
                "         7: invokedynamic #27,  0             // InvokeDynamic #3:apply:(Ljava/util/function/BiConsumer;)Ljava/util/function/Function;",
                "        12: invokeinterface #28,  2           // InterfaceMethod flatMapToDouble:(Ljava/util/function/Function;)Ljava/util/stream/DoubleStream;",
                "        17: areturn",
                "      LineNumberTable:",
                "        line 541: 0",
                "        line 542: 5",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      18     0  this   Ljava/util/stream/Stream;",
                "            0      18     1 mapper   Ljava/util/function/BiConsumer;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      18     0  this   Ljava/util/stream/Stream<TT;>;",
                "            0      18     1 mapper   Ljava/util/function/BiConsumer<-TT;-Ljava/util/function/DoubleConsumer;>;",
                "    Signature: #223                         // (Ljava/util/function/BiConsumer<-TT;-Ljava/util/function/DoubleConsumer;>;)Ljava/util/stream/DoubleStream;"
        );
    }

    @Test
    public void test_14() {
        expectedConsecutiveLines = List.of(
                "  public abstract java.util.stream.Stream<T> distinct();",
                "    descriptor: ()Ljava/util/stream/Stream;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #225                         // ()Ljava/util/stream/Stream<TT;>;"
        );
    }

    @Test
    public void test_15() {
        expectedConsecutiveLines = List.of(
                "  public abstract java.util.stream.Stream<T> sorted();",
                "    descriptor: ()Ljava/util/stream/Stream;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #225                         // ()Ljava/util/stream/Stream<TT;>;"
        );
    }

    @Test
    public void test_16() {
        expectedConsecutiveLines = List.of(
                "  public abstract java.util.stream.Stream<T> sorted(java.util.Comparator<? super T>);",
                "    descriptor: (Ljava/util/Comparator;)Ljava/util/stream/Stream;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #228                         // (Ljava/util/Comparator<-TT;>;)Ljava/util/stream/Stream<TT;>;"
        );
    }

    @Test
    public void test_17() {
        expectedConsecutiveLines = List.of(
                "  public abstract java.util.stream.Stream<T> peek(java.util.function.Consumer<? super T>);",
                "    descriptor: (Ljava/util/function/Consumer;)Ljava/util/stream/Stream;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #231                         // (Ljava/util/function/Consumer<-TT;>;)Ljava/util/stream/Stream<TT;>;"
        );
    }

    @Test
    public void test_18() {
        expectedConsecutiveLines = List.of(
                "  public abstract java.util.stream.Stream<T> limit(long);",
                "    descriptor: (J)Ljava/util/stream/Stream;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #234                         // (J)Ljava/util/stream/Stream<TT;>;"
        );
    }

    @Test
    public void test_19() {
        expectedConsecutiveLines = List.of(
                "  public abstract java.util.stream.Stream<T> skip(long);",
                "    descriptor: (J)Ljava/util/stream/Stream;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #234                         // (J)Ljava/util/stream/Stream<TT;>;"
        );
    }

    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xba, name = "invokedynamic")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xc0, name = "checkcast")
    @Test
    public void test_20() {
        expectedConsecutiveLines = List.of(
                "  public default java.util.stream.Stream<T> takeWhile(java.util.function.Predicate<? super T>);",
                "    descriptor: (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=5, locals=2, args_size=2",
                "         0: aload_1",
                "         1: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "         4: pop",
                "         5: new           #32                 // class java/util/stream/WhileOps$UnorderedWhileSpliterator$OfRef$Taking",
                "         8: dup",
                "         9: aload_0",
                "        10: invokeinterface #34,  1           // InterfaceMethod spliterator:()Ljava/util/Spliterator;",
                "        15: iconst_1",
                "        16: aload_1",
                "        17: invokespecial #38                 // Method java/util/stream/WhileOps$UnorderedWhileSpliterator$OfRef$Taking.\"<init>\":(Ljava/util/Spliterator;ZLjava/util/function/Predicate;)V",
                "        20: aload_0",
                "        21: invokeinterface #42,  1           // InterfaceMethod isParallel:()Z",
                "        26: invokestatic  #46                 // Method java/util/stream/StreamSupport.stream:(Ljava/util/Spliterator;Z)Ljava/util/stream/Stream;",
                "        29: aload_0",
                "        30: invokedynamic #52,  0             // InvokeDynamic #4:run:(Ljava/util/stream/Stream;)Ljava/lang/Runnable;",
                "        35: invokeinterface #56,  2           // InterfaceMethod onClose:(Ljava/lang/Runnable;)Ljava/util/stream/BaseStream;",
                "        40: checkcast     #12                 // class java/util/stream/Stream",
                "        43: areturn",
                "      LineNumberTable:",
                "        line 760: 0",
                "        line 763: 5",
                "        line 764: 10",
                "        line 765: 21",
                "        line 763: 26",
                "        line 765: 35",
                "        line 763: 43",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      44     0  this   Ljava/util/stream/Stream;",
                "            0      44     1 predicate   Ljava/util/function/Predicate;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      44     0  this   Ljava/util/stream/Stream<TT;>;",
                "            0      44     1 predicate   Ljava/util/function/Predicate<-TT;>;",
                "    Signature: #183                         // (Ljava/util/function/Predicate<-TT;>;)Ljava/util/stream/Stream<TT;>;"
        );
    }

    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xba, name = "invokedynamic")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xc0, name = "checkcast")
    @Test
    public void test_21() {
        expectedConsecutiveLines = List.of(
                "  public default java.util.stream.Stream<T> dropWhile(java.util.function.Predicate<? super T>);",
                "    descriptor: (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=5, locals=2, args_size=2",
                "         0: aload_1",
                "         1: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "         4: pop",
                "         5: new           #60                 // class java/util/stream/WhileOps$UnorderedWhileSpliterator$OfRef$Dropping",
                "         8: dup",
                "         9: aload_0",
                "        10: invokeinterface #34,  1           // InterfaceMethod spliterator:()Ljava/util/Spliterator;",
                "        15: iconst_1",
                "        16: aload_1",
                "        17: invokespecial #62                 // Method java/util/stream/WhileOps$UnorderedWhileSpliterator$OfRef$Dropping.\"<init>\":(Ljava/util/Spliterator;ZLjava/util/function/Predicate;)V",
                "        20: aload_0",
                "        21: invokeinterface #42,  1           // InterfaceMethod isParallel:()Z",
                "        26: invokestatic  #46                 // Method java/util/stream/StreamSupport.stream:(Ljava/util/Spliterator;Z)Ljava/util/stream/Stream;",
                "        29: aload_0",
                "        30: invokedynamic #52,  0             // InvokeDynamic #4:run:(Ljava/util/stream/Stream;)Ljava/lang/Runnable;",
                "        35: invokeinterface #56,  2           // InterfaceMethod onClose:(Ljava/lang/Runnable;)Ljava/util/stream/BaseStream;",
                "        40: checkcast     #12                 // class java/util/stream/Stream",
                "        43: areturn",
                "      LineNumberTable:",
                "        line 826: 0",
                "        line 829: 5",
                "        line 830: 10",
                "        line 831: 21",
                "        line 829: 26",
                "        line 831: 35",
                "        line 829: 43",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      44     0  this   Ljava/util/stream/Stream;",
                "            0      44     1 predicate   Ljava/util/function/Predicate;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      44     0  this   Ljava/util/stream/Stream<TT;>;",
                "            0      44     1 predicate   Ljava/util/function/Predicate<-TT;>;",
                "    Signature: #183                         // (Ljava/util/function/Predicate<-TT;>;)Ljava/util/stream/Stream<TT;>;"
        );
    }

    @Test
    public void test_22() {
        expectedConsecutiveLines = List.of(
                "  public abstract void forEach(java.util.function.Consumer<? super T>);",
                "    descriptor: (Ljava/util/function/Consumer;)V",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #243                         // (Ljava/util/function/Consumer<-TT;>;)V"
        );
    }

    @Test
    public void test_23() {
        expectedConsecutiveLines = List.of(
                "  public abstract void forEachOrdered(java.util.function.Consumer<? super T>);",
                "    descriptor: (Ljava/util/function/Consumer;)V",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #243                         // (Ljava/util/function/Consumer<-TT;>;)V"
        );
    }

    @Test
    public void test_24() {
        expectedConsecutiveLines = List.of(
                "  public abstract java.lang.Object[] toArray();",
                "    descriptor: ()[Ljava/lang/Object;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT"
        );
    }

    @Test
    public void test_25() {
        expectedConsecutiveLines = List.of(
                "  public abstract <A extends java.lang.Object> A[] toArray(java.util.function.IntFunction<A[]>);",
                "    descriptor: (Ljava/util/function/IntFunction;)[Ljava/lang/Object;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #246                         // <A:Ljava/lang/Object;>(Ljava/util/function/IntFunction<[TA;>;)[TA;"
        );
    }

    @Test
    public void test_26() {
        expectedConsecutiveLines = List.of(
                "  public abstract T reduce(T, java.util.function.BinaryOperator<T>);",
                "    descriptor: (Ljava/lang/Object;Ljava/util/function/BinaryOperator;)Ljava/lang/Object;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #249                         // (TT;Ljava/util/function/BinaryOperator<TT;>;)TT;"
        );
    }

    @Test
    public void test_27() {
        expectedConsecutiveLines = List.of(
                "  public abstract java.util.Optional<T> reduce(java.util.function.BinaryOperator<T>);",
                "    descriptor: (Ljava/util/function/BinaryOperator;)Ljava/util/Optional;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #251                         // (Ljava/util/function/BinaryOperator<TT;>;)Ljava/util/Optional<TT;>;"
        );
    }

    @Test
    public void test_28() {
        expectedConsecutiveLines = List.of(
                "  public abstract <U extends java.lang.Object> U reduce(U, java.util.function.BiFunction<U, ? super T, U>, java.util.function.BinaryOperator<U>);",
                "    descriptor: (Ljava/lang/Object;Ljava/util/function/BiFunction;Ljava/util/function/BinaryOperator;)Ljava/lang/Object;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #253                         // <U:Ljava/lang/Object;>(TU;Ljava/util/function/BiFunction<TU;-TT;TU;>;Ljava/util/function/BinaryOperator<TU;>;)TU;"
        );
    }

    @Test
    public void test_29() {
        expectedConsecutiveLines = List.of(
                "  public abstract <R extends java.lang.Object> R collect(java.util.function.Supplier<R>, java.util.function.BiConsumer<R, ? super T>, java.util.function.BiConsumer<R, R>);",
                "    descriptor: (Ljava/util/function/Supplier;Ljava/util/function/BiConsumer;Ljava/util/function/BiConsumer;)Ljava/lang/Object;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #256                         // <R:Ljava/lang/Object;>(Ljava/util/function/Supplier<TR;>;Ljava/util/function/BiConsumer<TR;-TT;>;Ljava/util/function/BiConsumer<TR;TR;>;)TR;"
        );
    }

    @Test
    public void test_30() {
        expectedConsecutiveLines = List.of(
                "  public abstract <R extends java.lang.Object, A extends java.lang.Object> R collect(java.util.stream.Collector<? super T, A, R>);",
                "    descriptor: (Ljava/util/stream/Collector;)Ljava/lang/Object;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #258                         // <R:Ljava/lang/Object;A:Ljava/lang/Object;>(Ljava/util/stream/Collector<-TT;TA;TR;>;)TR;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xbb, name = "new")
    @Test
    public void test_31() {
        expectedConsecutiveLines = List.of(
                "  public default java.util.List<T> toList();",
                "    descriptor: ()Ljava/util/List;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=1, args_size=1",
                "         0: new           #63                 // class java/util/ArrayList",
                "         3: dup",
                "         4: aload_0",
                "         5: invokeinterface #65,  1           // InterfaceMethod toArray:()[Ljava/lang/Object;",
                "        10: invokestatic  #69                 // Method java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;",
                "        13: invokespecial #75                 // Method java/util/ArrayList.\"<init>\":(Ljava/util/Collection;)V",
                "        16: invokestatic  #78                 // Method java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;",
                "        19: areturn",
                "      LineNumberTable:",
                "        line 1198: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      20     0  this   Ljava/util/stream/Stream;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      20     0  this   Ljava/util/stream/Stream<TT;>;",
                "    Signature: #261                         // ()Ljava/util/List<TT;>;"
        );
    }

    @Test
    public void test_32() {
        expectedConsecutiveLines = List.of(
                "  public abstract java.util.Optional<T> min(java.util.Comparator<? super T>);",
                "    descriptor: (Ljava/util/Comparator;)Ljava/util/Optional;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #264                         // (Ljava/util/Comparator<-TT;>;)Ljava/util/Optional<TT;>;"
        );
    }

    @Test
    public void test_33() {
        expectedConsecutiveLines = List.of(
                "  public abstract java.util.Optional<T> max(java.util.Comparator<? super T>);",
                "    descriptor: (Ljava/util/Comparator;)Ljava/util/Optional;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #264                         // (Ljava/util/Comparator<-TT;>;)Ljava/util/Optional<TT;>;"
        );
    }

    @Test
    public void test_34() {
        expectedConsecutiveLines = List.of(
                "  public abstract long count();",
                "    descriptor: ()J",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT"
        );
    }

    @Test
    public void test_35() {
        expectedConsecutiveLines = List.of(
                "  public abstract boolean anyMatch(java.util.function.Predicate<? super T>);",
                "    descriptor: (Ljava/util/function/Predicate;)Z",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #270                         // (Ljava/util/function/Predicate<-TT;>;)Z"
        );
    }

    @Test
    public void test_36() {
        expectedConsecutiveLines = List.of(
                "  public abstract boolean allMatch(java.util.function.Predicate<? super T>);",
                "    descriptor: (Ljava/util/function/Predicate;)Z",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #270                         // (Ljava/util/function/Predicate<-TT;>;)Z"
        );
    }

    @Test
    public void test_37() {
        expectedConsecutiveLines = List.of(
                "  public abstract boolean noneMatch(java.util.function.Predicate<? super T>);",
                "    descriptor: (Ljava/util/function/Predicate;)Z",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #270                         // (Ljava/util/function/Predicate<-TT;>;)Z"
        );
    }

    @Test
    public void test_38() {
        expectedConsecutiveLines = List.of(
                "  public abstract java.util.Optional<T> findFirst();",
                "    descriptor: ()Ljava/util/Optional;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #275                         // ()Ljava/util/Optional<TT;>;"
        );
    }

    @Test
    public void test_39() {
        expectedConsecutiveLines = List.of(
                "  public abstract java.util.Optional<T> findAny();",
                "    descriptor: ()Ljava/util/Optional;",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT",
                "    Signature: #275                         // ()Ljava/util/Optional<TT;>;"
        );
    }

    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xbb, name = "new")
    @Test
    public void test_40() {
        expectedConsecutiveLines = List.of(
                "  public static <T extends java.lang.Object> java.util.stream.Stream$Builder<T> builder();",
                "    descriptor: ()Ljava/util/stream/Stream$Builder;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=0, args_size=0",
                "         0: new           #84                 // class java/util/stream/Streams$StreamBuilderImpl",
                "         3: dup",
                "         4: invokespecial #86                 // Method java/util/stream/Streams$StreamBuilderImpl.\"<init>\":()V",
                "         7: areturn",
                "      LineNumberTable:",
                "        line 1377: 0",
                "    Signature: #279                         // <T:Ljava/lang/Object;>()Ljava/util/stream/Stream$Builder<TT;>;"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_41() {
        expectedConsecutiveLines = List.of(
                "  public static <T extends java.lang.Object> java.util.stream.Stream<T> empty();",
                "    descriptor: ()Ljava/util/stream/Stream;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=0, args_size=0",
                "         0: invokestatic  #89                 // Method java/util/Spliterators.emptySpliterator:()Ljava/util/Spliterator;",
                "         3: iconst_0",
                "         4: invokestatic  #46                 // Method java/util/stream/StreamSupport.stream:(Ljava/util/Spliterator;Z)Ljava/util/stream/Stream;",
                "         7: areturn",
                "      LineNumberTable:",
                "        line 1387: 0",
                "    Signature: #280                         // <T:Ljava/lang/Object;>()Ljava/util/stream/Stream<TT;>;"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xbb, name = "new")
    @Test
    public void test_42() {
        expectedConsecutiveLines = List.of(
                "  public static <T extends java.lang.Object> java.util.stream.Stream<T> of(T);",
                "    descriptor: (Ljava/lang/Object;)Ljava/util/stream/Stream;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=3, locals=1, args_size=1",
                "         0: new           #84                 // class java/util/stream/Streams$StreamBuilderImpl",
                "         3: dup",
                "         4: aload_0",
                "         5: invokespecial #94                 // Method java/util/stream/Streams$StreamBuilderImpl.\"<init>\":(Ljava/lang/Object;)V",
                "         8: iconst_0",
                "         9: invokestatic  #46                 // Method java/util/stream/StreamSupport.stream:(Ljava/util/Spliterator;Z)Ljava/util/stream/Stream;",
                "        12: areturn",
                "      LineNumberTable:",
                "        line 1398: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      13     0     t   Ljava/lang/Object;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      13     0     t   TT;",
                "    Signature: #286                         // <T:Ljava/lang/Object;>(TT;)Ljava/util/stream/Stream<TT;>;"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xc7, name = "ifnonnull")
    @Test
    public void test_43() {
        expectedConsecutiveLines = List.of(
                "  public static <T extends java.lang.Object> java.util.stream.Stream<T> ofNullable(T);",
                "    descriptor: (Ljava/lang/Object;)Ljava/util/stream/Stream;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=3, locals=1, args_size=1",
                "         0: aload_0",
                "         1: ifnonnull     10",
                "         4: invokestatic  #97                 // InterfaceMethod empty:()Ljava/util/stream/Stream;",
                "         7: goto          22",
                "        10: new           #84                 // class java/util/stream/Streams$StreamBuilderImpl",
                "        13: dup",
                "        14: aload_0",
                "        15: invokespecial #94                 // Method java/util/stream/Streams$StreamBuilderImpl.\"<init>\":(Ljava/lang/Object;)V",
                "        18: iconst_0",
                "        19: invokestatic  #46                 // Method java/util/stream/StreamSupport.stream:(Ljava/util/Spliterator;Z)Ljava/util/stream/Stream;",
                "        22: areturn",
                "      LineNumberTable:",
                "        line 1412: 0",
                "        line 1413: 10",
                "        line 1412: 22",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      23     0     t   Ljava/lang/Object;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      23     0     t   TT;",
                "    Signature: #286                         // <T:Ljava/lang/Object;>(TT;)Ljava/util/stream/Stream<TT;>;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_44() {
        expectedConsecutiveLines = List.of(
                "  public static <T extends java.lang.Object> java.util.stream.Stream<T> of(T...);",
                "    descriptor: ([Ljava/lang/Object;)Ljava/util/stream/Stream;",
                "    flags: (0x0089) ACC_PUBLIC, ACC_STATIC, ACC_VARARGS",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: invokestatic  #101                // Method java/util/Arrays.stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;",
                "         4: areturn",
                "      LineNumberTable:",
                "        line 1426: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       5     0 values   [Ljava/lang/Object;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       5     0 values   [TT;",
                "    Signature: #292                         // <T:Ljava/lang/Object;>([TT;)Ljava/util/stream/Stream<TT;>;"
        );
    }

    @Instruction(value = 0xffffffff, name = "ldc2_w")
    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x11, name = "sipush")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x4d, name = "astore_2")
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xbb, name = "new")
    @Test
    public void test_45() {
        expectedConsecutiveLines = List.of(
                "  public static <T extends java.lang.Object> java.util.stream.Stream<T> iterate(T, java.util.function.UnaryOperator<T>);",
                "    descriptor: (Ljava/lang/Object;Ljava/util/function/UnaryOperator;)Ljava/util/stream/Stream;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=7, locals=3, args_size=2",
                "         0: aload_1",
                "         1: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "         4: pop",
                "         5: new           #104                // class java/util/stream/Stream$1",
                "         8: dup",
                "         9: ldc2_w        #108                // long 9223372036854775807l",
                "        12: sipush        1040",
                "        15: aload_1",
                "        16: aload_0",
                "        17: invokespecial #112                // Method java/util/stream/Stream$1.\"<init>\":(JILjava/util/function/UnaryOperator;Ljava/lang/Object;)V",
                "        20: astore_2",
                "        21: aload_2",
                "        22: iconst_0",
                "        23: invokestatic  #46                 // Method java/util/stream/StreamSupport.stream:(Ljava/util/Spliterator;Z)Ljava/util/stream/Stream;",
                "        26: areturn",
                "      LineNumberTable:",
                "        line 1453: 0",
                "        line 1454: 5",
                "        line 1473: 21",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      27     0  seed   Ljava/lang/Object;",
                "            0      27     1     f   Ljava/util/function/UnaryOperator;",
                "           21       6     2 spliterator   Ljava/util/Spliterator;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      27     0  seed   TT;",
                "            0      27     1     f   Ljava/util/function/UnaryOperator<TT;>;",
                "           21       6     2 spliterator   Ljava/util/Spliterator<TT;>;",
                "    Signature: #303                         // <T:Ljava/lang/Object;>(TT;Ljava/util/function/UnaryOperator<TT;>;)Ljava/util/stream/Stream<TT;>;"
        );
    }

    @Instruction(value = 0xffffffff, name = "ldc2_w")
    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x11, name = "sipush")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x4e, name = "astore_3")
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xbb, name = "new")
    @Test
    public void test_46() {
        expectedConsecutiveLines = List.of(
                "  public static <T extends java.lang.Object> java.util.stream.Stream<T> iterate(T, java.util.function.Predicate<? super T>, java.util.function.UnaryOperator<T>);",
                "    descriptor: (Ljava/lang/Object;Ljava/util/function/Predicate;Ljava/util/function/UnaryOperator;)Ljava/util/stream/Stream;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=8, locals=4, args_size=3",
                "         0: aload_2",
                "         1: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "         4: pop",
                "         5: aload_1",
                "         6: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "         9: pop",
                "        10: new           #115                // class java/util/stream/Stream$2",
                "        13: dup",
                "        14: ldc2_w        #108                // long 9223372036854775807l",
                "        17: sipush        1040",
                "        20: aload_2",
                "        21: aload_0",
                "        22: aload_1",
                "        23: invokespecial #117                // Method java/util/stream/Stream$2.\"<init>\":(JILjava/util/function/UnaryOperator;Ljava/lang/Object;Ljava/util/function/Predicate;)V",
                "        26: astore_3",
                "        27: aload_3",
                "        28: iconst_0",
                "        29: invokestatic  #46                 // Method java/util/stream/StreamSupport.stream:(Ljava/util/Spliterator;Z)Ljava/util/stream/Stream;",
                "        32: areturn",
                "      LineNumberTable:",
                "        line 1515: 0",
                "        line 1516: 5",
                "        line 1517: 10",
                "        line 1557: 27",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      33     0  seed   Ljava/lang/Object;",
                "            0      33     1 hasNext   Ljava/util/function/Predicate;",
                "            0      33     2  next   Ljava/util/function/UnaryOperator;",
                "           27       6     3 spliterator   Ljava/util/Spliterator;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      33     0  seed   TT;",
                "            0      33     1 hasNext   Ljava/util/function/Predicate<-TT;>;",
                "            0      33     2  next   Ljava/util/function/UnaryOperator<TT;>;",
                "           27       6     3 spliterator   Ljava/util/Spliterator<TT;>;",
                "    Signature: #307                         // <T:Ljava/lang/Object;>(TT;Ljava/util/function/Predicate<-TT;>;Ljava/util/function/UnaryOperator<TT;>;)Ljava/util/stream/Stream<TT;>;"
        );
    }

    @Instruction(value = 0xffffffff, name = "ldc2_w")
    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xbb, name = "new")
    @Test
    public void test_47() {
        expectedConsecutiveLines = List.of(
                "  public static <T extends java.lang.Object> java.util.stream.Stream<T> generate(java.util.function.Supplier<? extends T>);",
                "    descriptor: (Ljava/util/function/Supplier;)Ljava/util/stream/Stream;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=5, locals=1, args_size=1",
                "         0: aload_0",
                "         1: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "         4: pop",
                "         5: new           #120                // class java/util/stream/StreamSpliterators$InfiniteSupplyingSpliterator$OfRef",
                "         8: dup",
                "         9: ldc2_w        #108                // long 9223372036854775807l",
                "        12: aload_0",
                "        13: invokespecial #122                // Method java/util/stream/StreamSpliterators$InfiniteSupplyingSpliterator$OfRef.\"<init>\":(JLjava/util/function/Supplier;)V",
                "        16: iconst_0",
                "        17: invokestatic  #46                 // Method java/util/stream/StreamSupport.stream:(Ljava/util/Spliterator;Z)Ljava/util/stream/Stream;",
                "        20: areturn",
                "      LineNumberTable:",
                "        line 1570: 0",
                "        line 1571: 5",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      21     0     s   Ljava/util/function/Supplier;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      21     0     s   Ljava/util/function/Supplier<+TT;>;",
                "    Signature: #313                         // <T:Ljava/lang/Object;>(Ljava/util/function/Supplier<+TT;>;)Ljava/util/stream/Stream<TT;>;"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x4d, name = "astore_2")
    @Instruction(value = 0x4e, name = "astore_3")
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0x9a, name = "ifne")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xc0, name = "checkcast")
    @Test
    public void test_48() {
        expectedConsecutiveLines = List.of(
                "  public static <T extends java.lang.Object> java.util.stream.Stream<T> concat(java.util.stream.Stream<? extends T>, java.util.stream.Stream<? extends T>);",
                "    descriptor: (Ljava/util/stream/Stream;Ljava/util/stream/Stream;)Ljava/util/stream/Stream;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=4, args_size=2",
                "         0: aload_0",
                "         1: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "         4: pop",
                "         5: aload_1",
                "         6: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "         9: pop",
                "        10: new           #125                // class java/util/stream/Streams$ConcatSpliterator$OfRef",
                "        13: dup",
                "        14: aload_0",
                "        15: invokeinterface #34,  1           // InterfaceMethod spliterator:()Ljava/util/Spliterator;",
                "        20: aload_1",
                "        21: invokeinterface #34,  1           // InterfaceMethod spliterator:()Ljava/util/Spliterator;",
                "        26: invokespecial #127                // Method java/util/stream/Streams$ConcatSpliterator$OfRef.\"<init>\":(Ljava/util/Spliterator;Ljava/util/Spliterator;)V",
                "        29: astore_2",
                "        30: aload_2",
                "        31: aload_0",
                "        32: invokeinterface #42,  1           // InterfaceMethod isParallel:()Z",
                "        37: ifne          49",
                "        40: aload_1",
                "        41: invokeinterface #42,  1           // InterfaceMethod isParallel:()Z",
                "        46: ifeq          53",
                "        49: iconst_1",
                "        50: goto          54",
                "        53: iconst_0",
                "        54: invokestatic  #46                 // Method java/util/stream/StreamSupport.stream:(Ljava/util/Spliterator;Z)Ljava/util/stream/Stream;",
                "        57: astore_3",
                "        58: aload_3",
                "        59: aload_0",
                "        60: aload_1",
                "        61: invokestatic  #130                // Method java/util/stream/Streams.composedClose:(Ljava/util/stream/BaseStream;Ljava/util/stream/BaseStream;)Ljava/lang/Runnable;",
                "        64: invokeinterface #56,  2           // InterfaceMethod onClose:(Ljava/lang/Runnable;)Ljava/util/stream/BaseStream;",
                "        69: checkcast     #12                 // class java/util/stream/Stream",
                "        72: areturn",
                "      LineNumberTable:",
                "        line 1613: 0",
                "        line 1614: 5",
                "        line 1617: 10",
                "        line 1618: 15",
                "        line 1619: 30",
                "        line 1620: 58",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      73     0     a   Ljava/util/stream/Stream;",
                "            0      73     1     b   Ljava/util/stream/Stream;",
                "           30      43     2 split   Ljava/util/Spliterator;",
                "           58      15     3 stream   Ljava/util/stream/Stream;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      73     0     a   Ljava/util/stream/Stream<+TT;>;",
                "            0      73     1     b   Ljava/util/stream/Stream<+TT;>;",
                "           30      43     2 split   Ljava/util/Spliterator<TT;>;",
                "           58      15     3 stream   Ljava/util/stream/Stream<TT;>;",
                "    Signature: #320                         // <T:Ljava/lang/Object;>(Ljava/util/stream/Stream<+TT;>;Ljava/util/stream/Stream<+TT;>;)Ljava/util/stream/Stream<TT;>;"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x4d, name = "astore_2")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xbb, name = "new")
    @Test
    public void test_49() {
        expectedConsecutiveLines = List.of(
                "  private static java.util.stream.DoubleStream lambda$mapMultiToDouble$3(java.util.function.BiConsumer, java.lang.Object);",
                "    descriptor: (Ljava/util/function/BiConsumer;Ljava/lang/Object;)Ljava/util/stream/DoubleStream;",
                "    flags: (0x100a) ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC",
                "    Code:",
                "      stack=3, locals=3, args_size=2",
                "         0: new           #136                // class java/util/stream/SpinedBuffer$OfDouble",
                "         3: dup",
                "         4: invokespecial #138                // Method java/util/stream/SpinedBuffer$OfDouble.\"<init>\":()V",
                "         7: astore_2",
                "         8: aload_0",
                "         9: aload_1",
                "        10: aload_2",
                "        11: invokeinterface #139,  3          // InterfaceMethod java/util/function/BiConsumer.accept:(Ljava/lang/Object;Ljava/lang/Object;)V",
                "        16: aload_2",
                "        17: invokevirtual #145                // Method java/util/stream/SpinedBuffer$OfDouble.spliterator:()Ljava/util/Spliterator$OfDouble;",
                "        20: iconst_0",
                "        21: invokestatic  #148                // Method java/util/stream/StreamSupport.doubleStream:(Ljava/util/Spliterator$OfDouble;Z)Ljava/util/stream/DoubleStream;",
                "        24: areturn",
                "      LineNumberTable:",
                "        line 543: 0",
                "        line 544: 8",
                "        line 545: 16",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      25     0 mapper   Ljava/util/function/BiConsumer;",
                "            0      25     1     e   Ljava/lang/Object;",
                "            8      17     2 buffer   Ljava/util/stream/SpinedBuffer$OfDouble;"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x4d, name = "astore_2")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xbb, name = "new")
    @Test
    public void test_50() {
        expectedConsecutiveLines = List.of(
                "  private static java.util.stream.LongStream lambda$mapMultiToLong$2(java.util.function.BiConsumer, java.lang.Object);",
                "    descriptor: (Ljava/util/function/BiConsumer;Ljava/lang/Object;)Ljava/util/stream/LongStream;",
                "    flags: (0x100a) ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC",
                "    Code:",
                "      stack=3, locals=3, args_size=2",
                "         0: new           #152                // class java/util/stream/SpinedBuffer$OfLong",
                "         3: dup",
                "         4: invokespecial #154                // Method java/util/stream/SpinedBuffer$OfLong.\"<init>\":()V",
                "         7: astore_2",
                "         8: aload_0",
                "         9: aload_1",
                "        10: aload_2",
                "        11: invokeinterface #139,  3          // InterfaceMethod java/util/function/BiConsumer.accept:(Ljava/lang/Object;Ljava/lang/Object;)V",
                "        16: aload_2",
                "        17: invokevirtual #155                // Method java/util/stream/SpinedBuffer$OfLong.spliterator:()Ljava/util/Spliterator$OfLong;",
                "        20: iconst_0",
                "        21: invokestatic  #158                // Method java/util/stream/StreamSupport.longStream:(Ljava/util/Spliterator$OfLong;Z)Ljava/util/stream/LongStream;",
                "        24: areturn",
                "      LineNumberTable:",
                "        line 505: 0",
                "        line 506: 8",
                "        line 507: 16",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      25     0 mapper   Ljava/util/function/BiConsumer;",
                "            0      25     1     e   Ljava/lang/Object;",
                "            8      17     2 buffer   Ljava/util/stream/SpinedBuffer$OfLong;"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x4d, name = "astore_2")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xbb, name = "new")
    @Test
    public void test_51() {
        expectedConsecutiveLines = List.of(
                "  private static java.util.stream.IntStream lambda$mapMultiToInt$1(java.util.function.BiConsumer, java.lang.Object);",
                "    descriptor: (Ljava/util/function/BiConsumer;Ljava/lang/Object;)Ljava/util/stream/IntStream;",
                "    flags: (0x100a) ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC",
                "    Code:",
                "      stack=3, locals=3, args_size=2",
                "         0: new           #162                // class java/util/stream/SpinedBuffer$OfInt",
                "         3: dup",
                "         4: invokespecial #164                // Method java/util/stream/SpinedBuffer$OfInt.\"<init>\":()V",
                "         7: astore_2",
                "         8: aload_0",
                "         9: aload_1",
                "        10: aload_2",
                "        11: invokeinterface #139,  3          // InterfaceMethod java/util/function/BiConsumer.accept:(Ljava/lang/Object;Ljava/lang/Object;)V",
                "        16: aload_2",
                "        17: invokevirtual #165                // Method java/util/stream/SpinedBuffer$OfInt.spliterator:()Ljava/util/Spliterator$OfInt;",
                "        20: iconst_0",
                "        21: invokestatic  #168                // Method java/util/stream/StreamSupport.intStream:(Ljava/util/Spliterator$OfInt;Z)Ljava/util/stream/IntStream;",
                "        24: areturn",
                "      LineNumberTable:",
                "        line 467: 0",
                "        line 468: 8",
                "        line 469: 16",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      25     0 mapper   Ljava/util/function/BiConsumer;",
                "            0      25     1     e   Ljava/lang/Object;",
                "            8      17     2 buffer   Ljava/util/stream/SpinedBuffer$OfInt;"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x4d, name = "astore_2")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xbb, name = "new")
    @Test
    public void test_52() {
        expectedConsecutiveLines = List.of(
                "  private static java.util.stream.Stream lambda$mapMulti$0(java.util.function.BiConsumer, java.lang.Object);",
                "    descriptor: (Ljava/util/function/BiConsumer;Ljava/lang/Object;)Ljava/util/stream/Stream;",
                "    flags: (0x100a) ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC",
                "    Code:",
                "      stack=3, locals=3, args_size=2",
                "         0: new           #172                // class java/util/stream/SpinedBuffer",
                "         3: dup",
                "         4: invokespecial #174                // Method java/util/stream/SpinedBuffer.\"<init>\":()V",
                "         7: astore_2",
                "         8: aload_0",
                "         9: aload_1",
                "        10: aload_2",
                "        11: invokeinterface #139,  3          // InterfaceMethod java/util/function/BiConsumer.accept:(Ljava/lang/Object;Ljava/lang/Object;)V",
                "        16: aload_2",
                "        17: invokevirtual #175                // Method java/util/stream/SpinedBuffer.spliterator:()Ljava/util/Spliterator;",
                "        20: iconst_0",
                "        21: invokestatic  #46                 // Method java/util/stream/StreamSupport.stream:(Ljava/util/Spliterator;Z)Ljava/util/stream/Stream;",
                "        24: areturn",
                "      LineNumberTable:",
                "        line 429: 0",
                "        line 430: 8",
                "        line 431: 16",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      25     0 mapper   Ljava/util/function/BiConsumer;",
                "            0      25     1     e   Ljava/lang/Object;",
                "            8      17     2 buffer   Ljava/util/stream/SpinedBuffer;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            8      17     2 buffer   Ljava/util/stream/SpinedBuffer<TR;>;"
        );
    }
}
