package com.example.solidprinciple.OCP.fix;

public class Evening implements TimeOfDay{
    @Override
    public String greet() {
        return "Good evening, sir.";
    }
}
