package ex37;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rithvik Dinesh
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("Your password is " + scanIn());

    }
    public static String passwordGenerator(int length, int numberAmt, int characterAmt) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String specialLetters = "!@#$";
        String numbers = "1234567890";

        char[] password = new char[length];
        for(int i = 0;i < (length-characterAmt-numberAmt);i++)
        {
            password[i] = letters.charAt((int) (Math.random() * letters.length()));
        }
        for(int i = (length-characterAmt-numberAmt);i < length-numberAmt;i++)
        {
            password[i] = specialLetters.charAt((int) (Math.random() * specialLetters.length()));
        }
        for(int i = length-characterAmt;i < length;i++)
        {
            password[i] = numbers.charAt((int) (Math.random() * numbers.length()));
        }
        password = randomize(password);
        String truePassword = new String(password);
        return truePassword;
    }

    public static String scanIn() {
        Scanner myInput = new Scanner(System.in);
        System.out.print("What's the minimum length? ");
        int length = myInput.nextInt();
        System.out.print("How many special characters? ");
        int howmanyChar = myInput.nextInt();
        System.out.print("How many numbers? ");
        int howmanyNumbers = myInput.nextInt();
        return passwordGenerator(length,howmanyChar,howmanyNumbers);
    }

    public static char[] randomize(char[] tobeRandomized) {
        for (int i = 0; i < tobeRandomized.length; i++) {
            int randomIndexToSwap = (int) (Math.random() * tobeRandomized.length);
            char temp = tobeRandomized[randomIndexToSwap];
            tobeRandomized[randomIndexToSwap] = tobeRandomized[i];
            tobeRandomized[i] = temp;
        }
        return tobeRandomized;
    }

}
