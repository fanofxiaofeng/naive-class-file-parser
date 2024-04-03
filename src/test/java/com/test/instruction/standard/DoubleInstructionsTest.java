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
public class DoubleInstructionsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Double"));
    }

    @Instruction(value = 0x26, name = "dload_0")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_1() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.String toString(double);",
                "    descriptor: (D)Ljava/lang/String;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=2, args_size=1",
                "         0: dload_0",
                "         1: invokestatic  #5                  // Method jdk/internal/math/DoubleToDecimal.toString:(D)Ljava/lang/String;",
                "         4: areturn",
                "      LineNumberTable:",
                "        line 452: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       5     0     d   D"
        );
    }

    @Instruction(value = 0xffffffff, name = "ldc2_w")
    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x06, name = "iconst_3")
    @Instruction(value = 0x0e, name = "dconst_0")
    @Instruction(value = 0x0f, name = "dconst_1")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x11, name = "sipush")
    @Instruction(value = 0x12, name = "ldc")
    @Instruction(value = 0x16, name = "lload")
    @Instruction(value = 0x19, name = "aload")
    @Instruction(value = 0x1d, name = "iload_3")
    @Instruction(value = 0x26, name = "dload_0")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x37, name = "lstore")
    @Instruction(value = 0x3a, name = "astore")
    @Instruction(value = 0x3e, name = "istore_3")
    @Instruction(value = 0x47, name = "dstore_0")
    @Instruction(value = 0x4d, name = "astore_2")
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0x7f, name = "land")
    @Instruction(value = 0x81, name = "lor")
    @Instruction(value = 0x97, name = "dcmpl")
    @Instruction(value = 0x98, name = "dcmpg")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0x9a, name = "ifne")
    @Instruction(value = 0x9c, name = "ifge")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xbb, name = "new")
    @Test
    public void test_2() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.String toHexString(double);",
                "    descriptor: (D)Ljava/lang/String;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=7, args_size=1",
                "         0: dload_0",
                "         1: invokestatic  #11                 // Method isFinite:(D)Z",
                "         4: ifne          12",
                "         7: dload_0",
                "         8: invokestatic  #15                 // Method toString:(D)Ljava/lang/String;",
                "        11: areturn",
                "        12: new           #16                 // class java/lang/StringBuilder",
                "        15: dup",
                "        16: bipush        24",
                "        18: invokespecial #18                 // Method java/lang/StringBuilder.\"<init>\":(I)V",
                "        21: astore_2",
                "        22: dconst_1",
                "        23: dload_0",
                "        24: invokestatic  #22                 // Method java/lang/Math.copySign:(DD)D",
                "        27: ldc2_w        #28                 // double -1.0d",
                "        30: dcmpl",
                "        31: ifne          41",
                "        34: aload_2",
                "        35: ldc           #30                 // String -",
                "        37: invokevirtual #32                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "        40: pop",
                "        41: aload_2",
                "        42: ldc           #36                 // String 0x",
                "        44: invokevirtual #32                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "        47: pop",
                "        48: dload_0",
                "        49: invokestatic  #38                 // Method java/lang/Math.abs:(D)D",
                "        52: dstore_0",
                "        53: dload_0",
                "        54: dconst_0",
                "        55: dcmpl",
                "        56: ifne          69",
                "        59: aload_2",
                "        60: ldc           #42                 // String 0.0p0",
                "        62: invokevirtual #32                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "        65: pop",
                "        66: goto          181",
                "        69: dload_0",
                "        70: ldc2_w        #44                 // double 2.2250738585072014E-308d",
                "        73: dcmpg",
                "        74: ifge          81",
                "        77: iconst_1",
                "        78: goto          82",
                "        81: iconst_0",
                "        82: istore_3",
                "        83: dload_0",
                "        84: invokestatic  #46                 // Method doubleToLongBits:(D)J",
                "        87: ldc2_w        #52                 // long 4503599627370495l",
                "        90: land",
                "        91: ldc2_w        #54                 // long 1152921504606846976l",
                "        94: lor",
                "        95: lstore        4",
                "        97: aload_2",
                "        98: iload_3",
                "        99: ifeq          107",
                "       102: ldc           #56                 // String 0.",
                "       104: goto          109",
                "       107: ldc           #58                 // String 1.",
                "       109: invokevirtual #32                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "       112: pop",
                "       113: lload         4",
                "       115: invokestatic  #60                 // Method java/lang/Long.toHexString:(J)Ljava/lang/String;",
                "       118: iconst_3",
                "       119: bipush        16",
                "       121: invokevirtual #66                 // Method java/lang/String.substring:(II)Ljava/lang/String;",
                "       124: astore        6",
                "       126: aload_2",
                "       127: aload         6",
                "       129: ldc           #72                 // String 0000000000000",
                "       131: invokevirtual #74                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z",
                "       134: ifeq          142",
                "       137: ldc           #78                 // String 0",
                "       139: goto          151",
                "       142: aload         6",
                "       144: ldc           #80                 // String 0{1,12}$",
                "       146: ldc           #82                 // String",
                "       148: invokevirtual #84                 // Method java/lang/String.replaceFirst:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;",
                "       151: invokevirtual #32                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "       154: pop",
                "       155: aload_2",
                "       156: bipush        112",
                "       158: invokevirtual #88                 // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;",
                "       161: pop",
                "       162: aload_2",
                "       163: iload_3",
                "       164: ifeq          173",
                "       167: sipush        -1022",
                "       170: goto          177",
                "       173: dload_0",
                "       174: invokestatic  #91                 // Method java/lang/Math.getExponent:(D)I",
                "       177: invokevirtual #95                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;",
                "       180: pop",
                "       181: aload_2",
                "       182: invokevirtual #98                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;",
                "       185: areturn",
                "      LineNumberTable:",
                "        line 539: 0",
                "        line 541: 7",
                "        line 544: 12",
                "        line 546: 22",
                "        line 547: 34",
                "        line 549: 41",
                "        line 551: 48",
                "        line 553: 53",
                "        line 554: 59",
                "        line 556: 69",
                "        line 561: 83",
                "        line 567: 97",
                "        line 573: 113",
                "        line 574: 126",
                "        line 575: 137",
                "        line 576: 142",
                "        line 574: 151",
                "        line 578: 155",
                "        line 583: 162",
                "        line 584: 167",
                "        line 585: 173",
                "        line 583: 177",
                "        line 587: 181",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "           83      98     3 subnormal   Z",
                "           97      84     4 signifBits   J",
                "          126      55     6 signif   Ljava/lang/String;",
                "           22     164     2 answer   Ljava/lang/StringBuilder;",
                "            0     186     0     d   D",
                "      StackMapTable: number_of_entries = 12",
                "        frame_type = 12 /* same */",
                "        frame_type = 252 /* append */",
                "          offset_delta = 28",
                "          locals = [ class java/lang/StringBuilder ]",
                "        frame_type = 27 /* same */",
                "        frame_type = 11 /* same */",
                "        frame_type = 64 /* same_locals_1_stack_item */",
                "          stack = [ int ]",
                "        frame_type = 255 /* full_frame */",
                "          offset_delta = 24",
                "          locals = [ double, class java/lang/StringBuilder, int, long ]",
                "          stack = [ class java/lang/StringBuilder ]",
                "        frame_type = 255 /* full_frame */",
                "          offset_delta = 1",
                "          locals = [ double, class java/lang/StringBuilder, int, long ]",
                "          stack = [ class java/lang/StringBuilder, class java/lang/String ]",
                "        frame_type = 255 /* full_frame */",
                "          offset_delta = 32",
                "          locals = [ double, class java/lang/StringBuilder, int, long, class java/lang/String ]",
                "          stack = [ class java/lang/StringBuilder ]",
                "        frame_type = 255 /* full_frame */",
                "          offset_delta = 8",
                "          locals = [ double, class java/lang/StringBuilder, int, long, class java/lang/String ]",
                "          stack = [ class java/lang/StringBuilder, class java/lang/String ]",
                "        frame_type = 85 /* same_locals_1_stack_item */",
                "          stack = [ class java/lang/StringBuilder ]",
                "        frame_type = 255 /* full_frame */",
                "          offset_delta = 3",
                "          locals = [ double, class java/lang/StringBuilder, int, long, class java/lang/String ]",
                "          stack = [ class java/lang/StringBuilder, int ]",
                "        frame_type = 248 /* chop */",
                "          offset_delta = 3"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xbb, name = "new")
    @Test
    public void test_3() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.Double valueOf(java.lang.String) throws java.lang.NumberFormatException;",
                "    descriptor: (Ljava/lang/String;)Ljava/lang/Double;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=1, args_size=1",
                "         0: new           #1                  // class java/lang/Double",
                "         3: dup",
                "         4: aload_0",
                "         5: invokestatic  #101                // Method parseDouble:(Ljava/lang/String;)D",
                "         8: invokespecial #105                // Method \"<init>\":(D)V",
                "        11: areturn",
                "      LineNumberTable:",
                "        line 755: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      12     0     s   Ljava/lang/String;",
                "    Exceptions:",
                "      throws java.lang.NumberFormatException"
        );
    }

    @Instruction(value = 0x26, name = "dload_0")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xbb, name = "new")
    @Test
    public void test_4() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.Double valueOf(double);",
                "    descriptor: (D)Ljava/lang/Double;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=2, args_size=1",
                "         0: new           #1                  // class java/lang/Double",
                "         3: dup",
                "         4: dload_0",
                "         5: invokespecial #105                // Method \"<init>\":(D)V",
                "         8: areturn",
                "      LineNumberTable:",
                "        line 773: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       9     0     d   D"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xaf, name = "dreturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_5() {
        expectedConsecutiveLines = List.of(
                "  public static double parseDouble(java.lang.String) throws java.lang.NumberFormatException;",
                "    descriptor: (Ljava/lang/String;)D",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: invokestatic  #108                // Method jdk/internal/math/FloatingDecimal.parseDouble:(Ljava/lang/String;)D",
                "         4: dreturn",
                "      LineNumberTable:",
                "        line 792: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       5     0     s   Ljava/lang/String;",
                "    Exceptions:",
                "      throws java.lang.NumberFormatException"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x26, name = "dload_0")
    @Instruction(value = 0x97, name = "dcmpl")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xac, name = "ireturn")
    @Test
    public void test_6() {
        expectedConsecutiveLines = List.of(
                "  public static boolean isNaN(double);",
                "    descriptor: (D)Z",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=2, args_size=1",
                "         0: dload_0",
                "         1: dload_0",
                "         2: dcmpl",
                "         3: ifeq          10",
                "         6: iconst_1",
                "         7: goto          11",
                "        10: iconst_0",
                "        11: ireturn",
                "      LineNumberTable:",
                "        line 808: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      12     0     v   D",
                "      StackMapTable: number_of_entries = 2",
                "        frame_type = 10 /* same */",
                "        frame_type = 64 /* same_locals_1_stack_item */",
                "          stack = [ int ]"
        );
    }

    @Instruction(value = 0xffffffff, name = "ldc2_w")
    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x26, name = "dload_0")
    @Instruction(value = 0x97, name = "dcmpl")
    @Instruction(value = 0x9e, name = "ifle")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_7() {
        expectedConsecutiveLines = List.of(
                "  public static boolean isInfinite(double);",
                "    descriptor: (D)Z",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=2, args_size=1",
                "         0: dload_0",
                "         1: invokestatic  #38                 // Method java/lang/Math.abs:(D)D",
                "         4: ldc2_w        #111                // double 1.7976931348623157E308d",
                "         7: dcmpl",
                "         8: ifle          15",
                "        11: iconst_1",
                "        12: goto          16",
                "        15: iconst_0",
                "        16: ireturn",
                "      LineNumberTable:",
                "        line 825: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      17     0     v   D",
                "      StackMapTable: number_of_entries = 2",
                "        frame_type = 15 /* same */",
                "        frame_type = 64 /* same_locals_1_stack_item */",
                "          stack = [ int ]"
        );
    }

    @Instruction(value = 0xffffffff, name = "ldc2_w")
    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x26, name = "dload_0")
    @Instruction(value = 0x98, name = "dcmpg")
    @Instruction(value = 0x9d, name = "ifgt")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_8() {
        expectedConsecutiveLines = List.of(
                "  public static boolean isFinite(double);",
                "    descriptor: (D)Z",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=2, args_size=1",
                "         0: dload_0",
                "         1: invokestatic  #38                 // Method java/lang/Math.abs:(D)D",
                "         4: ldc2_w        #111                // double 1.7976931348623157E308d",
                "         7: dcmpg",
                "         8: ifgt          15",
                "        11: iconst_1",
                "        12: goto          16",
                "        15: iconst_0",
                "        16: ireturn",
                "      LineNumberTable:",
                "        line 844: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      17     0     d   D",
                "      StackMapTable: number_of_entries = 2",
                "        frame_type = 15 /* same */",
                "        frame_type = 64 /* same_locals_1_stack_item */",
                "          stack = [ int ]"
        );
    }

    @Instruction(value = 0x27, name = "dload_1")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xb1, name = "return")
    @Instruction(value = 0xb5, name = "putfield")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Test
    public void test_9() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Double(double);",
                "    descriptor: (D)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=3, args_size=2",
                "         0: aload_0",
                "         1: invokespecial #113                // Method java/lang/Number.\"<init>\":()V",
                "         4: aload_0",
                "         5: dload_1",
                "         6: putfield      #118                // Field value:D",
                "         9: return",
                "      LineNumberTable:",
                "        line 866: 0",
                "        line 867: 4",
                "        line 868: 9",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      10     0  this   Ljava/lang/Double;",
                "            0      10     1 value   D"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0xb1, name = "return")
    @Instruction(value = 0xb5, name = "putfield")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_10() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Double(java.lang.String) throws java.lang.NumberFormatException;",
                "    descriptor: (Ljava/lang/String;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=2, args_size=2",
                "         0: aload_0",
                "         1: invokespecial #113                // Method java/lang/Number.\"<init>\":()V",
                "         4: aload_0",
                "         5: aload_1",
                "         6: invokestatic  #101                // Method parseDouble:(Ljava/lang/String;)D",
                "         9: putfield      #118                // Field value:D",
                "        12: return",
                "      LineNumberTable:",
                "        line 887: 0",
                "        line 888: 4",
                "        line 889: 12",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      13     0  this   Ljava/lang/Double;",
                "            0      13     1     s   Ljava/lang/String;",
                "    Exceptions:",
                "      throws java.lang.NumberFormatException"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_11() {
        expectedConsecutiveLines = List.of(
                "  public boolean isNaN();",
                "    descriptor: ()Z",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #118                // Field value:D",
                "         4: invokestatic  #122                // Method isNaN:(D)Z",
                "         7: ireturn",
                "      LineNumberTable:",
                "        line 899: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       8     0  this   Ljava/lang/Double;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_12() {
        expectedConsecutiveLines = List.of(
                "  public boolean isInfinite();",
                "    descriptor: ()Z",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #118                // Field value:D",
                "         4: invokestatic  #125                // Method isInfinite:(D)Z",
                "         7: ireturn",
                "      LineNumberTable:",
                "        line 911: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       8     0  this   Ljava/lang/Double;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_13() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.String toString();",
                "    descriptor: ()Ljava/lang/String;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #118                // Field value:D",
                "         4: invokestatic  #15                 // Method toString:(D)Ljava/lang/String;",
                "         7: areturn",
                "      LineNumberTable:",
                "        line 924: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       8     0  this   Ljava/lang/Double;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x8e, name = "d2i")
    @Instruction(value = 0x91, name = "i2b")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Test
    public void test_14() {
        expectedConsecutiveLines = List.of(
                "  public byte byteValue();",
                "    descriptor: ()B",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #118                // Field value:D",
                "         4: d2i",
                "         5: i2b",
                "         6: ireturn",
                "      LineNumberTable:",
                "        line 937: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       7     0  this   Ljava/lang/Double;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x8e, name = "d2i")
    @Instruction(value = 0x93, name = "i2s")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Test
    public void test_15() {
        expectedConsecutiveLines = List.of(
                "  public short shortValue();",
                "    descriptor: ()S",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #118                // Field value:D",
                "         4: d2i",
                "         5: i2s",
                "         6: ireturn",
                "      LineNumberTable:",
                "        line 950: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       7     0  this   Ljava/lang/Double;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x8e, name = "d2i")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Test
    public void test_16() {
        expectedConsecutiveLines = List.of(
                "  public int intValue();",
                "    descriptor: ()I",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #118                // Field value:D",
                "         4: d2i",
                "         5: ireturn",
                "      LineNumberTable:",
                "        line 962: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0  this   Ljava/lang/Double;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x8f, name = "d2l")
    @Instruction(value = 0xad, name = "lreturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Test
    public void test_17() {
        expectedConsecutiveLines = List.of(
                "  public long longValue();",
                "    descriptor: ()J",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #118                // Field value:D",
                "         4: d2l",
                "         5: lreturn",
                "      LineNumberTable:",
                "        line 974: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0  this   Ljava/lang/Double;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x90, name = "d2f")
    @Instruction(value = 0xae, name = "freturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Test
    public void test_18() {
        expectedConsecutiveLines = List.of(
                "  public float floatValue();",
                "    descriptor: ()F",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #118                // Field value:D",
                "         4: d2f",
                "         5: freturn",
                "      LineNumberTable:",
                "        line 991: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0  this   Ljava/lang/Double;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xaf, name = "dreturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Test
    public void test_19() {
        expectedConsecutiveLines = List.of(
                "  public double doubleValue();",
                "    descriptor: ()D",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #118                // Field value:D",
                "         4: dreturn",
                "      LineNumberTable:",
                "        line 1001: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       5     0  this   Ljava/lang/Double;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_20() {
        expectedConsecutiveLines = List.of(
                "  public int hashCode();",
                "    descriptor: ()I",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #118                // Field value:D",
                "         4: invokestatic  #128                // Method hashCode:(D)I",
                "         7: ireturn",
                "      LineNumberTable:",
                "        line 1027: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       8     0  this   Ljava/lang/Double;"
        );
    }

    @Instruction(value = 0x26, name = "dload_0")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_21() {
        expectedConsecutiveLines = List.of(
                "  public static int hashCode(double);",
                "    descriptor: (D)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=2, args_size=1",
                "         0: dload_0",
                "         1: invokestatic  #46                 // Method doubleToLongBits:(D)J",
                "         4: invokestatic  #131                // Method java/lang/Long.hashCode:(J)I",
                "         7: ireturn",
                "      LineNumberTable:",
                "        line 1039: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       8     0 value   D"
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
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xc0, name = "checkcast")
    @Instruction(value = 0xc1, name = "instanceof")
    @Test
    public void test_22() {
        expectedConsecutiveLines = List.of(
                "  public boolean equals(java.lang.Object);",
                "    descriptor: (Ljava/lang/Object;)Z",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=4, locals=2, args_size=2",
                "         0: aload_1",
                "         1: instanceof    #1                  // class java/lang/Double",
                "         4: ifeq          32",
                "         7: aload_1",
                "         8: checkcast     #1                  // class java/lang/Double",
                "        11: getfield      #118                // Field value:D",
                "        14: invokestatic  #46                 // Method doubleToLongBits:(D)J",
                "        17: aload_0",
                "        18: getfield      #118                // Field value:D",
                "        21: invokestatic  #46                 // Method doubleToLongBits:(D)J",
                "        24: lcmp",
                "        25: ifne          32",
                "        28: iconst_1",
                "        29: goto          33",
                "        32: iconst_0",
                "        33: ireturn",
                "      LineNumberTable:",
                "        line 1067: 0",
                "        line 1068: 14",
                "        line 1069: 21",
                "        line 1067: 33",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      34     0  this   Ljava/lang/Double;",
                "            0      34     1   obj   Ljava/lang/Object;",
                "      StackMapTable: number_of_entries = 2",
                "        frame_type = 32 /* same */",
                "        frame_type = 64 /* same_locals_1_stack_item */",
                "          stack = [ int ]"
        );
    }

    @Instruction(value = 0xffffffff, name = "ldc2_w")
    @Instruction(value = 0x26, name = "dload_0")
    @Instruction(value = 0x9a, name = "ifne")
    @Instruction(value = 0xad, name = "lreturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_23() {
        expectedConsecutiveLines = List.of(
                "  public static long doubleToLongBits(double);",
                "    descriptor: (D)J",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=2, args_size=1",
                "         0: dload_0",
                "         1: invokestatic  #122                // Method isNaN:(D)Z",
                "         4: ifne          12",
                "         7: dload_0",
                "         8: invokestatic  #134                // Method doubleToRawLongBits:(D)J",
                "        11: lreturn",
                "        12: ldc2_w        #137                // long 9221120237041090560l",
                "        15: lreturn",
                "      LineNumberTable:",
                "        line 1106: 0",
                "        line 1107: 7",
                "        line 1109: 12",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      16     0 value   D",
                "      StackMapTable: number_of_entries = 1",
                "        frame_type = 12 /* same */"
        );
    }

    @Test
    public void test_24() {
        expectedConsecutiveLines = List.of(
                "  public static native long doubleToRawLongBits(double);",
                "    descriptor: (D)J",
                "    flags: (0x0109) ACC_PUBLIC, ACC_STATIC, ACC_NATIVE"
        );
    }

    @Test
    public void test_25() {
        expectedConsecutiveLines = List.of(
                "  public static native double longBitsToDouble(long);",
                "    descriptor: (J)D",
                "    flags: (0x0109) ACC_PUBLIC, ACC_STATIC, ACC_NATIVE"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_26() {
        expectedConsecutiveLines = List.of(
                "  public int compareTo(java.lang.Double);",
                "    descriptor: (Ljava/lang/Double;)I",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=4, locals=2, args_size=2",
                "         0: aload_0",
                "         1: getfield      #118                // Field value:D",
                "         4: aload_1",
                "         5: getfield      #118                // Field value:D",
                "         8: invokestatic  #139                // Method compare:(DD)I",
                "        11: ireturn",
                "      LineNumberTable:",
                "        line 1255: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      12     0  this   Ljava/lang/Double;",
                "            0      12     1 anotherDouble   Ljava/lang/Double;"
        );
    }

    @Instruction(value = 0x02, name = "iconst_m1")
    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x16, name = "lload")
    @Instruction(value = 0x26, name = "dload_0")
    @Instruction(value = 0x28, name = "dload_2")
    @Instruction(value = 0x37, name = "lstore")
    @Instruction(value = 0x94, name = "lcmp")
    @Instruction(value = 0x97, name = "dcmpl")
    @Instruction(value = 0x98, name = "dcmpg")
    @Instruction(value = 0x9a, name = "ifne")
    @Instruction(value = 0x9c, name = "ifge")
    @Instruction(value = 0x9e, name = "ifle")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_27() {
        expectedConsecutiveLines = List.of(
                "  public static int compare(double, double);",
                "    descriptor: (DD)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=8, args_size=2",
                "         0: dload_0",
                "         1: dload_2",
                "         2: dcmpg",
                "         3: ifge          8",
                "         6: iconst_m1",
                "         7: ireturn",
                "         8: dload_0",
                "         9: dload_2",
                "        10: dcmpl",
                "        11: ifle          16",
                "        14: iconst_1",
                "        15: ireturn",
                "        16: dload_0",
                "        17: invokestatic  #46                 // Method doubleToLongBits:(D)J",
                "        20: lstore        4",
                "        22: dload_2",
                "        23: invokestatic  #46                 // Method doubleToLongBits:(D)J",
                "        26: lstore        6",
                "        28: lload         4",
                "        30: lload         6",
                "        32: lcmp",
                "        33: ifne          40",
                "        36: iconst_0",
                "        37: goto          53",
                "        40: lload         4",
                "        42: lload         6",
                "        44: lcmp",
                "        45: ifge          52",
                "        48: iconst_m1",
                "        49: goto          53",
                "        52: iconst_1",
                "        53: ireturn",
                "      LineNumberTable:",
                "        line 1277: 0",
                "        line 1278: 6",
                "        line 1279: 8",
                "        line 1280: 14",
                "        line 1283: 16",
                "        line 1284: 22",
                "        line 1286: 28",
                "        line 1287: 40",
                "        line 1288: 52",
                "        line 1286: 53",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      54     0    d1   D",
                "            0      54     2    d2   D",
                "           22      32     4 thisBits   J",
                "           28      26     6 anotherBits   J",
                "      StackMapTable: number_of_entries = 5",
                "        frame_type = 8 /* same */",
                "        frame_type = 7 /* same */",
                "        frame_type = 253 /* append */",
                "          offset_delta = 23",
                "          locals = [ long, long ]",
                "        frame_type = 11 /* same */",
                "        frame_type = 64 /* same_locals_1_stack_item */",
                "          stack = [ int ]"
        );
    }

    @Instruction(value = 0x26, name = "dload_0")
    @Instruction(value = 0x28, name = "dload_2")
    @Instruction(value = 0x63, name = "dadd")
    @Instruction(value = 0xaf, name = "dreturn")
    @Test
    public void test_28() {
        expectedConsecutiveLines = List.of(
                "  public static double sum(double, double);",
                "    descriptor: (DD)D",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=4, args_size=2",
                "         0: dload_0",
                "         1: dload_2",
                "         2: dadd",
                "         3: dreturn",
                "      LineNumberTable:",
                "        line 1305: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       4     0     a   D",
                "            0       4     2     b   D"
        );
    }

    @Instruction(value = 0x26, name = "dload_0")
    @Instruction(value = 0x28, name = "dload_2")
    @Instruction(value = 0xaf, name = "dreturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_29() {
        expectedConsecutiveLines = List.of(
                "  public static double max(double, double);",
                "    descriptor: (DD)D",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=4, args_size=2",
                "         0: dload_0",
                "         1: dload_2",
                "         2: invokestatic  #143                // Method java/lang/Math.max:(DD)D",
                "         5: dreturn",
                "      LineNumberTable:",
                "        line 1323: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0     a   D",
                "            0       6     2     b   D"
        );
    }

    @Instruction(value = 0x26, name = "dload_0")
    @Instruction(value = 0x28, name = "dload_2")
    @Instruction(value = 0xaf, name = "dreturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_30() {
        expectedConsecutiveLines = List.of(
                "  public static double min(double, double);",
                "    descriptor: (DD)D",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=4, args_size=2",
                "         0: dload_0",
                "         1: dload_2",
                "         2: invokestatic  #146                // Method java/lang/Math.min:(DD)D",
                "         5: dreturn",
                "      LineNumberTable:",
                "        line 1341: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0     a   D",
                "            0       6     2     b   D"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_31() {
        expectedConsecutiveLines = List.of(
                "  public java.util.Optional<java.lang.Double> describeConstable();",
                "    descriptor: ()Ljava/util/Optional;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: invokestatic  #149                // Method java/util/Optional.of:(Ljava/lang/Object;)Ljava/util/Optional;",
                "         4: areturn",
                "      LineNumberTable:",
                "        line 1353: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       5     0  this   Ljava/lang/Double;",
                "    Signature: #271                         // ()Ljava/util/Optional<Ljava/lang/Double;>;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xb0, name = "areturn")
    @Test
    public void test_32() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Double resolveConstantDesc(java.lang.invoke.MethodHandles$Lookup);",
                "    descriptor: (Ljava/lang/invoke/MethodHandles$Lookup;)Ljava/lang/Double;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=2, args_size=2",
                "         0: aload_0",
                "         1: areturn",
                "      LineNumberTable:",
                "        line 1366: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       2     0  this   Ljava/lang/Double;",
                "            0       2     1 lookup   Ljava/lang/invoke/MethodHandles$Lookup;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xc0, name = "checkcast")
    @Test
    public void test_33() {
        expectedConsecutiveLines = List.of(
                "  public int compareTo(java.lang.Object);",
                "    descriptor: (Ljava/lang/Object;)I",
                "    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_0",
                "         1: aload_1",
                "         2: checkcast     #1                  // class java/lang/Double",
                "         5: invokevirtual #155                // Method compareTo:(Ljava/lang/Double;)I",
                "         8: ireturn",
                "      LineNumberTable:",
                "        line 216: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       9     0  this   Ljava/lang/Double;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Test
    public void test_34() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Object resolveConstantDesc(java.lang.invoke.MethodHandles$Lookup) throws java.lang.ReflectiveOperationException;",
                "    descriptor: (Ljava/lang/invoke/MethodHandles$Lookup;)Ljava/lang/Object;",
                "    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_0",
                "         1: aload_1",
                "         2: invokevirtual #159                // Method resolveConstantDesc:(Ljava/lang/invoke/MethodHandles$Lookup;)Ljava/lang/Double;",
                "         5: areturn",
                "      LineNumberTable:",
                "        line 216: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0  this   Ljava/lang/Double;",
                "    Exceptions:",
                "      throws java.lang.ReflectiveOperationException"
        );
    }
}
