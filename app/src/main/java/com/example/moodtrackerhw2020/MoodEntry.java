package com.example.moodtrackerhw2020;

public class MoodEntry {
    private Angry anger;
    private Happy happy;
    private Sad sad;
    private Stressed stress;
    private Tired tired;
    private String desc;
    private String dateTime;

    /**
     * About to do a lot of string processing :(
     * @param s
     */
    public MoodEntry(String s) {
        boolean isHappy = Boolean.parseBoolean(s.substring(s.indexOf(":") + 1, s.indexOf(";")));
        int happyScale = Integer.parseInt(s.substring(s.indexOf(";") + 1, s.indexOf(",")));

        s = s.substring(s.indexOf(",") + 1);

        boolean isAngry = Boolean.parseBoolean(s.substring(s.indexOf(":") + 1, s.indexOf(";")));
        int angerScale = Integer.parseInt(s.substring(s.indexOf(";") + 1, s.indexOf(",")));

        s = s.substring(s.indexOf(",") + 1);

        boolean isSad = Boolean.parseBoolean(s.substring(s.indexOf(":") + 1, s.indexOf(";")));
        int sadScale = Integer.parseInt(s.substring(s.indexOf(";") + 1, s.indexOf(",")));

        s = s.substring(s.indexOf(",") + 1);

        boolean isTired = Boolean.parseBoolean(s.substring(s.indexOf(":") + 1, s.indexOf(";")));
        int tiredScale= Integer.parseInt(s.substring(s.indexOf(";") + 1, s.indexOf(",")));

        s = s.substring(s.indexOf(",") + 1);

        boolean isStressed = Boolean.parseBoolean(s.substring(s.indexOf(":") + 1, s.indexOf(";")));
        int stressScale = Integer.parseInt(s.substring(s.indexOf(";") + 1, s.indexOf(",")));

        s = s.substring(s.indexOf(",") + 1);

        dateTime = s.substring(0, s.indexOf(","));

        s = s.substring(s.indexOf(",") + 1);

        desc = s;

        happy = new Happy(isHappy, happyScale);
        anger = new Angry(isAngry, angerScale);
        sad = new Sad(isSad, sadScale);
        tired = new Tired(isTired, tiredScale);
        stress = new Stressed(isStressed, stressScale);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Emotions: ");

        if (happy.isHappy()) {
            sb.append("Happy (" + happy.getRating() + "), ");
        }

        if (anger.isAngry()) {
            sb.append("Angry (" + anger.getRating() + "), ");
        }

        if (sad.isSad()) {
            sb.append("Sad (" + sad.getRating() + "), ");
        }

        if (tired.isTired()) {
            sb.append("Tired (" + tired.getRating() + "), ");
        }

        if (stress.isStressed()) {
            sb.append("Stressed (" + stress.getRating() + "), ");
        }

        sb.append(dateTime);

        sb.append("\n" + desc);

        sb.append("\n");
        sb.append("\n");

        return sb.toString();
    }
}
