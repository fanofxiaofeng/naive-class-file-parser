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
public class StackInstructionsCaseInstructionsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.method.instruction.StackInstructionsCase"));
    }

    @Instruction(value = 0x57, name = "pop")
    @Test
    public void test_0x57() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x57(java.util.function.Supplier<java.lang.String>);",
                "    descriptor: (Ljava/util/function/Supplier;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=2, args_size=2",
                "         0: aload_1",
                "         1: invokeinterface #7,  1            // InterfaceMethod java/util/function/Supplier.get:()Ljava/lang/Object;",
                "         6: pop",
                "         7: return",
                "    Signature: #44                          // (Ljava/util/function/Supplier<Ljava/lang/String;>;)V"
        );
    }

    @Instruction(value = 0x58, name = "pop2")
    @Test
    public void test_0x58() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x58(java.lang.Number);",
                "    descriptor: (Ljava/lang/Number;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_1",
                "         1: invokevirtual #13                 // Method java/lang/Number.longValue:()J",
                "         4: pop2",
                "         5: return"
        );
    }

    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0x59, name = "dup")
    @Test
    public void test_0x59() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x59();",
                "    descriptor: ()V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: new           #2                  // class java/lang/Object",
                "         3: dup",
                "         4: invokespecial #1                  // Method java/lang/Object.\"<init>\":()V",
                "         7: pop",
                "         8: return"
        );
    }

    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0x5a, name = "dup_x1")
    @Test
    public void test_0x5a() {
        expectedConsecutiveLines = List.of(
                "  public int test_0x5a();",
                "    descriptor: ()I",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=4, locals=1, args_size=1",
                "         0: aload_0",
                "         1: dup",
                "         2: getfield      #19                 // Field a:I",
                "         5: dup_x1",
                "         6: iconst_1",
                "         7: iadd",
                "         8: putfield      #19                 // Field a:I",
                "        11: ireturn"
        );
    }

    @Instruction(value = 0x59, name = "dup")
    @Test
    public void test_0x5b() {
        expectedConsecutiveLines = List.of(
                "  public long test_0x5b();",
                "    descriptor: ()J",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=7, locals=1, args_size=1",
                "         0: aload_0",
                "         1: dup",
                "         2: getfield      #25                 // Field b:J",
                "         5: dup2_x1",
                "         6: lconst_1",
                "         7: lsub",
                "         8: putfield      #25                 // Field b:J",
                "        11: lreturn"
        );
    }

    @Test
    public void test_0x5c() {
        expectedConsecutiveLines = List.of(
                "  public int test_0x5c(int);",
                "    descriptor: (I)I",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=3, args_size=2",
                "         0: iload_1",
                "         1: istore_2",
                "         2: iload_2",
                "         3: ireturn"
        );
    }
}
