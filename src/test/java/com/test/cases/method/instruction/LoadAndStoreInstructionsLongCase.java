package com.test.cases.method.instruction;

/*

Load and Store Instructions
The load and store instructions transfer values between the local variables (§2.6.1) and the operand stack (§2.6.2) of a Java Virtual Machine frame (§2.6):

Load a local variable onto the operand stack: iload, iload_<n>, lload, lload_<n>, fload, fload_<n>, dload, dload_<n>, aload, aload_<n>.

Store a value from the operand stack into a local variable: istore, istore_<n>, lstore, lstore_<n>, fstore, fstore_<n>, dstore, dstore_<n>, astore, astore_<n>.

Load a constant on to the operand stack: bipush, sipush, ldc, ldc_w, ldc2_w, aconst_null, iconst_m1, iconst_<i>, lconst_<l>, fconst_<f>, dconst_<d>.

Gain access to more local variables using a wider index, or to a larger immediate operand: wide.
 */
public final class LoadAndStoreInstructionsLongCase implements InstructionAnalyzer {

    @Instruction(value = 0x9, name = "lconst_0")
    @Instruction(value = 0xa, name = "lconst_1")
    public void test_0x9_to_0xa() {
        long a = 0;
        a = 1L;
    }

    @Instruction(value = 0x16, name = "lload")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x20, name = "lload_2")
    public static long test_0x16_0x1e_to_0x20(long n1, long n2, long n3, long n4) {
        return n1 + n2 + n3 + n4;
    }

    @Instruction(value = 0x1f, name = "lload_1")
    @Instruction(value = 0x21, name = "lload_3")
    public long test_0x1f_0x21(long n1, long n2) {
        return n1 + n2;
    }

    // lstore = 55 (0x37)
    // lstore_0 = 63 (0x3f)
    //lstore_1 = 64 (0x40)
    //lstore_2 = 65 (0x41)
    //lstore_3 = 66 (0x42)
    @Instruction(value = 0x37, name = "lstore")
    @Instruction(value = 0x40, name = "lstore_1")
    @Instruction(value = 0x42, name = "lstore_3")
    public void test_0x37_0x40_0x42(long n1, long n2, long n3) {
        n1 = 1L;
        n2 = 1L;
        n3 = 1L;
    }

    @Instruction(value = 0x3f, name = "lstore_0")
    @Instruction(value = 0x41, name = "lstore_2")
    public static void test_0x3f_0x41(long n1, long n2) {
        n1 = 1L;
        n2 = 1L;
    }
}
