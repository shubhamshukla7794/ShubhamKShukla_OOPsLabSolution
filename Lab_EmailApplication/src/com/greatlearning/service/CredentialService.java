package com.greatlearning.service;

import com.greatlearning.model.Employee;

import java.util.Random;

public class CredentialService {

    public String getPassword() {

        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$%^&*_=+-/.?<>()";
        String numbers = "1234567890";

        final String charStr = capitalLetters + lowerLetters + numbers + specialCharacters;

        Random random = new Random();
        StringBuilder strBuild = new StringBuilder();

        for (int i = 0; i<8; i++)
        {
            int randomIndex = random.nextInt(charStr.length());
            strBuild.append(charStr.charAt(randomIndex));
        }

        return strBuild.toString();
    }

    public String generateEmailAddress(String firstName, String lastName, String dept) {

        StringBuilder emailBuilder = new StringBuilder();
        emailBuilder.append(firstName.toLowerCase())
                    .append(lastName.toLowerCase())
                    .append('@')
                    .append(dept)
                    .append(".greatlearning.com");

        return emailBuilder.toString();
    }

    public void showCredentials(Employee employee) {

        System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
        System.out.println("Email    --> " + employee.getEmail());
        System.out.println("Password --> " + employee.getPassword());
    }


}
