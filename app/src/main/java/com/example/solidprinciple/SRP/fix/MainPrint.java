package com.example.solidprinciple.SRP.fix;

public class MainPrint {
    public static void print(PrintListener printListener) {
        System.out.println(printListener.getContent());
    }
}
