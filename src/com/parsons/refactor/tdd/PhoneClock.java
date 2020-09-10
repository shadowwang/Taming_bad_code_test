package com.parsons.refactor.tdd;

public class PhoneClock extends Clock{

    private HelloWordClockSystem mHelloWordClockSystem;

    private int mTime;

    public PhoneClock(int offset) {
        super(offset);
    }

    public void setTime(int time) {
        this.mTime = time;

        if (mHelloWordClockSystem == null) {
            return;
        }

        for (CityClock cityClock : mHelloWordClockSystem.getCityClocks()) {
            cityClock.setUtcZeroTime(time - this.utcOffset);
        }
    }

    public void setHelloWordClockSystem(HelloWordClockSystem helloWordClockSystem) {
        this.mHelloWordClockSystem = helloWordClockSystem;
    }

    @Override
    public int getTime() {
        return mTime;
    }
}
