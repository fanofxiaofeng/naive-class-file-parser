package com.test.present.cp.case_all;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.lang.annotation.Repeatable;
import java.util.List;

public class RepeatableCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException {
        buildRealLines(Repeatable.class);
    }

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
