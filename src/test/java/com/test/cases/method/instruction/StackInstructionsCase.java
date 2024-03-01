package com.test.cases.method.instruction;

import java.util.function.Supplier;

public final class StackInstructionsCase implements InstructionAnalyzer {

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


    // todo
    // dup_x2 = 91 (0x5b)
//    @Instruction(value = 0x5b, name = "dup_x2",needMoreWork = true)
    public long test_0x5b() {
        return b--;
    }

    // todo
    // dup2 = 92 (0x5c)
//    @Instruction(value = 0x5c, name = "dup2", needMoreWork = true)
    public int test_0x5c(int x) {
        int y = x;
        return y;
    }
}
