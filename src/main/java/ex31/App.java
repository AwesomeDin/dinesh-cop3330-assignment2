package ex31;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rithvik Dinesh
 */
import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) {
        //Creates an array to get the values that were scanned in from the user then
        //sends them out to be printed
        int[] checkIn = scanIn();
        tabularFormat(checkIn[0],checkIn[1]);
    }
    //Takes in information from the user and makes sure it is valid,
    //uses a while loop to check if it is valid and then calls the zero function
    //to make sure that the number given is not zero
    public static int[] scanIn () {
        Scanner myInput = new Scanner(System.in);
        int [] temp = new int[2];
        System.out.println("What is your Resting Pulse? ");
        while (!myInput.hasNextInt()) {
            System.out.println("Sorry. That's not a valid input.");
            myInput.next();
        }
        int restingPulse = myInput.nextInt();
        restingPulse = checkforZero(restingPulse);
        System.out.println("What is your age? ");
        while (!myInput.hasNextInt()) {
            System.out.println("Sorry. That's not a valid input.");
            myInput.next();
        }
        int age = myInput.nextInt();
        age = checkforZero(age);
        temp[0] = age;
        temp[1] = restingPulse;
        return temp;
    }

    //Checks to make sure that the input scanned in from the user is not zero
    //because that is not valid.
    public static int checkforZero(int result) {
        Scanner myInput = new Scanner(System.in);
        while (result == 0) {
            System.out.println("Sorry. That's not a valid input.\n" +
                    "What is the rate of return?");
            while (!myInput.hasNextInt()) {
                System.out.println("Sorry. That's not a valid input.\n" +
                        "What is the rate of return?");
                myInput.next();
            }
            result = myInput.nextInt();
        }
        return result;
    }

    //Prints out the information in a table format
    public static void tabularFormat(int age, int restingPulse) {
        System.out.format("Resting Pulse: %d \t Age: %d", restingPulse,age);
        System.out.println();
        System.out.println("Intensity\t| Rate");
        System.out.println("------------|--------");
        for(int i = 55;i <= 95; i+=5) {
            System.out.format("%d%% \t\t| %d bmp", i, targetRate(age,restingPulse,i));
            System.out.println();
        }
    }

    //Calculates the bpm using the age, restingHR and intensity
    public static int targetRate(int age, int restingHR, double intensity){
        return (int) (Math.round(((220-age) - restingHR) * (intensity/100)) + restingHR);
    }
}
