package ex33;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rithvik Dinesh
 */
import java.util.Scanner;

public class App {
    //Gets the userinput and then calls the magicrandom function
    public static void main(String[] args) {
        String userInput = scanIn("What's your question?");
        System.out.println("\n" + magicRandom());
    }
    //Scans in the userinput and returns back to the main
    public static String scanIn(String s)
    {
        Scanner myInput = new Scanner(System.in);
        System.out.println(s);
        return myInput.next();
    }
    //Randomly figures out which answer to return.
    public static String magicRandom() {
        String answers[] = {"Yes", "No", "Maybe", "Ask again later."};
        return answers[randomValue()];
    }

    //Gets a randomvalue from 0 to 4.
    public static int randomValue() {
        return (int) (Math.random() * 4);
    }
}
