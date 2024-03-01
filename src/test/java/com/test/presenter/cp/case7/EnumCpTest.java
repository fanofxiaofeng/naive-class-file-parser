package com.test.presenter.cp.case7;

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
public class EnumCpTest extends ConstantPoolPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Enum"));
    }

    @ExpectedConstantKind(ConstantKind.CONSTANT_Class)
    @Test
    public void test() {
        expectedLines = List.of(
                "    #2 = Class              #4            // java/lang/Enum",
                "   #12 = Class              #14           // java/lang/Object",
                "   #21 = Class              #23           // java/lang/System",
                "   #26 = Class              #27           // java/lang/CloneNotSupportedException",
                "   #36 = Class              #37           // java/lang/ClassCastException",
                "   #40 = Class              #42           // java/lang/Class",
                "   #53 = Class              #55           // java/util/Optional",
                "   #63 = Class              #65           // java/util/Map",
                "   #68 = Class              #69           // java/lang/NullPointerException",
                "   #75 = Class              #76           // java/lang/IllegalArgumentException",
                "   #77 = Class              #78           // java/lang/StringBuilder",
                "   #96 = Class              #97           // java/io/InvalidObjectException",
                "  #106 = Class              #108          // java/lang/Enum$EnumDesc",
                "  #111 = Class              #112          // java/lang/constant/Constable",
                "  #113 = Class              #114          // java/lang/Comparable",
                "  #115 = Class              #116          // java/io/Serializable",
                "  #168 = Class              #169          // java/io/IOException",
                "  #170 = Class              #171          // java/lang/ClassNotFoundException",
                "  #173 = Class              #174          // java/io/ObjectStreamException",
                "  #192 = Class              #194          // java/lang/invoke/LambdaMetafactory",
                "  #199 = Class              #200          // java/lang/invoke/MethodHandles$Lookup",
                "  #201 = Class              #202          // java/lang/invoke/MethodHandles"
        );
    }
}
