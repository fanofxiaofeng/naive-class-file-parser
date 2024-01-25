package com.study.util;

import com.study.constants.ElementValueCase;
import com.study.type.U1;

public class ElementValueUtils {

    public static ElementValueCase convert(U1 tag) {
        /*
        B	byte	const_value_index	CONSTANT_Integer
C	char	const_value_index	CONSTANT_Integer
D	double	const_value_index	CONSTANT_Double
F	float	const_value_index	CONSTANT_Float
I	int	const_value_index	CONSTANT_Integer
J	long	const_value_index	CONSTANT_Long
S	short	const_value_index	CONSTANT_Integer
Z	boolean	const_value_index	CONSTANT_Integer
s	String	const_value_index	CONSTANT_Utf8
e	Enum class	enum_const_value	Not applicable
c	Class	class_info_index	Not applicable
@	Annotation interface	annotation_value	Not applicable
[	Array type	array_value
         */
        switch (tag.toInt()) {
            case 'B', 'C', 'D', 'F', 'I', 'J', 'S', 'Z', 's' -> {
                return ElementValueCase.CASE_ONE;
            }
            case 'e' -> {
                return ElementValueCase.CASE_TWO;
            }
            case 'c' -> {
                return ElementValueCase.CASE_THREE;
            }
            case '@' -> {
                return ElementValueCase.CASE_FOUR;
            }
            case '[' -> {
                return ElementValueCase.CASE_FIVE;
            }
            default -> {
                String message = String.format("Unsupported tag: " + ((char) tag.toInt()));
                throw new IllegalArgumentException(message);
            }
        }
    }
}
