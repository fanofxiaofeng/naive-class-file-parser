package com.study.parser.attribute;

import com.study.io.U1InputStream;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.info.attribute.AbstractLocalVariableBasedTableAttribute;
import com.study.type.info.attribute.LocalVariableTableAttribute;

import java.util.List;

public class LocalVariableTableAttributeParser extends AttributeParser<LocalVariableTableAttribute> {
    public LocalVariableTableAttributeParser(U2 attributeNameIndex, U4 attributeLength, U1InputStream infoStream) {
        super(attributeNameIndex, attributeLength, infoStream);
    }

    @Override
    public LocalVariableTableAttribute parse() {
        U2 localVariableTableLength = infoStream.readU2();
        List<AbstractLocalVariableBasedTableAttribute.LocalVariableBasedInfo> localVariableTable =
                localVariableTableLength.mapToList(this::buildLocalVariableBasedInfo);
        return new LocalVariableTableAttribute(attributeNameIndex, attributeLength, localVariableTable);
    }

    private AbstractLocalVariableBasedTableAttribute.LocalVariableBasedInfo buildLocalVariableBasedInfo() {
        return new AbstractLocalVariableBasedTableAttribute.LocalVariableBasedInfo(
                infoStream.readU2(),
                infoStream.readU2(),
                infoStream.readU2(),
                infoStream.readU2(),
                infoStream.readU2()
        );
    }
}
