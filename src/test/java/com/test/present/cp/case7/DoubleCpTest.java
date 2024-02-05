package com.test.present.cp.case7;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class DoubleCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Double"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "    #1 = Class              #2            // java/lang/Double",
                "    #3 = Class              #4            // java/lang/Byte",
                "    #6 = Class              #8            // jdk/internal/math/DoubleToDecimal",
                "   #16 = Class              #17           // java/lang/StringBuilder",
                "   #23 = Class              #25           // java/lang/Math",
                "   #50 = Class              #51           // jdk/internal/math/DoubleConsts",
                "   #61 = Class              #63           // java/lang/Long",
                "   #67 = Class              #69           // java/lang/String",
                "  #109 = Class              #110          // jdk/internal/math/FloatingDecimal",
                "  #114 = Class              #116          // java/lang/Number",
                "  #150 = Class              #152          // java/util/Optional",
                "  #166 = Class              #168          // java/lang/Class",
                "  #175 = Class              #176          // java/lang/Comparable",
                "  #177 = Class              #178          // java/lang/constant/Constable",
                "  #179 = Class              #180          // java/lang/constant/ConstantDesc",
                "  #229 = Class              #230          // java/lang/NumberFormatException",
                "  #277 = Class              #278          // java/lang/ReflectiveOperationException",
                "  #285 = Class              #286          // java/lang/invoke/MethodHandles$Lookup",
                "  #287 = Class              #288          // java/lang/invoke/MethodHandles"
        );
    }
}
