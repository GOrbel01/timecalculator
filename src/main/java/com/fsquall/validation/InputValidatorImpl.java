package com.fsquall.validation;

import com.fsquall.exception.validation.InputValidationException;

public class InputValidatorImpl implements InputValidator {
    private String input;

    public void validateInput(String input) {
        this.input = input;
    }

    private boolean isValidTime() throws InputValidationException {
        //TODO Implement
        return false;
    }
}
