package com.test.instruction.specific;

import com.test.annotations.GeneratedBy;
import com.test.cases.method.instruction.Instruction;
import com.test.instruction.InstructionTestGenerator;
import com.test.method.MethodPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(InstructionTestGenerator.class)
public class ArithmeticInstructionsCaseInstructionsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.method.instruction.ArithmeticInstructionsCase"));
    }

    @Instruction(value = 0x60, name = "iadd")
    @Instruction(value = 0x61, name = "ladd")
    @Instruction(value = 0x62, name = "fadd")
    @Instruction(value = 0x63, name = "dadd")
    @Test
    public void test_0x60_to_0x63() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x60_to_0x63(java.lang.Number, java.lang.Number);",
                "    descriptor: (Ljava/lang/Number;Ljava/lang/Number;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=4, locals=9, args_size=3",
                "         0: aload_1",
                "         1: invokevirtual #7                  // Method java/lang/Number.intValue:()I",
                "         4: aload_2",
                "         5: invokevirtual #7                  // Method java/lang/Number.intValue:()I",
                "         8: iadd",
                "         9: istore_3",
                "        10: aload_1",
                "        11: invokevirtual #13                 // Method java/lang/Number.longValue:()J",
                "        14: aload_2",
                "        15: invokevirtual #13                 // Method java/lang/Number.longValue:()J",
                "        18: ladd",
                "        19: lstore        4",
                "        21: aload_1",
                "        22: invokevirtual #17                 // Method java/lang/Number.floatValue:()F",
                "        25: aload_2",
                "        26: invokevirtual #17                 // Method java/lang/Number.floatValue:()F",
                "        29: fadd",
                "        30: fstore        6",
                "        32: aload_1",
                "        33: invokevirtual #21                 // Method java/lang/Number.doubleValue:()D",
                "        36: aload_2",
                "        37: invokevirtual #21                 // Method java/lang/Number.doubleValue:()D",
                "        40: dadd",
                "        41: dstore        7",
                "        43: return"
        );
    }

    @Instruction(value = 0x64, name = "isub")
    @Instruction(value = 0x65, name = "lsub")
    @Instruction(value = 0x66, name = "fsub")
    @Instruction(value = 0x67, name = "dsub")
    @Test
    public void test_0x60to_0x63() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x60to_0x63(java.lang.Number, java.lang.Number);",
                "    descriptor: (Ljava/lang/Number;Ljava/lang/Number;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=4, locals=9, args_size=3",
                "         0: aload_1",
                "         1: invokevirtual #7                  // Method java/lang/Number.intValue:()I",
                "         4: aload_2",
                "         5: invokevirtual #7                  // Method java/lang/Number.intValue:()I",
                "         8: isub",
                "         9: istore_3",
                "        10: aload_1",
                "        11: invokevirtual #13                 // Method java/lang/Number.longValue:()J",
                "        14: aload_2",
                "        15: invokevirtual #13                 // Method java/lang/Number.longValue:()J",
                "        18: lsub",
                "        19: lstore        4",
                "        21: aload_1",
                "        22: invokevirtual #17                 // Method java/lang/Number.floatValue:()F",
                "        25: aload_2",
                "        26: invokevirtual #17                 // Method java/lang/Number.floatValue:()F",
                "        29: fsub",
                "        30: fstore        6",
                "        32: aload_1",
                "        33: invokevirtual #21                 // Method java/lang/Number.doubleValue:()D",
                "        36: aload_2",
                "        37: invokevirtual #21                 // Method java/lang/Number.doubleValue:()D",
                "        40: dsub",
                "        41: dstore        7",
                "        43: return"
        );
    }

    @Instruction(value = 0x68, name = "imul")
    @Instruction(value = 0x69, name = "lmul")
    @Instruction(value = 0x6a, name = "fmul")
    @Instruction(value = 0x6b, name = "dmul")
    @Test
    public void test_0x68_to_0x6b() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x68_to_0x6b(java.lang.Number, java.lang.Number);",
                "    descriptor: (Ljava/lang/Number;Ljava/lang/Number;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=4, locals=9, args_size=3",
                "         0: aload_1",
                "         1: invokevirtual #7                  // Method java/lang/Number.intValue:()I",
                "         4: aload_2",
                "         5: invokevirtual #7                  // Method java/lang/Number.intValue:()I",
                "         8: imul",
                "         9: istore_3",
                "        10: aload_1",
                "        11: invokevirtual #13                 // Method java/lang/Number.longValue:()J",
                "        14: aload_2",
                "        15: invokevirtual #13                 // Method java/lang/Number.longValue:()J",
                "        18: lmul",
                "        19: lstore        4",
                "        21: aload_1",
                "        22: invokevirtual #17                 // Method java/lang/Number.floatValue:()F",
                "        25: aload_2",
                "        26: invokevirtual #17                 // Method java/lang/Number.floatValue:()F",
                "        29: fmul",
                "        30: fstore        6",
                "        32: aload_1",
                "        33: invokevirtual #21                 // Method java/lang/Number.doubleValue:()D",
                "        36: aload_2",
                "        37: invokevirtual #21                 // Method java/lang/Number.doubleValue:()D",
                "        40: dmul",
                "        41: dstore        7",
                "        43: return"
        );
    }

    @Instruction(value = 0x6c, name = "idiv")
    @Instruction(value = 0x6d, name = "ldiv")
    @Instruction(value = 0x6e, name = "fdiv")
    @Instruction(value = 0x6f, name = "ddiv")
    @Test
    public void test_0x6c_to_0x6f() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x6c_to_0x6f(java.lang.Number, java.lang.Number);",
                "    descriptor: (Ljava/lang/Number;Ljava/lang/Number;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=4, locals=9, args_size=3",
                "         0: aload_1",
                "         1: invokevirtual #7                  // Method java/lang/Number.intValue:()I",
                "         4: aload_2",
                "         5: invokevirtual #7                  // Method java/lang/Number.intValue:()I",
                "         8: idiv",
                "         9: istore_3",
                "        10: aload_1",
                "        11: invokevirtual #13                 // Method java/lang/Number.longValue:()J",
                "        14: aload_2",
                "        15: invokevirtual #13                 // Method java/lang/Number.longValue:()J",
                "        18: ldiv",
                "        19: lstore        4",
                "        21: aload_1",
                "        22: invokevirtual #17                 // Method java/lang/Number.floatValue:()F",
                "        25: aload_2",
                "        26: invokevirtual #17                 // Method java/lang/Number.floatValue:()F",
                "        29: fdiv",
                "        30: fstore        6",
                "        32: aload_1",
                "        33: invokevirtual #21                 // Method java/lang/Number.doubleValue:()D",
                "        36: aload_2",
                "        37: invokevirtual #21                 // Method java/lang/Number.doubleValue:()D",
                "        40: ddiv",
                "        41: dstore        7",
                "        43: return"
        );
    }

    @Instruction(value = 0x70, name = "irem")
    @Instruction(value = 0x71, name = "lrem")
    @Instruction(value = 0x72, name = "frem")
    @Instruction(value = 0x73, name = "drem")
    @Test
    public void test_0x70_to_0x73() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x70_to_0x73(java.lang.Number, java.lang.Number);",
                "    descriptor: (Ljava/lang/Number;Ljava/lang/Number;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=4, locals=9, args_size=3",
                "         0: aload_1",
                "         1: invokevirtual #7                  // Method java/lang/Number.intValue:()I",
                "         4: aload_2",
                "         5: invokevirtual #7                  // Method java/lang/Number.intValue:()I",
                "         8: irem",
                "         9: istore_3",
                "        10: aload_1",
                "        11: invokevirtual #13                 // Method java/lang/Number.longValue:()J",
                "        14: aload_2",
                "        15: invokevirtual #13                 // Method java/lang/Number.longValue:()J",
                "        18: lrem",
                "        19: lstore        4",
                "        21: aload_1",
                "        22: invokevirtual #17                 // Method java/lang/Number.floatValue:()F",
                "        25: aload_2",
                "        26: invokevirtual #17                 // Method java/lang/Number.floatValue:()F",
                "        29: frem",
                "        30: fstore        6",
                "        32: aload_1",
                "        33: invokevirtual #21                 // Method java/lang/Number.doubleValue:()D",
                "        36: aload_2",
                "        37: invokevirtual #21                 // Method java/lang/Number.doubleValue:()D",
                "        40: drem",
                "        41: dstore        7",
                "        43: return"
        );
    }

    @Instruction(value = 0x74, name = "ineg")
    @Instruction(value = 0x75, name = "lneg")
    @Instruction(value = 0x76, name = "fneg")
    @Instruction(value = 0x77, name = "dneg")
    @Test
    public void test_0x74_to_0x77() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x74_to_0x77(java.lang.Number);",
                "    descriptor: (Ljava/lang/Number;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=8, args_size=2",
                "         0: aload_1",
                "         1: invokevirtual #7                  // Method java/lang/Number.intValue:()I",
                "         4: ineg",
                "         5: istore_2",
                "         6: aload_1",
                "         7: invokevirtual #13                 // Method java/lang/Number.longValue:()J",
                "        10: lneg",
                "        11: lstore_3",
                "        12: aload_1",
                "        13: invokevirtual #17                 // Method java/lang/Number.floatValue:()F",
                "        16: fneg",
                "        17: fstore        5",
                "        19: aload_1",
                "        20: invokevirtual #21                 // Method java/lang/Number.doubleValue:()D",
                "        23: dneg",
                "        24: dstore        6",
                "        26: return"
        );
    }

    @Instruction(value = 0x78, name = "ishl")
    @Instruction(value = 0x79, name = "lshl")
    @Instruction(value = 0x7a, name = "ishr")
    @Instruction(value = 0x7b, name = "lshr")
    @Instruction(value = 0x7c, name = "iushr")
    @Instruction(value = 0x7d, name = "lushr")
    @Test
    public void test_0x78_to_0x7d() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x78_to_0x7d(java.lang.Number);",
                "    descriptor: (Ljava/lang/Number;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=11, args_size=2",
                "         0: aload_1",
                "         1: invokevirtual #7                  // Method java/lang/Number.intValue:()I",
                "         4: iconst_1",
                "         5: ishl",
                "         6: istore_2",
                "         7: aload_1",
                "         8: invokevirtual #13                 // Method java/lang/Number.longValue:()J",
                "        11: iconst_1",
                "        12: lshl",
                "        13: lstore_3",
                "        14: aload_1",
                "        15: invokevirtual #7                  // Method java/lang/Number.intValue:()I",
                "        18: iconst_1",
                "        19: ishr",
                "        20: istore        5",
                "        22: aload_1",
                "        23: invokevirtual #13                 // Method java/lang/Number.longValue:()J",
                "        26: iconst_1",
                "        27: lshr",
                "        28: lstore        6",
                "        30: aload_1",
                "        31: invokevirtual #7                  // Method java/lang/Number.intValue:()I",
                "        34: iconst_1",
                "        35: iushr",
                "        36: istore        8",
                "        38: aload_1",
                "        39: invokevirtual #13                 // Method java/lang/Number.longValue:()J",
                "        42: iconst_1",
                "        43: lushr",
                "        44: lstore        9",
                "        46: return"
        );
    }

    @Instruction(value = 0x7e, name = "iand")
    @Instruction(value = 0x7f, name = "land")
    @Instruction(value = 0x80, name = "ior")
    @Instruction(value = 0x81, name = "lor")
    @Instruction(value = 0x82, name = "ixor")
    @Instruction(value = 0x83, name = "lxor")
    @Test
    public void test_0x7e_to_0x83() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x7e_to_0x83(java.lang.Number, java.lang.Number);",
                "    descriptor: (Ljava/lang/Number;Ljava/lang/Number;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=4, locals=12, args_size=3",
                "         0: aload_1",
                "         1: invokevirtual #7                  // Method java/lang/Number.intValue:()I",
                "         4: aload_2",
                "         5: invokevirtual #7                  // Method java/lang/Number.intValue:()I",
                "         8: iand",
                "         9: istore_3",
                "        10: aload_1",
                "        11: invokevirtual #13                 // Method java/lang/Number.longValue:()J",
                "        14: aload_2",
                "        15: invokevirtual #13                 // Method java/lang/Number.longValue:()J",
                "        18: land",
                "        19: lstore        4",
                "        21: aload_1",
                "        22: invokevirtual #7                  // Method java/lang/Number.intValue:()I",
                "        25: aload_2",
                "        26: invokevirtual #7                  // Method java/lang/Number.intValue:()I",
                "        29: ior",
                "        30: istore        6",
                "        32: aload_1",
                "        33: invokevirtual #13                 // Method java/lang/Number.longValue:()J",
                "        36: aload_2",
                "        37: invokevirtual #13                 // Method java/lang/Number.longValue:()J",
                "        40: lor",
                "        41: lstore        7",
                "        43: aload_1",
                "        44: invokevirtual #7                  // Method java/lang/Number.intValue:()I",
                "        47: aload_2",
                "        48: invokevirtual #7                  // Method java/lang/Number.intValue:()I",
                "        51: ixor",
                "        52: istore        9",
                "        54: aload_1",
                "        55: invokevirtual #13                 // Method java/lang/Number.longValue:()J",
                "        58: aload_2",
                "        59: invokevirtual #13                 // Method java/lang/Number.longValue:()J",
                "        62: lxor",
                "        63: lstore        10",
                "        65: return"
        );
    }

    @Instruction(value = 0x84, name = "iinc")
    @Test
    public void test_0x84() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x84(int, int, int);",
                "    descriptor: (III)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=0, locals=4, args_size=4",
                "         0: iinc          1, 1",
                "         3: iinc_w        2, 256",
                "         9: iinc_w        3, -255",
                "        15: return"
        );
    }

    @Instruction(value = 0x94, name = "lcmp")
    @Instruction(value = 0x95, name = "fcmpl")
    @Instruction(value = 0x96, name = "fcmpg")
    @Instruction(value = 0x97, name = "dcmpl")
    @Instruction(value = 0x98, name = "dcmpg")
    @Test
    public void test_0x94_to_0x98() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x94_to_0x98(java.lang.Number);",
                "    descriptor: (Ljava/lang/Number;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=4, locals=7, args_size=2",
                "         0: aload_1",
                "         1: invokevirtual #13                 // Method java/lang/Number.longValue:()J",
                "         4: ldc2_w        #25                 // long 42l",
                "         7: lcmp",
                "         8: ifle          15",
                "        11: iconst_1",
                "        12: goto          16",
                "        15: iconst_0",
                "        16: istore_2",
                "        17: aload_1",
                "        18: invokevirtual #17                 // Method java/lang/Number.floatValue:()F",
                "        21: ldc           #27                 // float 42.0f",
                "        23: fcmpl",
                "        24: ifle          31",
                "        27: iconst_1",
                "        28: goto          32",
                "        31: iconst_0",
                "        32: istore_3",
                "        33: aload_1",
                "        34: invokevirtual #17                 // Method java/lang/Number.floatValue:()F",
                "        37: ldc           #27                 // float 42.0f",
                "        39: fcmpg",
                "        40: ifge          47",
                "        43: iconst_1",
                "        44: goto          48",
                "        47: iconst_0",
                "        48: istore        4",
                "        50: aload_1",
                "        51: invokevirtual #21                 // Method java/lang/Number.doubleValue:()D",
                "        54: ldc2_w        #28                 // double 42.0d",
                "        57: dcmpl",
                "        58: ifle          65",
                "        61: iconst_1",
                "        62: goto          66",
                "        65: iconst_0",
                "        66: istore        5",
                "        68: aload_1",
                "        69: invokevirtual #21                 // Method java/lang/Number.doubleValue:()D",
                "        72: ldc2_w        #28                 // double 42.0d",
                "        75: dcmpg",
                "        76: ifge          83",
                "        79: iconst_1",
                "        80: goto          84",
                "        83: iconst_0",
                "        84: istore        6",
                "        86: return"
        );
    }
}
