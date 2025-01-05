package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        // Test the method
        System.out.println("First Name Validation:");
        System.out.println(userRegistration.validateFirstName("John")); // Should return true
        System.out.println(userRegistration.validateFirstName("jo"));   // Should return false
    }
}