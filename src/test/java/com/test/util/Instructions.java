package com.test.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class Instructions {

    private static final Logger logger = LoggerFactory.getLogger(Instructions.class);

    private static final Map<String, Integer> nameToOrder = Map.<String, Integer>ofEntries(
            Map.entry("aconst_null", 0x01),
            Map.entry("iconst_m1", 0x02),
            Map.entry("iconst_0", 0x03),
            Map.entry("iconst_1", 0x04),
            Map.entry("iconst_2", 0x05),
            Map.entry("iconst_3", 0x06),
            Map.entry("iconst_4", 0x07),
            Map.entry("iconst_5", 0x08),
            Map.entry("lconst_0", 0x09),
            Map.entry("lconst_1", 0x0a),
            Map.entry("fconst_0", 0x0b),
            Map.entry("fconst_1", 0x0c),
            Map.entry("fconst_2", 0x0d),
            Map.entry("dconst_0", 0x0e),
            Map.entry("dconst_1", 0x0f),
            Map.entry("bipush", 0x10),
            Map.entry("sipush", 0x11),
            Map.entry("ldc", 0x12),
            Map.entry("iload", 0x15),
            Map.entry("lload", 0x16),
            Map.entry("fload", 0x17),
            Map.entry("dload", 0x18),
            Map.entry("aload", 0x19),
            Map.entry("iload_0", 0x1a),
            Map.entry("iload_1", 0x1b),
            Map.entry("iload_2", 0x1c),
            Map.entry("iload_3", 0x1d),
            Map.entry("lload_0", 0x1e),
            Map.entry("lload_1", 0x1f),
            Map.entry("lload_2", 0x20),
            Map.entry("lload_3", 0x21),
            Map.entry("fload_0", 0x22),
            Map.entry("fload_1", 0x23),
            Map.entry("fload_2", 0x24),
            Map.entry("fload_3", 0x25),
            Map.entry("dload_0", 0x26),
            Map.entry("dload_1", 0x27),
            Map.entry("dload_2", 0x28),
            Map.entry("dload_3", 0x29),
            Map.entry("aload_0", 0x2a),
            Map.entry("aload_1", 0x2b),
            Map.entry("aload_2", 0x2c),
            Map.entry("aload_3", 0x2d),
            Map.entry("iaload", 0x2e),
            Map.entry("laload", 0x2f),
            Map.entry("faload", 0x30),
            Map.entry("daload", 0x31),
            Map.entry("aaload", 0x32),
            Map.entry("baload", 0x33),
            Map.entry("caload", 0x34),
            Map.entry("saload", 0x35),
            Map.entry("istore", 0x36),
            Map.entry("lstore", 0x37),
            Map.entry("fstore", 0x38),
            Map.entry("dstore", 0x39),
            Map.entry("astore", 0x3a),
            Map.entry("istore_0", 0x3b),
            Map.entry("istore_1", 0x3c),
            Map.entry("istore_2", 0x3d),
            Map.entry("istore_3", 0x3e),
            Map.entry("lstore_0", 0x3f),
            Map.entry("lstore_1", 0x40),
            Map.entry("lstore_2", 0x41),
            Map.entry("lstore_3", 0x42),
            Map.entry("fstore_0", 0x43),
            Map.entry("fstore_1", 0x44),
            Map.entry("fstore_2", 0x45),
            Map.entry("fstore_3", 0x46),
            Map.entry("dstore_0", 0x47),
            Map.entry("dstore_1", 0x48),
            Map.entry("dstore_2", 0x49),
            Map.entry("dstore_3", 0x4a),
            Map.entry("astore_0", 0x4b),
            Map.entry("astore_1", 0x4c),
            Map.entry("astore_2", 0x4d),
            Map.entry("astore_3", 0x4e),
            Map.entry("iastore", 0x4f),
            Map.entry("lastore", 0x50),
            Map.entry("fastore", 0x51),
            Map.entry("dastore", 0x52),
            Map.entry("aastore", 0x53),
            Map.entry("bastore", 0x54),
            Map.entry("castore", 0x55),
            Map.entry("sastore", 0x56),
            Map.entry("pop", 0x57),
            Map.entry("pop2", 0x58),
            Map.entry("dup", 0x59),
            Map.entry("dup_x1", 0x5a),
            Map.entry("dup_x2", 0x5b),
            Map.entry("dup2", 0x5c),

            Map.entry("iadd", 0x60),
            Map.entry("ladd", 0x61),
            Map.entry("fadd", 0x62),
            Map.entry("dadd", 0x63),
            Map.entry("isub", 0x64),
            Map.entry("lsub", 0x65),
            Map.entry("fsub", 0x66),
            Map.entry("dsub", 0x67),
            Map.entry("imul", 0x68),
            Map.entry("lmul", 0x69),
            Map.entry("fmul", 0x6a),
            Map.entry("dmul", 0x6b),
            Map.entry("idiv", 0x6c),
            Map.entry("ldiv", 0x6d),
            Map.entry("fdiv", 0x6e),
            Map.entry("ddiv", 0x6f),
            Map.entry("irem", 0x70),
            Map.entry("lrem", 0x71),
            Map.entry("frem", 0x72),
            Map.entry("drem", 0x73),
            Map.entry("ineg", 0x74),
            Map.entry("lneg", 0x75),
            Map.entry("fneg", 0x76),
            Map.entry("dneg", 0x77),
            Map.entry("ishl", 0x78),
            Map.entry("lshl", 0x79),
            Map.entry("ishr", 0x7a),
            Map.entry("lshr", 0x7b),
            Map.entry("iushr", 0x7c),
            Map.entry("lushr", 0x7d),
            Map.entry("iand", 0x7e),
            Map.entry("land", 0x7f),
            Map.entry("ior", 0x80),
            Map.entry("lor", 0x81),
            Map.entry("ixor", 0x82),
            Map.entry("lxor", 0x83),
            Map.entry("iinc", 0x84),

            Map.entry("lcmp", 0x94),
            Map.entry("fcmpl", 0x95),
            Map.entry("fcmpg", 0x96),
            Map.entry("dcmpl", 0x97),
            Map.entry("dcmpg", 0x98)
    );

    public static int getOrder(String instructionName) {
        if (!nameToOrder.containsKey(instructionName)) {
            String message = String.format("Unknown instructionName: %s", instructionName);
            logger.error(message);
            // todo: do not return -1
            return -1;
//            throw new IllegalArgumentException(message);
        }

        return nameToOrder.get(instructionName);
    }
}
