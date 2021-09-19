package ex29;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rithvik Dinesh
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int result = scanIn();
        result  = 72/result;
        System.out.println("It will take " + result + " years to double your initial investment.");
    }

    static int scanIn() {
        Scanner myInput = new Scanner(System.in);
        System.out.println("What is the rate of return? ");
        while (!myInput.hasNextInt()) {
            System.out.println("Sorry. That's not a valid input.\n" +
                            "What is the rate of return?");
            myInput.next();
        }
        int result = myInput.nextInt();
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
