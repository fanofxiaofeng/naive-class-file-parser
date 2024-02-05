package com.test.present.misc;

import com.study.constants.PresentKind;
import com.test.generator.UniqueLinePresenterTestBase;

import java.util.EnumSet;
import java.util.Set;

public class MiscPresenterTestBase extends UniqueLinePresenterTestBase {

    @Override
    protected Set<PresentKind> presentKinds() {
        return EnumSet.of(
                PresentKind.HEADER,
                PresentKind.VERSION,
                PresentKind.ACCESS_FLAGS,
                PresentKind.THIS_CLASS,
                PresentKind.SUPER_CLASS,
                PresentKind.COUNT
        );
    }
}
