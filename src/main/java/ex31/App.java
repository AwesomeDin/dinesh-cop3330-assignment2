package ex31;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rithvik Dinesh
 */
import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) {
        scanIn();
    }
    static void scanIn () {
        Scanner myInput = new Scanner(System.in);
        System.out.println("What is your Resting Pulse? ");
        while (!myInput.hasNextInt()) {
            System.out.println("Sorry. That's not a valid input.");
            myInput.next();
        }
        int restingPulse = myInput.nextInt();
        while (restingPulse == 0) {
            System.out.println("Sorry. That's not a valid input.");
            while (!myInput.hasNextInt()) {
                System.out.println("Sorry. That's not a valid input.");
                myInput.next();
            }
            restingPulse = myInput.nextInt();
        }

        System.out.println("What is your age? ");
        while (!myInput.hasNextInt()) {
            System.out.println("Sorry. That's not a valid input.");
            myInput.next();
        }
        int age = myInput.nextInt();
        while (age == 0) {
            System.out.println("Sorry. That's not a valid input.");
            while (!myInput.hasNextInt()) {
                System.out.println("Sorry. That's not a valid input.");
                myInput.next();
            }
            age = myInput.nextInt();
        }
        tabularFormat(age,restingPulse);
    }
    static void tabularFormat(int age, int restingPulse) {
        System.out.format("Resting Pulse: %d \t Age: %d", restingPulse,age);
        System.out.println();
        System.out.println("Intensity\t| Rate");
        System.out.println("------------|--------");
        for(int i = 55;i <= 95; i+=5) {
            System.out.format("%d%% \t\t| %d bmp", i, targetRate(age,restingPulse,i));
            System.out.println();
        }
    }
    public static int targetRate(int age, int restingHR, double intensity){
        return (int) (Math.round(((220-age) - restingHR) * (intensity/100)) + restingHR);
    }
}
