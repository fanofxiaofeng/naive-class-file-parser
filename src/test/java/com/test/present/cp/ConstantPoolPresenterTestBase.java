package com.test.present.cp;

import com.study.constants.PresentKind;
import com.test.generator.UniqueLinePresenterTestBase;

import java.util.Set;

public class ConstantPoolPresenterTestBase extends UniqueLinePresenterTestBase {

    @Override
    protected Set<PresentKind> presentKinds() {
        return Set.of(PresentKind.CONSTANT_POOL);
    }

}
