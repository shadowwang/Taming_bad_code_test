package com.parsons.refactor.tdd;

public class CityClock extends Clock {

    public void setUtcZeroTime(int utcZeroTime) {
        this.utcZeroTime = utcZeroTime;
    }

    private int utcZeroTime;

    public CityClock(int offset) {
        super(offset);
    }

    @Override
    public int getTime() {
        return (this.utcOffset + this.utcZeroTime + 24) % 24;
    }
}
