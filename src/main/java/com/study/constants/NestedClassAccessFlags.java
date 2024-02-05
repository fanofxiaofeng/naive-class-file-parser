package com.study.constants;

/**
 * Please refer to the following section for more details
 * <p>
 * Table 4.7.6-A. Nested class access and property flags
 */
public enum NestedClassAccessFlags implements FlagHolder {
    ACC_PUBLIC(0x0001),
    ACC_PRIVATE(0x0002),
    ACC_PROTECTED(0x0004),
    ACC_STATIC(0x0008),
    ACC_FINAL(0x0010),
    ACC_INTERFACE(0x0200),
    ACC_ABSTRACT(0x0400),
    ACC_SYNTHETIC(0x1000),
    ACC_ANNOTATION(0x2000),
    ACC_ENUM(0x4000),
    ;
    private final int flag;

    NestedClassAccessFlags(int flag) {
        this.flag = flag;
    }

    @Override
    public int getFlag() {
        return flag;
    }
}
