package com.test.present.cp.case15;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class EnumCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Enum"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "  #186 = MethodHandle       5:#187        // REF_invokeVirtual java/lang/Enum.lambda$describeConstable$0:(Ljava/lang/constant/ClassDesc;)Ljava/lang/Enum$EnumDesc;",
                "  #190 = MethodHandle       6:#191        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;"
        );
    }
}
