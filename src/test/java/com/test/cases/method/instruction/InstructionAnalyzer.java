package com.test.cases.method.instruction;

import com.test.util.GeneratedClassClassLoader;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.IntStream;

public interface InstructionAnalyzer {

    Set<Class<?>> classes = Set.of(
            ArithmeticInstructionsCase.class,
            LoadAndStoreInstructionsDoubleCase.class,
            LoadAndStoreInstructionsFloatCase.class,
            LoadAndStoreInstructionsIntCase.class,
            LoadAndStoreInstructionsLongCase.class,
            LoadAndStoreInstructionsObjectCase.class,
            LoadAndStoreInstructionsWideCase.class,
            StackInstructionsCase.class
    );

    static Set<Class<?>> find() throws ClassNotFoundException {
        Set<Class<?>> result = new HashSet<>(classes);
        Class<?> c = new GeneratedClassClassLoader().loadClass("com.generated.cases.method.instruction.DupX2Case");
        result.add(c);
        c = new GeneratedClassClassLoader().loadClass("com.generated.cases.method.instruction.Dup2Case");
        result.add(c);
        return result;
    }

    default Map<Integer, WideDecoratedInstruction> buildWideDecoratedInstructionMap() {
        Method[] methods = this.getClass().getMethods();

        Map<Integer, WideDecoratedInstruction> instructionMap = new HashMap<>();
        for (Method method : methods) {
            if (method.isAnnotationPresent(WideDecoratedInstructionHolder.class)) {
                WideDecoratedInstructionHolder instructionHolder = method.getAnnotation(WideDecoratedInstructionHolder.class);
                for (WideDecoratedInstruction instruction : instructionHolder.value()) {
                    instructionMap.put(instruction.value(), instruction);
                }
            } else if (method.isAnnotationPresent(WideDecoratedInstruction.class)) {
                WideDecoratedInstruction instruction = method.getAnnotation(WideDecoratedInstruction.class);
                instructionMap.put(instruction.value(), instruction);
            }
        }

        return instructionMap;
    }

    default Map<Integer, Instruction> buildInstructionMap() {
        Method[] methods = this.getClass().getDeclaredMethods();

        Map<Integer, Instruction> instructionMap = new HashMap<>();
        for (Method method : methods) {
            if (method.isAnnotationPresent(InstructionHolder.class)) {
                InstructionHolder instructionHolder = method.getAnnotation(InstructionHolder.class);
                for (Instruction instruction : instructionHolder.value()) {
                    instructionMap.put(instruction.value(), instruction);
                }
            } else if (method.isAnnotationPresent(Instruction.class)) {
                Instruction instruction = method.getAnnotation(Instruction.class);
                instructionMap.put(instruction.value(), instruction);
            }
        }

        return instructionMap;
    }

    static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        Map<Integer, Instruction> instructionMap = new HashMap<>();
        for (Class<?> clazz : find()) {
            InstructionAnalyzer instructionAnalyzer = (InstructionAnalyzer) clazz.getConstructor().newInstance();
            instructionMap.putAll(instructionAnalyzer.buildInstructionMap());
        }

        int maxOrdinal = Collections.max(instructionMap.keySet());
        IntStream.rangeClosed(0, maxOrdinal).forEach(ordinal -> {
            if (instructionMap.containsKey(ordinal)) {
                Instruction instruction = instructionMap.get(ordinal);
//                System.out.printf("%s: %s (0x%02x)%n", instruction.name(), ordinal, ordinal);
                System.out.printf("Map.entry(\"%s\", 0x%02x),%n", instruction.name(), ordinal);
            } else {
                System.out.printf("// $$MISSING$$: %s (0x%02x)%n", ordinal, ordinal);
            }
        });
    }
}
