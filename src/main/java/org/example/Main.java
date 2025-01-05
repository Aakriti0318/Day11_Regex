package org.example;
import java.util.List;

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
        // Test Password
        System.out.println("Password Validation:");
        System.out.println(userRegistration.validatePassword("Xyz@1234")); // Should return true
        System.out.println(userRegistration.validatePassword("abc1234")); // Should return false

        List<String> emailSamples = List.of(
                // Valid Emails
                "abc@yahoo.com",         // Valid
                "abc-100@yahoo.com",     // Valid
                "abc.100@yahoo.com",     // Valid
                "abc111@abc.com",        // Valid
                "abc-100@abc.net",       // Valid
                "abc.100@abc.com.au",    // Valid
                "abc@1.com",             // Valid
                "abc@gmail.com.com",     // Valid
                "abc+100@gmail.com",     // Valid

                // Invalid Emails
                "abc",                   // Invalid - Missing "@" symbol
                "abc@.com.my",           // Invalid - TLD starts with a dot
                "abc123@gmail.a",        // Invalid - TLD must have at least two characters
                "abc123@.com",           // Invalid - TLD starts with a dot
                "abc123@.com.com",       // Invalid - TLD starts with a dot
                ".abc@abc.com",          // Invalid - First character is a dot
                "abc()*@gmail.com",      // Invalid - Contains invalid characters
                "abc@%*.com",            // Invalid - TLD contains invalid characters
                "abc..2002@gmail.com",   // Invalid - Contains double dots
                "abc.@gmail.com",        // Invalid - Ends with a dot
                "abc@abc@gmail.com",     // Invalid - Contains multiple "@" symbols
                "abc@gmail.com.1a",      // Invalid - TLD with two characters contains a digit
                "abc@gmail.com.aa.au"    // Invalid - Multiple TLDs are not allowed
        );

        System.out.println("Email Samples Validation:");
        System.out.println(userRegistration.validateEmailSamples(emailSamples));

    }
}