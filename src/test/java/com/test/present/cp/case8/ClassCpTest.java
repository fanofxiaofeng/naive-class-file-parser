package com.test.present.cp.case8;

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
                "    #21 = String             #22          // interface",
                "    #26 = String             #27          //",
                "    #28 = String             #29          // class",
                "    #75 = String             #76          // interface",
                "    #80 = String             #81          // enum",
                "    #85 = String             #86          // record",
                "    #87 = String             #88          // class",
                "   #109 = String             #110         // ,",
                "   #111 = String             #112         // <",
                "   #113 = String             #114         // >",
                "   #125 = String             #126         // []",
                "   #144 = String             #145         //  extends",
                "   #147 = String             #148         //  &",
                "   #241 = String             #242         // Can not call newInstance() on the Class for java.lang.Class",
                "   #337 = String             #338         // java.lang",
                "   #466 = String             #467         // Enclosing method not found",
                "   #502 = String             #503         // Enclosing constructor not found",
                "   #511 = String             #512         // Malformed enclosing method information",
                "   #792 = String             #793         // a permitted subclass should not be a proxy class:",
                "   #810 = String             #811         // /",
                "   #975 = String             #5           // <init>",
                "   #978 = String             #979         // ()",
                "   #981 = String             #982         // (",
                "   #983 = String             #984         // )",
                "  #1021 = String             #1022        // values",
                "  #1044 = String             #1045        //  is not an enum class",
                "  #1069 = String             #1070        // Cannot cast",
                "  #1071 = String             #1072        //  to",
                "  #1222 = String             #1223        // [",
                "  #1295 = String             #1296        // null"
        );
    }
}
