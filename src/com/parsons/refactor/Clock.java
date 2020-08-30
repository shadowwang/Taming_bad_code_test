package com.parsons.refactor;

/**
 * 时钟类
 */
public abstract class Clock {

    protected int UTC_OFFSET;//时差

    protected int localTime;

    public Clock(int offset) {
        UTC_OFFSET = offset;
    }

    public abstract void setLocalTime(int localTime);

    public void setLocalTimeFromUtcZeroTime(int utcZeroTime) {
        localTime = makeHourWith0To23(utcZeroTime + UTC_OFFSET);
    }

    public String getTime() {
        return String.valueOf(localTime);
    }

    public int makeHourWith0To23(int hour) {
        return (hour + 24) % 24;
    }
}
