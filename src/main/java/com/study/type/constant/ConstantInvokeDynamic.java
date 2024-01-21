package com.study.type.constant;

import com.study.constants.ConstantKind;
import com.study.type.ConstantPool;
import com.study.type.U2;

import java.util.Optional;

public class ConstantInvokeDynamic extends CpInfo {

    private final U2 bootstrapMethodAttrIndex;
    private final U2 nameAndTypeIndex;

    public ConstantInvokeDynamic(U2 bootstrapMethodAttrIndex, U2 nameAndTypeIndex) {
        super(ConstantKind.CONSTANT_InvokeDynamic);
        this.bootstrapMethodAttrIndex = bootstrapMethodAttrIndex;
        this.nameAndTypeIndex = nameAndTypeIndex;
    }

    @Override
    public String desc() {
        return String.format("#%s:#%s", bootstrapMethodAttrIndex.toInt(), nameAndTypeIndex.toInt());
    }

    @Override
    public void validate() {

    }

    @Override
    public Optional<String> detail(ConstantPool constantPool) {
        Optional<String> nameAndTypeDetail = constantPool.detail(nameAndTypeIndex);

        if (nameAndTypeDetail.isEmpty()) {
            throw new IllegalArgumentException();
        }

        return Optional.of(String.format("#%s:%s",
                        bootstrapMethodAttrIndex.toInt(),
                        nameAndTypeDetail.get()
                )
        );
    }
}
