package com.study.parser.attribute;

import com.study.constants.ElementValueCase;
import com.study.io.U1InputStream;
import com.study.parser.Parser;
import com.study.type.U1;
import com.study.type.U2;
import com.study.type.info.ElementValue;
import com.study.type.info.attribute.Annotation;
import com.study.util.ElementValueUtils;

import java.util.ArrayList;
import java.util.List;

public class ElementValueParser implements Parser<ElementValue> {

    private final U1InputStream inputStream;

    public ElementValueParser(U1InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public ElementValue parse() {
        U1 tag = inputStream.readU1();

        ElementValueCase result = ElementValueUtils.convert(tag);
        switch (result) {
            case CASE_ONE -> {
                U2 constValueIndex = inputStream.readU2();
                return ElementValue.buildCaseOne(tag, constValueIndex);
            }
            case CASE_TWO -> {
                U2 typeNameIndex = inputStream.readU2();
                U2 constNameIndex = inputStream.readU2();
                return ElementValue.buildCaseTwo(tag, typeNameIndex, constNameIndex);
            }
            case CASE_THREE -> {
                U2 classInfoIndex = inputStream.readU2();
                return ElementValue.buildCaseThree(tag, classInfoIndex);
            }
            case CASE_FOUR -> {
                Parser<Annotation> parser = new AnnotationParser(inputStream);
                Annotation annotation = parser.parse();
                return ElementValue.buildCaseFour(tag, annotation);
            }
            case CASE_FIVE -> {
                U2 numValues = inputStream.readU2();
                List<ElementValue> values = new ArrayList<>(numValues.toInt());
                Parser<ElementValue> parser = new ElementValueParser(inputStream);
                numValues.forEach(e -> values.add(parser.parse()));
                return ElementValue.buildCaseFive(tag, values);
            }
            default -> throw new IllegalStateException("Unexpected value: " + result);
        }
    }
}
