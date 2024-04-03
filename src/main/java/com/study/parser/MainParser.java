package com.study.parser;

import com.study.io.ContentReader;
import com.study.type.ConstantPool;
import com.study.type.ItemsContainer;
import com.study.type.U2;
import com.study.type.info.attribute.AttributeInfo;
import com.study.type.info.FieldInfo;
import com.study.type.info.MethodInfo;

import java.util.function.BiFunction;

/**
 * Please refer to the following link for more details for the structure of class file
 * <a href="https://docs.oracle.com/javase/specs/jvms/se21/html/jvms-4.html">4.1. The ClassFile Structure</a>
 */
public class MainParser implements Parser<ParseResult> {

    /**
     * We use it to read from class files
     */
    private final ContentReader contentReader;

    /**
     * Parse result will be saved in it
     */
    private ParseResult parseResult;

    public MainParser(ContentReader contentReader) {
        this.contentReader = contentReader;
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

        ensureCompleted();

        return parseResult;
    }

    private void parseMagic() {
        parseResult.setMagic(contentReader.readU4());
    }

    private void parseVersion() {
        parseResult.setMinorVersion(contentReader.readU2());
        parseResult.setMajorVersion(contentReader.readU2());
    }

    private void parseConstantPool() {
        ConstantPoolParser constantPoolParser = new ConstantPoolParser(contentReader);
        ConstantPool constantPool = constantPoolParser.parse();
        parseResult.setConstantPool(constantPool);
    }

    private void parseAccessFlags() {
        parseResult.setAccessFlags(contentReader.readU2());
    }

    private void parseThisClass() {
        parseResult.setThisClass(contentReader.readU2());
    }

    private void parseSuperClass() {
        parseResult.setSuperClass(contentReader.readU2());
    }

    private void parseInterfaces() {
        U2 interfacesCount = contentReader.readU2();
        parseResult.setInterfaces(contentReader.readU2List(interfacesCount));
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
            BiFunction<ContentReader, ConstantPool, RelationParser<T>> parserGenerator
    ) {
        RelationParser<T> itemsContainer = parserGenerator.apply(contentReader, parseResult.getConstantPool());
        return itemsContainer.parse();
    }

    private void ensureCompleted() {
//        if (!contentReader.justFinished()) {
//            throw new AssertionError();
//        }
    }
}
