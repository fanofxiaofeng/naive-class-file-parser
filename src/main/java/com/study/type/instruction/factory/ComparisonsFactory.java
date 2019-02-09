package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.instruction.AbstractCmd;
import com.study.type.instruction.OneByteCmd;
import com.study.type.instruction.ThreeByteCmd;

public class ComparisonsFactory implements CmdFactory {
    private ComparisonsFactory() {

    }

    private static ComparisonsFactory instance = new ComparisonsFactory();

    public static ComparisonsFactory getInstance() {
        return instance;
    }

    @Override
    public AbstractCmd build(U1 ordinal, CodeInputStream codeInputStream) {
        switch (ordinal.toInt()) {
            case 0x94:
                return new OneByteCmd(ordinal, "lcmp");
            case 0x95:
                return new OneByteCmd(ordinal, "fcmpl");
            case 0x96:
                return new OneByteCmd(ordinal, "fcmpg");
            case 0x97:
                return new OneByteCmd(ordinal, "dcmpl");
            case 0x98:
                return new OneByteCmd(ordinal, "dcmpg");
            case 0x99: {
                return new ThreeByteCmd(ordinal, "ifeq", codeInputStream) {
                    @Override
                    public String desc(int index) {
                        return String.format("%10s: %-14s%s",
                                index,
                                name,
                                index + combine().toInt()
                        );
                    }
                };
            }
            case 0x9a: {
                return new ThreeByteCmd(ordinal, "ifne", codeInputStream) {
                    @Override
                    public String desc(int index) {
                        return String.format("%10s: %-14s%s",
                                index,
                                name,
                                index + combine().toInt()
                        );
                    }
                };
            }
            case 0x9b: {
                return new ThreeByteCmd(ordinal, "iflt", codeInputStream);
            }
            case 0x9c: {
                return new ThreeByteCmd(ordinal, "ifge", codeInputStream);
            }
            case 0x9d: {
                return new ThreeByteCmd(ordinal, "ifgt", codeInputStream);
            }
            case 0x9e: {
                return new ThreeByteCmd(ordinal, "ifle", codeInputStream);
            }
            case 0x9f: {
                return new ThreeByteCmd(ordinal, "if_icmpeq", codeInputStream);
            }
            case 0xa0: {
                return new ThreeByteCmd(ordinal, "if_icmpne", codeInputStream);
            }
            case 0xa1: {
                return new ThreeByteCmd(ordinal, "if_icmplt", codeInputStream);
            }
            case 0xa2:
                return new ThreeByteCmd(ordinal, "if_icmpge", codeInputStream) {
                    @Override
                    public String desc(int index) {
                        return String.format("%10s: %-14s%s",
                                index,
                                name,
                                index + combine().toInt());
                    }
                };
            case 0xa3:
                return new ThreeByteCmd(ordinal, "if_icmpgt", codeInputStream) {
                    @Override
                    public String desc(int index) {
                        return String.format("%10s: %-14s%s", index, name, index + combine().toInt());
                    }
                };
            case 0xa4: {
                return new ThreeByteCmd(ordinal, "if_icmple", codeInputStream);
            }
            case 0xa5: {
                return new ThreeByteCmd(ordinal, "if_acmpeq", codeInputStream);
            }
            case 0xa6: {
                return new ThreeByteCmd(ordinal, "if_acmpne", codeInputStream);
            }
            default:
                throw new RuntimeException(String.format("ordinal: %s is not found!", ordinal));
        }
    }
}
