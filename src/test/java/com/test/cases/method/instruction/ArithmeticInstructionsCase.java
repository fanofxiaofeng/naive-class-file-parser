package com.test.cases.method.instruction;

import org.objectweb.asm.Opcodes;

public final class ArithmeticInstructionsCase implements InstructionAnalyzer {

    // Add: iadd, ladd, fadd, dadd.
    @Instruction(value = 0x60, name = "iadd")
    @Instruction(value = 0x61, name = "ladd")
    @Instruction(value = 0x62, name = "fadd")
    @Instruction(value = 0x63, name = "dadd")
    public void test_0x60_to_0x63(Number n1, Number n2) {
        int ans1 = n1.intValue() + n2.intValue();
        long ans2 = n1.longValue() + n2.longValue();
        float ans3 = n1.floatValue() + n2.floatValue();
        double ans4 = n1.doubleValue() + n2.doubleValue();
    }

    // Subtract: isub, lsub, fsub, dsub.
    @Instruction(value = 0x64, name = "isub")
    @Instruction(value = 0x65, name = "lsub")
    @Instruction(value = 0x66, name = "fsub")
    @Instruction(value = 0x67, name = "dsub")
    public void test_0x60to_0x63(Number n1, Number n2) {
        int ans1 = n1.intValue() - n2.intValue();
        long ans2 = n1.longValue() - n2.longValue();
        float ans3 = n1.floatValue() - n2.floatValue();
        double ans4 = n1.doubleValue() - n2.doubleValue();
    }

    // Multiply: imul, lmul, fmul, dmul.
    @Instruction(value = 0x68, name = "imul")
    @Instruction(value = 0x69, name = "lmul")
    @Instruction(value = 0x6a, name = "fmul")
    @Instruction(value = 0x6b, name = "dmul")
    public void test_0x68_to_0x6b(Number n1, Number n2) {
        int ans1 = n1.intValue() * n2.intValue();
        long ans2 = n1.longValue() * n2.longValue();
        float ans3 = n1.floatValue() * n2.floatValue();
        double ans4 = n1.doubleValue() * n2.doubleValue();
    }

    // Divide: idiv, ldiv, fdiv, ddiv.
    @Instruction(value = 0x6c, name = "idiv")
    @Instruction(value = 0x6d, name = "ldiv")
    @Instruction(value = 0x6e, name = "fdiv")
    @Instruction(value = 0x6f, name = "ddiv")
    public void test_0x6c_to_0x6f(Number n1, Number n2) {
        int ans1 = n1.intValue() / n2.intValue();
        long ans2 = n1.longValue() / n2.longValue();
        float ans3 = n1.floatValue() / n2.floatValue();
        double ans4 = n1.doubleValue() / n2.doubleValue();
    }

    // Remainder: irem, lrem, frem, drem.
    @Instruction(value = 0x70, name = "irem")
    @Instruction(value = 0x71, name = "lrem")
    @Instruction(value = 0x72, name = "frem")
    @Instruction(value = 0x73, name = "drem")
    public void test_0x70_to_0x73(Number n1, Number n2) {
        int ans1 = n1.intValue() % n2.intValue();
        long ans2 = n1.longValue() % n2.longValue();
        float ans3 = n1.floatValue() % n2.floatValue();
        double ans4 = n1.doubleValue() % n2.doubleValue();
    }

    // Negate: ineg, lneg, fneg, dneg.
    @Instruction(value = 0x74, name = "ineg")
    @Instruction(value = 0x75, name = "lneg")
    @Instruction(value = 0x76, name = "fneg")
    @Instruction(value = 0x77, name = "dneg")
    public void test_0x74_to_0x77(Number n) {
        int ans1 = -n.intValue();
        long ans2 = -n.longValue();
        float ans3 = -n.floatValue();
        double ans4 = -n.doubleValue();
    }


    // Shift: ishl, ishr, iushr, lshl, lshr, lushr.
    @Instruction(value = 0x78, name = "ishl")
    @Instruction(value = 0x79, name = "lshl")
    @Instruction(value = 0x7a, name = "ishr")
    @Instruction(value = 0x7b, name = "lshr")
    @Instruction(value = 0x7c, name = "iushr")
    @Instruction(value = 0x7d, name = "lushr")
    public void test_0x78_to_0x7d(Number n) {
        int ans1 = n.intValue() << 1;
        long ans2 = n.longValue() << 1;
        int ans3 = n.intValue() >> 1;
        long ans4 = n.longValue() >> 1;
        int ans5 = n.intValue() >>> 1;
        long ans6 = n.longValue() >>> 1;
    }

    // Bitwise exclusive OR: ixor, lxor.
    // Bitwise AND: iand, land.
    // Bitwise OR: ior, lor.
    @Instruction(value = 0x7e, name = "iand")
    @Instruction(value = 0x7f, name = "land")
    @Instruction(value = 0x80, name = "ior")
    @Instruction(value = 0x81, name = "lor")
    @Instruction(value = 0x82, name = "ixor")
    @Instruction(value = 0x83, name = "lxor")
    public void test_0x7e_to_0x83(Number n1, Number n2) {
        int ans1 = n1.intValue() & n2.intValue();
        long ans2 = n1.longValue() & n2.longValue();
        int ans3 = n1.intValue() | n2.intValue();
        long ans4 = n1.longValue() | n2.longValue();
        int ans5 = n1.intValue() ^ n2.intValue();
        long ans6 = n1.longValue() ^ n2.longValue();
    }

    // Local variable increment: iinc.
    @Instruction(value = 0x84, name = "iinc")
    public void test_0x84(int a, int b, int c) {
        a++;
        b += 0x100;
        c -= 0xff;
    }

    // Comparison: dcmpg, dcmpl, fcmpg, fcmpl, lcmp.
    @Instruction(value = 0x94, name = "lcmp")
    @Instruction(value = 0x95, name = "fcmpl")
    @Instruction(value = 0x96, name = "fcmpg")
    @Instruction(value = 0x97, name = "dcmpl")
    @Instruction(value = 0x98, name = "dcmpg")
    public void test_0x94_to_0x98(Number n) {
        boolean ans1 = n.longValue() > 42L;
        boolean ans2 = n.floatValue() > 42.0f;
        boolean ans3 = n.floatValue() < 42.0f;
        boolean ans4 = n.doubleValue() > 42.0d;
        boolean ans5 = n.doubleValue() < 42.0d;
    }
}
