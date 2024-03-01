package com.test.cases.method.instruction;


import java.util.List;

/*

Load and Store Instructions
The load and store instructions transfer values between the local variables (§2.6.1) and the operand stack (§2.6.2) of a Java Virtual Machine frame (§2.6):

Load a local variable onto the operand stack: iload, iload_<n>, lload, lload_<n>, fload, fload_<n>, dload, dload_<n>, aload, aload_<n>.

Store a value from the operand stack into a local variable: istore, istore_<n>, lstore, lstore_<n>, fstore, fstore_<n>, dstore, dstore_<n>, astore, astore_<n>.

Load a constant on to the operand stack: bipush, sipush, ldc, ldc_w, ldc2_w, aconst_null, iconst_m1, iconst_<i>, lconst_<l>, fconst_<f>, dconst_<d>.

Gain access to more local variables using a wider index, or to a larger immediate operand: wide.
 */
public final class LoadAndStoreInstructionsIntCase implements InstructionAnalyzer {

    @Instruction(value = 0x2, name = "iconst_m1")
    @Instruction(value = 0x3, name = "iconst_0")
    @Instruction(value = 0x4, name = "iconst_1")
    @Instruction(value = 0x5, name = "iconst_2")
    @Instruction(value = 0x6, name = "iconst_3")
    @Instruction(value = 0x7, name = "iconst_4")
    @Instruction(value = 0x8, name = "iconst_5")
    public void test_0x2_to_0x8() {
        int b = -1;
        b = 0;
        b = 1;
        b = 2;
        b = 3;
        b = 4;
        b = 5;
    }

    @Instruction(value = 0x10, name = "bipush")
    public void test_0x10() {
        int a = 6;
        a = Byte.MAX_VALUE;
        a = Byte.MIN_VALUE;
        a = 42;
        a = -2;
    }

    @Instruction(value = 0x11, name = "sipush")
    public void test_0x11() {
        int a = 128;
        a = Short.MAX_VALUE;
        a = Short.MIN_VALUE;
        a = 420;
        a = -1008;
    }

    @Instruction(value = 0x12, name = "ldc", needMoreWork = true)
    public void test_0x12() {
        int a = 123456;
        float b = 123456.7f;
        String c = "Hello world";
        Class<?> d = Integer.class;
        d = List.class;
    }

    @Instruction(value = 0x15, name = "iload")
    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0x1c, name = "iload_2")
    @Instruction(value = 0x1d, name = "iload_3")
    public static int test_0x15_and_0x1a_to_0x1d(int n1, int n2, int n3, int n4, int n5) {
        return n1 + n2 + n3 + n4 + n5;
    }

    @Instruction(value = 0x36, name = "istore")
    public void test_0x36(int a, int b, int c, int d, int e, int f) {
        f = 1;
    }

    @Instruction(value = 0x3b, name = "istore_0")
    @Instruction(value = 0x3c, name = "istore_1")
    @Instruction(value = 0x3d, name = "istore_2")
    @Instruction(value = 0x3e, name = "istore_3")
    public static void test_0x3b_to_0x3e(int a, int b, int c, int d) {
        int n = 1;
        a = n;
        b = n;
        c = n;
        d = n;
    }
}
