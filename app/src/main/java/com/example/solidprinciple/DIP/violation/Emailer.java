package com.example.solidprinciple.DIP.violation;
/*
 * Class called Emailer to send email alerts
 */
public class Emailer {
    public String generateJobAlert(String job) {
        String alert = "You are alerted for " + job;
        return alert;
    }
}
