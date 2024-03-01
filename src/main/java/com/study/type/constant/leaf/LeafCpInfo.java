package com.study.type.constant.leaf;

import com.study.constants.ConstantKind;
import com.study.type.constant.CpInfo;

/**
 * Subclass of {@link LeafCpInfo} don't refer to other CpInfo instances,
 * so their instances can be considered as leaf nodes.
 * <p>
 * There are 5 subclasses for {@link LeafCpInfo} as shown below.
 * 1. {@link ConstantUtf8}
 * 2. {@link ConstantInteger}
 * 3. {@link ConstantFloat}
 * 4. {@link ConstantLong}
 * 5. {@link ConstantDouble}
 */
public sealed abstract class LeafCpInfo
        extends CpInfo
        permits
        ConstantUtf8,
        ConstantInteger,
        ConstantFloat,
        ConstantLong,
        ConstantDouble {

    protected LeafCpInfo(ConstantKind tag) {
        super(tag);
    }
}
