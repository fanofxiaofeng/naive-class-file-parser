package com.test.attribute.cv.standard;

import com.test.field.FieldPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class CharacterFieldsTest extends FieldPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Character"));
    }

    @Test
    public void test_for_field_MIN_RADIX() {
        expectedConsecutiveLines = List.of(
                "  public static final int MIN_RADIX;",
                "    descriptor: I",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 2"
        );
    }
    @Test
    public void test_for_field_MAX_RADIX() {
        expectedConsecutiveLines = List.of(
                "  public static final int MAX_RADIX;",
                "    descriptor: I",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 36"
        );
    }
    @Test
    public void test_for_field_MIN_VALUE() {
        expectedConsecutiveLines = List.of(
                "  public static final char MIN_VALUE;",
                "    descriptor: C",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 0"
        );
    }
    @Test
    public void test_for_field_MAX_VALUE() {
        expectedConsecutiveLines = List.of(
                "  public static final char MAX_VALUE;",
                "    descriptor: C",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 65535"
        );
    }
    @Test
    public void test_for_field_UNASSIGNED() {
        expectedConsecutiveLines = List.of(
                "  public static final byte UNASSIGNED;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 0"
        );
    }
    @Test
    public void test_for_field_UPPERCASE_LETTER() {
        expectedConsecutiveLines = List.of(
                "  public static final byte UPPERCASE_LETTER;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 1"
        );
    }
    @Test
    public void test_for_field_LOWERCASE_LETTER() {
        expectedConsecutiveLines = List.of(
                "  public static final byte LOWERCASE_LETTER;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 2"
        );
    }
    @Test
    public void test_for_field_TITLECASE_LETTER() {
        expectedConsecutiveLines = List.of(
                "  public static final byte TITLECASE_LETTER;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 3"
        );
    }
    @Test
    public void test_for_field_MODIFIER_LETTER() {
        expectedConsecutiveLines = List.of(
                "  public static final byte MODIFIER_LETTER;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 4"
        );
    }
    @Test
    public void test_for_field_OTHER_LETTER() {
        expectedConsecutiveLines = List.of(
                "  public static final byte OTHER_LETTER;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 5"
        );
    }
    @Test
    public void test_for_field_NON_SPACING_MARK() {
        expectedConsecutiveLines = List.of(
                "  public static final byte NON_SPACING_MARK;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 6"
        );
    }
    @Test
    public void test_for_field_ENCLOSING_MARK() {
        expectedConsecutiveLines = List.of(
                "  public static final byte ENCLOSING_MARK;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 7"
        );
    }
    @Test
    public void test_for_field_COMBINING_SPACING_MARK() {
        expectedConsecutiveLines = List.of(
                "  public static final byte COMBINING_SPACING_MARK;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 8"
        );
    }
    @Test
    public void test_for_field_DECIMAL_DIGIT_NUMBER() {
        expectedConsecutiveLines = List.of(
                "  public static final byte DECIMAL_DIGIT_NUMBER;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 9"
        );
    }
    @Test
    public void test_for_field_LETTER_NUMBER() {
        expectedConsecutiveLines = List.of(
                "  public static final byte LETTER_NUMBER;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 10"
        );
    }
    @Test
    public void test_for_field_OTHER_NUMBER() {
        expectedConsecutiveLines = List.of(
                "  public static final byte OTHER_NUMBER;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 11"
        );
    }
    @Test
    public void test_for_field_SPACE_SEPARATOR() {
        expectedConsecutiveLines = List.of(
                "  public static final byte SPACE_SEPARATOR;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 12"
        );
    }
    @Test
    public void test_for_field_LINE_SEPARATOR() {
        expectedConsecutiveLines = List.of(
                "  public static final byte LINE_SEPARATOR;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 13"
        );
    }
    @Test
    public void test_for_field_PARAGRAPH_SEPARATOR() {
        expectedConsecutiveLines = List.of(
                "  public static final byte PARAGRAPH_SEPARATOR;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 14"
        );
    }
    @Test
    public void test_for_field_CONTROL() {
        expectedConsecutiveLines = List.of(
                "  public static final byte CONTROL;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 15"
        );
    }
    @Test
    public void test_for_field_FORMAT() {
        expectedConsecutiveLines = List.of(
                "  public static final byte FORMAT;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 16"
        );
    }
    @Test
    public void test_for_field_PRIVATE_USE() {
        expectedConsecutiveLines = List.of(
                "  public static final byte PRIVATE_USE;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 18"
        );
    }
    @Test
    public void test_for_field_SURROGATE() {
        expectedConsecutiveLines = List.of(
                "  public static final byte SURROGATE;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 19"
        );
    }
    @Test
    public void test_for_field_DASH_PUNCTUATION() {
        expectedConsecutiveLines = List.of(
                "  public static final byte DASH_PUNCTUATION;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 20"
        );
    }
    @Test
    public void test_for_field_START_PUNCTUATION() {
        expectedConsecutiveLines = List.of(
                "  public static final byte START_PUNCTUATION;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 21"
        );
    }
    @Test
    public void test_for_field_END_PUNCTUATION() {
        expectedConsecutiveLines = List.of(
                "  public static final byte END_PUNCTUATION;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 22"
        );
    }
    @Test
    public void test_for_field_CONNECTOR_PUNCTUATION() {
        expectedConsecutiveLines = List.of(
                "  public static final byte CONNECTOR_PUNCTUATION;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 23"
        );
    }
    @Test
    public void test_for_field_OTHER_PUNCTUATION() {
        expectedConsecutiveLines = List.of(
                "  public static final byte OTHER_PUNCTUATION;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 24"
        );
    }
    @Test
    public void test_for_field_MATH_SYMBOL() {
        expectedConsecutiveLines = List.of(
                "  public static final byte MATH_SYMBOL;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 25"
        );
    }
    @Test
    public void test_for_field_CURRENCY_SYMBOL() {
        expectedConsecutiveLines = List.of(
                "  public static final byte CURRENCY_SYMBOL;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 26"
        );
    }
    @Test
    public void test_for_field_MODIFIER_SYMBOL() {
        expectedConsecutiveLines = List.of(
                "  public static final byte MODIFIER_SYMBOL;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 27"
        );
    }
    @Test
    public void test_for_field_OTHER_SYMBOL() {
        expectedConsecutiveLines = List.of(
                "  public static final byte OTHER_SYMBOL;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 28"
        );
    }
    @Test
    public void test_for_field_INITIAL_QUOTE_PUNCTUATION() {
        expectedConsecutiveLines = List.of(
                "  public static final byte INITIAL_QUOTE_PUNCTUATION;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 29"
        );
    }
    @Test
    public void test_for_field_FINAL_QUOTE_PUNCTUATION() {
        expectedConsecutiveLines = List.of(
                "  public static final byte FINAL_QUOTE_PUNCTUATION;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 30"
        );
    }
    @Test
    public void test_for_field_ERROR() {
        expectedConsecutiveLines = List.of(
                "  static final int ERROR;",
                "    descriptor: I",
                "    flags: (0x0018) ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int -1"
        );
    }
    @Test
    public void test_for_field_DIRECTIONALITY_UNDEFINED() {
        expectedConsecutiveLines = List.of(
                "  public static final byte DIRECTIONALITY_UNDEFINED;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int -1"
        );
    }
    @Test
    public void test_for_field_DIRECTIONALITY_LEFT_TO_RIGHT() {
        expectedConsecutiveLines = List.of(
                "  public static final byte DIRECTIONALITY_LEFT_TO_RIGHT;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 0"
        );
    }
    @Test
    public void test_for_field_DIRECTIONALITY_RIGHT_TO_LEFT() {
        expectedConsecutiveLines = List.of(
                "  public static final byte DIRECTIONALITY_RIGHT_TO_LEFT;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 1"
        );
    }
    @Test
    public void test_for_field_DIRECTIONALITY_RIGHT_TO_LEFT_ARABIC() {
        expectedConsecutiveLines = List.of(
                "  public static final byte DIRECTIONALITY_RIGHT_TO_LEFT_ARABIC;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 2"
        );
    }
    @Test
    public void test_for_field_DIRECTIONALITY_EUROPEAN_NUMBER() {
        expectedConsecutiveLines = List.of(
                "  public static final byte DIRECTIONALITY_EUROPEAN_NUMBER;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 3"
        );
    }
    @Test
    public void test_for_field_DIRECTIONALITY_EUROPEAN_NUMBER_SEPARATOR() {
        expectedConsecutiveLines = List.of(
                "  public static final byte DIRECTIONALITY_EUROPEAN_NUMBER_SEPARATOR;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 4"
        );
    }
    @Test
    public void test_for_field_DIRECTIONALITY_EUROPEAN_NUMBER_TERMINATOR() {
        expectedConsecutiveLines = List.of(
                "  public static final byte DIRECTIONALITY_EUROPEAN_NUMBER_TERMINATOR;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 5"
        );
    }
    @Test
    public void test_for_field_DIRECTIONALITY_ARABIC_NUMBER() {
        expectedConsecutiveLines = List.of(
                "  public static final byte DIRECTIONALITY_ARABIC_NUMBER;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 6"
        );
    }
    @Test
    public void test_for_field_DIRECTIONALITY_COMMON_NUMBER_SEPARATOR() {
        expectedConsecutiveLines = List.of(
                "  public static final byte DIRECTIONALITY_COMMON_NUMBER_SEPARATOR;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 7"
        );
    }
    @Test
    public void test_for_field_DIRECTIONALITY_NONSPACING_MARK() {
        expectedConsecutiveLines = List.of(
                "  public static final byte DIRECTIONALITY_NONSPACING_MARK;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 8"
        );
    }
    @Test
    public void test_for_field_DIRECTIONALITY_BOUNDARY_NEUTRAL() {
        expectedConsecutiveLines = List.of(
                "  public static final byte DIRECTIONALITY_BOUNDARY_NEUTRAL;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 9"
        );
    }
    @Test
    public void test_for_field_DIRECTIONALITY_PARAGRAPH_SEPARATOR() {
        expectedConsecutiveLines = List.of(
                "  public static final byte DIRECTIONALITY_PARAGRAPH_SEPARATOR;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 10"
        );
    }
    @Test
    public void test_for_field_DIRECTIONALITY_SEGMENT_SEPARATOR() {
        expectedConsecutiveLines = List.of(
                "  public static final byte DIRECTIONALITY_SEGMENT_SEPARATOR;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 11"
        );
    }
    @Test
    public void test_for_field_DIRECTIONALITY_WHITESPACE() {
        expectedConsecutiveLines = List.of(
                "  public static final byte DIRECTIONALITY_WHITESPACE;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 12"
        );
    }
    @Test
    public void test_for_field_DIRECTIONALITY_OTHER_NEUTRALS() {
        expectedConsecutiveLines = List.of(
                "  public static final byte DIRECTIONALITY_OTHER_NEUTRALS;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 13"
        );
    }
    @Test
    public void test_for_field_DIRECTIONALITY_LEFT_TO_RIGHT_EMBEDDING() {
        expectedConsecutiveLines = List.of(
                "  public static final byte DIRECTIONALITY_LEFT_TO_RIGHT_EMBEDDING;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 14"
        );
    }
    @Test
    public void test_for_field_DIRECTIONALITY_LEFT_TO_RIGHT_OVERRIDE() {
        expectedConsecutiveLines = List.of(
                "  public static final byte DIRECTIONALITY_LEFT_TO_RIGHT_OVERRIDE;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 15"
        );
    }
    @Test
    public void test_for_field_DIRECTIONALITY_RIGHT_TO_LEFT_EMBEDDING() {
        expectedConsecutiveLines = List.of(
                "  public static final byte DIRECTIONALITY_RIGHT_TO_LEFT_EMBEDDING;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 16"
        );
    }
    @Test
    public void test_for_field_DIRECTIONALITY_RIGHT_TO_LEFT_OVERRIDE() {
        expectedConsecutiveLines = List.of(
                "  public static final byte DIRECTIONALITY_RIGHT_TO_LEFT_OVERRIDE;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 17"
        );
    }
    @Test
    public void test_for_field_DIRECTIONALITY_POP_DIRECTIONAL_FORMAT() {
        expectedConsecutiveLines = List.of(
                "  public static final byte DIRECTIONALITY_POP_DIRECTIONAL_FORMAT;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 18"
        );
    }
    @Test
    public void test_for_field_DIRECTIONALITY_LEFT_TO_RIGHT_ISOLATE() {
        expectedConsecutiveLines = List.of(
                "  public static final byte DIRECTIONALITY_LEFT_TO_RIGHT_ISOLATE;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 19"
        );
    }
    @Test
    public void test_for_field_DIRECTIONALITY_RIGHT_TO_LEFT_ISOLATE() {
        expectedConsecutiveLines = List.of(
                "  public static final byte DIRECTIONALITY_RIGHT_TO_LEFT_ISOLATE;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 20"
        );
    }
    @Test
    public void test_for_field_DIRECTIONALITY_FIRST_STRONG_ISOLATE() {
        expectedConsecutiveLines = List.of(
                "  public static final byte DIRECTIONALITY_FIRST_STRONG_ISOLATE;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 21"
        );
    }
    @Test
    public void test_for_field_DIRECTIONALITY_POP_DIRECTIONAL_ISOLATE() {
        expectedConsecutiveLines = List.of(
                "  public static final byte DIRECTIONALITY_POP_DIRECTIONAL_ISOLATE;",
                "    descriptor: B",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 22"
        );
    }
    @Test
    public void test_for_field_MIN_HIGH_SURROGATE() {
        expectedConsecutiveLines = List.of(
                "  public static final char MIN_HIGH_SURROGATE;",
                "    descriptor: C",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 55296"
        );
    }
    @Test
    public void test_for_field_MAX_HIGH_SURROGATE() {
        expectedConsecutiveLines = List.of(
                "  public static final char MAX_HIGH_SURROGATE;",
                "    descriptor: C",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 56319"
        );
    }
    @Test
    public void test_for_field_MIN_LOW_SURROGATE() {
        expectedConsecutiveLines = List.of(
                "  public static final char MIN_LOW_SURROGATE;",
                "    descriptor: C",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 56320"
        );
    }
    @Test
    public void test_for_field_MAX_LOW_SURROGATE() {
        expectedConsecutiveLines = List.of(
                "  public static final char MAX_LOW_SURROGATE;",
                "    descriptor: C",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 57343"
        );
    }
    @Test
    public void test_for_field_MIN_SURROGATE() {
        expectedConsecutiveLines = List.of(
                "  public static final char MIN_SURROGATE;",
                "    descriptor: C",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 55296"
        );
    }
    @Test
    public void test_for_field_MAX_SURROGATE() {
        expectedConsecutiveLines = List.of(
                "  public static final char MAX_SURROGATE;",
                "    descriptor: C",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 57343"
        );
    }
    @Test
    public void test_for_field_MIN_SUPPLEMENTARY_CODE_POINT() {
        expectedConsecutiveLines = List.of(
                "  public static final int MIN_SUPPLEMENTARY_CODE_POINT;",
                "    descriptor: I",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 65536"
        );
    }
    @Test
    public void test_for_field_MIN_CODE_POINT() {
        expectedConsecutiveLines = List.of(
                "  public static final int MIN_CODE_POINT;",
                "    descriptor: I",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 0"
        );
    }
    @Test
    public void test_for_field_MAX_CODE_POINT() {
        expectedConsecutiveLines = List.of(
                "  public static final int MAX_CODE_POINT;",
                "    descriptor: I",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 1114111"
        );
    }
    @Test
    public void test_for_field_serialVersionUID() {
        expectedConsecutiveLines = List.of(
                "  private static final long serialVersionUID;",
                "    descriptor: J",
                "    flags: (0x001a) ACC_PRIVATE, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: long 3786198910865385080l"
        );
    }
    @Test
    public void test_for_field_SIZE() {
        expectedConsecutiveLines = List.of(
                "  public static final int SIZE;",
                "    descriptor: I",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 16"
        );
    }
    @Test
    public void test_for_field_BYTES() {
        expectedConsecutiveLines = List.of(
                "  public static final int BYTES;",
                "    descriptor: I",
                "    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL",
                "    ConstantValue: int 2"
        );
    }
}
