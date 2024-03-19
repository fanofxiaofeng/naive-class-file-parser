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
public class LoadAndStoreInstructionsObjectCaseInstructionsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.method.instruction.LoadAndStoreInstructionsObjectCase"));
    }

    @Instruction(value = 0x01, name = "aconst_null")
    @Test
    public void test_0x1() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x1();",
                "    descriptor: ()V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=2, args_size=1",
                "         0: aconst_null",
                "         1: astore_1",
                "         2: return",
                "      LineNumberTable:",
                "        line 20: 0",
                "        line 21: 2",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       3     0  this   Lcom/test/cases/method/instruction/LoadAndStoreInstructionsObjectCase;",
                "            2       1     1     a   Ljava/lang/Object;"
        );
    }

    @Instruction(value = 0x19, name = "aload")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x2c, name = "aload_2")
    @Instruction(value = 0x2d, name = "aload_3")
    @Test
    public void test_0x19_0x2a_to_0x2d() {
        expectedConsecutiveLines = List.of(
                "  public static void test_0x19_0x2a_to_0x2d(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String);",
                "    descriptor: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=1, locals=6, args_size=5",
                "         0: aload_0",
                "         1: astore        5",
                "         3: aload_1",
                "         4: astore        5",
                "         6: aload_2",
                "         7: astore        5",
                "         9: aload_3",
                "        10: astore        5",
                "        12: aload         4",
                "        14: astore        5",
                "        16: return",
                "      LineNumberTable:",
                "        line 34: 0",
                "        line 35: 3",
                "        line 36: 6",
                "        line 37: 9",
                "        line 38: 12",
                "        line 39: 16",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      17     0    s1   Ljava/lang/String;",
                "            0      17     1    s2   Ljava/lang/String;",
                "            0      17     2    s3   Ljava/lang/String;",
                "            0      17     3    s4   Ljava/lang/String;",
                "            0      17     4    s5   Ljava/lang/String;",
                "            3      14     5     s   Ljava/lang/String;"
        );
    }

    @Instruction(value = 0x3a, name = "astore")
    @Instruction(value = 0x4b, name = "astore_0")
    @Instruction(value = 0x4c, name = "astore_1")
    @Instruction(value = 0x4d, name = "astore_2")
    @Instruction(value = 0x4e, name = "astore_3")
    @Test
    public void test_0x3a_0x4b_to_0x4e() {
        expectedConsecutiveLines = List.of(
                "  public static void test_0x3a_0x4b_to_0x4e(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String);",
                "    descriptor: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=1, locals=6, args_size=5",
                "         0: ldc           #7                  // String Hello",
                "         2: astore        5",
                "         4: aload         5",
                "         6: astore_0",
                "         7: aload         5",
                "         9: astore_1",
                "        10: aload         5",
                "        12: astore_2",
                "        13: aload         5",
                "        15: astore_3",
                "        16: aload         5",
                "        18: astore        4",
                "        20: return",
                "      LineNumberTable:",
                "        line 52: 0",
                "        line 53: 4",
                "        line 54: 7",
                "        line 55: 10",
                "        line 56: 13",
                "        line 57: 16",
                "        line 58: 20",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      21     0    s1   Ljava/lang/String;",
                "            0      21     1    s2   Ljava/lang/String;",
                "            0      21     2    s3   Ljava/lang/String;",
                "            0      21     3    s4   Ljava/lang/String;",
                "            0      21     4    s5   Ljava/lang/String;",
                "            4      17     5  temp   Ljava/lang/String;"
        );
    }
}
