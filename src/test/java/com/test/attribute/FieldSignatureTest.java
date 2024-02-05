package com.test.attribute;

import com.study.signature.FieldSignatureBuilder;
import com.study.signature.ReferenceTypeSignature;
import com.study.signature.ReferenceTypeSignatureBuilder;
import org.junit.Assert;
import org.junit.Test;

// should delete this class
@Deprecated()
public class FieldSignatureTest {
    private final ReferenceTypeSignatureBuilder builder = new FieldSignatureBuilder();

    @Test
    public void test1() {
        ReferenceTypeSignature signature = builder.build("Ljava/util/Map<Ljava/lang/Integer;Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/String;>;>;");
        Assert.assertEquals("java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.lang.String>>", signature.desc());
    }

    @Test
    public void test2() {
        ReferenceTypeSignature signature = builder.build("Ljava/util/Map<+Ljava/lang/Number;Ljava/util/Map<-Ljava/lang/String;+Ljava/lang/String;>;>;");
        Assert.assertEquals("java.util.Map<? extends java.lang.Number, java.util.Map<? super java.lang.String, ? extends java.lang.String>>", signature.desc());
    }

    @Test
    public void test3() {
        ReferenceTypeSignature signature = builder.build("Ljava/util/Map<TT;TT;>;");
        Assert.assertEquals("java.util.Map<T, T>", signature.desc());
    }

    @Test
    public void test4() {
        ReferenceTypeSignature signature = builder.build("Ljava/util/Map<+TT;Ljava/util/Map<-TT;Ljava/util/List<+Ljava/lang/String;>;>;>;");
        Assert.assertEquals("java.util.Map<? extends T, java.util.Map<? super T, java.util.List<? extends java.lang.String>>>", signature.desc());
    }
}
