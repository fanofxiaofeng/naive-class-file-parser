package com.study.present;

import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.constant.leaf.ConstantUtf8;
import com.study.type.descriptor.FieldDescriptor;
import com.study.type.descriptor.FieldDescriptorBuilder;
import com.study.type.info.FieldInfo;
import com.study.type.info.attribute.SignatureAttribute;
import com.study.util.PrintStreamWrapper;

import java.util.Optional;

public class FieldHeaderLinePresenter extends AbstractPresenter {

    private final FieldInfo fieldInfo;

    private static final int INDENT_LEVEL = 1;

    protected FieldHeaderLinePresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, FieldInfo fieldInfo) {
        super(result, printStreamWrapper);
        this.fieldInfo = fieldInfo;
    }

    @Override
    public int present() {
        int cnt1 = printStreamWrapper.getPrintlnCount();

        String headerLine = build();
        printStreamWrapper.printlnWithIndentLevel(headerLine, INDENT_LEVEL);

        int cnt2 = printStreamWrapper.getPrintlnCount();
        return cnt2 - cnt1;
    }

    public String build() {
        ConstantPool constantPool = result.getConstantPool();
        ConstantUtf8 name = constantPool.get(fieldInfo.getNameIndex(), ConstantUtf8.class);

        Optional<SignatureAttribute> optionalSignature = fieldInfo.findSignatureAttribute();

        FieldDescriptorBuilder fieldDescriptorBuilder = new FieldDescriptorBuilder();
        FieldDescriptor fieldDescriptor = fieldDescriptorBuilder.build(constantPool, fieldInfo.getDescriptorIndex());

        String s = optionalSignature.isPresent() ?
                fieldInfo.toHumanReadable(optionalSignature.get(), constantPool) :
                fieldInfo.toHumanReadable(fieldDescriptor);

        HumanReadableStructure structure =
                new HumanReadableStructure(fieldInfo.buildHumanReadableFlagsDesc(), s, name.desc());

        return structure.toString();
    }

    class HumanReadableStructure {

        private final String flagsDesc;
        private final String typeDesc;
        private final String desc;


        private HumanReadableStructure(String flagsDesc, String typeDesc, String desc) {
            this.flagsDesc = flagsDesc;
            this.typeDesc = typeDesc;
            this.desc = desc;
        }

        @Override
        public String toString() {
            return FieldHeaderLinePresenter.this.buildHeaderLine(flagsDesc, typeDesc, desc);
        }
    }
}

