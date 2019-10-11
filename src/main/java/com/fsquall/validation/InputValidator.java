package com.fsquall.validation;

import com.fsquall.validation.errors.InputValidationException;

public interface InputValidator {
    void validateInput(String input) throws InputValidationException;
}
