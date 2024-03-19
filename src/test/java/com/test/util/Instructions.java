package com.test.util;

import com.test.cases.method.instruction.Instruction;
import com.test.cases.method.instruction.InstructionAnalyzer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class Instructions {

    private static final Logger logger = LoggerFactory.getLogger(Instructions.class);

    private static final Map<String, Integer> nameToOrder = new HashMap<>();

    static {
        try {
            for (Class<?> clazz : InstructionAnalyzer.find()) {
                if (clazz.isInterface()) {
                    continue;
                }
                InstructionAnalyzer instructionAnalyzer = (InstructionAnalyzer) clazz.getConstructor().newInstance();
                Map<Integer, Instruction> map = instructionAnalyzer.buildInstructionMap();
                map.values().forEach(instruction -> nameToOrder.put(instruction.name(), instruction.value()));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

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
