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
public class RepeatableCpTest extends ConstantPoolPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.annotation.Repeatable"));
    }

    @ExpectedConstantKind(ConstantKind.CONSTANT_Class)
    @ExpectedConstantKind(ConstantKind.CONSTANT_Utf8)
    @Test
    public void test() {
        expectedLines = List.of(
                "   #1 = Class              #2             // java/lang/annotation/Repeatable",
                "   #2 = Utf8               java/lang/annotation/Repeatable",
                "   #3 = Class              #4             // java/lang/Object",
                "   #4 = Utf8               java/lang/Object",
                "   #5 = Class              #6             // java/lang/annotation/Annotation",
                "   #6 = Utf8               java/lang/annotation/Annotation",
                "   #7 = Utf8               value",
                "   #8 = Utf8               ()Ljava/lang/Class;",
                "   #9 = Utf8               Signature",
                "  #10 = Utf8               ()Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;",
                "  #11 = Utf8               SourceFile",
                "  #12 = Utf8               Repeatable.java",
                "  #13 = Utf8               RuntimeVisibleAnnotations",
                "  #14 = Utf8               Ljava/lang/annotation/Documented;",
                "  #15 = Utf8               Ljava/lang/annotation/Retention;",
                "  #16 = Utf8               Ljava/lang/annotation/RetentionPolicy;",
                "  #17 = Utf8               RUNTIME",
                "  #18 = Utf8               Ljava/lang/annotation/Target;",
                "  #19 = Utf8               Ljava/lang/annotation/ElementType;",
                "  #20 = Utf8               ANNOTATION_TYPE"
        );
    }
}
