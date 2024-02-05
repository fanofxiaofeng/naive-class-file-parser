package com.test.present.cp.case10;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class Case10CpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.Case10"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "   #1 = Methodref          #2.#3          // java/lang/Object.\"<init>\":()V",
                "  #37 = Methodref          #11.#38        // com/test/cases/Case10.lambda$f$0:(II)V",
                "  #40 = Methodref          #41.#42        // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;"
        );
    }
}
