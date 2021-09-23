package ex30;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rithvik Dinesh
 */

public class App {
    //calls the function with the size of 12
    public static void main(String[] args) {
        printTable(12);
    }
    //Used two for loops that would basically add as they go and used a modifier
    //to make sure it stays in table format
    public static void printTable(int size) {
        for(int i = 1 ;i<=size;i++) {
            for(int j = 1;j<=size;j++) {
                System.out.format("%5d",multiply(i,j));
            }
            System.out.println();
        }
    }

    //Just multiplys the row and column of the nested loops since computations should have a method.
    public static int multiply(int i, int j)
    {
        return i*j;
    }
}
