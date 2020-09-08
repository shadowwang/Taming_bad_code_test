package com.parsons.refactor.tdd;

public class PhoneClock {

    private CityClock mCityClock;
    private int mUtcOffset;
    private HelloWordClockSystem mHelloWordClockSystem;

    public PhoneClock(int offset) {
        this.mUtcOffset = offset;
    }

    public void setCityClock(CityClock cityClock) {
        this.mCityClock = cityClock;
    }

    public void setTime(int time) {
        for (CityClock cityClock : mHelloWordClockSystem.getCityClocks()) {
            cityClock.setUtcZeroTime(time - this.mUtcOffset);
        }
    }

    public void setHelloWordClockSystem(HelloWordClockSystem helloWordClockSystem) {
        this.mHelloWordClockSystem = helloWordClockSystem;
    }
}
