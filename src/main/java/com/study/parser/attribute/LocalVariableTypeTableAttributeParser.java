package com.study.parser.attribute;

import com.study.io.U1InputStream;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.info.attribute.AbstractLocalVariableBasedTableAttribute;
import com.study.type.info.attribute.LocalVariableTypeTableAttribute;

import java.util.List;

public class LocalVariableTypeTableAttributeParser extends AttributeParser<LocalVariableTypeTableAttribute> {
    public LocalVariableTypeTableAttributeParser(U2 attributeNameIndex, U4 attributeLength, U1InputStream infoStream) {
        super(attributeNameIndex, attributeLength, infoStream);
    }

    @Override
    public LocalVariableTypeTableAttribute parse() {
        U2 localVariableTypeTableLength = infoStream.readU2();
        List<AbstractLocalVariableBasedTableAttribute.LocalVariableBasedInfo> localVariableTypeTable =
                localVariableTypeTableLength.mapToList(this::buildLocalVariableBasedInfo);
        return new LocalVariableTypeTableAttribute(attributeNameIndex, attributeLength, localVariableTypeTable);
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
