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
public class AnnotationCpTest extends ConstantPoolPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.annotation.Annotation"));
    }

    @ExpectedConstantKind(ConstantKind.CONSTANT_Class)
    @ExpectedConstantKind(ConstantKind.CONSTANT_Utf8)
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
