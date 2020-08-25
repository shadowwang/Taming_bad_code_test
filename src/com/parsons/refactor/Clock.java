package com.parsons.refactor;

/**
 * 时钟类
 */
public abstract class Clock {

    private static final int UTC_OFFSET = 0;

    private int mLocalTime;

    public abstract void setLocalTime(int localTime);

    public static int toLocalTime(int utcZeroTime) {
        return utcZeroTime + UTC_OFFSET;
    }
}
