package com.test.attribute.cases;

public sealed class PermittedSubclassesCase
        permits PermittedSubclassesCase.C1,
        PermittedSubclassesCase.C2,
        PermittedSubclassesCase.C3,
        PermittedSubclassesCase.C4 {

    static final class C1 extends PermittedSubclassesCase {
    }

    static final class C2 extends PermittedSubclassesCase {
    }

    static final class C3 extends PermittedSubclassesCase {
    }

    static final class C4 extends PermittedSubclassesCase {
    }
}
