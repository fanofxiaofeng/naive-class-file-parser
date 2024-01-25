package com.study.parser.attribute;

import com.study.io.U1InputStream;
import com.study.parser.Parser;
import com.study.type.U2;
import com.study.type.info.ElementValue;
import com.study.type.info.attribute.Annotation;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.List;

public class AnnotationParser implements Parser<Annotation> {

    private final U1InputStream inputStream;

    public AnnotationParser(U1InputStream infoStream) {
        this.inputStream = infoStream;
    }

    @Override
    public Annotation parse() {
        U2 typeIndex = inputStream.readU2();
        U2 numElementValuePairs = inputStream.readU2();

        List<Pair<U2, ElementValue>> elementValuePairs = new ArrayList<>(numElementValuePairs.toInt());
        Parser<Pair<U2, ElementValue>> parser = new ElementValuePairParser(inputStream);
        numElementValuePairs.forEach(e -> elementValuePairs.add(parser.parse()));

        return new Annotation(typeIndex, elementValuePairs);
    }
}
