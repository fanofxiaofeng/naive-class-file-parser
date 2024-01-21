package com.test.present;

import com.study.constants.PresentKind;
import org.junit.Assert;
import org.junit.Test;

public class PresenterTest extends PresenterTestBase {

    @Test
    public void onlyVersion() throws Exception {
        String[] results = getResults(PresenterTest.class, PresentKind.VERSION);

        Assert.assertEquals("  minor version: 0", results[0]);
        Assert.assertEquals("  major version: 61", results[1]);
    }

    @Test
    public void onlyAccessFlags() throws Exception {
        String[] results = getResults(C1.class, PresentKind.ACCESS_FLAGS);

        Assert.assertEquals("  flags: (0x2601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT, ACC_ANNOTATION", results[0]);
    }

    @Test
    public void onlyThisClass() throws Exception {
        String[] results = getResults(C1.class, PresentKind.THIS_CLASS);

        Assert.assertEquals("  this_class: #1                          // com/test/present/C1", results[0]);
    }

    @Test
    public void onlySuperClass() throws Exception {
        String[] results = getResults(C1.class, PresentKind.SUPER_CLASS);

        Assert.assertEquals("  super_class: #3                         // java/lang/Object", results[0]);
    }

    @Test
    public void onlyCount() throws Exception {
        String[] results = getResults(C1.class, PresentKind.COUNT);

        Assert.assertEquals("  interfaces: 1, fields: 0, methods: 0, attributes: 1", results[0]);
    }
}
