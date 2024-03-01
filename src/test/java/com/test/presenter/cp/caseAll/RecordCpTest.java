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
public class RecordCpTest extends ConstantPoolPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Record"));
    }

    @ExpectedConstantKind(ConstantKind.CONSTANT_Class)
    @ExpectedConstantKind(ConstantKind.CONSTANT_Methodref)
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
                "   #7 = Class              #8             // java/lang/Record",
                "   #8 = Utf8               java/lang/Record",
                "   #9 = Utf8               Code",
                "  #10 = Utf8               LineNumberTable",
                "  #11 = Utf8               LocalVariableTable",
                "  #12 = Utf8               this",
                "  #13 = Utf8               Ljava/lang/Record;",
                "  #14 = Utf8               equals",
                "  #15 = Utf8               (Ljava/lang/Object;)Z",
                "  #16 = Utf8               hashCode",
                "  #17 = Utf8               ()I",
                "  #18 = Utf8               toString",
                "  #19 = Utf8               ()Ljava/lang/String;",
                "  #20 = Utf8               SourceFile",
                "  #21 = Utf8               Record.java"
        );
    }
}
