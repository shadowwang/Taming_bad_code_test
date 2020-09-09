package com.parsons.refactor.tdd;

public class PhoneClock extends Clock{

    private HelloWordClockSystem mHelloWordClockSystem;

    public PhoneClock(int offset) {
        super(offset);
    }

    public void setTime(int time) {
        for (CityClock cityClock : mHelloWordClockSystem.getCityClocks()) {
            cityClock.setUtcZeroTime(time - this.utcOffset);
        }
    }

    public void setHelloWordClockSystem(HelloWordClockSystem helloWordClockSystem) {
        this.mHelloWordClockSystem = helloWordClockSystem;
    }
}
