package com.example.moodtrackerhw2020;

public class Sad extends Emotion{
    private final String name = "Sad";
    private int rating;
    private boolean isSad;

    public Sad(boolean isSad, int rating) {
        this.isSad = isSad;
        if (rating < 1) rating = 1;
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public boolean isSad() {
        return isSad;
    }
}
