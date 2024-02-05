package com.test.present.cp.case_all;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;

public class WeakReferenceCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException {
        buildRealLines(WeakReference.class);
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "   #1 = Methodref          #2.#3          // java/lang/ref/Reference.\"<init>\":(Ljava/lang/Object;)V",
                "   #2 = Class              #4             // java/lang/ref/Reference",
                "   #3 = NameAndType        #5:#6          // \"<init>\":(Ljava/lang/Object;)V",
                "   #4 = Utf8               java/lang/ref/Reference",
                "   #5 = Utf8               <init>",
                "   #6 = Utf8               (Ljava/lang/Object;)V",
                "   #7 = Methodref          #2.#8          // java/lang/ref/Reference.\"<init>\":(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V",
                "   #8 = NameAndType        #5:#9          // \"<init>\":(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V",
                "   #9 = Utf8               (Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V",
                "  #10 = Class              #11            // java/lang/ref/WeakReference",
                "  #11 = Utf8               java/lang/ref/WeakReference",
                "  #12 = Utf8               Code",
                "  #13 = Utf8               LineNumberTable",
                "  #14 = Utf8               LocalVariableTable",
                "  #15 = Utf8               this",
                "  #16 = Utf8               Ljava/lang/ref/WeakReference;",
                "  #17 = Utf8               referent",
                "  #18 = Utf8               Ljava/lang/Object;",
                "  #19 = Utf8               LocalVariableTypeTable",
                "  #20 = Utf8               Ljava/lang/ref/WeakReference<TT;>;",
                "  #21 = Utf8               TT;",
                "  #22 = Utf8               Signature",
                "  #23 = Utf8               (TT;)V",
                "  #24 = Utf8               q",
                "  #25 = Utf8               Ljava/lang/ref/ReferenceQueue;",
                "  #26 = Utf8               Ljava/lang/ref/ReferenceQueue<-TT;>;",
                "  #27 = Utf8               (TT;Ljava/lang/ref/ReferenceQueue<-TT;>;)V",
                "  #28 = Utf8               <T:Ljava/lang/Object;>Ljava/lang/ref/Reference<TT;>;",
                "  #29 = Utf8               SourceFile",
                "  #30 = Utf8               WeakReference.java"
        );
    }
}
