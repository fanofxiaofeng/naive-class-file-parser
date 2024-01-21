package com.test.attribute;

import com.study.constants.PresentKind;
import com.test.cases.Case;
import com.test.present.PresenterTestBase;

import java.io.IOException;

public abstract class AttributeTestBase extends PresenterTestBase {
    protected abstract Class<? extends Case> forCase();

    protected String[] getResults() throws IOException {
        return getResults(forCase(), PresentKind.FIELDS);
    }
}
