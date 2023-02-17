package com.epam.mjc;

public class IllegalArgumentException extends Exception {
    public IllegalArgumentException(String s) {
        super(s);
    }

    public IllegalArgumentException(String message, Throwable cause) {
        super(message, cause);
    }
}
