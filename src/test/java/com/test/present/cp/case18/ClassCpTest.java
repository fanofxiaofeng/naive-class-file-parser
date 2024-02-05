package com.test.present.cp.case18;

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
                "    #99 = InvokeDynamic      #0:#100      // #0:apply:()Ljava/util/function/Function;",
                "   #146 = InvokeDynamic      #1:#100      // #1:apply:()Ljava/util/function/Function;",
                "   #208 = InvokeDynamic      #2:#209      // #2:run:(Ljava/lang/Module;)Ljava/security/PrivilegedAction;",
                "   #980 = InvokeDynamic      #3:#100      // #3:apply:()Ljava/util/function/Function;",
                "  #1256 = InvokeDynamic      #4:#1257     // #4:test:(Ljava/lang/Class;)Ljava/util/function/Predicate;",
                "  #1264 = InvokeDynamic      #5:#1257     // #5:test:(Ljava/lang/Class;)Ljava/util/function/Predicate;",
                "  #1268 = InvokeDynamic      #6:#1269     // #6:apply:()Ljava/util/function/IntFunction;"
        );
    }
}
