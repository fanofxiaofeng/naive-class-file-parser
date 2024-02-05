package com.test.present.cp.case15;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ClassCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Class"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "  #1636 = MethodHandle       6:#1637      // REF_invokeStatic java/lang/Class.typeVarBounds:(Ljava/lang/reflect/TypeVariable;)Ljava/lang/String;",
                "  #1640 = MethodHandle       9:#1641      // REF_invokeInterface java/lang/reflect/Type.getTypeName:()Ljava/lang/String;",
                "  #1646 = MethodHandle       5:#218       // REF_invokeVirtual java/lang/Module.getClassLoader:()Ljava/lang/ClassLoader;",
                "  #1648 = MethodHandle       6:#1649      // REF_invokeStatic java/lang/Class.lambda$methodToString$0:(Ljava/lang/Class;)Ljava/lang/String;",
                "  #1653 = MethodHandle       5:#1654      // REF_invokeVirtual java/lang/Class.lambda$getPermittedSubclasses$1:(Ljava/lang/Class;)Z",
                "  #1657 = MethodHandle       5:#1292      // REF_invokeVirtual java/lang/Class.isDirectSubType:(Ljava/lang/Class;)Z",
                "  #1660 = MethodHandle       6:#1661      // REF_invokeStatic java/lang/Class.lambda$getPermittedSubclasses$2:(I)[Ljava/lang/Class;",
                "  #1664 = MethodHandle       6:#1665      // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;"
        );
    }
}
