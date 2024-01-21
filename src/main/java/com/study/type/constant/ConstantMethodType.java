package com.study.type.constant;

import com.study.constants.ConstantKind;
import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.util.PaddingUtils;

import java.util.Optional;

public class ConstantMethodType extends CpInfo {

    private final U2 descriptorIndex;

    public ConstantMethodType(U2 descriptorIndex) {
        super(ConstantKind.CONSTANT_MethodType);
        this.descriptorIndex = descriptorIndex;
    }

    @Override
    public String desc() {
        return "#" + descriptorIndex.toInt();
    }

    @Override
    public void validate() {

    }

    @Override
    public Optional<String> detail(ConstantPool constantPool) {
        Optional<String> descriptorDetail = constantPool.detail(descriptorIndex);

        if (descriptorDetail.isEmpty()) {
            throw new IllegalArgumentException();
        }

        // todo: fix hard-coded value
        return Optional.of(PaddingUtils.prepend(descriptorDetail.get(), 1));
    }
}
