package com.example.solidprinciple.OCP.violation;

/* Every time this method is called it will
 * called an if else logic, which is in violation of the
 * OCP principle.
 */


public class TimeOfDayGreeting {
    private String timeOfDay;

    public String getGreetingFromTimeOfDay() {
        if (this.timeOfDay == "Morning") {
            return "Good Morning, sir.";
        } else if (this.timeOfDay == "Afternoon") {
            return "Good Afternoon, sir.";
        } else if (this.timeOfDay == "Evening") {
            return "Good Evening, sir.";
        } else {
            return "Good Night, sir.";
        }
    }
        public void setTimeOfDay(String timeOfDay) {
            this.timeOfDay = timeOfDay;
        }
}
