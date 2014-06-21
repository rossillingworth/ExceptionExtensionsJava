package com.techmale.exception_extension;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static com.techmale.exception_extension.ExceptionExtensions.*;

public class ExceptionExtensionsTest {

    @Test(expected = IOException.class)
    public void testCheckedExceptionIsThrown() throws IOException {
        IOException.when(true, "IO Exception");
    }

    @Test(expected = NullPointerException.class)
    public void testUnCheckedExceptionIsThrown() {
        NullPointerException.when(true, "Null Pointer Exception");
    }

    @Test
    public void testMessageInsertedIntoException() {
        //  Given
        String expected = "Null Pointer Exception";

        try {
            //  When
            IOException.when(true, expected);
        } catch (java.io.IOException e) {

            //  Then
            Assert.assertEquals(expected, e.getMessage());
        }
    }

    @Test
    public void testMessageInsertedIntoExceptionWithFormattedValues() {
        try {
            //  When
            IOException.when(true, "Hello %s", "World");
        } catch (java.io.IOException e) {

            //  Then
            Assert.assertEquals("Hello World", e.getMessage());
        }
    }

    @Test
    public void ifNullThrowsException() {
        //  Given
        String expected = "Null Pointer Exception";

        try {
            //  When
            NullPointerException.ifNull(null, expected);
        } catch (NullPointerException e) {

            //  Then
            Assert.assertEquals(expected, e.getMessage());
        }
    }
}
