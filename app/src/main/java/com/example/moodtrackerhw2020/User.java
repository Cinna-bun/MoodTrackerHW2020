package com.example.moodtrackerhw2020;

public class User {

    private String userName;
    private final String password;
    private String entryLog;

    private Happy happy;
    private Sad sad;
    private Tired tired;
    private Stressed stressed;
    private Angry angry;

    public String getEntryLog() {
        return entryLog;
    }

    public void setEntryLog(String entryLog) {
        this.entryLog = entryLog;
    }

    public Happy getHappy() {
        return happy;
    }

    public void setHappy(Happy happy) {
        this.happy = happy;
    }

    public Sad getSad() {
        return sad;
    }

    public void setSad(Sad sad) {
        this.sad = sad;
    }

    public Tired getTired() {
        return tired;
    }

    public void setTired(Tired tired) {
        this.tired = tired;
    }

    public Stressed getStressed() {
        return stressed;
    }

    public void setStressed(Stressed stressed) {
        this.stressed = stressed;
    }

    public Angry getAngry() {
        return angry;
    }

    public void setAngry(Angry angry) {
        this.angry = angry;
    }

    public User(String userName, String password) {
        this.password = password;
        this.userName = userName;
    }

    public String getUserName(){
        return userName;
    }

    public boolean authenticate(String password) {
        return this.password.equals(password);
    }

    @Override
    public boolean equals(Object obj) {
        User newUser;
        if(obj instanceof User) {
            newUser = (User) obj;
            return (this.userName.equals(newUser.getUserName()));
        } else {
            return false;
        }
    }
}
