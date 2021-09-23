package ex29;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rithvik Dinesh
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Gets the result from the user and then rounds it up to make sure it covers a decimal
        int result = scanIn();
        result  = (int)Math.ceil((double)72/result);
        System.out.println("It will take " + result + " years to double your initial investment.");
    }

    //Scans in the initial number and then continues to ask until the user
    //enters in a number then it uses a function to check if that
    //number is a zero.
    public static int scanIn() {
        Scanner myInput = new Scanner(System.in);
        System.out.print("What is the rate of return? ");
        while (!myInput.hasNextInt()) {
            System.out.println("Sorry. That's not a valid input.\n" +
                            "What is the rate of return?");
            myInput.next();
        }
        int result = myInput.nextInt();
        result = checkforZero(result);
        return result;
    }

    //Checks to see if the value passed is zero otherwise it will just return the
    //number passed in.
    public static int checkforZero(int result) {
        Scanner myInput = new Scanner(System.in);
        while (result == 0) {
            System.out.println("Sorry. That's not a valid input.\n" +
                    "What is the rate of return?");
            while (!myInput.hasNextInt()) {
                System.out.println("Sorry. That's not a valid input.\n" +
                        "What is the rate of return?");
                myInput.next();
            }
            result = myInput.nextInt();
        }
        return result;
    }

}
