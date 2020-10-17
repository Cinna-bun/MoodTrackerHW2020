package com.example.moodtrackerhw2020;

public abstract class Emotion {
    private int scale;

    public int getScale() {
        return scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public abstract String getName();
}
