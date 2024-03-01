package com.test.cases.method.instruction;


import java.util.function.Function;

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

    // iaload = 46 (0x2e)
    @Instruction(value = 0x2e, name = "iaload")
    public int test_0x2e(int[] array) {
        return array[42];
    }

    // laload = 47 (0x2f)
    @Instruction(value = 0x2f, name = "laload")
    public long test_0x2f(long[] array) {
        return array[42];
    }

    // faload = 48 (0x30)
    @Instruction(value = 0x30, name = "faload")
    public float test_0x30(float[] array) {
        return array[42];
    }

    // daload = 49 (0x31)
    @Instruction(value = 0x31, name = "daload")
    public double test_0x31(double[] array) {
        return array[42];
    }

    // aaload = 50 (0x32)
    @Instruction(value = 0x32, name = "aaload")
    public void test_0x32(int[][][] array, Function<String, Integer>[] functions, Deprecated[] annotations) {
        Object o = array[42];
        o = functions[42];
        o = annotations[42];
    }

    // baload = 51 (0x33)
    @Instruction(value = 0x33, name = "baload")
    public void test_0x33(byte[] bytes, boolean[] booleans) {
        byte b1 = bytes[42];
        boolean b2 = booleans[42];
    }

    // caload = 52 (0x34)
    @Instruction(value = 0x34, name = "caload")
    public char test_0x34(char[] array) {
        return array[42];
    }

    // saload = 53 (0x35)
    @Instruction(value = 0x35, name = "saload")
    public short test_0x35(short[] array) {
        return array[42];
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

    // iastore = 79 (0x4f)
    @Instruction(value = 0x4f, name = "iastore")
    public void test_0x4f(int[] array) {
        array[0] = 42;
    }

    // lastore = 80 (0x50)
    @Instruction(value = 0x50, name = "lastore")
    public void test_0x50(long[] array) {
        array[0] = 42L;
    }

    // fastore = 81 (0x51)
    @Instruction(value = 0x51, name = "fastore")
    public void test_0x51(float[] array) {
        array[0] = 42.0f;
    }

    // dastore = 82 (0x52)
    @Instruction(value = 0x52, name = "dastore")
    public void test_0x52(double[] array) {
        array[0] = 42.0d;
    }

    // aastore = 83 (0x53)
    @Instruction(value = 0x53, name = "aastore")
    public void test_0x53(int[][][] array, Function<String, Integer>[] functions, Deprecated[] annotations) {
        array[0] = null;
        functions[42] = null;
        annotations[42] = null;
    }

    // bastore = 84 (0x54)
    @Instruction(value = 0x54, name = "bastore")
    public void test_0x54(byte[] bytes, boolean[] booleans) {
        bytes[42] = 0;
        booleans[3] = false;
        booleans[42] = true;
    }

    // castore = 85 (0x55)
    @Instruction(value = 0x55, name = "castore")
    public void test_0x55(char[] array) {
        array[42] = 'a';
    }

    // sastore = 86 (0x56)
    @Instruction(value = 0x56, name = "sastore")
    public void test_0x56(short[] array) {
        array[4] = 42;
    }
}
