package com.test.instruction.standard;

import com.test.annotations.GeneratedBy;
import com.test.cases.method.instruction.Instruction;
import com.test.instruction.InstructionTestGenerator;
import com.test.method.MethodPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(InstructionTestGenerator.class)
public class NumberInstructionsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Number"));
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xb1, name = "return")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Test
    public void test_1() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Number();",
                "    descriptor: ()V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: invokespecial #1                  // Method java/lang/Object.\"<init>\":()V",
                "         4: return",
                "      LineNumberTable:",
                "        line 59: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       5     0  this   Ljava/lang/Number;"
        );
    }

    @Test
    public void test_2() {
        expectedConsecutiveLines = List.of(
                "  public abstract int intValue();",
                "    descriptor: ()I",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT"
        );
    }

    @Test
    public void test_3() {
        expectedConsecutiveLines = List.of(
                "  public abstract long longValue();",
                "    descriptor: ()J",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT"
        );
    }

    @Test
    public void test_4() {
        expectedConsecutiveLines = List.of(
                "  public abstract float floatValue();",
                "    descriptor: ()F",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT"
        );
    }

    @Test
    public void test_5() {
        expectedConsecutiveLines = List.of(
                "  public abstract double doubleValue();",
                "    descriptor: ()D",
                "    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x91, name = "i2b")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Test
    public void test_6() {
        expectedConsecutiveLines = List.of(
                "  public byte byteValue();",
                "    descriptor: ()B",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: invokevirtual #7                  // Method intValue:()I",
                "         4: i2b",
                "         5: ireturn",
                "      LineNumberTable:",
                "        line 105: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0  this   Ljava/lang/Number;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x93, name = "i2s")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Test
    public void test_7() {
        expectedConsecutiveLines = List.of(
                "  public short shortValue();",
                "    descriptor: ()S",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: invokevirtual #7                  // Method intValue:()I",
                "         4: i2s",
                "         5: ireturn",
                "      LineNumberTable:",
                "        line 120: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0  this   Ljava/lang/Number;"
        );
    }
}
