package com.study.present.attribute;

import com.study.parser.ParseResult;
import com.study.present.AbstractPresenter;
import com.study.present.Presenter;
import com.study.type.info.attribute.*;
import com.study.util.PrintStreamWrapper;

public abstract class AbstractAttributePresenter<T> extends AbstractPresenter {

    protected T attribute;

    protected final int baseIndentLevel;

    protected AbstractAttributePresenter(ParseResult result,
                                         PrintStreamWrapper printStreamWrapper,
                                         T attribute,
                                         int baseIndentLevel
    ) {
        super(result, printStreamWrapper);
        this.attribute = attribute;
        this.baseIndentLevel = baseIndentLevel;
    }

    public static <T extends AttributeInfo> Presenter build(ParseResult result,
                                                            PrintStreamWrapper printStreamWrapper,
                                                            T attribute,
                                                            int baseIndentLevel
    ) {
        if (attribute instanceof RuntimeVisibleAnnotationsAttribute specified) {
            return new RuntimeVisibleAnnotationAttributePresenter(result, printStreamWrapper, specified, baseIndentLevel);
        }
        if (attribute instanceof RuntimeInvisibleAnnotationsAttribute specified) {
            return new RuntimeInvisibleAnnotationsAttributePresenter(result, printStreamWrapper, specified, baseIndentLevel);
        }
        if (attribute instanceof DeprecatedAttribute specified) {
            return new DeprecatedAttributePresenter(result, printStreamWrapper, specified, baseIndentLevel);
        }
        if (attribute instanceof ConstantValueAttribute specified) {
            return new ConstantValueAttributePresenter(result, printStreamWrapper, specified, baseIndentLevel);
        }
        if (attribute instanceof SourceFileAttribute specified) {
            return new SourceFileAttributePresenter(result, printStreamWrapper, specified, baseIndentLevel);
        }
        if (attribute instanceof ExceptionsAttribute specified) {
            return new ExceptionsAttributePresenter(result, printStreamWrapper, specified, baseIndentLevel);
        }
        if (attribute instanceof InnerClassesAttribute specified) {
            return new InnerClassesAttributePresenter(result, printStreamWrapper, specified, baseIndentLevel);
        }
        if (attribute instanceof EnclosingMethodAttribute specified) {
            return new EnclosingMethodAttributePresenter(result, printStreamWrapper, specified, baseIndentLevel);
        }
        if (attribute instanceof SyntheticAttribute specified) {
            return new SyntheticAttributePresenter(result, printStreamWrapper, specified, baseIndentLevel);
        }
        if (attribute instanceof BootstrapMethodsAttribute specified) {
            return new BootstrapMethodsAttributePresenter(result, printStreamWrapper, specified, baseIndentLevel);
        }
        if (attribute instanceof SignatureAttribute specified) {
            return new SignatureAttributePresenter(result, printStreamWrapper, specified, baseIndentLevel);
        }
        if (attribute instanceof PermittedSubclassesAttribute specified) {
            return new PermittedSubclassesAttributePresenter(result, printStreamWrapper, specified, baseIndentLevel);
        }
        if (attribute instanceof CodeAttribute specified) {
            return new CodeAttributePresenter(result, printStreamWrapper, specified, baseIndentLevel);
        }
        if (attribute instanceof NestHostAttribute specified) {
            return new NestHostAttributePresenter(result, printStreamWrapper, specified, baseIndentLevel);
        }
        if (attribute instanceof NestMembersAttribute specified) {
            return new NestMembersAttributePresenter(result, printStreamWrapper, specified, baseIndentLevel);
        }

        return () -> 0;
    }
}
