package com.example.solidprinciple.LSP.fix;

public class MainClass {
    public void onButtonClick(ClickListener clickListener) {

        /* We handle the individual logic inside the overridden methods
         * in the framgents. In the main implementation we should
         * never handle logic
         */

        clickListener.onClick();

    }
}
