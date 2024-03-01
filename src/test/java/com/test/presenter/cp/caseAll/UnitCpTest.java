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
public class UnitCpTest extends ConstantPoolPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("kotlin.Unit"));
    }

    @ExpectedConstantKind(ConstantKind.CONSTANT_Class)
    @ExpectedConstantKind(ConstantKind.CONSTANT_Fieldref)
    @ExpectedConstantKind(ConstantKind.CONSTANT_Methodref)
    @ExpectedConstantKind(ConstantKind.CONSTANT_String)
    @ExpectedConstantKind(ConstantKind.CONSTANT_Integer)
    @ExpectedConstantKind(ConstantKind.CONSTANT_NameAndType)
    @ExpectedConstantKind(ConstantKind.CONSTANT_Utf8)
    @Test
    public void test() {
        expectedLines = List.of(
                "   #1 = Utf8               kotlin/Unit",
                "   #2 = Class              #1             // kotlin/Unit",
                "   #3 = Utf8               java/lang/Object",
                "   #4 = Class              #3             // java/lang/Object",
                "   #5 = Utf8               <init>",
                "   #6 = Utf8               ()V",
                "   #7 = NameAndType        #5:#6          // \"<init>\":()V",
                "   #8 = Methodref          #4.#7          // java/lang/Object.\"<init>\":()V",
                "   #9 = Utf8               this",
                "  #10 = Utf8               Lkotlin/Unit;",
                "  #11 = Utf8               toString",
                "  #12 = Utf8               ()Ljava/lang/String;",
                "  #13 = Utf8               Lorg/jetbrains/annotations/NotNull;",
                "  #14 = Utf8               kotlin.Unit",
                "  #15 = String             #14            // kotlin.Unit",
                "  #16 = Utf8               <clinit>",
                "  #17 = Methodref          #2.#7          // kotlin/Unit.\"<init>\":()V",
                "  #18 = Utf8               INSTANCE",
                "  #19 = NameAndType        #18:#10        // INSTANCE:Lkotlin/Unit;",
                "  #20 = Fieldref           #2.#19         // kotlin/Unit.INSTANCE:Lkotlin/Unit;",
                "  #21 = Utf8               Lkotlin/Metadata;",
                "  #22 = Utf8               mv",
                "  #23 = Integer            1",
                "  #24 = Integer            8",
                "  #25 = Integer            0",
                "  #26 = Utf8               k",
                "  #27 = Utf8               xi",
                "  #28 = Integer            48",
                "  #29 = Utf8               d1",
                "  #30 = Utf8               \\u0000\\u0010\\n\\u0002\\u0010\\u0002\\n\\u0002\\u0010\\u0000\\n\\u0000\\n\\u0002\\u0010\\u000e\\n\\u0000\\bÆ\\u0002\\u0018\\u00002\\u00020\\u0001B\\u0002\\b\\u0002J\\b\\u0010\\u0002\\u001a\\u00020\\u0003H\\u0016¨\\u0006\\u0004",
                "  #31 = Utf8               d2",
                "  #32 = Utf8",
                "  #33 = Utf8               kotlin-stdlib",
                "  #34 = Utf8               Unit.kt",
                "  #35 = Utf8               RuntimeInvisibleAnnotations",
                "  #36 = Utf8               Code",
                "  #37 = Utf8               LineNumberTable",
                "  #38 = Utf8               LocalVariableTable",
                "  #39 = Utf8               SourceFile",
                "  #40 = Utf8               RuntimeVisibleAnnotations"
        );
    }
}
