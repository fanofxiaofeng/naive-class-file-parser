package com.test.presenter.cp.caseAll;

import com.study.constants.ConstantKind;
import com.test.annotations.ExpectedConstantKind;
import com.test.annotations.GeneratedBy;
import com.test.presenter.cp.ConstantPoolPresenterTestBase;
import com.test.presenter.cp.ConstantPoolTestGenerator;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(ConstantPoolTestGenerator.class)
public class NumberCpTest extends ConstantPoolPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Number"));
    }

    @ExpectedConstantKind(ConstantKind.CONSTANT_Class)
    @ExpectedConstantKind(ConstantKind.CONSTANT_Methodref)
    @ExpectedConstantKind(ConstantKind.CONSTANT_Long)
    @ExpectedConstantKind(ConstantKind.CONSTANT_NameAndType)
    @ExpectedConstantKind(ConstantKind.CONSTANT_Utf8)
    @Test
    public void test() {
        expectedLines = List.of(
                "   #1 = Methodref          #2.#3          // java/lang/Object.\"<init>\":()V",
                "   #2 = Class              #4             // java/lang/Object",
                "   #3 = NameAndType        #5:#6          // \"<init>\":()V",
                "   #4 = Utf8               java/lang/Object",
                "   #5 = Utf8               <init>",
                "   #6 = Utf8               ()V",
                "   #7 = Methodref          #8.#9          // java/lang/Number.intValue:()I",
                "   #8 = Class              #10            // java/lang/Number",
                "   #9 = NameAndType        #11:#12        // intValue:()I",
                "  #10 = Utf8               java/lang/Number",
                "  #11 = Utf8               intValue",
                "  #12 = Utf8               ()I",
                "  #13 = Class              #14            // java/io/Serializable",
                "  #14 = Utf8               java/io/Serializable",
                "  #15 = Utf8               serialVersionUID",
                "  #16 = Utf8               J",
                "  #17 = Utf8               ConstantValue",
                "  #18 = Long               -8742448824652078965l",
                "  #20 = Utf8               Code",
                "  #21 = Utf8               LineNumberTable",
                "  #22 = Utf8               LocalVariableTable",
                "  #23 = Utf8               this",
                "  #24 = Utf8               Ljava/lang/Number;",
                "  #25 = Utf8               longValue",
                "  #26 = Utf8               ()J",
                "  #27 = Utf8               floatValue",
                "  #28 = Utf8               ()F",
                "  #29 = Utf8               doubleValue",
                "  #30 = Utf8               ()D",
                "  #31 = Utf8               byteValue",
                "  #32 = Utf8               ()B",
                "  #33 = Utf8               shortValue",
                "  #34 = Utf8               ()S",
                "  #35 = Utf8               SourceFile",
                "  #36 = Utf8               Number.java"
        );
    }
}
