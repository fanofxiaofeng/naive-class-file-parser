package com.test.cases.method.instruction;

import org.objectweb.asm.Opcodes;

public class ThrowingExceptionsInstructionCase implements InstructionAnalyzer {

    @Instruction(value = 0xbf, name = "athrow")
    public void test_0xbf(Class<?> c) {
        try {
            c.getConstructor();
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.printf("0x%02x%n", 191);
    }
}
