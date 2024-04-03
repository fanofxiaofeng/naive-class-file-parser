package com.study.parser.attribute;

import com.study.io.U1InputStream;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.info.attribute.InnerClassesAttribute;

import java.util.List;

public class InnerClassesAttributeParser extends AttributeParser<InnerClassesAttribute> {

    public InnerClassesAttributeParser(U2 attributeNameIndex, U4 attributeLength, U1InputStream infoStream) {
        super(attributeNameIndex, attributeLength, infoStream);
    }

    @Override
    public InnerClassesAttribute parse() {
        U2 numberOfClasses = infoStream.readU2();
        List<InnerClassesAttribute.InnerClass> innerClasses = numberOfClasses.mapToList(this::parseInnerClass);
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
