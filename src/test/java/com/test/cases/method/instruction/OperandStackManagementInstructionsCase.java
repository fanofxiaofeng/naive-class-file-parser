package com.test.cases.method.instruction;

import java.util.function.Supplier;

/**
 * Please refer to the following link for more details
 * <a href="https://docs.oracle.com/javase/specs/jvms/se22/html/jvms-2.html#jvms-2.11.6">2.11.6. Operand Stack Management Instructions</a>
 */
// A number of instructions are provided for the direct manipulation of the operand stack:
// pop, pop2,
// dup, dup2,
// dup_x1, dup2_x1,
// dup_x2, dup2_x2,
// swap.
public class OperandStackManagementInstructionsCase implements InstructionAnalyzer {
    private int a;
    private long b;

    // pop = 87 (0x57)
    @Instruction(value = 0x57, name = "pop")
    public void test_0x57(Supplier<String> supplier) {
        supplier.get();
    }

    // pop2 = 88 (0x58)
    @Instruction(value = 0x58, name = "pop2")
    public void test_0x58(Number number) {
        number.longValue();
    }

    // dup = 89 (0x59)
    @Instruction(value = 0x59, name = "dup")
    public void test_0x59() {
        new Object();
    }

    // dup_x1 = 90 (0x5a)
    @Instruction(value = 0x5a, name = "dup_x1")
    public int test_0x5a() {
        return a++;
    }
}
