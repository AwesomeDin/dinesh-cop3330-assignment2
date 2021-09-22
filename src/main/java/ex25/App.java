package ex25;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rithvik Dinesh
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        String s = scanIn();
        int result = passwordValidator(s);
        String finalResult = "";

        //Case statement that associates an int with a phrase and then prints that out
        switch (result)
        {
            case 1:
                finalResult = "very weak";
                break;
            case 2:
                finalResult = "weak";
                break;
            case 3:
                finalResult = "strong";
                break;
            case 7:
                finalResult = "very strong";
                break;
            default:
                System.out.println("The password does not work please input again");
                System.exit(1);
        }
        System.out.println("The password " + "'" + s + "' is a " + finalResult + " " +
                "password.");


    }

    //function to scan in the incoming inputs
    public static String scanIn()
    {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter the password: ");
        return (myInput.next());
    }

    //Checks to see if the password passes the veryWeak stage using regex
    public static int veryWeak(String x)
    {
        if(x.matches("\\d+" ) && x.length() < 8)
        {
            return 1;
        }
        return 0;
    }
    //Checks to see if the password passes the Weak stage using regex
    public static int Weak(String x)
    {
        if(x.matches("\\D+") && x.length() < 8)
        {
            return 2;
        }
        return 0;
    }
    //Checks to see if the password passes the Strong stage using regex
    public static int Strong(String x)
    {
        if(Pattern.compile("\\D+").matcher(x).find()
                && Pattern.compile("\\d+").matcher(x).find()
                && (x.length() >= 8))
        {
            return 3;
        }
        return 0;
    }
    //Checks to see if the password passes the veryStrong stage using regex
    public static int veryStrong(String x)
    {
        if(Pattern.compile("\\D+").matcher(x).find()
                && Pattern.compile("\\d+").matcher(x).find()
                && Pattern.compile("\\W").matcher(x).find()
                && (x.length() >= 8))
        {
            return 4;
        }
        return 0;
    }
    //Controller, calls all the functions and adds the score up to see what stage the
    //password is at.
    public static int passwordValidator (String x)
    {
        int result = 0;
        result += veryWeak(x);
        result += Weak(x);
        result += Strong(x);
        result += veryStrong(x);
        return result;
    }

}
