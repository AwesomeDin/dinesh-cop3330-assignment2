package ex27;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rithvik Dinesh
 */
import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        //Uses a string array to get the information from the user
        //It then sends this to the validate input function to figure everything out
        String [] theInfo = Controller();
        System.out.println(validateInput(theInfo[0],theInfo[1],theInfo[2],theInfo[3]));
    }

    //Sets up the problem by getting all the information and sending it back to the main
    public static String[] Controller() {
        String firstName = scanIn("Enter the first name: ");
        String lastName = scanIn("Enter the last name: ");
        String zipCode = scanIn("Enter the ZIP code: ");
        String empId = scanIn("Enter the employee ID: ");
        String[] information = {firstName,lastName,zipCode,empId};
        return information;
    }

    //Simple scanin function to get the input from the user.
    public static String scanIn(String s) {
        Scanner myInput = new Scanner(System.in);
        System.out.print(s);
        return myInput.next();
    }

    //Validates input by taking in the information and then sending it out to individual
    //functions that use regex and if statements to make sure it follows the correct formatting
    public static String validateInput(String first, String last, String ZIP, String emp) {
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

    //Validates the first name, first make sures that the length is correct, then it
    //makes sure that it is not blank.
    public static String validateFirst(String x) {
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

    //Validates the last name, first make sures that the length is correct, then it
    //makes sure that it is not blank.
    public static String validateLast(String x) {
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
    //Uses regex to check if the zipcode follows the correct formatting.
    public static String validateZIP(String x) {
        if(Pattern.matches("\\d\\d\\d\\d\\d",x)){
            return "";
        }
        else
            return "The zipcode must be a 5 digit number.\n";
    }
    //Uses regex to check if the employeeID follows the correct formatting.
    public static String validateEmp(String x) {
        if(x.matches("\\D\\D[-]\\d\\d\\d\\d"))
        {
            return "";
        }
        return "The employee ID must be in the format of AA-1234.\n";
    }
}
