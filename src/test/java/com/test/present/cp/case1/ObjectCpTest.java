package com.test.present.cp.case1;

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
                "    #2 = Utf8               java/lang/StringBuilder",
                "    #5 = Utf8               <init>",
                "    #6 = Utf8               ()V",
                "   #10 = Utf8               java/lang/Object",
                "   #11 = Utf8               getClass",
                "   #12 = Utf8               ()Ljava/lang/Class;",
                "   #16 = Utf8               java/lang/Class",
                "   #17 = Utf8               getName",
                "   #18 = Utf8               ()Ljava/lang/String;",
                "   #21 = Utf8               append",
                "   #22 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "   #24 = Utf8               @",
                "   #27 = Utf8               hashCode",
                "   #28 = Utf8               ()I",
                "   #32 = Utf8               java/lang/Integer",
                "   #33 = Utf8               toHexString",
                "   #34 = Utf8               (I)Ljava/lang/String;",
                "   #37 = Utf8               toString",
                "   #40 = Utf8               wait",
                "   #41 = Utf8               (J)V",
                "   #45 = Utf8               jdk/internal/misc/Blocker",
                "   #46 = Utf8               begin",
                "   #47 = Utf8               ()J",
                "   #50 = Utf8               wait0",
                "   #53 = Utf8               end",
                "   #55 = Utf8               java/lang/InterruptedException",
                "   #59 = Utf8               java/lang/Thread",
                "   #60 = Utf8               currentThread",
                "   #61 = Utf8               ()Ljava/lang/Thread;",
                "   #64 = Utf8               isVirtual",
                "   #65 = Utf8               ()Z",
                "   #68 = Utf8               getAndClearInterrupt",
                "   #70 = Utf8               java/lang/IllegalArgumentException",
                "   #72 = Utf8               timeoutMillis value is negative",
                "   #75 = Utf8               (Ljava/lang/String;)V",
                "   #78 = Utf8               nanosecond timeout value out of range",
                "   #80 = Utf8               java/lang/Long",
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
                "  #122 = Utf8               SourceFile",
                "  #123 = Utf8               Object.java"
        );
    }
}
