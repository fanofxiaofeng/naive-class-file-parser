package com.study.type.info;

import com.study.type.ItemsContainer;
import com.study.type.U2;
import com.study.type.info.attribute.AttributeInfo;
import com.study.type.info.attribute.SignatureAttribute;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public abstract class AbstractInfo {
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

    public <T extends AttributeInfo> List<T> findAttribute(Class<T> clazz) {
        return attributes.items().stream().
                filter(attribute -> clazz.isAssignableFrom(attribute.getClass())).
                map(attribute -> (T) attribute).
                collect(Collectors.toList());
    }

    public Optional<SignatureAttribute> findSignatureAttribute() {
        List<SignatureAttribute> raw = findAttribute(SignatureAttribute.class);
        if (raw.isEmpty()) {
            return Optional.empty();
        }

        return Optional.of(raw.get(0));
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
