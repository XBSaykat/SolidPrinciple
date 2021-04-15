package com.example.solidprinciple.DIP.violation;
/*
 * Class called Phone to send phone alerts
 */
public class Phone {
    public String generateJobAlert(String job) {
        String alert = "You are alerted for " + job;
        return alert;
    }
}
