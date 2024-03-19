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
public class SynchronizationInstructionsCaseInstructionsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.method.instruction.SynchronizationInstructionsCase"));
    }

    @Instruction(value = 0xc2, name = "monitorenter")
    @Instruction(value = 0xc3, name = "monitorexit")
    @Test
    public void test_0xc2_to_0xc3() {
        expectedConsecutiveLines = List.of(
                "  public void test_0xc2_to_0xc3();",
                "    descriptor: ()V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=4, args_size=1",
                "         0: ldc           #7                  // class java/lang/String",
                "         2: dup",
                "         3: astore_1",
                "         4: monitorenter",
                "         5: bipush        42",
                "         7: istore_2",
                "         8: aload_1",
                "         9: monitorexit",
                "        10: goto          18",
                "        13: astore_3",
                "        14: aload_1",
                "        15: monitorexit",
                "        16: aload_3",
                "        17: athrow",
                "        18: bipush        23",
                "        20: istore_1",
                "        21: return",
                "      Exception table:",
                "         from    to  target type",
                "             5    10    13   any",
                "            13    16    13   any",
                "      LineNumberTable:",
                "        line 10: 0",
                "        line 11: 5",
                "        line 12: 8",
                "        line 13: 18",
                "        line 14: 21",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      22     0  this   Lcom/test/cases/method/instruction/SynchronizationInstructionsCase;",
                "           21       1     1     b   I"
        );
    }
}
