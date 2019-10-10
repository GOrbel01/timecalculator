package com.fsquall.operation;

import com.fsquall.time.TimeItem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddOperationTestImpl {

    private CalculatorOperation addOperation;

    @Before
    public void setup() {
        addOperation = new AddOperation();
    }

    @Test
    public void testOperation() {
        TimeItem timeOne = new TimeItem();
        TimeItem timeTwo = new TimeItem();

        timeOne.setHours(2);
        timeOne.setMins(30);
        timeOne.setSeconds(45);

        timeTwo.setHours(1);
        timeTwo.setMins(40);
        timeTwo.setSeconds(20);

        TimeItem expectedTime = new TimeItem();
        expectedTime.setHours(4);
        expectedTime.setMins(11);
        expectedTime.setSeconds(5);

        TimeItem actualTime = addOperation.runCalculation(timeOne, timeTwo);

        assertEquals(expectedTime, actualTime);
    }

    @Test
    public void testExtraSecondLeadToExtraMinuteLeadToExtraHour() {
        TimeItem timeOne = new TimeItem();
        TimeItem timeTwo = new TimeItem();

        timeOne.setHours(2);
        timeOne.setMins(58);
        timeOne.setSeconds(45);

        timeTwo.setHours(1);
        timeTwo.setMins(1);
        timeTwo.setSeconds(20);

        TimeItem expectedTime = new TimeItem();
        expectedTime.setHours(4);
        expectedTime.setMins(0);
        expectedTime.setSeconds(5);

        TimeItem actualTime = addOperation.runCalculation(timeOne, timeTwo);

        assertEquals(expectedTime, actualTime);
    }

    @Test
    public void testWithBigHours() {
        TimeItem timeOne = new TimeItem();
        TimeItem timeTwo = new TimeItem();

        timeOne.setHours(52);
        timeOne.setMins(0);
        timeOne.setSeconds(45);

        timeTwo.setHours(27);
        timeTwo.setMins(0);
        timeTwo.setSeconds(20);

        TimeItem expectedTime = new TimeItem();
        expectedTime.setHours(79);
        expectedTime.setMins(1);
        expectedTime.setSeconds(5);

        TimeItem actualTime = addOperation.runCalculation(timeOne, timeTwo);

        assertEquals(expectedTime, actualTime);
    }
}
