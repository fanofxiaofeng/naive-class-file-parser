package com.test.presenter.cp;

import com.study.constants.ConstantKind;
import com.test.generator.AbstractTestGenerator;
import com.test.generator.TestGenerator;

import java.io.IOException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.module.ModuleDescriptor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.runtime.ObjectMethods;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class TypeAllTestGenerator {
    public static void main(String[] args) throws IOException, ReflectiveOperationException {
        Set<Class<?>> classes = Set.of(
                Object.class,
                Double.class,
                Integer.class,
                Long.class,
                Number.class,
                Math.class,
                Random.class,
                Class.class,
                Enum.class,
                ElementType.class,
                String.class,
                ArrayList.class,
                List.class,
                HashMap.class,
                ModuleDescriptor.class,
                WeakReference.class,
                Field.class,
                Thread.class,
                ObjectMethods.class,
                java.lang.annotation.Annotation.class,
                Repeatable.class,
                Record.class,
                Function.class,
                Stream.class,
                OptionalInt.class,
                CallSite.class,
                LambdaMetafactory.class,
                MethodHandle.class,

                kotlin.Unit.class
        );

        AbstractTestGenerator.overrideExistingFile = true;
        for (Class<?> clazz : classes) {
            TestGenerator testGenerator =
                    new ConstantPoolTestGenerator(
                            clazz,
                            EnumSet.allOf(ConstantKind.class)
                    );
            testGenerator.generate();
        }
    }
}
