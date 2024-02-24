package com.test.present.misc.standard;

import com.test.present.misc.MiscPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class OverrideMiscTest extends MiscPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Override"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "public interface java.lang.Override extends java.lang.annotation.Annotation",
                "  minor version: 0",
                "  major version: 65",
                "  flags: (0x2601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT, ACC_ANNOTATION",
                "  this_class: #1                          // java/lang/Override",
                "  super_class: #3                         // java/lang/Object",
                "  interfaces: 1, fields: 0, methods: 0, attributes: 2"
        );
    }
}
