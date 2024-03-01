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
public class LoadAndStoreInstructionsLongCaseInstructionsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.method.instruction.LoadAndStoreInstructionsLongCase"));
    }

    @Instruction(value = 0x09, name = "lconst_0")
    @Instruction(value = 0x0a, name = "lconst_1")
    @Instruction(value = 0x40, name = "lstore_1")
    @Test
    public void test_0x9_to_0xa() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x9_to_0xa();",
                "    descriptor: ()V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=3, args_size=1",
                "         0: lconst_0",
                "         1: lstore_1",
                "         2: lconst_1",
                "         3: lstore_1",
                "         4: return"
        );
    }

    @Instruction(value = 0x16, name = "lload")
    @Instruction(value = 0x1e, name = "lload_0")
    @Instruction(value = 0x20, name = "lload_2")
    @Test
    public void test_0x16_0x1e_to_0x20() {
        expectedConsecutiveLines = List.of(
                "  public static long test_0x16_0x1e_to_0x20(long, long, long, long);",
                "    descriptor: (JJJJ)J",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=8, args_size=4",
                "         0: lload_0",
                "         1: lload_2",
                "         2: ladd",
                "         3: lload         4",
                "         5: ladd",
                "         6: lload         6",
                "         8: ladd",
                "         9: lreturn"
        );
    }

    @Instruction(value = 0x1f, name = "lload_1")
    @Instruction(value = 0x21, name = "lload_3")
    @Test
    public void test_0x1f_0x21() {
        expectedConsecutiveLines = List.of(
                "  public long test_0x1f_0x21(long, long);",
                "    descriptor: (JJ)J",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=4, locals=5, args_size=3",
                "         0: lload_1",
                "         1: lload_3",
                "         2: ladd",
                "         3: lreturn"
        );
    }

    @Instruction(value = 0x0a, name = "lconst_1")
    @Instruction(value = 0x37, name = "lstore")
    @Instruction(value = 0x40, name = "lstore_1")
    @Instruction(value = 0x42, name = "lstore_3")
    @Test
    public void test_0x37_0x40_0x42() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x37_0x40_0x42(long, long, long);",
                "    descriptor: (JJJ)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=7, args_size=4",
                "         0: lconst_1",
                "         1: lstore_1",
                "         2: lconst_1",
                "         3: lstore_3",
                "         4: lconst_1",
                "         5: lstore        5",
                "         7: return"
        );
    }

    @Instruction(value = 0x0a, name = "lconst_1")
    @Instruction(value = 0x3f, name = "lstore_0")
    @Instruction(value = 0x41, name = "lstore_2")
    @Test
    public void test_0x3f_0x41() {
        expectedConsecutiveLines = List.of(
                "  public static void test_0x3f_0x41(long, long);",
                "    descriptor: (JJ)V",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=4, args_size=2",
                "         0: lconst_1",
                "         1: lstore_0",
                "         2: lconst_1",
                "         3: lstore_2",
                "         4: return"
        );
    }
}
