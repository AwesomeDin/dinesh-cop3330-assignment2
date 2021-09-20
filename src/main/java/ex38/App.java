package ex38;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rithvik Dinesh
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        scanIn();
    }

    public static int[] filterEvenNumbers(String [] str) {
        int size = str.length;
        int [] arr = new int [size];
        for(int i=0; i<size; i++) {
            int x = Integer.parseInt(str[i]);
            if(x %2 == 0)
                arr[i] =x;
        }
        return arr;
    }

    public static void scanIn() {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String numbers = myInput.nextLine();
        String[] arrOfStr = numbers.split(" ");
        int[] result = filterEvenNumbers(arrOfStr);
        printIng(result);

    }
    public static void printIng(int[] result) {
        System.out.print("The even numbers are");
        for(int i = 0;i<result.length;i++){
            if(result[i] != 0)
                System.out.print(" " + result[i] );
        }
        System.out.println(".");
    }
}
