package com.parsons.refactor;

public class UTCTime extends TimeSubject {

    private int mUtcZeroTime;

    @Override
    public void notifyAllClocks() {
        for (Clock clock : clocks.values()) {
            clock.setLocalTime(Clock.toLocalTime(this.mUtcZeroTime));
        }
    }
}
