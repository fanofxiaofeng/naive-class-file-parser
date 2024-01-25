package com.study.signature;

import java.util.Collections;
import java.util.List;

public final class FakeType implements Signature {
    @Override
    public List<String> desc() {
        return Collections.emptyList();
    }
}
