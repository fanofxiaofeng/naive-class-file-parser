package com.study.parser;

import com.study.io.BasicInputStream;
import com.study.type.ConstantPool;
import com.study.type.ItemsContainer;
import com.study.type.U2;
import com.study.type.info.attribute.AttributeInfo;
import com.study.type.info.FieldInfo;
import com.study.type.info.MethodInfo;

import java.util.function.BiFunction;

public class MainParser implements Parser<ParseResult> {

    /**
     * We use this {@link java.io.InputStream} to read from class files
     */
    private final BasicInputStream basicInputStream;

    /**
     * Parse result will be saved in it
     */
    private ParseResult parseResult;

    public MainParser(BasicInputStream basicInputStream) {
        this.basicInputStream = basicInputStream;
    }

    @Override
    public ParseResult parse() {
        parseResult = new ParseResult();

        parseMagic();

        parseVersion();

        parseConstantPool();

        parseAccessFlags();
        parseThisClass();
        parseSuperClass();

        parseInterfaces();

        parseFields();

        parseMethods();

        parseAttributes();

        makeSure();

        return parseResult;
    }

    private void parseMagic() {
        parseResult.setMagic(basicInputStream.readU4());
    }

    private void parseVersion() {
        parseResult.setMinorVersion(basicInputStream.readU2());
        parseResult.setMajorVersion(basicInputStream.readU2());
    }

    private void parseConstantPool() {
        ConstantPoolParser constantPoolParser = new ConstantPoolParser(basicInputStream);
        ConstantPool constantPool = constantPoolParser.parse();
        parseResult.setConstantPool(constantPool);
    }

    private void parseAccessFlags() {
        parseResult.setAccessFlags(basicInputStream.readU2());
    }

    private void parseThisClass() {
        parseResult.setThisClass(basicInputStream.readU2());
    }

    private void parseSuperClass() {
        parseResult.setSuperClass(basicInputStream.readU2());
    }

    private void parseInterfaces() {
        U2 interfacesCount = basicInputStream.readU2();
        parseResult.setInterfaces(basicInputStream.readU2List(interfacesCount.toInt()));
    }

    private void parseFields() {
        ItemsContainer<FieldInfo> fields = parseItemsContainer(FieldsParser::new);
        parseResult.setFields(fields);
    }

    private void parseMethods() {
        ItemsContainer<MethodInfo> methods = parseItemsContainer(MethodsParser::new);
        parseResult.setMethods(methods);
    }

    private void parseAttributes() {
        ItemsContainer<AttributeInfo> attributes = parseItemsContainer(AttributesParser::new);
        parseResult.setAttributes(attributes);
    }

    private <T> ItemsContainer<T> parseItemsContainer(
            BiFunction<BasicInputStream, ConstantPool, RelationParser<T>> parserGenerator
    ) {
        RelationParser<T> itemsContainer = parserGenerator.apply(basicInputStream, parseResult.getConstantPool());
        return itemsContainer.parse();
    }

    private void makeSure() {
        if (!basicInputStream.justFinished()) {
            throw new AssertionError();
        }
    }
}
