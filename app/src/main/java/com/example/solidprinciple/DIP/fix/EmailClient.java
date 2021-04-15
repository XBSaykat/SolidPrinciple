package com.example.solidprinciple.DIP.fix;
/*
 * Step II:
 * Create an emailClient class that implements
 * Notifier interface
 */
public class EmailClient implements Notifier{
    @Override
    public void jobAlert(String jobDescription) {
        if (jobDescription == "brief");
        System.out.print("Job description is brief");
    }
}
