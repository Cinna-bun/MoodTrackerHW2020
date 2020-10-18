package com.example.moodtrackerhw2020;

public abstract class Emotion {
    private int rating;

    public int getRating() {
        return rating;
    }

    public void setScale(int scale) {
        this.rating = scale;
    }

    public abstract String getName();
}
