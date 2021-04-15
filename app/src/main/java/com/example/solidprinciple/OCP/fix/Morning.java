package com.example.solidprinciple.OCP.fix;

public class Morning implements TimeOfDay{
    @Override
    public String greet() {
        return "Good morning, sir.";
    }
}
