package com.test.cases.method.instruction;

/*

Load and Store Instructions
The load and store instructions transfer values between the local variables (§2.6.1) and the operand stack (§2.6.2) of a Java Virtual Machine frame (§2.6):

Load a local variable onto the operand stack: iload, iload_<n>, lload, lload_<n>, fload, fload_<n>, dload, dload_<n>, aload, aload_<n>.

Store a value from the operand stack into a local variable: istore, istore_<n>, lstore, lstore_<n>, fstore, fstore_<n>, dstore, dstore_<n>, astore, astore_<n>.

Load a constant on to the operand stack: bipush, sipush, ldc, ldc_w, ldc2_w, aconst_null, iconst_m1, iconst_<i>, lconst_<l>, fconst_<f>, dconst_<d>.

Gain access to more local variables using a wider index, or to a larger immediate operand: wide.
 */
public final class LoadAndStoreInstructionsFloatCase implements InstructionAnalyzer {

    @Instruction(value = 0xb, name = "fconst_0")
    @Instruction(value = 0xc, name = "fconst_1")
    @Instruction(value = 0xd, name = "fconst_2")
    public void test_0xb_to_0xd() {
        float a = 0.0f;
        a = 1.0f;
        a = 2.0f;
    }

    // fload = 23 (0x17)
    // fload_0 = 34 (0x22)
    //fload_1 = 35 (0x23)
    //fload_2 = 36 (0x24)
    //fload_3 = 37 (0x25)
    @Instruction(value = 0x17, name = "fload")
    @Instruction(value = 0x22, name = "fload_0")
    @Instruction(value = 0x23, name = "fload_1")
    @Instruction(value = 0x24, name = "fload_2")
    @Instruction(value = 0x25, name = "fload_3")
    public static void test_0x17_0x22_to_0x25(float f1, float f2, float f3, float f4, float f5) {
        float sum = f1 + f2 + f3 + f4 + f5;
    }

    // fstore = 56 (0x38)
    // fstore_0 = 67 (0x43)
    //fstore_1 = 68 (0x44)
    //fstore_2 = 69 (0x45)
    //fstore_3 = 70 (0x46)
    @Instruction(value = 0x38, name = "fstore")
    @Instruction(value = 0x43, name = "fstore_0")
    @Instruction(value = 0x44, name = "fstore_1")
    @Instruction(value = 0x45, name = "fstore_2")
    @Instruction(value = 0x46, name = "fstore_3")
    public static void test_0x38_0x43_to_0x46(float f1, float f2, float f3, float f4, float f5) {
        f1 = 0.0f;
        f2 = 0.0f;
        f3 = 0.0f;
        f4 = 0.0f;
        f5 = 0.0f;
    }
}
