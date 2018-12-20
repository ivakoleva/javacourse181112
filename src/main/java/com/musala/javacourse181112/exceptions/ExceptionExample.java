package com.musala.javacourse181112.exceptions;

/**
 * Created by Iva Koleva on 20.12.2018
 */
public class ExceptionExample {
    public static void main(final String[] args) throws Exception {
        /*doSomething1();
        try {
            doSomething();
        } catch (CustomException e) {

        } catch (Exception e) {

        } finally {

        }*/

        try {
            testException();
        } catch (ExampleException e) {
            final Throwable cause = e.getCause();
            final Throwable[] suppressed = e.getSuppressed();

            throw new Exception("Custom message", e);
        } catch (Exception e) {
            e.printStackTrace();
        }


        testRuntimeException();

        try {
            testRuntimeException();
        } catch (RuntimeException ignored) {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testException() throws Exception {
        //throw new Exception("asd");
        throw new ExampleException("Something went wrong, here is what exactly....explanation here.");
    }

    public static void testRuntimeException() {
        throw new RuntimeException("asd");
    }
}

class ExampleException extends Exception {
    public ExampleException() {
    }

    public ExampleException(String message) {
        super(message);
    }

    public ExampleException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExampleException(Throwable cause) {
        super(cause);
    }

    public ExampleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

class ExampleRuntimeException extends RuntimeException {

}

/*class MyError extends Error {

}*/
