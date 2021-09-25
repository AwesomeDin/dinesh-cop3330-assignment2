package ex32;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rithvik Dinesh
 */
import java.util.Scanner;

public class App {

    //Just the starter main which gives the initial guess the number and then passes to
    //a controller for the rest of the game
    public static void main(String[] args) {
        System.out.println("Let's play Guess the Number!");
        controller();
    }

    //This controller function controls the entire game, I seperated it from the main
    //to have a dedicated control for all the functions.
    public static void controller() {
        int diffLevel = scanIn("Enter the difficulty level (1,2, or 3): ");
        int finalCounter = 1;
        int random = gameLevel(diffLevel);
        int secretNumber = gameDifficulties(random);
        finalCounter = gamePlay(finalCounter,secretNumber);
        playAgain(finalCounter);
    }

    //Simple scanin function that supports valid and nonvalid inputs
    public static int scanIn(String s) {
        Scanner myInput = new Scanner(System.in);
        System.out.print(s);
        while (!myInput.hasNextInt()) {
            System.out.println("Sorry. That's not a valid input.");
            myInput.next();
        }
        return myInput.nextInt();
    }

    //Checks user input to see if the user decided to play again before before calling
    //the controller again.
    public static void playAgain(int finalCounter) {
        Scanner myInput = new Scanner(System.in);
        System.out.format("You got it in %d guesses!\n\n",finalCounter);
        System.out.print("Do you wish to play again (Y/N)? ");
        String playAgain = myInput.next();
        while(playAgain.equals("Y") || playAgain.equals("y"))
        {
            controller();
        }

        System.exit(0);
    }

    //Checks what height the random number will go up to based on the difficulty
    //level chosen by the user.
    public static int gameLevel(int diffLevel) {
        if(diffLevel == 1)
            return 10;
        else if(diffLevel == 2)
            return 100;
        else
            return 1000;
    }

    //Returns a random number based on the gamelevel chosen by the user.
    public static int gameDifficulties(int height)
    {
        return (int) (Math.random() * height + 1);
    }

    //Initial gameplay of the function to get the initial guess of the user.
    //Calls the checknumber to see if the inital guess was correct.
    public static int gamePlay(int counter, int secretNumber) {
        Scanner myInput = new Scanner(System.in);
        System.out.print("I have my number. What's your guess? ");
        while (!myInput.hasNextInt()) {
            System.out.println("Sorry. That's not a valid input.");
            counter+=1;
            myInput.next();
        }
        int guess = myInput.nextInt();
        return checkNumber(guess,secretNumber,counter);
    }

    //Checks to see if what the user guesses was correct otherwise will continue
    //to ask the user for more numbers until the user finds the correct one.
    public static int checkNumber(int guess, int secretNumber,int counter)
    {
        Scanner myInput = new Scanner(System.in);
        while(guess != secretNumber){
            printbigOrsmall(guess,secretNumber);
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

    //Prints whether the guess is too high or too small
    public static void printbigOrsmall (int guess, int secretNumber) {
        if(guess > secretNumber)
            System.out.print("Too high. Guess again: ");
        else if( guess < secretNumber)
            System.out.print("Too low. Guess again: ");
    }

}
