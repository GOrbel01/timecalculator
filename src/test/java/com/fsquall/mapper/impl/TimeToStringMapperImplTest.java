package com.fsquall.mapper.impl;

import com.fsquall.time.TimeItem;
import com.fsquall.time.mapper.TimeToStringMapper;
import com.fsquall.time.mapper.impl.TimeToStringMapperImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimeToStringMapperImplTest {

    private TimeToStringMapper timeToStringMapper;

    @Before
    public void setup() {
        this.timeToStringMapper = new TimeToStringMapperImpl();
    }

    @Test
    public void testBasicMapping() {
        TimeItem time = new TimeItem();

        time.setHours(12);
        time.setMins(30);
        time.setSeconds(40);

        String expectedTime = "12:30.40";

        assertEquals(expectedTime, timeToStringMapper.mapToString(time));
    }
}
