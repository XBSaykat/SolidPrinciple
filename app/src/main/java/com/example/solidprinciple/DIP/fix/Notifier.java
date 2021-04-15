package com.example.solidprinciple.DIP.fix;
/*
 * Solution step 1: Create an interface called Notifier.
 * It has one method: jobAlert(String jobDescription);
 */
public interface Notifier {
    public void jobAlert(String jobDescription);
}
