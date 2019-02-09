package com.study.io;

import com.study.parser.ConstantPoolHolder;
import com.study.type.U1;
import com.study.type.U4;
import com.study.type.instruction.AbstractCmd;

/**
 * Please refer to https://docs.oracle.com/javase/specs/jvms/se10/html/jvms-7.html
 * constants = '''
 * '''
 * <p>
 * loads = '''
 * '''
 * <p>
 * stores = '''
 * '''
 * <p>
 * stack = '''
 * '''
 * <p>
 * math = '''
 * '''
 * <p>
 * conversions = '''
 * '''
 * <p>
 * comparisons = '''
 * '''
 * <p>
 * control = '''
 * '''
 * <p>
 * references = '''
 * '''
 * <p>
 * extended = '''
 * 196 (0xc4)    wide
 * '''
 * <p>
 * reserved = '''
 * 202 (0xca)    breakpoint
 * 254 (0xfe)    impdep1
 * 255 (0xff)    impdep2
 * '''
 * <p>
 * table_list = [constants, loads, stores,
 * stack, math, conversions,
 * comparisons, conversions, control, references, extended, reserved]
 */
public class CodeInputStream extends ConstantPoolHolder {

    private int index = 0;
    private U1[] code;
    private boolean decoratedByWide = false;

    public CodeInputStream(U1[] code) {
        this.code = code;
    }

    public U1 readU1() {
        return code[index++];
    }

    public U4 readU4() {
        U1 a = readU1();
        U1 b = readU1();
        U1 c = readU1();
        U1 d = readU1();
        return new U4(a, b, c, d);
    }

    private boolean canRead() {
        return index < code.length;
    }

    public String process() {
        StringBuilder stringBuilder = new StringBuilder();
        while (canRead()) {
            int currentIndex = index;
            AbstractCmd cmd = AbstractCmd.build(this);
            if (cmd.getName().equals("wide")) {
                setDecoratedByWide(true);
            } else {
                setDecoratedByWide(false);
            }
            String desc = cmd.desc(currentIndex);
            if (cmd.hasDetail()) {
                stringBuilder.append(String.format("%-46s// %s\n", desc, cmd.detail()));
            } else {
                stringBuilder.append(String.format("%s\n", desc));
            }
        }
        return stringBuilder.toString();
    }

    public final int getIndex() {
        return this.index;
    }

    public boolean isDecoratedByWide() {
        return decoratedByWide;
    }

    public void setDecoratedByWide(boolean decoratedByWide) {
        this.decoratedByWide = decoratedByWide;
    }
}
