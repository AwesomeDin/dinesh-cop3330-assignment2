package ex35;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rithvik Dinesh
 */

import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> peopleArray = new ArrayList<>();
        enterName(peopleArray);
        int random = randomValue(peopleArray);
        System.out.println("The winner is... " + chooseWinner(peopleArray,random) + ".");
    }
    public static void enterName(ArrayList<String> people) {
        boolean TorF = true;
        while(TorF) {
            String s = scanIn();
            people = statement(s,people);
            TorF = testLength(s);
        }
    }
    public static boolean testLength(String s)
    {
        if(s.length() < 1)
            return false;
        return true;
    }

    public static ArrayList<String> statement(String s,ArrayList<String> people)
    {
        if (s.length() >= 1) {
            people = addEmp(people, s);
        }
        return people;
    }

    public static String scanIn () {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter a name: ");
        return myInput.nextLine();
    }

    public static ArrayList<String> addEmp(ArrayList<String> people, String name) {
        people.add(name);
        return people;
    }

    public static String chooseWinner(ArrayList<String> people,int random)
    {
        return people.get(random);
    }

    public static int randomValue(ArrayList<String> people) {
        return (int) (Math.random() * people.size());
    }
}