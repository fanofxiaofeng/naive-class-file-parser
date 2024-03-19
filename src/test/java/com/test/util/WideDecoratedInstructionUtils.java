package com.test.util;

import com.test.cases.method.instruction.WideDecoratedInstruction;
import com.test.cases.method.instruction.WideDecoratedInstructionHolder;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class WideDecoratedInstructionUtils {
    public static Map<Integer, WideDecoratedInstruction> analyze(Method method) {
        Map<Integer, WideDecoratedInstruction> instructionMap = new HashMap<>();

        if (method.isAnnotationPresent(WideDecoratedInstructionHolder.class)) {
            WideDecoratedInstructionHolder instructionHolder = method.getAnnotation(WideDecoratedInstructionHolder.class);
            for (WideDecoratedInstruction instruction : instructionHolder.value()) {
                instructionMap.put(instruction.value(), instruction);
            }
        } else if (method.isAnnotationPresent(WideDecoratedInstruction.class)) {
            WideDecoratedInstruction instruction = method.getAnnotation(WideDecoratedInstruction.class);
            instructionMap.put(instruction.value(), instruction);
        }

        return instructionMap;
    }
}
