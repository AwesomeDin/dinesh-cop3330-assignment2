package ex28;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rithvik Dinesh
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int total = 0;
        total = numLoop(total);
        System.out.format("The total is %d.", total);
    }

    static int numLoop(int total) {
        Scanner myInput = new Scanner(System.in);
        for(int i = 0;i < 5;i++)
        {
            System.out.print("Enter a number: ");
            total += myInput.nextInt();
        }
        return total;
    }
}
