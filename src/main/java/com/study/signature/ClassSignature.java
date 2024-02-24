package com.study.signature;

import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * Please refer to the following section for more details
 * <a href="https://docs.oracle.com/javase/specs/jvms/se21/html/jvms-4.html#jvms-4.7.9.1">4.7.9.1. Signatures</a>
 */
public record ClassSignature(List<TypeParameter> typeParameters,
                             ClassTypeSignature superclassSignature,
                             List<ClassTypeSignature> superinterfaceSignature
) implements Signature {
    // ClassSignature:
    //   [TypeParameters] SuperclassSignature {SuperinterfaceSignature}
    // TypeParameters:
    //   < TypeParameter {TypeParameter} >


    public String desc(boolean isInterface) {
        List<String> typeParameterDescList = buildTypeParameterDescList();

        String partOne = buildPartOne(typeParameterDescList);
        String partThree = buildPartThree(isInterface);

        StringJoiner combined = new StringJoiner(" ");
        if (!partOne.isEmpty()) {
            combined.add(partOne);
        }
        if (!isInterface) {
            String partTwo = String.format("extends %s", superclassSignature.desc());
            if (!partTwo.isEmpty()) {
                combined.add(partTwo);
            }
        }
        if (!partThree.isEmpty()) {
            combined.add(partThree);
        }

        if (combined.toString().startsWith("<")) {
            return combined.toString();
        }

        return " " + combined;
    }

    private String buildPartThree(boolean isInterface) {
        if (superinterfaceSignature.isEmpty()) {
            return "";
        }

        StringJoiner joiner = new StringJoiner(", ");
        superinterfaceSignature.forEach(e -> joiner.add(e.desc()));
        String verb = isInterface ? "extends" : "implements";
        return String.format("%s %s", verb, joiner);
    }

    private String buildPartOne(List<String> typeParameterDescList) {
        if (typeParameterDescList.isEmpty()) {
            return "";
        }

        return String.format("<%s>", String.join(", ", typeParameterDescList));
    }

    private List<String> buildTypeParameterDescList() {
        return typeParameters.stream().
                map(TypeParameter::desc).
                collect(Collectors.toList());
    }
}
