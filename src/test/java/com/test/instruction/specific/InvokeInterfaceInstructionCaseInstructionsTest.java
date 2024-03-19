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
public class InvokeInterfaceInstructionCaseInstructionsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.method.instruction.InvokeInterfaceInstructionCase"));
    }

    @Instruction(value = 0xb9, name = "invokeinterface")
    @Test
    public void test_0xb9() {
        expectedConsecutiveLines = List.of(
                "  public default void test_0xb9(com.test.cases.method.instruction.InvokeInterfaceInstructionCase);",
                "    descriptor: (Lcom/test/cases/method/instruction/InvokeInterfaceInstructionCase;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=7, locals=2, args_size=2",
                "         0: aload_0",
                "         1: invokeinterface #1,  1            // InterfaceMethod dummy1:()V",
                "         6: aload_1",
                "         7: invokeinterface #1,  1            // InterfaceMethod dummy1:()V",
                "        12: aload_0",
                "        13: lconst_0",
                "        14: iconst_0",
                "        15: dconst_0",
                "        16: fconst_0",
                "        17: invokeinterface #7,  7            // InterfaceMethod dummy2:(JIDF)V",
                "        22: aload_0",
                "        23: iconst_0",
                "        24: newarray       long",
                "        26: invokeinterface #11,  2           // InterfaceMethod dummy3:([J)V",
                "        31: return",
                "      LineNumberTable:",
                "        line 6: 0",
                "        line 7: 6",
                "        line 8: 12",
                "        line 9: 22",
                "        line 10: 31",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      32     0  this   Lcom/test/cases/method/instruction/InvokeInterfaceInstructionCase;",
                "            0      32     1     o   Lcom/test/cases/method/instruction/InvokeInterfaceInstructionCase;"
        );
    }
}
