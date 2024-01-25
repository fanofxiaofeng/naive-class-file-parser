package com.study.type.info;

import com.study.parser.ConstantPoolHolder;
import com.study.type.ItemsContainer;
import com.study.type.U2;
import com.study.type.info.attribute.AttributeInfo;
import com.study.type.info.attribute.SignatureAttribute;

import java.util.Optional;

public abstract class AbstractInfo extends ConstantPoolHolder {
    protected final U2 accessFlags;
    protected final U2 nameIndex;
    protected final U2 descriptorIndex;

    protected final ItemsContainer<AttributeInfo> attributes;

    protected AbstractInfo(U2 accessFlags, U2 nameIndex, U2 descriptorIndex, ItemsContainer<AttributeInfo> attributes) {
        this.accessFlags = accessFlags;
        this.nameIndex = nameIndex;
        this.descriptorIndex = descriptorIndex;
        this.attributes = attributes;
    }

    public Optional<SignatureAttribute> findSignatureAttribute() {
        for (AttributeInfo attribute : attributes) {
            if (attribute instanceof SignatureAttribute) {
                return Optional.of((SignatureAttribute) attribute);
            }
        }

        return Optional.empty();
    }

    public U2 getAccessFlags() {
        return accessFlags;
    }

    public U2 getNameIndex() {
        return nameIndex;
    }

    public U2 getDescriptorIndex() {
        return descriptorIndex;
    }

    public ItemsContainer<AttributeInfo> getAttributes() {
        return attributes;
    }
}
