package com.example.solidprinciple.DIP.fix;
/*
 * Step III:
 * Create an PhoneClient class that implements
 * Notifier interface
 */
public class PhoneClient implements Notifier{
    @Override
    public void jobAlert(String jobDescription) {
        if (jobDescription == "urgent");
        System.out.print("Job description is brief");
    }
}
