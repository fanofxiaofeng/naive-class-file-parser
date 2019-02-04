package com.study.type.instruction;

import com.study.io.CodeInputStream;
import com.study.parser.ConstantPoolHolder;
import com.study.type.U1;
import com.study.type.constant.AbstractConstant;
import com.study.type.instruction.factory.*;

public abstract class AbstractCmd extends ConstantPoolHolder {
    private U1 ordinal;
    protected String name;

    public AbstractCmd(U1 ordinal) {
        this.ordinal = ordinal;
    }

    public static AbstractCmd build(CodeInputStream codeInputStream) {
        U1 ordinal = codeInputStream.readU1();
        CmdFactory cmdFactory = factory(ordinal.toInt());
        AbstractCmd abstractCmd = cmdFactory.build(ordinal, codeInputStream);
//        if (abstractCmd != null) {
        return abstractCmd;
//        }
        // return abstractCmd;
//        switch (ordinal.toInt()) {
//            case 0x3b:
//            case 0x3c:
//            case 0x3d:
//            case 0x3e: {
//                return new CmdIStore(ordinal);
//            }
//            case 0x4b:
//            case 0x4c:
//            case 0x4d:
//            case 0x4e:
//                return new CmdAStore(ordinal);
//            case 0x99:
//            case 0x9a:
//            case 0x9b:
//            case 0x9c:
//            case 0x9d:
//            case 0x9e:
//                return new CmdIfCond(ordinal, codeInputStream);
//            default:
//                return new FakeCmd(ordinal);
//        }
    }


    private static CmdFactory factory(int ordinal) {
        // todo 每个类型的范围有待确认
        if (ordinal >= 0x00 && ordinal <= 0x14) {
            // CommandType.constants;
            return ConstantsFactory.getInstance();
        } else if (ordinal >= 0x15 && ordinal <= 0x35) {
            return LoadsFactory.getInstance();
        } else if (ordinal >= 0x36 && ordinal <= 0x56) {
            return StoresFactory.getInstance();
        } else if (ordinal >= 0x57 && ordinal <= 0x5f) {
            return StackFactory.getInstance();
        } else if (ordinal >= 0x60 && ordinal <= 0x84) {
            return MathFactory.getInstance();
        } else if (ordinal >= 0x85 && ordinal <= 0x93) {
            return ConversionsFactory.getInstance();
        } else if (ordinal >= 0x94 && ordinal <= 0xa6) {
            return ComparisonsFactory.getInstance();
        } else if (ordinal >= 0xa7 && ordinal <= 0xb1) {
            return ControlFactory.getInstance();
        } else if (ordinal >= 0xb2 && ordinal <= 0xc3) {
            return ReferencesFactory.getInstance();
        } else if (ordinal >= 0xc4 && ordinal <= 0xc9) {
            return ExtendedFactory.getInstance();
        } else {
            throw new RuntimeException("not supported yet!");
        }
    }

    public String desc(int index) {
        return name;
    }

    public boolean hasDetail() {
        return false;
    }

    public String detail(AbstractConstant[] constantPool) {
        return null;
    }

    protected void extentTo(StringBuilder stringBuilder) {
        while (stringBuilder.length() < 14) {
            stringBuilder.append(' ');
        }
    }

    public abstract int size();

    static enum CommandType {
        constants,
        loads,
        stores,
        stack,
        math,
        conversions,
        comparisons,
        control,
        references,
        extended,
        reserved
    }
}
