package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.U4;
import com.study.type.instruction.AbstractCmd;
import com.study.type.instruction.OneByteCmd;
import com.study.type.instruction.ThreeByteCmd;
import com.study.type.instruction.TwoByteCmd;



public class ControlFactory implements CmdFactory {
    private ControlFactory() {

    }

    private static ControlFactory instance = new ControlFactory();

    public static ControlFactory getInstance() {
        return instance;
    }

    @Override
    public AbstractCmd build(U1 ordinal, CodeInputStream codeInputStream) {
        switch (ordinal.toInt()) {
            case 0xa7: {
                U1 b1 = codeInputStream.readU1();
                U1 b2 = codeInputStream.readU1();
                return new ThreeByteCmd(ordinal, "goto", b1, b2) {
                    @Override
                    public String desc(int index) {
                        return String.format("%10s: %-14s%s", index, name, index + combine().toInt());
                    }
                };
            }
            case 0xa8: {
                return new ThreeByteCmd(ordinal, "jsr", codeInputStream);
            }
            case 0xa9: {
                if (codeInputStream.isDecoratedByWide()) {
                    return new ThreeByteCmd(ordinal, "ret_w", codeInputStream);
                } else {
                    U1 _byte = codeInputStream.readU1();
                    return new TwoByteCmd(ordinal, "ret", _byte);
                }
            }
            case 0xaa: {
                int start = codeInputStream.getIndex();
                final int delta = start - 1;
                while (start % 4 != 0) {
                    U1 _zero = codeInputStream.readU1();
                    if (_zero.toInt() != 0) {
                        throw new AssertionError("tableswitch 指令解析失败!");
                    }
                    start++;
                }

                // todo 逻辑细节可能有问题
                U4 _default = codeInputStream.readU4();
                U4 low = codeInputStream.readU4();
                U4 high = codeInputStream.readU4();
                U4[] offset = new U4[high.toInt() - low.toInt() + 1];
                for (int i = low.toInt(); i <= high.toInt(); i++) {
                    offset[i - low.toInt()] = codeInputStream.readU4();
                }
                return new AbstractCmd(ordinal) {
                    {
                        name = "tableswitch";
                    }

                    @Override
                    public int size() {
                        return 0;
                    }

                    @Override
                    public String desc(int index) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(String.format("%10s: %s   { // %s to %s\n",
                                index,
                                name,
                                low.toInt(),
                                high.toInt()
                        ));
                        for (int i = low.toInt(); i <= high.toInt(); i++) {
                            stringBuilder.append(String.format("%10s%14s: %s\n",
                                    "",
                                    i,
                                    offset[i - low.toInt()].toInt() + delta));
                        }
                        stringBuilder.append(String.format("%10s       default: %s\n",
                                "",
                                _default.toInt() + delta
                        ));
                        stringBuilder.append(String.format("%10s  }\n", ""));
                        return stringBuilder.toString();
                    }
                };

            }
            case 0xab: {
                int start = codeInputStream.getIndex();
                final int delta = start - 1;
                while (start % 4 != 0) {
                    U1 _zero = codeInputStream.readU1();
                    if (_zero.toInt() != 0) {
                        throw new AssertionError("lookupswitch 指令解析失败!");
                    }
                    start++;
                }
                // todo 逻辑细节可能有问题
                U4 _default = codeInputStream.readU4();
                U4 nPairs = codeInputStream.readU4();
                U4[] match = new U4[nPairs.toInt()];
                U4[] offset = new U4[nPairs.toInt()];
                for (int i = 0; i < nPairs.toInt(); i++) {
                    match[i] = codeInputStream.readU4();
                    offset[i] = codeInputStream.readU4();
                }
//                System.out.println(Arrays.toString(match));
//                System.out.println(Arrays.toString(offset));
                return new AbstractCmd(ordinal) {
                    {
                        name = "lookupswitch";
                    }

                    @Override
                    public int size() {
                        return 0;
                    }

                    @Override
                    public String desc(int index) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(String.format("%10s: %s  { // %s\n",
                                index,
                                name,
                                nPairs.toInt()));
                        for (int i = 0; i < nPairs.toInt(); i++) {
                            stringBuilder.append(String.format("%10s%14s: %s\n",
                                    "",
                                    match[i].toInt(),
                                    offset[i].toInt() + delta));
                        }
                        stringBuilder.append(String.format("%10s       default: %s\n",
                                "",
                                _default.toInt() + delta
                        ));
                        stringBuilder.append(String.format("%10s  }\n", ""));
                        return stringBuilder.toString();
                    }
                };
            }
            case 0xac:
                return new OneByteCmd(ordinal, "ireturn");
            case 0xad:
                return new OneByteCmd(ordinal, "lreturn");
            case 0xae:
                return new OneByteCmd(ordinal, "freturn");
            // 0xaf
            case 0xaf: {
                return new OneByteCmd(ordinal, "dreturn");
            }
            // 0xb0
            case 0xb0: {
                return new OneByteCmd(ordinal, "areturn");
            }
            case 0xb1:
                return new OneByteCmd(ordinal, "return");
            default:
                throw new RuntimeException(String.format("ordinal: %s is not found!", ordinal));
        }
    }
}
