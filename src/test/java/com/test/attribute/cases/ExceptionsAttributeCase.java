package com.test.attribute.cases;

import java.io.IOError;
import java.io.IOException;
import java.util.TooManyListenersException;

public abstract class ExceptionsAttributeCase {
    public abstract void f1() throws IOError,
            IOException,
            RuntimeException,
            ArrayIndexOutOfBoundsException,
            NullPointerException,
            StackOverflowError,
            IllegalArgumentException,
            IllegalStateException,
            TooManyListenersException,
            UnsupportedOperationException,
            AssertionError,
            OutOfMemoryError,
            IOException;
}
