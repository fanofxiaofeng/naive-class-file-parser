package com.test.cases.method.instruction;

import org.objectweb.asm.Opcodes;

public class SynchronizationInstructionsCase implements InstructionAnalyzer {

    @Instruction(value = 0xc2, name = "monitorenter")
    @Instruction(value = 0xc3, name = "monitorexit")
    public void test_0xc2_to_0xc3() {
        synchronized (String.class) {
            int a = 42;
        }
        int b = 23;
    }


    public static void main(String[] args) {
        System.out.printf("0x%02x%n", 194);
    }
}
