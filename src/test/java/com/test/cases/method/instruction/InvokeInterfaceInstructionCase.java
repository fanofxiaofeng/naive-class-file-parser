package com.test.cases.method.instruction;

public interface InvokeInterfaceInstructionCase extends InstructionAnalyzer {
    @Instruction(value = 0xb9, name = "invokeinterface")
    default void test_0xb9(InvokeInterfaceInstructionCase o) {
        dummy1();
        o.dummy1();
        dummy2(0, 0, 0, 0);
        dummy3(new long[0]);
    }

    void dummy1();

    void dummy2(long a, int b, double c, float d);

    void dummy3(long[] numbers);
}
