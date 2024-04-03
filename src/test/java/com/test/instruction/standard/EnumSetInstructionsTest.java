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
public class EnumSetInstructionsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.util.EnumSet"));
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0xb1, name = "return")
    @Instruction(value = 0xb5, name = "putfield")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Test
    public void test_1() {
        expectedConsecutiveLines = List.of(
                "  java.util.EnumSet(java.lang.Class<E>, java.lang.Enum<?>[]);",
                "    descriptor: (Ljava/lang/Class;[Ljava/lang/Enum;)V",
                "    flags: (0x0000)",
                "    Code:",
                "      stack=2, locals=3, args_size=3",
                "         0: aload_0",
                "         1: invokespecial #1                  // Method java/util/AbstractSet.\"<init>\":()V",
                "         4: aload_0",
                "         5: aload_1",
                "         6: putfield      #7                  // Field elementType:Ljava/lang/Class;",
                "         9: aload_0",
                "        10: aload_2",
                "        11: putfield      #13                 // Field universe:[Ljava/lang/Enum;",
                "        14: return",
                "      LineNumberTable:",
                "        line 98: 0",
                "        line 99: 4",
                "        line 100: 9",
                "        line 101: 14",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      15     0  this   Ljava/util/EnumSet;",
                "            0      15     1 elementType   Ljava/lang/Class;",
                "            0      15     2 universe   [Ljava/lang/Enum;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      15     0  this   Ljava/util/EnumSet<TE;>;",
                "            0      15     1 elementType   Ljava/lang/Class<TE;>;",
                "            0      15     2 universe   [Ljava/lang/Enum<*>;",
                "    Signature: #177                         // (Ljava/lang/Class<TE;>;[Ljava/lang/Enum<*>;)V"
        );
    }

    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x12, name = "ldc")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x4c, name = "astore_1")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xa3, name = "if_icmpgt")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbe, name = "arraylength")
    @Instruction(value = 0xbf, name = "athrow")
    @Instruction(value = 0xc7, name = "ifnonnull")
    @Test
    public void test_2() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> noneOf(java.lang.Class<E>);",
                "    descriptor: (Ljava/lang/Class;)Ljava/util/EnumSet;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=2, args_size=1",
                "         0: aload_0",
                "         1: invokestatic  #17                 // Method getUniverse:(Ljava/lang/Class;)[Ljava/lang/Enum;",
                "         4: astore_1",
                "         5: aload_1",
                "         6: ifnonnull     36",
                "         9: new           #21                 // class java/lang/ClassCastException",
                "        12: dup",
                "        13: new           #23                 // class java/lang/StringBuilder",
                "        16: dup",
                "        17: invokespecial #25                 // Method java/lang/StringBuilder.\"<init>\":()V",
                "        20: aload_0",
                "        21: invokevirtual #26                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;",
                "        24: ldc           #30                 // String  not an enum",
                "        26: invokevirtual #32                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "        29: invokevirtual #35                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;",
                "        32: invokespecial #39                 // Method java/lang/ClassCastException.\"<init>\":(Ljava/lang/String;)V",
                "        35: athrow",
                "        36: aload_1",
                "        37: arraylength",
                "        38: bipush        64",
                "        40: if_icmpgt     53",
                "        43: new           #42                 // class java/util/RegularEnumSet",
                "        46: dup",
                "        47: aload_0",
                "        48: aload_1",
                "        49: invokespecial #44                 // Method java/util/RegularEnumSet.\"<init>\":(Ljava/lang/Class;[Ljava/lang/Enum;)V",
                "        52: areturn",
                "        53: new           #47                 // class java/util/JumboEnumSet",
                "        56: dup",
                "        57: aload_0",
                "        58: aload_1",
                "        59: invokespecial #49                 // Method java/util/JumboEnumSet.\"<init>\":(Ljava/lang/Class;[Ljava/lang/Enum;)V",
                "        62: areturn",
                "      LineNumberTable:",
                "        line 113: 0",
                "        line 114: 5",
                "        line 115: 9",
                "        line 117: 36",
                "        line 118: 43",
                "        line 120: 53",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      63     0 elementType   Ljava/lang/Class;",
                "            5      58     1 universe   [Ljava/lang/Enum;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      63     0 elementType   Ljava/lang/Class<TE;>;",
                "            5      58     1 universe   [Ljava/lang/Enum<*>;",
                "      StackMapTable: number_of_entries = 2",
                "        frame_type = 252 /* append */",
                "          offset_delta = 36",
                "          locals = [ class \"[Ljava/lang/Enum;\" ]",
                "        frame_type = 16 /* same */",
                "    Signature: #180                         // <E:Ljava/lang/Enum<TE;>;>(Ljava/lang/Class<TE;>;)Ljava/util/EnumSet<TE;>;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x4c, name = "astore_1")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_3() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> allOf(java.lang.Class<E>);",
                "    descriptor: (Ljava/lang/Class;)Ljava/util/EnumSet;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=1, locals=2, args_size=1",
                "         0: aload_0",
                "         1: invokestatic  #50                 // Method noneOf:(Ljava/lang/Class;)Ljava/util/EnumSet;",
                "         4: astore_1",
                "         5: aload_1",
                "         6: invokevirtual #54                 // Method addAll:()V",
                "         9: aload_1",
                "        10: areturn",
                "      LineNumberTable:",
                "        line 134: 0",
                "        line 135: 5",
                "        line 136: 9",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      11     0 elementType   Ljava/lang/Class;",
                "            5       6     1 result   Ljava/util/EnumSet;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      11     0 elementType   Ljava/lang/Class<TE;>;",
                "            5       6     1 result   Ljava/util/EnumSet<TE;>;",
                "    Signature: #180                         // <E:Ljava/lang/Enum<TE;>;>(Ljava/lang/Class<TE;>;)Ljava/util/EnumSet<TE;>;"
        );
    }

    @Test
    public void test_4() {
        expectedConsecutiveLines = List.of(
                "  abstract void addAll();",
                "    descriptor: ()V",
                "    flags: (0x0400) ACC_ABSTRACT"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Test
    public void test_5() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> copyOf(java.util.EnumSet<E>);",
                "    descriptor: (Ljava/util/EnumSet;)Ljava/util/EnumSet;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: invokevirtual #57                 // Method clone:()Ljava/util/EnumSet;",
                "         4: areturn",
                "      LineNumberTable:",
                "        line 155: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       5     0     s   Ljava/util/EnumSet;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       5     0     s   Ljava/util/EnumSet<TE;>;",
                "    Signature: #184                         // <E:Ljava/lang/Enum<TE;>;>(Ljava/util/EnumSet<TE;>;)Ljava/util/EnumSet<TE;>;"
        );
    }

    @Instruction(value = 0x12, name = "ldc")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x4c, name = "astore_1")
    @Instruction(value = 0x4d, name = "astore_2")
    @Instruction(value = 0x4e, name = "astore_3")
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbf, name = "athrow")
    @Instruction(value = 0xc0, name = "checkcast")
    @Instruction(value = 0xc1, name = "instanceof")
    @Test
    public void test_6() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> copyOf(java.util.Collection<E>);",
                "    descriptor: (Ljava/util/Collection;)Ljava/util/EnumSet;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=3, locals=4, args_size=1",
                "         0: aload_0",
                "         1: instanceof    #8                  // class java/util/EnumSet",
                "         4: ifeq          15",
                "         7: aload_0",
                "         8: checkcast     #8                  // class java/util/EnumSet",
                "        11: invokevirtual #57                 // Method clone:()Ljava/util/EnumSet;",
                "        14: areturn",
                "        15: aload_0",
                "        16: invokeinterface #61,  1           // InterfaceMethod java/util/Collection.isEmpty:()Z",
                "        21: ifeq          34",
                "        24: new           #67                 // class java/lang/IllegalArgumentException",
                "        27: dup",
                "        28: ldc           #69                 // String Collection is empty",
                "        30: invokespecial #71                 // Method java/lang/IllegalArgumentException.\"<init>\":(Ljava/lang/String;)V",
                "        33: athrow",
                "        34: aload_0",
                "        35: invokeinterface #72,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;",
                "        40: astore_1",
                "        41: aload_1",
                "        42: invokeinterface #76,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;",
                "        47: checkcast     #82                 // class java/lang/Enum",
                "        50: astore_2",
                "        51: aload_2",
                "        52: invokestatic  #84                 // Method of:(Ljava/lang/Enum;)Ljava/util/EnumSet;",
                "        55: astore_3",
                "        56: aload_1",
                "        57: invokeinterface #88,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z",
                "        62: ifeq          82",
                "        65: aload_3",
                "        66: aload_1",
                "        67: invokeinterface #76,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;",
                "        72: checkcast     #82                 // class java/lang/Enum",
                "        75: invokevirtual #91                 // Method add:(Ljava/lang/Object;)Z",
                "        78: pop",
                "        79: goto          56",
                "        82: aload_3",
                "        83: areturn",
                "      LineNumberTable:",
                "        line 173: 0",
                "        line 174: 7",
                "        line 176: 15",
                "        line 177: 24",
                "        line 178: 34",
                "        line 179: 41",
                "        line 180: 51",
                "        line 181: 56",
                "        line 182: 65",
                "        line 183: 82",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "           41      43     1     i   Ljava/util/Iterator;",
                "           51      33     2 first   Ljava/lang/Enum;",
                "           56      28     3 result   Ljava/util/EnumSet;",
                "            0      84     0     c   Ljava/util/Collection;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "           41      43     1     i   Ljava/util/Iterator<TE;>;",
                "           51      33     2 first   TE;",
                "           56      28     3 result   Ljava/util/EnumSet<TE;>;",
                "            0      84     0     c   Ljava/util/Collection<TE;>;",
                "      StackMapTable: number_of_entries = 4",
                "        frame_type = 15 /* same */",
                "        frame_type = 18 /* same */",
                "        frame_type = 254 /* append */",
                "          offset_delta = 21",
                "          locals = [ class java/util/Iterator, class java/lang/Enum, class java/util/EnumSet ]",
                "        frame_type = 25 /* same */",
                "    Signature: #195                         // <E:Ljava/lang/Enum<TE;>;>(Ljava/util/Collection<TE;>;)Ljava/util/EnumSet<TE;>;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x4c, name = "astore_1")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_7() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> complementOf(java.util.EnumSet<E>);",
                "    descriptor: (Ljava/util/EnumSet;)Ljava/util/EnumSet;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=1, locals=2, args_size=1",
                "         0: aload_0",
                "         1: invokestatic  #95                 // Method copyOf:(Ljava/util/EnumSet;)Ljava/util/EnumSet;",
                "         4: astore_1",
                "         5: aload_1",
                "         6: invokevirtual #99                 // Method complement:()V",
                "         9: aload_1",
                "        10: areturn",
                "      LineNumberTable:",
                "        line 198: 0",
                "        line 199: 5",
                "        line 200: 9",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      11     0     s   Ljava/util/EnumSet;",
                "            5       6     1 result   Ljava/util/EnumSet;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      11     0     s   Ljava/util/EnumSet<TE;>;",
                "            5       6     1 result   Ljava/util/EnumSet<TE;>;",
                "    Signature: #184                         // <E:Ljava/lang/Enum<TE;>;>(Ljava/util/EnumSet<TE;>;)Ljava/util/EnumSet<TE;>;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x4c, name = "astore_1")
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_8() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> of(E);",
                "    descriptor: (Ljava/lang/Enum;)Ljava/util/EnumSet;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=2, args_size=1",
                "         0: aload_0",
                "         1: invokevirtual #102                // Method java/lang/Enum.getDeclaringClass:()Ljava/lang/Class;",
                "         4: invokestatic  #50                 // Method noneOf:(Ljava/lang/Class;)Ljava/util/EnumSet;",
                "         7: astore_1",
                "         8: aload_1",
                "         9: aload_0",
                "        10: invokevirtual #91                 // Method add:(Ljava/lang/Object;)Z",
                "        13: pop",
                "        14: aload_1",
                "        15: areturn",
                "      LineNumberTable:",
                "        line 218: 0",
                "        line 219: 8",
                "        line 220: 14",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      16     0     e   Ljava/lang/Enum;",
                "            8       8     1 result   Ljava/util/EnumSet;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      16     0     e   TE;",
                "            8       8     1 result   Ljava/util/EnumSet<TE;>;",
                "    Signature: #198                         // <E:Ljava/lang/Enum<TE;>;>(TE;)Ljava/util/EnumSet<TE;>;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x4d, name = "astore_2")
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_9() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> of(E, E);",
                "    descriptor: (Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=3, args_size=2",
                "         0: aload_0",
                "         1: invokevirtual #102                // Method java/lang/Enum.getDeclaringClass:()Ljava/lang/Class;",
                "         4: invokestatic  #50                 // Method noneOf:(Ljava/lang/Class;)Ljava/util/EnumSet;",
                "         7: astore_2",
                "         8: aload_2",
                "         9: aload_0",
                "        10: invokevirtual #91                 // Method add:(Ljava/lang/Object;)Z",
                "        13: pop",
                "        14: aload_2",
                "        15: aload_1",
                "        16: invokevirtual #91                 // Method add:(Ljava/lang/Object;)Z",
                "        19: pop",
                "        20: aload_2",
                "        21: areturn",
                "      LineNumberTable:",
                "        line 239: 0",
                "        line 240: 8",
                "        line 241: 14",
                "        line 242: 20",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      22     0    e1   Ljava/lang/Enum;",
                "            0      22     1    e2   Ljava/lang/Enum;",
                "            8      14     2 result   Ljava/util/EnumSet;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      22     0    e1   TE;",
                "            0      22     1    e2   TE;",
                "            8      14     2 result   Ljava/util/EnumSet<TE;>;",
                "    Signature: #202                         // <E:Ljava/lang/Enum<TE;>;>(TE;TE;)Ljava/util/EnumSet<TE;>;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x4e, name = "astore_3")
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_10() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> of(E, E, E);",
                "    descriptor: (Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=4, args_size=3",
                "         0: aload_0",
                "         1: invokevirtual #102                // Method java/lang/Enum.getDeclaringClass:()Ljava/lang/Class;",
                "         4: invokestatic  #50                 // Method noneOf:(Ljava/lang/Class;)Ljava/util/EnumSet;",
                "         7: astore_3",
                "         8: aload_3",
                "         9: aload_0",
                "        10: invokevirtual #91                 // Method add:(Ljava/lang/Object;)Z",
                "        13: pop",
                "        14: aload_3",
                "        15: aload_1",
                "        16: invokevirtual #91                 // Method add:(Ljava/lang/Object;)Z",
                "        19: pop",
                "        20: aload_3",
                "        21: aload_2",
                "        22: invokevirtual #91                 // Method add:(Ljava/lang/Object;)Z",
                "        25: pop",
                "        26: aload_3",
                "        27: areturn",
                "      LineNumberTable:",
                "        line 262: 0",
                "        line 263: 8",
                "        line 264: 14",
                "        line 265: 20",
                "        line 266: 26",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      28     0    e1   Ljava/lang/Enum;",
                "            0      28     1    e2   Ljava/lang/Enum;",
                "            0      28     2    e3   Ljava/lang/Enum;",
                "            8      20     3 result   Ljava/util/EnumSet;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      28     0    e1   TE;",
                "            0      28     1    e2   TE;",
                "            0      28     2    e3   TE;",
                "            8      20     3 result   Ljava/util/EnumSet<TE;>;",
                "    Signature: #205                         // <E:Ljava/lang/Enum<TE;>;>(TE;TE;TE;)Ljava/util/EnumSet<TE;>;"
        );
    }

    @Instruction(value = 0x19, name = "aload")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x3a, name = "astore")
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_11() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> of(E, E, E, E);",
                "    descriptor: (Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=5, args_size=4",
                "         0: aload_0",
                "         1: invokevirtual #102                // Method java/lang/Enum.getDeclaringClass:()Ljava/lang/Class;",
                "         4: invokestatic  #50                 // Method noneOf:(Ljava/lang/Class;)Ljava/util/EnumSet;",
                "         7: astore        4",
                "         9: aload         4",
                "        11: aload_0",
                "        12: invokevirtual #91                 // Method add:(Ljava/lang/Object;)Z",
                "        15: pop",
                "        16: aload         4",
                "        18: aload_1",
                "        19: invokevirtual #91                 // Method add:(Ljava/lang/Object;)Z",
                "        22: pop",
                "        23: aload         4",
                "        25: aload_2",
                "        26: invokevirtual #91                 // Method add:(Ljava/lang/Object;)Z",
                "        29: pop",
                "        30: aload         4",
                "        32: aload_3",
                "        33: invokevirtual #91                 // Method add:(Ljava/lang/Object;)Z",
                "        36: pop",
                "        37: aload         4",
                "        39: areturn",
                "      LineNumberTable:",
                "        line 287: 0",
                "        line 288: 9",
                "        line 289: 16",
                "        line 290: 23",
                "        line 291: 30",
                "        line 292: 37",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      40     0    e1   Ljava/lang/Enum;",
                "            0      40     1    e2   Ljava/lang/Enum;",
                "            0      40     2    e3   Ljava/lang/Enum;",
                "            0      40     3    e4   Ljava/lang/Enum;",
                "            9      31     4 result   Ljava/util/EnumSet;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      40     0    e1   TE;",
                "            0      40     1    e2   TE;",
                "            0      40     2    e3   TE;",
                "            0      40     3    e4   TE;",
                "            9      31     4 result   Ljava/util/EnumSet<TE;>;",
                "    Signature: #208                         // <E:Ljava/lang/Enum<TE;>;>(TE;TE;TE;TE;)Ljava/util/EnumSet<TE;>;"
        );
    }

    @Instruction(value = 0x19, name = "aload")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x3a, name = "astore")
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_12() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> of(E, E, E, E, E);",
                "    descriptor: (Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=6, args_size=5",
                "         0: aload_0",
                "         1: invokevirtual #102                // Method java/lang/Enum.getDeclaringClass:()Ljava/lang/Class;",
                "         4: invokestatic  #50                 // Method noneOf:(Ljava/lang/Class;)Ljava/util/EnumSet;",
                "         7: astore        5",
                "         9: aload         5",
                "        11: aload_0",
                "        12: invokevirtual #91                 // Method add:(Ljava/lang/Object;)Z",
                "        15: pop",
                "        16: aload         5",
                "        18: aload_1",
                "        19: invokevirtual #91                 // Method add:(Ljava/lang/Object;)Z",
                "        22: pop",
                "        23: aload         5",
                "        25: aload_2",
                "        26: invokevirtual #91                 // Method add:(Ljava/lang/Object;)Z",
                "        29: pop",
                "        30: aload         5",
                "        32: aload_3",
                "        33: invokevirtual #91                 // Method add:(Ljava/lang/Object;)Z",
                "        36: pop",
                "        37: aload         5",
                "        39: aload         4",
                "        41: invokevirtual #91                 // Method add:(Ljava/lang/Object;)Z",
                "        44: pop",
                "        45: aload         5",
                "        47: areturn",
                "      LineNumberTable:",
                "        line 316: 0",
                "        line 317: 9",
                "        line 318: 16",
                "        line 319: 23",
                "        line 320: 30",
                "        line 321: 37",
                "        line 322: 45",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      48     0    e1   Ljava/lang/Enum;",
                "            0      48     1    e2   Ljava/lang/Enum;",
                "            0      48     2    e3   Ljava/lang/Enum;",
                "            0      48     3    e4   Ljava/lang/Enum;",
                "            0      48     4    e5   Ljava/lang/Enum;",
                "            9      39     5 result   Ljava/util/EnumSet;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      48     0    e1   TE;",
                "            0      48     1    e2   TE;",
                "            0      48     2    e3   TE;",
                "            0      48     3    e4   TE;",
                "            0      48     4    e5   TE;",
                "            9      39     5 result   Ljava/util/EnumSet<TE;>;",
                "    Signature: #211                         // <E:Ljava/lang/Enum<TE;>;>(TE;TE;TE;TE;TE;)Ljava/util/EnumSet<TE;>;"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x15, name = "iload")
    @Instruction(value = 0x19, name = "aload")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x32, name = "aaload")
    @Instruction(value = 0x36, name = "istore")
    @Instruction(value = 0x3a, name = "astore")
    @Instruction(value = 0x4d, name = "astore_2")
    @Instruction(value = 0x4e, name = "astore_3")
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0x84, name = "iinc")
    @Instruction(value = 0xa2, name = "if_icmpge")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xbe, name = "arraylength")
    @Test
    public void test_13() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> of(E, E...);",
                "    descriptor: (Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;",
                "    flags: (0x0089) ACC_PUBLIC, ACC_STATIC, ACC_VARARGS",
                "    Code:",
                "      stack=2, locals=7, args_size=2",
                "         0: aload_0",
                "         1: invokevirtual #102                // Method java/lang/Enum.getDeclaringClass:()Ljava/lang/Class;",
                "         4: invokestatic  #50                 // Method noneOf:(Ljava/lang/Class;)Ljava/util/EnumSet;",
                "         7: astore_2",
                "         8: aload_2",
                "         9: aload_0",
                "        10: invokevirtual #91                 // Method add:(Ljava/lang/Object;)Z",
                "        13: pop",
                "        14: aload_1",
                "        15: astore_3",
                "        16: aload_3",
                "        17: arraylength",
                "        18: istore        4",
                "        20: iconst_0",
                "        21: istore        5",
                "        23: iload         5",
                "        25: iload         4",
                "        27: if_icmpge     49",
                "        30: aload_3",
                "        31: iload         5",
                "        33: aaload",
                "        34: astore        6",
                "        36: aload_2",
                "        37: aload         6",
                "        39: invokevirtual #91                 // Method add:(Ljava/lang/Object;)Z",
                "        42: pop",
                "        43: iinc          5, 1",
                "        46: goto          23",
                "        49: aload_2",
                "        50: areturn",
                "      LineNumberTable:",
                "        line 341: 0",
                "        line 342: 8",
                "        line 343: 14",
                "        line 344: 36",
                "        line 343: 43",
                "        line 345: 49",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "           36       7     6     e   Ljava/lang/Enum;",
                "            0      51     0 first   Ljava/lang/Enum;",
                "            0      51     1  rest   [Ljava/lang/Enum;",
                "            8      43     2 result   Ljava/util/EnumSet;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "           36       7     6     e   TE;",
                "            0      51     0 first   TE;",
                "            0      51     1  rest   [TE;",
                "            8      43     2 result   Ljava/util/EnumSet<TE;>;",
                "      StackMapTable: number_of_entries = 2",
                "        frame_type = 255 /* full_frame */",
                "          offset_delta = 23",
                "          locals = [ class java/lang/Enum, class \"[Ljava/lang/Enum;\", class java/util/EnumSet, class \"[Ljava/lang/Enum;\", int, int ]",
                "          stack = []",
                "        frame_type = 248 /* chop */",
                "          offset_delta = 25",
                "    Signature: #215                         // <E:Ljava/lang/Enum<TE;>;>(TE;[TE;)Ljava/util/EnumSet<TE;>;"
        );
    }

    @Instruction(value = 0x12, name = "ldc")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x4d, name = "astore_2")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0x9e, name = "ifle")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbf, name = "athrow")
    @Test
    public void test_14() {
        expectedConsecutiveLines = List.of(
                "  public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> range(E, E);",
                "    descriptor: (Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=3, args_size=2",
                "         0: aload_0",
                "         1: aload_1",
                "         2: invokevirtual #106                // Method java/lang/Enum.compareTo:(Ljava/lang/Enum;)I",
                "         5: ifle          39",
                "         8: new           #67                 // class java/lang/IllegalArgumentException",
                "        11: dup",
                "        12: new           #23                 // class java/lang/StringBuilder",
                "        15: dup",
                "        16: invokespecial #25                 // Method java/lang/StringBuilder.\"<init>\":()V",
                "        19: aload_0",
                "        20: invokevirtual #26                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;",
                "        23: ldc           #110                // String  >",
                "        25: invokevirtual #32                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "        28: aload_1",
                "        29: invokevirtual #26                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;",
                "        32: invokevirtual #35                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;",
                "        35: invokespecial #71                 // Method java/lang/IllegalArgumentException.\"<init>\":(Ljava/lang/String;)V",
                "        38: athrow",
                "        39: aload_0",
                "        40: invokevirtual #102                // Method java/lang/Enum.getDeclaringClass:()Ljava/lang/Class;",
                "        43: invokestatic  #50                 // Method noneOf:(Ljava/lang/Class;)Ljava/util/EnumSet;",
                "        46: astore_2",
                "        47: aload_2",
                "        48: aload_0",
                "        49: aload_1",
                "        50: invokevirtual #112                // Method addRange:(Ljava/lang/Enum;Ljava/lang/Enum;)V",
                "        53: aload_2",
                "        54: areturn",
                "      LineNumberTable:",
                "        line 363: 0",
                "        line 364: 8",
                "        line 365: 39",
                "        line 366: 47",
                "        line 367: 53",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      55     0  from   Ljava/lang/Enum;",
                "            0      55     1    to   Ljava/lang/Enum;",
                "           47       8     2 result   Ljava/util/EnumSet;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      55     0  from   TE;",
                "            0      55     1    to   TE;",
                "           47       8     2 result   Ljava/util/EnumSet<TE;>;",
                "      StackMapTable: number_of_entries = 1",
                "        frame_type = 39 /* same */",
                "    Signature: #202                         // <E:Ljava/lang/Enum<TE;>;>(TE;TE;)Ljava/util/EnumSet<TE;>;"
        );
    }

    @Test
    public void test_15() {
        expectedConsecutiveLines = List.of(
                "  abstract void addRange(E, E);",
                "    descriptor: (Ljava/lang/Enum;Ljava/lang/Enum;)V",
                "    flags: (0x0400) ACC_ABSTRACT",
                "    Signature: #221                         // (TE;TE;)V"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x4c, name = "astore_1")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbf, name = "athrow")
    @Instruction(value = 0xc0, name = "checkcast")
    @Test
    public void test_16() {
        expectedConsecutiveLines = List.of(
                "  public java.util.EnumSet<E> clone();",
                "    descriptor: ()Ljava/util/EnumSet;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=2, args_size=1",
                "         0: aload_0",
                "         1: invokespecial #116                // Method java/lang/Object.clone:()Ljava/lang/Object;",
                "         4: checkcast     #8                  // class java/util/EnumSet",
                "         7: areturn",
                "         8: astore_1",
                "         9: new           #122                // class java/lang/AssertionError",
                "        12: dup",
                "        13: aload_1",
                "        14: invokespecial #124                // Method java/lang/AssertionError.\"<init>\":(Ljava/lang/Object;)V",
                "        17: athrow",
                "      Exception table:",
                "         from    to  target type",
                "             0     7     8   Class java/lang/CloneNotSupportedException",
                "      LineNumberTable:",
                "        line 384: 0",
                "        line 385: 8",
                "        line 386: 9",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            9       9     1     e   Ljava/lang/CloneNotSupportedException;",
                "            0      18     0  this   Ljava/util/EnumSet;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      18     0  this   Ljava/util/EnumSet<TE;>;",
                "      StackMapTable: number_of_entries = 1",
                "        frame_type = 72 /* same_locals_1_stack_item */",
                "          stack = [ class java/lang/CloneNotSupportedException ]",
                "    Signature: #223                         // ()Ljava/util/EnumSet<TE;>;"
        );
    }

    @Test
    public void test_17() {
        expectedConsecutiveLines = List.of(
                "  abstract void complement();",
                "    descriptor: ()V",
                "    flags: (0x0400) ACC_ABSTRACT"
        );
    }

    @Instruction(value = 0x12, name = "ldc")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x4d, name = "astore_2")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xa5, name = "if_acmpeq")
    @Instruction(value = 0xb1, name = "return")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbf, name = "athrow")
    @Test
    public void test_18() {
        expectedConsecutiveLines = List.of(
                "  final void typeCheck(E);",
                "    descriptor: (Ljava/lang/Enum;)V",
                "    flags: (0x0010) ACC_FINAL",
                "    Code:",
                "      stack=4, locals=3, args_size=2",
                "         0: aload_1",
                "         1: invokevirtual #127                // Method java/lang/Object.getClass:()Ljava/lang/Class;",
                "         4: astore_2",
                "         5: aload_2",
                "         6: aload_0",
                "         7: getfield      #7                  // Field elementType:Ljava/lang/Class;",
                "        10: if_acmpeq     58",
                "        13: aload_2",
                "        14: invokevirtual #130                // Method java/lang/Class.getSuperclass:()Ljava/lang/Class;",
                "        17: aload_0",
                "        18: getfield      #7                  // Field elementType:Ljava/lang/Class;",
                "        21: if_acmpeq     58",
                "        24: new           #21                 // class java/lang/ClassCastException",
                "        27: dup",
                "        28: new           #23                 // class java/lang/StringBuilder",
                "        31: dup",
                "        32: invokespecial #25                 // Method java/lang/StringBuilder.\"<init>\":()V",
                "        35: aload_2",
                "        36: invokevirtual #26                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;",
                "        39: ldc           #135                // String  !=",
                "        41: invokevirtual #32                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "        44: aload_0",
                "        45: getfield      #7                  // Field elementType:Ljava/lang/Class;",
                "        48: invokevirtual #26                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;",
                "        51: invokevirtual #35                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;",
                "        54: invokespecial #39                 // Method java/lang/ClassCastException.\"<init>\":(Ljava/lang/String;)V",
                "        57: athrow",
                "        58: return",
                "      LineNumberTable:",
                "        line 399: 0",
                "        line 400: 5",
                "        line 401: 24",
                "        line 402: 58",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      59     0  this   Ljava/util/EnumSet;",
                "            0      59     1     e   Ljava/lang/Enum;",
                "            5      54     2 eClass   Ljava/lang/Class;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      59     0  this   Ljava/util/EnumSet<TE;>;",
                "            0      59     1     e   TE;",
                "            5      54     2 eClass   Ljava/lang/Class<*>;",
                "      StackMapTable: number_of_entries = 1",
                "        frame_type = 252 /* append */",
                "          offset_delta = 58",
                "          locals = [ class java/lang/Class ]",
                "    Signature: #228                         // (TE;)V"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Test
    public void test_19() {
        expectedConsecutiveLines = List.of(
                "  private static <E extends java.lang.Enum<E>> E[] getUniverse(java.lang.Class<E>);",
                "    descriptor: (Ljava/lang/Class;)[Ljava/lang/Enum;",
                "    flags: (0x000a) ACC_PRIVATE, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: invokestatic  #137                // Method jdk/internal/access/SharedSecrets.getJavaLangAccess:()Ljdk/internal/access/JavaLangAccess;",
                "         3: aload_0",
                "         4: invokeinterface #143,  2          // InterfaceMethod jdk/internal/access/JavaLangAccess.getEnumConstantsShared:(Ljava/lang/Class;)[Ljava/lang/Enum;",
                "         9: areturn",
                "      LineNumberTable:",
                "        line 409: 0",
                "        line 410: 4",
                "        line 409: 9",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      10     0 elementType   Ljava/lang/Class;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      10     0 elementType   Ljava/lang/Class<TE;>;",
                "    Signature: #229                         // <E:Ljava/lang/Enum<TE;>;>(Ljava/lang/Class<TE;>;)[TE;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xbb, name = "new")
    @Test
    public void test_20() {
        expectedConsecutiveLines = List.of(
                "  java.lang.Object writeReplace();",
                "    descriptor: ()Ljava/lang/Object;",
                "    flags: (0x0000)",
                "    Code:",
                "      stack=3, locals=1, args_size=1",
                "         0: new           #148                // class java/util/EnumSet$SerializationProxy",
                "         3: dup",
                "         4: aload_0",
                "         5: invokespecial #150                // Method java/util/EnumSet$SerializationProxy.\"<init>\":(Ljava/util/EnumSet;)V",
                "         8: areturn",
                "      LineNumberTable:",
                "        line 481: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       9     0  this   Ljava/util/EnumSet;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       9     0  this   Ljava/util/EnumSet<TE;>;"
        );
    }

    @Instruction(value = 0x12, name = "ldc")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbf, name = "athrow")
    @Test
    public void test_21() {
        expectedConsecutiveLines = List.of(
                "  private void readObject(java.io.ObjectInputStream) throws java.io.InvalidObjectException;",
                "    descriptor: (Ljava/io/ObjectInputStream;)V",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=3, locals=2, args_size=2",
                "         0: new           #153                // class java/io/InvalidObjectException",
                "         3: dup",
                "         4: ldc           #155                // String Proxy required",
                "         6: invokespecial #157                // Method java/io/InvalidObjectException.\"<init>\":(Ljava/lang/String;)V",
                "         9: athrow",
                "      LineNumberTable:",
                "        line 492: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      10     0  this   Ljava/util/EnumSet;",
                "            0      10     1     s   Ljava/io/ObjectInputStream;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      10     0  this   Ljava/util/EnumSet<TE;>;",
                "    Exceptions:",
                "      throws java.io.InvalidObjectException"
        );
    }

    @Instruction(value = 0x12, name = "ldc")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbf, name = "athrow")
    @Test
    public void test_22() {
        expectedConsecutiveLines = List.of(
                "  private void readObjectNoData() throws java.io.InvalidObjectException;",
                "    descriptor: ()V",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=3, locals=1, args_size=1",
                "         0: new           #153                // class java/io/InvalidObjectException",
                "         3: dup",
                "         4: ldc           #155                // String Proxy required",
                "         6: invokespecial #157                // Method java/io/InvalidObjectException.\"<init>\":(Ljava/lang/String;)V",
                "         9: athrow",
                "      LineNumberTable:",
                "        line 502: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      10     0  this   Ljava/util/EnumSet;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      10     0  this   Ljava/util/EnumSet<TE;>;",
                "    Exceptions:",
                "      throws java.io.InvalidObjectException"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Test
    public void test_23() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Object clone() throws java.lang.CloneNotSupportedException;",
                "    descriptor: ()Ljava/lang/Object;",
                "    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: invokevirtual #57                 // Method clone:()Ljava/util/EnumSet;",
                "         4: areturn",
                "      LineNumberTable:",
                "        line 81: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       5     0  this   Ljava/util/EnumSet;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       5     0  this   Ljava/util/EnumSet<TE;>;",
                "    Exceptions:",
                "      throws java.lang.CloneNotSupportedException"
        );
    }
}
