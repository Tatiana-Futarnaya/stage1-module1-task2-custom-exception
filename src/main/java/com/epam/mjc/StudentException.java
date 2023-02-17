package com.epam.mjc;

public class StudentException extends IllegalArgumentException {
    public StudentException(String s) {
        super(s);
    }

    public StudentException(String message, Throwable cause) {
        super(message, cause);
    }
}
