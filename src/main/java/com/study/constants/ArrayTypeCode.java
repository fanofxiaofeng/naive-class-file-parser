package com.study.constants;

/**
 * Please refer to the following link for more details
 * <a href="https://docs.oracle.com/javase/specs/jvms/se21/html/jvms-6.html#jvms-6.5.newarray">newarray</a>
 */
public enum ArrayTypeCode {
    T_BOOLEAN(4),
    T_CHAR(5),
    T_FLOAT(6),
    T_DOUBLE(7),
    T_BYTE(8),
    T_SHORT(9),
    T_INT(10),
    T_LONG(11),
    ;

    private final int atype;

    ArrayTypeCode(int atype) {
        this.atype = atype;
    }

    @Override
    public String toString() {
        return name().replace("T_", "").toLowerCase();
    }

    public static ArrayTypeCode toArrayTypeCode(int atype) {
        for (ArrayTypeCode item : ArrayTypeCode.values()) {
            if (item.atype == atype) {
                return item;
            }
        }

        String message = String.format("Unsupported atype: %s", atype);
        throw new IllegalArgumentException(message);
    }
}
