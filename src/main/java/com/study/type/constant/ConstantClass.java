package com.study.type.constant;

import com.study.constants.ConstantKind;
import com.study.type.ConstantPool;
import com.study.type.U2;

import java.awt.desktop.OpenFilesEvent;
import java.util.Optional;

/**
 * Format
 * <p>
 * #5 = Class              #36            // java/lang/Object
 * #36 = Utf8               java/lang/Object
 */
public class ConstantClass extends AbstractConstant {
    /**
     * points to CONSTANT_Utf8_info
     */
    private final U2 nameIndex;

    public ConstantClass(U2 nameIndex) {
        super(ConstantKind.CONSTANT_Class);
        this.nameIndex = nameIndex;
    }

    @Override
    public String desc() {
        return desc(nameIndex);
    }

    @Override
    public String type() {
        return "Class";
    }

    @Override
    public Optional<String> detail() {
        String detail = constantPool.get(nameIndex).desc().replaceAll("\\.", "/");
        if (detail.startsWith("[")) {
            return Optional.of(String.format("\"%s\"", detail));
        }

        return Optional.of(detail);
    }

    @Override
    public Optional<String> detail(ConstantPool constantPool) {
        String detail = constantPool.get(nameIndex).desc().replaceAll("\\.", "/");
        if (detail.startsWith("[")) {
            return Optional.of(String.format("\"%s\"", detail));
        }

        return Optional.of(detail);
    }

    @Override
    public void validate() {
        if (this.tag != ConstantKind.CONSTANT_Class) {
            throw new AssertionError();
        }

        if (!(constantPool.get(this.nameIndex.toInt()) instanceof ConstantUtf8)) {
            throw new AssertionError();
        }
    }
}
