package com.test.instruction.specific;

import com.test.annotations.GeneratedBy;
import com.test.cases.method.instruction.Instruction;
import com.test.instruction.InstructionTestGenerator;
import com.test.method.MethodPresenterTestBase;
import com.test.util.GeneratedClassClassLoader;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(InstructionTestGenerator.class)
public class Dup2X2CaseInstructionsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        ClassLoader classLoader = new GeneratedClassClassLoader();
        Class<?> clazz = classLoader.loadClass("com.generated.cases.method.instruction.Dup2X2Case");
        buildRealLines(clazz);
    }

    @Instruction(value = 0x5e, name = "dup2_x2")
    @Test
    public void test_0x5e() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x5e(int, int, int, int);",
                "    descriptor: (IIII)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=6, locals=5, args_size=5",
                "         0: iload_1",
                "         1: iload_2",
                "         2: iload_3",
                "         3: iload         4",
                "         5: dup2_x2",
                "         6: pop",
                "         7: pop",
                "         8: pop",
                "         9: pop",
                "        10: pop",
                "        11: pop",
                "        12: return"
        );
    }
}
