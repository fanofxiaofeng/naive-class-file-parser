package com.test.cases.method.instruction;

import org.objectweb.asm.Opcodes;

// todo: needs more work for
// goto_w
// jsr
// jsr_w
// ret
public class ControlTransferInstructionsCase implements InstructionAnalyzer {
    // Conditional branch: ifeq, ifne, iflt, ifle, ifgt, ifge,
    // ifnull, ifnonnull,
    // if_icmpeq, if_icmpne, if_icmplt, if_icmple, if_icmpgt if_icmpge,
    // if_acmpeq, if_acmpne.

    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0x9a, name = "ifne")
    @Instruction(value = 0x9b, name = "iflt")
    @Instruction(value = 0x9c, name = "ifge")
    @Instruction(value = 0x9d, name = "ifgt")
    @Instruction(value = 0x9e, name = "ifle")
    public void test_0x99_to_0x9e(double number) {
        boolean[] result = new boolean[]{
                !(number == Math.PI),
                !(number != Math.PI),
                !(number < Math.PI),
                !(number > Math.PI),
                !(number >= Math.PI),
                !(number <= Math.PI),
        };
    }

    @Instruction(value = 0xc6, name = "ifnull")
    @Instruction(value = 0xc7, name = "ifnonnull")
    public void test_0xc6_to_0xc7(Object o) {
        boolean[] result = new boolean[]{
                !(o == null),
                (o == null),
        };
    }

    // if_icmpeq, if_icmpne, if_icmplt, if_icmple, if_icmpgt if_icmpge,
    @Instruction(value = 0x9f, name = "if_icmpeq")
    @Instruction(value = 0xa0, name = "if_icmpne")
    @Instruction(value = 0xa1, name = "if_icmplt")
    @Instruction(value = 0xa2, name = "if_icmpge")
    @Instruction(value = 0xa3, name = "if_icmpgt")
    @Instruction(value = 0xa4, name = "if_icmple")
    public void test_0x9f_to_0xa4(int a, int b) {
        boolean[] result = new boolean[]{
                !(a == b),
                a == b,
                !(a < b),
                !(a > b),
                !(a >= b),
                !(a <= b),
        };
    }

    // if_acmpeq, if_acmpne.
    @Instruction(value = 0xa5, name = "if_acmpeq")
    @Instruction(value = 0xa6, name = "if_acmpne")
    public void test_0xa5_to_0xa6(Object o1, Object o2) {
        boolean[] result = new boolean[]{
                !(o1 == o2),
                (o1 == o2)
        };
    }

    @Instruction(value = 0xa7, name = "goto")
    public void test_0xa7() {
        int a;
        for (a = 0; a < 100; a++) {
        }
    }

    @Instruction(value = 0xc8, name = "goto_w")
    public static void test_0xc8(long[] numbers) {
        long n1, n2, n3, n4, n5;
        for (int number = 0; number < 10; number++) {
        }
    }


    public static void main(String[] args) {
        System.out.printf("0x%02x%n", 170);
    }
}

