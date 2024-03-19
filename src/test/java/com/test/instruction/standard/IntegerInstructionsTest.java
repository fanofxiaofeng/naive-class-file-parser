package com.test.instruction.standard;

import com.test.annotations.GeneratedBy;
import com.test.cases.method.instruction.Instruction;
import com.test.instruction.InstructionTestGenerator;
import com.test.method.MethodPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(InstructionTestGenerator.class)
public class IntegerInstructionsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Integer"));
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x05, name = "iconst_2")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x15, name = "iload")
    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0x1d, name = "iload_3")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x34, name = "caload")
    @Instruction(value = 0x36, name = "istore")
    @Instruction(value = 0x3b, name = "istore_0")
    @Instruction(value = 0x3c, name = "istore_1")
    @Instruction(value = 0x3e, name = "istore_3")
    @Instruction(value = 0x4d, name = "astore_2")
    @Instruction(value = 0x54, name = "bastore")
    @Instruction(value = 0x64, name = "isub")
    @Instruction(value = 0x6c, name = "idiv")
    @Instruction(value = 0x70, name = "irem")
    @Instruction(value = 0x74, name = "ineg")
    @Instruction(value = 0x84, name = "iinc")
    @Instruction(value = 0x91, name = "i2b")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0x9a, name = "ifne")
    @Instruction(value = 0x9c, name = "ifge")
    @Instruction(value = 0xa0, name = "if_icmpne")
    @Instruction(value = 0xa1, name = "if_icmplt")
    @Instruction(value = 0xa3, name = "if_icmpgt")
    @Instruction(value = 0xa4, name = "if_icmple")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb2, name = "getstatic")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xbc, name = "newarray")
    @Test
    public void test_1() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.String toString(int, int);",
                "    descriptor: (II)Ljava/lang/String;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=5, locals=5, args_size=2",
                "         0: iload_1",
                "         1: iconst_2",
                "         2: if_icmplt     11",
                "         5: iload_1",
                "         6: bipush        36",
                "         8: if_icmple     14",
                "        11: bipush        10",
                "        13: istore_1",
                "        14: iload_1",
                "        15: bipush        10",
                "        17: if_icmpne     25",
                "        20: iload_0",
                "        21: invokestatic  #9                  // Method toString:(I)Ljava/lang/String;",
                "        24: areturn",
                "        25: getstatic     #13                 // Field java/lang/String.COMPACT_STRINGS:Z",
                "        28: ifeq          122",
                "        31: bipush        33",
                "        33: newarray       byte",
                "        35: astore_2",
                "        36: iload_0",
                "        37: ifge          44",
                "        40: iconst_1",
                "        41: goto          45",
                "        44: iconst_0",
                "        45: istore_3",
                "        46: bipush        32",
                "        48: istore        4",
                "        50: iload_3",
                "        51: ifne          57",
                "        54: iload_0",
                "        55: ineg",
                "        56: istore_0",
                "        57: iload_0",
                "        58: iload_1",
                "        59: ineg",
                "        60: if_icmpgt     86",
                "        63: aload_2",
                "        64: iload         4",
                "        66: iinc          4, -1",
                "        69: getstatic     #17                 // Field digits:[C",
                "        72: iload_0",
                "        73: iload_1",
                "        74: irem",
                "        75: ineg",
                "        76: caload",
                "        77: i2b",
                "        78: bastore",
                "        79: iload_0",
                "        80: iload_1",
                "        81: idiv",
                "        82: istore_0",
                "        83: goto          57",
                "        86: aload_2",
                "        87: iload         4",
                "        89: getstatic     #17                 // Field digits:[C",
                "        92: iload_0",
                "        93: ineg",
                "        94: caload",
                "        95: i2b",
                "        96: bastore",
                "        97: iload_3",
                "        98: ifeq          110",
                "       101: aload_2",
                "       102: iinc          4, -1",
                "       105: iload         4",
                "       107: bipush        45",
                "       109: bastore",
                "       110: aload_2",
                "       111: iload         4",
                "       113: bipush        33",
                "       115: iload         4",
                "       117: isub",
                "       118: invokestatic  #21                 // Method java/lang/StringLatin1.newString:([BII)Ljava/lang/String;",
                "       121: areturn",
                "       122: iload_0",
                "       123: iload_1",
                "       124: invokestatic  #27                 // Method toStringUTF16:(II)Ljava/lang/String;",
                "       127: areturn",
                "      LineNumberTable:",
                "        line 153: 0",
                "        line 154: 11",
                "        line 157: 14",
                "        line 158: 20",
                "        line 161: 25",
                "        line 162: 31",
                "        line 163: 36",
                "        line 164: 46",
                "        line 166: 50",
                "        line 167: 54",
                "        line 170: 57",
                "        line 171: 63",
                "        line 172: 79",
                "        line 174: 86",
                "        line 176: 97",
                "        line 177: 101",
                "        line 180: 110",
                "        line 182: 122",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "           36      86     2   buf   [B",
                "           46      76     3 negative   Z",
                "           50      72     4 charPos   I",
                "            0     128     0     i   I",
                "            0     128     1 radix   I"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x15, name = "iload")
    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0x1d, name = "iload_3")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x34, name = "caload")
    @Instruction(value = 0x36, name = "istore")
    @Instruction(value = 0x3b, name = "istore_0")
    @Instruction(value = 0x3e, name = "istore_3")
    @Instruction(value = 0x4d, name = "astore_2")
    @Instruction(value = 0x64, name = "isub")
    @Instruction(value = 0x6c, name = "idiv")
    @Instruction(value = 0x70, name = "irem")
    @Instruction(value = 0x74, name = "ineg")
    @Instruction(value = 0x84, name = "iinc")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0x9a, name = "ifne")
    @Instruction(value = 0x9c, name = "ifge")
    @Instruction(value = 0xa3, name = "if_icmpgt")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb2, name = "getstatic")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xbc, name = "newarray")
    @Test
    public void test_2() {
        expectedConsecutiveLines = List.of(
                "  private static java.lang.String toStringUTF16(int, int);",
                "    descriptor: (II)Ljava/lang/String;",
                "    flags: (0x000a) ACC_PRIVATE, ACC_STATIC",
                "    Code:",
                "      stack=5, locals=5, args_size=2",
                "         0: bipush        66",
                "         2: newarray       byte",
                "         4: astore_2",
                "         5: iload_0",
                "         6: ifge          13",
                "         9: iconst_1",
                "        10: goto          14",
                "        13: iconst_0",
                "        14: istore_3",
                "        15: bipush        32",
                "        17: istore        4",
                "        19: iload_3",
                "        20: ifne          26",
                "        23: iload_0",
                "        24: ineg",
                "        25: istore_0",
                "        26: iload_0",
                "        27: iload_1",
                "        28: ineg",
                "        29: if_icmpgt     56",
                "        32: aload_2",
                "        33: iload         4",
                "        35: iinc          4, -1",
                "        38: getstatic     #17                 // Field digits:[C",
                "        41: iload_0",
                "        42: iload_1",
                "        43: irem",
                "        44: ineg",
                "        45: caload",
                "        46: invokestatic  #31                 // Method java/lang/StringUTF16.putChar:([BII)V",
                "        49: iload_0",
                "        50: iload_1",
                "        51: idiv",
                "        52: istore_0",
                "        53: goto          26",
                "        56: aload_2",
                "        57: iload         4",
                "        59: getstatic     #17                 // Field digits:[C",
                "        62: iload_0",
                "        63: ineg",
                "        64: caload",
                "        65: invokestatic  #31                 // Method java/lang/StringUTF16.putChar:([BII)V",
                "        68: iload_3",
                "        69: ifeq          83",
                "        72: aload_2",
                "        73: iinc          4, -1",
                "        76: iload         4",
                "        78: bipush        45",
                "        80: invokestatic  #31                 // Method java/lang/StringUTF16.putChar:([BII)V",
                "        83: aload_2",
                "        84: iload         4",
                "        86: bipush        33",
                "        88: iload         4",
                "        90: isub",
                "        91: invokestatic  #37                 // Method java/lang/StringUTF16.newString:([BII)Ljava/lang/String;",
                "        94: areturn",
                "      LineNumberTable:",
                "        line 186: 0",
                "        line 187: 5",
                "        line 188: 15",
                "        line 189: 19",
                "        line 190: 23",
                "        line 192: 26",
                "        line 193: 32",
                "        line 194: 49",
                "        line 196: 56",
                "        line 198: 68",
                "        line 199: 72",
                "        line 201: 83",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      95     0     i   I",
                "            0      95     1 radix   I",
                "            5      90     2   buf   [B",
                "           15      80     3 negative   Z",
                "           19      76     4 charPos   I"
        );
    }

    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_3() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.String toUnsignedString(int, int);",
                "    descriptor: (II)Ljava/lang/String;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=3, locals=2, args_size=2",
                "         0: iload_0",
                "         1: invokestatic  #38                 // Method toUnsignedLong:(I)J",
                "         4: iload_1",
                "         5: invokestatic  #42                 // Method java/lang/Long.toUnsignedString:(JI)Ljava/lang/String;",
                "         8: areturn",
                "      LineNumberTable:",
                "        line 231: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       9     0     i   I",
                "            0       9     1 radix   I"
        );
    }

    @Instruction(value = 0x07, name = "iconst_4")
    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_4() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.String toHexString(int);",
                "    descriptor: (I)Ljava/lang/String;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: iload_0",
                "         1: iconst_4",
                "         2: invokestatic  #48                 // Method toUnsignedString0:(II)Ljava/lang/String;",
                "         5: areturn",
                "      LineNumberTable:",
                "        line 285: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0     i   I"
        );
    }

    @Instruction(value = 0x06, name = "iconst_3")
    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_5() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.String toOctalString(int);",
                "    descriptor: (I)Ljava/lang/String;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: iload_0",
                "         1: iconst_3",
                "         2: invokestatic  #48                 // Method toUnsignedString0:(II)Ljava/lang/String;",
                "         5: areturn",
                "      LineNumberTable:",
                "        line 323: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0     i   I"
        );
    }

    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_6() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.String toBinaryString(int);",
                "    descriptor: (I)Ljava/lang/String;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: iload_0",
                "         1: iconst_1",
                "         2: invokestatic  #48                 // Method toUnsignedString0:(II)Ljava/lang/String;",
                "         5: areturn",
                "      LineNumberTable:",
                "        line 355: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0     i   I"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x05, name = "iconst_2")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x19, name = "aload")
    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0x1c, name = "iload_2")
    @Instruction(value = 0x1d, name = "iload_3")
    @Instruction(value = 0x3a, name = "astore")
    @Instruction(value = 0x3d, name = "istore_2")
    @Instruction(value = 0x3e, name = "istore_3")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0x60, name = "iadd")
    @Instruction(value = 0x64, name = "isub")
    @Instruction(value = 0x68, name = "imul")
    @Instruction(value = 0x6c, name = "idiv")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb2, name = "getstatic")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbc, name = "newarray")
    @Test
    public void test_7() {
        expectedConsecutiveLines = List.of(
                "  private static java.lang.String toUnsignedString0(int, int);",
                "    descriptor: (II)Ljava/lang/String;",
                "    flags: (0x000a) ACC_PRIVATE, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=5, args_size=2",
                "         0: bipush        32",
                "         2: iload_0",
                "         3: invokestatic  #51                 // Method numberOfLeadingZeros:(I)I",
                "         6: isub",
                "         7: istore_2",
                "         8: iload_2",
                "         9: iload_1",
                "        10: iconst_1",
                "        11: isub",
                "        12: iadd",
                "        13: iload_1",
                "        14: idiv",
                "        15: iconst_1",
                "        16: invokestatic  #55                 // Method java/lang/Math.max:(II)I",
                "        19: istore_3",
                "        20: getstatic     #13                 // Field java/lang/String.COMPACT_STRINGS:Z",
                "        23: ifeq          50",
                "        26: iload_3",
                "        27: newarray       byte",
                "        29: astore        4",
                "        31: iload_0",
                "        32: iload_1",
                "        33: aload         4",
                "        35: iload_3",
                "        36: invokestatic  #61                 // Method formatUnsignedInt:(II[BI)V",
                "        39: new           #5                  // class java/lang/String",
                "        42: dup",
                "        43: aload         4",
                "        45: iconst_0",
                "        46: invokespecial #65                 // Method java/lang/String.\"<init>\":([BB)V",
                "        49: areturn",
                "        50: iload_3",
                "        51: iconst_2",
                "        52: imul",
                "        53: newarray       byte",
                "        55: astore        4",
                "        57: iload_0",
                "        58: iload_1",
                "        59: aload         4",
                "        61: iload_3",
                "        62: invokestatic  #69                 // Method formatUnsignedIntUTF16:(II[BI)V",
                "        65: new           #5                  // class java/lang/String",
                "        68: dup",
                "        69: aload         4",
                "        71: iconst_1",
                "        72: invokespecial #65                 // Method java/lang/String.\"<init>\":([BB)V",
                "        75: areturn",
                "      LineNumberTable:",
                "        line 363: 0",
                "        line 364: 8",
                "        line 365: 20",
                "        line 366: 26",
                "        line 367: 31",
                "        line 368: 39",
                "        line 370: 50",
                "        line 371: 57",
                "        line 372: 65",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "           31      19     4   buf   [B",
                "           57      19     4   buf   [B",
                "            0      76     0   val   I",
                "            0      76     1 shift   I",
                "            8      68     2   mag   I",
                "           20      56     3 chars   I"
        );
    }

    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x15, name = "iload")
    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0x1d, name = "iload_3")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x34, name = "caload")
    @Instruction(value = 0x36, name = "istore")
    @Instruction(value = 0x3b, name = "istore_0")
    @Instruction(value = 0x54, name = "bastore")
    @Instruction(value = 0x64, name = "isub")
    @Instruction(value = 0x78, name = "ishl")
    @Instruction(value = 0x7c, name = "iushr")
    @Instruction(value = 0x7e, name = "iand")
    @Instruction(value = 0x84, name = "iinc")
    @Instruction(value = 0x91, name = "i2b")
    @Instruction(value = 0x9d, name = "ifgt")
    @Instruction(value = 0xb1, name = "return")
    @Instruction(value = 0xb2, name = "getstatic")
    @Test
    public void test_8() {
        expectedConsecutiveLines = List.of(
                "  private static void formatUnsignedInt(int, int, byte[], int);",
                "    descriptor: (II[BI)V",
                "    flags: (0x000a) ACC_PRIVATE, ACC_STATIC",
                "    Code:",
                "      stack=5, locals=7, args_size=4",
                "         0: iload_3",
                "         1: istore        4",
                "         3: iconst_1",
                "         4: iload_1",
                "         5: ishl",
                "         6: istore        5",
                "         8: iload         5",
                "        10: iconst_1",
                "        11: isub",
                "        12: istore        6",
                "        14: aload_2",
                "        15: iinc          4, -1",
                "        18: iload         4",
                "        20: getstatic     #17                 // Field digits:[C",
                "        23: iload_0",
                "        24: iload         6",
                "        26: iand",
                "        27: caload",
                "        28: i2b",
                "        29: bastore",
                "        30: iload_0",
                "        31: iload_1",
                "        32: iushr",
                "        33: istore_0",
                "        34: iload         4",
                "        36: ifgt          14",
                "        39: return",
                "      LineNumberTable:",
                "        line 387: 0",
                "        line 388: 3",
                "        line 389: 8",
                "        line 391: 14",
                "        line 392: 30",
                "        line 393: 34",
                "        line 394: 39",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      40     0   val   I",
                "            0      40     1 shift   I",
                "            0      40     2   buf   [B",
                "            0      40     3   len   I",
                "            3      37     4 charPos   I",
                "            8      32     5 radix   I",
                "           14      26     6  mask   I"
        );
    }

    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x15, name = "iload")
    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0x1d, name = "iload_3")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x34, name = "caload")
    @Instruction(value = 0x36, name = "istore")
    @Instruction(value = 0x3b, name = "istore_0")
    @Instruction(value = 0x64, name = "isub")
    @Instruction(value = 0x78, name = "ishl")
    @Instruction(value = 0x7c, name = "iushr")
    @Instruction(value = 0x7e, name = "iand")
    @Instruction(value = 0x84, name = "iinc")
    @Instruction(value = 0x9d, name = "ifgt")
    @Instruction(value = 0xb1, name = "return")
    @Instruction(value = 0xb2, name = "getstatic")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_9() {
        expectedConsecutiveLines = List.of(
                "  private static void formatUnsignedIntUTF16(int, int, byte[], int);",
                "    descriptor: (II[BI)V",
                "    flags: (0x000a) ACC_PRIVATE, ACC_STATIC",
                "    Code:",
                "      stack=5, locals=7, args_size=4",
                "         0: iload_3",
                "         1: istore        4",
                "         3: iconst_1",
                "         4: iload_1",
                "         5: ishl",
                "         6: istore        5",
                "         8: iload         5",
                "        10: iconst_1",
                "        11: isub",
                "        12: istore        6",
                "        14: aload_2",
                "        15: iinc          4, -1",
                "        18: iload         4",
                "        20: getstatic     #17                 // Field digits:[C",
                "        23: iload_0",
                "        24: iload         6",
                "        26: iand",
                "        27: caload",
                "        28: invokestatic  #31                 // Method java/lang/StringUTF16.putChar:([BII)V",
                "        31: iload_0",
                "        32: iload_1",
                "        33: iushr",
                "        34: istore_0",
                "        35: iload         4",
                "        37: ifgt          14",
                "        40: return",
                "      LineNumberTable:",
                "        line 407: 0",
                "        line 408: 3",
                "        line 409: 8",
                "        line 411: 14",
                "        line 412: 31",
                "        line 413: 35",
                "        line 414: 40",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      41     0   val   I",
                "            0      41     1 shift   I",
                "            0      41     2   buf   [B",
                "            0      41     3   len   I",
                "            3      38     4 charPos   I",
                "            8      33     5 radix   I",
                "           14      27     6  mask   I"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x05, name = "iconst_2")
    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x3c, name = "istore_1")
    @Instruction(value = 0x4d, name = "astore_2")
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0x68, name = "imul")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb2, name = "getstatic")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbc, name = "newarray")
    @Test
    public void test_10() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.String toString(int);",
                "    descriptor: (I)Ljava/lang/String;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=3, args_size=1",
                "         0: iload_0",
                "         1: invokestatic  #72                 // Method stringSize:(I)I",
                "         4: istore_1",
                "         5: getstatic     #13                 // Field java/lang/String.COMPACT_STRINGS:Z",
                "         8: ifeq          32",
                "        11: iload_1",
                "        12: newarray       byte",
                "        14: astore_2",
                "        15: iload_0",
                "        16: iload_1",
                "        17: aload_2",
                "        18: invokestatic  #75                 // Method getChars:(II[B)I",
                "        21: pop",
                "        22: new           #5                  // class java/lang/String",
                "        25: dup",
                "        26: aload_2",
                "        27: iconst_0",
                "        28: invokespecial #65                 // Method java/lang/String.\"<init>\":([BB)V",
                "        31: areturn",
                "        32: iload_1",
                "        33: iconst_2",
                "        34: imul",
                "        35: newarray       byte",
                "        37: astore_2",
                "        38: iload_0",
                "        39: iload_1",
                "        40: aload_2",
                "        41: invokestatic  #79                 // Method java/lang/StringUTF16.getChars:(II[B)I",
                "        44: pop",
                "        45: new           #5                  // class java/lang/String",
                "        48: dup",
                "        49: aload_2",
                "        50: iconst_1",
                "        51: invokespecial #65                 // Method java/lang/String.\"<init>\":([BB)V",
                "        54: areturn",
                "      LineNumberTable:",
                "        line 455: 0",
                "        line 456: 5",
                "        line 457: 11",
                "        line 458: 15",
                "        line 459: 22",
                "        line 461: 32",
                "        line 462: 38",
                "        line 463: 45",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "           15      17     2   buf   [B",
                "           38      17     2   buf   [B",
                "            0      55     0     i   I",
                "            5      50     1  size   I"
        );
    }

    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_11() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.String toUnsignedString(int);",
                "    descriptor: (I)Ljava/lang/String;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: iload_0",
                "         1: invokestatic  #38                 // Method toUnsignedLong:(I)J",
                "         4: invokestatic  #80                 // Method java/lang/Long.toString:(J)Ljava/lang/String;",
                "         7: areturn",
                "      LineNumberTable:",
                "        line 482: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       8     0     i   I"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x15, name = "iload")
    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0x1d, name = "iload_3")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x33, name = "baload")
    @Instruction(value = 0x36, name = "istore")
    @Instruction(value = 0x3b, name = "istore_0")
    @Instruction(value = 0x3e, name = "istore_3")
    @Instruction(value = 0x54, name = "bastore")
    @Instruction(value = 0x64, name = "isub")
    @Instruction(value = 0x68, name = "imul")
    @Instruction(value = 0x6c, name = "idiv")
    @Instruction(value = 0x74, name = "ineg")
    @Instruction(value = 0x84, name = "iinc")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0x9a, name = "ifne")
    @Instruction(value = 0x9c, name = "ifge")
    @Instruction(value = 0xa2, name = "if_icmpge")
    @Instruction(value = 0xa3, name = "if_icmpgt")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb2, name = "getstatic")
    @Test
    public void test_12() {
        expectedConsecutiveLines = List.of(
                "  static int getChars(int, int, byte[]);",
                "    descriptor: (II[B)I",
                "    flags: (0x0008) ACC_STATIC",
                "    Code:",
                "      stack=4, locals=7, args_size=3",
                "         0: iload_1",
                "         1: istore        5",
                "         3: iload_0",
                "         4: ifge          11",
                "         7: iconst_1",
                "         8: goto          12",
                "        11: iconst_0",
                "        12: istore        6",
                "        14: iload         6",
                "        16: ifne          22",
                "        19: iload_0",
                "        20: ineg",
                "        21: istore_0",
                "        22: iload_0",
                "        23: bipush        -100",
                "        25: if_icmpgt     72",
                "        28: iload_0",
                "        29: bipush        100",
                "        31: idiv",
                "        32: istore_3",
                "        33: iload_3",
                "        34: bipush        100",
                "        36: imul",
                "        37: iload_0",
                "        38: isub",
                "        39: istore        4",
                "        41: iload_3",
                "        42: istore_0",
                "        43: aload_2",
                "        44: iinc          5, -1",
                "        47: iload         5",
                "        49: getstatic     #83                 // Field DigitOnes:[B",
                "        52: iload         4",
                "        54: baload",
                "        55: bastore",
                "        56: aload_2",
                "        57: iinc          5, -1",
                "        60: iload         5",
                "        62: getstatic     #87                 // Field DigitTens:[B",
                "        65: iload         4",
                "        67: baload",
                "        68: bastore",
                "        69: goto          22",
                "        72: aload_2",
                "        73: iinc          5, -1",
                "        76: iload         5",
                "        78: getstatic     #83                 // Field DigitOnes:[B",
                "        81: iload_0",
                "        82: ineg",
                "        83: baload",
                "        84: bastore",
                "        85: iload_0",
                "        86: bipush        -9",
                "        88: if_icmpge     104",
                "        91: aload_2",
                "        92: iinc          5, -1",
                "        95: iload         5",
                "        97: getstatic     #87                 // Field DigitTens:[B",
                "       100: iload_0",
                "       101: ineg",
                "       102: baload",
                "       103: bastore",
                "       104: iload         6",
                "       106: ifeq          118",
                "       109: aload_2",
                "       110: iinc          5, -1",
                "       113: iload         5",
                "       115: bipush        45",
                "       117: bastore",
                "       118: iload         5",
                "       120: ireturn",
                "      LineNumberTable:",
                "        line 504: 0",
                "        line 506: 3",
                "        line 507: 14",
                "        line 508: 19",
                "        line 512: 22",
                "        line 513: 28",
                "        line 514: 33",
                "        line 515: 41",
                "        line 516: 43",
                "        line 517: 56",
                "        line 521: 72",
                "        line 522: 85",
                "        line 523: 91",
                "        line 526: 104",
                "        line 527: 109",
                "        line 529: 118",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "           33      39     3     q   I",
                "           41      31     4     r   I",
                "            0     121     0     i   I",
                "            0     121     1 index   I",
                "            0     121     2   buf   [B",
                "            3     118     5 charPos   I",
                "           14     107     6 negative   Z"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0x1c, name = "iload_2")
    @Instruction(value = 0x1d, name = "iload_3")
    @Instruction(value = 0x3b, name = "istore_0")
    @Instruction(value = 0x3c, name = "istore_1")
    @Instruction(value = 0x3d, name = "istore_2")
    @Instruction(value = 0x3e, name = "istore_3")
    @Instruction(value = 0x60, name = "iadd")
    @Instruction(value = 0x68, name = "imul")
    @Instruction(value = 0x74, name = "ineg")
    @Instruction(value = 0x84, name = "iinc")
    @Instruction(value = 0x9b, name = "iflt")
    @Instruction(value = 0xa2, name = "if_icmpge")
    @Instruction(value = 0xa4, name = "if_icmple")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xac, name = "ireturn")
    @Test
    public void test_13() {
        expectedConsecutiveLines = List.of(
                "  static int stringSize(int);",
                "    descriptor: (I)I",
                "    flags: (0x0008) ACC_STATIC",
                "    Code:",
                "      stack=2, locals=4, args_size=1",
                "         0: iconst_1",
                "         1: istore_1",
                "         2: iload_0",
                "         3: iflt          11",
                "         6: iconst_0",
                "         7: istore_1",
                "         8: iload_0",
                "         9: ineg",
                "        10: istore_0",
                "        11: bipush        -10",
                "        13: istore_2",
                "        14: iconst_1",
                "        15: istore_3",
                "        16: iload_3",
                "        17: bipush        10",
                "        19: if_icmpge     42",
                "        22: iload_0",
                "        23: iload_2",
                "        24: if_icmple     31",
                "        27: iload_3",
                "        28: iload_1",
                "        29: iadd",
                "        30: ireturn",
                "        31: bipush        10",
                "        33: iload_2",
                "        34: imul",
                "        35: istore_2",
                "        36: iinc          3, 1",
                "        39: goto          16",
                "        42: bipush        10",
                "        44: iload_1",
                "        45: iadd",
                "        46: ireturn",
                "      LineNumberTable:",
                "        line 544: 0",
                "        line 545: 2",
                "        line 546: 6",
                "        line 547: 8",
                "        line 549: 11",
                "        line 550: 14",
                "        line 551: 22",
                "        line 552: 27",
                "        line 553: 31",
                "        line 550: 36",
                "        line 555: 42",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "           16      26     3     i   I",
                "            0      47     0     x   I",
                "            2      45     1     d   I",
                "           14      33     2     p   I"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x05, name = "iconst_2")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x12, name = "ldc")
    @Instruction(value = 0x15, name = "iload")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0x1c, name = "iload_2")
    @Instruction(value = 0x1d, name = "iload_3")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x36, name = "istore")
    @Instruction(value = 0x3d, name = "istore_2")
    @Instruction(value = 0x3e, name = "istore_3")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0x60, name = "iadd")
    @Instruction(value = 0x64, name = "isub")
    @Instruction(value = 0x68, name = "imul")
    @Instruction(value = 0x6c, name = "idiv")
    @Instruction(value = 0x74, name = "ineg")
    @Instruction(value = 0x84, name = "iinc")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0x9b, name = "iflt")
    @Instruction(value = 0x9e, name = "ifle")
    @Instruction(value = 0x9f, name = "if_icmpeq")
    @Instruction(value = 0xa0, name = "if_icmpne")
    @Instruction(value = 0xa2, name = "if_icmpge")
    @Instruction(value = 0xa4, name = "if_icmple")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbf, name = "athrow")
    @Instruction(value = 0xc7, name = "ifnonnull")
    @Test
    public void test_14() {
        expectedConsecutiveLines = List.of(
                "  public static int parseInt(java.lang.String, int) throws java.lang.NumberFormatException;",
                "    descriptor: (Ljava/lang/String;I)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=10, args_size=2",
                "         0: aload_0",
                "         1: ifnonnull     14",
                "         4: new           #90                 // class java/lang/NumberFormatException",
                "         7: dup",
                "         8: ldc           #92                 // String Cannot parse null string",
                "        10: invokespecial #94                 // Method java/lang/NumberFormatException.\"<init>\":(Ljava/lang/String;)V",
                "        13: athrow",
                "        14: iload_1",
                "        15: iconst_2",
                "        16: if_icmpge     51",
                "        19: new           #90                 // class java/lang/NumberFormatException",
                "        22: dup",
                "        23: new           #97                 // class java/lang/StringBuilder",
                "        26: dup",
                "        27: invokespecial #99                 // Method java/lang/StringBuilder.\"<init>\":()V",
                "        30: ldc           #102                // String radix",
                "        32: invokevirtual #104                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "        35: iload_1",
                "        36: invokevirtual #108                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;",
                "        39: ldc           #111                // String  less than Character.MIN_RADIX",
                "        41: invokevirtual #104                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "        44: invokevirtual #113                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;",
                "        47: invokespecial #94                 // Method java/lang/NumberFormatException.\"<init>\":(Ljava/lang/String;)V",
                "        50: athrow",
                "        51: iload_1",
                "        52: bipush        36",
                "        54: if_icmple     89",
                "        57: new           #90                 // class java/lang/NumberFormatException",
                "        60: dup",
                "        61: new           #97                 // class java/lang/StringBuilder",
                "        64: dup",
                "        65: invokespecial #99                 // Method java/lang/StringBuilder.\"<init>\":()V",
                "        68: ldc           #102                // String radix",
                "        70: invokevirtual #104                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "        73: iload_1",
                "        74: invokevirtual #108                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;",
                "        77: ldc           #116                // String  greater than Character.MAX_RADIX",
                "        79: invokevirtual #104                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "        82: invokevirtual #113                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;",
                "        85: invokespecial #94                 // Method java/lang/NumberFormatException.\"<init>\":(Ljava/lang/String;)V",
                "        88: athrow",
                "        89: iconst_0",
                "        90: istore_2",
                "        91: iconst_0",
                "        92: istore_3",
                "        93: aload_0",
                "        94: invokevirtual #118                // Method java/lang/String.length:()I",
                "        97: istore        4",
                "        99: ldc           #122                // int -2147483647",
                "       101: istore        5",
                "       103: iload         4",
                "       105: ifle          258",
                "       108: aload_0",
                "       109: iconst_0",
                "       110: invokevirtual #123                // Method java/lang/String.charAt:(I)C",
                "       113: istore        6",
                "       115: iload         6",
                "       117: bipush        48",
                "       119: if_icmpge     166",
                "       122: iload         6",
                "       124: bipush        45",
                "       126: if_icmpne     138",
                "       129: iconst_1",
                "       130: istore_2",
                "       131: ldc           #127                // int -2147483648",
                "       133: istore        5",
                "       135: goto          151",
                "       138: iload         6",
                "       140: bipush        43",
                "       142: if_icmpeq     151",
                "       145: aload_0",
                "       146: iload_1",
                "       147: invokestatic  #128                // Method java/lang/NumberFormatException.forInputString:(Ljava/lang/String;I)Ljava/lang/NumberFormatException;",
                "       150: athrow",
                "       151: iload         4",
                "       153: iconst_1",
                "       154: if_icmpne     163",
                "       157: aload_0",
                "       158: iload_1",
                "       159: invokestatic  #128                // Method java/lang/NumberFormatException.forInputString:(Ljava/lang/String;I)Ljava/lang/NumberFormatException;",
                "       162: athrow",
                "       163: iinc          3, 1",
                "       166: iload         5",
                "       168: iload_1",
                "       169: idiv",
                "       170: istore        7",
                "       172: iconst_0",
                "       173: istore        8",
                "       175: iload_3",
                "       176: iload         4",
                "       178: if_icmpge     245",
                "       181: aload_0",
                "       182: iload_3",
                "       183: iinc          3, 1",
                "       186: invokevirtual #123                // Method java/lang/String.charAt:(I)C",
                "       189: iload_1",
                "       190: invokestatic  #132                // Method java/lang/Character.digit:(CI)I",
                "       193: istore        9",
                "       195: iload         9",
                "       197: iflt          207",
                "       200: iload         8",
                "       202: iload         7",
                "       204: if_icmpge     213",
                "       207: aload_0",
                "       208: iload_1",
                "       209: invokestatic  #128                // Method java/lang/NumberFormatException.forInputString:(Ljava/lang/String;I)Ljava/lang/NumberFormatException;",
                "       212: athrow",
                "       213: iload         8",
                "       215: iload_1",
                "       216: imul",
                "       217: istore        8",
                "       219: iload         8",
                "       221: iload         5",
                "       223: iload         9",
                "       225: iadd",
                "       226: if_icmpge     235",
                "       229: aload_0",
                "       230: iload_1",
                "       231: invokestatic  #128                // Method java/lang/NumberFormatException.forInputString:(Ljava/lang/String;I)Ljava/lang/NumberFormatException;",
                "       234: athrow",
                "       235: iload         8",
                "       237: iload         9",
                "       239: isub",
                "       240: istore        8",
                "       242: goto          175",
                "       245: iload_2",
                "       246: ifeq          254",
                "       249: iload         8",
                "       251: goto          257",
                "       254: iload         8",
                "       256: ineg",
                "       257: ireturn",
                "       258: aload_0",
                "       259: iload_1",
                "       260: invokestatic  #128                // Method java/lang/NumberFormatException.forInputString:(Ljava/lang/String;I)Ljava/lang/NumberFormatException;",
                "       263: athrow",
                "      LineNumberTable:",
                "        line 622: 0",
                "        line 623: 4",
                "        line 626: 14",
                "        line 627: 19",
                "        line 631: 51",
                "        line 632: 57",
                "        line 636: 89",
                "        line 637: 91",
                "        line 638: 99",
                "        line 640: 103",
                "        line 641: 108",
                "        line 642: 115",
                "        line 643: 122",
                "        line 644: 129",
                "        line 645: 131",
                "        line 646: 138",
                "        line 647: 145",
                "        line 650: 151",
                "        line 651: 157",
                "        line 653: 163",
                "        line 655: 166",
                "        line 656: 172",
                "        line 657: 175",
                "        line 659: 181",
                "        line 660: 195",
                "        line 661: 207",
                "        line 663: 213",
                "        line 664: 219",
                "        line 665: 229",
                "        line 667: 235",
                "        line 668: 242",
                "        line 669: 245",
                "        line 671: 258",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "          195      47     9 digit   I",
                "          115     143     6 firstChar   C",
                "          172      86     7 multmin   I",
                "          175      83     8 result   I",
                "            0     264     0     s   Ljava/lang/String;",
                "            0     264     1 radix   I",
                "           91     173     2 negative   Z",
                "           93     171     3     i   I",
                "           99     165     4   len   I",
                "          103     161     5 limit   I",
                "    Exceptions:",
                "      throws java.lang.NumberFormatException"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x05, name = "iconst_2")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x12, name = "ldc")
    @Instruction(value = 0x15, name = "iload")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0x1c, name = "iload_2")
    @Instruction(value = 0x1d, name = "iload_3")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x36, name = "istore")
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0x60, name = "iadd")
    @Instruction(value = 0x64, name = "isub")
    @Instruction(value = 0x68, name = "imul")
    @Instruction(value = 0x6c, name = "idiv")
    @Instruction(value = 0x74, name = "ineg")
    @Instruction(value = 0x84, name = "iinc")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0x9b, name = "iflt")
    @Instruction(value = 0x9f, name = "if_icmpeq")
    @Instruction(value = 0xa0, name = "if_icmpne")
    @Instruction(value = 0xa2, name = "if_icmpge")
    @Instruction(value = 0xa4, name = "if_icmple")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbf, name = "athrow")
    @Test
    public void test_15() {
        expectedConsecutiveLines = List.of(
                "  public static int parseInt(java.lang.CharSequence, int, int, int) throws java.lang.NumberFormatException;",
                "    descriptor: (Ljava/lang/CharSequence;III)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=11, args_size=4",
                "         0: aload_0",
                "         1: invokestatic  #136                // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "         4: pop",
                "         5: iload_1",
                "         6: iload_2",
                "         7: aload_0",
                "         8: invokeinterface #142,  1          // InterfaceMethod java/lang/CharSequence.length:()I",
                "        13: invokestatic  #145                // Method java/util/Objects.checkFromToIndex:(III)I",
                "        16: pop",
                "        17: iload_3",
                "        18: iconst_2",
                "        19: if_icmpge     54",
                "        22: new           #90                 // class java/lang/NumberFormatException",
                "        25: dup",
                "        26: new           #97                 // class java/lang/StringBuilder",
                "        29: dup",
                "        30: invokespecial #99                 // Method java/lang/StringBuilder.\"<init>\":()V",
                "        33: ldc           #102                // String radix",
                "        35: invokevirtual #104                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "        38: iload_3",
                "        39: invokevirtual #108                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;",
                "        42: ldc           #111                // String  less than Character.MIN_RADIX",
                "        44: invokevirtual #104                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "        47: invokevirtual #113                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;",
                "        50: invokespecial #94                 // Method java/lang/NumberFormatException.\"<init>\":(Ljava/lang/String;)V",
                "        53: athrow",
                "        54: iload_3",
                "        55: bipush        36",
                "        57: if_icmple     92",
                "        60: new           #90                 // class java/lang/NumberFormatException",
                "        63: dup",
                "        64: new           #97                 // class java/lang/StringBuilder",
                "        67: dup",
                "        68: invokespecial #99                 // Method java/lang/StringBuilder.\"<init>\":()V",
                "        71: ldc           #102                // String radix",
                "        73: invokevirtual #104                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "        76: iload_3",
                "        77: invokevirtual #108                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;",
                "        80: ldc           #116                // String  greater than Character.MAX_RADIX",
                "        82: invokevirtual #104                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "        85: invokevirtual #113                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;",
                "        88: invokespecial #94                 // Method java/lang/NumberFormatException.\"<init>\":(Ljava/lang/String;)V",
                "        91: athrow",
                "        92: iconst_0",
                "        93: istore        4",
                "        95: iload_1",
                "        96: istore        5",
                "        98: ldc           #122                // int -2147483647",
                "       100: istore        6",
                "       102: iload         5",
                "       104: iload_2",
                "       105: if_icmpge     278",
                "       108: aload_0",
                "       109: iload         5",
                "       111: invokeinterface #149,  2          // InterfaceMethod java/lang/CharSequence.charAt:(I)C",
                "       116: istore        7",
                "       118: iload         7",
                "       120: bipush        48",
                "       122: if_icmpge     176",
                "       125: iload         7",
                "       127: bipush        45",
                "       129: if_icmpne     142",
                "       132: iconst_1",
                "       133: istore        4",
                "       135: ldc           #127                // int -2147483648",
                "       137: istore        6",
                "       139: goto          158",
                "       142: iload         7",
                "       144: bipush        43",
                "       146: if_icmpeq     158",
                "       149: aload_0",
                "       150: iload_1",
                "       151: iload_2",
                "       152: iload         5",
                "       154: invokestatic  #150                // Method java/lang/NumberFormatException.forCharSequence:(Ljava/lang/CharSequence;III)Ljava/lang/NumberFormatException;",
                "       157: athrow",
                "       158: iinc          5, 1",
                "       161: iload         5",
                "       163: iload_2",
                "       164: if_icmpne     176",
                "       167: aload_0",
                "       168: iload_1",
                "       169: iload_2",
                "       170: iload         5",
                "       172: invokestatic  #150                // Method java/lang/NumberFormatException.forCharSequence:(Ljava/lang/CharSequence;III)Ljava/lang/NumberFormatException;",
                "       175: athrow",
                "       176: iload         6",
                "       178: iload_3",
                "       179: idiv",
                "       180: istore        8",
                "       182: iconst_0",
                "       183: istore        9",
                "       185: iload         5",
                "       187: iload_2",
                "       188: if_icmpge     264",
                "       191: aload_0",
                "       192: iload         5",
                "       194: invokeinterface #149,  2          // InterfaceMethod java/lang/CharSequence.charAt:(I)C",
                "       199: iload_3",
                "       200: invokestatic  #132                // Method java/lang/Character.digit:(CI)I",
                "       203: istore        10",
                "       205: iload         10",
                "       207: iflt          217",
                "       210: iload         9",
                "       212: iload         8",
                "       214: if_icmpge     226",
                "       217: aload_0",
                "       218: iload_1",
                "       219: iload_2",
                "       220: iload         5",
                "       222: invokestatic  #150                // Method java/lang/NumberFormatException.forCharSequence:(Ljava/lang/CharSequence;III)Ljava/lang/NumberFormatException;",
                "       225: athrow",
                "       226: iload         9",
                "       228: iload_3",
                "       229: imul",
                "       230: istore        9",
                "       232: iload         9",
                "       234: iload         6",
                "       236: iload         10",
                "       238: iadd",
                "       239: if_icmpge     251",
                "       242: aload_0",
                "       243: iload_1",
                "       244: iload_2",
                "       245: iload         5",
                "       247: invokestatic  #150                // Method java/lang/NumberFormatException.forCharSequence:(Ljava/lang/CharSequence;III)Ljava/lang/NumberFormatException;",
                "       250: athrow",
                "       251: iinc          5, 1",
                "       254: iload         9",
                "       256: iload         10",
                "       258: isub",
                "       259: istore        9",
                "       261: goto          185",
                "       264: iload         4",
                "       266: ifeq          274",
                "       269: iload         9",
                "       271: goto          277",
                "       274: iload         9",
                "       276: ineg",
                "       277: ireturn",
                "       278: ldc           #154                // String",
                "       280: iload_3",
                "       281: invokestatic  #128                // Method java/lang/NumberFormatException.forInputString:(Ljava/lang/String;I)Ljava/lang/NumberFormatException;",
                "       284: athrow",
                "      LineNumberTable:",
                "        line 704: 0",
                "        line 705: 5",
                "        line 707: 17",
                "        line 708: 22",
                "        line 711: 54",
                "        line 712: 60",
                "        line 716: 92",
                "        line 717: 95",
                "        line 718: 98",
                "        line 720: 102",
                "        line 721: 108",
                "        line 722: 118",
                "        line 723: 125",
                "        line 724: 132",
                "        line 725: 135",
                "        line 726: 142",
                "        line 727: 149",
                "        line 730: 158",
                "        line 731: 161",
                "        line 732: 167",
                "        line 736: 176",
                "        line 737: 182",
                "        line 738: 185",
                "        line 740: 191",
                "        line 741: 205",
                "        line 742: 217",
                "        line 745: 226",
                "        line 746: 232",
                "        line 747: 242",
                "        line 750: 251",
                "        line 751: 254",
                "        line 752: 261",
                "        line 753: 264",
                "        line 755: 278",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "          205      56    10 digit   I",
                "          118     160     7 firstChar   C",
                "          182      96     8 multmin   I",
                "          185      93     9 result   I",
                "            0     285     0     s   Ljava/lang/CharSequence;",
                "            0     285     1 beginIndex   I",
                "            0     285     2 endIndex   I",
                "            0     285     3 radix   I",
                "           95     190     4 negative   Z",
                "           98     187     5     i   I",
                "          102     183     6 limit   I",
                "    Exceptions:",
                "      throws java.lang.NumberFormatException"
        );
    }

    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_16() {
        expectedConsecutiveLines = List.of(
                "  public static int parseInt(java.lang.String) throws java.lang.NumberFormatException;",
                "    descriptor: (Ljava/lang/String;)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: bipush        10",
                "         3: invokestatic  #156                // Method parseInt:(Ljava/lang/String;I)I",
                "         6: ireturn",
                "      LineNumberTable:",
                "        line 777: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       7     0     s   Ljava/lang/String;",
                "    Exceptions:",
                "      throws java.lang.NumberFormatException"
        );
    }

    @Instruction(value = 0xffffffff, name = "ldc2_w")
    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x08, name = "iconst_5")
    @Instruction(value = 0x09, name = "lconst_0")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x12, name = "ldc")
    @Instruction(value = 0x16, name = "lload")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0x1c, name = "iload_2")
    @Instruction(value = 0x1d, name = "iload_3")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x37, name = "lstore")
    @Instruction(value = 0x3d, name = "istore_2")
    @Instruction(value = 0x3e, name = "istore_3")
    @Instruction(value = 0x53, name = "aastore")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0x7f, name = "land")
    @Instruction(value = 0x88, name = "l2i")
    @Instruction(value = 0x94, name = "lcmp")
    @Instruction(value = 0x9a, name = "ifne")
    @Instruction(value = 0x9e, name = "ifle")
    @Instruction(value = 0xa0, name = "if_icmpne")
    @Instruction(value = 0xa3, name = "if_icmpgt")
    @Instruction(value = 0xa4, name = "if_icmple")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbd, name = "anewarray")
    @Instruction(value = 0xbf, name = "athrow")
    @Instruction(value = 0xc7, name = "ifnonnull")
    @Test
    public void test_17() {
        expectedConsecutiveLines = List.of(
                "  public static int parseUnsignedInt(java.lang.String, int) throws java.lang.NumberFormatException;",
                "    descriptor: (Ljava/lang/String;I)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=7, locals=6, args_size=2",
                "         0: aload_0",
                "         1: ifnonnull     14",
                "         4: new           #90                 // class java/lang/NumberFormatException",
                "         7: dup",
                "         8: ldc           #92                 // String Cannot parse null string",
                "        10: invokespecial #94                 // Method java/lang/NumberFormatException.\"<init>\":(Ljava/lang/String;)V",
                "        13: athrow",
                "        14: aload_0",
                "        15: invokevirtual #118                // Method java/lang/String.length:()I",
                "        18: istore_2",
                "        19: iload_2",
                "        20: ifle          122",
                "        23: aload_0",
                "        24: iconst_0",
                "        25: invokevirtual #123                // Method java/lang/String.charAt:(I)C",
                "        28: istore_3",
                "        29: iload_3",
                "        30: bipush        45",
                "        32: if_icmpne     56",
                "        35: new           #90                 // class java/lang/NumberFormatException",
                "        38: dup",
                "        39: ldc           #160                // String Illegal leading minus sign on unsigned string %s.",
                "        41: iconst_1",
                "        42: anewarray     #162                // class java/lang/Object",
                "        45: dup",
                "        46: iconst_0",
                "        47: aload_0",
                "        48: aastore",
                "        49: invokestatic  #164                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;",
                "        52: invokespecial #94                 // Method java/lang/NumberFormatException.\"<init>\":(Ljava/lang/String;)V",
                "        55: athrow",
                "        56: iload_2",
                "        57: iconst_5",
                "        58: if_icmple     73",
                "        61: iload_1",
                "        62: bipush        10",
                "        64: if_icmpne     79",
                "        67: iload_2",
                "        68: bipush        9",
                "        70: if_icmpgt     79",
                "        73: aload_0",
                "        74: iload_1",
                "        75: invokestatic  #156                // Method parseInt:(Ljava/lang/String;I)I",
                "        78: ireturn",
                "        79: aload_0",
                "        80: iload_1",
                "        81: invokestatic  #168                // Method java/lang/Long.parseLong:(Ljava/lang/String;I)J",
                "        84: lstore        4",
                "        86: lload         4",
                "        88: ldc2_w        #172                // long -4294967296l",
                "        91: land",
                "        92: lconst_0",
                "        93: lcmp",
                "        94: ifne          101",
                "        97: lload         4",
                "        99: l2i",
                "       100: ireturn",
                "       101: new           #90                 // class java/lang/NumberFormatException",
                "       104: dup",
                "       105: ldc           #174                // String String value %s exceeds range of unsigned int.",
                "       107: iconst_1",
                "       108: anewarray     #162                // class java/lang/Object",
                "       111: dup",
                "       112: iconst_0",
                "       113: aload_0",
                "       114: aastore",
                "       115: invokestatic  #164                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;",
                "       118: invokespecial #94                 // Method java/lang/NumberFormatException.\"<init>\":(Ljava/lang/String;)V",
                "       121: athrow",
                "       122: aload_0",
                "       123: iload_1",
                "       124: invokestatic  #128                // Method java/lang/NumberFormatException.forInputString:(Ljava/lang/String;I)Ljava/lang/NumberFormatException;",
                "       127: athrow",
                "      LineNumberTable:",
                "        line 825: 0",
                "        line 826: 4",
                "        line 829: 14",
                "        line 830: 19",
                "        line 831: 23",
                "        line 832: 29",
                "        line 833: 35",
                "        line 834: 49",
                "        line 837: 56",
                "        line 839: 73",
                "        line 841: 79",
                "        line 842: 86",
                "        line 843: 97",
                "        line 845: 101",
                "        line 846: 115",
                "        line 852: 122",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "           86      36     4   ell   J",
                "           29      93     3 firstChar   C",
                "            0     128     0     s   Ljava/lang/String;",
                "            0     128     1 radix   I",
                "           19     109     2   len   I",
                "    Exceptions:",
                "      throws java.lang.NumberFormatException"
        );
    }

    @Instruction(value = 0xffffffff, name = "ldc2_w")
    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x08, name = "iconst_5")
    @Instruction(value = 0x09, name = "lconst_0")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x12, name = "ldc")
    @Instruction(value = 0x15, name = "iload")
    @Instruction(value = 0x16, name = "lload")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0x1c, name = "iload_2")
    @Instruction(value = 0x1d, name = "iload_3")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x36, name = "istore")
    @Instruction(value = 0x37, name = "lstore")
    @Instruction(value = 0x53, name = "aastore")
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0x60, name = "iadd")
    @Instruction(value = 0x64, name = "isub")
    @Instruction(value = 0x7f, name = "land")
    @Instruction(value = 0x88, name = "l2i")
    @Instruction(value = 0x94, name = "lcmp")
    @Instruction(value = 0x9a, name = "ifne")
    @Instruction(value = 0x9e, name = "ifle")
    @Instruction(value = 0xa0, name = "if_icmpne")
    @Instruction(value = 0xa3, name = "if_icmpgt")
    @Instruction(value = 0xa4, name = "if_icmple")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbd, name = "anewarray")
    @Instruction(value = 0xbf, name = "athrow")
    @Test
    public void test_18() {
        expectedConsecutiveLines = List.of(
                "  public static int parseUnsignedInt(java.lang.CharSequence, int, int, int) throws java.lang.NumberFormatException;",
                "    descriptor: (Ljava/lang/CharSequence;III)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=7, locals=9, args_size=4",
                "         0: aload_0",
                "         1: invokestatic  #136                // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "         4: pop",
                "         5: iload_1",
                "         6: iload_2",
                "         7: aload_0",
                "         8: invokeinterface #142,  1          // InterfaceMethod java/lang/CharSequence.length:()I",
                "        13: invokestatic  #145                // Method java/util/Objects.checkFromToIndex:(III)I",
                "        16: pop",
                "        17: iload_1",
                "        18: istore        4",
                "        20: iload_2",
                "        21: iload_1",
                "        22: isub",
                "        23: istore        5",
                "        25: iload         5",
                "        27: ifle          150",
                "        30: aload_0",
                "        31: iload         4",
                "        33: invokeinterface #149,  2          // InterfaceMethod java/lang/CharSequence.charAt:(I)C",
                "        38: istore        6",
                "        40: iload         6",
                "        42: bipush        45",
                "        44: if_icmpne     68",
                "        47: new           #90                 // class java/lang/NumberFormatException",
                "        50: dup",
                "        51: ldc           #160                // String Illegal leading minus sign on unsigned string %s.",
                "        53: iconst_1",
                "        54: anewarray     #162                // class java/lang/Object",
                "        57: dup",
                "        58: iconst_0",
                "        59: aload_0",
                "        60: aastore",
                "        61: invokestatic  #164                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;",
                "        64: invokespecial #94                 // Method java/lang/NumberFormatException.\"<init>\":(Ljava/lang/String;)V",
                "        67: athrow",
                "        68: iload         5",
                "        70: iconst_5",
                "        71: if_icmple     87",
                "        74: iload_3",
                "        75: bipush        10",
                "        77: if_icmpne     100",
                "        80: iload         5",
                "        82: bipush        9",
                "        84: if_icmpgt     100",
                "        87: aload_0",
                "        88: iload         4",
                "        90: iload         4",
                "        92: iload         5",
                "        94: iadd",
                "        95: iload_3",
                "        96: invokestatic  #176                // Method parseInt:(Ljava/lang/CharSequence;III)I",
                "        99: ireturn",
                "       100: aload_0",
                "       101: iload         4",
                "       103: iload         4",
                "       105: iload         5",
                "       107: iadd",
                "       108: iload_3",
                "       109: invokestatic  #179                // Method java/lang/Long.parseLong:(Ljava/lang/CharSequence;III)J",
                "       112: lstore        7",
                "       114: lload         7",
                "       116: ldc2_w        #172                // long -4294967296l",
                "       119: land",
                "       120: lconst_0",
                "       121: lcmp",
                "       122: ifne          129",
                "       125: lload         7",
                "       127: l2i",
                "       128: ireturn",
                "       129: new           #90                 // class java/lang/NumberFormatException",
                "       132: dup",
                "       133: ldc           #174                // String String value %s exceeds range of unsigned int.",
                "       135: iconst_1",
                "       136: anewarray     #162                // class java/lang/Object",
                "       139: dup",
                "       140: iconst_0",
                "       141: aload_0",
                "       142: aastore",
                "       143: invokestatic  #164                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;",
                "       146: invokespecial #94                 // Method java/lang/NumberFormatException.\"<init>\":(Ljava/lang/String;)V",
                "       149: athrow",
                "       150: new           #90                 // class java/lang/NumberFormatException",
                "       153: dup",
                "       154: ldc           #154                // String",
                "       156: invokespecial #94                 // Method java/lang/NumberFormatException.\"<init>\":(Ljava/lang/String;)V",
                "       159: athrow",
                "      LineNumberTable:",
                "        line 885: 0",
                "        line 886: 5",
                "        line 888: 17",
                "        line 890: 25",
                "        line 891: 30",
                "        line 892: 40",
                "        line 893: 47",
                "        line 894: 61",
                "        line 897: 68",
                "        line 899: 87",
                "        line 901: 100",
                "        line 902: 114",
                "        line 903: 125",
                "        line 905: 129",
                "        line 906: 143",
                "        line 912: 150",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "          114      36     7   ell   J",
                "           40     110     6 firstChar   C",
                "            0     160     0     s   Ljava/lang/CharSequence;",
                "            0     160     1 beginIndex   I",
                "            0     160     2 endIndex   I",
                "            0     160     3 radix   I",
                "           20     140     4 start   I",
                "           25     135     5   len   I",
                "    Exceptions:",
                "      throws java.lang.NumberFormatException"
        );
    }

    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_19() {
        expectedConsecutiveLines = List.of(
                "  public static int parseUnsignedInt(java.lang.String) throws java.lang.NumberFormatException;",
                "    descriptor: (Ljava/lang/String;)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: bipush        10",
                "         3: invokestatic  #182                // Method parseUnsignedInt:(Ljava/lang/String;I)I",
                "         6: ireturn",
                "      LineNumberTable:",
                "        line 933: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       7     0     s   Ljava/lang/String;",
                "    Exceptions:",
                "      throws java.lang.NumberFormatException"
        );
    }

    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_20() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.Integer valueOf(java.lang.String, int) throws java.lang.NumberFormatException;",
                "    descriptor: (Ljava/lang/String;I)Ljava/lang/Integer;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_0",
                "         1: iload_1",
                "         2: invokestatic  #156                // Method parseInt:(Ljava/lang/String;I)I",
                "         5: invokestatic  #185                // Method valueOf:(I)Ljava/lang/Integer;",
                "         8: areturn",
                "      LineNumberTable:",
                "        line 962: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       9     0     s   Ljava/lang/String;",
                "            0       9     1 radix   I",
                "    Exceptions:",
                "      throws java.lang.NumberFormatException"
        );
    }

    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_21() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.Integer valueOf(java.lang.String) throws java.lang.NumberFormatException;",
                "    descriptor: (Ljava/lang/String;)Ljava/lang/Integer;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: bipush        10",
                "         3: invokestatic  #156                // Method parseInt:(Ljava/lang/String;I)I",
                "         6: invokestatic  #185                // Method valueOf:(I)Ljava/lang/Integer;",
                "         9: areturn",
                "      LineNumberTable:",
                "        line 988: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      10     0     s   Ljava/lang/String;",
                "    Exceptions:",
                "      throws java.lang.NumberFormatException"
        );
    }

    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x11, name = "sipush")
    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0x32, name = "aaload")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0x60, name = "iadd")
    @Instruction(value = 0xa1, name = "if_icmplt")
    @Instruction(value = 0xa3, name = "if_icmpgt")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb2, name = "getstatic")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xbb, name = "new")
    @Test
    public void test_22() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.Integer valueOf(int);",
                "    descriptor: (I)Ljava/lang/Integer;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=3, locals=1, args_size=1",
                "         0: iload_0",
                "         1: bipush        -128",
                "         3: if_icmplt     23",
                "         6: iload_0",
                "         7: getstatic     #191                // Field java/lang/Integer$IntegerCache.high:I",
                "        10: if_icmpgt     23",
                "        13: getstatic     #195                // Field java/lang/Integer$IntegerCache.cache:[Ljava/lang/Integer;",
                "        16: iload_0",
                "        17: sipush        128",
                "        20: iadd",
                "        21: aaload",
                "        22: areturn",
                "        23: new           #1                  // class java/lang/Integer",
                "        26: dup",
                "        27: iload_0",
                "        28: invokespecial #199                // Method \"<init>\":(I)V",
                "        31: areturn",
                "      LineNumberTable:",
                "        line 1068: 0",
                "        line 1069: 13",
                "        line 1070: 23",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      32     0     i   I"
        );
    }

    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xb1, name = "return")
    @Instruction(value = 0xb5, name = "putfield")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Test
    public void test_23() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Integer(int);",
                "    descriptor: (I)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_0",
                "         1: invokespecial #202                // Method java/lang/Number.\"<init>\":()V",
                "         4: aload_0",
                "         5: iload_1",
                "         6: putfield      #205                // Field value:I",
                "         9: return",
                "      LineNumberTable:",
                "        line 1093: 0",
                "        line 1094: 4",
                "        line 1095: 9",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      10     0  this   Ljava/lang/Integer;",
                "            0      10     1 value   I"
        );
    }

    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0xb1, name = "return")
    @Instruction(value = 0xb5, name = "putfield")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_24() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Integer(java.lang.String) throws java.lang.NumberFormatException;",
                "    descriptor: (Ljava/lang/String;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=2, args_size=2",
                "         0: aload_0",
                "         1: invokespecial #202                // Method java/lang/Number.\"<init>\":()V",
                "         4: aload_0",
                "         5: aload_1",
                "         6: bipush        10",
                "         8: invokestatic  #156                // Method parseInt:(Ljava/lang/String;I)I",
                "        11: putfield      #205                // Field value:I",
                "        14: return",
                "      LineNumberTable:",
                "        line 1115: 0",
                "        line 1116: 4",
                "        line 1117: 14",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      15     0  this   Ljava/lang/Integer;",
                "            0      15     1     s   Ljava/lang/String;",
                "    Exceptions:",
                "      throws java.lang.NumberFormatException"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x91, name = "i2b")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Test
    public void test_25() {
        expectedConsecutiveLines = List.of(
                "  public byte byteValue();",
                "    descriptor: ()B",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #205                // Field value:I",
                "         4: i2b",
                "         5: ireturn",
                "      LineNumberTable:",
                "        line 1125: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0  this   Ljava/lang/Integer;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x93, name = "i2s")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Test
    public void test_26() {
        expectedConsecutiveLines = List.of(
                "  public short shortValue();",
                "    descriptor: ()S",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #205                // Field value:I",
                "         4: i2s",
                "         5: ireturn",
                "      LineNumberTable:",
                "        line 1134: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0  this   Ljava/lang/Integer;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Test
    public void test_27() {
        expectedConsecutiveLines = List.of(
                "  public int intValue();",
                "    descriptor: ()I",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #205                // Field value:I",
                "         4: ireturn",
                "      LineNumberTable:",
                "        line 1143: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       5     0  this   Ljava/lang/Integer;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x85, name = "i2l")
    @Instruction(value = 0xad, name = "lreturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Test
    public void test_28() {
        expectedConsecutiveLines = List.of(
                "  public long longValue();",
                "    descriptor: ()J",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #205                // Field value:I",
                "         4: i2l",
                "         5: lreturn",
                "      LineNumberTable:",
                "        line 1153: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0  this   Ljava/lang/Integer;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x86, name = "i2f")
    @Instruction(value = 0xae, name = "freturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Test
    public void test_29() {
        expectedConsecutiveLines = List.of(
                "  public float floatValue();",
                "    descriptor: ()F",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #205                // Field value:I",
                "         4: i2f",
                "         5: freturn",
                "      LineNumberTable:",
                "        line 1162: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0  this   Ljava/lang/Integer;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x87, name = "i2d")
    @Instruction(value = 0xaf, name = "dreturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Test
    public void test_30() {
        expectedConsecutiveLines = List.of(
                "  public double doubleValue();",
                "    descriptor: ()D",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #205                // Field value:I",
                "         4: i2d",
                "         5: dreturn",
                "      LineNumberTable:",
                "        line 1171: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0  this   Ljava/lang/Integer;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_31() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.String toString();",
                "    descriptor: ()Ljava/lang/String;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #205                // Field value:I",
                "         4: invokestatic  #9                  // Method toString:(I)Ljava/lang/String;",
                "         7: areturn",
                "      LineNumberTable:",
                "        line 1185: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       8     0  this   Ljava/lang/Integer;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_32() {
        expectedConsecutiveLines = List.of(
                "  public int hashCode();",
                "    descriptor: ()I",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #205                // Field value:I",
                "         4: invokestatic  #208                // Method hashCode:(I)I",
                "         7: ireturn",
                "      LineNumberTable:",
                "        line 1197: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       8     0  this   Ljava/lang/Integer;"
        );
    }

    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0xac, name = "ireturn")
    @Test
    public void test_33() {
        expectedConsecutiveLines = List.of(
                "  public static int hashCode(int);",
                "    descriptor: (I)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: iload_0",
                "         1: ireturn",
                "      LineNumberTable:",
                "        line 1210: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       2     0 value   I"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0xa0, name = "if_icmpne")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xc0, name = "checkcast")
    @Instruction(value = 0xc1, name = "instanceof")
    @Test
    public void test_34() {
        expectedConsecutiveLines = List.of(
                "  public boolean equals(java.lang.Object);",
                "    descriptor: (Ljava/lang/Object;)Z",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_1",
                "         1: instanceof    #1                  // class java/lang/Integer",
                "         4: ifeq          27",
                "         7: aload_0",
                "         8: getfield      #205                // Field value:I",
                "        11: aload_1",
                "        12: checkcast     #1                  // class java/lang/Integer",
                "        15: invokevirtual #211                // Method intValue:()I",
                "        18: if_icmpne     25",
                "        21: iconst_1",
                "        22: goto          26",
                "        25: iconst_0",
                "        26: ireturn",
                "        27: iconst_0",
                "        28: ireturn",
                "      LineNumberTable:",
                "        line 1224: 0",
                "        line 1225: 7",
                "        line 1227: 27",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      29     0  this   Ljava/lang/Integer;",
                "            0      29     1   obj   Ljava/lang/Object;"
        );
    }

    @Instruction(value = 0x01, name = "aconst_null")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_35() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.Integer getInteger(java.lang.String);",
                "    descriptor: (Ljava/lang/String;)Ljava/lang/Integer;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: aconst_null",
                "         2: invokestatic  #214                // Method getInteger:(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;",
                "         5: areturn",
                "      LineNumberTable:",
                "        line 1261: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0    nm   Ljava/lang/String;"
        );
    }

    @Instruction(value = 0x01, name = "aconst_null")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x4d, name = "astore_2")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xc7, name = "ifnonnull")
    @Test
    public void test_36() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.Integer getInteger(java.lang.String, int);",
                "    descriptor: (Ljava/lang/String;I)Ljava/lang/Integer;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=3, args_size=2",
                "         0: aload_0",
                "         1: aconst_null",
                "         2: invokestatic  #214                // Method getInteger:(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;",
                "         5: astore_2",
                "         6: aload_2",
                "         7: ifnonnull     17",
                "        10: iload_1",
                "        11: invokestatic  #185                // Method valueOf:(I)Ljava/lang/Integer;",
                "        14: goto          18",
                "        17: aload_2",
                "        18: areturn",
                "      LineNumberTable:",
                "        line 1307: 0",
                "        line 1308: 6",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      19     0    nm   Ljava/lang/String;",
                "            0      19     1   val   I",
                "            6      13     2 result   Ljava/lang/Integer;"
        );
    }

    @Instruction(value = 0x01, name = "aconst_null")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x4d, name = "astore_2")
    @Instruction(value = 0x4e, name = "astore_3")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xc6, name = "ifnull")
    @Test
    public void test_37() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.Integer getInteger(java.lang.String, java.lang.Integer);",
                "    descriptor: (Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=1, locals=4, args_size=2",
                "         0: aconst_null",
                "         1: astore_2",
                "         2: aload_0",
                "         3: invokestatic  #218                // Method java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;",
                "         6: astore_2",
                "         7: goto          11",
                "        10: astore_3",
                "        11: aload_2",
                "        12: ifnull        21",
                "        15: aload_2",
                "        16: invokestatic  #228                // Method decode:(Ljava/lang/String;)Ljava/lang/Integer;",
                "        19: areturn",
                "        20: astore_3",
                "        21: aload_1",
                "        22: areturn",
                "      Exception table:",
                "         from    to  target type",
                "             2     7    10   Class java/lang/IllegalArgumentException",
                "             2     7    10   Class java/lang/NullPointerException",
                "            15    19    20   Class java/lang/NumberFormatException",
                "      LineNumberTable:",
                "        line 1349: 0",
                "        line 1351: 2",
                "        line 1353: 7",
                "        line 1352: 10",
                "        line 1354: 11",
                "        line 1356: 15",
                "        line 1357: 20",
                "        line 1360: 21",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      23     0    nm   Ljava/lang/String;",
                "            0      23     1   val   Ljava/lang/Integer;",
                "            2      21     2     v   Ljava/lang/String;"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x12, name = "ldc")
    @Instruction(value = 0x15, name = "iload")
    @Instruction(value = 0x19, name = "aload")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0x1c, name = "iload_2")
    @Instruction(value = 0x1d, name = "iload_3")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x36, name = "istore")
    @Instruction(value = 0x3a, name = "astore")
    @Instruction(value = 0x3c, name = "istore_1")
    @Instruction(value = 0x3d, name = "istore_2")
    @Instruction(value = 0x3e, name = "istore_3")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0x60, name = "iadd")
    @Instruction(value = 0x74, name = "ineg")
    @Instruction(value = 0x84, name = "iinc")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0x9a, name = "ifne")
    @Instruction(value = 0xa0, name = "if_icmpne")
    @Instruction(value = 0xa4, name = "if_icmple")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbf, name = "athrow")
    @Test
    public void test_38() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.Integer decode(java.lang.String) throws java.lang.NumberFormatException;",
                "    descriptor: (Ljava/lang/String;)Ljava/lang/Integer;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=8, args_size=1",
                "         0: bipush        10",
                "         2: istore_1",
                "         3: iconst_0",
                "         4: istore_2",
                "         5: iconst_0",
                "         6: istore_3",
                "         7: aload_0",
                "         8: invokevirtual #232                // Method java/lang/String.isEmpty:()Z",
                "        11: ifeq          24",
                "        14: new           #90                 // class java/lang/NumberFormatException",
                "        17: dup",
                "        18: ldc           #236                // String Zero length string",
                "        20: invokespecial #94                 // Method java/lang/NumberFormatException.\"<init>\":(Ljava/lang/String;)V",
                "        23: athrow",
                "        24: aload_0",
                "        25: iconst_0",
                "        26: invokevirtual #123                // Method java/lang/String.charAt:(I)C",
                "        29: istore        5",
                "        31: iload         5",
                "        33: bipush        45",
                "        35: if_icmpne     46",
                "        38: iconst_1",
                "        39: istore_3",
                "        40: iinc          2, 1",
                "        43: goto          56",
                "        46: iload         5",
                "        48: bipush        43",
                "        50: if_icmpne     56",
                "        53: iinc          2, 1",
                "        56: aload_0",
                "        57: ldc           #238                // String 0x",
                "        59: iload_2",
                "        60: invokevirtual #240                // Method java/lang/String.startsWith:(Ljava/lang/String;I)Z",
                "        63: ifne          76",
                "        66: aload_0",
                "        67: ldc           #244                // String 0X",
                "        69: iload_2",
                "        70: invokevirtual #240                // Method java/lang/String.startsWith:(Ljava/lang/String;I)Z",
                "        73: ifeq          85",
                "        76: iinc          2, 2",
                "        79: bipush        16",
                "        81: istore_1",
                "        82: goto          130",
                "        85: aload_0",
                "        86: ldc           #246                // String #",
                "        88: iload_2",
                "        89: invokevirtual #240                // Method java/lang/String.startsWith:(Ljava/lang/String;I)Z",
                "        92: ifeq          104",
                "        95: iinc          2, 1",
                "        98: bipush        16",
                "       100: istore_1",
                "       101: goto          130",
                "       104: aload_0",
                "       105: ldc           #248                // String 0",
                "       107: iload_2",
                "       108: invokevirtual #240                // Method java/lang/String.startsWith:(Ljava/lang/String;I)Z",
                "       111: ifeq          130",
                "       114: aload_0",
                "       115: invokevirtual #118                // Method java/lang/String.length:()I",
                "       118: iconst_1",
                "       119: iload_2",
                "       120: iadd",
                "       121: if_icmple     130",
                "       124: iinc          2, 1",
                "       127: bipush        8",
                "       129: istore_1",
                "       130: aload_0",
                "       131: ldc           #250                // String -",
                "       133: iload_2",
                "       134: invokevirtual #240                // Method java/lang/String.startsWith:(Ljava/lang/String;I)Z",
                "       137: ifne          150",
                "       140: aload_0",
                "       141: ldc           #252                // String +",
                "       143: iload_2",
                "       144: invokevirtual #240                // Method java/lang/String.startsWith:(Ljava/lang/String;I)Z",
                "       147: ifeq          160",
                "       150: new           #90                 // class java/lang/NumberFormatException",
                "       153: dup",
                "       154: ldc           #254                // String Sign character in wrong position",
                "       156: invokespecial #94                 // Method java/lang/NumberFormatException.\"<init>\":(Ljava/lang/String;)V",
                "       159: athrow",
                "       160: aload_0",
                "       161: iload_2",
                "       162: aload_0",
                "       163: invokevirtual #118                // Method java/lang/String.length:()I",
                "       166: iload_1",
                "       167: invokestatic  #176                // Method parseInt:(Ljava/lang/CharSequence;III)I",
                "       170: istore        4",
                "       172: iload_3",
                "       173: ifeq          182",
                "       176: iload         4",
                "       178: ineg",
                "       179: goto          184",
                "       182: iload         4",
                "       184: istore        4",
                "       186: goto          236",
                "       189: astore        6",
                "       191: iload_3",
                "       192: ifeq          221",
                "       195: new           #97                 // class java/lang/StringBuilder",
                "       198: dup",
                "       199: invokespecial #99                 // Method java/lang/StringBuilder.\"<init>\":()V",
                "       202: ldc           #250                // String -",
                "       204: invokevirtual #104                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "       207: aload_0",
                "       208: iload_2",
                "       209: invokevirtual #256                // Method java/lang/String.substring:(I)Ljava/lang/String;",
                "       212: invokevirtual #104                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "       215: invokevirtual #113                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;",
                "       218: goto          226",
                "       221: aload_0",
                "       222: iload_2",
                "       223: invokevirtual #256                // Method java/lang/String.substring:(I)Ljava/lang/String;",
                "       226: astore        7",
                "       228: aload         7",
                "       230: iload_1",
                "       231: invokestatic  #156                // Method parseInt:(Ljava/lang/String;I)I",
                "       234: istore        4",
                "       236: iload         4",
                "       238: invokestatic  #185                // Method valueOf:(I)Ljava/lang/Integer;",
                "       241: areturn",
                "      Exception table:",
                "         from    to  target type",
                "           160   186   189   Class java/lang/NumberFormatException",
                "      LineNumberTable:",
                "        line 1406: 0",
                "        line 1407: 3",
                "        line 1408: 5",
                "        line 1411: 7",
                "        line 1412: 14",
                "        line 1413: 24",
                "        line 1415: 31",
                "        line 1416: 38",
                "        line 1417: 40",
                "        line 1418: 46",
                "        line 1419: 53",
                "        line 1422: 56",
                "        line 1423: 76",
                "        line 1424: 79",
                "        line 1426: 85",
                "        line 1427: 95",
                "        line 1428: 98",
                "        line 1430: 104",
                "        line 1431: 124",
                "        line 1432: 127",
                "        line 1435: 130",
                "        line 1436: 150",
                "        line 1439: 160",
                "        line 1440: 172",
                "        line 1448: 186",
                "        line 1441: 189",
                "        line 1445: 191",
                "        line 1446: 221",
                "        line 1447: 228",
                "        line 1449: 236",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "          172      17     4 result   I",
                "          228       8     7 constant   Ljava/lang/String;",
                "          191      45     6     e   Ljava/lang/NumberFormatException;",
                "            0     242     0    nm   Ljava/lang/String;",
                "            3     239     1 radix   I",
                "            5     237     2 index   I",
                "            7     235     3 negative   Z",
                "          236       6     4 result   I",
                "           31     211     5 firstChar   C",
                "    Exceptions:",
                "      throws java.lang.NumberFormatException"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_39() {
        expectedConsecutiveLines = List.of(
                "  public int compareTo(java.lang.Integer);",
                "    descriptor: (Ljava/lang/Integer;)I",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_0",
                "         1: getfield      #205                // Field value:I",
                "         4: aload_1",
                "         5: getfield      #205                // Field value:I",
                "         8: invokestatic  #259                // Method compare:(II)I",
                "        11: ireturn",
                "      LineNumberTable:",
                "        line 1466: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      12     0  this   Ljava/lang/Integer;",
                "            0      12     1 anotherInteger   Ljava/lang/Integer;"
        );
    }

    @Instruction(value = 0x02, name = "iconst_m1")
    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0xa0, name = "if_icmpne")
    @Instruction(value = 0xa2, name = "if_icmpge")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xac, name = "ireturn")
    @Test
    public void test_40() {
        expectedConsecutiveLines = List.of(
                "  public static int compare(int, int);",
                "    descriptor: (II)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: iload_0",
                "         1: iload_1",
                "         2: if_icmpge     9",
                "         5: iconst_m1",
                "         6: goto          19",
                "         9: iload_0",
                "        10: iload_1",
                "        11: if_icmpne     18",
                "        14: iconst_0",
                "        15: goto          19",
                "        18: iconst_1",
                "        19: ireturn",
                "      LineNumberTable:",
                "        line 1484: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      20     0     x   I",
                "            0      20     1     y   I"
        );
    }

    @Instruction(value = 0x12, name = "ldc")
    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0x60, name = "iadd")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_41() {
        expectedConsecutiveLines = List.of(
                "  public static int compareUnsigned(int, int);",
                "    descriptor: (II)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=3, locals=2, args_size=2",
                "         0: iload_0",
                "         1: ldc           #127                // int -2147483648",
                "         3: iadd",
                "         4: iload_1",
                "         5: ldc           #127                // int -2147483648",
                "         7: iadd",
                "         8: invokestatic  #259                // Method compare:(II)I",
                "        11: ireturn",
                "      LineNumberTable:",
                "        line 1501: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      12     0     x   I",
                "            0      12     1     y   I"
        );
    }

    @Instruction(value = 0xffffffff, name = "ldc2_w")
    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0x7f, name = "land")
    @Instruction(value = 0x85, name = "i2l")
    @Instruction(value = 0xad, name = "lreturn")
    @Test
    public void test_42() {
        expectedConsecutiveLines = List.of(
                "  public static long toUnsignedLong(int);",
                "    descriptor: (I)J",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=1, args_size=1",
                "         0: iload_0",
                "         1: i2l",
                "         2: ldc2_w        #262                // long 4294967295l",
                "         5: land",
                "         6: lreturn",
                "      LineNumberTable:",
                "        line 1522: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       7     0     x   I"
        );
    }

    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0x6d, name = "ldiv")
    @Instruction(value = 0x88, name = "l2i")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_43() {
        expectedConsecutiveLines = List.of(
                "  public static int divideUnsigned(int, int);",
                "    descriptor: (II)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=2, args_size=2",
                "         0: iload_0",
                "         1: invokestatic  #38                 // Method toUnsignedLong:(I)J",
                "         4: iload_1",
                "         5: invokestatic  #38                 // Method toUnsignedLong:(I)J",
                "         8: ldiv",
                "         9: l2i",
                "        10: ireturn",
                "      LineNumberTable:",
                "        line 1546: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      11     0 dividend   I",
                "            0      11     1 divisor   I"
        );
    }

    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0x71, name = "lrem")
    @Instruction(value = 0x88, name = "l2i")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_44() {
        expectedConsecutiveLines = List.of(
                "  public static int remainderUnsigned(int, int);",
                "    descriptor: (II)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=2, args_size=2",
                "         0: iload_0",
                "         1: invokestatic  #38                 // Method toUnsignedLong:(I)J",
                "         4: iload_1",
                "         5: invokestatic  #38                 // Method toUnsignedLong:(I)J",
                "         8: lrem",
                "         9: l2i",
                "        10: ireturn",
                "      LineNumberTable:",
                "        line 1564: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      11     0 dividend   I",
                "            0      11     1 divisor   I"
        );
    }

    @Instruction(value = 0x12, name = "ldc")
    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0x7c, name = "iushr")
    @Instruction(value = 0x7e, name = "iand")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_45() {
        expectedConsecutiveLines = List.of(
                "  public static int highestOneBit(int);",
                "    descriptor: (I)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=3, locals=1, args_size=1",
                "         0: iload_0",
                "         1: ldc           #127                // int -2147483648",
                "         3: iload_0",
                "         4: invokestatic  #51                 // Method numberOfLeadingZeros:(I)I",
                "         7: iushr",
                "         8: iand",
                "         9: ireturn",
                "      LineNumberTable:",
                "        line 1600: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      10     0     i   I"
        );
    }

    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0x74, name = "ineg")
    @Instruction(value = 0x7e, name = "iand")
    @Instruction(value = 0xac, name = "ireturn")
    @Test
    public void test_46() {
        expectedConsecutiveLines = List.of(
                "  public static int lowestOneBit(int);",
                "    descriptor: (I)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: iload_0",
                "         1: iload_0",
                "         2: ineg",
                "         3: iand",
                "         4: ireturn",
                "      LineNumberTable:",
                "        line 1618: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       5     0     i   I"
        );
    }

    @Instruction(value = 0xffffffff, name = "ldc_w")
    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x05, name = "iconst_2")
    @Instruction(value = 0x07, name = "iconst_4")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x11, name = "sipush")
    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0x3b, name = "istore_0")
    @Instruction(value = 0x3c, name = "istore_1")
    @Instruction(value = 0x64, name = "isub")
    @Instruction(value = 0x7c, name = "iushr")
    @Instruction(value = 0x84, name = "iinc")
    @Instruction(value = 0x9a, name = "ifne")
    @Instruction(value = 0x9d, name = "ifgt")
    @Instruction(value = 0xa1, name = "if_icmplt")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xac, name = "ireturn")
    @Test
    public void test_47() {
        expectedConsecutiveLines = List.of(
                "  public static int numberOfLeadingZeros(int);",
                "    descriptor: (I)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=3, locals=2, args_size=1",
                "         0: iload_0",
                "         1: ifgt          15",
                "         4: iload_0",
                "         5: ifne          13",
                "         8: bipush        32",
                "        10: goto          14",
                "        13: iconst_0",
                "        14: ireturn",
                "        15: bipush        31",
                "        17: istore_1",
                "        18: iload_0",
                "        19: ldc_w         #264                // int 65536",
                "        22: if_icmplt     33",
                "        25: iinc          1, -16",
                "        28: iload_0",
                "        29: bipush        16",
                "        31: iushr",
                "        32: istore_0",
                "        33: iload_0",
                "        34: sipush        256",
                "        37: if_icmplt     48",
                "        40: iinc          1, -8",
                "        43: iload_0",
                "        44: bipush        8",
                "        46: iushr",
                "        47: istore_0",
                "        48: iload_0",
                "        49: bipush        16",
                "        51: if_icmplt     61",
                "        54: iinc          1, -4",
                "        57: iload_0",
                "        58: iconst_4",
                "        59: iushr",
                "        60: istore_0",
                "        61: iload_0",
                "        62: iconst_4",
                "        63: if_icmplt     73",
                "        66: iinc          1, -2",
                "        69: iload_0",
                "        70: iconst_2",
                "        71: iushr",
                "        72: istore_0",
                "        73: iload_1",
                "        74: iload_0",
                "        75: iconst_1",
                "        76: iushr",
                "        77: isub",
                "        78: ireturn",
                "      LineNumberTable:",
                "        line 1645: 0",
                "        line 1646: 4",
                "        line 1647: 15",
                "        line 1648: 18",
                "        line 1649: 33",
                "        line 1650: 48",
                "        line 1651: 61",
                "        line 1652: 73",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      79     0     i   I",
                "           18      61     1     n   I"
        );
    }

    @Instruction(value = 0xffffffff, name = "ldc_w")
    @Instruction(value = 0x02, name = "iconst_m1")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x05, name = "iconst_2")
    @Instruction(value = 0x07, name = "iconst_4")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x11, name = "sipush")
    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0x3b, name = "istore_0")
    @Instruction(value = 0x3c, name = "istore_1")
    @Instruction(value = 0x60, name = "iadd")
    @Instruction(value = 0x64, name = "isub")
    @Instruction(value = 0x7c, name = "iushr")
    @Instruction(value = 0x7e, name = "iand")
    @Instruction(value = 0x82, name = "ixor")
    @Instruction(value = 0x84, name = "iinc")
    @Instruction(value = 0x9d, name = "ifgt")
    @Instruction(value = 0xa4, name = "if_icmple")
    @Instruction(value = 0xac, name = "ireturn")
    @Test
    public void test_48() {
        expectedConsecutiveLines = List.of(
                "  public static int numberOfTrailingZeros(int);",
                "    descriptor: (I)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=3, locals=2, args_size=1",
                "         0: iload_0",
                "         1: iconst_m1",
                "         2: ixor",
                "         3: iload_0",
                "         4: iconst_1",
                "         5: isub",
                "         6: iand",
                "         7: istore_0",
                "         8: iload_0",
                "         9: ifgt          17",
                "        12: iload_0",
                "        13: bipush        32",
                "        15: iand",
                "        16: ireturn",
                "        17: iconst_1",
                "        18: istore_1",
                "        19: iload_0",
                "        20: ldc_w         #264                // int 65536",
                "        23: if_icmple     34",
                "        26: iinc          1, 16",
                "        29: iload_0",
                "        30: bipush        16",
                "        32: iushr",
                "        33: istore_0",
                "        34: iload_0",
                "        35: sipush        256",
                "        38: if_icmple     49",
                "        41: iinc          1, 8",
                "        44: iload_0",
                "        45: bipush        8",
                "        47: iushr",
                "        48: istore_0",
                "        49: iload_0",
                "        50: bipush        16",
                "        52: if_icmple     62",
                "        55: iinc          1, 4",
                "        58: iload_0",
                "        59: iconst_4",
                "        60: iushr",
                "        61: istore_0",
                "        62: iload_0",
                "        63: iconst_4",
                "        64: if_icmple     74",
                "        67: iinc          1, 2",
                "        70: iload_0",
                "        71: iconst_2",
                "        72: iushr",
                "        73: istore_0",
                "        74: iload_1",
                "        75: iload_0",
                "        76: iconst_1",
                "        77: iushr",
                "        78: iadd",
                "        79: ireturn",
                "      LineNumberTable:",
                "        line 1672: 0",
                "        line 1673: 8",
                "        line 1674: 17",
                "        line 1675: 19",
                "        line 1676: 34",
                "        line 1677: 49",
                "        line 1678: 62",
                "        line 1679: 74",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      80     0     i   I",
                "           19      61     1     n   I"
        );
    }

    @Instruction(value = 0xffffffff, name = "ldc_w")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x05, name = "iconst_2")
    @Instruction(value = 0x07, name = "iconst_4")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0x3b, name = "istore_0")
    @Instruction(value = 0x60, name = "iadd")
    @Instruction(value = 0x64, name = "isub")
    @Instruction(value = 0x7c, name = "iushr")
    @Instruction(value = 0x7e, name = "iand")
    @Instruction(value = 0xac, name = "ireturn")
    @Test
    public void test_49() {
        expectedConsecutiveLines = List.of(
                "  public static int bitCount(int);",
                "    descriptor: (I)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=3, locals=1, args_size=1",
                "         0: iload_0",
                "         1: iload_0",
                "         2: iconst_1",
                "         3: iushr",
                "         4: ldc_w         #265                // int 1431655765",
                "         7: iand",
                "         8: isub",
                "         9: istore_0",
                "        10: iload_0",
                "        11: ldc_w         #266                // int 858993459",
                "        14: iand",
                "        15: iload_0",
                "        16: iconst_2",
                "        17: iushr",
                "        18: ldc_w         #266                // int 858993459",
                "        21: iand",
                "        22: iadd",
                "        23: istore_0",
                "        24: iload_0",
                "        25: iload_0",
                "        26: iconst_4",
                "        27: iushr",
                "        28: iadd",
                "        29: ldc_w         #267                // int 252645135",
                "        32: iand",
                "        33: istore_0",
                "        34: iload_0",
                "        35: iload_0",
                "        36: bipush        8",
                "        38: iushr",
                "        39: iadd",
                "        40: istore_0",
                "        41: iload_0",
                "        42: iload_0",
                "        43: bipush        16",
                "        45: iushr",
                "        46: iadd",
                "        47: istore_0",
                "        48: iload_0",
                "        49: bipush        63",
                "        51: iand",
                "        52: ireturn",
                "      LineNumberTable:",
                "        line 1695: 0",
                "        line 1696: 10",
                "        line 1697: 24",
                "        line 1698: 34",
                "        line 1699: 41",
                "        line 1700: 48",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      53     0     i   I"
        );
    }

    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0x74, name = "ineg")
    @Instruction(value = 0x78, name = "ishl")
    @Instruction(value = 0x7c, name = "iushr")
    @Instruction(value = 0x80, name = "ior")
    @Instruction(value = 0xac, name = "ireturn")
    @Test
    public void test_50() {
        expectedConsecutiveLines = List.of(
                "  public static int rotateLeft(int, int);",
                "    descriptor: (II)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=3, locals=2, args_size=2",
                "         0: iload_0",
                "         1: iload_1",
                "         2: ishl",
                "         3: iload_0",
                "         4: iload_1",
                "         5: ineg",
                "         6: iushr",
                "         7: ior",
                "         8: ireturn",
                "      LineNumberTable:",
                "        line 1724: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       9     0     i   I",
                "            0       9     1 distance   I"
        );
    }

    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0x74, name = "ineg")
    @Instruction(value = 0x78, name = "ishl")
    @Instruction(value = 0x7c, name = "iushr")
    @Instruction(value = 0x80, name = "ior")
    @Instruction(value = 0xac, name = "ireturn")
    @Test
    public void test_51() {
        expectedConsecutiveLines = List.of(
                "  public static int rotateRight(int, int);",
                "    descriptor: (II)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=3, locals=2, args_size=2",
                "         0: iload_0",
                "         1: iload_1",
                "         2: iushr",
                "         3: iload_0",
                "         4: iload_1",
                "         5: ineg",
                "         6: ishl",
                "         7: ior",
                "         8: ireturn",
                "      LineNumberTable:",
                "        line 1748: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       9     0     i   I",
                "            0       9     1 distance   I"
        );
    }

    @Instruction(value = 0xffffffff, name = "ldc_w")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x05, name = "iconst_2")
    @Instruction(value = 0x07, name = "iconst_4")
    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0x3b, name = "istore_0")
    @Instruction(value = 0x78, name = "ishl")
    @Instruction(value = 0x7c, name = "iushr")
    @Instruction(value = 0x7e, name = "iand")
    @Instruction(value = 0x80, name = "ior")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_52() {
        expectedConsecutiveLines = List.of(
                "  public static int reverse(int);",
                "    descriptor: (I)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=3, locals=1, args_size=1",
                "         0: iload_0",
                "         1: ldc_w         #265                // int 1431655765",
                "         4: iand",
                "         5: iconst_1",
                "         6: ishl",
                "         7: iload_0",
                "         8: iconst_1",
                "         9: iushr",
                "        10: ldc_w         #265                // int 1431655765",
                "        13: iand",
                "        14: ior",
                "        15: istore_0",
                "        16: iload_0",
                "        17: ldc_w         #266                // int 858993459",
                "        20: iand",
                "        21: iconst_2",
                "        22: ishl",
                "        23: iload_0",
                "        24: iconst_2",
                "        25: iushr",
                "        26: ldc_w         #266                // int 858993459",
                "        29: iand",
                "        30: ior",
                "        31: istore_0",
                "        32: iload_0",
                "        33: ldc_w         #267                // int 252645135",
                "        36: iand",
                "        37: iconst_4",
                "        38: ishl",
                "        39: iload_0",
                "        40: iconst_4",
                "        41: iushr",
                "        42: ldc_w         #267                // int 252645135",
                "        45: iand",
                "        46: ior",
                "        47: istore_0",
                "        48: iload_0",
                "        49: invokestatic  #268                // Method reverseBytes:(I)I",
                "        52: ireturn",
                "      LineNumberTable:",
                "        line 1764: 0",
                "        line 1765: 16",
                "        line 1766: 32",
                "        line 1768: 48",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      53     0     i   I"
        );
    }

    @Instruction(value = 0x02, name = "iconst_m1")
    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x08, name = "iconst_5")
    @Instruction(value = 0x15, name = "iload")
    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0x1c, name = "iload_2")
    @Instruction(value = 0x1d, name = "iload_3")
    @Instruction(value = 0x36, name = "istore")
    @Instruction(value = 0x3b, name = "istore_0")
    @Instruction(value = 0x3c, name = "istore_1")
    @Instruction(value = 0x3d, name = "istore_2")
    @Instruction(value = 0x3e, name = "istore_3")
    @Instruction(value = 0x78, name = "ishl")
    @Instruction(value = 0x7c, name = "iushr")
    @Instruction(value = 0x7e, name = "iand")
    @Instruction(value = 0x80, name = "ior")
    @Instruction(value = 0x82, name = "ixor")
    @Instruction(value = 0x84, name = "iinc")
    @Instruction(value = 0xa2, name = "if_icmpge")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_53() {
        expectedConsecutiveLines = List.of(
                "  public static int compress(int, int);",
                "    descriptor: (II)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=7, args_size=2",
                "         0: iload_0",
                "         1: iload_1",
                "         2: iand",
                "         3: istore_0",
                "         4: iload_1",
                "         5: iconst_m1",
                "         6: ixor",
                "         7: iconst_1",
                "         8: ishl",
                "         9: istore_2",
                "        10: iconst_0",
                "        11: istore_3",
                "        12: iload_3",
                "        13: iconst_5",
                "        14: if_icmpge     72",
                "        17: iload_2",
                "        18: invokestatic  #271                // Method parallelSuffix:(I)I",
                "        21: istore        4",
                "        23: iload         4",
                "        25: iload_1",
                "        26: iand",
                "        27: istore        5",
                "        29: iload_1",
                "        30: iload         5",
                "        32: ixor",
                "        33: iload         5",
                "        35: iconst_1",
                "        36: iload_3",
                "        37: ishl",
                "        38: iushr",
                "        39: ior",
                "        40: istore_1",
                "        41: iload_0",
                "        42: iload         5",
                "        44: iand",
                "        45: istore        6",
                "        47: iload_0",
                "        48: iload         6",
                "        50: ixor",
                "        51: iload         6",
                "        53: iconst_1",
                "        54: iload_3",
                "        55: ishl",
                "        56: iushr",
                "        57: ior",
                "        58: istore_0",
                "        59: iload_2",
                "        60: iload         4",
                "        62: iconst_m1",
                "        63: ixor",
                "        64: iand",
                "        65: istore_2",
                "        66: iinc          3, 1",
                "        69: goto          12",
                "        72: iload_0",
                "        73: ireturn",
                "      LineNumberTable:",
                "        line 1844: 0",
                "        line 1845: 4",
                "        line 1847: 10",
                "        line 1850: 17",
                "        line 1852: 23",
                "        line 1854: 29",
                "        line 1856: 41",
                "        line 1858: 47",
                "        line 1860: 59",
                "        line 1847: 66",
                "        line 1862: 72",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "           23      43     4 maskPrefix   I",
                "           29      37     5 maskMove   I",
                "           47      19     6     t   I",
                "           12      60     3     j   I",
                "            0      74     0     i   I",
                "            0      74     1  mask   I",
                "           10      64     2 maskCount   I"
        );
    }

    @Instruction(value = 0x02, name = "iconst_m1")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x05, name = "iconst_2")
    @Instruction(value = 0x07, name = "iconst_4")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x15, name = "iload")
    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0x1c, name = "iload_2")
    @Instruction(value = 0x1d, name = "iload_3")
    @Instruction(value = 0x36, name = "istore")
    @Instruction(value = 0x3b, name = "istore_0")
    @Instruction(value = 0x3c, name = "istore_1")
    @Instruction(value = 0x3d, name = "istore_2")
    @Instruction(value = 0x3e, name = "istore_3")
    @Instruction(value = 0x78, name = "ishl")
    @Instruction(value = 0x7c, name = "iushr")
    @Instruction(value = 0x7e, name = "iand")
    @Instruction(value = 0x80, name = "ior")
    @Instruction(value = 0x82, name = "ixor")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_54() {
        expectedConsecutiveLines = List.of(
                "  public static int expand(int, int);",
                "    descriptor: (II)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=3, locals=11, args_size=2",
                "         0: iload_1",
                "         1: istore_2",
                "         2: iload_1",
                "         3: iconst_m1",
                "         4: ixor",
                "         5: iconst_1",
                "         6: ishl",
                "         7: istore_3",
                "         8: iload_3",
                "         9: invokestatic  #271                // Method parallelSuffix:(I)I",
                "        12: istore        4",
                "        14: iload         4",
                "        16: iload_1",
                "        17: iand",
                "        18: istore        5",
                "        20: iload_1",
                "        21: iload         5",
                "        23: ixor",
                "        24: iload         5",
                "        26: iconst_1",
                "        27: iushr",
                "        28: ior",
                "        29: istore_1",
                "        30: iload_3",
                "        31: iload         4",
                "        33: iconst_m1",
                "        34: ixor",
                "        35: iand",
                "        36: istore_3",
                "        37: iload_3",
                "        38: invokestatic  #271                // Method parallelSuffix:(I)I",
                "        41: istore        4",
                "        43: iload         4",
                "        45: iload_1",
                "        46: iand",
                "        47: istore        6",
                "        49: iload_1",
                "        50: iload         6",
                "        52: ixor",
                "        53: iload         6",
                "        55: iconst_2",
                "        56: iushr",
                "        57: ior",
                "        58: istore_1",
                "        59: iload_3",
                "        60: iload         4",
                "        62: iconst_m1",
                "        63: ixor",
                "        64: iand",
                "        65: istore_3",
                "        66: iload_3",
                "        67: invokestatic  #271                // Method parallelSuffix:(I)I",
                "        70: istore        4",
                "        72: iload         4",
                "        74: iload_1",
                "        75: iand",
                "        76: istore        7",
                "        78: iload_1",
                "        79: iload         7",
                "        81: ixor",
                "        82: iload         7",
                "        84: iconst_4",
                "        85: iushr",
                "        86: ior",
                "        87: istore_1",
                "        88: iload_3",
                "        89: iload         4",
                "        91: iconst_m1",
                "        92: ixor",
                "        93: iand",
                "        94: istore_3",
                "        95: iload_3",
                "        96: invokestatic  #271                // Method parallelSuffix:(I)I",
                "        99: istore        4",
                "       101: iload         4",
                "       103: iload_1",
                "       104: iand",
                "       105: istore        8",
                "       107: iload_1",
                "       108: iload         8",
                "       110: ixor",
                "       111: iload         8",
                "       113: bipush        8",
                "       115: iushr",
                "       116: ior",
                "       117: istore_1",
                "       118: iload_3",
                "       119: iload         4",
                "       121: iconst_m1",
                "       122: ixor",
                "       123: iand",
                "       124: istore_3",
                "       125: iload_3",
                "       126: invokestatic  #271                // Method parallelSuffix:(I)I",
                "       129: istore        4",
                "       131: iload         4",
                "       133: iload_1",
                "       134: iand",
                "       135: istore        9",
                "       137: iload_0",
                "       138: bipush        16",
                "       140: ishl",
                "       141: istore        10",
                "       143: iload_0",
                "       144: iload         9",
                "       146: iconst_m1",
                "       147: ixor",
                "       148: iand",
                "       149: iload         10",
                "       151: iload         9",
                "       153: iand",
                "       154: ior",
                "       155: istore_0",
                "       156: iload_0",
                "       157: bipush        8",
                "       159: ishl",
                "       160: istore        10",
                "       162: iload_0",
                "       163: iload         8",
                "       165: iconst_m1",
                "       166: ixor",
                "       167: iand",
                "       168: iload         10",
                "       170: iload         8",
                "       172: iand",
                "       173: ior",
                "       174: istore_0",
                "       175: iload_0",
                "       176: iconst_4",
                "       177: ishl",
                "       178: istore        10",
                "       180: iload_0",
                "       181: iload         7",
                "       183: iconst_m1",
                "       184: ixor",
                "       185: iand",
                "       186: iload         10",
                "       188: iload         7",
                "       190: iand",
                "       191: ior",
                "       192: istore_0",
                "       193: iload_0",
                "       194: iconst_2",
                "       195: ishl",
                "       196: istore        10",
                "       198: iload_0",
                "       199: iload         6",
                "       201: iconst_m1",
                "       202: ixor",
                "       203: iand",
                "       204: iload         10",
                "       206: iload         6",
                "       208: iand",
                "       209: ior",
                "       210: istore_0",
                "       211: iload_0",
                "       212: iconst_1",
                "       213: ishl",
                "       214: istore        10",
                "       216: iload_0",
                "       217: iload         5",
                "       219: iconst_m1",
                "       220: ixor",
                "       221: iand",
                "       222: iload         10",
                "       224: iload         5",
                "       226: iand",
                "       227: ior",
                "       228: istore_0",
                "       229: iload_0",
                "       230: iload_2",
                "       231: iand",
                "       232: ireturn",
                "      LineNumberTable:",
                "        line 1931: 0",
                "        line 1933: 2",
                "        line 1934: 8",
                "        line 1936: 14",
                "        line 1938: 20",
                "        line 1939: 30",
                "        line 1941: 37",
                "        line 1943: 43",
                "        line 1945: 49",
                "        line 1946: 59",
                "        line 1948: 66",
                "        line 1950: 72",
                "        line 1952: 78",
                "        line 1953: 88",
                "        line 1955: 95",
                "        line 1957: 101",
                "        line 1959: 107",
                "        line 1960: 118",
                "        line 1962: 125",
                "        line 1964: 131",
                "        line 1966: 137",
                "        line 1967: 143",
                "        line 1968: 156",
                "        line 1969: 162",
                "        line 1970: 175",
                "        line 1971: 180",
                "        line 1972: 193",
                "        line 1973: 198",
                "        line 1974: 211",
                "        line 1975: 216",
                "        line 1978: 229",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0     233     0     i   I",
                "            0     233     1  mask   I",
                "            2     231     2 originalMask   I",
                "            8     225     3 maskCount   I",
                "           14     219     4 maskPrefix   I",
                "           20     213     5 maskMove1   I",
                "           49     184     6 maskMove2   I",
                "           78     155     7 maskMove3   I",
                "          107     126     8 maskMove4   I",
                "          137      96     9 maskMove5   I",
                "          143      90    10     t   I"
        );
    }

    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x05, name = "iconst_2")
    @Instruction(value = 0x07, name = "iconst_4")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0x3c, name = "istore_1")
    @Instruction(value = 0x78, name = "ishl")
    @Instruction(value = 0x82, name = "ixor")
    @Instruction(value = 0xac, name = "ireturn")
    @Test
    public void test_55() {
        expectedConsecutiveLines = List.of(
                "  private static int parallelSuffix(int);",
                "    descriptor: (I)I",
                "    flags: (0x000a) ACC_PRIVATE, ACC_STATIC",
                "    Code:",
                "      stack=3, locals=2, args_size=1",
                "         0: iload_0",
                "         1: iload_0",
                "         2: iconst_1",
                "         3: ishl",
                "         4: ixor",
                "         5: istore_1",
                "         6: iload_1",
                "         7: iload_1",
                "         8: iconst_2",
                "         9: ishl",
                "        10: ixor",
                "        11: istore_1",
                "        12: iload_1",
                "        13: iload_1",
                "        14: iconst_4",
                "        15: ishl",
                "        16: ixor",
                "        17: istore_1",
                "        18: iload_1",
                "        19: iload_1",
                "        20: bipush        8",
                "        22: ishl",
                "        23: ixor",
                "        24: istore_1",
                "        25: iload_1",
                "        26: iload_1",
                "        27: bipush        16",
                "        29: ishl",
                "        30: ixor",
                "        31: istore_1",
                "        32: iload_1",
                "        33: ireturn",
                "      LineNumberTable:",
                "        line 1983: 0",
                "        line 1984: 6",
                "        line 1985: 12",
                "        line 1986: 18",
                "        line 1987: 25",
                "        line 1988: 32",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      34     0 maskCount   I",
                "            6      28     1 maskPrefix   I"
        );
    }

    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0x74, name = "ineg")
    @Instruction(value = 0x7a, name = "ishr")
    @Instruction(value = 0x7c, name = "iushr")
    @Instruction(value = 0x80, name = "ior")
    @Instruction(value = 0xac, name = "ireturn")
    @Test
    public void test_56() {
        expectedConsecutiveLines = List.of(
                "  public static int signum(int);",
                "    descriptor: (I)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=3, locals=1, args_size=1",
                "         0: iload_0",
                "         1: bipush        31",
                "         3: ishr",
                "         4: iload_0",
                "         5: ineg",
                "         6: bipush        31",
                "         8: iushr",
                "         9: ior",
                "        10: ireturn",
                "      LineNumberTable:",
                "        line 2002: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      11     0     i   I"
        );
    }

    @Instruction(value = 0xffffffff, name = "ldc_w")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0x78, name = "ishl")
    @Instruction(value = 0x7c, name = "iushr")
    @Instruction(value = 0x7e, name = "iand")
    @Instruction(value = 0x80, name = "ior")
    @Instruction(value = 0xac, name = "ireturn")
    @Test
    public void test_57() {
        expectedConsecutiveLines = List.of(
                "  public static int reverseBytes(int);",
                "    descriptor: (I)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=3, locals=1, args_size=1",
                "         0: iload_0",
                "         1: bipush        24",
                "         3: ishl",
                "         4: iload_0",
                "         5: ldc_w         #274                // int 65280",
                "         8: iand",
                "         9: bipush        8",
                "        11: ishl",
                "        12: ior",
                "        13: iload_0",
                "        14: bipush        8",
                "        16: iushr",
                "        17: ldc_w         #274                // int 65280",
                "        20: iand",
                "        21: ior",
                "        22: iload_0",
                "        23: bipush        24",
                "        25: iushr",
                "        26: ior",
                "        27: ireturn",
                "      LineNumberTable:",
                "        line 2016: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      28     0     i   I"
        );
    }

    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0x60, name = "iadd")
    @Instruction(value = 0xac, name = "ireturn")
    @Test
    public void test_58() {
        expectedConsecutiveLines = List.of(
                "  public static int sum(int, int);",
                "    descriptor: (II)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: iload_0",
                "         1: iload_1",
                "         2: iadd",
                "         3: ireturn",
                "      LineNumberTable:",
                "        line 2032: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       4     0     a   I",
                "            0       4     1     b   I"
        );
    }

    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_59() {
        expectedConsecutiveLines = List.of(
                "  public static int max(int, int);",
                "    descriptor: (II)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: iload_0",
                "         1: iload_1",
                "         2: invokestatic  #55                 // Method java/lang/Math.max:(II)I",
                "         5: ireturn",
                "      LineNumberTable:",
                "        line 2046: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0     a   I",
                "            0       6     1     b   I"
        );
    }

    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_60() {
        expectedConsecutiveLines = List.of(
                "  public static int min(int, int);",
                "    descriptor: (II)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: iload_0",
                "         1: iload_1",
                "         2: invokestatic  #275                // Method java/lang/Math.min:(II)I",
                "         5: ireturn",
                "      LineNumberTable:",
                "        line 2060: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0     a   I",
                "            0       6     1     b   I"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_61() {
        expectedConsecutiveLines = List.of(
                "  public java.util.Optional<java.lang.Integer> describeConstable();",
                "    descriptor: ()Ljava/util/Optional;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: invokestatic  #278                // Method java/util/Optional.of:(Ljava/lang/Object;)Ljava/util/Optional;",
                "         4: areturn",
                "      LineNumberTable:",
                "        line 2072: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       5     0  this   Ljava/lang/Integer;",
                "    Signature: #432                         // ()Ljava/util/Optional<Ljava/lang/Integer;>;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xb0, name = "areturn")
    @Test
    public void test_62() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Integer resolveConstantDesc(java.lang.invoke.MethodHandles$Lookup);",
                "    descriptor: (Ljava/lang/invoke/MethodHandles$Lookup;)Ljava/lang/Integer;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=2, args_size=2",
                "         0: aload_0",
                "         1: areturn",
                "      LineNumberTable:",
                "        line 2085: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       2     0  this   Ljava/lang/Integer;",
                "            0       2     1 lookup   Ljava/lang/invoke/MethodHandles$Lookup;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xc0, name = "checkcast")
    @Test
    public void test_63() {
        expectedConsecutiveLines = List.of(
                "  public int compareTo(java.lang.Object);",
                "    descriptor: (Ljava/lang/Object;)I",
                "    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_0",
                "         1: aload_1",
                "         2: checkcast     #1                  // class java/lang/Integer",
                "         5: invokevirtual #284                // Method compareTo:(Ljava/lang/Integer;)I",
                "         8: ireturn",
                "      LineNumberTable:",
                "        line 72: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       9     0  this   Ljava/lang/Integer;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Test
    public void test_64() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Object resolveConstantDesc(java.lang.invoke.MethodHandles$Lookup) throws java.lang.ReflectiveOperationException;",
                "    descriptor: (Ljava/lang/invoke/MethodHandles$Lookup;)Ljava/lang/Object;",
                "    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_0",
                "         1: aload_1",
                "         2: invokevirtual #288                // Method resolveConstantDesc:(Ljava/lang/invoke/MethodHandles$Lookup;)Ljava/lang/Integer;",
                "         5: areturn",
                "      LineNumberTable:",
                "        line 72: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0  this   Ljava/lang/Integer;",
                "    Exceptions:",
                "      throws java.lang.ReflectiveOperationException"
        );
    }
}
