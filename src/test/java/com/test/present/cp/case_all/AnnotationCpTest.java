package com.test.present.cp.case_all;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.List;

public class AnnotationCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException {
        buildRealLines(Annotation.class);
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "   #1 = Class              #2             // java/lang/annotation/Annotation",
                "   #2 = Utf8               java/lang/annotation/Annotation",
                "   #3 = Class              #4             // java/lang/Object",
                "   #4 = Utf8               java/lang/Object",
                "   #5 = Utf8               equals",
                "   #6 = Utf8               (Ljava/lang/Object;)Z",
                "   #7 = Utf8               hashCode",
                "   #8 = Utf8               ()I",
                "   #9 = Utf8               toString",
                "  #10 = Utf8               ()Ljava/lang/String;",
                "  #11 = Utf8               annotationType",
                "  #12 = Utf8               ()Ljava/lang/Class;",
                "  #13 = Utf8               Signature",
                "  #14 = Utf8               ()Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;",
                "  #15 = Utf8               SourceFile",
                "  #16 = Utf8               Annotation.java"
        );
    }
}
