package com.example.moodtrackerhw2020;

public class Stressed extends Emotion{
    private final String name = "Stressed";
    private int rating;
    private boolean isStressed;

    public Stressed(boolean isStressed, int rating) {
        this.isStressed = isStressed;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public boolean isStressed() {
        return isStressed;
    }
}
