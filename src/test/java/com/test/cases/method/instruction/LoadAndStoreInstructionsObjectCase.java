package com.test.cases.method.instruction;

/*

Load and Store Instructions
The load and store instructions transfer values between the local variables (§2.6.1) and the operand stack (§2.6.2) of a Java Virtual Machine frame (§2.6):

Load a local variable onto the operand stack: iload, iload_<n>, lload, lload_<n>, fload, fload_<n>, dload, dload_<n>, aload, aload_<n>.

Store a value from the operand stack into a local variable: istore, istore_<n>, lstore, lstore_<n>, fstore, fstore_<n>, dstore, dstore_<n>, astore, astore_<n>.

Load a constant on to the operand stack: bipush, sipush, ldc, ldc_w, ldc2_w, aconst_null, iconst_m1, iconst_<i>, lconst_<l>, fconst_<f>, dconst_<d>.

Gain access to more local variables using a wider index, or to a larger immediate operand: wide.
 */
public final class LoadAndStoreInstructionsObjectCase implements InstructionAnalyzer {

    @Instruction(value = 0x1, name = "aconst_null")
    public void test_0x1() {
        Object a = null;
    }

    // aload = 25 (0x19)
    // aload_0 = 42 (0x2a)
    //aload_1 = 43 (0x2b)
    //aload_2 = 44 (0x2c)
    //aload_3 = 45 (0x2d)
    @Instruction(value = 0x19, name = "aload")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x2d, name = "aload_3")
    public static void test_0x19_0x2a_to_0x2d(String s1, String s2, String s3, String s4, String s5) {
        String s = s1;
        s = s2;
        s = s3;
        s = s4;
        s = s5;
    }

    // astore = 58 (0x3a)
    // astore_0 = 75 (0x4b)
    //astore_1 = 76 (0x4c)
    //astore_2 = 77 (0x4d)
    //astore_3 = 78 (0x4e)
    @Instruction(value = 0x3a, name = "astore")
    @Instruction(value = 0x4b, name = "astore_0")
    @Instruction(value = 0x4c, name = "astore_1")
    @Instruction(value = 0x4d, name = "astore_2")
    @Instruction(value = 0x4e, name = "astore_3")
    public static void test_0x3a_0x4b_to_0x4e(String s1, String s2, String s3, String s4, String s5) {
        String temp = "Hello";
        s1 = temp;
        s2 = temp;
        s3 = temp;
        s4 = temp;
        s5 = temp;
    }
}
