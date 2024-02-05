package com.study.present.attribute;

import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.constant.CpInfo;
import com.study.type.constant.compound.CompoundCpInfo;
import com.study.type.constant.compound.ConstantMethodHandle;
import com.study.type.constant.leaf.LeafCpInfo;
import com.study.type.info.attribute.BootstrapMethodsAttribute;
import com.study.util.PrintStreamWrapper;

import java.util.stream.IntStream;

public class BootstrapMethodsAttributePresenter extends AbstractAttributePresenter<BootstrapMethodsAttribute> {

    public BootstrapMethodsAttributePresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, BootstrapMethodsAttribute attribute, int baseIndentLevel) {
        super(result, printStreamWrapper, attribute, baseIndentLevel);
    }

    @Override
    public void doPresent() {
        int size = attribute.getBootstrapMethods().size();
        printStreamWrapper.printlnWithIndentLevel(
                result.getConstantPool().desc(attribute.getAttributeNameIndex()) + ":",
                baseIndentLevel
        );
        IntStream.range(0, size).forEach(index -> {
            BootstrapMethodsAttribute.BootstrapMethod bootstrapMethod = attribute.getBootstrapMethods().get(index);
            printHeaderLine(index, bootstrapMethod);
            presentMethodArguments(bootstrapMethod);
        });
    }

    private void printHeaderLine(int index, BootstrapMethodsAttribute.BootstrapMethod bootstrapMethod) {
        ConstantPool constantPool = result.getConstantPool();
        U2 bootstrapMethodRef = bootstrapMethod.bootstrapMethodRef();
        ConstantMethodHandle constantMethodHandle = constantPool.get(bootstrapMethodRef, ConstantMethodHandle.class);

        String headerLine = String.format("%s: #%s %s", index, bootstrapMethodRef.toInt(), constantMethodHandle.detail(constantPool));
        printStreamWrapper.printlnWithIndentLevel(headerLine, baseIndentLevel + 1);
    }

    private void presentMethodArguments(BootstrapMethodsAttribute.BootstrapMethod bootstrapMethod) {
        printStreamWrapper.printlnWithIndentLevel("Method arguments:", baseIndentLevel + 2);
        bootstrapMethod.bootstrapArguments().forEach(argument -> {
            String argumentDescription = buildArgumentDescription(argument);
            printStreamWrapper.printlnWithIndentLevel(argumentDescription, baseIndentLevel + 3);
        });
    }

    private String buildArgumentDescription(U2 argument) {
        ConstantPool constantPool = result.getConstantPool();
        CpInfo cpInfo = constantPool.get(argument);
        if (cpInfo instanceof LeafCpInfo specified) {
            return String.format("#%s %s", argument.toInt(), specified.desc());
        }
        if (cpInfo instanceof CompoundCpInfo specified) {
            return String.format("#%s %s", argument.toInt(), specified.detail(constantPool));
        }
        throw new IllegalArgumentException();
    }
}
