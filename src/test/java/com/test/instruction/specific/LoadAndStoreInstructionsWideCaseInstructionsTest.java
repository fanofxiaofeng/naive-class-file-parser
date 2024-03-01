package com.test.instruction.specific;

import com.test.annotations.GeneratedBy;
import com.test.instruction.InstructionTestGenerator;
import com.test.method.MethodPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(InstructionTestGenerator.class)
public class LoadAndStoreInstructionsWideCaseInstructionsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.method.instruction.LoadAndStoreInstructionsWideCase"));
    }

    @Test
    public void test() {
        expectedConsecutiveLines = List.of(
                "  public void test();",
                "    descriptor: ()V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=271, args_size=1",
                "         0: iconst_1",
                "         1: istore_w      257",
                "         5: iload_w       257",
                "         9: istore_w      258",
                "        13: fconst_1",
                "        14: fstore_w      259",
                "        18: fload_w       259",
                "        22: fstore_w      260",
                "        26: ldc           #7                  // String Hello",
                "        28: astore_w      261",
                "        32: aload_w       261",
                "        36: astore_w      262",
                "        40: lconst_1",
                "        41: lstore_w      263",
                "        45: lload_w       263",
                "        49: lstore_w      265",
                "        53: dconst_1",
                "        54: dstore_w      267",
                "        58: dload_w       267",
                "        62: dstore_w      269",
                "        66: return"
        );
    }
}
