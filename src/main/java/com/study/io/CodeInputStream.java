package com.study.io;

import com.study.type.U1;
import com.study.type.U4;
import com.study.type.instruction.AbstractCmd;
import org.apache.commons.lang3.tuple.Pair;

import java.util.Iterator;
import java.util.List;

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
public class CodeInputStream implements Iterable<Pair<Integer, AbstractCmd>> {

    private int index = 0;
    private U1[] code;

    public CodeInputStream(U1[] code) {
        this.code = code;
    }

    public CodeInputStream(List<U1> code) {
        this.code = code.toArray(new U1[]{});
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

    public final int getIndex() {
        return this.index;
    }

    @Override
    public Iterator<Pair<Integer, AbstractCmd>> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return canRead();
            }

            @Override
            public Pair<Integer, AbstractCmd> next() {
                int currentIndex = index;
                AbstractCmd cmd = AbstractCmd.build(CodeInputStream.this);
                return Pair.of(currentIndex, cmd);
            }
        };
    }
}
