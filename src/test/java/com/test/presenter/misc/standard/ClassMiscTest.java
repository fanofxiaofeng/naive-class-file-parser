package com.test.presenter.misc.standard;

import com.test.annotations.GeneratedBy;
import com.test.presenter.misc.MiscPresenterTestBase;
import com.test.presenter.misc.MiscTestGenerator;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(MiscTestGenerator.class)
public class ClassMiscTest extends MiscPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Class"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "public final class java.lang.Class<T extends java.lang.Object> extends java.lang.Object implements java.io.Serializable, java.lang.reflect.GenericDeclaration, java.lang.reflect.Type, java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor$OfField<java.lang.Class<?>>, java.lang.constant.Constable",
                "  minor version: 0",
                "  major version: 65",
                "  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER",
                "  this_class: #8                          // java/lang/Class",
                "  super_class: #2                         // java/lang/Object",
                "  interfaces: 6, fields: 23, methods: 171, attributes: 5"
        );
    }
}
