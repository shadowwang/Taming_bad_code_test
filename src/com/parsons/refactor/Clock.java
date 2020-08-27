package com.parsons.refactor;

/**
 * 时钟类
 */
public abstract class Clock {

    protected static final int UTC_OFFSET = 0;

    protected int localTime;

    public abstract void setLocalTime(int localTime);

    public static int toLocalTime(int utcZeroTime) {
        return utcZeroTime + UTC_OFFSET;
    }
}
