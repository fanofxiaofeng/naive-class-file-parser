package com.test.presenter.cp;

import com.study.constants.PresentKind;
import com.test.generator.UniqueLinePresenterTestBase;

import java.io.IOException;
import java.util.EnumSet;

public class ConstantPoolPresenterTestBase extends UniqueLinePresenterTestBase {

    protected static void buildRealLines(Class<?> clazz) throws IOException {
        String[] results = getResults(clazz, EnumSet.of(PresentKind.CONSTANT_POOL));

        realLineMap.clear();
        for (String realLine : results) {
            if (realLine.stripLeading().startsWith("#")) {
                realLineMap.put(realLine, realLineMap.getOrDefault(realLine, 0) + 1);
            }
        }
    }
}
