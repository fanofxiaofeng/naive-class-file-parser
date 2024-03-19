package com.test.cases.method.instruction;

import java.util.function.Function;

public class ObjectCreationAndManipulationInstructionsCase implements InstructionAnalyzer {

    @Instruction(value = 0xbb, name = "new")
    public void test_0xbb() {
        new Object();
    }

    @Instruction(value = 0xbc, name = "newarray")
    public void test_0xbc() {
        Object ans = new boolean[5];
        ans = new char[10];
        ans = new float[42];
        ans = new double[10];
        ans = new byte[5];
        ans = new short[0];
        ans = new int[100];
        ans = new long[50];
    }

    @Instruction(value = 0xbd, name = "anewarray")
    public void test_0xbd(int[] a) {
        Object ans = new String[10];
        ans = new Runtime[42];
        ans = new int[][]{a};
    }

    @Instruction(value = 0xc5, name = "multianewarray")
    public void test_0xc5() {
        Object ans = new String[10][9][8];
        ans = new Runtime[1][1][2][3][1][1][1][1][1][1][1][1][1][2][1][1][1][1][1][1][1];
        ans = new int[10][42][];
    }

    @Instruction(value = 0xb2, name = "getstatic")
    @Instruction(value = 0xb3, name = "putstatic")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb5, name = "putfield")
    public void test_0xb2_to_0xb5() {
        int a = f1;
        a = Integer.MAX_VALUE;
        f1 = 42;
        C.f1 = 23;
        int b = f2;
        b = new C().f2;
        f2 = 42;
        new C().f2 = b;
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

    // Get the length of array: arraylength.
    @Instruction(value = 0xbe, name = "arraylength")
    public int test_0xbe(double[] numbers) {
        return numbers.length;
    }


    // Check properties of class instances or arrays: instanceof, checkcast.
    @Instruction(value = 0xc0, name = "checkcast")
    public void test_0xc0(Object o) {
        Object ans = (String) o;
        ans = (Runnable) o;
        ans = (int[][]) o;
    }

    @Instruction(value = 0xc1, name = "instanceof")
    public void test_0xc1(Object o) {
        boolean ans = o instanceof String;
        ans = o instanceof Runnable;
        ans = o instanceof int[][];
    }

    private static int f1;
    private int f2;

    public static void main(String[] args) {
        System.out.printf("0x%02x%n", 193);
    }

    private static class C {
        private static int f1 = 42;
        private int f2 = 23;
    }
}
