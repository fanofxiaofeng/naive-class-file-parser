package com.study.present;

import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.constant.leaf.ConstantUtf8;
import com.study.type.descriptor.MethodDescriptor;
import com.study.type.descriptor.MethodDescriptorBuilder;
import com.study.type.info.attribute.AttributeInfo;
import com.study.type.info.MethodInfo;
import com.study.type.info.attribute.SignatureAttribute;
import com.study.util.PrintStreamWrapper;

import java.util.Optional;

public class MethodInfoPresenter extends AbstractPresenter {

    private final MethodInfo methodInfo;

    public MethodInfoPresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, MethodInfo methodInfo) {
        super(result, printStreamWrapper);
        this.methodInfo = methodInfo;
    }

    @Override
    public int present() {
        int cnt1 = printStreamWrapper.getPrintlnCount();

        ConstantPool constantPool = result.getConstantPool();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("  ");
        // todo 下一行是否正确有待确认
//        System.out.println(methodInfo.buildHumanReadableFlagsDesc());
//        stringBuilder.append(methodInfo.buildHumanReadableFlagsDesc());
//        stringBuilder.append(' ');
        ConstantUtf8 name = constantPool.get(methodInfo.getNameIndex(), ConstantUtf8.class);
        ConstantUtf8 descriptor = constantPool.get(methodInfo.getDescriptorIndex(), ConstantUtf8.class);

        Optional<SignatureAttribute> optionalSignature = methodInfo.findSignatureAttribute();
        MethodDescriptorBuilder methodDescriptorBuilder = new MethodDescriptorBuilder();
        MethodDescriptor methodDescriptor = methodDescriptorBuilder.build(constantPool, methodInfo.getDescriptorIndex());
        String s = optionalSignature.isPresent() ?
                methodInfo.toHumanReadable(optionalSignature.get(), constantPool) :
                methodInfo.toHumanReadable(methodDescriptor, constantPool);

        Presenter headerLinePresenter = new MethodHeaderLinePresenter(result, printStreamWrapper, methodInfo);
        headerLinePresenter.present();

        stringBuilder.append(' ');
        System.out.println(String.format("name: %s", name.desc()));
//        printStreamWrapper.printlnWithIndentLevel(2, methodDescriptor.de);
        stringBuilder.append(name.desc());
        stringBuilder.append("();");
        stringBuilder.append("\n    descriptor: ");
        stringBuilder.append(descriptor.desc());
//        stringBuilder.append(String.format("\n    %s\n", descAccessFlags()));
        for (AttributeInfo attribute : methodInfo.getAttributes()) {
            AttributeInfoPresenter attributeInfoPresenter =
                    new AttributeInfoPresenter(
                            result,
                            printStreamWrapper,
                            attribute,
                            2
                    );
            attributeInfoPresenter.present();
        }

        int cnt2 = printStreamWrapper.getPrintlnCount();
        return cnt2 - cnt1;
    }

}
