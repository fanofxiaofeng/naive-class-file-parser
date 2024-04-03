package com.study.parser.attribute;

import com.study.io.U1InputStream;
import com.study.parser.AttributeInfoParser;
import com.study.parser.Parser;
import com.study.type.ConstantPool;
import com.study.type.U1;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.info.attribute.AttributeInfo;
import com.study.type.info.attribute.CodeAttribute;

import java.util.List;

public class CodeAttributeParser extends AttributeParser<CodeAttribute> {

    private final ConstantPool constantPool;

    public CodeAttributeParser(ConstantPool constantPool, U2 attributeNameIndex, U4 attributeLength, U1InputStream infoStream) {
        super(attributeNameIndex, attributeLength, infoStream);
        this.constantPool = constantPool;
    }

    /**
     * Code_attribute {
     * u2 attribute_name_index;
     * u4 attribute_length;
     * u2 max_stack;
     * u2 max_locals;
     * u4 code_length;
     * u1 code[code_length];
     * u2 exception_table_length;
     * {   u2 start_pc;
     * u2 end_pc;
     * u2 handler_pc;
     * u2 catch_type;
     * } exception_table[exception_table_length];
     * u2 attributes_count;
     * attribute_info attributes[attributes_count];
     * }
     */
    @Override
    public CodeAttribute parse() {
        U2 maxStack = infoStream.readU2();
        U2 maxLocals = infoStream.readU2();
        U4 codeLength = infoStream.readU4();
        List<U1> code = infoStream.readU1List(codeLength.toInt());
        U2 exceptionTableLength = infoStream.readU2();
        ExceptionTableParser exceptionTableParser = new ExceptionTableParser(infoStream);
        List<CodeAttribute.ExceptionTable> exceptionTableList =
                exceptionTableLength.mapToList(exceptionTableParser::parse);

        U2 attributesCount = infoStream.readU2();
        List<AttributeInfo> attributes = attributesCount.mapToList(() -> new AttributeInfoParser(infoStream, constantPool).parse());
        return new CodeAttribute(attributeNameIndex, attributeLength, maxStack, maxLocals, code, exceptionTableList, attributes);
    }

    private record ExceptionTableParser(U1InputStream u1InputStream) implements Parser<CodeAttribute.ExceptionTable> {

        @Override
        public CodeAttribute.ExceptionTable parse() {
            U2 startPc = u1InputStream.readU2();
            U2 endPc = u1InputStream.readU2();
            U2 handlerPc = u1InputStream.readU2();
            U2 catchType = u1InputStream.readU2();
            return new CodeAttribute.ExceptionTable(startPc, endPc, handlerPc, catchType);
        }
    }
}
