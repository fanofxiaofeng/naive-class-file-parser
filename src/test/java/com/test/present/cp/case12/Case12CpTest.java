package com.test.present.cp.case12;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class Case12CpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.Case12"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "   #3 = NameAndType        #5:#6          // \"<init>\":()V",
                "   #9 = NameAndType        #11:#12        // a:I",
                "  #14 = NameAndType        #15:#16        // run:()Ljava/lang/Runnable;",
                "  #19 = NameAndType        #21:#22        // out:Ljava/io/PrintStream;",
                "  #25 = NameAndType        #27:#28        // println:(I)V",
                "  #32 = NameAndType        #27:#33        // println:(Ljava/lang/String;)V",
                "  #50 = NameAndType        #43:#6         // lambda$f1$0:()V",
                "  #54 = NameAndType        #56:#57        // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;"
        );
    }
}
