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
public class LoadAndStoreInstructionsFloatCaseInstructionsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.method.instruction.LoadAndStoreInstructionsFloatCase"));
    }

    @Instruction(value = 0x0b, name = "fconst_0")
    @Instruction(value = 0x0c, name = "fconst_1")
    @Instruction(value = 0x0d, name = "fconst_2")
    @Instruction(value = 0x44, name = "fstore_1")
    @Test
    public void test_0xb_to_0xd() {
        expectedConsecutiveLines = List.of(
                "  public void test_0xb_to_0xd();",
                "    descriptor: ()V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=2, args_size=1",
                "         0: fconst_0",
                "         1: fstore_1",
                "         2: fconst_1",
                "         3: fstore_1",
                "         4: fconst_2",
                "         5: fstore_1",
                "         6: return"
        );
    }

    @Instruction(value = 0x17, name = "fload")
    @Instruction(value = 0x22, name = "fload_0")
    @Instruction(value = 0x23, name = "fload_1")
    @Instruction(value = 0x24, name = "fload_2")
    @Instruction(value = 0x25, name = "fload_3")
    @Instruction(value = 0x38, name = "fstore")
    @Test
    public void test_0x17_0x22_to_0x25() {
        expectedConsecutiveLines = List.of(
                "  public static void test_0x17_0x22_to_0x25(float, float, float, float, float);",
                "    descriptor: (FFFFF)V",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=6, args_size=5",
                "         0: fload_0",
                "         1: fload_1",
                "         2: fadd",
                "         3: fload_2",
                "         4: fadd",
                "         5: fload_3",
                "         6: fadd",
                "         7: fload         4",
                "         9: fadd",
                "        10: fstore        5",
                "        12: return"
        );
    }

    @Instruction(value = 0x0b, name = "fconst_0")
    @Instruction(value = 0x38, name = "fstore")
    @Instruction(value = 0x43, name = "fstore_0")
    @Instruction(value = 0x44, name = "fstore_1")
    @Instruction(value = 0x45, name = "fstore_2")
    @Instruction(value = 0x46, name = "fstore_3")
    @Test
    public void test_0x38_0x43_to_0x46() {
        expectedConsecutiveLines = List.of(
                "  public static void test_0x38_0x43_to_0x46(float, float, float, float, float);",
                "    descriptor: (FFFFF)V",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=1, locals=5, args_size=5",
                "         0: fconst_0",
                "         1: fstore_0",
                "         2: fconst_0",
                "         3: fstore_1",
                "         4: fconst_0",
                "         5: fstore_2",
                "         6: fconst_0",
                "         7: fstore_3",
                "         8: fconst_0",
                "         9: fstore        4",
                "        11: return"
        );
    }
}
