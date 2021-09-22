package ex27;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rithvik Dinesh
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String [] theInfo = Controller();
        System.out.println(validateInput(theInfo[0],theInfo[1],theInfo[2],theInfo[3]));
    }

    static String[] Controller() {
        String firstName = scanIn("Enter the first name: ");
        String lastName = scanIn("Enter the last name: ");
        String zipCode = scanIn("Enter the ZIP code: ");
        String empId = scanIn("Enter the employee ID: ");
        String[] information = {firstName,lastName,zipCode,empId};
        return information;
    }
    public static String scanIn(String s) {
        Scanner myInput = new Scanner(System.in);
        System.out.print(s);
        return myInput.next();
    }
    static String validateInput(String first, String last, String ZIP, String emp) {
        String x = "";
        x += validateFirst(first);
        x+= validateLast(last);
        x+= validateEmp(emp);
        x+= validateZIP(ZIP);
        if(x.equals(""))
        {
            return "There were no errors found.";
        }
        return x;
    }
    static String validateFirst(String x) {
        if(x.length() == 0) {
            return "The first name must be at least 2 characters long.\n" +
                    "The first name must be filled in.\n";
        }
        else if(x.length() < 2)
        {
            return "The first name must be at least 2 characters long.\n";
        }
        return "";
    }
    static String validateLast(String x) {
        if(x.length() == 0) {
            return "The last name must be at least 2 characters long.\n" +
                    "The last name must be filled in.\n";
        }
       else if(x.length() < 2)
       {
           return "The last name must be at least 2 characters long.\n";
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
