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
public class ThrowingExceptionsInstructionCaseInstructionsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.method.instruction.ThrowingExceptionsInstructionCase"));
    }

    @Instruction(value = 0xbf, name = "athrow")
    @Test
    public void test_0xbf() {
        expectedConsecutiveLines = List.of(
                "  public void test_0xbf(java.lang.Class<?>);",
                "    descriptor: (Ljava/lang/Class;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=3, args_size=2",
                "         0: aload_1",
                "         1: iconst_0",
                "         2: anewarray     #7                  // class java/lang/Class",
                "         5: invokevirtual #9                  // Method java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;",
                "         8: pop",
                "         9: goto          22",
                "        12: astore_2",
                "        13: new           #15                 // class java/lang/RuntimeException",
                "        16: dup",
                "        17: aload_2",
                "        18: invokespecial #17                 // Method java/lang/RuntimeException.\"<init>\":(Ljava/lang/Throwable;)V",
                "        21: athrow",
                "        22: return",
                "      Exception table:",
                "         from    to  target type",
                "             0     9    12   Class java/lang/NoSuchMethodException",
                "      LineNumberTable:",
                "        line 10: 0",
                "        line 13: 9",
                "        line 11: 12",
                "        line 12: 13",
                "        line 14: 22",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "           13       9     2     e   Ljava/lang/NoSuchMethodException;",
                "            0      23     0  this   Lcom/test/cases/method/instruction/ThrowingExceptionsInstructionCase;",
                "            0      23     1     c   Ljava/lang/Class;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      23     1     c   Ljava/lang/Class<*>;",
                "      StackMapTable: number_of_entries = 2",
                "        frame_type = 76 /* same_locals_1_stack_item */",
                "          stack = [ class java/lang/NoSuchMethodException ]",
                "        frame_type = 9 /* same */",
                "    Signature: #60                          // (Ljava/lang/Class<*>;)V"
        );
    }
}
