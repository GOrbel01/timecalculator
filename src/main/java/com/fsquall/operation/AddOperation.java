package com.fsquall.operation;

import com.fsquall.time.TimeItem;

public class AddOperation extends AbstractCalculationOperation {
    @Override
    public TimeItem runCalculation(TimeItem one, TimeItem two) {
        TimeItem result = new TimeItem();

        MinsOrSecondsResult secondsCalc = calculateMinsOrSeconds(one.getSeconds(), two.getSeconds(), null);

        result.setSeconds(secondsCalc.getNumber());

        MinsOrSecondsResult minsCalc = calculateMinsOrSeconds(one.getMins(), two.getMins(), secondsCalc);

        result.setMins(minsCalc.getNumber());

        Integer hours = one.getHours() + two.getHours();

        if (minsCalc.isCarriesOver())
            hours++;

        result.setHours(hours);

        return result;
    }

    private MinsOrSecondsResult calculateMinsOrSeconds(Integer one, Integer two, MinsOrSecondsResult previous) {
        MinsOrSecondsResult result = new MinsOrSecondsResult();
        Integer addedNumbers = one + two;
        if (previous != null && previous.isCarriesOver()) {
            addedNumbers++;
        }
        if (addedNumbers >= 60) {
            result.setCarriesOver(true);
            result.setNumber(addedNumbers - 60);
        } else {
            result.setCarriesOver(false);
            result.setNumber(addedNumbers);
        }
        return result;
    }
}
