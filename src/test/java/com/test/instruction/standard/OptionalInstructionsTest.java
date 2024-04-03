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
public class OptionalInstructionsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.util.Optional"));
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x4b, name = "astore_0")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb2, name = "getstatic")
    @Test
    public void test_1() {
        expectedConsecutiveLines = List.of(
                "  public static <T extends java.lang.Object> java.util.Optional<T> empty();",
                "    descriptor: ()Ljava/util/Optional;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=1, locals=1, args_size=0",
                "         0: getstatic     #1                  // Field EMPTY:Ljava/util/Optional;",
                "         3: astore_0",
                "         4: aload_0",
                "         5: areturn",
                "      LineNumberTable:",
                "        line 88: 0",
                "        line 89: 4",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            4       2     0     t   Ljava/util/Optional;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            4       2     0     t   Ljava/util/Optional<TT;>;",
                "    Signature: #123                         // <T:Ljava/lang/Object;>()Ljava/util/Optional<TT;>;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0xb1, name = "return")
    @Instruction(value = 0xb5, name = "putfield")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Test
    public void test_2() {
        expectedConsecutiveLines = List.of(
                "  private java.util.Optional(T);",
                "    descriptor: (Ljava/lang/Object;)V",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_0",
                "         1: invokespecial #7                  // Method java/lang/Object.\"<init>\":()V",
                "         4: aload_0",
                "         5: aload_1",
                "         6: putfield      #13                 // Field value:Ljava/lang/Object;",
                "         9: return",
                "      LineNumberTable:",
                "        line 99: 0",
                "        line 100: 4",
                "        line 101: 9",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      10     0  this   Ljava/util/Optional;",
                "            0      10     1 value   Ljava/lang/Object;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      10     0  this   Ljava/util/Optional<TT;>;",
                "            0      10     1 value   TT;",
                "    Signature: #125                         // (TT;)V"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xbb, name = "new")
    @Test
    public void test_3() {
        expectedConsecutiveLines = List.of(
                "  public static <T extends java.lang.Object> java.util.Optional<T> of(T);",
                "    descriptor: (Ljava/lang/Object;)Ljava/util/Optional;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=3, locals=1, args_size=1",
                "         0: new           #2                  // class java/util/Optional",
                "         3: dup",
                "         4: aload_0",
                "         5: invokestatic  #17                 // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "         8: invokespecial #23                 // Method \"<init>\":(Ljava/lang/Object;)V",
                "        11: areturn",
                "      LineNumberTable:",
                "        line 113: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      12     0 value   Ljava/lang/Object;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      12     0 value   TT;",
                "    Signature: #126                         // <T:Ljava/lang/Object;>(TT;)Ljava/util/Optional<TT;>;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb2, name = "getstatic")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xc7, name = "ifnonnull")
    @Test
    public void test_4() {
        expectedConsecutiveLines = List.of(
                "  public static <T extends java.lang.Object> java.util.Optional<T> ofNullable(T);",
                "    descriptor: (Ljava/lang/Object;)Ljava/util/Optional;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=3, locals=1, args_size=1",
                "         0: aload_0",
                "         1: ifnonnull     10",
                "         4: getstatic     #1                  // Field EMPTY:Ljava/util/Optional;",
                "         7: goto          18",
                "        10: new           #2                  // class java/util/Optional",
                "        13: dup",
                "        14: aload_0",
                "        15: invokespecial #23                 // Method \"<init>\":(Ljava/lang/Object;)V",
                "        18: areturn",
                "      LineNumberTable:",
                "        line 127: 0",
                "        line 128: 10",
                "        line 127: 18",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      19     0 value   Ljava/lang/Object;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      19     0 value   TT;",
                "      StackMapTable: number_of_entries = 2",
                "        frame_type = 10 /* same */",
                "        frame_type = 71 /* same_locals_1_stack_item */",
                "          stack = [ class java/util/Optional ]",
                "    Signature: #126                         // <T:Ljava/lang/Object;>(TT;)Ljava/util/Optional<TT;>;"
        );
    }

    @Instruction(value = 0x12, name = "ldc")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbf, name = "athrow")
    @Instruction(value = 0xc7, name = "ifnonnull")
    @Test
    public void test_5() {
        expectedConsecutiveLines = List.of(
                "  public T get();",
                "    descriptor: ()Ljava/lang/Object;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #13                 // Field value:Ljava/lang/Object;",
                "         4: ifnonnull     17",
                "         7: new           #26                 // class java/util/NoSuchElementException",
                "        10: dup",
                "        11: ldc           #28                 // String No value present",
                "        13: invokespecial #30                 // Method java/util/NoSuchElementException.\"<init>\":(Ljava/lang/String;)V",
                "        16: athrow",
                "        17: aload_0",
                "        18: getfield      #13                 // Field value:Ljava/lang/Object;",
                "        21: areturn",
                "      LineNumberTable:",
                "        line 142: 0",
                "        line 143: 7",
                "        line 145: 17",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      22     0  this   Ljava/util/Optional;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      22     0  this   Ljava/util/Optional<TT;>;",
                "      StackMapTable: number_of_entries = 1",
                "        frame_type = 17 /* same */",
                "    Signature: #128                         // ()TT;"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xc6, name = "ifnull")
    @Test
    public void test_6() {
        expectedConsecutiveLines = List.of(
                "  public boolean isPresent();",
                "    descriptor: ()Z",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #13                 // Field value:Ljava/lang/Object;",
                "         4: ifnull        11",
                "         7: iconst_1",
                "         8: goto          12",
                "        11: iconst_0",
                "        12: ireturn",
                "      LineNumberTable:",
                "        line 154: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      13     0  this   Ljava/util/Optional;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      13     0  this   Ljava/util/Optional<TT;>;",
                "      StackMapTable: number_of_entries = 2",
                "        frame_type = 11 /* same */",
                "        frame_type = 64 /* same_locals_1_stack_item */",
                "          stack = [ int ]"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xc7, name = "ifnonnull")
    @Test
    public void test_7() {
        expectedConsecutiveLines = List.of(
                "  public boolean isEmpty();",
                "    descriptor: ()Z",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #13                 // Field value:Ljava/lang/Object;",
                "         4: ifnonnull     11",
                "         7: iconst_1",
                "         8: goto          12",
                "        11: iconst_0",
                "        12: ireturn",
                "      LineNumberTable:",
                "        line 165: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      13     0  this   Ljava/util/Optional;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      13     0  this   Ljava/util/Optional<TT;>;",
                "      StackMapTable: number_of_entries = 2",
                "        frame_type = 11 /* same */",
                "        frame_type = 64 /* same_locals_1_stack_item */",
                "          stack = [ int ]"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0xb1, name = "return")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xc6, name = "ifnull")
    @Test
    public void test_8() {
        expectedConsecutiveLines = List.of(
                "  public void ifPresent(java.util.function.Consumer<? super T>);",
                "    descriptor: (Ljava/util/function/Consumer;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_0",
                "         1: getfield      #13                 // Field value:Ljava/lang/Object;",
                "         4: ifnull        17",
                "         7: aload_1",
                "         8: aload_0",
                "         9: getfield      #13                 // Field value:Ljava/lang/Object;",
                "        12: invokeinterface #33,  2           // InterfaceMethod java/util/function/Consumer.accept:(Ljava/lang/Object;)V",
                "        17: return",
                "      LineNumberTable:",
                "        line 177: 0",
                "        line 178: 7",
                "        line 180: 17",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      18     0  this   Ljava/util/Optional;",
                "            0      18     1 action   Ljava/util/function/Consumer;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      18     0  this   Ljava/util/Optional<TT;>;",
                "            0      18     1 action   Ljava/util/function/Consumer<-TT;>;",
                "      StackMapTable: number_of_entries = 1",
                "        frame_type = 17 /* same */",
                "    Signature: #134                         // (Ljava/util/function/Consumer<-TT;>;)V"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xb1, name = "return")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xc6, name = "ifnull")
    @Test
    public void test_9() {
        expectedConsecutiveLines = List.of(
                "  public void ifPresentOrElse(java.util.function.Consumer<? super T>, java.lang.Runnable);",
                "    descriptor: (Ljava/util/function/Consumer;Ljava/lang/Runnable;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=3, args_size=3",
                "         0: aload_0",
                "         1: getfield      #13                 // Field value:Ljava/lang/Object;",
                "         4: ifnull        20",
                "         7: aload_1",
                "         8: aload_0",
                "         9: getfield      #13                 // Field value:Ljava/lang/Object;",
                "        12: invokeinterface #33,  2           // InterfaceMethod java/util/function/Consumer.accept:(Ljava/lang/Object;)V",
                "        17: goto          26",
                "        20: aload_2",
                "        21: invokeinterface #38,  1           // InterfaceMethod java/lang/Runnable.run:()V",
                "        26: return",
                "      LineNumberTable:",
                "        line 195: 0",
                "        line 196: 7",
                "        line 198: 20",
                "        line 200: 26",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      27     0  this   Ljava/util/Optional;",
                "            0      27     1 action   Ljava/util/function/Consumer;",
                "            0      27     2 emptyAction   Ljava/lang/Runnable;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      27     0  this   Ljava/util/Optional<TT;>;",
                "            0      27     1 action   Ljava/util/function/Consumer<-TT;>;",
                "      StackMapTable: number_of_entries = 2",
                "        frame_type = 20 /* same */",
                "        frame_type = 5 /* same */",
                "    Signature: #139                         // (Ljava/util/function/Consumer<-TT;>;Ljava/lang/Runnable;)V"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Test
    public void test_10() {
        expectedConsecutiveLines = List.of(
                "  public java.util.Optional<T> filter(java.util.function.Predicate<? super T>);",
                "    descriptor: (Ljava/util/function/Predicate;)Ljava/util/Optional;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_1",
                "         1: invokestatic  #17                 // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "         4: pop",
                "         5: aload_0",
                "         6: invokevirtual #43                 // Method isEmpty:()Z",
                "         9: ifeq          14",
                "        12: aload_0",
                "        13: areturn",
                "        14: aload_1",
                "        15: aload_0",
                "        16: getfield      #13                 // Field value:Ljava/lang/Object;",
                "        19: invokeinterface #47,  2           // InterfaceMethod java/util/function/Predicate.test:(Ljava/lang/Object;)Z",
                "        24: ifeq          31",
                "        27: aload_0",
                "        28: goto          34",
                "        31: invokestatic  #53                 // Method empty:()Ljava/util/Optional;",
                "        34: areturn",
                "      LineNumberTable:",
                "        line 214: 0",
                "        line 215: 5",
                "        line 216: 12",
                "        line 218: 14",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      35     0  this   Ljava/util/Optional;",
                "            0      35     1 predicate   Ljava/util/function/Predicate;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      35     0  this   Ljava/util/Optional<TT;>;",
                "            0      35     1 predicate   Ljava/util/function/Predicate<-TT;>;",
                "      StackMapTable: number_of_entries = 3",
                "        frame_type = 14 /* same */",
                "        frame_type = 16 /* same */",
                "        frame_type = 66 /* same_locals_1_stack_item */",
                "          stack = [ class java/util/Optional ]",
                "    Signature: #145                         // (Ljava/util/function/Predicate<-TT;>;)Ljava/util/Optional<TT;>;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Test
    public void test_11() {
        expectedConsecutiveLines = List.of(
                "  public <U extends java.lang.Object> java.util.Optional<U> map(java.util.function.Function<? super T, ? extends U>);",
                "    descriptor: (Ljava/util/function/Function;)Ljava/util/Optional;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_1",
                "         1: invokestatic  #17                 // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "         4: pop",
                "         5: aload_0",
                "         6: invokevirtual #43                 // Method isEmpty:()Z",
                "         9: ifeq          16",
                "        12: invokestatic  #53                 // Method empty:()Ljava/util/Optional;",
                "        15: areturn",
                "        16: aload_1",
                "        17: aload_0",
                "        18: getfield      #13                 // Field value:Ljava/lang/Object;",
                "        21: invokeinterface #57,  2           // InterfaceMethod java/util/function/Function.apply:(Ljava/lang/Object;)Ljava/lang/Object;",
                "        26: invokestatic  #62                 // Method ofNullable:(Ljava/lang/Object;)Ljava/util/Optional;",
                "        29: areturn",
                "      LineNumberTable:",
                "        line 256: 0",
                "        line 257: 5",
                "        line 258: 12",
                "        line 260: 16",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      30     0  this   Ljava/util/Optional;",
                "            0      30     1 mapper   Ljava/util/function/Function;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      30     0  this   Ljava/util/Optional<TT;>;",
                "            0      30     1 mapper   Ljava/util/function/Function<-TT;+TU;>;",
                "      StackMapTable: number_of_entries = 1",
                "        frame_type = 16 /* same */",
                "    Signature: #151                         // <U:Ljava/lang/Object;>(Ljava/util/function/Function<-TT;+TU;>;)Ljava/util/Optional<TU;>;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x4d, name = "astore_2")
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xc0, name = "checkcast")
    @Test
    public void test_12() {
        expectedConsecutiveLines = List.of(
                "  public <U extends java.lang.Object> java.util.Optional<U> flatMap(java.util.function.Function<? super T, ? extends java.util.Optional<? extends U>>);",
                "    descriptor: (Ljava/util/function/Function;)Ljava/util/Optional;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=3, args_size=2",
                "         0: aload_1",
                "         1: invokestatic  #17                 // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "         4: pop",
                "         5: aload_0",
                "         6: invokevirtual #43                 // Method isEmpty:()Z",
                "         9: ifeq          16",
                "        12: invokestatic  #53                 // Method empty:()Ljava/util/Optional;",
                "        15: areturn",
                "        16: aload_1",
                "        17: aload_0",
                "        18: getfield      #13                 // Field value:Ljava/lang/Object;",
                "        21: invokeinterface #57,  2           // InterfaceMethod java/util/function/Function.apply:(Ljava/lang/Object;)Ljava/lang/Object;",
                "        26: checkcast     #2                  // class java/util/Optional",
                "        29: astore_2",
                "        30: aload_2",
                "        31: invokestatic  #17                 // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "        34: checkcast     #2                  // class java/util/Optional",
                "        37: areturn",
                "      LineNumberTable:",
                "        line 284: 0",
                "        line 285: 5",
                "        line 286: 12",
                "        line 289: 16",
                "        line 290: 30",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "           30       8     2     r   Ljava/util/Optional;",
                "            0      38     0  this   Ljava/util/Optional;",
                "            0      38     1 mapper   Ljava/util/function/Function;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "           30       8     2     r   Ljava/util/Optional<TU;>;",
                "            0      38     0  this   Ljava/util/Optional<TT;>;",
                "            0      38     1 mapper   Ljava/util/function/Function<-TT;+Ljava/util/Optional<+TU;>;>;",
                "      StackMapTable: number_of_entries = 1",
                "        frame_type = 16 /* same */",
                "    Signature: #156                         // <U:Ljava/lang/Object;>(Ljava/util/function/Function<-TT;+Ljava/util/Optional<+TU;>;>;)Ljava/util/Optional<TU;>;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x4d, name = "astore_2")
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xc0, name = "checkcast")
    @Test
    public void test_13() {
        expectedConsecutiveLines = List.of(
                "  public java.util.Optional<T> or(java.util.function.Supplier<? extends java.util.Optional<? extends T>>);",
                "    descriptor: (Ljava/util/function/Supplier;)Ljava/util/Optional;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=3, args_size=2",
                "         0: aload_1",
                "         1: invokestatic  #17                 // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "         4: pop",
                "         5: aload_0",
                "         6: invokevirtual #66                 // Method isPresent:()Z",
                "         9: ifeq          14",
                "        12: aload_0",
                "        13: areturn",
                "        14: aload_1",
                "        15: invokeinterface #69,  1           // InterfaceMethod java/util/function/Supplier.get:()Ljava/lang/Object;",
                "        20: checkcast     #2                  // class java/util/Optional",
                "        23: astore_2",
                "        24: aload_2",
                "        25: invokestatic  #17                 // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "        28: checkcast     #2                  // class java/util/Optional",
                "        31: areturn",
                "      LineNumberTable:",
                "        line 308: 0",
                "        line 309: 5",
                "        line 310: 12",
                "        line 313: 14",
                "        line 314: 24",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "           24       8     2     r   Ljava/util/Optional;",
                "            0      32     0  this   Ljava/util/Optional;",
                "            0      32     1 supplier   Ljava/util/function/Supplier;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "           24       8     2     r   Ljava/util/Optional<TT;>;",
                "            0      32     0  this   Ljava/util/Optional<TT;>;",
                "            0      32     1 supplier   Ljava/util/function/Supplier<+Ljava/util/Optional<+TT;>;>;",
                "      StackMapTable: number_of_entries = 1",
                "        frame_type = 14 /* same */",
                "    Signature: #162                         // (Ljava/util/function/Supplier<+Ljava/util/Optional<+TT;>;>;)Ljava/util/Optional<TT;>;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_14() {
        expectedConsecutiveLines = List.of(
                "  public java.util.stream.Stream<T> stream();",
                "    descriptor: ()Ljava/util/stream/Stream;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: invokevirtual #43                 // Method isEmpty:()Z",
                "         4: ifeq          11",
                "         7: invokestatic  #75                 // InterfaceMethod java/util/stream/Stream.empty:()Ljava/util/stream/Stream;",
                "        10: areturn",
                "        11: aload_0",
                "        12: getfield      #13                 // Field value:Ljava/lang/Object;",
                "        15: invokestatic  #80                 // InterfaceMethod java/util/stream/Stream.of:(Ljava/lang/Object;)Ljava/util/stream/Stream;",
                "        18: areturn",
                "      LineNumberTable:",
                "        line 334: 0",
                "        line 335: 7",
                "        line 337: 11",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      19     0  this   Ljava/util/Optional;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      19     0  this   Ljava/util/Optional<TT;>;",
                "      StackMapTable: number_of_entries = 1",
                "        frame_type = 11 /* same */",
                "    Signature: #164                         // ()Ljava/util/stream/Stream<TT;>;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xc6, name = "ifnull")
    @Test
    public void test_15() {
        expectedConsecutiveLines = List.of(
                "  public T orElse(T);",
                "    descriptor: (Ljava/lang/Object;)Ljava/lang/Object;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=2, args_size=2",
                "         0: aload_0",
                "         1: getfield      #13                 // Field value:Ljava/lang/Object;",
                "         4: ifnull        14",
                "         7: aload_0",
                "         8: getfield      #13                 // Field value:Ljava/lang/Object;",
                "        11: goto          15",
                "        14: aload_1",
                "        15: areturn",
                "      LineNumberTable:",
                "        line 350: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      16     0  this   Ljava/util/Optional;",
                "            0      16     1 other   Ljava/lang/Object;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      16     0  this   Ljava/util/Optional<TT;>;",
                "            0      16     1 other   TT;",
                "      StackMapTable: number_of_entries = 2",
                "        frame_type = 14 /* same */",
                "        frame_type = 64 /* same_locals_1_stack_item */",
                "          stack = [ class java/lang/Object ]",
                "    Signature: #167                         // (TT;)TT;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xc6, name = "ifnull")
    @Test
    public void test_16() {
        expectedConsecutiveLines = List.of(
                "  public T orElseGet(java.util.function.Supplier<? extends T>);",
                "    descriptor: (Ljava/util/function/Supplier;)Ljava/lang/Object;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=2, args_size=2",
                "         0: aload_0",
                "         1: getfield      #13                 // Field value:Ljava/lang/Object;",
                "         4: ifnull        14",
                "         7: aload_0",
                "         8: getfield      #13                 // Field value:Ljava/lang/Object;",
                "        11: goto          20",
                "        14: aload_1",
                "        15: invokeinterface #69,  1           // InterfaceMethod java/util/function/Supplier.get:()Ljava/lang/Object;",
                "        20: areturn",
                "      LineNumberTable:",
                "        line 364: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      21     0  this   Ljava/util/Optional;",
                "            0      21     1 supplier   Ljava/util/function/Supplier;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      21     0  this   Ljava/util/Optional<TT;>;",
                "            0      21     1 supplier   Ljava/util/function/Supplier<+TT;>;",
                "      StackMapTable: number_of_entries = 2",
                "        frame_type = 14 /* same */",
                "        frame_type = 69 /* same_locals_1_stack_item */",
                "          stack = [ class java/lang/Object ]",
                "    Signature: #171                         // (Ljava/util/function/Supplier<+TT;>;)TT;"
        );
    }

    @Instruction(value = 0x12, name = "ldc")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbf, name = "athrow")
    @Instruction(value = 0xc7, name = "ifnonnull")
    @Test
    public void test_17() {
        expectedConsecutiveLines = List.of(
                "  public T orElseThrow();",
                "    descriptor: ()Ljava/lang/Object;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #13                 // Field value:Ljava/lang/Object;",
                "         4: ifnonnull     17",
                "         7: new           #26                 // class java/util/NoSuchElementException",
                "        10: dup",
                "        11: ldc           #28                 // String No value present",
                "        13: invokespecial #30                 // Method java/util/NoSuchElementException.\"<init>\":(Ljava/lang/String;)V",
                "        16: athrow",
                "        17: aload_0",
                "        18: getfield      #13                 // Field value:Ljava/lang/Object;",
                "        21: areturn",
                "      LineNumberTable:",
                "        line 376: 0",
                "        line 377: 7",
                "        line 379: 17",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      22     0  this   Ljava/util/Optional;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      22     0  this   Ljava/util/Optional<TT;>;",
                "      StackMapTable: number_of_entries = 1",
                "        frame_type = 17 /* same */",
                "    Signature: #128                         // ()TT;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xbf, name = "athrow")
    @Instruction(value = 0xc0, name = "checkcast")
    @Instruction(value = 0xc6, name = "ifnull")
    @Test
    public void test_18() {
        expectedConsecutiveLines = List.of(
                "  public <X extends java.lang.Throwable> T orElseThrow(java.util.function.Supplier<? extends X>) throws X;",
                "    descriptor: (Ljava/util/function/Supplier;)Ljava/lang/Object;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=2, args_size=2",
                "         0: aload_0",
                "         1: getfield      #13                 // Field value:Ljava/lang/Object;",
                "         4: ifnull        12",
                "         7: aload_0",
                "         8: getfield      #13                 // Field value:Ljava/lang/Object;",
                "        11: areturn",
                "        12: aload_1",
                "        13: invokeinterface #69,  1           // InterfaceMethod java/util/function/Supplier.get:()Ljava/lang/Object;",
                "        18: checkcast     #84                 // class java/lang/Throwable",
                "        21: athrow",
                "      LineNumberTable:",
                "        line 400: 0",
                "        line 401: 7",
                "        line 403: 12",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      22     0  this   Ljava/util/Optional;",
                "            0      22     1 exceptionSupplier   Ljava/util/function/Supplier;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      22     0  this   Ljava/util/Optional<TT;>;",
                "            0      22     1 exceptionSupplier   Ljava/util/function/Supplier<+TX;>;",
                "      StackMapTable: number_of_entries = 1",
                "        frame_type = 12 /* same */",
                "    Exceptions:",
                "      throws java.lang.Throwable",
                "    Signature: #176                         // <X:Ljava/lang/Throwable;>(Ljava/util/function/Supplier<+TX;>;)TT;^TX;"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x4d, name = "astore_2")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0xa6, name = "if_acmpne")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xc0, name = "checkcast")
    @Instruction(value = 0xc1, name = "instanceof")
    @Test
    public void test_19() {
        expectedConsecutiveLines = List.of(
                "  public boolean equals(java.lang.Object);",
                "    descriptor: (Ljava/lang/Object;)Z",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=3, args_size=2",
                "         0: aload_0",
                "         1: aload_1",
                "         2: if_acmpne     7",
                "         5: iconst_1",
                "         6: ireturn",
                "         7: aload_1",
                "         8: instanceof    #2                  // class java/util/Optional",
                "        11: ifeq          37",
                "        14: aload_1",
                "        15: checkcast     #2                  // class java/util/Optional",
                "        18: astore_2",
                "        19: aload_0",
                "        20: getfield      #13                 // Field value:Ljava/lang/Object;",
                "        23: aload_2",
                "        24: getfield      #13                 // Field value:Ljava/lang/Object;",
                "        27: invokestatic  #86                 // Method java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z",
                "        30: ifeq          37",
                "        33: iconst_1",
                "        34: goto          38",
                "        37: iconst_0",
                "        38: ireturn",
                "      LineNumberTable:",
                "        line 422: 0",
                "        line 423: 5",
                "        line 427: 7",
                "        line 426: 14",
                "        line 427: 27",
                "        line 426: 38",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "           19      18     2 other   Ljava/util/Optional;",
                "            0      39     0  this   Ljava/util/Optional;",
                "            0      39     1   obj   Ljava/lang/Object;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "           19      18     2 other   Ljava/util/Optional<*>;",
                "            0      39     0  this   Ljava/util/Optional<TT;>;",
                "      StackMapTable: number_of_entries = 3",
                "        frame_type = 7 /* same */",
                "        frame_type = 29 /* same */",
                "        frame_type = 64 /* same_locals_1_stack_item */",
                "          stack = [ int ]"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_20() {
        expectedConsecutiveLines = List.of(
                "  public int hashCode();",
                "    descriptor: ()I",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #13                 // Field value:Ljava/lang/Object;",
                "         4: invokestatic  #90                 // Method java/util/Objects.hashCode:(Ljava/lang/Object;)I",
                "         7: ireturn",
                "      LineNumberTable:",
                "        line 439: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       8     0  this   Ljava/util/Optional;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       8     0  this   Ljava/util/Optional<TT;>;"
        );
    }

    @Instruction(value = 0x12, name = "ldc")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xc6, name = "ifnull")
    @Test
    public void test_21() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.String toString();",
                "    descriptor: ()Ljava/lang/String;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #13                 // Field value:Ljava/lang/Object;",
                "         4: ifnull        37",
                "         7: new           #94                 // class java/lang/StringBuilder",
                "        10: dup",
                "        11: invokespecial #96                 // Method java/lang/StringBuilder.\"<init>\":()V",
                "        14: ldc           #97                 // String Optional[",
                "        16: invokevirtual #99                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "        19: aload_0",
                "        20: getfield      #13                 // Field value:Ljava/lang/Object;",
                "        23: invokevirtual #103                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;",
                "        26: ldc           #106                // String ]",
                "        28: invokevirtual #99                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "        31: invokevirtual #108                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;",
                "        34: goto          39",
                "        37: ldc           #112                // String Optional.empty",
                "        39: areturn",
                "      LineNumberTable:",
                "        line 456: 0",
                "        line 457: 7",
                "        line 458: 37",
                "        line 456: 39",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      40     0  this   Ljava/util/Optional;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      40     0  this   Ljava/util/Optional<TT;>;",
                "      StackMapTable: number_of_entries = 2",
                "        frame_type = 37 /* same */",
                "        frame_type = 65 /* same_locals_1_stack_item */",
                "          stack = [ class java/lang/String ]"
        );
    }
}
