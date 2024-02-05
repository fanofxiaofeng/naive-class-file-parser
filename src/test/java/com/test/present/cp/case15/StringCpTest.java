package com.test.present.cp.case15;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class StringCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.String"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "  #1413 = MethodHandle       6:#1414      // REF_invokeStatic java/lang/String.lambda$indent$0:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;",
                "  #1417 = MethodHandle       6:#1418      // REF_invokeStatic java/lang/String.lambda$indent$1:(Ljava/lang/String;)Ljava/lang/String;",
                "  #1420 = MethodHandle       6:#1421      // REF_invokeStatic java/lang/String.lambda$indent$2:(ILjava/lang/String;)Ljava/lang/String;",
                "  #1423 = MethodHandle       6:#1424      // REF_invokeStatic java/lang/String.lambda$stripIndent$3:(ILjava/lang/String;)Ljava/lang/String;",
                "  #1426 = MethodHandle       6:#1427      // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;"
        );
    }
}
