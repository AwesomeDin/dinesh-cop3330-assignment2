package ex36;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rithvik Dinesh
 */
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class App {
    public static void main(String[] args) {
        ArrayList<Double> numberArray = new ArrayList<>();
        enterName(numberArray);
        System.out.print("Numbers: ");
        for (double i : numberArray) {
            System.out.print((int)i + ",");
        }
        printIng(numberArray);
    }
    public static void  enterName(ArrayList numbers) {
        Scanner myInput = new Scanner(System.in);
        while(true) {
            System.out.print("Enter a number: ");
            String num = myInput.nextLine();
            if (num.equals("done")) {
                break;
            }
            else if (!num.matches("\\d+" ))
            {
                continue;
            }
            addEmp(numbers, Double.parseDouble(num));
        }
    }
    public static void addEmp(ArrayList numbers, double num) {
        numbers.add(num);
    }
    public static double findAvg(ArrayList numbers)
    {
        double total = 0;
        for(int i = 0; i < numbers.size(); i++)
            total += (double)numbers.get(i);
        return total / numbers.size();
    }
    public static double findMax(ArrayList numbers)
    {
        double max = (double)numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if ((double)numbers.get(i) > max) {
                max = (double)numbers.get(i);
            }
        }
        return max;
    }
    public static double findMin(ArrayList numbers)
    {
        double min = (double)numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if ((double)numbers.get(i) < min) {
                min = (double)numbers.get(i);
            }
        }
        return min;
    }
    public static double findStdev(ArrayList numbers)
    {
        double avg = findAvg(numbers);
        double total = 0;

        for (int i = 0; i < numbers.size(); i++)
        {
            double val = (double)numbers.get(i);
            double squrDiffToMean = Math.pow(val - avg, 2);
            total += squrDiffToMean;
        }
        double meanOfDiffs = total / (double) (numbers.size());
        return Math.sqrt(meanOfDiffs);
    }
    public static void printIng(ArrayList numbers)
    {
        System.out.format("\nThe average is %.1f",findAvg(numbers));
        System.out.format("\nThe minimum is %.0f",findMin(numbers));
        System.out.format("\nThe maximum is %.0f",findMax(numbers));
        System.out.format("\nThe standard deviation is %.2f",findStdev(numbers));
    }
}
