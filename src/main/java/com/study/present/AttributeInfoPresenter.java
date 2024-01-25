package com.study.present;

import com.study.parser.ParseResult;
import com.study.present.attribute.ConstantValueAttributePresenter;
import com.study.present.attribute.DeprecatedAttributePresenter;
import com.study.present.attribute.RuntimeVisibleAnnotationPresenter;
import com.study.type.info.attribute.AttributeInfo;
import com.study.type.info.attribute.ConstantValueAttribute;
import com.study.type.info.attribute.DeprecatedAttribute;
import com.study.type.info.attribute.RuntimeVisibleAnnotationsAttribute;
import com.study.util.PrintStreamWrapper;

public class AttributeInfoPresenter extends AbstractPresenter {

    private final AttributeInfo attributeInfo;

    private final int baseIndentLevel;

    protected AttributeInfoPresenter(
            ParseResult result,
            PrintStreamWrapper printStreamWrapper,
            AttributeInfo attributeInfo,
            int baseIndentLevel) {
        super(result, printStreamWrapper);
        this.attributeInfo = attributeInfo;
        this.baseIndentLevel = baseIndentLevel;
    }

    @Override
    public int present() {
        if (attributeInfo instanceof RuntimeVisibleAnnotationsAttribute attribute) {
            new RuntimeVisibleAnnotationPresenter(result, printStreamWrapper, attribute, baseIndentLevel).present();
        }
        if (attributeInfo instanceof DeprecatedAttribute attribute) {
            return new DeprecatedAttributePresenter(result, printStreamWrapper, attribute, baseIndentLevel).present();
        }
        if (attributeInfo instanceof ConstantValueAttribute attribute) {
            return new ConstantValueAttributePresenter(result, printStreamWrapper, attribute, baseIndentLevel).present();
        }
        System.out.println("Other cases need to be implemented...");
        return 0;
    }
}
