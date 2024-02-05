package com.study.present.attribute.ev;

import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.descriptor.FieldDescriptor;
import com.study.type.descriptor.FieldDescriptorBuilder;
import com.study.type.info.ElementValue;
import com.study.type.info.attribute.Annotation;
import com.study.util.PrintStreamWrapper;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.List;

public class CaseFourPresenter extends AbstractElementValuePresenter {

    public CaseFourPresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, U2 elementNameIndex, ElementValue elementValue, int baseIndentLevel) {
        super(result, printStreamWrapper, elementNameIndex, elementValue, baseIndentLevel);
    }

    @Override
    public String buildValue() {
        List<Pair<U2, ElementValue>> pairs =
                getElementValue(ElementValue.CaseFour.class).
                        getAnnotationValue().
                        elementValuePairs();

        String typeDesc = buildTypeDesc();
        if (pairs.isEmpty()) {
            return "@" + typeDesc;
        }

        List<String> pairDescriptions = new ArrayList<>(pairs.size());
        pairs.forEach(pair -> {
            String key = result.getConstantPool().desc(pair.getKey());
            AbstractElementValuePresenter elementValuePresenter =
                    ElementValuePresenterBuilder.build(
                            result,
                            printStreamWrapper,
                            pair.getKey(),
                            pair.getValue(),
                            baseIndentLevel + 1
                    );
            String value = elementValuePresenter.buildValue();
            String description = String.format("%s%s=%s", "  ".repeat(baseIndentLevel + 1), key, value);
            pairDescriptions.add(description);
        });

        return String.format("@%s(%s%s%s)",
                typeDesc,
                System.lineSeparator(),
                String.join(System.lineSeparator(), pairDescriptions),
                System.lineSeparator() + "  ".repeat(baseIndentLevel));
    }

    private String buildTypeDesc() {
        ConstantPool constantPool = result.getConstantPool();
        Annotation annotation = getElementValue(ElementValue.CaseFour.class).getAnnotationValue();
        FieldDescriptor fieldDescriptor = new FieldDescriptorBuilder().build(constantPool, annotation.typeIndex());
        return fieldDescriptor.fieldType().desc();
    }
}
