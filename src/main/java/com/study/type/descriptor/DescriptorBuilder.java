package com.study.type.descriptor;

import com.study.type.ConstantPool;
import com.study.type.U2;

public interface DescriptorBuilder<T> {
    T build(ConstantPool constantPool, U2 descriptorIndex);

}
