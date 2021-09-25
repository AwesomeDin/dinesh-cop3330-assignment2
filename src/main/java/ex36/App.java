package ex36;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rithvik Dinesh
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class App {
    //Creates the new arraylist and calls the functions in sequential order
    public static void main(String[] args) {
        ArrayList<Double> numberArray = new ArrayList<>();
        enterName(numberArray);
        printArray(numberArray);
        printIng(numberArray);
    }
    //Prints the array out once they are done entering numbers
    public static void printArray(ArrayList<Double> numberArray) {
        System.out.print("Numbers: ");
        for (double i : numberArray) {
            System.out.print((int)i + ",");
        }
    }

    //Continues to enter in numbers until done is entered, ignores bad numbers
    public static void  enterName(ArrayList<Double> numbers) {
        while(true) {
            String num = scanIn("Enter a number: ");
            if (num.equals("done")) {
                break;
            }
            else if (!num.matches("\\d+" ))
            {
                continue;
            }
            numbers = addEmp(numbers, Double.parseDouble(num));
        }
    }

    //simple scanin function that returns the user input
    public static String scanIn(String s) {
        Scanner myInput = new Scanner(System.in);
        System.out.print(s);
        return myInput.nextLine();
    }

    //Adds numbers to the arraylist
    public static ArrayList<Double> addEmp(ArrayList<Double> numbers, double num) {
        numbers.add(num);
        return numbers;
    }

    //Finds the average of the arraylist
    public static double findAvg(ArrayList<Double> numbers)
    {
        double total = 0;
        for(int i = 0; i < numbers.size(); i++)
            total += numbers.get(i);
        return total / numbers.size();
    }

    //finds the max of the arraylist
    public static double findMax(ArrayList<Double> numbers)
    {
        double max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    //finds the minimum of the arraylist
    public static double findMin(ArrayList<Double> numbers)
    {
        double min = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        return min;
    }

    //finds the standard deviation of the arraylist
    public static double findStdev(ArrayList<Double> numbers)
    {
        double avg = findAvg(numbers);
        double total = 0;

        for (int i = 0; i < numbers.size(); i++)
        {
            double val = numbers.get(i);
            double squrDiffToMean = Math.pow(val - avg, 2);
            total += squrDiffToMean;
        }
        double meanOfDiffs = total / (double) (numbers.size());
        return Math.sqrt(meanOfDiffs);
    }

    //prints the final closing statements
    public static void printIng(ArrayList<Double> numbers)
    {
        System.out.format("\nThe average is %.1f",findAvg(numbers));
        System.out.format("\nThe minimum is %.0f",findMin(numbers));
        System.out.format("\nThe maximum is %.0f",findMax(numbers));
        System.out.format("\nThe standard deviation is %.2f",findStdev(numbers));
    }
}
