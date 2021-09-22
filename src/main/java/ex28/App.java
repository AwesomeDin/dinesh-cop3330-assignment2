package ex28;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rithvik Dinesh
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //creates a variable to store the return value and prints
        int total = numLoop(scanLoop());
        System.out.format("The total is %d.", total);
    }

    //Scans in the information given by the user.
    public static int scanIn(String s)
    {
        Scanner myInput = new Scanner(System.in);
        System.out.print(s);
        return myInput.nextInt();
    }

    //Creates an array thats stores the information given by the user and then
    //uses a for loop to put the information into the array.
    public static int[] scanLoop() {
        int[] tempArr = new int[5];
        for(int i = 0;i < 5;i++)
        {
           tempArr[i] = scanIn("Enter a number: ");
        }
        return tempArr;
    }

    //Uses a for loop to add the numbers given by the user.
    public static int numLoop(int[] numArr) {
        int tempTotal = 0;
        for(int i = 0;i<numArr.length;i++)
        {
            tempTotal += numArr[i];
        }
        return tempTotal;
    }

}
