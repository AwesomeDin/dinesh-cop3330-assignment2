package ex27;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rithvik Dinesh
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String firstName = myInput.next();
        System.out.print("Enter the last name: ");
        String lastName = myInput.next();
        System.out.print("Enter the ZIP code: ");
        String zipCode = myInput.next();
        System.out.print("Enter the employee ID: ");
        String empId = myInput.next();
        validateInput(firstName,lastName,zipCode,empId);
    }

    static void validateInput(String first, String last, String ZIP, String emp) {
        String x = "";
        x += validateFirst(first);
        x+= validateLast(last);
        x+= validateEmp(emp);
        x+= validateZIP(ZIP);
        if(x.equals(""))
        {
            x = "There were no errors found.";
        }
        System.out.println(x);
    }
    static String validateFirst(String x) {
        if(x.length() < 2)
        {
            return "The first name must be at least 2 characters long.\n";
        }
        return "";
    }
    static String validateLast(String x) {
       if(x.length() < 2)
       {
           return "The last name must be at least 2 characters long.\n" +
                   "The last name must be filled in.\n";
       }
        return "";
    }
    static String validateZIP(String x) {
        try {
            int d = Integer.parseInt(x);
        } catch (NumberFormatException nfe) {
            return "The zipcode must be a 5 digit number.\n";
        }
        return "";
    }
    static String validateEmp(String x) {
        if(x.matches("\\D\\D[-]\\d\\d\\d\\d"))
        {
            return "";
        }
        return "The employee ID must be in the format of AA-1234.\n";
    }
}
