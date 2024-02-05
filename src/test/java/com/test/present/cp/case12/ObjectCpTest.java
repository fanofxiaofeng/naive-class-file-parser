package com.test.present.cp.case12;

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
                "    #4 = NameAndType        #5:#6         // \"<init>\":()V",
                "    #9 = NameAndType        #11:#12       // getClass:()Ljava/lang/Class;",
                "   #15 = NameAndType        #17:#18       // getName:()Ljava/lang/String;",
                "   #20 = NameAndType        #21:#22       // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "   #26 = NameAndType        #27:#28       // hashCode:()I",
                "   #31 = NameAndType        #33:#34       // toHexString:(I)Ljava/lang/String;",
                "   #36 = NameAndType        #37:#18       // toString:()Ljava/lang/String;",
                "   #39 = NameAndType        #40:#41       // wait:(J)V",
                "   #44 = NameAndType        #46:#47       // begin:()J",
                "   #49 = NameAndType        #50:#41       // wait0:(J)V",
                "   #52 = NameAndType        #53:#41       // end:(J)V",
                "   #58 = NameAndType        #60:#61       // currentThread:()Ljava/lang/Thread;",
                "   #63 = NameAndType        #64:#65       // isVirtual:()Z",
                "   #67 = NameAndType        #68:#65       // getAndClearInterrupt:()Z",
                "   #74 = NameAndType        #5:#75        // \"<init>\":(Ljava/lang/String;)V"
        );
    }
}
