package com.fsquall.time.mapper;

import com.fsquall.time.TimeItem;

public interface StringToTimeMapper {
    TimeItem mapToTimeItem(String timeString);
}
