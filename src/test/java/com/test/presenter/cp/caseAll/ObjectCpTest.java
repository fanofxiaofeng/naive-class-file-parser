package com.test.presenter.cp.caseAll;

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
public class ObjectCpTest extends ConstantPoolPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Object"));
    }

    @ExpectedConstantKind(ConstantKind.CONSTANT_Class)
    @ExpectedConstantKind(ConstantKind.CONSTANT_Methodref)
    @ExpectedConstantKind(ConstantKind.CONSTANT_String)
    @ExpectedConstantKind(ConstantKind.CONSTANT_Integer)
    @ExpectedConstantKind(ConstantKind.CONSTANT_Long)
    @ExpectedConstantKind(ConstantKind.CONSTANT_NameAndType)
    @ExpectedConstantKind(ConstantKind.CONSTANT_Utf8)
    @Test
    public void test() {
        expectedLines = List.of(
                "    #1 = Class              #2            // java/lang/StringBuilder",
                "    #2 = Utf8               java/lang/StringBuilder",
                "    #3 = Methodref          #1.#4         // java/lang/StringBuilder.\"<init>\":()V",
                "    #4 = NameAndType        #5:#6         // \"<init>\":()V",
                "    #5 = Utf8               <init>",
                "    #6 = Utf8               ()V",
                "    #7 = Methodref          #8.#9         // java/lang/Object.getClass:()Ljava/lang/Class;",
                "    #8 = Class              #10           // java/lang/Object",
                "    #9 = NameAndType        #11:#12       // getClass:()Ljava/lang/Class;",
                "   #10 = Utf8               java/lang/Object",
                "   #11 = Utf8               getClass",
                "   #12 = Utf8               ()Ljava/lang/Class;",
                "   #13 = Methodref          #14.#15       // java/lang/Class.getName:()Ljava/lang/String;",
                "   #14 = Class              #16           // java/lang/Class",
                "   #15 = NameAndType        #17:#18       // getName:()Ljava/lang/String;",
                "   #16 = Utf8               java/lang/Class",
                "   #17 = Utf8               getName",
                "   #18 = Utf8               ()Ljava/lang/String;",
                "   #19 = Methodref          #1.#20        // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "   #20 = NameAndType        #21:#22       // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "   #21 = Utf8               append",
                "   #22 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "   #23 = String             #24           // @",
                "   #24 = Utf8               @",
                "   #25 = Methodref          #8.#26        // java/lang/Object.hashCode:()I",
                "   #26 = NameAndType        #27:#28       // hashCode:()I",
                "   #27 = Utf8               hashCode",
                "   #28 = Utf8               ()I",
                "   #29 = Methodref          #30.#31       // java/lang/Integer.toHexString:(I)Ljava/lang/String;",
                "   #30 = Class              #32           // java/lang/Integer",
                "   #31 = NameAndType        #33:#34       // toHexString:(I)Ljava/lang/String;",
                "   #32 = Utf8               java/lang/Integer",
                "   #33 = Utf8               toHexString",
                "   #34 = Utf8               (I)Ljava/lang/String;",
                "   #35 = Methodref          #1.#36        // java/lang/StringBuilder.toString:()Ljava/lang/String;",
                "   #36 = NameAndType        #37:#18       // toString:()Ljava/lang/String;",
                "   #37 = Utf8               toString",
                "   #38 = Methodref          #8.#39        // java/lang/Object.wait:(J)V",
                "   #39 = NameAndType        #40:#41       // wait:(J)V",
                "   #40 = Utf8               wait",
                "   #41 = Utf8               (J)V",
                "   #42 = Methodref          #43.#44       // jdk/internal/misc/Blocker.begin:()J",
                "   #43 = Class              #45           // jdk/internal/misc/Blocker",
                "   #44 = NameAndType        #46:#47       // begin:()J",
                "   #45 = Utf8               jdk/internal/misc/Blocker",
                "   #46 = Utf8               begin",
                "   #47 = Utf8               ()J",
                "   #48 = Methodref          #8.#49        // java/lang/Object.wait0:(J)V",
                "   #49 = NameAndType        #50:#41       // wait0:(J)V",
                "   #50 = Utf8               wait0",
                "   #51 = Methodref          #43.#52       // jdk/internal/misc/Blocker.end:(J)V",
                "   #52 = NameAndType        #53:#41       // end:(J)V",
                "   #53 = Utf8               end",
                "   #54 = Class              #55           // java/lang/InterruptedException",
                "   #55 = Utf8               java/lang/InterruptedException",
                "   #56 = Methodref          #57.#58       // java/lang/Thread.currentThread:()Ljava/lang/Thread;",
                "   #57 = Class              #59           // java/lang/Thread",
                "   #58 = NameAndType        #60:#61       // currentThread:()Ljava/lang/Thread;",
                "   #59 = Utf8               java/lang/Thread",
                "   #60 = Utf8               currentThread",
                "   #61 = Utf8               ()Ljava/lang/Thread;",
                "   #62 = Methodref          #57.#63       // java/lang/Thread.isVirtual:()Z",
                "   #63 = NameAndType        #64:#65       // isVirtual:()Z",
                "   #64 = Utf8               isVirtual",
                "   #65 = Utf8               ()Z",
                "   #66 = Methodref          #57.#67       // java/lang/Thread.getAndClearInterrupt:()Z",
                "   #67 = NameAndType        #68:#65       // getAndClearInterrupt:()Z",
                "   #68 = Utf8               getAndClearInterrupt",
                "   #69 = Class              #70           // java/lang/IllegalArgumentException",
                "   #70 = Utf8               java/lang/IllegalArgumentException",
                "   #71 = String             #72           // timeoutMillis value is negative",
                "   #72 = Utf8               timeoutMillis value is negative",
                "   #73 = Methodref          #69.#74       // java/lang/IllegalArgumentException.\"<init>\":(Ljava/lang/String;)V",
                "   #74 = NameAndType        #5:#75        // \"<init>\":(Ljava/lang/String;)V",
                "   #75 = Utf8               (Ljava/lang/String;)V",
                "   #76 = Integer            999999",
                "   #77 = String             #78           // nanosecond timeout value out of range",
                "   #78 = Utf8               nanosecond timeout value out of range",
                "   #79 = Class              #80           // java/lang/Long",
                "   #80 = Utf8               java/lang/Long",
                "   #81 = Long               9223372036854775807l",
                "   #83 = Utf8               Code",
                "   #84 = Utf8               LineNumberTable",
                "   #85 = Utf8               LocalVariableTable",
                "   #86 = Utf8               this",
                "   #87 = Utf8               Ljava/lang/Object;",
                "   #88 = Utf8               RuntimeVisibleAnnotations",
                "   #89 = Utf8               Ljdk/internal/vm/annotation/IntrinsicCandidate;",
                "   #90 = Utf8               Signature",
                "   #91 = Utf8               ()Ljava/lang/Class<*>;",
                "   #92 = Utf8               equals",
                "   #93 = Utf8               (Ljava/lang/Object;)Z",
                "   #94 = Utf8               obj",
                "   #95 = Utf8               StackMapTable",
                "   #96 = Utf8               clone",
                "   #97 = Utf8               ()Ljava/lang/Object;",
                "   #98 = Utf8               Exceptions",
                "   #99 = Class              #100          // java/lang/CloneNotSupportedException",
                "  #100 = Utf8               java/lang/CloneNotSupportedException",
                "  #101 = Utf8               notify",
                "  #102 = Utf8               notifyAll",
                "  #103 = Utf8               thread",
                "  #104 = Utf8               Ljava/lang/Thread;",
                "  #105 = Utf8               e",
                "  #106 = Utf8               Ljava/lang/InterruptedException;",
                "  #107 = Utf8               timeoutMillis",
                "  #108 = Utf8               J",
                "  #109 = Utf8               comp",
                "  #110 = Class              #111          // java/lang/Throwable",
                "  #111 = Utf8               java/lang/Throwable",
                "  #112 = Utf8               (JI)V",
                "  #113 = Utf8               nanos",
                "  #114 = Utf8               I",
                "  #115 = Utf8               finalize",
                "  #116 = Utf8               Deprecated",
                "  #117 = Utf8               Ljava/lang/Deprecated;",
                "  #118 = Utf8               since",
                "  #119 = Utf8               9",
                "  #120 = Utf8               forRemoval",
                "  #121 = Integer            1",
                "  #122 = Utf8               SourceFile",
                "  #123 = Utf8               Object.java"
        );
    }
}
