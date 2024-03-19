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
public class ControlTransferInstructionsCaseInstructionsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.method.instruction.ControlTransferInstructionsCase"));
    }

    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0x9a, name = "ifne")
    @Instruction(value = 0x9b, name = "iflt")
    @Instruction(value = 0x9c, name = "ifge")
    @Instruction(value = 0x9d, name = "ifgt")
    @Instruction(value = 0x9e, name = "ifle")
    @Test
    public void test_0x99_to_0x9e() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x99_to_0x9e(double);",
                "    descriptor: (D)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=7, locals=4, args_size=2",
                "         0: bipush        6",
                "         2: newarray       boolean",
                "         4: dup",
                "         5: iconst_0",
                "         6: dload_1",
                "         7: ldc2_w        #9                  // double 3.141592653589793d",
                "        10: dcmpl",
                "        11: ifeq          18",
                "        14: iconst_1",
                "        15: goto          19",
                "        18: iconst_0",
                "        19: bastore",
                "        20: dup",
                "        21: iconst_1",
                "        22: dload_1",
                "        23: ldc2_w        #9                  // double 3.141592653589793d",
                "        26: dcmpl",
                "        27: ifne          34",
                "        30: iconst_1",
                "        31: goto          35",
                "        34: iconst_0",
                "        35: bastore",
                "        36: dup",
                "        37: iconst_2",
                "        38: dload_1",
                "        39: ldc2_w        #9                  // double 3.141592653589793d",
                "        42: dcmpg",
                "        43: iflt          50",
                "        46: iconst_1",
                "        47: goto          51",
                "        50: iconst_0",
                "        51: bastore",
                "        52: dup",
                "        53: iconst_3",
                "        54: dload_1",
                "        55: ldc2_w        #9                  // double 3.141592653589793d",
                "        58: dcmpl",
                "        59: ifgt          66",
                "        62: iconst_1",
                "        63: goto          67",
                "        66: iconst_0",
                "        67: bastore",
                "        68: dup",
                "        69: iconst_4",
                "        70: dload_1",
                "        71: ldc2_w        #9                  // double 3.141592653589793d",
                "        74: dcmpl",
                "        75: ifge          82",
                "        78: iconst_1",
                "        79: goto          83",
                "        82: iconst_0",
                "        83: bastore",
                "        84: dup",
                "        85: iconst_5",
                "        86: dload_1",
                "        87: ldc2_w        #9                  // double 3.141592653589793d",
                "        90: dcmpg",
                "        91: ifle          98",
                "        94: iconst_1",
                "        95: goto          99",
                "        98: iconst_0",
                "        99: bastore",
                "       100: astore_3",
                "       101: return",
                "      LineNumberTable:",
                "        line 23: 0",
                "        line 31: 101",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0     102     0  this   Lcom/test/cases/method/instruction/ControlTransferInstructionsCase;",
                "            0     102     1 number   D",
                "          101       1     3 result   [Z"
        );
    }

    @Instruction(value = 0xc6, name = "ifnull")
    @Instruction(value = 0xc7, name = "ifnonnull")
    @Test
    public void test_0xc6_to_0xc7() {
        expectedConsecutiveLines = List.of(
                "  public void test_0xc6_to_0xc7(java.lang.Object);",
                "    descriptor: (Ljava/lang/Object;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=4, locals=3, args_size=2",
                "         0: iconst_2",
                "         1: newarray       boolean",
                "         3: dup",
                "         4: iconst_0",
                "         5: aload_1",
                "         6: ifnull        13",
                "         9: iconst_1",
                "        10: goto          14",
                "        13: iconst_0",
                "        14: bastore",
                "        15: dup",
                "        16: iconst_1",
                "        17: aload_1",
                "        18: ifnonnull     25",
                "        21: iconst_1",
                "        22: goto          26",
                "        25: iconst_0",
                "        26: bastore",
                "        27: astore_2",
                "        28: return",
                "      LineNumberTable:",
                "        line 36: 0",
                "        line 40: 28",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      29     0  this   Lcom/test/cases/method/instruction/ControlTransferInstructionsCase;",
                "            0      29     1     o   Ljava/lang/Object;",
                "           28       1     2 result   [Z"
        );
    }

    @Instruction(value = 0x9f, name = "if_icmpeq")
    @Instruction(value = 0xa0, name = "if_icmpne")
    @Instruction(value = 0xa1, name = "if_icmplt")
    @Instruction(value = 0xa2, name = "if_icmpge")
    @Instruction(value = 0xa3, name = "if_icmpgt")
    @Instruction(value = 0xa4, name = "if_icmple")
    @Test
    public void test_0x9f_to_0xa4() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x9f_to_0xa4(int, int);",
                "    descriptor: (II)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=5, locals=4, args_size=3",
                "         0: bipush        6",
                "         2: newarray       boolean",
                "         4: dup",
                "         5: iconst_0",
                "         6: iload_1",
                "         7: iload_2",
                "         8: if_icmpeq     15",
                "        11: iconst_1",
                "        12: goto          16",
                "        15: iconst_0",
                "        16: bastore",
                "        17: dup",
                "        18: iconst_1",
                "        19: iload_1",
                "        20: iload_2",
                "        21: if_icmpne     28",
                "        24: iconst_1",
                "        25: goto          29",
                "        28: iconst_0",
                "        29: bastore",
                "        30: dup",
                "        31: iconst_2",
                "        32: iload_1",
                "        33: iload_2",
                "        34: if_icmplt     41",
                "        37: iconst_1",
                "        38: goto          42",
                "        41: iconst_0",
                "        42: bastore",
                "        43: dup",
                "        44: iconst_3",
                "        45: iload_1",
                "        46: iload_2",
                "        47: if_icmpgt     54",
                "        50: iconst_1",
                "        51: goto          55",
                "        54: iconst_0",
                "        55: bastore",
                "        56: dup",
                "        57: iconst_4",
                "        58: iload_1",
                "        59: iload_2",
                "        60: if_icmpge     67",
                "        63: iconst_1",
                "        64: goto          68",
                "        67: iconst_0",
                "        68: bastore",
                "        69: dup",
                "        70: iconst_5",
                "        71: iload_1",
                "        72: iload_2",
                "        73: if_icmple     80",
                "        76: iconst_1",
                "        77: goto          81",
                "        80: iconst_0",
                "        81: bastore",
                "        82: astore_3",
                "        83: return",
                "      LineNumberTable:",
                "        line 50: 0",
                "        line 58: 83",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      84     0  this   Lcom/test/cases/method/instruction/ControlTransferInstructionsCase;",
                "            0      84     1     a   I",
                "            0      84     2     b   I",
                "           83       1     3 result   [Z"
        );
    }

    @Instruction(value = 0xa5, name = "if_acmpeq")
    @Instruction(value = 0xa6, name = "if_acmpne")
    @Test
    public void test_0xa5_to_0xa6() {
        expectedConsecutiveLines = List.of(
                "  public void test_0xa5_to_0xa6(java.lang.Object, java.lang.Object);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=5, locals=4, args_size=3",
                "         0: iconst_2",
                "         1: newarray       boolean",
                "         3: dup",
                "         4: iconst_0",
                "         5: aload_1",
                "         6: aload_2",
                "         7: if_acmpeq     14",
                "        10: iconst_1",
                "        11: goto          15",
                "        14: iconst_0",
                "        15: bastore",
                "        16: dup",
                "        17: iconst_1",
                "        18: aload_1",
                "        19: aload_2",
                "        20: if_acmpne     27",
                "        23: iconst_1",
                "        24: goto          28",
                "        27: iconst_0",
                "        28: bastore",
                "        29: astore_3",
                "        30: return",
                "      LineNumberTable:",
                "        line 64: 0",
                "        line 68: 30",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      31     0  this   Lcom/test/cases/method/instruction/ControlTransferInstructionsCase;",
                "            0      31     1    o1   Ljava/lang/Object;",
                "            0      31     2    o2   Ljava/lang/Object;",
                "           30       1     3 result   [Z"
        );
    }

    @Instruction(value = 0xa7, name = "goto")
    @Test
    public void test_0xa7() {
        expectedConsecutiveLines = List.of(
                "  public void test_0xa7();",
                "    descriptor: ()V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=1",
                "         0: iconst_0",
                "         1: istore_1",
                "         2: iload_1",
                "         3: bipush        100",
                "         5: if_icmpge     14",
                "         8: iinc          1, 1",
                "        11: goto          2",
                "        14: return",
                "      LineNumberTable:",
                "        line 73: 0",
                "        line 75: 14",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      15     0  this   Lcom/test/cases/method/instruction/ControlTransferInstructionsCase;",
                "            2      13     1     a   I"
        );
    }

    @Test
    public void test_0xc8() {
        expectedConsecutiveLines = List.of(
                "  public static void test_0xc8(long[]);",
                "    descriptor: ([J)V",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=12, args_size=1",
                "         0: iconst_0",
                "         1: istore        11",
                "         3: iload         11",
                "         5: bipush        10",
                "         7: if_icmpge     16",
                "        10: iinc          11, 1",
                "        13: goto          3",
                "        16: return",
                "      LineNumberTable:",
                "        line 80: 0",
                "        line 82: 16",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            3      13    11 number   I",
                "            0      17     0 numbers   [J"
        );
    }
}
