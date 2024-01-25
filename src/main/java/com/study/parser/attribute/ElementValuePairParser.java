package com.study.parser.attribute;

import com.study.io.U1InputStream;
import com.study.parser.Parser;
import com.study.type.U2;
import com.study.type.info.ElementValue;
import org.apache.commons.lang3.tuple.Pair;

public class ElementValuePairParser implements Parser<Pair<U2, ElementValue>> {

    private final U1InputStream inputStream;

    public ElementValuePairParser(U1InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public Pair<U2, ElementValue> parse() {
        U2 elementNameIndex = inputStream.readU2();
        Parser<ElementValue> parser = new ElementValueParser(inputStream);
        ElementValue elementValue = parser.parse();
        return Pair.of(elementNameIndex, elementValue);
    }
}
