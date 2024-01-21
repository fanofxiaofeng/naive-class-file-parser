package com.test.attribute;

import com.study.signature.Signature;
import com.study.signature.SignatureBuilder;
import org.junit.Assert;
import org.junit.Test;

public class SignatureTest {
    private final SignatureBuilder builder = new SignatureBuilder();

    @Test
    public void test1() {
        Signature signature = builder.build("Ljava/util/Map<Ljava/lang/Integer;Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/String;>;>;");
        Assert.assertEquals("java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.lang.String>>", signature.desc());
    }

    @Test
    public void test2() {
        Signature signature = builder.build("Ljava/util/Map<+Ljava/lang/Number;Ljava/util/Map<-Ljava/lang/String;+Ljava/lang/String;>;>;");
        Assert.assertEquals("java.util.Map<? extends java.lang.Number, java.util.Map<? super java.lang.String, ? extends java.lang.String>>", signature.desc());
    }

    @Test
    public void test3() {
        Signature signature = builder.build("Ljava/util/Map<TT;TT;>;");
        Assert.assertEquals("java.util.Map<T, T>", signature.desc());
    }

    @Test
    public void test4() {
        Signature signature = builder.build("Ljava/util/Map<+TT;Ljava/util/Map<-TT;Ljava/util/List<+Ljava/lang/String;>;>;>;");
        Assert.assertEquals("java.util.Map<? extends T, java.util.Map<? super T, java.util.List<? extends java.lang.String>>>", signature.desc());
    }
}
