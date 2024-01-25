package com.study.type.descriptor;

import java.util.List;
import java.util.StringJoiner;

public class MethodDescriptor {

    private final List<FieldType> parameterDescriptors;
    private final Object returnDescriptor;

    public MethodDescriptor(List<FieldType> parameterDescriptors, FieldType returnDescriptor) {
        this.parameterDescriptors = parameterDescriptors;
        this.returnDescriptor = returnDescriptor;
    }

    public MethodDescriptor(List<FieldType> parameterDescriptors, VoidDescriptor returnDescriptor) {
        this.parameterDescriptors = parameterDescriptors;
        this.returnDescriptor = returnDescriptor;
    }

    public String buildParameterDescriptorsDesc() {
        StringJoiner joiner = new StringJoiner(", ");
        parameterDescriptors.forEach(e -> joiner.add(e.desc()));
        return String.format("(%s)", joiner);
    }

    public String buildParameterDescriptorsForCornerCases(boolean varargs, boolean enumConstructor) {
        if (!varargs && !enumConstructor) {
            return buildParameterDescriptorsDesc();
        }

        int parameterCount = parameterDescriptors.size();
        List<FieldType> fieldTypes =
                enumConstructor ?
                        parameterDescriptors.subList(2, parameterCount) :
                        parameterDescriptors;

        StringJoiner joiner = new StringJoiner(", ");
        if (varargs) {
            fieldTypes.subList(0, parameterCount - 1).forEach(e -> joiner.add(e.desc()));
            String descForLastParameter = ((ArrayType) fieldTypes.get(parameterCount - 1)).descForVarArgs();
            joiner.add(descForLastParameter);
        } else {
            fieldTypes.forEach(e -> joiner.add(e.desc()));
        }
        return String.format("(%s)", joiner);
    }

    public String buildReturnDescriptorDesc() {
        if (returnDescriptor instanceof FieldType fieldType) {
            return fieldType.desc();
        }

        if (returnDescriptor instanceof VoidDescriptor voidDescriptor) {
            return voidDescriptor.desc();
        }

        String message =
                String.format(
                        "The class of returnDescriptor is: %s, we can not handle this type!",
                        returnDescriptor.getClass().getSimpleName()
                );
        throw new IllegalArgumentException(message);
    }
}
