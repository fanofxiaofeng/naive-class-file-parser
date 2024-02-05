package com.test.present.cp.case16;

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
                "  #1635 = MethodType         #203         //  (Ljava/lang/Object;)Ljava/lang/Object;",
                "  #1639 = MethodType         #1356        //  (Ljava/lang/reflect/TypeVariable;)Ljava/lang/String;",
                "  #1643 = MethodType         #1644        //  (Ljava/lang/reflect/Type;)Ljava/lang/String;",
                "  #1645 = MethodType         #372         //  ()Ljava/lang/Object;",
                "  #1647 = MethodType         #166         //  ()Ljava/lang/ClassLoader;",
                "  #1651 = MethodType         #1628        //  (Ljava/lang/Class;)Ljava/lang/String;",
                "  #1652 = MethodType         #142         //  (Ljava/lang/Object;)Z",
                "  #1656 = MethodType         #779         //  (Ljava/lang/Class;)Z",
                "  #1658 = MethodType         #1659        //  (I)Ljava/lang/Object;",
                "  #1663 = MethodType         #1624        //  (I)[Ljava/lang/Class;"
        );
    }
}
