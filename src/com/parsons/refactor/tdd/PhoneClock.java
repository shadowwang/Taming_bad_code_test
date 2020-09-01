package com.parsons.refactor.tdd;

public class PhoneClock {

    private CityClock mCityClock;
    private int mUtcOffset;

    public PhoneClock(int offset) {
        this.mUtcOffset = offset;
    }

    public void setCityClock(CityClock cityClock) {
        this.mCityClock = cityClock;
    }

    public void setTime(int time) {
        this.mCityClock.setUtcZeroTime(time - this.mUtcOffset);
    }
}
