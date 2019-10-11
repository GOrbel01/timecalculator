package com.fsquall.mapper.impl;

import com.fsquall.time.TimeItem;
import com.fsquall.time.mapper.impl.StringToTimeMapperImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringToTimeMapperImplTest {

    private StringToTimeMapperImpl stringToTimeMapper;

    @Before
    public void setup() {
        this.stringToTimeMapper = new StringToTimeMapperImpl();
    }

    @Test
    public void testBasicMapping() {
        TimeItem expectedTimeItem = new TimeItem();

        expectedTimeItem.setHours(12);
        expectedTimeItem.setMins(30);
        expectedTimeItem.setSeconds(40);

        String timeString = "12:30.40";

        assertEquals(expectedTimeItem, stringToTimeMapper.mapToTimeItem(timeString));
    }
}
