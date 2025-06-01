package com.example.design_patterns.builder;

public class Main {

    public static void main(String[] args) {
        UserProfile userProfile = new UserProfile.Builder("Amit Thatera", "amit.thatera@gamil.com")
                .phone("9897845455")
                .address("India")
                .linkedinUrl("www.linkedin.com/amit.thatera")
                .skills("java, python, html, javascript")
                .build();
        System.out.println("UserProfile: " + userProfile);

        UserProfile simpleProfile = new UserProfile.Builder("Saurav Jain", "saurvaj@gmail.com").build();
        System.out.println("UserProfile: " + simpleProfile);
    }
}
