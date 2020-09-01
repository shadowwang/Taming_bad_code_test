package com.parsons.refactor.tdd;

public class CityClock {

    private int utcOffset;

    public void setUtcZeroTime(int utcZeroTime) {
        this.utcZeroTime = utcZeroTime;
    }

    private int utcZeroTime;

    public CityClock(int offset) {
        this.utcOffset = offset;
    }

    public int getTime() {
        return this.utcOffset + this.utcZeroTime;
    }
}
