package com.test.util;

import com.test.cases.method.instruction.Instruction;
import com.test.cases.method.instruction.InstructionHolder;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class InstructionUtils {
    public static Map<Integer, Instruction> analyze(Method method) {
        Map<Integer, Instruction> instructionMap = new HashMap<>();

        if (method.isAnnotationPresent(InstructionHolder.class)) {
            InstructionHolder instructionHolder = method.getAnnotation(InstructionHolder.class);
            for (Instruction instruction : instructionHolder.value()) {
                instructionMap.put(instruction.value(), instruction);
            }
        } else if (method.isAnnotationPresent(Instruction.class)) {
            Instruction instruction = method.getAnnotation(Instruction.class);
            instructionMap.put(instruction.value(), instruction);
        }

        return instructionMap;
    }
}
