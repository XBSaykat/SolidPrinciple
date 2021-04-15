package com.example.solidprinciple.OCP.fix;

/* Create an interface called TimeOfDay and let the Morning, Afternoon,
 * Evening classes implement this interface.
 * This interface can then be called inside the TimeOfDayGreeting class.
 * This means the getGreetingFromTimeOfDay() method need not handle
 * any logic
 */

public class TimeOfDayGreeting {
    private TimeOfDay timeOfDay;
    public TimeOfDayGreeting(TimeOfDay timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public String getGreetingFromTimeOfDay() {
        return this.timeOfDay.greet();
    }
}
