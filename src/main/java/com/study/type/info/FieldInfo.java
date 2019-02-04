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
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("  ");
        // todo 没有处理 ACC_SYNTHETIC, ACC_ENUM
        System.out.println(Integer.toHexString(mod));
        System.out.println(Modifier.toString(mod));
        stringBuilder.append(Modifier.toString(mod));
        stringBuilder.append(' ');
        AbstractConstant name = constantPool[nameIndex.toInt()];
        if (!ConstantUtf8.class.isInstance(name)) {
            throw new AssertionError();
        }
        AbstractConstant descriptor = constantPool[descriptorIndex.toInt()];
        if (!ConstantUtf8.class.isInstance(descriptor)) {
            throw new AssertionError();
        }
        stringBuilder.append(toHumanReadable(descriptor.detail()));
        stringBuilder.append(' ');
        stringBuilder.append(name.detail());
        stringBuilder.append(';');
        stringBuilder.append("\n    descriptor: ");
        stringBuilder.append(descriptor.detail());
        stringBuilder.append(String.format("\n    %s\n", descAccessFlags()));
        stringBuilder.append(AttributeInfo.displayAttributes(attributes, 1));
        return stringBuilder.toString();
    }

    @Override
    public String describe(int level) {
        return null;
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
