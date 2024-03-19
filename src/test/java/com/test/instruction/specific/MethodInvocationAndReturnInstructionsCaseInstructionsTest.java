package com.test.instruction.specific;

import com.test.annotations.GeneratedBy;
import com.test.cases.method.instruction.Instruction;
import com.test.instruction.InstructionTestGenerator;
import com.test.method.MethodPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(InstructionTestGenerator.class)
public class MethodInvocationAndReturnInstructionsCaseInstructionsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.method.instruction.MethodInvocationAndReturnInstructionsCase"));
    }

    @Instruction(value = 0xb6, name = "invokevirtual")
    @Test
    public void test_0xb6() {
        expectedConsecutiveLines = List.of(
                "  public void test_0xb6(java.lang.Object);",
                "    descriptor: (Ljava/lang/Object;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=3, args_size=2",
                "         0: aload_1",
                "         1: invokevirtual #7                  // Method java/lang/Object.toString:()Ljava/lang/String;",
                "         4: astore_2",
                "         5: aload_0",
                "         6: invokevirtual #11                 // Method dummy1:()V",
                "         9: return",
                "      LineNumberTable:",
                "        line 9: 0",
                "        line 10: 5",
                "        line 11: 9",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      10     0  this   Lcom/test/cases/method/instruction/MethodInvocationAndReturnInstructionsCase;",
                "            0      10     1     o   Ljava/lang/Object;",
                "            5       5     2     s   Ljava/lang/String;"
        );
    }

    @Instruction(value = 0xb7, name = "invokespecial")
    @Test
    public void test_0xb7() {
        expectedConsecutiveLines = List.of(
                "  public void test_0xb7();",
                "    descriptor: ()V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=1",
                "         0: aload_0",
                "         1: invokespecial #7                  // Method java/lang/Object.toString:()Ljava/lang/String;",
                "         4: astore_1",
                "         5: new           #12                 // class com/test/cases/method/instruction/MethodInvocationAndReturnInstructionsCase",
                "         8: dup",
                "         9: invokespecial #16                 // Method \"<init>\":()V",
                "        12: pop",
                "        13: aload_0",
                "        14: invokevirtual #17                 // Method dummy2:()V",
                "        17: return",
                "      LineNumberTable:",
                "        line 27: 0",
                "        line 28: 5",
                "        line 29: 13",
                "        line 30: 17",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      18     0  this   Lcom/test/cases/method/instruction/MethodInvocationAndReturnInstructionsCase;",
                "            5      13     1     s   Ljava/lang/String;"
        );
    }

    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_0xb8() {
        expectedConsecutiveLines = List.of(
                "  public void test_0xb8();",
                "    descriptor: ()V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=2, args_size=1",
                "         0: bipush        42",
                "         2: invokestatic  #20                 // Method java/lang/Math.abs:(I)I",
                "         5: istore_1",
                "         6: invokestatic  #26                 // Method dummy3:()V",
                "         9: return",
                "      LineNumberTable:",
                "        line 34: 0",
                "        line 35: 6",
                "        line 36: 9",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      10     0  this   Lcom/test/cases/method/instruction/MethodInvocationAndReturnInstructionsCase;",
                "            6       4     1   ans   I"
        );
    }

    @Instruction(value = 0xb9, name = "invokeinterface")
    @Test
    public void test_0xb9() {
        expectedConsecutiveLines = List.of(
                "  public void test_0xb9(java.util.function.Supplier<java.lang.Integer>, com.test.cases.method.instruction.MethodInvocationAndReturnInstructionsCase);",
                "    descriptor: (Ljava/util/function/Supplier;Lcom/test/cases/method/instruction/MethodInvocationAndReturnInstructionsCase;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=3, args_size=3",
                "         0: aload_1",
                "         1: invokeinterface #29,  1           // InterfaceMethod java/util/function/Supplier.get:()Ljava/lang/Object;",
                "         6: pop",
                "         7: aload_2",
                "         8: invokevirtual #35                 // Method buildInstructionMap:()Ljava/util/Map;",
                "        11: pop",
                "        12: aload_2",
                "        13: invokeinterface #39,  1           // InterfaceMethod com/test/cases/method/instruction/InstructionAnalyzer.buildInstructionMap:()Ljava/util/Map;",
                "        18: pop",
                "        19: return",
                "      LineNumberTable:",
                "        line 40: 0",
                "        line 41: 7",
                "        line 42: 12",
                "        line 43: 19",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      20     0  this   Lcom/test/cases/method/instruction/MethodInvocationAndReturnInstructionsCase;",
                "            0      20     1 supplier   Ljava/util/function/Supplier;",
                "            0      20     2     o   Lcom/test/cases/method/instruction/MethodInvocationAndReturnInstructionsCase;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      20     1 supplier   Ljava/util/function/Supplier<Ljava/lang/Integer;>;",
                "    Signature: #100                         // (Ljava/util/function/Supplier<Ljava/lang/Integer;>;Lcom/test/cases/method/instruction/MethodInvocationAndReturnInstructionsCase;)V"
        );
    }

    @Instruction(value = 0xba, name = "invokedynamic")
    @Test
    public void test_0xba() {
        expectedConsecutiveLines = List.of(
                "  public void test_0xba();",
                "    descriptor: ()V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=2, args_size=1",
                "         0: invokedynamic #42,  0             // InvokeDynamic #0:get:()Ljava/util/function/Supplier;",
                "         5: astore_1",
                "         6: aload_1",
                "         7: invokeinterface #29,  1           // InterfaceMethod java/util/function/Supplier.get:()Ljava/lang/Object;",
                "        12: pop",
                "        13: return",
                "      LineNumberTable:",
                "        line 47: 0",
                "        line 48: 6",
                "        line 49: 13",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      14     0  this   Lcom/test/cases/method/instruction/MethodInvocationAndReturnInstructionsCase;",
                "            6       8     1 supplier   Ljava/util/function/Supplier;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            6       8     1 supplier   Ljava/util/function/Supplier<Ljava/lang/String;>;"
        );
    }

    @Instruction(value = 0xac, name = "ireturn")
    @Test
    public void test_0xac() {
        expectedConsecutiveLines = List.of(
                "  public int test_0xac(int);",
                "    descriptor: (I)I",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=2, args_size=2",
                "         0: iload_1",
                "         1: ireturn",
                "      LineNumberTable:",
                "        line 53: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       2     0  this   Lcom/test/cases/method/instruction/MethodInvocationAndReturnInstructionsCase;",
                "            0       2     1 number   I"
        );
    }

    @Instruction(value = 0xad, name = "lreturn")
    @Test
    public void test_0xad() {
        expectedConsecutiveLines = List.of(
                "  public long test_0xad(long);",
                "    descriptor: (J)J",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=3, args_size=2",
                "         0: lload_1",
                "         1: lreturn",
                "      LineNumberTable:",
                "        line 58: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       2     0  this   Lcom/test/cases/method/instruction/MethodInvocationAndReturnInstructionsCase;",
                "            0       2     1 number   J"
        );
    }

    @Instruction(value = 0xae, name = "freturn")
    @Test
    public void test_0xae() {
        expectedConsecutiveLines = List.of(
                "  public float test_0xae(float);",
                "    descriptor: (F)F",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=2, args_size=2",
                "         0: fload_1",
                "         1: freturn",
                "      LineNumberTable:",
                "        line 63: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       2     0  this   Lcom/test/cases/method/instruction/MethodInvocationAndReturnInstructionsCase;",
                "            0       2     1 number   F"
        );
    }

    @Instruction(value = 0xaf, name = "dreturn")
    @Test
    public void test_0xaf() {
        expectedConsecutiveLines = List.of(
                "  public double test_0xaf(double);",
                "    descriptor: (D)D",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=3, args_size=2",
                "         0: dload_1",
                "         1: dreturn",
                "      LineNumberTable:",
                "        line 68: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       2     0  this   Lcom/test/cases/method/instruction/MethodInvocationAndReturnInstructionsCase;",
                "            0       2     1 number   D"
        );
    }

    @Instruction(value = 0xb0, name = "areturn")
    @Test
    public void test_0xb0() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Object test_0xb0(java.lang.Object);",
                "    descriptor: (Ljava/lang/Object;)Ljava/lang/Object;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=2, args_size=2",
                "         0: aload_1",
                "         1: areturn",
                "      LineNumberTable:",
                "        line 73: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       2     0  this   Lcom/test/cases/method/instruction/MethodInvocationAndReturnInstructionsCase;",
                "            0       2     1     o   Ljava/lang/Object;"
        );
    }

    @Instruction(value = 0xb1, name = "return")
    @Test
    public void test_0xb1() {
        expectedConsecutiveLines = List.of(
                "  public void test_0xb1();",
                "    descriptor: ()V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=0, locals=1, args_size=1",
                "         0: return",
                "      LineNumberTable:",
                "        line 78: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       1     0  this   Lcom/test/cases/method/instruction/MethodInvocationAndReturnInstructionsCase;"
        );
    }
}
