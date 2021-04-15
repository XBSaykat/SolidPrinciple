package com.example.solidprinciple.OCP.fix;

public class Afternoon implements TimeOfDay{
    @Override
    public String greet() {
        return "Good afternoon, sir.";
    }
}
