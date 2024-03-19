package com.study.parser.attribute;

import com.study.type.U2;
import com.study.type.info.attribute.AbstractLocalVariableBasedTableAttribute;
import com.study.type.info.attribute.LocalVariableTableAttribute;
import com.study.type.info.attribute.RawAttributeInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class LocalVariableTableAttributeParser extends AttributeParser<LocalVariableTableAttribute> {
    public LocalVariableTableAttributeParser(RawAttributeInfo rawAttributeInfo) {
        super(rawAttributeInfo);
    }

    @Override
    public LocalVariableTableAttribute parse() {
        U2 localVariableTableLength = infoStream.readU2();
        List<AbstractLocalVariableBasedTableAttribute.LocalVariableBasedInfo> localVariableTable = new ArrayList<>(localVariableTableLength.toInt());
        IntStream.range(0, localVariableTableLength.toInt()).
                forEach(i -> localVariableTable.add(buildLocalVariableBasedInfo()));

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
