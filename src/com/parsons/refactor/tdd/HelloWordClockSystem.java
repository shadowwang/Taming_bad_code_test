package com.parsons.refactor.tdd;

import java.util.ArrayList;

public class HelloWordClockSystem {

    private ArrayList<CityClock> cityClocks = new ArrayList<>();

    public void attach(CityClock cityClock) {
        if (!cityClocks.contains(cityClock)) {
            cityClocks.add(cityClock);
        }
    }

    public ArrayList<CityClock> getCityClocks() {
        return cityClocks;
    }
}
