package com.study.type.info;

import com.study.io.BasicInputStream;
import com.study.type.U2;
import com.study.type.constant.AbstractConstant;
import com.study.type.constant.ConstantUtf8;

import java.lang.reflect.Modifier;
import java.util.StringJoiner;

public class FieldInfo extends AbstractInfo {

    private U2 accessFlags;
    private U2 nameIndex;
    private U2 descriptorIndex;
    private U2 attributesCount;
    private AttributeInfo[] attributes;

    private FieldInfo(BasicInputStream basicInputStream) {
        this.accessFlags = basicInputStream.readU2();
        this.nameIndex = basicInputStream.readU2();
        this.descriptorIndex = basicInputStream.readU2();
        this.attributesCount = basicInputStream.readU2();
        int count = attributesCount.toInt();
        attributes = new AttributeInfo[count];
        for (int i = 0; i < count; i++) {
            attributes[i] = AttributeInfo.build(basicInputStream);
        }
    }

    public static FieldInfo build(BasicInputStream basicInputStream) {
        return new FieldInfo(basicInputStream);
    }

    @Override
    public String desc() {
        int mod = accessFlags.toInt();
        AbstractConstant descriptor = constantPool.get(descriptorIndex.toInt());
        if (!(descriptor instanceof ConstantUtf8)) {
            throw new AssertionError();
        }
        AbstractConstant name = constantPool.get(nameIndex.toInt());
        if (!(name instanceof ConstantUtf8)) {
            throw new AssertionError();
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("  %s %s %s;\n",
                // todo 没有处理 ACC_SYNTHETIC, ACC_ENUM
                Modifier.toString(mod),
                toHumanReadable(descriptor.desc()),
                name.desc()
        ));
        stringBuilder.append(String.format("    descriptor: %s\n", descriptor.desc()));
        stringBuilder.append(String.format("    %s\n", descAccessFlags()));
        for (AttributeInfo attribute : attributes) {
            stringBuilder.append(attribute.describe(4));
        }
        return stringBuilder.toString();
    }

    /**
     * @return 描述 accessFlags 的字符串. 返回值的内容举例如下
     * "flags: (0x0002) ACC_PRIVATE"
     * "flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC"
     */
    private String descAccessFlags() {
        int mod = this.accessFlags.toInt();

        StringJoiner joiner = new StringJoiner(", ");

        // 0x0001
        if (Modifier.isPublic(mod)) {
            joiner.add("ACC_PUBLIC");
        }

        // 0x0002
        if (Modifier.isPrivate(mod)) {
            joiner.add("ACC_PRIVATE");
        }

        // 0x0004
        if (Modifier.isProtected(mod)) {
            joiner.add("ACC_PROTECTED");
        }

        // 0x0008
        if (Modifier.isStatic(mod)) {
            joiner.add("ACC_STATIC");
        }

        // 0x0010
        if (Modifier.isFinal(mod)) {
            joiner.add("ACC_FINAL");
        }

        // 0x0040
        if (Modifier.isVolatile(mod)) {
            joiner.add("ACC_VOLATILE");
        }

        // 0x0080
        if (Modifier.isTransient(mod)) {
            joiner.add("ACC_TRANSIENT");
        }

        // todo 有没有优雅的写法
        // 0x1000
        if ((mod & 0x1000) == 0x1000) {
            joiner.add("ACC_SYNTHETIC");
        }

        // todo 有没有优雅的写法
        // 0x4000
        if ((mod & 0x4000) == 0x4000) {
            joiner.add("ACC_ENUM");
        }

        return String.format("flags: (0x%04x) %s", mod, joiner.toString());
    }
}
