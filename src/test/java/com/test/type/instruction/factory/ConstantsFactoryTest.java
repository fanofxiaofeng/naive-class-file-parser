package com.test.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.constant.AbstractConstant;
import com.study.type.instruction.AbstractCmd;
import com.study.type.instruction.factory.ConstantsFactory;
import org.junit.Assert;
import org.junit.Test;

public class ConstantsFactoryTest {
    private ConstantsFactory factory = ConstantsFactory.getInstance();
    private AbstractConstant[] constantPool;
    private U1[] code;

    private AbstractCmd common(int value) {
        constantPool = new AbstractConstant[1];
        code = new U1[1];
        code[0] = new U1(value);
        CodeInputStream stream = new CodeInputStream(code);
        U1 ordinal = stream.readU1();
        return factory.build(ordinal, stream);
    }

    @Test
    public void build0x00() {
        String desc = common(0x00).desc(0);
        Assert.assertEquals("nop", desc);
    }

    @Test
    public void build0x01() {
        String desc = common(0x01).desc(0);
        Assert.assertEquals("aconst_null", desc);
    }

    @Test
    public void build0x02() {
        String desc = common(0x02).desc(0);
        Assert.assertEquals("iconst_m1", desc);
    }

    @Test
    public void build0x03_0x08() {
        int start = 0x03;
        for (int i = start; i <= 0x08; i++) {
            String desc = common(i).desc(0);
            Assert.assertEquals("iconst_" + (i - start), desc);
        }
    }

    @Test
    public void build0x09_0x0a() {
        int start = 0x09;
        for (int i = start; i <= 0x0a; i++) {
            String desc = common(i).desc(0);
            Assert.assertEquals("lconst_" + (i - start), desc);
        }
    }

    @Test
    public void build0x0b_0x0d() {
        int start = 0x0b;
        for (int i = start; i <= 0x0d; i++) {
            String desc = common(i).desc(0);
            Assert.assertEquals("fconst_" + (i - start), desc);
        }
    }

    @Test
    public void build0x0e_0x0f() {
        int start = 0x0e;
        for (int i = start; i <= 0x0f; i++) {
            String desc = common(i).desc(0);
            Assert.assertEquals("dconst_" + (i - start), desc);
        }
    }

    @Test
    public void build0x10() {
        constantPool = new AbstractConstant[1];
        code = new U1[2];
        code[0] = new U1(0x10);
        code[1] = new U1(0x42);
        CodeInputStream stream = new CodeInputStream(code);
        U1 ordinal = stream.readU1();
        AbstractCmd cmd = factory.build(ordinal, stream);
        String desc = cmd.desc(0);
        StringBuilder target = new StringBuilder("bipush");

        System.out.println(desc);
    }
}
