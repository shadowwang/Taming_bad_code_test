package com.parsons.refactor;

public class UTCTime extends TimeSubject {

    private int mUtcZeroTime;

    public int getUtcZeroTime() {
        return mUtcZeroTime;
    }

    public void setUtcZeroTime(int utcZeroTime) {
        this.mUtcZeroTime = utcZeroTime;
        notifyAllClocks();
    }

    @Override
    public void notifyAllClocks() {
        for (Clock clock : clocks.values()) {
            clock.setLocalTime(Clock.toLocalTime(this.mUtcZeroTime));
        }
    }
}
