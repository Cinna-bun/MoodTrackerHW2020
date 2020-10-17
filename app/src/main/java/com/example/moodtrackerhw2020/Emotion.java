package com.example.moodtrackerhw2020;

public abstract class Emotion {
    private int scale;
    private String description;

    public int getScale() {
        return scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public abstract String getName();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
