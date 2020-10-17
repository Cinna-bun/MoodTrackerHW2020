package com.example.moodtrackerhw2020;

public class User {

    private String userName;
    private final String password;

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
