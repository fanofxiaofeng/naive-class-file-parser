package com.test.cases.method.instruction;

// todo: wide can decorate more than 10 instructions (I only tested 10 instructions)
public final class LoadAndStoreInstructionsWideCase implements InstructionAnalyzer {

    // where <opcode> is one of iload, fload, aload, lload, dload, istore, fstore, astore, lstore, dstore, or ret
    @WideDecoratedInstruction(value = 0x15, name = "iload")
    @WideDecoratedInstruction(value = 0x16, name = "lload")
    @WideDecoratedInstruction(value = 0x17, name = "fload")
    @WideDecoratedInstruction(value = 0x18, name = "dload")
    @WideDecoratedInstruction(value = 0x19, name = "aload")

    @WideDecoratedInstruction(value = 0x36, name = "istore")
    @WideDecoratedInstruction(value = 0x37, name = "lstore")
    @WideDecoratedInstruction(value = 0x38, name = "fstore")
    @WideDecoratedInstruction(value = 0x39, name = "dstore")
    @WideDecoratedInstruction(value = 0x3a, name = "astore")
    public void test() {
        long n000, n001, n002, n003, n004, n005, n006, n007;
        long n008, n009, n010, n011, n012, n013, n014, n015;
        long n016, n017, n018, n019, n020, n021, n022, n023;
        long n024, n025, n026, n027, n028, n029, n030, n031;
        long n032, n033, n034, n035, n036, n037, n038, n039;
        long n040, n041, n042, n043, n044, n045, n046, n047;
        long n048, n049, n050, n051, n052, n053, n054, n055;
        long n056, n057, n058, n059, n060, n061, n062, n063;
        long n064, n065, n066, n067, n068, n069, n070, n071;
        long n072, n073, n074, n075, n076, n077, n078, n079;
        long n080, n081, n082, n083, n084, n085, n086, n087;
        long n088, n089, n090, n091, n092, n093, n094, n095;
        long n096, n097, n098, n099, n100, n101, n102, n103;
        long n104, n105, n106, n107, n108, n109, n110, n111;
        long n112, n113, n114, n115, n116, n117, n118, n119;
        long n120, n121, n122, n123, n124, n125, n126, n127;

        int i1 = 1;
        int i2 = i1;

        float f1 = 1.0f;
        float f2 = f1;

        String o1 = "Hello";
        Object o2 = o1;

        long l1 = 1L;
        long l2 = l1;

        double d1 = 1.0d;
        double d2 = d1;
    }

    public static void main(String[] args) {
        int cnt = 0;
        for (int row = 0; row < 16; row++) {
            System.out.print("long ");
            for (int col = 0; col < 8; col++) {
                if (col + 1 == 8) {
                    System.out.printf("n%03d", cnt);
                } else {
                    System.out.printf("n%03d, ", cnt);
                }
                cnt++;
            }
            System.out.println(";");
        }
    }
}
