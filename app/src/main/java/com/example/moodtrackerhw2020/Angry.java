package com.example.moodtrackerhw2020;

public class Angry extends Emotion{
    private final String name = "Angry";
    private int rating;
    private boolean isAngry;

    public Angry(boolean isAngry, int rating) {
        this.isAngry = isAngry;
        if (rating < 1) rating = 1;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public boolean isAngry() {
        return isAngry;
    }
}
