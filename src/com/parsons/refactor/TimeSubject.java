package com.parsons.refactor;

import java.util.HashMap;
import java.util.Map;

/**
 * 时间主题，充当被观察者
 */
public abstract class TimeSubject {

    private Map<String, Clock> clocks = new HashMap<>();

    public void attach(String cityName, Clock clock) {
        clocks.put(cityName, clock);
    }

    public void detach(String cityName) {
        clocks.remove(cityName);
    }

    public abstract void notifyAllClocks();
}
