package com.test.presenter.misc.standard;

import com.test.annotations.GeneratedBy;
import com.test.presenter.misc.MiscPresenterTestBase;
import com.test.presenter.misc.MiscTestGenerator;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(MiscTestGenerator.class)
public class StreamMiscTest extends MiscPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.util.stream.Stream"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "public interface java.util.stream.Stream<T extends java.lang.Object> extends java.util.stream.BaseStream<T, java.util.stream.Stream<T>>",
                "  minor version: 0",
                "  major version: 65",
                "  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT",
                "  this_class: #12                         // java/util/stream/Stream",
                "  super_class: #176                       // java/lang/Object",
                "  interfaces: 1, fields: 0, methods: 52, attributes: 5"
        );
    }
}
