package com.parsons.refactor;

/**
 * 时钟类
 */
public abstract class Clock {

    protected static int UTC_OFFSET;//时差

    protected int localTime;

    public Clock(int offset) {
        UTC_OFFSET = offset;
    }

    public abstract void setLocalTime(int localTime);

    public static int toLocalTime(int utcZeroTime) {
        return utcZeroTime + UTC_OFFSET;
    }

    public String getTime() {
        return String.valueOf(localTime);
    }
}
