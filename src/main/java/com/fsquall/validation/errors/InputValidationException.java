package com.fsquall.validation.errors;

public class InputValidationException extends Exception {
    public InputValidationException(String ex) {
        super(ex);
    }

    public InputValidationException(Exception ex) {
        super(ex);
    }
}
