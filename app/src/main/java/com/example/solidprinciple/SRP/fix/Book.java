package com.example.solidprinciple.SRP.fix;

public class Book implements PrintListener{
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getContent() {
        return text;
    }
}
