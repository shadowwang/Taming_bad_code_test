package com.parsons.refactor;

/**
 * 手机时钟
 */
public class PhoneClock extends Clock {

    private UTCTime mUtcTime;

    @Override
    public void setLocalTime(int localTime) {
        super.localTime = localTime;
        mUtcTime.setUtcZeroTime(localTime - UTC_OFFSET);
    }
}
