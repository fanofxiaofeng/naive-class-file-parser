package com.test.attribute;

import com.study.constants.PresentKind;
import com.test.attribute.cases.ExceptionsAttributeCase;
import org.junit.Test;

import java.io.IOException;
import java.util.EnumSet;
import java.util.List;

public class ExceptionsAttributePresenterTest extends AttributePresenterTestBase {

    @Test
    public void testForObjectClass() throws IOException {
        buildRealLines(Object.class, EnumSet.allOf(PresentKind.class));

        // javap -v -p 'java.lang.Object' | grep -A1 'Exceptions:' | grep -v '-' | sed -e 's/^/"/' -e 's/$/",/'
        expectedLines = List.of(
                "    Exceptions:",
                "      throws java.lang.CloneNotSupportedException",
                "    Exceptions:",
                "      throws java.lang.InterruptedException",
                "    Exceptions:",
                "      throws java.lang.InterruptedException",
                "    Exceptions:",
                "      throws java.lang.InterruptedException",
                "    Exceptions:",
                "      throws java.lang.InterruptedException",
                "    Exceptions:",
                "      throws java.lang.Throwable"
        );
    }

    @Test
    public void testForExceptionsAttributeCase() throws IOException {
        buildRealLines(ExceptionsAttributeCase.class, EnumSet.allOf(PresentKind.class));

        // javap -v -p target.test-classes.com.test.attribute.cases.ExceptionsAttributeCase | grep -A1 'Exceptions:' | grep 'throws' | sed -e 's/^/"/' -e 's/$/",/'
        expectedLines = List.of(
                "      throws java.io.IOError, java.io.IOException, java.lang.RuntimeException, java.lang.ArrayIndexOutOfBoundsException, java.lang.NullPointerException, java.lang.StackOverflowError, java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.util.TooManyListenersException, java.lang.UnsupportedOperationException, java.lang.AssertionError, java.lang.OutOfMemoryError, java.io.IOException"
        );
    }
}
