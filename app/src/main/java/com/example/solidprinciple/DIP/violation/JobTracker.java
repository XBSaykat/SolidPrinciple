package com.example.solidprinciple.DIP.violation;
/*
 * Class called JobTracker.
 * This class initializes both the Phone & Email class
 * This is a violation of the DIP principle
 */
public class JobTracker {
    private Phone phone;
    private Emailer emailer;

    public JobTracker() {
        phone = new Phone();
        emailer = new Emailer();
    }
}
