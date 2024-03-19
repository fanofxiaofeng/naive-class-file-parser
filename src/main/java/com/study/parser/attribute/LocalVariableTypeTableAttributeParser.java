package com.study.parser.attribute;

import com.study.type.U2;
import com.study.type.info.attribute.AbstractLocalVariableBasedTableAttribute;
import com.study.type.info.attribute.LocalVariableTypeTableAttribute;
import com.study.type.info.attribute.RawAttributeInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class LocalVariableTypeTableAttributeParser extends AttributeParser<LocalVariableTypeTableAttribute> {
    public LocalVariableTypeTableAttributeParser(RawAttributeInfo rawAttributeInfo) {
        super(rawAttributeInfo);
    }

    @Override
    public LocalVariableTypeTableAttribute parse() {
        U2 localVariableTypeTableLength = infoStream.readU2();
        List<AbstractLocalVariableBasedTableAttribute.LocalVariableBasedInfo> localVariableTypeTable = new ArrayList<>(localVariableTypeTableLength.toInt());
        IntStream.range(0, localVariableTypeTableLength.toInt()).
                forEach(i -> localVariableTypeTable.add(buildLocalVariableBasedInfo()));

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
