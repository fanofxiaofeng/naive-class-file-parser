package com.test.present;

import com.study.constants.PresentKind;
import com.test.cases.Case11;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class Case11Test extends PresenterTestBase {

    @Test
    public void test() throws IOException {
        String[] results = getResults(Case11.class, PresentKind.CONSTANT_POOL);

        Assert.assertEquals("   #7 = InterfaceMethodref #8.#9          // java/lang/Runnable.run:()V", results[7]);
    }
}
