package com.study.present;

import com.study.constants.ClassAccessFlags;
import com.study.parser.ParseResult;
import com.study.signature.ClassSignature;
import com.study.signature.builder.SignatureFacade;
import com.study.type.ConstantPool;
import com.study.type.ItemsContainer;
import com.study.type.U2;
import com.study.type.info.attribute.AttributeInfo;
import com.study.type.info.attribute.SignatureAttribute;
import com.study.util.ClassNameUtils;
import com.study.util.PrintStreamWrapper;

import java.util.*;
import java.util.stream.Collectors;

public class ClassFileHeaderLinePresenter extends AbstractPresenter {

    private final boolean isInterface;

    private static final Set<ClassAccessFlags> skippedFlags =
            EnumSet.of(
                    ClassAccessFlags.ACC_SUPER,
                    ClassAccessFlags.ACC_SYNTHETIC,
                    ClassAccessFlags.ACC_ANNOTATION,
                    ClassAccessFlags.ACC_ENUM
            );

    public ClassFileHeaderLinePresenter(ParseResult result, PrintStreamWrapper printStreamWrapper) {
        super(result, printStreamWrapper);
        this.isInterface = result.getAccessFlags().isOn(ClassAccessFlags.ACC_INTERFACE.getFlag());
    }

    @Override
    public void doPresent() {
        String headerLine = buildHeaderLine();
        printStreamWrapper.println(headerLine);
    }

    public String buildHeaderLine() {
        String accessFlagsDesc = buildHumanReadableAccessFlagsDesc();

        String temp = isInterface ? "" : "class";

        ConstantPool constantPool = result.getConstantPool();
        String thisClassDesc = ClassNameUtils.slashToDot(constantPool.detail(result.getThisClass()));

        Optional<SignatureAttribute> optionalSignatureAttribute = findSignatureAttribute();

        String selfDesc = smartJoin(accessFlagsDesc, temp, thisClassDesc);
        if (optionalSignatureAttribute.isPresent()) {
            SignatureAttribute signatureAttribute = optionalSignatureAttribute.get();
            String raw = constantPool.desc(signatureAttribute.getSignatureIndex());
            ClassSignature classSignature = new SignatureFacade().buildClassSignature(raw);
            return selfDesc + classSignature.desc(isInterface);
        } else {
            return buildHeaderLine(selfDesc);
        }
    }

    private String buildHeaderLine(String selfDesc) {
        Optional<String> nonTrivialSuperClassDesc = buildNonTrivialSuperClassDesc();
        List<String> interfaceDescList = buildInterfaceDescList();

        String verb = isInterface ? "extends" : "implements";
        if (nonTrivialSuperClassDesc.isPresent()) {
            String headerLine = String.format("%s extends %s", selfDesc, nonTrivialSuperClassDesc.get());
            if (!interfaceDescList.isEmpty()) {
                headerLine =
                        String.format(
                                "%s implements %s",
                                headerLine,
                                String.join(",", interfaceDescList)
                        );
            }
            return headerLine;
        }

        if (interfaceDescList.isEmpty()) {
            return selfDesc;
        }
        return String.format(
                "%s %s %s",
                selfDesc,
                verb,
                String.join(",", interfaceDescList)
        );
    }

    private Optional<SignatureAttribute> findSignatureAttribute() {
        ItemsContainer<AttributeInfo> attributes = result.getAttributes();

        List<SignatureAttribute> rawResult = attributes.items().stream().
                filter(attributeInfo -> (attributeInfo instanceof SignatureAttribute)).
                map(a -> (SignatureAttribute) a).
                toList();

        if (rawResult.isEmpty()) {
            return Optional.empty();
        }

        return Optional.of(rawResult.get(0));
    }

    private List<String> buildInterfaceDescList() {
        ConstantPool constantPool = result.getConstantPool();

        return result.getInterfaces().stream().
                map(constantPool::detail).
                map(ClassNameUtils::slashToDot).
                collect(Collectors.toList());
    }

    private Optional<String> buildNonTrivialSuperClassDesc() {
        ConstantPool constantPool = result.getConstantPool();
        U2 superClassIndex = result.getSuperClass();
        if (superClassIndex.toInt() == 0) {
            return Optional.empty();
        }
        String detail = constantPool.detail(superClassIndex);
        if (detail.equals("java/lang/Object")) {
            return Optional.empty();
        }

        return Optional.of(ClassNameUtils.slashToDot(detail));
    }

    private String buildHumanReadableAccessFlagsDesc() {
        U2 accessFlags = result.getAccessFlags();
        int mod = accessFlags.toInt();
        StringJoiner joiner = new StringJoiner(" ");

        Arrays.stream(ClassAccessFlags.values()).
                filter(e -> !skippedFlags.contains(e)).
                filter(e -> {
                    if (e != ClassAccessFlags.ACC_ABSTRACT) {
                        return true;
                    }

                    // if "interface" flag is on and "abstract" is on,
                    // then there is no need to present "abstract" flag in the output
                    return (mod & ClassAccessFlags.ACC_INTERFACE.getFlag()) == 0;
                }).
                filter(e -> (mod & e.getFlag()) > 0).
                forEach(e -> joiner.add(e.getSimpleName()));

        return joiner.toString();
    }
}
