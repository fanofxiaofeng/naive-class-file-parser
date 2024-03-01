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
public class DupX2CaseInstructionsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        ClassLoader classLoader = new GeneratedClassClassLoader();
        Class<?> clazz = classLoader.loadClass("com.generated.cases.method.instruction.DupX2Case");
        buildRealLines(clazz);
    }

    @Instruction(value = 0x5b, name = "dup_x2")
    @Test
    public void test_0x5b() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x5b(int, int, int);",
                "    descriptor: (III)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=4, locals=4, args_size=4",
                "         0: iload_1",
                "         1: iload_2",
                "         2: iload_3",
                "         3: dup_x2",
                "         4: pop",
                "         5: pop",
                "         6: pop",
                "         7: pop",
                "         8: return"
        );
    }
}
