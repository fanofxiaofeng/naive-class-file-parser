package com.study.type.info.attribute;

import com.study.type.U2;
import com.study.type.info.ElementValue;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

public record Annotation(U2 typeIndex, List<Pair<U2, ElementValue>> elementValuePairs) {
}
