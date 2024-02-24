package com.study.signature;

import com.study.util.ClassNameUtils;

import java.util.List;

public final class ClassTypeSignature extends ReferenceTypeSignature {

    private final String packageSpecifier;
    private final SimpleClassTypeSignature simpleClassTypeSignature;

    private final List<SimpleClassTypeSignature> classTypeSignatureSuffixList;

    public ClassTypeSignature(String packageSpecifier,
                              SimpleClassTypeSignature simpleClassTypeSignature,
                              List<SimpleClassTypeSignature> classTypeSignatureSuffixList
    ) {
        this.packageSpecifier = packageSpecifier;
        this.simpleClassTypeSignature = simpleClassTypeSignature;
        this.classTypeSignatureSuffixList = classTypeSignatureSuffixList;
    }

    public ClassTypeSignature(SimpleClassTypeSignature simpleClassTypeSignature,
                              List<SimpleClassTypeSignature> classTypeSignatureSuffixList
    ) {
        this.packageSpecifier = "";
        this.simpleClassTypeSignature = simpleClassTypeSignature;
        this.classTypeSignatureSuffixList = classTypeSignatureSuffixList;
    }

    @Override
    public String desc() {
        StringBuilder builder = new StringBuilder();

        builder.append(ClassNameUtils.slashToDot(packageSpecifier));
        builder.append(simpleClassTypeSignature.desc());
        classTypeSignatureSuffixList.forEach(classTypeSignatureSuffix -> {
            builder.append('.');
            builder.append(classTypeSignatureSuffix.desc());
        });

        return builder.toString();
    }
}
