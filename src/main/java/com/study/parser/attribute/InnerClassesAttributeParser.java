package com.study.parser.attribute;

import com.study.type.U2;
import com.study.type.info.attribute.InnerClassesAttribute;
import com.study.type.info.attribute.RawAttributeInfo;

import java.util.ArrayList;
import java.util.List;

public class InnerClassesAttributeParser extends AttributeParser<InnerClassesAttribute> {

    public InnerClassesAttributeParser(RawAttributeInfo rawAttributeInfo) {
        super(rawAttributeInfo);
    }

    @Override
    public InnerClassesAttribute parse() {
        U2 numberOfClasses = infoStream.readU2();
        List<InnerClassesAttribute.InnerClass> innerClasses = new ArrayList<>(numberOfClasses.toInt());

        numberOfClasses.forEach(index -> innerClasses.add(parseInnerClass()));

        return new InnerClassesAttribute(attributeNameIndex, attributeLength, innerClasses);
    }

    private InnerClassesAttribute.InnerClass parseInnerClass() {
        return new InnerClassesAttribute.InnerClass(
                infoStream.readU2(),
                infoStream.readU2(),
                infoStream.readU2(),
                infoStream.readU2()
        );
    }
}
