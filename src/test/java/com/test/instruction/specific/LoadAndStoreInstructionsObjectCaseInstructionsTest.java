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
public class LoadAndStoreInstructionsObjectCaseInstructionsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.method.instruction.LoadAndStoreInstructionsObjectCase"));
    }

    @Instruction(value = 0x01, name = "aconst_null")
    @Instruction(value = 0x4c, name = "astore_1")
    @Test
    public void test_0x1() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x1();",
                "    descriptor: ()V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=2, args_size=1",
                "         0: aconst_null",
                "         1: astore_1",
                "         2: return"
        );
    }

    @Instruction(value = 0x19, name = "aload")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x3a, name = "astore")
    @Test
    public void test_0x19_0x2a_to_0x2d() {
        expectedConsecutiveLines = List.of(
                "  public static void test_0x19_0x2a_to_0x2d(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String);",
                "    descriptor: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=1, locals=6, args_size=5",
                "         0: aload_0",
                "         1: astore        5",
                "         3: aload_1",
                "         4: astore        5",
                "         6: aload_2",
                "         7: astore        5",
                "         9: aload_3",
                "        10: astore        5",
                "        12: aload         4",
                "        14: astore        5",
                "        16: return"
        );
    }

    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2e, name = "iaload")
    @Test
    public void test_0x2e() {
        expectedConsecutiveLines = List.of(
                "  public int test_0x2e(int[]);",
                "    descriptor: ([I)I",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_1",
                "         1: bipush        42",
                "         3: iaload",
                "         4: ireturn"
        );
    }

    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2f, name = "laload")
    @Test
    public void test_0x2f() {
        expectedConsecutiveLines = List.of(
                "  public long test_0x2f(long[]);",
                "    descriptor: ([J)J",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_1",
                "         1: bipush        42",
                "         3: laload",
                "         4: lreturn"
        );
    }

    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x30, name = "faload")
    @Test
    public void test_0x30() {
        expectedConsecutiveLines = List.of(
                "  public float test_0x30(float[]);",
                "    descriptor: ([F)F",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_1",
                "         1: bipush        42",
                "         3: faload",
                "         4: freturn"
        );
    }

    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x31, name = "daload")
    @Test
    public void test_0x31() {
        expectedConsecutiveLines = List.of(
                "  public double test_0x31(double[]);",
                "    descriptor: ([D)D",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_1",
                "         1: bipush        42",
                "         3: daload",
                "         4: dreturn"
        );
    }

    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x32, name = "aaload")
    @Instruction(value = 0x3a, name = "astore")
    @Test
    public void test_0x32() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x32(int[][][], java.util.function.Function<java.lang.String, java.lang.Integer>[], java.lang.Deprecated[]);",
                "    descriptor: ([[[I[Ljava/util/function/Function;[Ljava/lang/Deprecated;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=5, args_size=4",
                "         0: aload_1",
                "         1: bipush        42",
                "         3: aaload",
                "         4: astore        4",
                "         6: aload_2",
                "         7: bipush        42",
                "         9: aaload",
                "        10: astore        4",
                "        12: aload_3",
                "        13: bipush        42",
                "        15: aaload",
                "        16: astore        4",
                "        18: return",
                "    Signature: #85                          // ([[[I[Ljava/util/function/Function<Ljava/lang/String;Ljava/lang/Integer;>;[Ljava/lang/Deprecated;)V"
        );
    }

    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x33, name = "baload")
    @Test
    public void test_0x33() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x33(byte[], boolean[]);",
                "    descriptor: ([B[Z)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=5, args_size=3",
                "         0: aload_1",
                "         1: bipush        42",
                "         3: baload",
                "         4: istore_3",
                "         5: aload_2",
                "         6: bipush        42",
                "         8: baload",
                "         9: istore        4",
                "        11: return"
        );
    }

    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x34, name = "caload")
    @Test
    public void test_0x34() {
        expectedConsecutiveLines = List.of(
                "  public char test_0x34(char[]);",
                "    descriptor: ([C)C",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_1",
                "         1: bipush        42",
                "         3: caload",
                "         4: ireturn"
        );
    }

    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x35, name = "saload")
    @Test
    public void test_0x35() {
        expectedConsecutiveLines = List.of(
                "  public short test_0x35(short[]);",
                "    descriptor: ([S)S",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_1",
                "         1: bipush        42",
                "         3: saload",
                "         4: ireturn"
        );
    }

    @Instruction(value = 0x19, name = "aload")
    @Instruction(value = 0x3a, name = "astore")
    @Instruction(value = 0x4b, name = "astore_0")
    @Instruction(value = 0x4c, name = "astore_1")
    @Instruction(value = 0x4d, name = "astore_2")
    @Instruction(value = 0x4e, name = "astore_3")
    @Test
    public void test_0x3a_0x4b_to_0x4e() {
        expectedConsecutiveLines = List.of(
                "  public static void test_0x3a_0x4b_to_0x4e(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String);",
                "    descriptor: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=1, locals=6, args_size=5",
                "         0: ldc           #7                  // String Hello",
                "         2: astore        5",
                "         4: aload         5",
                "         6: astore_0",
                "         7: aload         5",
                "         9: astore_1",
                "        10: aload         5",
                "        12: astore_2",
                "        13: aload         5",
                "        15: astore_3",
                "        16: aload         5",
                "        18: astore        4",
                "        20: return"
        );
    }

    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x4f, name = "iastore")
    @Test
    public void test_0x4f() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x4f(int[]);",
                "    descriptor: ([I)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=2, args_size=2",
                "         0: aload_1",
                "         1: iconst_0",
                "         2: bipush        42",
                "         4: iastore",
                "         5: return"
        );
    }

    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x50, name = "lastore")
    @Test
    public void test_0x50() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x50(long[]);",
                "    descriptor: ([J)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=4, locals=2, args_size=2",
                "         0: aload_1",
                "         1: iconst_0",
                "         2: ldc2_w        #9                  // long 42l",
                "         5: lastore",
                "         6: return"
        );
    }

    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x51, name = "fastore")
    @Test
    public void test_0x51() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x51(float[]);",
                "    descriptor: ([F)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=2, args_size=2",
                "         0: aload_1",
                "         1: iconst_0",
                "         2: ldc           #11                 // float 42.0f",
                "         4: fastore",
                "         5: return"
        );
    }

    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x52, name = "dastore")
    @Test
    public void test_0x52() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x52(double[]);",
                "    descriptor: ([D)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=4, locals=2, args_size=2",
                "         0: aload_1",
                "         1: iconst_0",
                "         2: ldc2_w        #12                 // double 42.0d",
                "         5: dastore",
                "         6: return"
        );
    }

    @Instruction(value = 0x01, name = "aconst_null")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x2d, name = "aload_3")
    @Instruction(value = 0x53, name = "aastore")
    @Test
    public void test_0x53() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x53(int[][][], java.util.function.Function<java.lang.String, java.lang.Integer>[], java.lang.Deprecated[]);",
                "    descriptor: ([[[I[Ljava/util/function/Function;[Ljava/lang/Deprecated;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=4, args_size=4",
                "         0: aload_1",
                "         1: iconst_0",
                "         2: aconst_null",
                "         3: aastore",
                "         4: aload_2",
                "         5: bipush        42",
                "         7: aconst_null",
                "         8: aastore",
                "         9: aload_3",
                "        10: bipush        42",
                "        12: aconst_null",
                "        13: aastore",
                "        14: return",
                "    Signature: #85                          // ([[[I[Ljava/util/function/Function<Ljava/lang/String;Ljava/lang/Integer;>;[Ljava/lang/Deprecated;)V"
        );
    }

    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x54, name = "bastore")
    @Test
    public void test_0x54() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x54(byte[], boolean[]);",
                "    descriptor: ([B[Z)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=3, args_size=3",
                "         0: aload_1",
                "         1: bipush        42",
                "         3: iconst_0",
                "         4: bastore",
                "         5: aload_2",
                "         6: iconst_3",
                "         7: iconst_0",
                "         8: bastore",
                "         9: aload_2",
                "        10: bipush        42",
                "        12: iconst_1",
                "        13: bastore",
                "        14: return"
        );
    }

    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x55, name = "castore")
    @Test
    public void test_0x55() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x55(char[]);",
                "    descriptor: ([C)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=2, args_size=2",
                "         0: aload_1",
                "         1: bipush        42",
                "         3: bipush        97",
                "         5: castore",
                "         6: return"
        );
    }

    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x56, name = "sastore")
    @Test
    public void test_0x56() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x56(short[]);",
                "    descriptor: ([S)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=2, args_size=2",
                "         0: aload_1",
                "         1: iconst_4",
                "         2: bipush        42",
                "         4: sastore",
                "         5: return"
        );
    }
}
