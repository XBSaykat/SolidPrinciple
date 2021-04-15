package com.example.solidprinciple.OCP.fix;

public class Night implements TimeOfDay{
    @Override
    public String greet() {
        return "Good night, sir.";
    }
}
