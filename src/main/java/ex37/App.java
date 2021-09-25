
package ex37;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rithvik Dinesh
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int length = scanIn("What's the minimum length? ");
        int howmanyChar = scanIn("\"How many special characters? ");
        int howmanyNumbers = scanIn("How many numbers? ");
        length = checkAtLeast(length,howmanyChar,howmanyNumbers);
        System.out.print("Your password is " + passwordGenerator(length,howmanyNumbers,howmanyChar));
    }
    public static int checkAtLeast(int length, int howmanyChar, int howmanyNumbers) {
        if(length > 2*(howmanyChar + howmanyNumbers))
        {
            return length;
        }
        else
        {
            return length*2;
        }
    }
    public static int scanIn(String s) {
        Scanner myInput = new Scanner(System.in);
        System.out.print(s);
        return myInput.nextInt();
    }
    public static String passwordGenerator(int length, int numberAmt, int characterAmt) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String specialLetters = "!@#$";
        String numbers = "1234567890";

        char[] password = new char[length];
        password = letters(length,numberAmt,characterAmt,password,letters);
        password = specletters(length,numberAmt,characterAmt,password,specialLetters);
        password = nums(length,numberAmt,characterAmt,password,numbers);
        password = randomize(password);
        String truePassword = new String(password);
        return truePassword;
    }

    public static char[] letters(int length, int numberAmt, int characterAmt,char[] password,String letters)
    {
        for(int i = 0;i < (length-characterAmt-numberAmt);i++)
            password[i] = letters.charAt((int) (Math.random() * letters.length()));
        return password;
    }

    public static char[] specletters(int length, int numberAmt, int characterAmt,char[] password,String specialLetters)
    {
        for(int i = (length-characterAmt-numberAmt);i < length-numberAmt;i++)
            password[i] = specialLetters.charAt((int) (Math.random() * specialLetters.length()));
        return password;
    }

    public static char[] nums(int length, int numberAmt, int characterAmt,char[] password,String numbers)
    {
        for(int i = length-characterAmt;i < length;i++)
            password[i] = numbers.charAt((int) (Math.random() * numbers.length()));
        return password;
    }

    public static char[] randomize(char[] tobeRandomized) {
        for (int i = 0; i < tobeRandomized.length; i++) {
            int randomIndexToSwap = randomValue(tobeRandomized);
            char temp = tobeRandomized[randomIndexToSwap];
            tobeRandomized[randomIndexToSwap] = tobeRandomized[i];
            tobeRandomized[i] = temp;
        }
        return tobeRandomized;
    }
    public static int randomValue(char[] tobeRandomized)
    {
        return (int) (Math.random() * tobeRandomized.length);
    }

}