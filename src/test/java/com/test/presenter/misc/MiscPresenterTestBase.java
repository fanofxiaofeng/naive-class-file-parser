package com.test.presenter.misc;

import com.study.constants.PresentKind;
import com.test.generator.UniqueLinePresenterTestBase;

import java.io.IOException;
import java.util.EnumSet;

public class MiscPresenterTestBase extends UniqueLinePresenterTestBase {

    protected static void buildRealLines(Class<?> clazz) throws IOException {
        String[] results = getResults(clazz, EnumSet.of(PresentKind.HEADER,
                PresentKind.VERSION,
                PresentKind.ACCESS_FLAGS,
                PresentKind.THIS_CLASS,
                PresentKind.SUPER_CLASS,
                PresentKind.COUNT));

        realLineMap.clear();
        for (String realLine : results) {
            realLineMap.put(realLine, realLineMap.getOrDefault(realLine, 0) + 1);
        }
    }
}
