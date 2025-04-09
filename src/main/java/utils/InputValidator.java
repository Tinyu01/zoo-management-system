package main.java.utils;

import java.util.Scanner;

/**
 * Utility class for input validation.
 * Provides methods to validate different types of user input.
 */
public class InputValidator {
    
    /**
     * Validates and gets an integer input within a specified range
     * 
     * @param scanner Scanner object for input
     * @param prompt Message to display to the user
     * @param min Minimum allowed value (inclusive)
     * @param max Maximum allowed value (inclusive)
     * @return validated integer input
     */
    public static int getIntInput(Scanner scanner, String prompt, int min, int max) {
        int input;
        boolean isValid = false;
        
        do {
            System.out.println(prompt);
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Please enter a valid number");
                scanner.next(); // consume invalid input
                System.out.println(prompt);
            }
            
            input = scanner.nextInt();
            
            if (input >= min && input <= max) {
                isValid = true;
            } else {
                System.out.println("Error: Please enter a value between " + min + " and " + max);
            }
        } while (!isValid);
        
        return input;
    }
    
    /**
     * Validates and gets a boolean input
     * 
     * @param scanner Scanner object for input
     * @param prompt Message to display to the user
     * @return validated boolean input
     */
    public static boolean getBooleanInput(Scanner scanner, String prompt) {
        System.out.println(prompt + " (true/false):");
        while (!scanner.hasNextBoolean()) {
            System.out.println("Error: Please enter true or false");
            scanner.next(); // consume invalid input
            System.out.println(prompt + " (true/false):");
        }
        return scanner.nextBoolean();
    }
    
    /**
     * Validates and gets a string input
     * 
     * @param scanner Scanner object for input
     * @param prompt Message to display to the user
     * @return validated string input
     */
    public static String getStringInput(Scanner scanner, String prompt) {
        System.out.println(prompt);
        String input = scanner.next();
        while (input.trim().isEmpty()) {
            System.out.println("Error: Input cannot be empty");
            System.out.println(prompt);
            input = scanner.next();
        }
        return input;
    }
}