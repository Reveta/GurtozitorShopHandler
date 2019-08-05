package com.shopManeger.java.maria.dataAccess.classDA;

public class Message {
    private String text;
    private String userID;

    public Message() {
    }

    public Message(String text, String userID) {
        this.text = text;
        this.userID = userID;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
