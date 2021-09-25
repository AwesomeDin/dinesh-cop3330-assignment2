package ex38;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rithvik Dinesh
 */

import java.util.Scanner;

public class App {
    //Main function that gets user input, splits the array with a delimiter, and then
    //creates an integer array to get the filtered numbers and then calls the printer.
    public static void main(String[] args) {
        String numbers = scanIn("Enter a list of numbers, separated by spaces: ");
        String[] arrOfStr = numbers.split(" ");
        int[] result = filterEvenNumbers(arrOfStr);
        printIng(result);
    }

    //filters out the numbers by only adding the even numbers to the array.
    public static int[] filterEvenNumbers(String [] str) {
        int [] arr = new int [str.length];
        int c = 0;
        for(int i=0; i<str.length; i++) {
            int x = Integer.parseInt(str[i]);
            if(x %2 == 0) {
                arr[c] = x;
                c += 1;
            }
        }
        return createNewArr(arr,c);
    }

    //Creates a brand new array that the even numbers will be put into.
    public static int[] createNewArr(int[] arr,int c)
    {
        int [] newArr = new int [c];
        for(int i = 0;i<c;i++)
        {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    //Simple scanin function that takes in the userinput and returns it
    public static String scanIn(String s) {
        Scanner myInput = new Scanner(System.in);
        System.out.print(s);
        return myInput.nextLine();
    }

    //prints out every item in the integer array
    public static void printIng(int[] result) {
        System.out.print("The even numbers are");
        for(int i = 0;i<result.length;i++){
            System.out.print(" " + result[i] );
        }
        System.out.println(".");
    }
}
