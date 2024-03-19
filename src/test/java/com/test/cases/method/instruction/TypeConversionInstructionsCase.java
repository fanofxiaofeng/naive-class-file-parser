package com.test.cases.method.instruction;

import org.objectweb.asm.Opcodes;

public class TypeConversionInstructionsCase implements InstructionAnalyzer {

    @Instruction(value = 0x85, name = "i2l")
    @Instruction(value = 0x86, name = "i2f")
    @Instruction(value = 0x87, name = "i2d")
    // i2l, i2f, i2d, l2f, l2d, and f2d
    public void test_0x85_to_0x87(int n) {
        long ans1 = n;
        float ans2 = n;
        double ans3 = n;
    }

    @Instruction(value = 0x88, name = "l2i")
    @Instruction(value = 0x89, name = "l2f")
    @Instruction(value = 0x8a, name = "l2d")
    public void test_0x88_to_0x8a(long n) {
        int ans1 = (int) n;
        float ans2 = n;
        double ans3 = n;
    }

    @Instruction(value = 0x8b, name = "f2i")
    @Instruction(value = 0x8c, name = "f2l")
    @Instruction(value = 0x8d, name = "f2d")
    public void test_0x8b_to_0x8d(float n) {
        int ans1 = (int) n;
        long ans2 = (long) n;
        double ans3 = n;
    }

    @Instruction(value = 0x8e, name = "d2i")
    @Instruction(value = 0x8f, name = "d2l")
    @Instruction(value = 0x90, name = "d2f")
    public void test_0x83_to_0x90(double n) {
        int ans1 = (int) n;
        long ans2 = (long) n;
        float ans3 = (float) n;
    }

    @Instruction(value = 0x91, name = "i2b")
    @Instruction(value = 0x92, name = "i2c")
    @Instruction(value = 0x93, name = "i2s")
    public void test_0x91_to_0x93(int n) {
        int ans1 = (byte) n;
        char ans2 = (char) n;
        short ans3 = (short) n;
    }

    public static void main(String[] args) {
        System.out.printf("0x%02x%n", 142);
    }
}
