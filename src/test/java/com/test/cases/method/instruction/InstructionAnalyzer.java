package com.test.cases.method.instruction;

import com.test.util.GeneratedClassClassLoader;
import com.test.util.InstructionUtils;
import com.test.util.WideDecoratedInstructionUtils;

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
            OperandStackManagementInstructionsCase.class,
            TypeConversionInstructionsCase.class,
            ObjectCreationAndManipulationInstructionsCase.class,
            ControlTransferInstructionsCase.class,
            TableSwitchInstructionCase.class,
            LookupSwitchInstructionCase.class,
            MethodInvocationAndReturnInstructionsCase.class,
            InvokeInterfaceInstructionCase.class,
            ThrowingExceptionsInstructionCase.class,
            SynchronizationInstructionsCase.class
    );

    static Set<Class<?>> find() throws ClassNotFoundException {
        Set<Class<?>> result = new HashSet<>(classes);
        ClassLoader classLoader = new GeneratedClassClassLoader();

        List<String> specifiedClassNames = List.of(
                "com.generated.cases.method.instruction.DupX2Case",
                "com.generated.cases.method.instruction.Dup2Case",
                "com.generated.cases.method.instruction.Dup2X1Case",
                "com.generated.cases.method.instruction.Dup2X2Case",
                "com.generated.cases.method.instruction.SwapCase"
        );
        for (String className : specifiedClassNames) {
            result.add(classLoader.loadClass(className));
        }

        return result;
    }

    default Map<Integer, WideDecoratedInstruction> buildWideDecoratedInstructionMap() {
        Method[] methods = this.getClass().getMethods();

        Map<Integer, WideDecoratedInstruction> instructionMap = new HashMap<>();
        for (Method method : methods) {
            instructionMap.putAll(WideDecoratedInstructionUtils.analyze(method));
        }

        return instructionMap;
    }

    default Map<Integer, Instruction> buildInstructionMap() {
        Method[] methods = this.getClass().getDeclaredMethods();

        Map<Integer, Instruction> instructionMap = new HashMap<>();
        for (Method method : methods) {
            instructionMap.putAll(InstructionUtils.analyze(method));
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
