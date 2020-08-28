package com.parsons.refactor;

/**
 * 手机时钟
 */
public class PhoneClock extends Clock {

    private UTCTime mUtcTime;

    public PhoneClock(int offset) {
        super(offset);
    }

    public void setUtcTime(UTCTime utcTime) {
        this.mUtcTime = utcTime;
    }

    @Override
    public void setLocalTime(int localTime) {
        super.localTime = localTime;
        mUtcTime.setUtcZeroTime(localTime - UTC_OFFSET);
    }
}
