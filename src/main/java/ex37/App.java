
package ex37;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rithvik Dinesh
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Gets all the information from the user and sends it out to the functions
        int length = scanIn("What's the minimum length? ");
        int howmanyChar = scanIn("\"How many special characters? ");
        int howmanyNumbers = scanIn("How many numbers? ");
        length = checkAtLeast(length,howmanyChar,howmanyNumbers);
        System.out.print("Your password is " + passwordGenerator(length,howmanyNumbers,howmanyChar));
    }
    //this checks to make sure that there is enough letters compared to the special characters and numbers
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

    //Simple scanin function that gets user input
    public static int scanIn(String s) {
        Scanner myInput = new Scanner(System.in);
        System.out.print(s);
        return myInput.nextInt();
    }

    //Has the arrays of the characters and sends that out to get random characters for the password
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

    //Gets random letters and puts it into the password array
    public static char[] letters(int length, int numberAmt, int characterAmt,char[] password,String letters)
    {
        for(int i = 0;i < (length-characterAmt-numberAmt);i++)
            password[i] = letters.charAt((int) (Math.random() * letters.length()));
        return password;
    }

    //Gets random special letters and puts it into the password array
    public static char[] specletters(int length, int numberAmt, int characterAmt,char[] password,String specialLetters)
    {
        for(int i = (length-characterAmt-numberAmt);i < length-numberAmt;i++)
            password[i] = specialLetters.charAt((int) (Math.random() * specialLetters.length()));
        return password;
    }

    //Gets random numbers and puts it into the password array
    public static char[] nums(int length, int numberAmt, int characterAmt,char[] password,String numbers)
    {
        for(int i = length-characterAmt;i < length;i++)
            password[i] = numbers.charAt((int) (Math.random() * numbers.length()));
        return password;
    }

    //Randomizes the password array
    public static char[] randomize(char[] tobeRandomized) {
        for (int i = 0; i < tobeRandomized.length; i++) {
            int randomIndexToSwap = randomValue(tobeRandomized);
            char temp = tobeRandomized[randomIndexToSwap];
            tobeRandomized[randomIndexToSwap] = tobeRandomized[i];
            tobeRandomized[i] = temp;
        }
        return tobeRandomized;
    }

    //Gets a random value number
    public static int randomValue(char[] tobeRandomized)
    {
        return (int) (Math.random() * tobeRandomized.length);
    }

}