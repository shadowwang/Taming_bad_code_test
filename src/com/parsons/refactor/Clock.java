package com.parsons.refactor;

/**
 * 时钟类
 */
public abstract class Clock {

    private final int UTC_OFFSET = 0;

    private int mLocalTime;

    public abstract void setLocalTime(int localTime);
}
