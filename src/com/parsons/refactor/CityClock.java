package com.parsons.refactor;

public class CityClock extends Clock {

    public CityClock(int offset) {
        super(offset);
    }

    @Override
    public void setLocalTime(int localTime) {
        super.localTime = localTime;
    }
}
