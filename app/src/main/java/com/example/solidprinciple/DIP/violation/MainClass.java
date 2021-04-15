package com.example.solidprinciple.DIP.violation;
/*
 * Based on the jobDescription, the alert is sent
 * This logic should not be implemented here!
 */
public class MainClass {
    public void setCurrentConditions(String jobDescription) {
        Phone phone = new Phone();
        Emailer emailer = new Emailer();
        if (jobDescription == "urgent") {
            String alert = phone.generateJobAlert(jobDescription);
            System.out.print(alert);
        }
        if (jobDescription == "brief") {
            String alert = emailer.generateJobAlert(jobDescription);
            System.out.print(alert);
        }
    }
}
