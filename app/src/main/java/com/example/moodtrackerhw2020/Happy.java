package com.example.moodtrackerhw2020;

public class Happy extends Emotion {
    private final String name = "Happy";
    private int rating;
    private boolean isHappy;

    public Happy(boolean isHappy, int rating) {
        this.isHappy = isHappy;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public boolean isHappy() {
        return isHappy;
    }
}
