package com.test.attribute.synthetic;

import com.test.attribute.AttributePresenterTestBase;
import com.test.attribute.cases.SyntheticAttributeCase;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

@Ignore("Unable to find such attribute yet")
public class SyntheticAttributePresenterTest extends AttributePresenterTestBase {

    @Test
    public void test() throws IOException {
        buildRealLines(SyntheticAttributeCase.class);
    }
}
