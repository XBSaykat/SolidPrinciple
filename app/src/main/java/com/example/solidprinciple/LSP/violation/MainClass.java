package com.example.solidprinciple.LSP.violation;

public class MainClass {
    public void onButtonClick(ClickListener clickListener) {

        // IF we have a requirement where we need to increment the click count in
        // framgent2 but decrement the count in fragment 1
        // we would have to follow something like this, which is bad practice.

        if(clickListener instanceof Fragment2) {
            clickListener.incrementClickCount();
        } else if(clickListener instanceof Fragment1) {
            clickListener.decrementClickCount();
        }

    }
}
