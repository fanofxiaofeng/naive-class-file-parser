package com.study.type.info;

import com.study.constants.ElementValueCase;
import com.study.type.U1;
import com.study.type.U2;
import com.study.type.info.attribute.Annotation;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public abstract class ElementValue {

    protected final U1 tag;

    protected ElementValue(U1 tag) {
        this.tag = tag;
    }

    public U1 getTag() {
        return tag;
    }

    private static final Map<Class<? extends ElementValue>, ElementValueCase> map = Map.ofEntries(
            Map.entry(CaseOne.class, ElementValueCase.CASE_ONE),
            Map.entry(CaseTwo.class, ElementValueCase.CASE_TWO),
            Map.entry(CaseThree.class, ElementValueCase.CASE_THREE),
            Map.entry(CaseFour.class, ElementValueCase.CASE_FOUR),
            Map.entry(CaseFive.class, ElementValueCase.CASE_FIVE)
    );

    public static ElementValueCase convert(ElementValue elementValue) {
        if (map.containsKey(elementValue.getClass())) {
            return map.get(elementValue.getClass());
        }

        throw new IllegalArgumentException();
    }

    public abstract String desc(U2 elementNameIndex);

    public abstract String descCorePart();

    protected String desc(U2 elementNameIndex, U2 anotherIndex) {
        return String.format("#%s=%s",
                elementNameIndex.toInt(),
                descCorePart(anotherIndex)
        );
    }

    protected String descCorePart(U2 otherIndex) {
        return String.format("%s#%s", (char) tag.toInt(), otherIndex.toInt());
    }

    public static CaseOne buildCaseOne(U1 tag, U2 constValueIndex) {
        return new CaseOne(tag, constValueIndex);
    }

    public static ElementValue buildCaseTwo(U1 tag, U2 typeNameIndex, U2 constNameIndex) {
        return new CaseTwo(tag, typeNameIndex, constNameIndex);
    }

    public static ElementValue buildCaseThree(U1 tag, U2 classInfoIndex) {
        return new CaseThree(tag, classInfoIndex);
    }

    public static ElementValue buildCaseFour(U1 tag, Annotation annotation) {
        return new CaseFour(tag, annotation);
    }

    public static ElementValue buildCaseFive(U1 tag, List<ElementValue> values) {
        return new CaseFive(tag, values);
    }

    public static class CaseOne extends ElementValue {
        private final U2 constValueIndex;

        private CaseOne(U1 tag, U2 constValueIndex) {
            super(tag);
            this.constValueIndex = constValueIndex;
        }

        @Override
        public String desc(U2 elementNameIndex) {
            return super.desc(elementNameIndex, constValueIndex);
        }

        @Override
        protected String descCorePart(U2 otherIndex) {
            return super.descCorePart(otherIndex);
        }

        @Override
        public String descCorePart() {
            return super.descCorePart(constValueIndex);
        }

        public U2 getConstValueIndex() {
            return constValueIndex;
        }
    }


    public static class CaseTwo extends ElementValue {
        private final U2 typeNameIndex;
        private final U2 constNameIndex;

        private CaseTwo(U1 tag, U2 typeNameIndex, U2 constNameIndex) {
            super(tag);
            this.typeNameIndex = typeNameIndex;
            this.constNameIndex = constNameIndex;
        }

        @Override
        public String desc(U2 elementNameIndex) {
            return String.format(
                    "#%s=%s",
                    elementNameIndex.toInt(),
                    descCorePart()
            );
        }

        @Override
        public String descCorePart() {
            return String.format(
                    "%s#%s.#%s",
                    (char) tag.toInt(),
                    typeNameIndex.toInt(),
                    constNameIndex.toInt()
            );
        }

        public U2 getTypeNameIndex() {
            return typeNameIndex;
        }

        public U2 getConstNameIndex() {
            return constNameIndex;
        }
    }

    public static class CaseThree extends ElementValue {
        private final U2 classInfoIndex;

        private CaseThree(U1 tag, U2 classInfoIndex) {
            super(tag);
            this.classInfoIndex = classInfoIndex;
        }

        @Override
        public String desc(U2 elementNameIndex) {
            return super.desc(elementNameIndex, classInfoIndex);
        }

        @Override
        public String descCorePart() {
            return super.descCorePart(classInfoIndex);
        }

        public U2 getClassInfoIndex() {
            return classInfoIndex;
        }
    }

    public static class CaseFour extends ElementValue {
        private final Annotation annotationValue;

        private CaseFour(U1 tag, Annotation annotationValue) {
            super(tag);
            this.annotationValue = annotationValue;
        }

        @Override
        public String desc(U2 elementNameIndex) {
            return String.format("#%s=%s",
                    elementNameIndex.toInt(),
                    descCorePart()
            );
        }

        @Override
        public String descCorePart() {
            List<Pair<U2, ElementValue>> pairs = annotationValue.elementValuePairs();

            List<String> strings = new ArrayList<>(pairs.size());
            IntStream.range(0, pairs.size()).forEach(index -> {
                Pair<U2, ElementValue> pair = pairs.get(index);
                strings.add(pair.getValue().desc(pair.getKey()));
            });

            return String.format("%s#%s(%s)",
                    (char) tag.toInt(),
                    annotationValue.typeIndex().toInt(),
                    String.join(",", strings)
            );
        }

        public Annotation getAnnotationValue() {
            return annotationValue;
        }
    }

    public static class CaseFive extends ElementValue {
        private final List<ElementValue> values;

        private CaseFive(U1 tag, List<ElementValue> values) {
            super(tag);
            this.values = values;
        }

        @Override
        public String desc(U2 elementNameIndex) {
            List<String> strings = new ArrayList<>(values.size());

            IntStream.range(0, values.size()).forEach(index -> {
                ElementValue component = values.get(index);
                strings.add(component.descCorePart());
            });

            return String.format("#%s=[%s]",
                    elementNameIndex.toInt(),
                    String.join(",", strings)
            );
        }

        @Override
        public String descCorePart() {
            String message = "It is already an array, please check!";
            throw new UnsupportedOperationException(message);
        }

        public List<ElementValue> getValues() {
            return values;
        }
    }
}
