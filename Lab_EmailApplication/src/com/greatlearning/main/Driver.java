package com.greatlearning.main;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Employee employee = new Employee("Harry","Potter");
        CredentialService credentialService = new CredentialService();
        int choice;

            System.out.println("Please enter the department from the following");
            System.out.println("1. Technical");
            System.out.println("2. Admin");
            System.out.println("3. Human Resource");
            System.out.println("4. Legal");
            System.out.print("Enter the department number :  ");
            choice = scanner.nextInt();

            switch (choice){
                case 1 :    employee.setDepartment("tech");
                            employee.setEmail(credentialService.generateEmailAddress(employee.getFirstName(),
                                 employee.getLastName(), employee.getDepartment()));
                            employee.setPassword(credentialService.getPassword());
                            credentialService.showCredentials(employee);
                            break;

                case 2 :    employee.setDepartment("adm");
                            employee.setEmail(credentialService.generateEmailAddress(employee.getFirstName(),
                                employee.getLastName(), employee.getDepartment()));
                            employee.setPassword(credentialService.getPassword());
                            credentialService.showCredentials(employee);
                            break;

                case 3 :    employee.setDepartment("hr");
                            employee.setEmail(credentialService.generateEmailAddress(employee.getFirstName(),
                                employee.getLastName(), employee.getDepartment()));
                            employee.setPassword(credentialService.getPassword());
                            credentialService.showCredentials(employee);
                            break;

                case 4 :    employee.setDepartment("lg");
                            employee.setEmail(credentialService.generateEmailAddress(employee.getFirstName(),
                                employee.getLastName(), employee.getDepartment()));
                            employee.setPassword(credentialService.getPassword());
                            credentialService.showCredentials(employee);
                            break;

                default:    System.out.println("Incorrect Input!!!");
                            break;
            }

            scanner.close();

    }
}
