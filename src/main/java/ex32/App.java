package ex32;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rithvik Dinesh
 */
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Let's play Guess the Number!");
        controller();
    }
    public static void controller() {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter the difficulty level (1,2, or 3): ");
        while (!myInput.hasNextInt()) {
            System.out.println("Sorry. That's not a valid input.");
            myInput.next();
        }
        int diffLevel = myInput.nextInt();
        int finalCounter = 1;
        if(diffLevel == 1)
            finalCounter= easy(finalCounter);
        else if(diffLevel == 2)
            finalCounter=medium(finalCounter);
        else
            finalCounter=hard(finalCounter);
        System.out.format("You got it in %d guesses!\n\n",finalCounter);
        System.out.print("Do you wish to play again (Y/N)? ");
        String playAgain = myInput.next();
        while(playAgain.equals("Y") || playAgain.equals("y"))
        {
            controller();
        }

        System.exit(0);
    }

    public static int easy(int counter) {
        int secretNumber = (int) (Math.random() * 10 + 1);
        return gamePlay(counter,secretNumber);
    }

    public static int medium(int counter) {
        int secretNumber = (int) (Math.random() * 100 + 1);
        return gamePlay(counter,secretNumber);
    }

    public static int hard(int counter) {
        int secretNumber = (int) (Math.random() * 1000 + 1);
        return gamePlay(counter,secretNumber);
    }

    public static int gamePlay(int counter, int secretNumber) {
        Scanner myInput = new Scanner(System.in);
        System.out.print("I have my number. What's your guess? ");
        while (!myInput.hasNextInt()) {
            System.out.println("Sorry. That's not a valid input.");
            counter+=1;
            myInput.next();
        }
        int guess = myInput.nextInt();
        while(guess != secretNumber){
            if(guess > secretNumber)
                System.out.print("Too high. Guess again: ");
            else if( guess < secretNumber)
                System.out.print("Too low. Guess again: ");
            counter +=1;
            while (!myInput.hasNextInt()) {
                System.out.println("Sorry. That's not a valid input.");
                counter+=1;
                myInput.next();
            }
            guess = myInput.nextInt();
        }
        return counter;
    }
}
