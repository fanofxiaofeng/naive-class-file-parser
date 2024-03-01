package com.test.presenter.cp.case12;

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
public class Case12CpTest extends ConstantPoolPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.Case12"));
    }

    @ExpectedConstantKind(ConstantKind.CONSTANT_NameAndType)
    @Test
    public void test() {
        expectedLines = List.of(
                "   #3 = NameAndType        #5:#6          // \"<init>\":()V",
                "   #9 = NameAndType        #11:#12        // a:I",
                "  #14 = NameAndType        #15:#16        // run:()Ljava/lang/Runnable;",
                "  #19 = NameAndType        #21:#22        // out:Ljava/io/PrintStream;",
                "  #25 = NameAndType        #27:#28        // println:(I)V",
                "  #32 = NameAndType        #27:#33        // println:(Ljava/lang/String;)V",
                "  #48 = NameAndType        #41:#6         // lambda$f1$0:()V",
                "  #52 = NameAndType        #54:#55        // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;"
        );
    }
}
