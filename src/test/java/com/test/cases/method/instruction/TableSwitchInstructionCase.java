package com.test.cases.method.instruction;

public class TableSwitchInstructionCase implements InstructionAnalyzer {

    @Instruction(value = 0xaa, name = "tableswitch")
    public void test_0xaa_case1(int number1, int number2) {
        int ans = switch (number1 + number2) {
            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 -> 1;
            case 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 30 -> 2;
            case 21, 22, 23, 24, 25, 26, 27, 28, 29, 31, 32, 33, 34, 35, 36, 37, 38, 39 -> 3;
            default -> 0;
        };
    }
}
