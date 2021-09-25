package ex35;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rithvik Dinesh
 */

import java.util.Scanner;
import java.util.ArrayList;

public class App {
    //Main function that creates the arraylist, calls the function, gets the random number
    //and then prints out the winner using the choosewinner function.
    public static void main(String[] args) {
        ArrayList<String> peopleArray = new ArrayList<>();
        enterName(peopleArray);
        int random = randomValue(peopleArray);
        System.out.println("The winner is... " + chooseWinner(peopleArray,random) + ".");
    }
    //Function that keeps looping until the user enters a blank space.
    public static void enterName(ArrayList<String> people) {
        boolean TorF = true;
        while(TorF) {
            String s = scanIn();
            people = statement(s,people);
            TorF = testLength(s);
        }
    }
    //checks to see if the space is blank to see if we need to breakout of the while loop
    public static boolean testLength(String s)
    {
        if(s.length() < 1)
            return false;
        return true;
    }

    //Checks to see if we should add the person to the arraylist, makes sure the space
    //isn't blank
    public static ArrayList<String> statement(String s,ArrayList<String> people)
    {
        if (s.length() >= 1) {
            people = addEmp(people, s);
        }
        return people;
    }

    //Simple scanin function that gets userinput
    public static String scanIn () {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter a name: ");
        return myInput.nextLine();
    }

    //adds people to the arraylist
    public static ArrayList<String> addEmp(ArrayList<String> people, String name) {
        people.add(name);
        return people;
    }

    //randomly picks the winner
    public static String chooseWinner(ArrayList<String> people,int random)
    {
        return people.get(random);
    }

    //gets a random number using the amount of people
    public static int randomValue(ArrayList<String> people) {
        return (int) (Math.random() * people.size());
    }
}