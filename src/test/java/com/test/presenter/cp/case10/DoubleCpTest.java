package com.test.presenter.cp.case10;

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
public class DoubleCpTest extends ConstantPoolPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Double"));
    }

    @ExpectedConstantKind(ConstantKind.CONSTANT_Methodref)
    @Test
    public void test() {
        expectedLines = List.of(
                "    #5 = Methodref          #6.#7         // jdk/internal/math/DoubleToDecimal.toString:(D)Ljava/lang/String;",
                "   #11 = Methodref          #1.#12        // java/lang/Double.isFinite:(D)Z",
                "   #15 = Methodref          #1.#7         // java/lang/Double.toString:(D)Ljava/lang/String;",
                "   #18 = Methodref          #16.#19       // java/lang/StringBuilder.\"<init>\":(I)V",
                "   #22 = Methodref          #23.#24       // java/lang/Math.copySign:(DD)D",
                "   #32 = Methodref          #16.#33       // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "   #38 = Methodref          #23.#39       // java/lang/Math.abs:(D)D",
                "   #46 = Methodref          #1.#47        // java/lang/Double.doubleToLongBits:(D)J",
                "   #60 = Methodref          #61.#62       // java/lang/Long.toHexString:(J)Ljava/lang/String;",
                "   #66 = Methodref          #67.#68       // java/lang/String.substring:(II)Ljava/lang/String;",
                "   #74 = Methodref          #67.#75       // java/lang/String.equals:(Ljava/lang/Object;)Z",
                "   #84 = Methodref          #67.#85       // java/lang/String.replaceFirst:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;",
                "   #88 = Methodref          #16.#89       // java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;",
                "   #91 = Methodref          #23.#92       // java/lang/Math.getExponent:(D)I",
                "   #95 = Methodref          #16.#96       // java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;",
                "   #98 = Methodref          #16.#99       // java/lang/StringBuilder.toString:()Ljava/lang/String;",
                "  #101 = Methodref          #1.#102       // java/lang/Double.parseDouble:(Ljava/lang/String;)D",
                "  #105 = Methodref          #1.#106       // java/lang/Double.\"<init>\":(D)V",
                "  #108 = Methodref          #109.#102     // jdk/internal/math/FloatingDecimal.parseDouble:(Ljava/lang/String;)D",
                "  #113 = Methodref          #114.#115     // java/lang/Number.\"<init>\":()V",
                "  #122 = Methodref          #1.#123       // java/lang/Double.isNaN:(D)Z",
                "  #125 = Methodref          #1.#126       // java/lang/Double.isInfinite:(D)Z",
                "  #128 = Methodref          #1.#129       // java/lang/Double.hashCode:(D)I",
                "  #131 = Methodref          #61.#132      // java/lang/Long.hashCode:(J)I",
                "  #134 = Methodref          #1.#135       // java/lang/Double.doubleToRawLongBits:(D)J",
                "  #139 = Methodref          #1.#140       // java/lang/Double.compare:(DD)I",
                "  #143 = Methodref          #23.#144      // java/lang/Math.max:(DD)D",
                "  #146 = Methodref          #23.#147      // java/lang/Math.min:(DD)D",
                "  #149 = Methodref          #150.#151     // java/util/Optional.of:(Ljava/lang/Object;)Ljava/util/Optional;",
                "  #155 = Methodref          #1.#156       // java/lang/Double.compareTo:(Ljava/lang/Double;)I",
                "  #159 = Methodref          #1.#160       // java/lang/Double.resolveConstantDesc:(Ljava/lang/invoke/MethodHandles$Lookup;)Ljava/lang/Double;",
                "  #165 = Methodref          #166.#167     // java/lang/Class.getPrimitiveClass:(Ljava/lang/String;)Ljava/lang/Class;"
        );
    }
}
