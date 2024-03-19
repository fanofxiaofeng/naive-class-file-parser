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
                "        66: return",
                "      LineNumberTable:",
                "        line 36: 0",
                "        line 37: 5",
                "        line 39: 13",
                "        line 40: 18",
                "        line 42: 26",
                "        line 43: 32",
                "        line 45: 40",
                "        line 46: 45",
                "        line 48: 53",
                "        line 49: 58",
                "        line 50: 66",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      67     0  this   Lcom/test/cases/method/instruction/LoadAndStoreInstructionsWideCase;",
                "            5      62   257    i1   I",
                "           13      54   258    i2   I",
                "           18      49   259    f1   F",
                "           26      41   260    f2   F",
                "           32      35   261    o1   Ljava/lang/String;",
                "           40      27   262    o2   Ljava/lang/Object;",
                "           45      22   263    l1   J",
                "           53      14   265    l2   J",
                "           58       9   267    d1   D",
                "           66       1   269    d2   D"
        );
    }
}
