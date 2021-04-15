package com.example.solidprinciple.SRP.violation;

public class Book {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    //SRP violation, Pojo has only the responsibility to get & set set data
    // & not make data formatting operations like calculate,print etc
    public void print(){
        System.out.println(text);
    }
}
