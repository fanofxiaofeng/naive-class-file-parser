package com.study.present.attribute;

import com.study.parser.ParseResult;
import com.study.present.attribute.ev.ElementValuePresenter;
import com.study.type.U2;
import com.study.type.descriptor.DescriptorBuilder;
import com.study.type.descriptor.FieldDescriptor;
import com.study.type.descriptor.FieldDescriptorBuilder;
import com.study.type.descriptor.FieldType;
import com.study.type.info.ElementValue;
import com.study.type.info.attribute.Annotation;
import com.study.util.PrintStreamWrapper;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.List;

public class AnnotationPresenter extends AbstractAttributePresenter {

    private final Annotation annotation;

    private final int index;

    public AnnotationPresenter(
            ParseResult result,
            PrintStreamWrapper printStreamWrapper,
            Annotation annotation,
            int index,
            int baseIndentLevel
    ) {
        super(result, printStreamWrapper, baseIndentLevel);
        this.annotation = annotation;
        this.index = index;
    }

    @Override
    public int present() {
        int cnt1 = printStreamWrapper.getPrintlnCount();

        presentHeaderLine();
        presentDetails();

        int cnt2 = printStreamWrapper.getPrintlnCount();
        return cnt2 - cnt1;
    }

    private void presentHeaderLine() {
        String pairDescription = buildPairDescription();
        String headerLineFormat = "%s: #%s(%s)";
        U2 typeIndex = annotation.typeIndex();
        printStreamWrapper.printlnWithIndentLevel(
                String.format(headerLineFormat,
                        index,
                        typeIndex.toInt(),
                        pairDescription
                ),
                baseIndentLevel
        );
    }

    private void presentDetails() {
        U2 typeIndex = annotation.typeIndex();
        String typeDesc = buildTypeDesc(typeIndex);
        if (annotation.elementValuePairs().isEmpty()) {
            printStreamWrapper.printlnWithIndentLevel(typeDesc, baseIndentLevel + 1);
            return;
        }

        printStreamWrapper.printlnWithIndentLevel(typeDesc + "(", baseIndentLevel + 1);

        annotation.elementValuePairs().forEach(pair -> {
            U2 elementNameIndex = pair.getKey();
            ElementValue elementValue = pair.getValue();
            ElementValuePresenter.build(
                    result,
                    printStreamWrapper,
                    elementNameIndex,
                    elementValue,
                    baseIndentLevel + 2
            ).present();
        });

        printStreamWrapper.printlnWithIndentLevel(")", baseIndentLevel + 1);
    }

    private String buildPairDescription() {
        List<Pair<U2, ElementValue>> pairs = annotation.elementValuePairs();
        if (pairs.isEmpty()) {
            return "";
        }

        List<String> pairDescriptionList = new ArrayList<>(pairs.size());
        pairs.forEach(pair -> pairDescriptionList.add(pair.getValue().desc(pair.getKey())));
        return String.join(",", pairDescriptionList);
    }

    private String buildTypeDesc(U2 typeIndex) {
        DescriptorBuilder<FieldDescriptor> fieldDescriptorBuilder = new FieldDescriptorBuilder();
        FieldDescriptor fieldDescriptor = fieldDescriptorBuilder.build(result.getConstantPool(), typeIndex);
        FieldType fieldType = fieldDescriptor.fieldType();
        return fieldType.desc();
    }
}
