package com.test.cases.method.instruction;

import java.util.function.Supplier;

public class MethodInvocationAndReturnInstructionsCase implements InstructionAnalyzer {

    @Instruction(value = 0xb6, name = "invokevirtual")
    public void test_0xb6(Object o) {
        String s = o.toString();
        dummy1();
    }

    public void dummy1() {

    }

    private void dummy2() {

    }

    public static void dummy3() {

    }

    @Instruction(value = 0xb7, name = "invokespecial")
    public void test_0xb7() {
        String s = super.toString();
        new MethodInvocationAndReturnInstructionsCase();
        dummy2();
    }

    @Instruction(value = 0xb8, name = "invokestatic")
    public void test_0xb8() {
        int ans = Math.abs(42);
        MethodInvocationAndReturnInstructionsCase.dummy3();
    }

    @Instruction(value = 0xb9, name = "invokeinterface")
    public void test_0xb9(Supplier<Integer> supplier, MethodInvocationAndReturnInstructionsCase o) {
        supplier.get();
        o.buildInstructionMap();
        ((InstructionAnalyzer) o).buildInstructionMap();
    }

    @Instruction(value = 0xba, name = "invokedynamic")
    public void test_0xba() {
        Supplier<String> supplier = () -> "Hello";
        supplier.get();
    }

    @Instruction(value = 0xac, name = "ireturn")
    public int test_0xac(int number) {
        return number;
    }

    @Instruction(value = 0xad, name = "lreturn")
    public long test_0xad(long number) {
        return number;
    }

    @Instruction(value = 0xae, name = "freturn")
    public float test_0xae(float number) {
        return number;
    }

    @Instruction(value = 0xaf, name = "dreturn")
    public double test_0xaf(double number) {
        return number;
    }

    @Instruction(value = 0xb0, name = "areturn")
    public Object test_0xb0(Object o) {
        return o;
    }

    @Instruction(value = 0xb1, name = "return")
    public void test_0xb1() {
    }

    public static void main(String[] args) {
        System.out.printf("0x%02x%n", 172);
    }
}
