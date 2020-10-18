package com.example.moodtrackerhw2020;

public class Tired extends Emotion{
    private final String name = "Tired";
    private int rating;
    private boolean isTired;

    public Tired(boolean isTired, int rating) {
        this.isTired = isTired;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public boolean isTired() {
        return isTired;
    }
}
