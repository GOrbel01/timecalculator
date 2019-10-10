package com.fsquall.exception.validation;

public class InputValidationException extends Exception {
    public InputValidationException(String ex) {
        super(ex);
    }

    public InputValidationException(Exception ex) {
        super(ex);
    }
}
