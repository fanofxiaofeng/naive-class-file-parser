package com.study.present.attribute;

import com.study.parser.ParseResult;
import com.study.present.AbstractPresenter;
import com.study.type.ConstantPool;
import com.study.type.info.attribute.Annotation;
import com.study.type.info.attribute.RuntimeVisibleAnnotationsAttribute;
import com.study.util.PrintStreamWrapper;

import java.util.List;
import java.util.stream.IntStream;

public class RuntimeVisibleAnnotationPresenter extends AbstractPresenter {

    private final RuntimeVisibleAnnotationsAttribute attribute;
    private final int baseIndentLevel;

    public RuntimeVisibleAnnotationPresenter(ParseResult result,
                                             PrintStreamWrapper printStreamWrapper,
                                             RuntimeVisibleAnnotationsAttribute attribute,
                                             int baseIndentLevel) {
        super(result, printStreamWrapper);
        this.attribute = attribute;
        this.baseIndentLevel = baseIndentLevel;
    }

    @Override
    public int present() {
        int cnt1 = printStreamWrapper.getPrintlnCount();

        presentHeaderLine();

        List<Annotation> annotations = attribute.getAnnotations();
        IntStream.range(0, annotations.size()).forEach(index -> new AnnotationPresenter(
                result,
                printStreamWrapper,
                annotations.get(index),
                index,
                baseIndentLevel + 1
        ).present());

        int cnt2 = printStreamWrapper.getPrintlnCount();
        return cnt2 - cnt1;
    }

    private void presentHeaderLine() {
        ConstantPool constantPool = result.getConstantPool();
        // The content should be
        // RuntimeVisibleAnnotations:
        String headerLine = constantPool.desc(attribute.getAttributeNameIndex()) + ":";
        printStreamWrapper.printlnWithIndentLevel(headerLine, baseIndentLevel);
    }
}
