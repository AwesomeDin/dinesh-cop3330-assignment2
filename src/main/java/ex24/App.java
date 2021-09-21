package ex24;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rithvik Dinesh
 */
import java.util.Scanner;
import java.util.Arrays;

public class App 
{
    public static void main( String[] args )
    {
        //Creates the initial statement and calls the two functions
        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        String first = scanIn("first");
        String second = scanIn("second");

        //Creates two character arrays to hold the incoming function return
        char[] firstArr = convertStr(first);
        char[] secondArr = convertStr(second);

        //ternary operator to see if they are actually anagrams or not
        String s = isAnagram(firstArr, secondArr) ? "are" : "are not";
        System.out.println("\"" + first + "\"" + " and " + second +"\" " + s + " anagrams.");
    }

    //Scans in the string from the user
    static String scanIn(String x)
    {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter the " + x + " string: ");
        return (myInput.next());
    }

    //This converts a string to character array, by doing
    //this we can check each individual letter
    static char[] convertStr (String x)
    {
        char[] done = new char[x.length()];
        for (int i = 0; i<x.length();i++)
            done[i] = x.charAt(i);
        return done;
    }

    //Function that takes in two character arrays, sorts them lexographically
    //and then checks to see if the letters match up
    static boolean isAnagram(char[] num1, char[] num2)
    {
        int first = num1.length;
        int second = num2.length;

        if(first != second)
            return false;

        Arrays.sort(num1);
        Arrays.sort(num2);

        for (int i = 0; i < first; i++)
            if (num1[i] != num2[i])
                return false;

        return true;
    }
}
