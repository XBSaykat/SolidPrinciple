package com.example.solidprinciple.DIP.fix;
/*
 * Step IV: The JobTracker class would just
 * call the respective notifiers. It does not
 * handle any logic
 */
public class JobTracker {
    private String currentAlert;

    public void setCurrentConditions(String jobDescription) {
        this.currentAlert = jobDescription;
    }

    public void notify(Notifier notifier) {
        notifier.jobAlert(currentAlert);
    }
}
