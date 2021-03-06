package com.study.type.constant;

import com.study.parser.ConstantPoolHolder;
import com.study.type.AbstractU;
import com.study.type.U1;

public abstract class AbstractConstant extends ConstantPoolHolder {

    protected U1 tag;

//    protected U1[] info;

    public abstract String desc();

    public abstract String type();

    String desc(AbstractU u) {
        return "#" + u.toInt();
    }

    String desc(int value) {
        return "" + value;
    }

    String desc(float value) {
        return String.valueOf(value) + 'f';
    }

    String desc(long value) {
        return String.valueOf(value) + 'l';
    }

    String desc(double value) {
        return String.valueOf(value) + 'd';
    }

    String desc(AbstractU u1, AbstractU u2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('#');
        stringBuilder.append(u1.toInt());
        if (ConstantNameAndType.class.isInstance(this)) {
            stringBuilder.append(':');
        } else {
            stringBuilder.append('.');
        }
        stringBuilder.append('#');
        stringBuilder.append(u2.toInt());
        return stringBuilder.toString();
    }

    String desc(char[] chars) {
        return new String(chars);
    }

    public abstract void validate();

    public String detail() {
        System.out.println(this.getClass().getName());
        throw new RuntimeException("Unsupported yet!");
    }
}
