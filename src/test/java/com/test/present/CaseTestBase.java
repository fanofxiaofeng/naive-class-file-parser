package com.test.present;

import com.study.constants.PresentKind;
import com.test.cases.Case;

import java.io.IOException;

public abstract class CaseTestBase extends PresenterTestBase {

    protected abstract Class<? extends Case> forCase();

    protected String[] getResults() throws IOException {
        return getResults(forCase(), PresentKind.CONSTANT_POOL);
    }
}
