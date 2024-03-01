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
public class LoadAndStoreInstructionsDoubleCaseInstructionsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.method.instruction.LoadAndStoreInstructionsDoubleCase"));
    }

    @Instruction(value = 0x0e, name = "dconst_0")
    @Instruction(value = 0x0f, name = "dconst_1")
    @Instruction(value = 0x48, name = "dstore_1")
    @Test
    public void test_0xe_to_0xf() {
        expectedConsecutiveLines = List.of(
                "  public void test_0xe_to_0xf();",
                "    descriptor: ()V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=3, args_size=1",
                "         0: dconst_0",
                "         1: dstore_1",
                "         2: dconst_1",
                "         3: dstore_1",
                "         4: return"
        );
    }

    @Instruction(value = 0x18, name = "dload")
    @Instruction(value = 0x26, name = "dload_0")
    @Instruction(value = 0x28, name = "dload_2")
    @Test
    public void test_0x18_0x26_0x28() {
        expectedConsecutiveLines = List.of(
                "  public static double test_0x18_0x26_0x28(double, double, double);",
                "    descriptor: (DDD)D",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=6, args_size=3",
                "         0: dload_0",
                "         1: dload_2",
                "         2: dadd",
                "         3: dload         4",
                "         5: dadd",
                "         6: dreturn"
        );
    }

    @Instruction(value = 0x27, name = "dload_1")
    @Instruction(value = 0x29, name = "dload_3")
    @Test
    public void test_0x27_0x29() {
        expectedConsecutiveLines = List.of(
                "  public double test_0x27_0x29(double, double);",
                "    descriptor: (DD)D",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=4, locals=5, args_size=3",
                "         0: dload_1",
                "         1: dload_3",
                "         2: dadd",
                "         3: dreturn"
        );
    }

    @Instruction(value = 0x0f, name = "dconst_1")
    @Instruction(value = 0x39, name = "dstore")
    @Instruction(value = 0x47, name = "dstore_0")
    @Instruction(value = 0x49, name = "dstore_2")
    @Test
    public void test_0x39_0x47_0x49() {
        expectedConsecutiveLines = List.of(
                "  public static void test_0x39_0x47_0x49(double, double, double);",
                "    descriptor: (DDD)V",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=6, args_size=3",
                "         0: dconst_1",
                "         1: dstore_0",
                "         2: dconst_1",
                "         3: dstore_2",
                "         4: dconst_1",
                "         5: dstore        4",
                "         7: return"
        );
    }

    @Instruction(value = 0x0f, name = "dconst_1")
    @Instruction(value = 0x48, name = "dstore_1")
    @Instruction(value = 0x4a, name = "dstore_3")
    @Test
    public void test_0x48_0x4a() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x48_0x4a(double, double);",
                "    descriptor: (DD)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=5, args_size=3",
                "         0: dconst_1",
                "         1: dstore_1",
                "         2: dconst_1",
                "         3: dstore_3",
                "         4: return"
        );
    }
}
