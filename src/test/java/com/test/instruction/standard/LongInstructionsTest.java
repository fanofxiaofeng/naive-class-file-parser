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
public class LongInstructionsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Long"));
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x05, name = "iconst_2")
    @Instruction(value = 0x09, name = "lconst_0")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x15, name = "iload")
    @Instruction(value = 0x1c, name = "iload_2")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x34, name = "caload")
    @Instruction(value = 0x36, name = "istore")
    @Instruction(value = 0x3d, name = "istore_2")
    @Instruction(value = 0x3f, name = "lstore_0")
    @Instruction(value = 0x4e, name = "astore_3")
    @Instruction(value = 0x54, name = "bastore")
    @Instruction(value = 0x64, name = "isub")
    @Instruction(value = 0x6d, name = "ldiv")
    @Instruction(value = 0x71, name = "lrem")
    @Instruction(value = 0x74, name = "ineg")
    @Instruction(value = 0x75, name = "lneg")
    @Instruction(value = 0x84, name = "iinc")
    @Instruction(value = 0x85, name = "i2l")
    @Instruction(value = 0x88, name = "l2i")
    @Instruction(value = 0x91, name = "i2b")
    @Instruction(value = 0x94, name = "lcmp")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0x9a, name = "ifne")
    @Instruction(value = 0x9c, name = "ifge")
    @Instruction(value = 0x9d, name = "ifgt")
    @Instruction(value = 0xa0, name = "if_icmpne")
    @Instruction(value = 0xa1, name = "if_icmplt")
    @Instruction(value = 0xa4, name = "if_icmple")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb2, name = "getstatic")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xbc, name = "newarray")
    @Test
    public void test_1() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.String toString(long, int);",
                "    descriptor: (JI)Ljava/lang/String;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=7, locals=6, args_size=2",
                "         0: iload_2",
                "         1: iconst_2",
                "         2: if_icmplt     11",
                "         5: iload_2",
                "         6: bipush        36",
                "         8: if_icmple     14",
                "        11: bipush        10",
                "        13: istore_2",
                "        14: iload_2",
                "        15: bipush        10",
                "        17: if_icmpne     25",
                "        20: lload_0",
                "        21: invokestatic  #9                  // Method toString:(J)Ljava/lang/String;",
                "        24: areturn",
                "        25: getstatic     #13                 // Field java/lang/String.COMPACT_STRINGS:Z",
                "        28: ifeq          133",
                "        31: bipush        65",
                "        33: newarray       byte",
                "        35: astore_3",
                "        36: bipush        64",
                "        38: istore        4",
                "        40: lload_0",
                "        41: lconst_0",
                "        42: lcmp",
                "        43: ifge          50",
                "        46: iconst_1",
                "        47: goto          51",
                "        50: iconst_0",
                "        51: istore        5",
                "        53: iload         5",
                "        55: ifne          61",
                "        58: lload_0",
                "        59: lneg",
                "        60: lstore_0",
                "        61: lload_0",
                "        62: iload_2",
                "        63: ineg",
                "        64: i2l",
                "        65: lcmp",
                "        66: ifgt          95",
                "        69: aload_3",
                "        70: iload         4",
                "        72: iinc          4, -1",
                "        75: getstatic     #17                 // Field java/lang/Integer.digits:[C",
                "        78: lload_0",
                "        79: iload_2",
                "        80: i2l",
                "        81: lrem",
                "        82: lneg",
                "        83: l2i",
                "        84: caload",
                "        85: i2b",
                "        86: bastore",
                "        87: lload_0",
                "        88: iload_2",
                "        89: i2l",
                "        90: ldiv",
                "        91: lstore_0",
                "        92: goto          61",
                "        95: aload_3",
                "        96: iload         4",
                "        98: getstatic     #17                 // Field java/lang/Integer.digits:[C",
                "       101: lload_0",
                "       102: lneg",
                "       103: l2i",
                "       104: caload",
                "       105: i2b",
                "       106: bastore",
                "       107: iload         5",
                "       109: ifeq          121",
                "       112: aload_3",
                "       113: iinc          4, -1",
                "       116: iload         4",
                "       118: bipush        45",
                "       120: bastore",
                "       121: aload_3",
                "       122: iload         4",
                "       124: bipush        65",
                "       126: iload         4",
                "       128: isub",
                "       129: invokestatic  #23                 // Method java/lang/StringLatin1.newString:([BII)Ljava/lang/String;",
                "       132: areturn",
                "       133: lload_0",
                "       134: iload_2",
                "       135: invokestatic  #29                 // Method toStringUTF16:(JI)Ljava/lang/String;",
                "       138: areturn",
                "      LineNumberTable:",
                "        line 141: 0",
                "        line 142: 11",
                "        line 143: 14",
                "        line 144: 20",
                "        line 146: 25",
                "        line 147: 31",
                "        line 148: 36",
                "        line 149: 40",
                "        line 151: 53",
                "        line 152: 58",
                "        line 155: 61",
                "        line 156: 69",
                "        line 157: 87",
                "        line 159: 95",
                "        line 161: 107",
                "        line 162: 112",
                "        line 164: 121",
                "        line 166: 133",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "           36      97     3   buf   [B",
                "           40      93     4 charPos   I",
                "           53      80     5 negative   Z",
                "            0     139     0     i   J",
                "            0     139     2 radix   I",
                "      StackMapTable: number_of_entries = 9",
                "        frame_type = 11 /* same */",
                "        frame_type = 2 /* same */",
                "        frame_type = 10 /* same */",
                "        frame_type = 253 /* append */",
                "          offset_delta = 24",
                "          locals = [ class \"[B\", int ]",
                "        frame_type = 64 /* same_locals_1_stack_item */",
                "          stack = [ int ]",
                "        frame_type = 252 /* append */",
                "          offset_delta = 9",
                "          locals = [ int ]",
                "        frame_type = 33 /* same */",
                "        frame_type = 25 /* same */",
                "        frame_type = 248 /* chop */",
                "          offset_delta = 11"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x09, name = "lconst_0")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x11, name = "sipush")
    @Instruction(value = 0x15, name = "iload")
    @Instruction(value = 0x1c, name = "iload_2")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x34, name = "caload")
    @Instruction(value = 0x36, name = "istore")
    @Instruction(value = 0x3f, name = "lstore_0")
    @Instruction(value = 0x4e, name = "astore_3")
    @Instruction(value = 0x64, name = "isub")
    @Instruction(value = 0x6d, name = "ldiv")
    @Instruction(value = 0x71, name = "lrem")
    @Instruction(value = 0x74, name = "ineg")
    @Instruction(value = 0x75, name = "lneg")
    @Instruction(value = 0x84, name = "iinc")
    @Instruction(value = 0x85, name = "i2l")
    @Instruction(value = 0x88, name = "l2i")
    @Instruction(value = 0x94, name = "lcmp")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0x9a, name = "ifne")
    @Instruction(value = 0x9c, name = "ifge")
    @Instruction(value = 0x9d, name = "ifgt")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb2, name = "getstatic")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xbc, name = "newarray")
    @Test
    public void test_2() {
        expectedConsecutiveLines = List.of(
                "  private static java.lang.String toStringUTF16(long, int);",
                "    descriptor: (JI)Ljava/lang/String;",
                "    flags: (0x000a) ACC_PRIVATE, ACC_STATIC",
                "    Code:",
                "      stack=7, locals=6, args_size=2",
                "         0: sipush        130",
                "         3: newarray       byte",
                "         5: astore_3",
                "         6: bipush        64",
                "         8: istore        4",
                "        10: lload_0",
                "        11: lconst_0",
                "        12: lcmp",
                "        13: ifge          20",
                "        16: iconst_1",
                "        17: goto          21",
                "        20: iconst_0",
                "        21: istore        5",
                "        23: iload         5",
                "        25: ifne          31",
                "        28: lload_0",
                "        29: lneg",
                "        30: lstore_0",
                "        31: lload_0",
                "        32: iload_2",
                "        33: ineg",
                "        34: i2l",
                "        35: lcmp",
                "        36: ifgt          66",
                "        39: aload_3",
                "        40: iload         4",
                "        42: iinc          4, -1",
                "        45: getstatic     #17                 // Field java/lang/Integer.digits:[C",
                "        48: lload_0",
                "        49: iload_2",
                "        50: i2l",
                "        51: lrem",
                "        52: lneg",
                "        53: l2i",
                "        54: caload",
                "        55: invokestatic  #33                 // Method java/lang/StringUTF16.putChar:([BII)V",
                "        58: lload_0",
                "        59: iload_2",
                "        60: i2l",
                "        61: ldiv",
                "        62: lstore_0",
                "        63: goto          31",
                "        66: aload_3",
                "        67: iload         4",
                "        69: getstatic     #17                 // Field java/lang/Integer.digits:[C",
                "        72: lload_0",
                "        73: lneg",
                "        74: l2i",
                "        75: caload",
                "        76: invokestatic  #33                 // Method java/lang/StringUTF16.putChar:([BII)V",
                "        79: iload         5",
                "        81: ifeq          95",
                "        84: aload_3",
                "        85: iinc          4, -1",
                "        88: iload         4",
                "        90: bipush        45",
                "        92: invokestatic  #33                 // Method java/lang/StringUTF16.putChar:([BII)V",
                "        95: aload_3",
                "        96: iload         4",
                "        98: bipush        65",
                "       100: iload         4",
                "       102: isub",
                "       103: invokestatic  #39                 // Method java/lang/StringUTF16.newString:([BII)Ljava/lang/String;",
                "       106: areturn",
                "      LineNumberTable:",
                "        line 170: 0",
                "        line 171: 6",
                "        line 172: 10",
                "        line 173: 23",
                "        line 174: 28",
                "        line 176: 31",
                "        line 177: 39",
                "        line 178: 58",
                "        line 180: 66",
                "        line 181: 79",
                "        line 182: 84",
                "        line 184: 95",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0     107     0     i   J",
                "            0     107     2 radix   I",
                "            6     101     3   buf   [B",
                "           10      97     4 charPos   I",
                "           23      84     5 negative   Z",
                "      StackMapTable: number_of_entries = 5",
                "        frame_type = 253 /* append */",
                "          offset_delta = 20",
                "          locals = [ class \"[B\", int ]",
                "        frame_type = 64 /* same_locals_1_stack_item */",
                "          stack = [ int ]",
                "        frame_type = 252 /* append */",
                "          offset_delta = 9",
                "          locals = [ int ]",
                "        frame_type = 34 /* same */",
                "        frame_type = 28 /* same */"
        );
    }

    @Instruction(value = 0xffffffff, name = "ldc2_w")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x05, name = "iconst_2")
    @Instruction(value = 0x08, name = "iconst_5")
    @Instruction(value = 0x09, name = "lconst_0")
    @Instruction(value = 0x16, name = "lload")
    @Instruction(value = 0x1c, name = "iload_2")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x21, name = "lload_3")
    @Instruction(value = 0x37, name = "lstore")
    @Instruction(value = 0x42, name = "lstore_3")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0x65, name = "lsub")
    @Instruction(value = 0x69, name = "lmul")
    @Instruction(value = 0x6d, name = "ldiv")
    @Instruction(value = 0x7d, name = "lushr")
    @Instruction(value = 0x94, name = "lcmp")
    @Instruction(value = 0x9b, name = "iflt")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xab, name = "lookupswitch")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xbb, name = "new")
    @Test
    public void test_3() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.String toUnsignedString(long, int);",
                "    descriptor: (JI)Ljava/lang/String;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=6, locals=7, args_size=2",
                "         0: lload_0",
                "         1: lconst_0",
                "         2: lcmp",
                "         3: iflt          12",
                "         6: lload_0",
                "         7: iload_2",
                "         8: invokestatic  #40                 // Method toString:(JI)Ljava/lang/String;",
                "        11: areturn",
                "        12: iload_2",
                "        13: lookupswitch  { // 6",
                "                       2: 72",
                "                       4: 79",
                "                       8: 87",
                "                      10: 94",
                "                      16: 136",
                "                      32: 143",
                "                 default: 151",
                "            }",
                "        72: lload_0",
                "        73: invokestatic  #42                 // Method toBinaryString:(J)Ljava/lang/String;",
                "        76: goto          159",
                "        79: lload_0",
                "        80: iconst_2",
                "        81: invokestatic  #45                 // Method toUnsignedString0:(JI)Ljava/lang/String;",
                "        84: goto          159",
                "        87: lload_0",
                "        88: invokestatic  #48                 // Method toOctalString:(J)Ljava/lang/String;",
                "        91: goto          159",
                "        94: lload_0",
                "        95: iconst_1",
                "        96: lushr",
                "        97: ldc2_w        #51                 // long 5l",
                "       100: ldiv",
                "       101: lstore_3",
                "       102: lload_0",
                "       103: lload_3",
                "       104: ldc2_w        #53                 // long 10l",
                "       107: lmul",
                "       108: lsub",
                "       109: lstore        5",
                "       111: new           #55                 // class java/lang/StringBuilder",
                "       114: dup",
                "       115: invokespecial #57                 // Method java/lang/StringBuilder.\"<init>\":()V",
                "       118: lload_3",
                "       119: invokestatic  #9                  // Method toString:(J)Ljava/lang/String;",
                "       122: invokevirtual #61                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "       125: lload         5",
                "       127: invokevirtual #65                 // Method java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;",
                "       130: invokevirtual #68                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;",
                "       133: goto          159",
                "       136: lload_0",
                "       137: invokestatic  #71                 // Method toHexString:(J)Ljava/lang/String;",
                "       140: goto          159",
                "       143: lload_0",
                "       144: iconst_5",
                "       145: invokestatic  #45                 // Method toUnsignedString0:(JI)Ljava/lang/String;",
                "       148: goto          159",
                "       151: lload_0",
                "       152: invokestatic  #74                 // Method toUnsignedBigInteger:(J)Ljava/math/BigInteger;",
                "       155: iload_2",
                "       156: invokevirtual #78                 // Method java/math/BigInteger.toString:(I)Ljava/lang/String;",
                "       159: areturn",
                "      LineNumberTable:",
                "        line 214: 0",
                "        line 215: 6",
                "        line 217: 12",
                "        line 218: 72",
                "        line 219: 79",
                "        line 220: 87",
                "        line 230: 94",
                "        line 231: 102",
                "        line 232: 111",
                "        line 234: 136",
                "        line 235: 143",
                "        line 236: 151",
                "        line 217: 159",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "          102      34     3  quot   J",
                "          111      25     5   rem   J",
                "            0     160     0     i   J",
                "            0     160     2 radix   I",
                "      StackMapTable: number_of_entries = 9",
                "        frame_type = 12 /* same */",
                "        frame_type = 59 /* same */",
                "        frame_type = 6 /* same */",
                "        frame_type = 7 /* same */",
                "        frame_type = 6 /* same */",
                "        frame_type = 41 /* same */",
                "        frame_type = 6 /* same */",
                "        frame_type = 7 /* same */",
                "        frame_type = 71 /* same_locals_1_stack_item */",
                "          stack = [ class java/lang/String ]"
        );
    }

    @Instruction(value = 0x09, name = "lconst_0")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x1c, name = "iload_2")
    @Instruction(value = 0x1d, name = "iload_3")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x3d, name = "istore_2")
    @Instruction(value = 0x3e, name = "istore_3")
    @Instruction(value = 0x7d, name = "lushr")
    @Instruction(value = 0x88, name = "l2i")
    @Instruction(value = 0x94, name = "lcmp")
    @Instruction(value = 0x9b, name = "iflt")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_4() {
        expectedConsecutiveLines = List.of(
                "  private static java.math.BigInteger toUnsignedBigInteger(long);",
                "    descriptor: (J)Ljava/math/BigInteger;",
                "    flags: (0x000a) ACC_PRIVATE, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=4, args_size=1",
                "         0: lload_0",
                "         1: lconst_0",
                "         2: lcmp",
                "         3: iflt          11",
                "         6: lload_0",
                "         7: invokestatic  #83                 // Method java/math/BigInteger.valueOf:(J)Ljava/math/BigInteger;",
                "        10: areturn",
                "        11: lload_0",
                "        12: bipush        32",
                "        14: lushr",
                "        15: l2i",
                "        16: istore_2",
                "        17: lload_0",
                "        18: l2i",
                "        19: istore_3",
                "        20: iload_2",
                "        21: invokestatic  #86                 // Method java/lang/Integer.toUnsignedLong:(I)J",
                "        24: invokestatic  #83                 // Method java/math/BigInteger.valueOf:(J)Ljava/math/BigInteger;",
                "        27: bipush        32",
                "        29: invokevirtual #90                 // Method java/math/BigInteger.shiftLeft:(I)Ljava/math/BigInteger;",
                "        32: iload_3",
                "        33: invokestatic  #86                 // Method java/lang/Integer.toUnsignedLong:(I)J",
                "        36: invokestatic  #83                 // Method java/math/BigInteger.valueOf:(J)Ljava/math/BigInteger;",
                "        39: invokevirtual #94                 // Method java/math/BigInteger.add:(Ljava/math/BigInteger;)Ljava/math/BigInteger;",
                "        42: areturn",
                "      LineNumberTable:",
                "        line 246: 0",
                "        line 247: 6",
                "        line 249: 11",
                "        line 250: 17",
                "        line 253: 20",
                "        line 254: 33",
                "        line 253: 42",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "           17      26     2 upper   I",
                "           20      23     3 lower   I",
                "            0      43     0     i   J",
                "      StackMapTable: number_of_entries = 1",
                "        frame_type = 11 /* same */"
        );
    }

    @Instruction(value = 0x07, name = "iconst_4")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_5() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.String toHexString(long);",
                "    descriptor: (J)Ljava/lang/String;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=3, locals=2, args_size=1",
                "         0: lload_0",
                "         1: iconst_4",
                "         2: invokestatic  #45                 // Method toUnsignedString0:(JI)Ljava/lang/String;",
                "         5: areturn",
                "      LineNumberTable:",
                "        line 310: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0     i   J"
        );
    }

    @Instruction(value = 0x06, name = "iconst_3")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_6() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.String toOctalString(long);",
                "    descriptor: (J)Ljava/lang/String;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=3, locals=2, args_size=1",
                "         0: lload_0",
                "         1: iconst_3",
                "         2: invokestatic  #45                 // Method toUnsignedString0:(JI)Ljava/lang/String;",
                "         5: areturn",
                "      LineNumberTable:",
                "        line 349: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0     i   J"
        );
    }

    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_7() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.String toBinaryString(long);",
                "    descriptor: (J)Ljava/lang/String;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=3, locals=2, args_size=1",
                "         0: lload_0",
                "         1: iconst_1",
                "         2: invokestatic  #45                 // Method toUnsignedString0:(JI)Ljava/lang/String;",
                "         5: areturn",
                "      LineNumberTable:",
                "        line 382: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0     i   J"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x05, name = "iconst_2")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x15, name = "iload")
    @Instruction(value = 0x19, name = "aload")
    @Instruction(value = 0x1c, name = "iload_2")
    @Instruction(value = 0x1d, name = "iload_3")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x36, name = "istore")
    @Instruction(value = 0x3a, name = "astore")
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
    public void test_8() {
        expectedConsecutiveLines = List.of(
                "  static java.lang.String toUnsignedString0(long, int);",
                "    descriptor: (JI)Ljava/lang/String;",
                "    flags: (0x0008) ACC_STATIC",
                "    Code:",
                "      stack=6, locals=6, args_size=2",
                "         0: bipush        64",
                "         2: lload_0",
                "         3: invokestatic  #98                 // Method numberOfLeadingZeros:(J)I",
                "         6: isub",
                "         7: istore_3",
                "         8: iload_3",
                "         9: iload_2",
                "        10: iconst_1",
                "        11: isub",
                "        12: iadd",
                "        13: iload_2",
                "        14: idiv",
                "        15: iconst_1",
                "        16: invokestatic  #102                // Method java/lang/Math.max:(II)I",
                "        19: istore        4",
                "        21: getstatic     #13                 // Field java/lang/String.COMPACT_STRINGS:Z",
                "        24: ifeq          54",
                "        27: iload         4",
                "        29: newarray       byte",
                "        31: astore        5",
                "        33: lload_0",
                "        34: iload_2",
                "        35: aload         5",
                "        37: iconst_0",
                "        38: iload         4",
                "        40: invokestatic  #108                // Method formatUnsignedLong0:(JI[BII)V",
                "        43: new           #5                  // class java/lang/String",
                "        46: dup",
                "        47: aload         5",
                "        49: iconst_0",
                "        50: invokespecial #112                // Method java/lang/String.\"<init>\":([BB)V",
                "        53: areturn",
                "        54: iload         4",
                "        56: iconst_2",
                "        57: imul",
                "        58: newarray       byte",
                "        60: astore        5",
                "        62: lload_0",
                "        63: iload_2",
                "        64: aload         5",
                "        66: iconst_0",
                "        67: iload         4",
                "        69: invokestatic  #115                // Method formatUnsignedLong0UTF16:(JI[BII)V",
                "        72: new           #5                  // class java/lang/String",
                "        75: dup",
                "        76: aload         5",
                "        78: iconst_1",
                "        79: invokespecial #112                // Method java/lang/String.\"<init>\":([BB)V",
                "        82: areturn",
                "      LineNumberTable:",
                "        line 392: 0",
                "        line 393: 8",
                "        line 394: 21",
                "        line 395: 27",
                "        line 396: 33",
                "        line 397: 43",
                "        line 399: 54",
                "        line 400: 62",
                "        line 401: 72",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "           33      21     5   buf   [B",
                "           62      21     5   buf   [B",
                "            0      83     0   val   J",
                "            0      83     2 shift   I",
                "            8      75     3   mag   I",
                "           21      62     4 chars   I",
                "      StackMapTable: number_of_entries = 1",
                "        frame_type = 253 /* append */",
                "          offset_delta = 54",
                "          locals = [ int, int ]"
        );
    }

    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x15, name = "iload")
    @Instruction(value = 0x1c, name = "iload_2")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x34, name = "caload")
    @Instruction(value = 0x36, name = "istore")
    @Instruction(value = 0x3f, name = "lstore_0")
    @Instruction(value = 0x54, name = "bastore")
    @Instruction(value = 0x60, name = "iadd")
    @Instruction(value = 0x64, name = "isub")
    @Instruction(value = 0x78, name = "ishl")
    @Instruction(value = 0x7d, name = "lushr")
    @Instruction(value = 0x7e, name = "iand")
    @Instruction(value = 0x84, name = "iinc")
    @Instruction(value = 0x88, name = "l2i")
    @Instruction(value = 0x91, name = "i2b")
    @Instruction(value = 0xa3, name = "if_icmpgt")
    @Instruction(value = 0xb1, name = "return")
    @Instruction(value = 0xb2, name = "getstatic")
    @Test
    public void test_9() {
        expectedConsecutiveLines = List.of(
                "  private static void formatUnsignedLong0(long, int, byte[], int, int);",
                "    descriptor: (JI[BII)V",
                "    flags: (0x000a) ACC_PRIVATE, ACC_STATIC",
                "    Code:",
                "      stack=5, locals=9, args_size=5",
                "         0: iload         4",
                "         2: iload         5",
                "         4: iadd",
                "         5: istore        6",
                "         7: iconst_1",
                "         8: iload_2",
                "         9: ishl",
                "        10: istore        7",
                "        12: iload         7",
                "        14: iconst_1",
                "        15: isub",
                "        16: istore        8",
                "        18: aload_3",
                "        19: iinc          6, -1",
                "        22: iload         6",
                "        24: getstatic     #17                 // Field java/lang/Integer.digits:[C",
                "        27: lload_0",
                "        28: l2i",
                "        29: iload         8",
                "        31: iand",
                "        32: caload",
                "        33: i2b",
                "        34: bastore",
                "        35: lload_0",
                "        36: iload_2",
                "        37: lushr",
                "        38: lstore_0",
                "        39: iload         6",
                "        41: iload         4",
                "        43: if_icmpgt     18",
                "        46: return",
                "      LineNumberTable:",
                "        line 417: 0",
                "        line 418: 7",
                "        line 419: 12",
                "        line 421: 18",
                "        line 422: 35",
                "        line 423: 39",
                "        line 424: 46",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      47     0   val   J",
                "            0      47     2 shift   I",
                "            0      47     3   buf   [B",
                "            0      47     4 offset   I",
                "            0      47     5   len   I",
                "            7      40     6 charPos   I",
                "           12      35     7 radix   I",
                "           18      29     8  mask   I",
                "      StackMapTable: number_of_entries = 1",
                "        frame_type = 254 /* append */",
                "          offset_delta = 18",
                "          locals = [ int, int, int ]"
        );
    }

    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x15, name = "iload")
    @Instruction(value = 0x1c, name = "iload_2")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x34, name = "caload")
    @Instruction(value = 0x36, name = "istore")
    @Instruction(value = 0x3f, name = "lstore_0")
    @Instruction(value = 0x60, name = "iadd")
    @Instruction(value = 0x64, name = "isub")
    @Instruction(value = 0x78, name = "ishl")
    @Instruction(value = 0x7d, name = "lushr")
    @Instruction(value = 0x7e, name = "iand")
    @Instruction(value = 0x84, name = "iinc")
    @Instruction(value = 0x88, name = "l2i")
    @Instruction(value = 0xa3, name = "if_icmpgt")
    @Instruction(value = 0xb1, name = "return")
    @Instruction(value = 0xb2, name = "getstatic")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_10() {
        expectedConsecutiveLines = List.of(
                "  private static void formatUnsignedLong0UTF16(long, int, byte[], int, int);",
                "    descriptor: (JI[BII)V",
                "    flags: (0x000a) ACC_PRIVATE, ACC_STATIC",
                "    Code:",
                "      stack=5, locals=9, args_size=5",
                "         0: iload         4",
                "         2: iload         5",
                "         4: iadd",
                "         5: istore        6",
                "         7: iconst_1",
                "         8: iload_2",
                "         9: ishl",
                "        10: istore        7",
                "        12: iload         7",
                "        14: iconst_1",
                "        15: isub",
                "        16: istore        8",
                "        18: aload_3",
                "        19: iinc          6, -1",
                "        22: iload         6",
                "        24: getstatic     #17                 // Field java/lang/Integer.digits:[C",
                "        27: lload_0",
                "        28: l2i",
                "        29: iload         8",
                "        31: iand",
                "        32: caload",
                "        33: invokestatic  #33                 // Method java/lang/StringUTF16.putChar:([BII)V",
                "        36: lload_0",
                "        37: iload_2",
                "        38: lushr",
                "        39: lstore_0",
                "        40: iload         6",
                "        42: iload         4",
                "        44: if_icmpgt     18",
                "        47: return",
                "      LineNumberTable:",
                "        line 438: 0",
                "        line 439: 7",
                "        line 440: 12",
                "        line 442: 18",
                "        line 443: 36",
                "        line 444: 40",
                "        line 445: 47",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      48     0   val   J",
                "            0      48     2 shift   I",
                "            0      48     3   buf   [B",
                "            0      48     4 offset   I",
                "            0      48     5   len   I",
                "            7      41     6 charPos   I",
                "           12      36     7 radix   I",
                "           18      30     8  mask   I",
                "      StackMapTable: number_of_entries = 1",
                "        frame_type = 254 /* append */",
                "          offset_delta = 18",
                "          locals = [ int, int, int ]"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x07, name = "iconst_4")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x19, name = "aload")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x20, name = "lload_2")
    @Instruction(value = 0x3a, name = "astore")
    @Instruction(value = 0x54, name = "bastore")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0x7d, name = "lushr")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb2, name = "getstatic")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbc, name = "newarray")
    @Test
    public void test_11() {
        expectedConsecutiveLines = List.of(
                "  static java.lang.String fastUUID(long, long);",
                "    descriptor: (JJ)Ljava/lang/String;",
                "    flags: (0x0008) ACC_STATIC",
                "    Code:",
                "      stack=6, locals=5, args_size=2",
                "         0: getstatic     #13                 // Field java/lang/String.COMPACT_STRINGS:Z",
                "         3: ifeq          111",
                "         6: bipush        36",
                "         8: newarray       byte",
                "        10: astore        4",
                "        12: lload_0",
                "        13: iconst_4",
                "        14: aload         4",
                "        16: bipush        24",
                "        18: bipush        12",
                "        20: invokestatic  #108                // Method formatUnsignedLong0:(JI[BII)V",
                "        23: lload_0",
                "        24: bipush        48",
                "        26: lushr",
                "        27: iconst_4",
                "        28: aload         4",
                "        30: bipush        19",
                "        32: iconst_4",
                "        33: invokestatic  #108                // Method formatUnsignedLong0:(JI[BII)V",
                "        36: lload_2",
                "        37: iconst_4",
                "        38: aload         4",
                "        40: bipush        14",
                "        42: iconst_4",
                "        43: invokestatic  #108                // Method formatUnsignedLong0:(JI[BII)V",
                "        46: lload_2",
                "        47: bipush        16",
                "        49: lushr",
                "        50: iconst_4",
                "        51: aload         4",
                "        53: bipush        9",
                "        55: iconst_4",
                "        56: invokestatic  #108                // Method formatUnsignedLong0:(JI[BII)V",
                "        59: lload_2",
                "        60: bipush        32",
                "        62: lushr",
                "        63: iconst_4",
                "        64: aload         4",
                "        66: iconst_0",
                "        67: bipush        8",
                "        69: invokestatic  #108                // Method formatUnsignedLong0:(JI[BII)V",
                "        72: aload         4",
                "        74: bipush        23",
                "        76: bipush        45",
                "        78: bastore",
                "        79: aload         4",
                "        81: bipush        18",
                "        83: bipush        45",
                "        85: bastore",
                "        86: aload         4",
                "        88: bipush        13",
                "        90: bipush        45",
                "        92: bastore",
                "        93: aload         4",
                "        95: bipush        8",
                "        97: bipush        45",
                "        99: bastore",
                "       100: new           #5                  // class java/lang/String",
                "       103: dup",
                "       104: aload         4",
                "       106: iconst_0",
                "       107: invokespecial #112                // Method java/lang/String.\"<init>\":([BB)V",
                "       110: areturn",
                "       111: bipush        72",
                "       113: newarray       byte",
                "       115: astore        4",
                "       117: lload_0",
                "       118: iconst_4",
                "       119: aload         4",
                "       121: bipush        24",
                "       123: bipush        12",
                "       125: invokestatic  #115                // Method formatUnsignedLong0UTF16:(JI[BII)V",
                "       128: lload_0",
                "       129: bipush        48",
                "       131: lushr",
                "       132: iconst_4",
                "       133: aload         4",
                "       135: bipush        19",
                "       137: iconst_4",
                "       138: invokestatic  #115                // Method formatUnsignedLong0UTF16:(JI[BII)V",
                "       141: lload_2",
                "       142: iconst_4",
                "       143: aload         4",
                "       145: bipush        14",
                "       147: iconst_4",
                "       148: invokestatic  #115                // Method formatUnsignedLong0UTF16:(JI[BII)V",
                "       151: lload_2",
                "       152: bipush        16",
                "       154: lushr",
                "       155: iconst_4",
                "       156: aload         4",
                "       158: bipush        9",
                "       160: iconst_4",
                "       161: invokestatic  #115                // Method formatUnsignedLong0UTF16:(JI[BII)V",
                "       164: lload_2",
                "       165: bipush        32",
                "       167: lushr",
                "       168: iconst_4",
                "       169: aload         4",
                "       171: iconst_0",
                "       172: bipush        8",
                "       174: invokestatic  #115                // Method formatUnsignedLong0UTF16:(JI[BII)V",
                "       177: aload         4",
                "       179: bipush        23",
                "       181: bipush        45",
                "       183: invokestatic  #33                 // Method java/lang/StringUTF16.putChar:([BII)V",
                "       186: aload         4",
                "       188: bipush        18",
                "       190: bipush        45",
                "       192: invokestatic  #33                 // Method java/lang/StringUTF16.putChar:([BII)V",
                "       195: aload         4",
                "       197: bipush        13",
                "       199: bipush        45",
                "       201: invokestatic  #33                 // Method java/lang/StringUTF16.putChar:([BII)V",
                "       204: aload         4",
                "       206: bipush        8",
                "       208: bipush        45",
                "       210: invokestatic  #33                 // Method java/lang/StringUTF16.putChar:([BII)V",
                "       213: new           #5                  // class java/lang/String",
                "       216: dup",
                "       217: aload         4",
                "       219: iconst_1",
                "       220: invokespecial #112                // Method java/lang/String.\"<init>\":([BB)V",
                "       223: areturn",
                "      LineNumberTable:",
                "        line 448: 0",
                "        line 449: 6",
                "        line 450: 12",
                "        line 451: 23",
                "        line 452: 36",
                "        line 453: 46",
                "        line 454: 59",
                "        line 456: 72",
                "        line 457: 79",
                "        line 458: 86",
                "        line 459: 93",
                "        line 461: 100",
                "        line 463: 111",
                "        line 465: 117",
                "        line 466: 128",
                "        line 467: 141",
                "        line 468: 151",
                "        line 469: 164",
                "        line 471: 177",
                "        line 472: 186",
                "        line 473: 195",
                "        line 474: 204",
                "        line 476: 213",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "           12      99     4   buf   [B",
                "          117     107     4   buf   [B",
                "            0     224     0   lsb   J",
                "            0     224     2   msb   J",
                "      StackMapTable: number_of_entries = 1",
                "        frame_type = 251 /* same_frame_extended */",
                "          offset_delta = 111"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x05, name = "iconst_2")
    @Instruction(value = 0x1c, name = "iload_2")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x3d, name = "istore_2")
    @Instruction(value = 0x4e, name = "astore_3")
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
    public void test_12() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.String toString(long);",
                "    descriptor: (J)Ljava/lang/String;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=4, args_size=1",
                "         0: lload_0",
                "         1: invokestatic  #118                // Method stringSize:(J)I",
                "         4: istore_2",
                "         5: getstatic     #13                 // Field java/lang/String.COMPACT_STRINGS:Z",
                "         8: ifeq          32",
                "        11: iload_2",
                "        12: newarray       byte",
                "        14: astore_3",
                "        15: lload_0",
                "        16: iload_2",
                "        17: aload_3",
                "        18: invokestatic  #121                // Method getChars:(JI[B)I",
                "        21: pop",
                "        22: new           #5                  // class java/lang/String",
                "        25: dup",
                "        26: aload_3",
                "        27: iconst_0",
                "        28: invokespecial #112                // Method java/lang/String.\"<init>\":([BB)V",
                "        31: areturn",
                "        32: iload_2",
                "        33: iconst_2",
                "        34: imul",
                "        35: newarray       byte",
                "        37: astore_3",
                "        38: lload_0",
                "        39: iload_2",
                "        40: aload_3",
                "        41: invokestatic  #125                // Method java/lang/StringUTF16.getChars:(JI[B)I",
                "        44: pop",
                "        45: new           #5                  // class java/lang/String",
                "        48: dup",
                "        49: aload_3",
                "        50: iconst_1",
                "        51: invokespecial #112                // Method java/lang/String.\"<init>\":([BB)V",
                "        54: areturn",
                "      LineNumberTable:",
                "        line 491: 0",
                "        line 492: 5",
                "        line 493: 11",
                "        line 494: 15",
                "        line 495: 22",
                "        line 497: 32",
                "        line 498: 38",
                "        line 499: 45",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "           15      17     3   buf   [B",
                "           38      17     3   buf   [B",
                "            0      55     0     i   J",
                "            5      50     2  size   I",
                "      StackMapTable: number_of_entries = 1",
                "        frame_type = 252 /* append */",
                "          offset_delta = 32",
                "          locals = [ int ]"
        );
    }

    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_13() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.String toUnsignedString(long);",
                "    descriptor: (J)Ljava/lang/String;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=3, locals=2, args_size=1",
                "         0: lload_0",
                "         1: bipush        10",
                "         3: invokestatic  #126                // Method toUnsignedString:(JI)Ljava/lang/String;",
                "         6: areturn",
                "      LineNumberTable:",
                "        line 518: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       7     0     i   J"
        );
    }

    @Instruction(value = 0xffffffff, name = "ldc2_w")
    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x09, name = "lconst_0")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x15, name = "iload")
    @Instruction(value = 0x16, name = "lload")
    @Instruction(value = 0x1c, name = "iload_2")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x33, name = "baload")
    @Instruction(value = 0x36, name = "istore")
    @Instruction(value = 0x37, name = "lstore")
    @Instruction(value = 0x3f, name = "lstore_0")
    @Instruction(value = 0x54, name = "bastore")
    @Instruction(value = 0x64, name = "isub")
    @Instruction(value = 0x65, name = "lsub")
    @Instruction(value = 0x68, name = "imul")
    @Instruction(value = 0x69, name = "lmul")
    @Instruction(value = 0x6c, name = "idiv")
    @Instruction(value = 0x6d, name = "ldiv")
    @Instruction(value = 0x74, name = "ineg")
    @Instruction(value = 0x75, name = "lneg")
    @Instruction(value = 0x84, name = "iinc")
    @Instruction(value = 0x88, name = "l2i")
    @Instruction(value = 0x94, name = "lcmp")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0x9a, name = "ifne")
    @Instruction(value = 0x9c, name = "ifge")
    @Instruction(value = 0x9d, name = "ifgt")
    @Instruction(value = 0xa2, name = "if_icmpge")
    @Instruction(value = 0xa3, name = "if_icmpgt")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb2, name = "getstatic")
    @Test
    public void test_14() {
        expectedConsecutiveLines = List.of(
                "  static int getChars(long, int, byte[]);",
                "    descriptor: (JI[B)I",
                "    flags: (0x0008) ACC_STATIC",
                "    Code:",
                "      stack=4, locals=11, args_size=3",
                "         0: iload_2",
                "         1: istore        7",
                "         3: lload_0",
                "         4: lconst_0",
                "         5: lcmp",
                "         6: ifge          13",
                "         9: iconst_1",
                "        10: goto          14",
                "        13: iconst_0",
                "        14: istore        8",
                "        16: iload         8",
                "        18: ifne          24",
                "        21: lload_0",
                "        22: lneg",
                "        23: lstore_0",
                "        24: lload_0",
                "        25: ldc2_w        #129                // long -2147483648l",
                "        28: lcmp",
                "        29: ifgt          82",
                "        32: lload_0",
                "        33: ldc2_w        #131                // long 100l",
                "        36: ldiv",
                "        37: lstore        4",
                "        39: lload         4",
                "        41: ldc2_w        #131                // long 100l",
                "        44: lmul",
                "        45: lload_0",
                "        46: lsub",
                "        47: l2i",
                "        48: istore        6",
                "        50: lload         4",
                "        52: lstore_0",
                "        53: aload_3",
                "        54: iinc          7, -1",
                "        57: iload         7",
                "        59: getstatic     #133                // Field java/lang/Integer.DigitOnes:[B",
                "        62: iload         6",
                "        64: baload",
                "        65: bastore",
                "        66: aload_3",
                "        67: iinc          7, -1",
                "        70: iload         7",
                "        72: getstatic     #137                // Field java/lang/Integer.DigitTens:[B",
                "        75: iload         6",
                "        77: baload",
                "        78: bastore",
                "        79: goto          24",
                "        82: lload_0",
                "        83: l2i",
                "        84: istore        10",
                "        86: iload         10",
                "        88: bipush        -100",
                "        90: if_icmpgt     143",
                "        93: iload         10",
                "        95: bipush        100",
                "        97: idiv",
                "        98: istore        9",
                "       100: iload         9",
                "       102: bipush        100",
                "       104: imul",
                "       105: iload         10",
                "       107: isub",
                "       108: istore        6",
                "       110: iload         9",
                "       112: istore        10",
                "       114: aload_3",
                "       115: iinc          7, -1",
                "       118: iload         7",
                "       120: getstatic     #133                // Field java/lang/Integer.DigitOnes:[B",
                "       123: iload         6",
                "       125: baload",
                "       126: bastore",
                "       127: aload_3",
                "       128: iinc          7, -1",
                "       131: iload         7",
                "       133: getstatic     #137                // Field java/lang/Integer.DigitTens:[B",
                "       136: iload         6",
                "       138: baload",
                "       139: bastore",
                "       140: goto          86",
                "       143: aload_3",
                "       144: iinc          7, -1",
                "       147: iload         7",
                "       149: getstatic     #133                // Field java/lang/Integer.DigitOnes:[B",
                "       152: iload         10",
                "       154: ineg",
                "       155: baload",
                "       156: bastore",
                "       157: iload         10",
                "       159: bipush        -9",
                "       161: if_icmpge     178",
                "       164: aload_3",
                "       165: iinc          7, -1",
                "       168: iload         7",
                "       170: getstatic     #137                // Field java/lang/Integer.DigitTens:[B",
                "       173: iload         10",
                "       175: ineg",
                "       176: baload",
                "       177: bastore",
                "       178: iload         8",
                "       180: ifeq          192",
                "       183: aload_3",
                "       184: iinc          7, -1",
                "       187: iload         7",
                "       189: bipush        45",
                "       191: bastore",
                "       192: iload         7",
                "       194: ireturn",
                "      LineNumberTable:",
                "        line 541: 0",
                "        line 543: 3",
                "        line 544: 16",
                "        line 545: 21",
                "        line 549: 24",
                "        line 550: 32",
                "        line 551: 39",
                "        line 552: 50",
                "        line 553: 53",
                "        line 554: 66",
                "        line 559: 82",
                "        line 560: 86",
                "        line 561: 93",
                "        line 562: 100",
                "        line 563: 110",
                "        line 564: 114",
                "        line 565: 127",
                "        line 569: 143",
                "        line 570: 157",
                "        line 571: 164",
                "        line 574: 178",
                "        line 575: 183",
                "        line 577: 192",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "           39      43     4     q   J",
                "           50      32     6     r   I",
                "          110      33     6     r   I",
                "          100      43     9    q2   I",
                "            0     195     0     i   J",
                "            0     195     2 index   I",
                "            0     195     3   buf   [B",
                "            3     192     7 charPos   I",
                "           16     179     8 negative   Z",
                "           86     109    10    i2   I",
                "      StackMapTable: number_of_entries = 8",
                "        frame_type = 255 /* full_frame */",
                "          offset_delta = 13",
                "          locals = [ long, int, class \"[B\", top, top, top, int ]",
                "          stack = []",
                "        frame_type = 64 /* same_locals_1_stack_item */",
                "          stack = [ int ]",
                "        frame_type = 252 /* append */",
                "          offset_delta = 9",
                "          locals = [ int ]",
                "        frame_type = 57 /* same */",
                "        frame_type = 253 /* append */",
                "          offset_delta = 3",
                "          locals = [ top, int ]",
                "        frame_type = 56 /* same */",
                "        frame_type = 34 /* same */",
                "        frame_type = 13 /* same */"
        );
    }

    @Instruction(value = 0xffffffff, name = "ldc2_w")
    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x09, name = "lconst_0")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x15, name = "iload")
    @Instruction(value = 0x1c, name = "iload_2")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x21, name = "lload_3")
    @Instruction(value = 0x36, name = "istore")
    @Instruction(value = 0x3d, name = "istore_2")
    @Instruction(value = 0x3f, name = "lstore_0")
    @Instruction(value = 0x42, name = "lstore_3")
    @Instruction(value = 0x60, name = "iadd")
    @Instruction(value = 0x69, name = "lmul")
    @Instruction(value = 0x75, name = "lneg")
    @Instruction(value = 0x84, name = "iinc")
    @Instruction(value = 0x94, name = "lcmp")
    @Instruction(value = 0x9b, name = "iflt")
    @Instruction(value = 0x9e, name = "ifle")
    @Instruction(value = 0xa2, name = "if_icmpge")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xac, name = "ireturn")
    @Test
    public void test_15() {
        expectedConsecutiveLines = List.of(
                "  static int stringSize(long);",
                "    descriptor: (J)I",
                "    flags: (0x0008) ACC_STATIC",
                "    Code:",
                "      stack=4, locals=6, args_size=1",
                "         0: iconst_1",
                "         1: istore_2",
                "         2: lload_0",
                "         3: lconst_0",
                "         4: lcmp",
                "         5: iflt          13",
                "         8: iconst_0",
                "         9: istore_2",
                "        10: lload_0",
                "        11: lneg",
                "        12: lstore_0",
                "        13: ldc2_w        #140                // long -10l",
                "        16: lstore_3",
                "        17: iconst_1",
                "        18: istore        5",
                "        20: iload         5",
                "        22: bipush        19",
                "        24: if_icmpge     50",
                "        27: lload_0",
                "        28: lload_3",
                "        29: lcmp",
                "        30: ifle          38",
                "        33: iload         5",
                "        35: iload_2",
                "        36: iadd",
                "        37: ireturn",
                "        38: ldc2_w        #53                 // long 10l",
                "        41: lload_3",
                "        42: lmul",
                "        43: lstore_3",
                "        44: iinc          5, 1",
                "        47: goto          20",
                "        50: bipush        19",
                "        52: iload_2",
                "        53: iadd",
                "        54: ireturn",
                "      LineNumberTable:",
                "        line 592: 0",
                "        line 593: 2",
                "        line 594: 8",
                "        line 595: 10",
                "        line 597: 13",
                "        line 598: 17",
                "        line 599: 27",
                "        line 600: 33",
                "        line 601: 38",
                "        line 598: 44",
                "        line 603: 50",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "           20      30     5     i   I",
                "            0      55     0     x   J",
                "            2      53     2     d   I",
                "           17      38     3     p   J",
                "      StackMapTable: number_of_entries = 4",
                "        frame_type = 252 /* append */",
                "          offset_delta = 13",
                "          locals = [ int ]",
                "        frame_type = 253 /* append */",
                "          offset_delta = 6",
                "          locals = [ long, int ]",
                "        frame_type = 17 /* same */",
                "        frame_type = 250 /* chop */",
                "          offset_delta = 11"
        );
    }

    @Instruction(value = 0xffffffff, name = "ldc2_w")
    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x05, name = "iconst_2")
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
    @Instruction(value = 0x3d, name = "istore_2")
    @Instruction(value = 0x3e, name = "istore_3")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0x61, name = "ladd")
    @Instruction(value = 0x65, name = "lsub")
    @Instruction(value = 0x69, name = "lmul")
    @Instruction(value = 0x6d, name = "ldiv")
    @Instruction(value = 0x75, name = "lneg")
    @Instruction(value = 0x84, name = "iinc")
    @Instruction(value = 0x85, name = "i2l")
    @Instruction(value = 0x94, name = "lcmp")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0x9b, name = "iflt")
    @Instruction(value = 0x9c, name = "ifge")
    @Instruction(value = 0x9e, name = "ifle")
    @Instruction(value = 0x9f, name = "if_icmpeq")
    @Instruction(value = 0xa0, name = "if_icmpne")
    @Instruction(value = 0xa2, name = "if_icmpge")
    @Instruction(value = 0xa4, name = "if_icmple")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xad, name = "lreturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbf, name = "athrow")
    @Instruction(value = 0xc7, name = "ifnonnull")
    @Test
    public void test_16() {
        expectedConsecutiveLines = List.of(
                "  public static long parseLong(java.lang.String, int) throws java.lang.NumberFormatException;",
                "    descriptor: (Ljava/lang/String;I)J",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=6, locals=13, args_size=2",
                "         0: aload_0",
                "         1: ifnonnull     14",
                "         4: new           #142                // class java/lang/NumberFormatException",
                "         7: dup",
                "         8: ldc           #144                // String Cannot parse null string",
                "        10: invokespecial #146                // Method java/lang/NumberFormatException.\"<init>\":(Ljava/lang/String;)V",
                "        13: athrow",
                "        14: iload_1",
                "        15: iconst_2",
                "        16: if_icmpge     51",
                "        19: new           #142                // class java/lang/NumberFormatException",
                "        22: dup",
                "        23: new           #55                 // class java/lang/StringBuilder",
                "        26: dup",
                "        27: invokespecial #57                 // Method java/lang/StringBuilder.\"<init>\":()V",
                "        30: ldc           #149                // String radix",
                "        32: invokevirtual #61                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "        35: iload_1",
                "        36: invokevirtual #151                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;",
                "        39: ldc           #154                // String  less than Character.MIN_RADIX",
                "        41: invokevirtual #61                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "        44: invokevirtual #68                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;",
                "        47: invokespecial #146                // Method java/lang/NumberFormatException.\"<init>\":(Ljava/lang/String;)V",
                "        50: athrow",
                "        51: iload_1",
                "        52: bipush        36",
                "        54: if_icmple     89",
                "        57: new           #142                // class java/lang/NumberFormatException",
                "        60: dup",
                "        61: new           #55                 // class java/lang/StringBuilder",
                "        64: dup",
                "        65: invokespecial #57                 // Method java/lang/StringBuilder.\"<init>\":()V",
                "        68: ldc           #149                // String radix",
                "        70: invokevirtual #61                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "        73: iload_1",
                "        74: invokevirtual #151                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;",
                "        77: ldc           #156                // String  greater than Character.MAX_RADIX",
                "        79: invokevirtual #61                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "        82: invokevirtual #68                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;",
                "        85: invokespecial #146                // Method java/lang/NumberFormatException.\"<init>\":(Ljava/lang/String;)V",
                "        88: athrow",
                "        89: iconst_0",
                "        90: istore_2",
                "        91: iconst_0",
                "        92: istore_3",
                "        93: aload_0",
                "        94: invokevirtual #158                // Method java/lang/String.length:()I",
                "        97: istore        4",
                "        99: ldc2_w        #162                // long -9223372036854775807l",
                "       102: lstore        5",
                "       104: iload         4",
                "       106: ifle          266",
                "       109: aload_0",
                "       110: iconst_0",
                "       111: invokevirtual #164                // Method java/lang/String.charAt:(I)C",
                "       114: istore        7",
                "       116: iload         7",
                "       118: bipush        48",
                "       120: if_icmpge     168",
                "       123: iload         7",
                "       125: bipush        45",
                "       127: if_icmpne     140",
                "       130: iconst_1",
                "       131: istore_2",
                "       132: ldc2_w        #168                // long -9223372036854775808l",
                "       135: lstore        5",
                "       137: goto          153",
                "       140: iload         7",
                "       142: bipush        43",
                "       144: if_icmpeq     153",
                "       147: aload_0",
                "       148: iload_1",
                "       149: invokestatic  #170                // Method java/lang/NumberFormatException.forInputString:(Ljava/lang/String;I)Ljava/lang/NumberFormatException;",
                "       152: athrow",
                "       153: iload         4",
                "       155: iconst_1",
                "       156: if_icmpne     165",
                "       159: aload_0",
                "       160: iload_1",
                "       161: invokestatic  #170                // Method java/lang/NumberFormatException.forInputString:(Ljava/lang/String;I)Ljava/lang/NumberFormatException;",
                "       164: athrow",
                "       165: iinc          3, 1",
                "       168: lload         5",
                "       170: iload_1",
                "       171: i2l",
                "       172: ldiv",
                "       173: lstore        8",
                "       175: lconst_0",
                "       176: lstore        10",
                "       178: iload_3",
                "       179: iload         4",
                "       181: if_icmpge     253",
                "       184: aload_0",
                "       185: iload_3",
                "       186: iinc          3, 1",
                "       189: invokevirtual #164                // Method java/lang/String.charAt:(I)C",
                "       192: iload_1",
                "       193: invokestatic  #174                // Method java/lang/Character.digit:(CI)I",
                "       196: istore        12",
                "       198: iload         12",
                "       200: iflt          211",
                "       203: lload         10",
                "       205: lload         8",
                "       207: lcmp",
                "       208: ifge          217",
                "       211: aload_0",
                "       212: iload_1",
                "       213: invokestatic  #170                // Method java/lang/NumberFormatException.forInputString:(Ljava/lang/String;I)Ljava/lang/NumberFormatException;",
                "       216: athrow",
                "       217: lload         10",
                "       219: iload_1",
                "       220: i2l",
                "       221: lmul",
                "       222: lstore        10",
                "       224: lload         10",
                "       226: lload         5",
                "       228: iload         12",
                "       230: i2l",
                "       231: ladd",
                "       232: lcmp",
                "       233: ifge          242",
                "       236: aload_0",
                "       237: iload_1",
                "       238: invokestatic  #170                // Method java/lang/NumberFormatException.forInputString:(Ljava/lang/String;I)Ljava/lang/NumberFormatException;",
                "       241: athrow",
                "       242: lload         10",
                "       244: iload         12",
                "       246: i2l",
                "       247: lsub",
                "       248: lstore        10",
                "       250: goto          178",
                "       253: iload_2",
                "       254: ifeq          262",
                "       257: lload         10",
                "       259: goto          265",
                "       262: lload         10",
                "       264: lneg",
                "       265: lreturn",
                "       266: aload_0",
                "       267: iload_1",
                "       268: invokestatic  #170                // Method java/lang/NumberFormatException.forInputString:(Ljava/lang/String;I)Ljava/lang/NumberFormatException;",
                "       271: athrow",
                "      LineNumberTable:",
                "        line 670: 0",
                "        line 671: 4",
                "        line 674: 14",
                "        line 675: 19",
                "        line 678: 51",
                "        line 679: 57",
                "        line 683: 89",
                "        line 684: 91",
                "        line 685: 99",
                "        line 687: 104",
                "        line 688: 109",
                "        line 689: 116",
                "        line 690: 123",
                "        line 691: 130",
                "        line 692: 132",
                "        line 693: 140",
                "        line 694: 147",
                "        line 697: 153",
                "        line 698: 159",
                "        line 700: 165",
                "        line 702: 168",
                "        line 703: 175",
                "        line 704: 178",
                "        line 706: 184",
                "        line 707: 198",
                "        line 708: 211",
                "        line 710: 217",
                "        line 711: 224",
                "        line 712: 236",
                "        line 714: 242",
                "        line 715: 250",
                "        line 716: 253",
                "        line 718: 266",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "          198      52    12 digit   I",
                "          116     150     7 firstChar   C",
                "          175      91     8 multmin   J",
                "          178      88    10 result   J",
                "            0     272     0     s   Ljava/lang/String;",
                "            0     272     1 radix   I",
                "           91     181     2 negative   Z",
                "           93     179     3     i   I",
                "           99     173     4   len   I",
                "          104     168     5 limit   J",
                "      StackMapTable: number_of_entries = 15",
                "        frame_type = 14 /* same */",
                "        frame_type = 36 /* same */",
                "        frame_type = 37 /* same */",
                "        frame_type = 255 /* full_frame */",
                "          offset_delta = 50",
                "          locals = [ class java/lang/String, int, int, int, int, long, int ]",
                "          stack = []",
                "        frame_type = 12 /* same */",
                "        frame_type = 11 /* same */",
                "        frame_type = 2 /* same */",
                "        frame_type = 253 /* append */",
                "          offset_delta = 9",
                "          locals = [ long, long ]",
                "        frame_type = 252 /* append */",
                "          offset_delta = 32",
                "          locals = [ int ]",
                "        frame_type = 5 /* same */",
                "        frame_type = 24 /* same */",
                "        frame_type = 250 /* chop */",
                "          offset_delta = 10",
                "        frame_type = 8 /* same */",
                "        frame_type = 66 /* same_locals_1_stack_item */",
                "          stack = [ long ]",
                "        frame_type = 248 /* chop */",
                "          offset_delta = 0",
                "    Exceptions:",
                "      throws java.lang.NumberFormatException"
        );
    }

    @Instruction(value = 0xffffffff, name = "ldc2_w")
    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x05, name = "iconst_2")
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
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0x61, name = "ladd")
    @Instruction(value = 0x65, name = "lsub")
    @Instruction(value = 0x69, name = "lmul")
    @Instruction(value = 0x6d, name = "ldiv")
    @Instruction(value = 0x75, name = "lneg")
    @Instruction(value = 0x84, name = "iinc")
    @Instruction(value = 0x85, name = "i2l")
    @Instruction(value = 0x94, name = "lcmp")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0x9b, name = "iflt")
    @Instruction(value = 0x9c, name = "ifge")
    @Instruction(value = 0x9f, name = "if_icmpeq")
    @Instruction(value = 0xa0, name = "if_icmpne")
    @Instruction(value = 0xa1, name = "if_icmplt")
    @Instruction(value = 0xa2, name = "if_icmpge")
    @Instruction(value = 0xa4, name = "if_icmple")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xad, name = "lreturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbf, name = "athrow")
    @Test
    public void test_17() {
        expectedConsecutiveLines = List.of(
                "  public static long parseLong(java.lang.CharSequence, int, int, int) throws java.lang.NumberFormatException;",
                "    descriptor: (Ljava/lang/CharSequence;III)J",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=6, locals=14, args_size=4",
                "         0: aload_0",
                "         1: invokestatic  #178                // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "         4: pop",
                "         5: iload_1",
                "         6: iload_2",
                "         7: aload_0",
                "         8: invokeinterface #184,  1          // InterfaceMethod java/lang/CharSequence.length:()I",
                "        13: invokestatic  #187                // Method java/util/Objects.checkFromToIndex:(III)I",
                "        16: pop",
                "        17: iload_3",
                "        18: iconst_2",
                "        19: if_icmpge     54",
                "        22: new           #142                // class java/lang/NumberFormatException",
                "        25: dup",
                "        26: new           #55                 // class java/lang/StringBuilder",
                "        29: dup",
                "        30: invokespecial #57                 // Method java/lang/StringBuilder.\"<init>\":()V",
                "        33: ldc           #149                // String radix",
                "        35: invokevirtual #61                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "        38: iload_3",
                "        39: invokevirtual #151                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;",
                "        42: ldc           #154                // String  less than Character.MIN_RADIX",
                "        44: invokevirtual #61                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "        47: invokevirtual #68                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;",
                "        50: invokespecial #146                // Method java/lang/NumberFormatException.\"<init>\":(Ljava/lang/String;)V",
                "        53: athrow",
                "        54: iload_3",
                "        55: bipush        36",
                "        57: if_icmple     92",
                "        60: new           #142                // class java/lang/NumberFormatException",
                "        63: dup",
                "        64: new           #55                 // class java/lang/StringBuilder",
                "        67: dup",
                "        68: invokespecial #57                 // Method java/lang/StringBuilder.\"<init>\":()V",
                "        71: ldc           #149                // String radix",
                "        73: invokevirtual #61                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "        76: iload_3",
                "        77: invokevirtual #151                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;",
                "        80: ldc           #156                // String  greater than Character.MAX_RADIX",
                "        82: invokevirtual #61                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "        85: invokevirtual #68                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;",
                "        88: invokespecial #146                // Method java/lang/NumberFormatException.\"<init>\":(Ljava/lang/String;)V",
                "        91: athrow",
                "        92: iconst_0",
                "        93: istore        4",
                "        95: iload_1",
                "        96: istore        5",
                "        98: ldc2_w        #162                // long -9223372036854775807l",
                "       101: lstore        6",
                "       103: iload         5",
                "       105: iload_2",
                "       106: if_icmpge     286",
                "       109: aload_0",
                "       110: iload         5",
                "       112: invokeinterface #191,  2          // InterfaceMethod java/lang/CharSequence.charAt:(I)C",
                "       117: istore        8",
                "       119: iload         8",
                "       121: bipush        48",
                "       123: if_icmpge     163",
                "       126: iload         8",
                "       128: bipush        45",
                "       130: if_icmpne     144",
                "       133: iconst_1",
                "       134: istore        4",
                "       136: ldc2_w        #168                // long -9223372036854775808l",
                "       139: lstore        6",
                "       141: goto          160",
                "       144: iload         8",
                "       146: bipush        43",
                "       148: if_icmpeq     160",
                "       151: aload_0",
                "       152: iload_1",
                "       153: iload_2",
                "       154: iload         5",
                "       156: invokestatic  #192                // Method java/lang/NumberFormatException.forCharSequence:(Ljava/lang/CharSequence;III)Ljava/lang/NumberFormatException;",
                "       159: athrow",
                "       160: iinc          5, 1",
                "       163: iload         5",
                "       165: iload_2",
                "       166: if_icmplt     178",
                "       169: aload_0",
                "       170: iload_1",
                "       171: iload_2",
                "       172: iload         5",
                "       174: invokestatic  #192                // Method java/lang/NumberFormatException.forCharSequence:(Ljava/lang/CharSequence;III)Ljava/lang/NumberFormatException;",
                "       177: athrow",
                "       178: lload         6",
                "       180: iload_3",
                "       181: i2l",
                "       182: ldiv",
                "       183: lstore        9",
                "       185: lconst_0",
                "       186: lstore        11",
                "       188: iload         5",
                "       190: iload_2",
                "       191: if_icmpge     272",
                "       194: aload_0",
                "       195: iload         5",
                "       197: invokeinterface #191,  2          // InterfaceMethod java/lang/CharSequence.charAt:(I)C",
                "       202: iload_3",
                "       203: invokestatic  #174                // Method java/lang/Character.digit:(CI)I",
                "       206: istore        13",
                "       208: iload         13",
                "       210: iflt          221",
                "       213: lload         11",
                "       215: lload         9",
                "       217: lcmp",
                "       218: ifge          230",
                "       221: aload_0",
                "       222: iload_1",
                "       223: iload_2",
                "       224: iload         5",
                "       226: invokestatic  #192                // Method java/lang/NumberFormatException.forCharSequence:(Ljava/lang/CharSequence;III)Ljava/lang/NumberFormatException;",
                "       229: athrow",
                "       230: lload         11",
                "       232: iload_3",
                "       233: i2l",
                "       234: lmul",
                "       235: lstore        11",
                "       237: lload         11",
                "       239: lload         6",
                "       241: iload         13",
                "       243: i2l",
                "       244: ladd",
                "       245: lcmp",
                "       246: ifge          258",
                "       249: aload_0",
                "       250: iload_1",
                "       251: iload_2",
                "       252: iload         5",
                "       254: invokestatic  #192                // Method java/lang/NumberFormatException.forCharSequence:(Ljava/lang/CharSequence;III)Ljava/lang/NumberFormatException;",
                "       257: athrow",
                "       258: iinc          5, 1",
                "       261: lload         11",
                "       263: iload         13",
                "       265: i2l",
                "       266: lsub",
                "       267: lstore        11",
                "       269: goto          188",
                "       272: iload         4",
                "       274: ifeq          282",
                "       277: lload         11",
                "       279: goto          285",
                "       282: lload         11",
                "       284: lneg",
                "       285: lreturn",
                "       286: new           #142                // class java/lang/NumberFormatException",
                "       289: dup",
                "       290: ldc           #196                // String",
                "       292: invokespecial #146                // Method java/lang/NumberFormatException.\"<init>\":(Ljava/lang/String;)V",
                "       295: athrow",
                "      LineNumberTable:",
                "        line 751: 0",
                "        line 752: 5",
                "        line 754: 17",
                "        line 755: 22",
                "        line 758: 54",
                "        line 759: 60",
                "        line 763: 92",
                "        line 764: 95",
                "        line 765: 98",
                "        line 767: 103",
                "        line 768: 109",
                "        line 769: 119",
                "        line 770: 126",
                "        line 771: 133",
                "        line 772: 136",
                "        line 773: 144",
                "        line 774: 151",
                "        line 777: 160",
                "        line 779: 163",
                "        line 780: 169",
                "        line 783: 178",
                "        line 784: 185",
                "        line 785: 188",
                "        line 787: 194",
                "        line 788: 208",
                "        line 789: 221",
                "        line 792: 230",
                "        line 793: 237",
                "        line 794: 249",
                "        line 797: 258",
                "        line 798: 261",
                "        line 799: 269",
                "        line 800: 272",
                "        line 802: 286",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "          208      61    13 digit   I",
                "          119     167     8 firstChar   C",
                "          185     101     9 multmin   J",
                "          188      98    11 result   J",
                "            0     296     0     s   Ljava/lang/CharSequence;",
                "            0     296     1 beginIndex   I",
                "            0     296     2 endIndex   I",
                "            0     296     3 radix   I",
                "           95     201     4 negative   Z",
                "           98     198     5     i   I",
                "          103     193     6 limit   J",
                "      StackMapTable: number_of_entries = 14",
                "        frame_type = 54 /* same */",
                "        frame_type = 37 /* same */",
                "        frame_type = 255 /* full_frame */",
                "          offset_delta = 51",
                "          locals = [ class java/lang/CharSequence, int, int, int, int, int, long, int ]",
                "          stack = []",
                "        frame_type = 15 /* same */",
                "        frame_type = 2 /* same */",
                "        frame_type = 14 /* same */",
                "        frame_type = 253 /* append */",
                "          offset_delta = 9",
                "          locals = [ long, long ]",
                "        frame_type = 252 /* append */",
                "          offset_delta = 32",
                "          locals = [ int ]",
                "        frame_type = 8 /* same */",
                "        frame_type = 27 /* same */",
                "        frame_type = 250 /* chop */",
                "          offset_delta = 13",
                "        frame_type = 9 /* same */",
                "        frame_type = 66 /* same_locals_1_stack_item */",
                "          stack = [ long ]",
                "        frame_type = 248 /* chop */",
                "          offset_delta = 0",
                "    Exceptions:",
                "      throws java.lang.NumberFormatException"
        );
    }

    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xad, name = "lreturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_18() {
        expectedConsecutiveLines = List.of(
                "  public static long parseLong(java.lang.String) throws java.lang.NumberFormatException;",
                "    descriptor: (Ljava/lang/String;)J",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: bipush        10",
                "         3: invokestatic  #198                // Method parseLong:(Ljava/lang/String;I)J",
                "         6: lreturn",
                "      LineNumberTable:",
                "        line 831: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       7     0     s   Ljava/lang/String;",
                "    Exceptions:",
                "      throws java.lang.NumberFormatException"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x09, name = "lconst_0")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x11, name = "sipush")
    @Instruction(value = 0x12, name = "ldc")
    @Instruction(value = 0x15, name = "iload")
    @Instruction(value = 0x16, name = "lload")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0x1c, name = "iload_2")
    @Instruction(value = 0x1d, name = "iload_3")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x36, name = "istore")
    @Instruction(value = 0x37, name = "lstore")
    @Instruction(value = 0x3d, name = "istore_2")
    @Instruction(value = 0x3e, name = "istore_3")
    @Instruction(value = 0x53, name = "aastore")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0x61, name = "ladd")
    @Instruction(value = 0x64, name = "isub")
    @Instruction(value = 0x68, name = "imul")
    @Instruction(value = 0x69, name = "lmul")
    @Instruction(value = 0x7d, name = "lushr")
    @Instruction(value = 0x85, name = "i2l")
    @Instruction(value = 0x88, name = "l2i")
    @Instruction(value = 0x94, name = "lcmp")
    @Instruction(value = 0x9b, name = "iflt")
    @Instruction(value = 0x9c, name = "ifge")
    @Instruction(value = 0x9e, name = "ifle")
    @Instruction(value = 0xa0, name = "if_icmpne")
    @Instruction(value = 0xa1, name = "if_icmplt")
    @Instruction(value = 0xa2, name = "if_icmpge")
    @Instruction(value = 0xa3, name = "if_icmpgt")
    @Instruction(value = 0xa4, name = "if_icmple")
    @Instruction(value = 0xad, name = "lreturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbd, name = "anewarray")
    @Instruction(value = 0xbf, name = "athrow")
    @Instruction(value = 0xc7, name = "ifnonnull")
    @Test
    public void test_19() {
        expectedConsecutiveLines = List.of(
                "  public static long parseUnsignedLong(java.lang.String, int) throws java.lang.NumberFormatException;",
                "    descriptor: (Ljava/lang/String;I)J",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=7, locals=10, args_size=2",
                "         0: aload_0",
                "         1: ifnonnull     14",
                "         4: new           #142                // class java/lang/NumberFormatException",
                "         7: dup",
                "         8: ldc           #144                // String Cannot parse null string",
                "        10: invokespecial #146                // Method java/lang/NumberFormatException.\"<init>\":(Ljava/lang/String;)V",
                "        13: athrow",
                "        14: aload_0",
                "        15: invokevirtual #158                // Method java/lang/String.length:()I",
                "        18: istore_2",
                "        19: iload_2",
                "        20: ifle          203",
                "        23: aload_0",
                "        24: iconst_0",
                "        25: invokevirtual #164                // Method java/lang/String.charAt:(I)C",
                "        28: istore_3",
                "        29: iload_3",
                "        30: bipush        45",
                "        32: if_icmpne     56",
                "        35: new           #142                // class java/lang/NumberFormatException",
                "        38: dup",
                "        39: ldc           #202                // String Illegal leading minus sign on unsigned string %s.",
                "        41: iconst_1",
                "        42: anewarray     #204                // class java/lang/Object",
                "        45: dup",
                "        46: iconst_0",
                "        47: aload_0",
                "        48: aastore",
                "        49: invokestatic  #206                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;",
                "        52: invokespecial #146                // Method java/lang/NumberFormatException.\"<init>\":(Ljava/lang/String;)V",
                "        55: athrow",
                "        56: iload_2",
                "        57: bipush        12",
                "        59: if_icmple     74",
                "        62: iload_1",
                "        63: bipush        10",
                "        65: if_icmpne     80",
                "        68: iload_2",
                "        69: bipush        18",
                "        71: if_icmpgt     80",
                "        74: aload_0",
                "        75: iload_1",
                "        76: invokestatic  #198                // Method parseLong:(Ljava/lang/String;I)J",
                "        79: lreturn",
                "        80: aload_0",
                "        81: iconst_0",
                "        82: iload_2",
                "        83: iconst_1",
                "        84: isub",
                "        85: iload_1",
                "        86: invokestatic  #210                // Method parseLong:(Ljava/lang/CharSequence;III)J",
                "        89: lstore        4",
                "        91: aload_0",
                "        92: iload_2",
                "        93: iconst_1",
                "        94: isub",
                "        95: invokevirtual #164                // Method java/lang/String.charAt:(I)C",
                "        98: iload_1",
                "        99: invokestatic  #174                // Method java/lang/Character.digit:(CI)I",
                "       102: istore        6",
                "       104: iload         6",
                "       106: ifge          136",
                "       109: new           #142                // class java/lang/NumberFormatException",
                "       112: dup",
                "       113: new           #55                 // class java/lang/StringBuilder",
                "       116: dup",
                "       117: invokespecial #57                 // Method java/lang/StringBuilder.\"<init>\":()V",
                "       120: ldc           #213                // String Bad digit at end of",
                "       122: invokevirtual #61                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "       125: aload_0",
                "       126: invokevirtual #61                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "       129: invokevirtual #68                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;",
                "       132: invokespecial #146                // Method java/lang/NumberFormatException.\"<init>\":(Ljava/lang/String;)V",
                "       135: athrow",
                "       136: lload         4",
                "       138: iload_1",
                "       139: i2l",
                "       140: lmul",
                "       141: iload         6",
                "       143: i2l",
                "       144: ladd",
                "       145: lstore        7",
                "       147: iload_1",
                "       148: lload         4",
                "       150: bipush        57",
                "       152: lushr",
                "       153: l2i",
                "       154: imul",
                "       155: istore        9",
                "       157: iload         9",
                "       159: sipush        128",
                "       162: if_icmpge     179",
                "       165: lload         7",
                "       167: lconst_0",
                "       168: lcmp",
                "       169: iflt          200",
                "       172: iload         9",
                "       174: bipush        92",
                "       176: if_icmplt     200",
                "       179: new           #142                // class java/lang/NumberFormatException",
                "       182: dup",
                "       183: ldc           #215                // String String value %s exceeds range of unsigned long.",
                "       185: iconst_1",
                "       186: anewarray     #204                // class java/lang/Object",
                "       189: dup",
                "       190: iconst_0",
                "       191: aload_0",
                "       192: aastore",
                "       193: invokestatic  #206                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;",
                "       196: invokespecial #146                // Method java/lang/NumberFormatException.\"<init>\":(Ljava/lang/String;)V",
                "       199: athrow",
                "       200: lload         7",
                "       202: lreturn",
                "       203: aload_0",
                "       204: iload_1",
                "       205: invokestatic  #170                // Method java/lang/NumberFormatException.forInputString:(Ljava/lang/String;I)Ljava/lang/NumberFormatException;",
                "       208: athrow",
                "      LineNumberTable:",
                "        line 879: 0",
                "        line 880: 4",
                "        line 883: 14",
                "        line 884: 19",
                "        line 885: 23",
                "        line 886: 29",
                "        line 887: 35",
                "        line 888: 49",
                "        line 891: 56",
                "        line 893: 74",
                "        line 897: 80",
                "        line 898: 91",
                "        line 899: 104",
                "        line 900: 109",
                "        line 902: 136",
                "        line 915: 147",
                "        line 916: 157",
                "        line 956: 179",
                "        line 959: 200",
                "        line 962: 203",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "           91     112     4 first   J",
                "          104      99     6 second   I",
                "          147      56     7 result   J",
                "          157      46     9 guard   I",
                "           29     174     3 firstChar   C",
                "            0     209     0     s   Ljava/lang/String;",
                "            0     209     1 radix   I",
                "           19     190     2   len   I",
                "      StackMapTable: number_of_entries = 8",
                "        frame_type = 14 /* same */",
                "        frame_type = 253 /* append */",
                "          offset_delta = 41",
                "          locals = [ int, int ]",
                "        frame_type = 17 /* same */",
                "        frame_type = 5 /* same */",
                "        frame_type = 253 /* append */",
                "          offset_delta = 55",
                "          locals = [ long, int ]",
                "        frame_type = 253 /* append */",
                "          offset_delta = 42",
                "          locals = [ long, int ]",
                "        frame_type = 20 /* same */",
                "        frame_type = 255 /* full_frame */",
                "          offset_delta = 2",
                "          locals = [ class java/lang/String, int, int ]",
                "          stack = []",
                "    Exceptions:",
                "      throws java.lang.NumberFormatException"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x09, name = "lconst_0")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x11, name = "sipush")
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
    @Instruction(value = 0x61, name = "ladd")
    @Instruction(value = 0x64, name = "isub")
    @Instruction(value = 0x68, name = "imul")
    @Instruction(value = 0x69, name = "lmul")
    @Instruction(value = 0x7d, name = "lushr")
    @Instruction(value = 0x85, name = "i2l")
    @Instruction(value = 0x88, name = "l2i")
    @Instruction(value = 0x94, name = "lcmp")
    @Instruction(value = 0x9b, name = "iflt")
    @Instruction(value = 0x9c, name = "ifge")
    @Instruction(value = 0x9e, name = "ifle")
    @Instruction(value = 0xa0, name = "if_icmpne")
    @Instruction(value = 0xa1, name = "if_icmplt")
    @Instruction(value = 0xa2, name = "if_icmpge")
    @Instruction(value = 0xa3, name = "if_icmpgt")
    @Instruction(value = 0xa4, name = "if_icmple")
    @Instruction(value = 0xad, name = "lreturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xb9, name = "invokeinterface")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbd, name = "anewarray")
    @Instruction(value = 0xbf, name = "athrow")
    @Test
    public void test_20() {
        expectedConsecutiveLines = List.of(
                "  public static long parseUnsignedLong(java.lang.CharSequence, int, int, int) throws java.lang.NumberFormatException;",
                "    descriptor: (Ljava/lang/CharSequence;III)J",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=10, locals=13, args_size=4",
                "         0: aload_0",
                "         1: invokestatic  #178                // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "         4: pop",
                "         5: iload_1",
                "         6: iload_2",
                "         7: aload_0",
                "         8: invokeinterface #184,  1          // InterfaceMethod java/lang/CharSequence.length:()I",
                "        13: invokestatic  #187                // Method java/util/Objects.checkFromToIndex:(III)I",
                "        16: pop",
                "        17: iload_1",
                "        18: istore        4",
                "        20: iload_2",
                "        21: iload_1",
                "        22: isub",
                "        23: istore        5",
                "        25: iload         5",
                "        27: ifle          271",
                "        30: aload_0",
                "        31: iload         4",
                "        33: invokeinterface #191,  2          // InterfaceMethod java/lang/CharSequence.charAt:(I)C",
                "        38: istore        6",
                "        40: iload         6",
                "        42: bipush        45",
                "        44: if_icmpne     80",
                "        47: new           #142                // class java/lang/NumberFormatException",
                "        50: dup",
                "        51: ldc           #202                // String Illegal leading minus sign on unsigned string %s.",
                "        53: iconst_1",
                "        54: anewarray     #204                // class java/lang/Object",
                "        57: dup",
                "        58: iconst_0",
                "        59: aload_0",
                "        60: iload         4",
                "        62: iload         4",
                "        64: iload         5",
                "        66: iadd",
                "        67: invokeinterface #217,  3          // InterfaceMethod java/lang/CharSequence.subSequence:(II)Ljava/lang/CharSequence;",
                "        72: aastore",
                "        73: invokestatic  #206                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;",
                "        76: invokespecial #146                // Method java/lang/NumberFormatException.\"<init>\":(Ljava/lang/String;)V",
                "        79: athrow",
                "        80: iload         5",
                "        82: bipush        12",
                "        84: if_icmple     100",
                "        87: iload_3",
                "        88: bipush        10",
                "        90: if_icmpne     113",
                "        93: iload         5",
                "        95: bipush        18",
                "        97: if_icmpgt     113",
                "       100: aload_0",
                "       101: iload         4",
                "       103: iload         4",
                "       105: iload         5",
                "       107: iadd",
                "       108: iload_3",
                "       109: invokestatic  #210                // Method parseLong:(Ljava/lang/CharSequence;III)J",
                "       112: lreturn",
                "       113: aload_0",
                "       114: iload         4",
                "       116: iload         4",
                "       118: iload         5",
                "       120: iadd",
                "       121: iconst_1",
                "       122: isub",
                "       123: iload_3",
                "       124: invokestatic  #210                // Method parseLong:(Ljava/lang/CharSequence;III)J",
                "       127: lstore        7",
                "       129: aload_0",
                "       130: iload         4",
                "       132: iload         5",
                "       134: iadd",
                "       135: iconst_1",
                "       136: isub",
                "       137: invokeinterface #191,  2          // InterfaceMethod java/lang/CharSequence.charAt:(I)C",
                "       142: iload_3",
                "       143: invokestatic  #174                // Method java/lang/Character.digit:(CI)I",
                "       146: istore        9",
                "       148: iload         9",
                "       150: ifge          192",
                "       153: new           #142                // class java/lang/NumberFormatException",
                "       156: dup",
                "       157: new           #55                 // class java/lang/StringBuilder",
                "       160: dup",
                "       161: invokespecial #57                 // Method java/lang/StringBuilder.\"<init>\":()V",
                "       164: ldc           #213                // String Bad digit at end of",
                "       166: invokevirtual #61                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "       169: aload_0",
                "       170: iload         4",
                "       172: iload         4",
                "       174: iload         5",
                "       176: iadd",
                "       177: invokeinterface #217,  3          // InterfaceMethod java/lang/CharSequence.subSequence:(II)Ljava/lang/CharSequence;",
                "       182: invokevirtual #221                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;",
                "       185: invokevirtual #68                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;",
                "       188: invokespecial #146                // Method java/lang/NumberFormatException.\"<init>\":(Ljava/lang/String;)V",
                "       191: athrow",
                "       192: lload         7",
                "       194: iload_3",
                "       195: i2l",
                "       196: lmul",
                "       197: iload         9",
                "       199: i2l",
                "       200: ladd",
                "       201: lstore        10",
                "       203: iload_3",
                "       204: lload         7",
                "       206: bipush        57",
                "       208: lushr",
                "       209: l2i",
                "       210: imul",
                "       211: istore        12",
                "       213: iload         12",
                "       215: sipush        128",
                "       218: if_icmpge     235",
                "       221: lload         10",
                "       223: lconst_0",
                "       224: lcmp",
                "       225: iflt          268",
                "       228: iload         12",
                "       230: bipush        92",
                "       232: if_icmplt     268",
                "       235: new           #142                // class java/lang/NumberFormatException",
                "       238: dup",
                "       239: ldc           #215                // String String value %s exceeds range of unsigned long.",
                "       241: iconst_1",
                "       242: anewarray     #204                // class java/lang/Object",
                "       245: dup",
                "       246: iconst_0",
                "       247: aload_0",
                "       248: iload         4",
                "       250: iload         4",
                "       252: iload         5",
                "       254: iadd",
                "       255: invokeinterface #217,  3          // InterfaceMethod java/lang/CharSequence.subSequence:(II)Ljava/lang/CharSequence;",
                "       260: aastore",
                "       261: invokestatic  #206                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;",
                "       264: invokespecial #146                // Method java/lang/NumberFormatException.\"<init>\":(Ljava/lang/String;)V",
                "       267: athrow",
                "       268: lload         10",
                "       270: lreturn",
                "       271: ldc           #196                // String",
                "       273: iload_3",
                "       274: invokestatic  #170                // Method java/lang/NumberFormatException.forInputString:(Ljava/lang/String;I)Ljava/lang/NumberFormatException;",
                "       277: athrow",
                "      LineNumberTable:",
                "        line 995: 0",
                "        line 996: 5",
                "        line 998: 17",
                "        line 1000: 25",
                "        line 1001: 30",
                "        line 1002: 40",
                "        line 1003: 47",
                "        line 1004: 67",
                "        line 1003: 73",
                "        line 1006: 80",
                "        line 1008: 100",
                "        line 1012: 113",
                "        line 1013: 129",
                "        line 1014: 148",
                "        line 1015: 153",
                "        line 1016: 177",
                "        line 1018: 192",
                "        line 1031: 203",
                "        line 1032: 213",
                "        line 1072: 235",
                "        line 1073: 255",
                "        line 1072: 261",
                "        line 1075: 268",
                "        line 1078: 271",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "          129     142     7 first   J",
                "          148     123     9 second   I",
                "          203      68    10 result   J",
                "          213      58    12 guard   I",
                "           40     231     6 firstChar   C",
                "            0     278     0     s   Ljava/lang/CharSequence;",
                "            0     278     1 beginIndex   I",
                "            0     278     2 endIndex   I",
                "            0     278     3 radix   I",
                "           20     258     4 start   I",
                "           25     253     5   len   I",
                "      StackMapTable: number_of_entries = 7",
                "        frame_type = 254 /* append */",
                "          offset_delta = 80",
                "          locals = [ int, int, int ]",
                "        frame_type = 19 /* same */",
                "        frame_type = 12 /* same */",
                "        frame_type = 253 /* append */",
                "          offset_delta = 78",
                "          locals = [ long, int ]",
                "        frame_type = 253 /* append */",
                "          offset_delta = 42",
                "          locals = [ long, int ]",
                "        frame_type = 32 /* same */",
                "        frame_type = 255 /* full_frame */",
                "          offset_delta = 2",
                "          locals = [ class java/lang/CharSequence, int, int, int, int, int ]",
                "          stack = []",
                "    Exceptions:",
                "      throws java.lang.NumberFormatException"
        );
    }

    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xad, name = "lreturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_21() {
        expectedConsecutiveLines = List.of(
                "  public static long parseUnsignedLong(java.lang.String) throws java.lang.NumberFormatException;",
                "    descriptor: (Ljava/lang/String;)J",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: bipush        10",
                "         3: invokestatic  #224                // Method parseUnsignedLong:(Ljava/lang/String;I)J",
                "         6: lreturn",
                "      LineNumberTable:",
                "        line 1099: 0",
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
    public void test_22() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.Long valueOf(java.lang.String, int) throws java.lang.NumberFormatException;",
                "    descriptor: (Ljava/lang/String;I)Ljava/lang/Long;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_0",
                "         1: iload_1",
                "         2: invokestatic  #198                // Method parseLong:(Ljava/lang/String;I)J",
                "         5: invokestatic  #227                // Method valueOf:(J)Ljava/lang/Long;",
                "         8: areturn",
                "      LineNumberTable:",
                "        line 1129: 0",
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
    public void test_23() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.Long valueOf(java.lang.String) throws java.lang.NumberFormatException;",
                "    descriptor: (Ljava/lang/String;)Ljava/lang/Long;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: bipush        10",
                "         3: invokestatic  #198                // Method parseLong:(Ljava/lang/String;I)J",
                "         6: invokestatic  #227                // Method valueOf:(J)Ljava/lang/Long;",
                "         9: areturn",
                "      LineNumberTable:",
                "        line 1156: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      10     0     s   Ljava/lang/String;",
                "    Exceptions:",
                "      throws java.lang.NumberFormatException"
        );
    }

    @Instruction(value = 0xffffffff, name = "ldc2_w")
    @Instruction(value = 0x11, name = "sipush")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x32, name = "aaload")
    @Instruction(value = 0x3d, name = "istore_2")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0x60, name = "iadd")
    @Instruction(value = 0x88, name = "l2i")
    @Instruction(value = 0x94, name = "lcmp")
    @Instruction(value = 0x9b, name = "iflt")
    @Instruction(value = 0x9d, name = "ifgt")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb2, name = "getstatic")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xbb, name = "new")
    @Test
    public void test_24() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.Long valueOf(long);",
                "    descriptor: (J)Ljava/lang/Long;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=3, args_size=1",
                "         0: sipush        128",
                "         3: istore_2",
                "         4: lload_0",
                "         5: ldc2_w        #230                // long -128l",
                "         8: lcmp",
                "         9: iflt          31",
                "        12: lload_0",
                "        13: ldc2_w        #232                // long 127l",
                "        16: lcmp",
                "        17: ifgt          31",
                "        20: getstatic     #234                // Field java/lang/Long$LongCache.cache:[Ljava/lang/Long;",
                "        23: lload_0",
                "        24: l2i",
                "        25: sipush        128",
                "        28: iadd",
                "        29: aaload",
                "        30: areturn",
                "        31: new           #1                  // class java/lang/Long",
                "        34: dup",
                "        35: lload_0",
                "        36: invokespecial #240                // Method \"<init>\":(J)V",
                "        39: areturn",
                "      LineNumberTable:",
                "        line 1200: 0",
                "        line 1201: 4",
                "        line 1202: 20",
                "        line 1204: 31",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      40     0     l   J",
                "            4      36     2 offset   I",
                "      StackMapTable: number_of_entries = 1",
                "        frame_type = 252 /* append */",
                "          offset_delta = 31",
                "          locals = [ int ]"
        );
    }

    @Instruction(value = 0xffffffff, name = "ldc_w")
    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x12, name = "ldc")
    @Instruction(value = 0x15, name = "iload")
    @Instruction(value = 0x16, name = "lload")
    @Instruction(value = 0x19, name = "aload")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0x1c, name = "iload_2")
    @Instruction(value = 0x1d, name = "iload_3")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x36, name = "istore")
    @Instruction(value = 0x37, name = "lstore")
    @Instruction(value = 0x3a, name = "astore")
    @Instruction(value = 0x3c, name = "istore_1")
    @Instruction(value = 0x3d, name = "istore_2")
    @Instruction(value = 0x3e, name = "istore_3")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0x60, name = "iadd")
    @Instruction(value = 0x75, name = "lneg")
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
    public void test_25() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.Long decode(java.lang.String) throws java.lang.NumberFormatException;",
                "    descriptor: (Ljava/lang/String;)Ljava/lang/Long;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=9, args_size=1",
                "         0: bipush        10",
                "         2: istore_1",
                "         3: iconst_0",
                "         4: istore_2",
                "         5: iconst_0",
                "         6: istore_3",
                "         7: aload_0",
                "         8: invokevirtual #243                // Method java/lang/String.isEmpty:()Z",
                "        11: ifeq          24",
                "        14: new           #142                // class java/lang/NumberFormatException",
                "        17: dup",
                "        18: ldc           #247                // String Zero length string",
                "        20: invokespecial #146                // Method java/lang/NumberFormatException.\"<init>\":(Ljava/lang/String;)V",
                "        23: athrow",
                "        24: aload_0",
                "        25: iconst_0",
                "        26: invokevirtual #164                // Method java/lang/String.charAt:(I)C",
                "        29: istore        6",
                "        31: iload         6",
                "        33: bipush        45",
                "        35: if_icmpne     46",
                "        38: iconst_1",
                "        39: istore_3",
                "        40: iinc          2, 1",
                "        43: goto          56",
                "        46: iload         6",
                "        48: bipush        43",
                "        50: if_icmpne     56",
                "        53: iinc          2, 1",
                "        56: aload_0",
                "        57: ldc           #249                // String 0x",
                "        59: iload_2",
                "        60: invokevirtual #251                // Method java/lang/String.startsWith:(Ljava/lang/String;I)Z",
                "        63: ifne          76",
                "        66: aload_0",
                "        67: ldc           #255                // String 0X",
                "        69: iload_2",
                "        70: invokevirtual #251                // Method java/lang/String.startsWith:(Ljava/lang/String;I)Z",
                "        73: ifeq          85",
                "        76: iinc          2, 2",
                "        79: bipush        16",
                "        81: istore_1",
                "        82: goto          132",
                "        85: aload_0",
                "        86: ldc_w         #257                // String #",
                "        89: iload_2",
                "        90: invokevirtual #251                // Method java/lang/String.startsWith:(Ljava/lang/String;I)Z",
                "        93: ifeq          105",
                "        96: iinc          2, 1",
                "        99: bipush        16",
                "       101: istore_1",
                "       102: goto          132",
                "       105: aload_0",
                "       106: ldc_w         #259                // String 0",
                "       109: iload_2",
                "       110: invokevirtual #251                // Method java/lang/String.startsWith:(Ljava/lang/String;I)Z",
                "       113: ifeq          132",
                "       116: aload_0",
                "       117: invokevirtual #158                // Method java/lang/String.length:()I",
                "       120: iconst_1",
                "       121: iload_2",
                "       122: iadd",
                "       123: if_icmple     132",
                "       126: iinc          2, 1",
                "       129: bipush        8",
                "       131: istore_1",
                "       132: aload_0",
                "       133: ldc_w         #261                // String -",
                "       136: iload_2",
                "       137: invokevirtual #251                // Method java/lang/String.startsWith:(Ljava/lang/String;I)Z",
                "       140: ifne          154",
                "       143: aload_0",
                "       144: ldc_w         #263                // String +",
                "       147: iload_2",
                "       148: invokevirtual #251                // Method java/lang/String.startsWith:(Ljava/lang/String;I)Z",
                "       151: ifeq          165",
                "       154: new           #142                // class java/lang/NumberFormatException",
                "       157: dup",
                "       158: ldc_w         #265                // String Sign character in wrong position",
                "       161: invokespecial #146                // Method java/lang/NumberFormatException.\"<init>\":(Ljava/lang/String;)V",
                "       164: athrow",
                "       165: aload_0",
                "       166: iload_2",
                "       167: aload_0",
                "       168: invokevirtual #158                // Method java/lang/String.length:()I",
                "       171: iload_1",
                "       172: invokestatic  #210                // Method parseLong:(Ljava/lang/CharSequence;III)J",
                "       175: lstore        4",
                "       177: iload_3",
                "       178: ifeq          187",
                "       181: lload         4",
                "       183: lneg",
                "       184: goto          189",
                "       187: lload         4",
                "       189: lstore        4",
                "       191: goto          242",
                "       194: astore        7",
                "       196: iload_3",
                "       197: ifeq          227",
                "       200: new           #55                 // class java/lang/StringBuilder",
                "       203: dup",
                "       204: invokespecial #57                 // Method java/lang/StringBuilder.\"<init>\":()V",
                "       207: ldc_w         #261                // String -",
                "       210: invokevirtual #61                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "       213: aload_0",
                "       214: iload_2",
                "       215: invokevirtual #267                // Method java/lang/String.substring:(I)Ljava/lang/String;",
                "       218: invokevirtual #61                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "       221: invokevirtual #68                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;",
                "       224: goto          232",
                "       227: aload_0",
                "       228: iload_2",
                "       229: invokevirtual #267                // Method java/lang/String.substring:(I)Ljava/lang/String;",
                "       232: astore        8",
                "       234: aload         8",
                "       236: iload_1",
                "       237: invokestatic  #198                // Method parseLong:(Ljava/lang/String;I)J",
                "       240: lstore        4",
                "       242: lload         4",
                "       244: invokestatic  #227                // Method valueOf:(J)Ljava/lang/Long;",
                "       247: areturn",
                "      Exception table:",
                "         from    to  target type",
                "           165   191   194   Class java/lang/NumberFormatException",
                "      LineNumberTable:",
                "        line 1251: 0",
                "        line 1252: 3",
                "        line 1253: 5",
                "        line 1256: 7",
                "        line 1257: 14",
                "        line 1258: 24",
                "        line 1260: 31",
                "        line 1261: 38",
                "        line 1262: 40",
                "        line 1263: 46",
                "        line 1264: 53",
                "        line 1267: 56",
                "        line 1268: 76",
                "        line 1269: 79",
                "        line 1271: 85",
                "        line 1272: 96",
                "        line 1273: 99",
                "        line 1275: 105",
                "        line 1276: 126",
                "        line 1277: 129",
                "        line 1280: 132",
                "        line 1281: 154",
                "        line 1284: 165",
                "        line 1285: 177",
                "        line 1293: 191",
                "        line 1286: 194",
                "        line 1290: 196",
                "        line 1291: 227",
                "        line 1292: 234",
                "        line 1294: 242",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "          177      17     4 result   J",
                "          234       8     8 constant   Ljava/lang/String;",
                "          196      46     7     e   Ljava/lang/NumberFormatException;",
                "            0     248     0    nm   Ljava/lang/String;",
                "            3     245     1 radix   I",
                "            5     243     2 index   I",
                "            7     241     3 negative   Z",
                "          242       6     4 result   J",
                "           31     217     6 firstChar   C",
                "      StackMapTable: number_of_entries = 15",
                "        frame_type = 254 /* append */",
                "          offset_delta = 24",
                "          locals = [ int, int, int ]",
                "        frame_type = 254 /* append */",
                "          offset_delta = 21",
                "          locals = [ top, top, int ]",
                "        frame_type = 9 /* same */",
                "        frame_type = 19 /* same */",
                "        frame_type = 8 /* same */",
                "        frame_type = 19 /* same */",
                "        frame_type = 26 /* same */",
                "        frame_type = 21 /* same */",
                "        frame_type = 10 /* same */",
                "        frame_type = 255 /* full_frame */",
                "          offset_delta = 21",
                "          locals = [ class java/lang/String, int, int, int, long, int ]",
                "          stack = []",
                "        frame_type = 65 /* same_locals_1_stack_item */",
                "          stack = [ long ]",
                "        frame_type = 255 /* full_frame */",
                "          offset_delta = 4",
                "          locals = [ class java/lang/String, int, int, int, top, top, int ]",
                "          stack = [ class java/lang/NumberFormatException ]",
                "        frame_type = 252 /* append */",
                "          offset_delta = 32",
                "          locals = [ class java/lang/NumberFormatException ]",
                "        frame_type = 68 /* same_locals_1_stack_item */",
                "          stack = [ class java/lang/String ]",
                "        frame_type = 255 /* full_frame */",
                "          offset_delta = 9",
                "          locals = [ class java/lang/String, int, int, int, long, int ]",
                "          stack = []",
                "    Exceptions:",
                "      throws java.lang.NumberFormatException"
        );
    }

    @Instruction(value = 0x1f, name = "lload_1")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xb1, name = "return")
    @Instruction(value = 0xb5, name = "putfield")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Test
    public void test_26() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Long(long);",
                "    descriptor: (J)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=3, args_size=2",
                "         0: aload_0",
                "         1: invokespecial #270                // Method java/lang/Number.\"<init>\":()V",
                "         4: aload_0",
                "         5: lload_1",
                "         6: putfield      #273                // Field value:J",
                "         9: return",
                "      LineNumberTable:",
                "        line 1317: 0",
                "        line 1318: 4",
                "        line 1319: 9",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      10     0  this   Ljava/lang/Long;",
                "            0      10     1 value   J"
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
    public void test_27() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Long(java.lang.String) throws java.lang.NumberFormatException;",
                "    descriptor: (Ljava/lang/String;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=2, args_size=2",
                "         0: aload_0",
                "         1: invokespecial #270                // Method java/lang/Number.\"<init>\":()V",
                "         4: aload_0",
                "         5: aload_1",
                "         6: bipush        10",
                "         8: invokestatic  #198                // Method parseLong:(Ljava/lang/String;I)J",
                "        11: putfield      #273                // Field value:J",
                "        14: return",
                "      LineNumberTable:",
                "        line 1340: 0",
                "        line 1341: 4",
                "        line 1342: 14",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      15     0  this   Ljava/lang/Long;",
                "            0      15     1     s   Ljava/lang/String;",
                "    Exceptions:",
                "      throws java.lang.NumberFormatException"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x88, name = "l2i")
    @Instruction(value = 0x91, name = "i2b")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Test
    public void test_28() {
        expectedConsecutiveLines = List.of(
                "  public byte byteValue();",
                "    descriptor: ()B",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #273                // Field value:J",
                "         4: l2i",
                "         5: i2b",
                "         6: ireturn",
                "      LineNumberTable:",
                "        line 1350: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       7     0  this   Ljava/lang/Long;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x88, name = "l2i")
    @Instruction(value = 0x93, name = "i2s")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Test
    public void test_29() {
        expectedConsecutiveLines = List.of(
                "  public short shortValue();",
                "    descriptor: ()S",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #273                // Field value:J",
                "         4: l2i",
                "         5: i2s",
                "         6: ireturn",
                "      LineNumberTable:",
                "        line 1359: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       7     0  this   Ljava/lang/Long;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x88, name = "l2i")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Test
    public void test_30() {
        expectedConsecutiveLines = List.of(
                "  public int intValue();",
                "    descriptor: ()I",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #273                // Field value:J",
                "         4: l2i",
                "         5: ireturn",
                "      LineNumberTable:",
                "        line 1368: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0  this   Ljava/lang/Long;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xad, name = "lreturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Test
    public void test_31() {
        expectedConsecutiveLines = List.of(
                "  public long longValue();",
                "    descriptor: ()J",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #273                // Field value:J",
                "         4: lreturn",
                "      LineNumberTable:",
                "        line 1377: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       5     0  this   Ljava/lang/Long;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x89, name = "l2f")
    @Instruction(value = 0xae, name = "freturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Test
    public void test_32() {
        expectedConsecutiveLines = List.of(
                "  public float floatValue();",
                "    descriptor: ()F",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #273                // Field value:J",
                "         4: l2f",
                "         5: freturn",
                "      LineNumberTable:",
                "        line 1386: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0  this   Ljava/lang/Long;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x8a, name = "l2d")
    @Instruction(value = 0xaf, name = "dreturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Test
    public void test_33() {
        expectedConsecutiveLines = List.of(
                "  public double doubleValue();",
                "    descriptor: ()D",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #273                // Field value:J",
                "         4: l2d",
                "         5: dreturn",
                "      LineNumberTable:",
                "        line 1395: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0  this   Ljava/lang/Long;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_34() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.String toString();",
                "    descriptor: ()Ljava/lang/String;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #273                // Field value:J",
                "         4: invokestatic  #9                  // Method toString:(J)Ljava/lang/String;",
                "         7: areturn",
                "      LineNumberTable:",
                "        line 1409: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       8     0  this   Ljava/lang/Long;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_35() {
        expectedConsecutiveLines = List.of(
                "  public int hashCode();",
                "    descriptor: ()I",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #273                // Field value:J",
                "         4: invokestatic  #277                // Method hashCode:(J)I",
                "         7: ireturn",
                "      LineNumberTable:",
                "        line 1426: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       8     0  this   Ljava/lang/Long;"
        );
    }

    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x7d, name = "lushr")
    @Instruction(value = 0x83, name = "lxor")
    @Instruction(value = 0x88, name = "l2i")
    @Instruction(value = 0xac, name = "ireturn")
    @Test
    public void test_36() {
        expectedConsecutiveLines = List.of(
                "  public static int hashCode(long);",
                "    descriptor: (J)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=5, locals=2, args_size=1",
                "         0: lload_0",
                "         1: lload_0",
                "         2: bipush        32",
                "         4: lushr",
                "         5: lxor",
                "         6: l2i",
                "         7: ireturn",
                "      LineNumberTable:",
                "        line 1438: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       8     0 value   J"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x94, name = "lcmp")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0x9a, name = "ifne")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xc0, name = "checkcast")
    @Instruction(value = 0xc1, name = "instanceof")
    @Test
    public void test_37() {
        expectedConsecutiveLines = List.of(
                "  public boolean equals(java.lang.Object);",
                "    descriptor: (Ljava/lang/Object;)Z",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=4, locals=2, args_size=2",
                "         0: aload_1",
                "         1: instanceof    #1                  // class java/lang/Long",
                "         4: ifeq          28",
                "         7: aload_0",
                "         8: getfield      #273                // Field value:J",
                "        11: aload_1",
                "        12: checkcast     #1                  // class java/lang/Long",
                "        15: invokevirtual #280                // Method longValue:()J",
                "        18: lcmp",
                "        19: ifne          26",
                "        22: iconst_1",
                "        23: goto          27",
                "        26: iconst_0",
                "        27: ireturn",
                "        28: iconst_0",
                "        29: ireturn",
                "      LineNumberTable:",
                "        line 1452: 0",
                "        line 1453: 7",
                "        line 1455: 28",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      30     0  this   Ljava/lang/Long;",
                "            0      30     1   obj   Ljava/lang/Object;",
                "      StackMapTable: number_of_entries = 3",
                "        frame_type = 26 /* same */",
                "        frame_type = 64 /* same_locals_1_stack_item */",
                "          stack = [ int ]",
                "        frame_type = 0 /* same */"
        );
    }

    @Instruction(value = 0x01, name = "aconst_null")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_38() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.Long getLong(java.lang.String);",
                "    descriptor: (Ljava/lang/String;)Ljava/lang/Long;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: aconst_null",
                "         2: invokestatic  #284                // Method getLong:(Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Long;",
                "         5: areturn",
                "      LineNumberTable:",
                "        line 1489: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0    nm   Ljava/lang/String;"
        );
    }

    @Instruction(value = 0x01, name = "aconst_null")
    @Instruction(value = 0x1f, name = "lload_1")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x4e, name = "astore_3")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xc7, name = "ifnonnull")
    @Test
    public void test_39() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.Long getLong(java.lang.String, long);",
                "    descriptor: (Ljava/lang/String;J)Ljava/lang/Long;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=4, args_size=2",
                "         0: aload_0",
                "         1: aconst_null",
                "         2: invokestatic  #284                // Method getLong:(Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Long;",
                "         5: astore_3",
                "         6: aload_3",
                "         7: ifnonnull     17",
                "        10: lload_1",
                "        11: invokestatic  #227                // Method valueOf:(J)Ljava/lang/Long;",
                "        14: goto          18",
                "        17: aload_3",
                "        18: areturn",
                "      LineNumberTable:",
                "        line 1534: 0",
                "        line 1535: 6",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      19     0    nm   Ljava/lang/String;",
                "            0      19     1   val   J",
                "            6      13     3 result   Ljava/lang/Long;",
                "      StackMapTable: number_of_entries = 2",
                "        frame_type = 252 /* append */",
                "          offset_delta = 17",
                "          locals = [ class java/lang/Long ]",
                "        frame_type = 64 /* same_locals_1_stack_item */",
                "          stack = [ class java/lang/Long ]"
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
    public void test_40() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.Long getLong(java.lang.String, java.lang.Long);",
                "    descriptor: (Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Long;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=1, locals=4, args_size=2",
                "         0: aconst_null",
                "         1: astore_2",
                "         2: aload_0",
                "         3: invokestatic  #288                // Method java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;",
                "         6: astore_2",
                "         7: goto          11",
                "        10: astore_3",
                "        11: aload_2",
                "        12: ifnull        21",
                "        15: aload_2",
                "        16: invokestatic  #298                // Method decode:(Ljava/lang/String;)Ljava/lang/Long;",
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
                "        line 1583: 0",
                "        line 1585: 2",
                "        line 1587: 7",
                "        line 1586: 10",
                "        line 1588: 11",
                "        line 1590: 15",
                "        line 1591: 20",
                "        line 1594: 21",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      23     0    nm   Ljava/lang/String;",
                "            0      23     1   val   Ljava/lang/Long;",
                "            2      21     2     v   Ljava/lang/String;",
                "      StackMapTable: number_of_entries = 4",
                "        frame_type = 255 /* full_frame */",
                "          offset_delta = 10",
                "          locals = [ class java/lang/String, class java/lang/Long, class java/lang/String ]",
                "          stack = [ class java/lang/RuntimeException ]",
                "        frame_type = 0 /* same */",
                "        frame_type = 72 /* same_locals_1_stack_item */",
                "          stack = [ class java/lang/NumberFormatException ]",
                "        frame_type = 0 /* same */"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_41() {
        expectedConsecutiveLines = List.of(
                "  public int compareTo(java.lang.Long);",
                "    descriptor: (Ljava/lang/Long;)I",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=4, locals=2, args_size=2",
                "         0: aload_0",
                "         1: getfield      #273                // Field value:J",
                "         4: aload_1",
                "         5: getfield      #273                // Field value:J",
                "         8: invokestatic  #302                // Method compare:(JJ)I",
                "        11: ireturn",
                "      LineNumberTable:",
                "        line 1611: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      12     0  this   Ljava/lang/Long;",
                "            0      12     1 anotherLong   Ljava/lang/Long;"
        );
    }

    @Instruction(value = 0x02, name = "iconst_m1")
    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x20, name = "lload_2")
    @Instruction(value = 0x94, name = "lcmp")
    @Instruction(value = 0x9a, name = "ifne")
    @Instruction(value = 0x9c, name = "ifge")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xac, name = "ireturn")
    @Test
    public void test_42() {
        expectedConsecutiveLines = List.of(
                "  public static int compare(long, long);",
                "    descriptor: (JJ)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=4, args_size=2",
                "         0: lload_0",
                "         1: lload_2",
                "         2: lcmp",
                "         3: ifge          10",
                "         6: iconst_m1",
                "         7: goto          21",
                "        10: lload_0",
                "        11: lload_2",
                "        12: lcmp",
                "        13: ifne          20",
                "        16: iconst_0",
                "        17: goto          21",
                "        20: iconst_1",
                "        21: ireturn",
                "      LineNumberTable:",
                "        line 1629: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      22     0     x   J",
                "            0      22     2     y   J",
                "      StackMapTable: number_of_entries = 3",
                "        frame_type = 10 /* same */",
                "        frame_type = 9 /* same */",
                "        frame_type = 64 /* same_locals_1_stack_item */",
                "          stack = [ int ]"
        );
    }

    @Instruction(value = 0xffffffff, name = "ldc2_w")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x20, name = "lload_2")
    @Instruction(value = 0x61, name = "ladd")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_43() {
        expectedConsecutiveLines = List.of(
                "  public static int compareUnsigned(long, long);",
                "    descriptor: (JJ)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=6, locals=4, args_size=2",
                "         0: lload_0",
                "         1: ldc2_w        #168                // long -9223372036854775808l",
                "         4: ladd",
                "         5: lload_2",
                "         6: ldc2_w        #168                // long -9223372036854775808l",
                "         9: ladd",
                "        10: invokestatic  #302                // Method compare:(JJ)I",
                "        13: ireturn",
                "      LineNumberTable:",
                "        line 1646: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      14     0     x   J",
                "            0      14     2     y   J"
        );
    }

    @Instruction(value = 0xffffffff, name = "ldc2_w")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x09, name = "lconst_0")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x16, name = "lload")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x20, name = "lload_2")
    @Instruction(value = 0x37, name = "lstore")
    @Instruction(value = 0x61, name = "ladd")
    @Instruction(value = 0x65, name = "lsub")
    @Instruction(value = 0x69, name = "lmul")
    @Instruction(value = 0x6d, name = "ldiv")
    @Instruction(value = 0x79, name = "lshl")
    @Instruction(value = 0x7d, name = "lushr")
    @Instruction(value = 0x7f, name = "land")
    @Instruction(value = 0x81, name = "lor")
    @Instruction(value = 0x83, name = "lxor")
    @Instruction(value = 0x94, name = "lcmp")
    @Instruction(value = 0x9b, name = "iflt")
    @Instruction(value = 0xad, name = "lreturn")
    @Test
    public void test_44() {
        expectedConsecutiveLines = List.of(
                "  public static long divideUnsigned(long, long);",
                "    descriptor: (JJ)J",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=8, locals=8, args_size=2",
                "         0: lload_2",
                "         1: lconst_0",
                "         2: lcmp",
                "         3: iflt          41",
                "         6: lload_0",
                "         7: iconst_1",
                "         8: lushr",
                "         9: lload_2",
                "        10: ldiv",
                "        11: iconst_1",
                "        12: lshl",
                "        13: lstore        4",
                "        15: lload_0",
                "        16: lload         4",
                "        18: lload_2",
                "        19: lmul",
                "        20: lsub",
                "        21: lstore        6",
                "        23: lload         4",
                "        25: lload         6",
                "        27: lload         6",
                "        29: lload_2",
                "        30: lsub",
                "        31: ldc2_w        #306                // long -1l",
                "        34: lxor",
                "        35: lor",
                "        36: bipush        63",
                "        38: lushr",
                "        39: ladd",
                "        40: lreturn",
                "        41: lload_0",
                "        42: lload_0",
                "        43: lload_2",
                "        44: lsub",
                "        45: ldc2_w        #306                // long -1l",
                "        48: lxor",
                "        49: land",
                "        50: bipush        63",
                "        52: lushr",
                "        53: lreturn",
                "      LineNumberTable:",
                "        line 1671: 0",
                "        line 1672: 6",
                "        line 1673: 15",
                "        line 1674: 23",
                "        line 1676: 41",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "           15      26     4     q   J",
                "           23      18     6     r   J",
                "            0      54     0 dividend   J",
                "            0      54     2 divisor   J",
                "      StackMapTable: number_of_entries = 1",
                "        frame_type = 41 /* same */"
        );
    }

    @Instruction(value = 0xffffffff, name = "ldc2_w")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x09, name = "lconst_0")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x16, name = "lload")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x20, name = "lload_2")
    @Instruction(value = 0x37, name = "lstore")
    @Instruction(value = 0x65, name = "lsub")
    @Instruction(value = 0x69, name = "lmul")
    @Instruction(value = 0x6d, name = "ldiv")
    @Instruction(value = 0x79, name = "lshl")
    @Instruction(value = 0x7b, name = "lshr")
    @Instruction(value = 0x7d, name = "lushr")
    @Instruction(value = 0x7f, name = "land")
    @Instruction(value = 0x83, name = "lxor")
    @Instruction(value = 0x94, name = "lcmp")
    @Instruction(value = 0x9b, name = "iflt")
    @Instruction(value = 0xad, name = "lreturn")
    @Test
    public void test_45() {
        expectedConsecutiveLines = List.of(
                "  public static long remainderUnsigned(long, long);",
                "    descriptor: (JJ)J",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=8, locals=8, args_size=2",
                "         0: lload_2",
                "         1: lconst_0",
                "         2: lcmp",
                "         3: iflt          40",
                "         6: lload_0",
                "         7: iconst_1",
                "         8: lushr",
                "         9: lload_2",
                "        10: ldiv",
                "        11: iconst_1",
                "        12: lshl",
                "        13: lstore        4",
                "        15: lload_0",
                "        16: lload         4",
                "        18: lload_2",
                "        19: lmul",
                "        20: lsub",
                "        21: lstore        6",
                "        23: lload         6",
                "        25: lload         6",
                "        27: lload_2",
                "        28: lsub",
                "        29: ldc2_w        #306                // long -1l",
                "        32: lxor",
                "        33: bipush        63",
                "        35: lshr",
                "        36: lload_2",
                "        37: land",
                "        38: lsub",
                "        39: lreturn",
                "        40: lload_0",
                "        41: lload_0",
                "        42: lload_0",
                "        43: lload_2",
                "        44: lsub",
                "        45: ldc2_w        #306                // long -1l",
                "        48: lxor",
                "        49: land",
                "        50: bipush        63",
                "        52: lshr",
                "        53: lload_2",
                "        54: land",
                "        55: lsub",
                "        56: lreturn",
                "      LineNumberTable:",
                "        line 1694: 0",
                "        line 1695: 6",
                "        line 1696: 15",
                "        line 1708: 23",
                "        line 1719: 40",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "           15      25     4     q   J",
                "           23      17     6     r   J",
                "            0      57     0 dividend   J",
                "            0      57     2 divisor   J",
                "      StackMapTable: number_of_entries = 1",
                "        frame_type = 40 /* same */"
        );
    }

    @Instruction(value = 0xffffffff, name = "ldc2_w")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x7d, name = "lushr")
    @Instruction(value = 0x7f, name = "land")
    @Instruction(value = 0xad, name = "lreturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_46() {
        expectedConsecutiveLines = List.of(
                "  public static long highestOneBit(long);",
                "    descriptor: (J)J",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=6, locals=2, args_size=1",
                "         0: lload_0",
                "         1: ldc2_w        #168                // long -9223372036854775808l",
                "         4: lload_0",
                "         5: invokestatic  #98                 // Method numberOfLeadingZeros:(J)I",
                "         8: lushr",
                "         9: land",
                "        10: lreturn",
                "      LineNumberTable:",
                "        line 1754: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      11     0     i   J"
        );
    }

    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x75, name = "lneg")
    @Instruction(value = 0x7f, name = "land")
    @Instruction(value = 0xad, name = "lreturn")
    @Test
    public void test_47() {
        expectedConsecutiveLines = List.of(
                "  public static long lowestOneBit(long);",
                "    descriptor: (J)J",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=2, args_size=1",
                "         0: lload_0",
                "         1: lload_0",
                "         2: lneg",
                "         3: land",
                "         4: lreturn",
                "      LineNumberTable:",
                "        line 1772: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       5     0     i   J"
        );
    }

    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x1c, name = "iload_2")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x3d, name = "istore_2")
    @Instruction(value = 0x60, name = "iadd")
    @Instruction(value = 0x7d, name = "lushr")
    @Instruction(value = 0x88, name = "l2i")
    @Instruction(value = 0x9a, name = "ifne")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_48() {
        expectedConsecutiveLines = List.of(
                "  public static int numberOfLeadingZeros(long);",
                "    descriptor: (J)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=3, locals=3, args_size=1",
                "         0: lload_0",
                "         1: bipush        32",
                "         3: lushr",
                "         4: l2i",
                "         5: istore_2",
                "         6: iload_2",
                "         7: ifne          21",
                "        10: bipush        32",
                "        12: lload_0",
                "        13: l2i",
                "        14: invokestatic  #308                // Method java/lang/Integer.numberOfLeadingZeros:(I)I",
                "        17: iadd",
                "        18: goto          25",
                "        21: iload_2",
                "        22: invokestatic  #308                // Method java/lang/Integer.numberOfLeadingZeros:(I)I",
                "        25: ireturn",
                "      LineNumberTable:",
                "        line 1798: 0",
                "        line 1799: 6",
                "        line 1800: 21",
                "        line 1799: 25",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      26     0     i   J",
                "            6      20     2     x   I",
                "      StackMapTable: number_of_entries = 2",
                "        frame_type = 252 /* append */",
                "          offset_delta = 21",
                "          locals = [ int ]",
                "        frame_type = 67 /* same_locals_1_stack_item */",
                "          stack = [ int ]"
        );
    }

    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x1c, name = "iload_2")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x3d, name = "istore_2")
    @Instruction(value = 0x60, name = "iadd")
    @Instruction(value = 0x7d, name = "lushr")
    @Instruction(value = 0x88, name = "l2i")
    @Instruction(value = 0x9a, name = "ifne")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_49() {
        expectedConsecutiveLines = List.of(
                "  public static int numberOfTrailingZeros(long);",
                "    descriptor: (J)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=3, args_size=1",
                "         0: lload_0",
                "         1: l2i",
                "         2: istore_2",
                "         3: iload_2",
                "         4: ifne          21",
                "         7: bipush        32",
                "         9: lload_0",
                "        10: bipush        32",
                "        12: lushr",
                "        13: l2i",
                "        14: invokestatic  #311                // Method java/lang/Integer.numberOfTrailingZeros:(I)I",
                "        17: iadd",
                "        18: goto          25",
                "        21: iload_2",
                "        22: invokestatic  #311                // Method java/lang/Integer.numberOfTrailingZeros:(I)I",
                "        25: ireturn",
                "      LineNumberTable:",
                "        line 1819: 0",
                "        line 1820: 3",
                "        line 1821: 21",
                "        line 1820: 25",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      26     0     i   J",
                "            3      23     2     x   I",
                "      StackMapTable: number_of_entries = 2",
                "        frame_type = 252 /* append */",
                "          offset_delta = 21",
                "          locals = [ int ]",
                "        frame_type = 67 /* same_locals_1_stack_item */",
                "          stack = [ int ]"
        );
    }

    @Instruction(value = 0xffffffff, name = "ldc2_w")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x05, name = "iconst_2")
    @Instruction(value = 0x07, name = "iconst_4")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x3f, name = "lstore_0")
    @Instruction(value = 0x61, name = "ladd")
    @Instruction(value = 0x65, name = "lsub")
    @Instruction(value = 0x7d, name = "lushr")
    @Instruction(value = 0x7e, name = "iand")
    @Instruction(value = 0x7f, name = "land")
    @Instruction(value = 0x88, name = "l2i")
    @Instruction(value = 0xac, name = "ireturn")
    @Test
    public void test_50() {
        expectedConsecutiveLines = List.of(
                "  public static int bitCount(long);",
                "    descriptor: (J)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=6, locals=2, args_size=1",
                "         0: lload_0",
                "         1: lload_0",
                "         2: iconst_1",
                "         3: lushr",
                "         4: ldc2_w        #314                // long 6148914691236517205l",
                "         7: land",
                "         8: lsub",
                "         9: lstore_0",
                "        10: lload_0",
                "        11: ldc2_w        #316                // long 3689348814741910323l",
                "        14: land",
                "        15: lload_0",
                "        16: iconst_2",
                "        17: lushr",
                "        18: ldc2_w        #316                // long 3689348814741910323l",
                "        21: land",
                "        22: ladd",
                "        23: lstore_0",
                "        24: lload_0",
                "        25: lload_0",
                "        26: iconst_4",
                "        27: lushr",
                "        28: ladd",
                "        29: ldc2_w        #318                // long 1085102592571150095l",
                "        32: land",
                "        33: lstore_0",
                "        34: lload_0",
                "        35: lload_0",
                "        36: bipush        8",
                "        38: lushr",
                "        39: ladd",
                "        40: lstore_0",
                "        41: lload_0",
                "        42: lload_0",
                "        43: bipush        16",
                "        45: lushr",
                "        46: ladd",
                "        47: lstore_0",
                "        48: lload_0",
                "        49: lload_0",
                "        50: bipush        32",
                "        52: lushr",
                "        53: ladd",
                "        54: lstore_0",
                "        55: lload_0",
                "        56: l2i",
                "        57: bipush        127",
                "        59: iand",
                "        60: ireturn",
                "      LineNumberTable:",
                "        line 1837: 0",
                "        line 1838: 10",
                "        line 1839: 24",
                "        line 1840: 34",
                "        line 1841: 41",
                "        line 1842: 48",
                "        line 1843: 55",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      61     0     i   J"
        );
    }

    @Instruction(value = 0x1c, name = "iload_2")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x74, name = "ineg")
    @Instruction(value = 0x79, name = "lshl")
    @Instruction(value = 0x7d, name = "lushr")
    @Instruction(value = 0x81, name = "lor")
    @Instruction(value = 0xad, name = "lreturn")
    @Test
    public void test_51() {
        expectedConsecutiveLines = List.of(
                "  public static long rotateLeft(long, int);",
                "    descriptor: (JI)J",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=5, locals=3, args_size=2",
                "         0: lload_0",
                "         1: iload_2",
                "         2: lshl",
                "         3: lload_0",
                "         4: iload_2",
                "         5: ineg",
                "         6: lushr",
                "         7: lor",
                "         8: lreturn",
                "      LineNumberTable:",
                "        line 1867: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       9     0     i   J",
                "            0       9     2 distance   I"
        );
    }

    @Instruction(value = 0x1c, name = "iload_2")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x74, name = "ineg")
    @Instruction(value = 0x79, name = "lshl")
    @Instruction(value = 0x7d, name = "lushr")
    @Instruction(value = 0x81, name = "lor")
    @Instruction(value = 0xad, name = "lreturn")
    @Test
    public void test_52() {
        expectedConsecutiveLines = List.of(
                "  public static long rotateRight(long, int);",
                "    descriptor: (JI)J",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=5, locals=3, args_size=2",
                "         0: lload_0",
                "         1: iload_2",
                "         2: lushr",
                "         3: lload_0",
                "         4: iload_2",
                "         5: ineg",
                "         6: lshl",
                "         7: lor",
                "         8: lreturn",
                "      LineNumberTable:",
                "        line 1891: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       9     0     i   J",
                "            0       9     2 distance   I"
        );
    }

    @Instruction(value = 0xffffffff, name = "ldc2_w")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x05, name = "iconst_2")
    @Instruction(value = 0x07, name = "iconst_4")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x3f, name = "lstore_0")
    @Instruction(value = 0x79, name = "lshl")
    @Instruction(value = 0x7d, name = "lushr")
    @Instruction(value = 0x7f, name = "land")
    @Instruction(value = 0x81, name = "lor")
    @Instruction(value = 0xad, name = "lreturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_53() {
        expectedConsecutiveLines = List.of(
                "  public static long reverse(long);",
                "    descriptor: (J)J",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=6, locals=2, args_size=1",
                "         0: lload_0",
                "         1: ldc2_w        #314                // long 6148914691236517205l",
                "         4: land",
                "         5: iconst_1",
                "         6: lshl",
                "         7: lload_0",
                "         8: iconst_1",
                "         9: lushr",
                "        10: ldc2_w        #314                // long 6148914691236517205l",
                "        13: land",
                "        14: lor",
                "        15: lstore_0",
                "        16: lload_0",
                "        17: ldc2_w        #316                // long 3689348814741910323l",
                "        20: land",
                "        21: iconst_2",
                "        22: lshl",
                "        23: lload_0",
                "        24: iconst_2",
                "        25: lushr",
                "        26: ldc2_w        #316                // long 3689348814741910323l",
                "        29: land",
                "        30: lor",
                "        31: lstore_0",
                "        32: lload_0",
                "        33: ldc2_w        #318                // long 1085102592571150095l",
                "        36: land",
                "        37: iconst_4",
                "        38: lshl",
                "        39: lload_0",
                "        40: iconst_4",
                "        41: lushr",
                "        42: ldc2_w        #318                // long 1085102592571150095l",
                "        45: land",
                "        46: lor",
                "        47: lstore_0",
                "        48: lload_0",
                "        49: invokestatic  #320                // Method reverseBytes:(J)J",
                "        52: lreturn",
                "      LineNumberTable:",
                "        line 1907: 0",
                "        line 1908: 16",
                "        line 1909: 32",
                "        line 1911: 48",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      53     0     i   J"
        );
    }

    @Instruction(value = 0xffffffff, name = "ldc2_w")
    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x15, name = "iload")
    @Instruction(value = 0x16, name = "lload")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x20, name = "lload_2")
    @Instruction(value = 0x36, name = "istore")
    @Instruction(value = 0x37, name = "lstore")
    @Instruction(value = 0x3f, name = "lstore_0")
    @Instruction(value = 0x41, name = "lstore_2")
    @Instruction(value = 0x78, name = "ishl")
    @Instruction(value = 0x79, name = "lshl")
    @Instruction(value = 0x7d, name = "lushr")
    @Instruction(value = 0x7f, name = "land")
    @Instruction(value = 0x81, name = "lor")
    @Instruction(value = 0x83, name = "lxor")
    @Instruction(value = 0x84, name = "iinc")
    @Instruction(value = 0xa2, name = "if_icmpge")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xad, name = "lreturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_54() {
        expectedConsecutiveLines = List.of(
                "  public static long compress(long, long);",
                "    descriptor: (JJ)J",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=6, locals=13, args_size=2",
                "         0: lload_0",
                "         1: lload_2",
                "         2: land",
                "         3: lstore_0",
                "         4: lload_2",
                "         5: ldc2_w        #306                // long -1l",
                "         8: lxor",
                "         9: iconst_1",
                "        10: lshl",
                "        11: lstore        4",
                "        13: iconst_0",
                "        14: istore        6",
                "        16: iload         6",
                "        18: bipush        6",
                "        20: if_icmpge     85",
                "        23: lload         4",
                "        25: invokestatic  #324                // Method parallelSuffix:(J)J",
                "        28: lstore        7",
                "        30: lload         7",
                "        32: lload_2",
                "        33: land",
                "        34: lstore        9",
                "        36: lload_2",
                "        37: lload         9",
                "        39: lxor",
                "        40: lload         9",
                "        42: iconst_1",
                "        43: iload         6",
                "        45: ishl",
                "        46: lushr",
                "        47: lor",
                "        48: lstore_2",
                "        49: lload_0",
                "        50: lload         9",
                "        52: land",
                "        53: lstore        11",
                "        55: lload_0",
                "        56: lload         11",
                "        58: lxor",
                "        59: lload         11",
                "        61: iconst_1",
                "        62: iload         6",
                "        64: ishl",
                "        65: lushr",
                "        66: lor",
                "        67: lstore_0",
                "        68: lload         4",
                "        70: lload         7",
                "        72: ldc2_w        #306                // long -1l",
                "        75: lxor",
                "        76: land",
                "        77: lstore        4",
                "        79: iinc          6, 1",
                "        82: goto          16",
                "        85: lload_0",
                "        86: lreturn",
                "      LineNumberTable:",
                "        line 1987: 0",
                "        line 1988: 4",
                "        line 1990: 13",
                "        line 1993: 23",
                "        line 1995: 30",
                "        line 1997: 36",
                "        line 1999: 49",
                "        line 2001: 55",
                "        line 2003: 68",
                "        line 1990: 79",
                "        line 2005: 85",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "           30      49     7 maskPrefix   J",
                "           36      43     9 maskMove   J",
                "           55      24    11     t   J",
                "           16      69     6     j   I",
                "            0      87     0     i   J",
                "            0      87     2  mask   J",
                "           13      74     4 maskCount   J",
                "      StackMapTable: number_of_entries = 2",
                "        frame_type = 253 /* append */",
                "          offset_delta = 16",
                "          locals = [ long, int ]",
                "        frame_type = 250 /* chop */",
                "          offset_delta = 68"
        );
    }

    @Instruction(value = 0xffffffff, name = "ldc2_w")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x05, name = "iconst_2")
    @Instruction(value = 0x07, name = "iconst_4")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x16, name = "lload")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x20, name = "lload_2")
    @Instruction(value = 0x37, name = "lstore")
    @Instruction(value = 0x3f, name = "lstore_0")
    @Instruction(value = 0x41, name = "lstore_2")
    @Instruction(value = 0x79, name = "lshl")
    @Instruction(value = 0x7d, name = "lushr")
    @Instruction(value = 0x7f, name = "land")
    @Instruction(value = 0x81, name = "lor")
    @Instruction(value = 0x83, name = "lxor")
    @Instruction(value = 0xad, name = "lreturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_55() {
        expectedConsecutiveLines = List.of(
                "  public static long expand(long, long);",
                "    descriptor: (JJ)J",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=6, locals=24, args_size=2",
                "         0: lload_2",
                "         1: lstore        4",
                "         3: lload_2",
                "         4: ldc2_w        #306                // long -1l",
                "         7: lxor",
                "         8: iconst_1",
                "         9: lshl",
                "        10: lstore        6",
                "        12: lload         6",
                "        14: invokestatic  #324                // Method parallelSuffix:(J)J",
                "        17: lstore        8",
                "        19: lload         8",
                "        21: lload_2",
                "        22: land",
                "        23: lstore        10",
                "        25: lload_2",
                "        26: lload         10",
                "        28: lxor",
                "        29: lload         10",
                "        31: iconst_1",
                "        32: lushr",
                "        33: lor",
                "        34: lstore_2",
                "        35: lload         6",
                "        37: lload         8",
                "        39: ldc2_w        #306                // long -1l",
                "        42: lxor",
                "        43: land",
                "        44: lstore        6",
                "        46: lload         6",
                "        48: invokestatic  #324                // Method parallelSuffix:(J)J",
                "        51: lstore        8",
                "        53: lload         8",
                "        55: lload_2",
                "        56: land",
                "        57: lstore        12",
                "        59: lload_2",
                "        60: lload         12",
                "        62: lxor",
                "        63: lload         12",
                "        65: iconst_2",
                "        66: lushr",
                "        67: lor",
                "        68: lstore_2",
                "        69: lload         6",
                "        71: lload         8",
                "        73: ldc2_w        #306                // long -1l",
                "        76: lxor",
                "        77: land",
                "        78: lstore        6",
                "        80: lload         6",
                "        82: invokestatic  #324                // Method parallelSuffix:(J)J",
                "        85: lstore        8",
                "        87: lload         8",
                "        89: lload_2",
                "        90: land",
                "        91: lstore        14",
                "        93: lload_2",
                "        94: lload         14",
                "        96: lxor",
                "        97: lload         14",
                "        99: iconst_4",
                "       100: lushr",
                "       101: lor",
                "       102: lstore_2",
                "       103: lload         6",
                "       105: lload         8",
                "       107: ldc2_w        #306                // long -1l",
                "       110: lxor",
                "       111: land",
                "       112: lstore        6",
                "       114: lload         6",
                "       116: invokestatic  #324                // Method parallelSuffix:(J)J",
                "       119: lstore        8",
                "       121: lload         8",
                "       123: lload_2",
                "       124: land",
                "       125: lstore        16",
                "       127: lload_2",
                "       128: lload         16",
                "       130: lxor",
                "       131: lload         16",
                "       133: bipush        8",
                "       135: lushr",
                "       136: lor",
                "       137: lstore_2",
                "       138: lload         6",
                "       140: lload         8",
                "       142: ldc2_w        #306                // long -1l",
                "       145: lxor",
                "       146: land",
                "       147: lstore        6",
                "       149: lload         6",
                "       151: invokestatic  #324                // Method parallelSuffix:(J)J",
                "       154: lstore        8",
                "       156: lload         8",
                "       158: lload_2",
                "       159: land",
                "       160: lstore        18",
                "       162: lload_2",
                "       163: lload         18",
                "       165: lxor",
                "       166: lload         18",
                "       168: bipush        16",
                "       170: lushr",
                "       171: lor",
                "       172: lstore_2",
                "       173: lload         6",
                "       175: lload         8",
                "       177: ldc2_w        #306                // long -1l",
                "       180: lxor",
                "       181: land",
                "       182: lstore        6",
                "       184: lload         6",
                "       186: invokestatic  #324                // Method parallelSuffix:(J)J",
                "       189: lstore        8",
                "       191: lload         8",
                "       193: lload_2",
                "       194: land",
                "       195: lstore        20",
                "       197: lload_0",
                "       198: bipush        32",
                "       200: lshl",
                "       201: lstore        22",
                "       203: lload_0",
                "       204: lload         20",
                "       206: ldc2_w        #306                // long -1l",
                "       209: lxor",
                "       210: land",
                "       211: lload         22",
                "       213: lload         20",
                "       215: land",
                "       216: lor",
                "       217: lstore_0",
                "       218: lload_0",
                "       219: bipush        16",
                "       221: lshl",
                "       222: lstore        22",
                "       224: lload_0",
                "       225: lload         18",
                "       227: ldc2_w        #306                // long -1l",
                "       230: lxor",
                "       231: land",
                "       232: lload         22",
                "       234: lload         18",
                "       236: land",
                "       237: lor",
                "       238: lstore_0",
                "       239: lload_0",
                "       240: bipush        8",
                "       242: lshl",
                "       243: lstore        22",
                "       245: lload_0",
                "       246: lload         16",
                "       248: ldc2_w        #306                // long -1l",
                "       251: lxor",
                "       252: land",
                "       253: lload         22",
                "       255: lload         16",
                "       257: land",
                "       258: lor",
                "       259: lstore_0",
                "       260: lload_0",
                "       261: iconst_4",
                "       262: lshl",
                "       263: lstore        22",
                "       265: lload_0",
                "       266: lload         14",
                "       268: ldc2_w        #306                // long -1l",
                "       271: lxor",
                "       272: land",
                "       273: lload         22",
                "       275: lload         14",
                "       277: land",
                "       278: lor",
                "       279: lstore_0",
                "       280: lload_0",
                "       281: iconst_2",
                "       282: lshl",
                "       283: lstore        22",
                "       285: lload_0",
                "       286: lload         12",
                "       288: ldc2_w        #306                // long -1l",
                "       291: lxor",
                "       292: land",
                "       293: lload         22",
                "       295: lload         12",
                "       297: land",
                "       298: lor",
                "       299: lstore_0",
                "       300: lload_0",
                "       301: iconst_1",
                "       302: lshl",
                "       303: lstore        22",
                "       305: lload_0",
                "       306: lload         10",
                "       308: ldc2_w        #306                // long -1l",
                "       311: lxor",
                "       312: land",
                "       313: lload         22",
                "       315: lload         10",
                "       317: land",
                "       318: lor",
                "       319: lstore_0",
                "       320: lload_0",
                "       321: lload         4",
                "       323: land",
                "       324: lreturn",
                "      LineNumberTable:",
                "        line 2074: 0",
                "        line 2076: 3",
                "        line 2077: 12",
                "        line 2079: 19",
                "        line 2081: 25",
                "        line 2082: 35",
                "        line 2084: 46",
                "        line 2086: 53",
                "        line 2088: 59",
                "        line 2089: 69",
                "        line 2091: 80",
                "        line 2093: 87",
                "        line 2095: 93",
                "        line 2096: 103",
                "        line 2098: 114",
                "        line 2100: 121",
                "        line 2102: 127",
                "        line 2103: 138",
                "        line 2105: 149",
                "        line 2107: 156",
                "        line 2109: 162",
                "        line 2110: 173",
                "        line 2112: 184",
                "        line 2114: 191",
                "        line 2116: 197",
                "        line 2117: 203",
                "        line 2118: 218",
                "        line 2119: 224",
                "        line 2120: 239",
                "        line 2121: 245",
                "        line 2122: 260",
                "        line 2123: 265",
                "        line 2124: 280",
                "        line 2125: 285",
                "        line 2126: 300",
                "        line 2127: 305",
                "        line 2130: 320",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0     325     0     i   J",
                "            0     325     2  mask   J",
                "            3     322     4 originalMask   J",
                "           12     313     6 maskCount   J",
                "           19     306     8 maskPrefix   J",
                "           25     300    10 maskMove1   J",
                "           59     266    12 maskMove2   J",
                "           93     232    14 maskMove3   J",
                "          127     198    16 maskMove4   J",
                "          162     163    18 maskMove5   J",
                "          197     128    20 maskMove6   J",
                "          203     122    22     t   J"
        );
    }

    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x05, name = "iconst_2")
    @Instruction(value = 0x07, name = "iconst_4")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x20, name = "lload_2")
    @Instruction(value = 0x41, name = "lstore_2")
    @Instruction(value = 0x79, name = "lshl")
    @Instruction(value = 0x83, name = "lxor")
    @Instruction(value = 0xad, name = "lreturn")
    @Test
    public void test_56() {
        expectedConsecutiveLines = List.of(
                "  private static long parallelSuffix(long);",
                "    descriptor: (J)J",
                "    flags: (0x000a) ACC_PRIVATE, ACC_STATIC",
                "    Code:",
                "      stack=5, locals=4, args_size=1",
                "         0: lload_0",
                "         1: lload_0",
                "         2: iconst_1",
                "         3: lshl",
                "         4: lxor",
                "         5: lstore_2",
                "         6: lload_2",
                "         7: lload_2",
                "         8: iconst_2",
                "         9: lshl",
                "        10: lxor",
                "        11: lstore_2",
                "        12: lload_2",
                "        13: lload_2",
                "        14: iconst_4",
                "        15: lshl",
                "        16: lxor",
                "        17: lstore_2",
                "        18: lload_2",
                "        19: lload_2",
                "        20: bipush        8",
                "        22: lshl",
                "        23: lxor",
                "        24: lstore_2",
                "        25: lload_2",
                "        26: lload_2",
                "        27: bipush        16",
                "        29: lshl",
                "        30: lxor",
                "        31: lstore_2",
                "        32: lload_2",
                "        33: lload_2",
                "        34: bipush        32",
                "        36: lshl",
                "        37: lxor",
                "        38: lstore_2",
                "        39: lload_2",
                "        40: lreturn",
                "      LineNumberTable:",
                "        line 2135: 0",
                "        line 2136: 6",
                "        line 2137: 12",
                "        line 2138: 18",
                "        line 2139: 25",
                "        line 2140: 32",
                "        line 2141: 39",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      41     0 maskCount   J",
                "            6      35     2 maskPrefix   J"
        );
    }

    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x75, name = "lneg")
    @Instruction(value = 0x7b, name = "lshr")
    @Instruction(value = 0x7d, name = "lushr")
    @Instruction(value = 0x81, name = "lor")
    @Instruction(value = 0x88, name = "l2i")
    @Instruction(value = 0xac, name = "ireturn")
    @Test
    public void test_57() {
        expectedConsecutiveLines = List.of(
                "  public static int signum(long);",
                "    descriptor: (J)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=5, locals=2, args_size=1",
                "         0: lload_0",
                "         1: bipush        63",
                "         3: lshr",
                "         4: lload_0",
                "         5: lneg",
                "         6: bipush        63",
                "         8: lushr",
                "         9: lor",
                "        10: l2i",
                "        11: ireturn",
                "      LineNumberTable:",
                "        line 2155: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      12     0     i   J"
        );
    }

    @Instruction(value = 0xffffffff, name = "ldc2_w")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x3f, name = "lstore_0")
    @Instruction(value = 0x79, name = "lshl")
    @Instruction(value = 0x7d, name = "lushr")
    @Instruction(value = 0x7f, name = "land")
    @Instruction(value = 0x81, name = "lor")
    @Instruction(value = 0xad, name = "lreturn")
    @Test
    public void test_58() {
        expectedConsecutiveLines = List.of(
                "  public static long reverseBytes(long);",
                "    descriptor: (J)J",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=6, locals=2, args_size=1",
                "         0: lload_0",
                "         1: ldc2_w        #327                // long 71777214294589695l",
                "         4: land",
                "         5: bipush        8",
                "         7: lshl",
                "         8: lload_0",
                "         9: bipush        8",
                "        11: lushr",
                "        12: ldc2_w        #327                // long 71777214294589695l",
                "        15: land",
                "        16: lor",
                "        17: lstore_0",
                "        18: lload_0",
                "        19: bipush        48",
                "        21: lshl",
                "        22: lload_0",
                "        23: ldc2_w        #329                // long 4294901760l",
                "        26: land",
                "        27: bipush        16",
                "        29: lshl",
                "        30: lor",
                "        31: lload_0",
                "        32: bipush        16",
                "        34: lushr",
                "        35: ldc2_w        #329                // long 4294901760l",
                "        38: land",
                "        39: lor",
                "        40: lload_0",
                "        41: bipush        48",
                "        43: lushr",
                "        44: lor",
                "        45: lreturn",
                "      LineNumberTable:",
                "        line 2169: 0",
                "        line 2170: 18",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      46     0     i   J"
        );
    }

    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x20, name = "lload_2")
    @Instruction(value = 0x61, name = "ladd")
    @Instruction(value = 0xad, name = "lreturn")
    @Test
    public void test_59() {
        expectedConsecutiveLines = List.of(
                "  public static long sum(long, long);",
                "    descriptor: (JJ)J",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=4, args_size=2",
                "         0: lload_0",
                "         1: lload_2",
                "         2: ladd",
                "         3: lreturn",
                "      LineNumberTable:",
                "        line 2184: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       4     0     a   J",
                "            0       4     2     b   J"
        );
    }

    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x20, name = "lload_2")
    @Instruction(value = 0xad, name = "lreturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_60() {
        expectedConsecutiveLines = List.of(
                "  public static long max(long, long);",
                "    descriptor: (JJ)J",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=4, args_size=2",
                "         0: lload_0",
                "         1: lload_2",
                "         2: invokestatic  #331                // Method java/lang/Math.max:(JJ)J",
                "         5: lreturn",
                "      LineNumberTable:",
                "        line 2198: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0     a   J",
                "            0       6     2     b   J"
        );
    }

    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x20, name = "lload_2")
    @Instruction(value = 0xad, name = "lreturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_61() {
        expectedConsecutiveLines = List.of(
                "  public static long min(long, long);",
                "    descriptor: (JJ)J",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=4, args_size=2",
                "         0: lload_0",
                "         1: lload_2",
                "         2: invokestatic  #334                // Method java/lang/Math.min:(JJ)J",
                "         5: lreturn",
                "      LineNumberTable:",
                "        line 2212: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0     a   J",
                "            0       6     2     b   J"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_62() {
        expectedConsecutiveLines = List.of(
                "  public java.util.Optional<java.lang.Long> describeConstable();",
                "    descriptor: ()Ljava/util/Optional;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: invokestatic  #337                // Method java/util/Optional.of:(Ljava/lang/Object;)Ljava/util/Optional;",
                "         4: areturn",
                "      LineNumberTable:",
                "        line 2224: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       5     0  this   Ljava/lang/Long;",
                "    Signature: #503                         // ()Ljava/util/Optional<Ljava/lang/Long;>;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xb0, name = "areturn")
    @Test
    public void test_63() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Long resolveConstantDesc(java.lang.invoke.MethodHandles$Lookup);",
                "    descriptor: (Ljava/lang/invoke/MethodHandles$Lookup;)Ljava/lang/Long;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=2, args_size=2",
                "         0: aload_0",
                "         1: areturn",
                "      LineNumberTable:",
                "        line 2237: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       2     0  this   Ljava/lang/Long;",
                "            0       2     1 lookup   Ljava/lang/invoke/MethodHandles$Lookup;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xc0, name = "checkcast")
    @Test
    public void test_64() {
        expectedConsecutiveLines = List.of(
                "  public int compareTo(java.lang.Object);",
                "    descriptor: (Ljava/lang/Object;)I",
                "    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_0",
                "         1: aload_1",
                "         2: checkcast     #1                  // class java/lang/Long",
                "         5: invokevirtual #343                // Method compareTo:(Ljava/lang/Long;)I",
                "         8: ireturn",
                "      LineNumberTable:",
                "        line 72: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       9     0  this   Ljava/lang/Long;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Test
    public void test_65() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Object resolveConstantDesc(java.lang.invoke.MethodHandles$Lookup) throws java.lang.ReflectiveOperationException;",
                "    descriptor: (Ljava/lang/invoke/MethodHandles$Lookup;)Ljava/lang/Object;",
                "    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_0",
                "         1: aload_1",
                "         2: invokevirtual #347                // Method resolveConstantDesc:(Ljava/lang/invoke/MethodHandles$Lookup;)Ljava/lang/Long;",
                "         5: areturn",
                "      LineNumberTable:",
                "        line 72: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0  this   Ljava/lang/Long;",
                "    Exceptions:",
                "      throws java.lang.ReflectiveOperationException"
        );
    }
}
