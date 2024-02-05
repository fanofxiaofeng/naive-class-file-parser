package com.study.present;

import com.study.constants.ClassAccessFlags;
import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.util.PrintStreamWrapper;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;
import java.util.StringJoiner;

public class ClassFileHeaderLinePresenter extends AbstractPresenter {

    private static final Set<ClassAccessFlags> skippedFlags =
            EnumSet.of(
                    ClassAccessFlags.ACC_SUPER,
                    ClassAccessFlags.ACC_SYNTHETIC,
                    ClassAccessFlags.ACC_ANNOTATION,
                    ClassAccessFlags.ACC_ENUM
            );

    public ClassFileHeaderLinePresenter(ParseResult result, PrintStreamWrapper printStreamWrapper) {
        super(result, printStreamWrapper);
    }

    @Override
    public void doPresent() {
        String headerLine = buildHeaderLine();
        printStreamWrapper.println(headerLine);
    }

    public String buildHeaderLine() {
        String accessFlagsDesc = buildHumanReadableAccessFlagsDesc();

        String temp = result.getAccessFlags().isOn(ClassAccessFlags.ACC_INTERFACE.getFlag()) ?
                "" : "class";

        ConstantPool constantPool = result.getConstantPool();
        String thisClassDesc = constantPool.detail(result.getThisClass()).
                replace('/', '.');

        return smartJoin(accessFlagsDesc, temp, thisClassDesc);
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
