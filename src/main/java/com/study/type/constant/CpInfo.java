package com.study.type.constant;

import com.study.constants.ConstantKind;
import com.study.parser.ConstantPoolHolder;
import com.study.type.AbstractU;
import com.study.type.ConstantPool;

import java.util.Optional;

public abstract class CpInfo extends ConstantPoolHolder {

    protected final ConstantKind tag;

    protected CpInfo(ConstantKind tag) {
        this.tag = tag;
    }

    public abstract String desc();

    String desc(AbstractU u) {
        return "#" + u.toInt();
    }

    String desc(AbstractU u1, AbstractU u2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('#');
        stringBuilder.append(u1.toInt());
        if (this instanceof ConstantNameAndType) {
            stringBuilder.append(':');
        } else {
            stringBuilder.append('.');
        }
        stringBuilder.append('#');
        stringBuilder.append(u2.toInt());
        return stringBuilder.toString();
    }

    protected String desc(char[] chars) {
        return new String(chars);
    }

    public abstract void validate();

    @Deprecated
    public Optional<String> detail() {
        return Optional.empty();
    }

    public Optional<String> detail(ConstantPool constantPool) {
        return Optional.empty();
    }

    public ConstantKind getTag() {
        return tag;
    }
}
