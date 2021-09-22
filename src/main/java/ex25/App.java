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

    public static String scanIn()
    {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter the password: ");
        return (myInput.next());
    }

    public static int veryWeak(String x)
    {
        if(x.matches("\\d+" ) && x.length() < 8)
        {
            return 1;
        }
        return 0;
    }
    public static int Weak(String x)
    {
        if(x.matches("\\D+") && x.length() < 8)
        {
            return 2;
        }
        return 0;
    }
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
