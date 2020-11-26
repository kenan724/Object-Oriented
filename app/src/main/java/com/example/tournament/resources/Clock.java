package com.example.tournament.resources;

import java.util.Date;

public class Clock extends Date {

    public static Clock getInstance(){
        return instance;
    }

    private static Clock instance = new Clock();
}
