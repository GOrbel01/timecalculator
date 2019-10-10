package com.fsquall.time;

import java.util.Objects;

public class TimeItem {
    private int hours;
    private int mins;
    private int seconds;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMins() {
        return mins;
    }

    public void setMins(int mins) {
        this.mins = mins;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public Integer getAsTimeHours() {
        if (hours >= 24) {
            return hours - 24;
        }
        return hours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeItem timeItem = (TimeItem) o;
        return hours == timeItem.hours &&
                mins == timeItem.mins &&
                seconds == timeItem.seconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hours, mins, seconds);
    }

    @Override
    public String toString() {
        return "HH: " + hours + "\n" + "MM: " + mins + "\n" + "SS: " + seconds;
    }
}
