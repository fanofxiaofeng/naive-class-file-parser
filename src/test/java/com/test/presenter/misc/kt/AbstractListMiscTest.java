package com.test.presenter.misc.kt;

import com.test.annotations.GeneratedBy;
import com.test.presenter.misc.MiscPresenterTestBase;
import com.test.presenter.misc.MiscTestGenerator;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(MiscTestGenerator.class)
public class AbstractListMiscTest extends MiscPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("kotlin.collections.AbstractList"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "public abstract class kotlin.collections.AbstractList<E extends java.lang.Object> extends kotlin.collections.AbstractCollection<E> implements java.util.List<E>, kotlin.jvm.internal.markers.KMappedMarker",
                "  minor version: 0",
                "  major version: 52",
                "  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT",
                "  this_class: #2                          // kotlin/collections/AbstractList",
                "  super_class: #5                         // kotlin/collections/AbstractCollection",
                "  interfaces: 2, fields: 1, methods: 16, attributes: 6"
        );
    }
}
