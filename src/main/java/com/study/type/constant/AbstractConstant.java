package com.study.type.constant;

import com.study.type.AbstractU;
import com.study.type.U1;

public abstract class AbstractConstant {
    protected U1 tag;

//    protected U1[] info;

    public abstract String desc();

    protected abstract String type();

    String desc(AbstractU u) {
        StringBuilder stringBuilder = common();
        stringBuilder.append('#');
        stringBuilder.append(u.toInt());
        return stringBuilder.toString();
    }

    private StringBuilder common() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(type());
        while (stringBuilder.length() < 19) {
            stringBuilder.append(' ');
        }
        return stringBuilder;
    }

    String desc(AbstractU u1, AbstractU u2) {
        StringBuilder stringBuilder = common();
        stringBuilder.append('#');
        stringBuilder.append(u1.toInt());
        stringBuilder.append('.').append('#');
        stringBuilder.append(u2.toInt());
        return stringBuilder.toString();
    }

    String desc(char[] chars) {
        StringBuilder stringBuilder = common();
        stringBuilder.append(new String(chars));
        return stringBuilder.toString();
    }

    public String detail(AbstractConstant[] constantPool) {
        System.out.println(this.getClass().getName());
        throw new RuntimeException("Unsupported yet!");
    }
}
