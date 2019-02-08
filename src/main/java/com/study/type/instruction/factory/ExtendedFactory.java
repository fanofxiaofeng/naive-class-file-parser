package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.instruction.AbstractCmd;
import com.study.type.instruction.ThreeByteCmd;

public class ExtendedFactory implements CmdFactory {
    private ExtendedFactory() {

    }

    private static ExtendedFactory instance = new ExtendedFactory();

    public static ExtendedFactory getInstance() {
        return instance;
    }

    @Override
    public AbstractCmd build(U1 ordinal, CodeInputStream codeInputStream) {
        switch (ordinal.toInt()) {
            case 0xc5: {
                return new AbstractCmd(ordinal) {
                    {
                        name = "multianewarray";
                        U1 indexByte1 = codeInputStream.readU1();
                        U1 indexByte2 = codeInputStream.readU1();
                        U1 dimensions = codeInputStream.readU1();
                    }

                    @Override
                    public int size() {
                        return 4;
                    }
                };
            }
            case 0xc6: {
                return new ThreeByteCmd(ordinal, "ifnull", codeInputStream);
            }
            case 0xc7: {
                return new ThreeByteCmd(ordinal, "ifnonnull", codeInputStream);
            }
            case 0xc8: {
                return new AbstractCmd(ordinal) {
                    {
                        name = "goto_w";
                        U1 branchByte1 = codeInputStream.readU1();
                        U1 branchByte2 = codeInputStream.readU1();
                        U1 branchByte3 = codeInputStream.readU1();
                        U1 branchByte4 = codeInputStream.readU1();
                    }

                    @Override
                    public int size() {
                        return 5;
                    }
                };
            }
            case 0xc9: {
                return new AbstractCmd(ordinal) {
                    {
                        name = "jsr_w";
                        U1 branchByte1 = codeInputStream.readU1();
                        U1 branchByte2 = codeInputStream.readU1();
                        U1 branchByte3 = codeInputStream.readU1();
                        U1 branchByte4 = codeInputStream.readU1();
                    }

                    @Override
                    public int size() {
                        return 5;
                    }
                };
            }
            default:
                throw new RuntimeException(String.format("ordinal: %s is not found!", ordinal));
        }
    }
}
