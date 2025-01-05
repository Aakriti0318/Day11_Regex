package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        // Test the method
        System.out.println("First Name Validation:");
        System.out.println(userRegistration.validateFirstName("Jack")); // Should return true
        System.out.println(userRegistration.validateFirstName("jil"));   // Should return false

        System.out.println("Last Name Validation:");
        System.out.println(userRegistration.validateLastName("Daneil"));  // Should return true
        System.out.println(userRegistration.validateLastName("das"));   // Should return false
        System.out.println("Email Validation:");
        System.out.println(userRegistration.validateEmail("abc.xyz@bl.co.in")); // Should return true
        System.out.println(userRegistration.validateEmail("abc@.com.my"));     // Should return false

        System.out.println("Mobile Number Validation:");
        System.out.println(userRegistration.validateMobileNumber("91 9919898801")); // Should return true
        System.out.println(userRegistration.validateMobileNumber("91 8410919801"));  // Should return false
    }
}