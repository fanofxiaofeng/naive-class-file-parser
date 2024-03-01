package com.test.cases.method.instruction;

/*

Load and Store Instructions
The load and store instructions transfer values between the local variables (§2.6.1) and the operand stack (§2.6.2) of a Java Virtual Machine frame (§2.6):

Load a local variable onto the operand stack: iload, iload_<n>, lload, lload_<n>, fload, fload_<n>, dload, dload_<n>, aload, aload_<n>.

Store a value from the operand stack into a local variable: istore, istore_<n>, lstore, lstore_<n>, fstore, fstore_<n>, dstore, dstore_<n>, astore, astore_<n>.

Load a constant on to the operand stack: bipush, sipush, ldc, ldc_w, ldc2_w, aconst_null, iconst_m1, iconst_<i>, lconst_<l>, fconst_<f>, dconst_<d>.

Gain access to more local variables using a wider index, or to a larger immediate operand: wide.
 */
public final class LoadAndStoreInstructionsDoubleCase implements InstructionAnalyzer {

    @Instruction(value = 0xe, name = "dconst_0")
    @Instruction(value = 0xf, name = "dconst_1")
    public void test_0xe_to_0xf() {
        double a = 0.0d;
        a = 1.0d;
    }

    // dload = 24 (0x18)
    // dload_0 = 38 (0x26)
    //dload_1 = 39 (0x27)
    //dload_2 = 40 (0x28)
    //dload_3 = 41 (0x29)
    @Instruction(value = 0x18, name = "dload")
    @Instruction(value = 0x26, name = "dload_0")
    @Instruction(value = 0x28, name = "dload_2")
    public static double test_0x18_0x26_0x28(double n1, double n2, double n3) {
        return n1 + n2 + n3;
    }

    @Instruction(value = 0x27, name = "dload_1")
    @Instruction(value = 0x29, name = "dload_3")
    public double test_0x27_0x29(double n1, double n2) {
        return n1 + n2;
    }

    // dstore = 57 (0x39)
    // dstore_0 = 71 (0x47)
    //dstore_1 = 72 (0x48)
    //dstore_2 = 73 (0x49)
    //dstore_3 = 74 (0x4a)
    @Instruction(value = 0x39, name = "dstore")
    @Instruction(value = 0x47, name = "dstore_0")
    @Instruction(value = 0x49, name = "dstore_2")
    public static void test_0x39_0x47_0x49(double n1, double n2, double n3) {
        n1 = 1.0d;
        n2 = 1.0d;
        n3 = 1.0d;
    }

    @Instruction(value = 0x48, name = "dstore_1")
    @Instruction(value = 0x4a, name = "dstore_3")
    public void test_0x48_0x4a(double n1, double n2) {
        n1 = 1.0d;
        n2 = 1.0d;
    }
}
