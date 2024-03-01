package com.test.presenter.cp.case12;

import com.test.presenter.cp.ConstantPoolPresenterTestBase;
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
                "    #7 = NameAndType        #9:#10        // toString:(D)Ljava/lang/String;",
                "   #12 = NameAndType        #13:#14       // isFinite:(D)Z",
                "   #19 = NameAndType        #20:#21       // \"<init>\":(I)V",
                "   #24 = NameAndType        #26:#27       // copySign:(DD)D",
                "   #33 = NameAndType        #34:#35       // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "   #39 = NameAndType        #40:#41       // abs:(D)D",
                "   #47 = NameAndType        #48:#49       // doubleToLongBits:(D)J",
                "   #62 = NameAndType        #64:#65       // toHexString:(J)Ljava/lang/String;",
                "   #68 = NameAndType        #70:#71       // substring:(II)Ljava/lang/String;",
                "   #75 = NameAndType        #76:#77       // equals:(Ljava/lang/Object;)Z",
                "   #85 = NameAndType        #86:#87       // replaceFirst:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;",
                "   #89 = NameAndType        #34:#90       // append:(C)Ljava/lang/StringBuilder;",
                "   #92 = NameAndType        #93:#94       // getExponent:(D)I",
                "   #96 = NameAndType        #34:#97       // append:(I)Ljava/lang/StringBuilder;",
                "   #99 = NameAndType        #9:#100       // toString:()Ljava/lang/String;",
                "  #102 = NameAndType        #103:#104     // parseDouble:(Ljava/lang/String;)D",
                "  #106 = NameAndType        #20:#107      // \"<init>\":(D)V",
                "  #115 = NameAndType        #20:#117      // \"<init>\":()V",
                "  #119 = NameAndType        #120:#121     // value:D",
                "  #123 = NameAndType        #124:#14      // isNaN:(D)Z",
                "  #126 = NameAndType        #127:#14      // isInfinite:(D)Z",
                "  #129 = NameAndType        #130:#94      // hashCode:(D)I",
                "  #132 = NameAndType        #130:#133     // hashCode:(J)I",
                "  #135 = NameAndType        #136:#49      // doubleToRawLongBits:(D)J",
                "  #140 = NameAndType        #141:#142     // compare:(DD)I",
                "  #144 = NameAndType        #145:#27      // max:(DD)D",
                "  #147 = NameAndType        #148:#27      // min:(DD)D",
                "  #151 = NameAndType        #153:#154     // of:(Ljava/lang/Object;)Ljava/util/Optional;",
                "  #156 = NameAndType        #157:#158     // compareTo:(Ljava/lang/Double;)I",
                "  #160 = NameAndType        #161:#162     // resolveConstantDesc:(Ljava/lang/invoke/MethodHandles$Lookup;)Ljava/lang/Double;",
                "  #167 = NameAndType        #169:#170     // getPrimitiveClass:(Ljava/lang/String;)Ljava/lang/Class;",
                "  #172 = NameAndType        #173:#174     // TYPE:Ljava/lang/Class;"
        );
    }
}
