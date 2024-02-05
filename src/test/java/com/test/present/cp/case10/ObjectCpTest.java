package com.test.present.cp.case10;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ObjectCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "    #3 = Methodref          #1.#4         // java/lang/StringBuilder.\"<init>\":()V",
                "    #7 = Methodref          #8.#9         // java/lang/Object.getClass:()Ljava/lang/Class;",
                "   #13 = Methodref          #14.#15       // java/lang/Class.getName:()Ljava/lang/String;",
                "   #19 = Methodref          #1.#20        // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "   #25 = Methodref          #8.#26        // java/lang/Object.hashCode:()I",
                "   #29 = Methodref          #30.#31       // java/lang/Integer.toHexString:(I)Ljava/lang/String;",
                "   #35 = Methodref          #1.#36        // java/lang/StringBuilder.toString:()Ljava/lang/String;",
                "   #38 = Methodref          #8.#39        // java/lang/Object.wait:(J)V",
                "   #42 = Methodref          #43.#44       // jdk/internal/misc/Blocker.begin:()J",
                "   #48 = Methodref          #8.#49        // java/lang/Object.wait0:(J)V",
                "   #51 = Methodref          #43.#52       // jdk/internal/misc/Blocker.end:(J)V",
                "   #56 = Methodref          #57.#58       // java/lang/Thread.currentThread:()Ljava/lang/Thread;",
                "   #62 = Methodref          #57.#63       // java/lang/Thread.isVirtual:()Z",
                "   #66 = Methodref          #57.#67       // java/lang/Thread.getAndClearInterrupt:()Z",
                "   #73 = Methodref          #69.#74       // java/lang/IllegalArgumentException.\"<init>\":(Ljava/lang/String;)V"
        );
    }
}
