package com.study.constants;

public enum ConstantKind {
    CONSTANT_Class(7, "Class"),
    CONSTANT_Fieldref(9, "Fieldref"),
    CONSTANT_Methodref(10, "Methodref"),
    CONSTANT_InterfaceMethodref(11, "InterfaceMethodref"),
    CONSTANT_String(8, "String"),
    CONSTANT_Integer(3, "Integer"),
    CONSTANT_Float(4, "Float"),
    CONSTANT_Long(5, "Long"),
    CONSTANT_Double(6, "Double"),
    CONSTANT_NameAndType(12, "NameAndType"),
    CONSTANT_Utf8(1, "Utf8"),
    CONSTANT_MethodHandle(15, "MethodHandle"),
    CONSTANT_MethodType(16, "MethodType"),
    CONSTANT_Dynamic(17, "todo"),
    CONSTANT_InvokeDynamic(18, "InvokeDynamic"),
    CONSTANT_Module(19, "todo"),
    CONSTANT_Package(20, "todo"),
    ;

    private final int tag;

    private final String type;

    ConstantKind(int tag, String type) {
        this.tag = tag;
        this.type = type;
    }

    public int getTag() {
        return tag;
    }

    public String getType() {
        return type;
    }
}
