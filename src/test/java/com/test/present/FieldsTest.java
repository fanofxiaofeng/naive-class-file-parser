package com.test.present;

import com.study.constants.PresentKind;
import org.junit.Test;

import java.io.IOException;

public class FieldsTest extends PresenterTestBase {

    @Test
    public void test() throws IOException {
        String[] result = getResults(C2.class, PresentKind.FIELDS);
    }
}
