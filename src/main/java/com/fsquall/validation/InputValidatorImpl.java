package com.fsquall.validation;

import com.fsquall.validation.errors.InputValidationException;

public class InputValidatorImpl implements InputValidator {

    public void validateInput(String input) throws InputValidationException {
        if (!input.contains(":") || !input.contains(".")) {
            throw new InputValidationException("Invalid time format.");
        }
        int indexOfColon = input.indexOf(":");
        int indexOfDecimalPoint = input.indexOf(".");

        if (indexOfColon <= 1 || indexOfDecimalPoint <= 3) {
            throw new InputValidationException("Invalid time format.");
        }
        try {
            Integer.parseInt(input.substring(0, indexOfColon));
            Integer.parseInt(input.substring(indexOfColon+1, indexOfDecimalPoint));
            Integer.parseInt(input.substring(indexOfDecimalPoint+1));
        } catch (NumberFormatException ex) {
            throw new InputValidationException(ex);
        }
    }
}
