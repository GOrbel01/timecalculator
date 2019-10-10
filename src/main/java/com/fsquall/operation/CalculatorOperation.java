package com.fsquall.operation;

import com.fsquall.time.TimeItem;

public interface CalculatorOperation {
    /**
     * Take two params, perform calculation and
     * return the result.
     * @param one Operand 1
     * @param two Operand 2
     * @return The result of the calculation
     */
    TimeItem runCalculation(TimeItem one, TimeItem two);
}
