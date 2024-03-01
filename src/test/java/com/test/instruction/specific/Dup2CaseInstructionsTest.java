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
public class Dup2CaseInstructionsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        ClassLoader classLoader = new GeneratedClassClassLoader();
        Class<?> clazz = classLoader.loadClass("com.generated.cases.method.instruction.Dup2Case");
        buildRealLines(clazz);
    }

    @Instruction(value = 0x5c, name = "dup2")
    @Test
    public void test_0x5c() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x5c(int, int);",
                "    descriptor: (II)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=4, locals=3, args_size=3",
                "         0: iload_1",
                "         1: iload_2",
                "         2: dup2",
                "         3: pop",
                "         4: pop",
                "         5: pop",
                "         6: pop",
                "         7: return"
        );
    }
}
