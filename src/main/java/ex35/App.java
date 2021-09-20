package ex35;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rithvik Dinesh
 */
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> peopleArray = new ArrayList<>();
        enterName(peopleArray);
        System.out.println("The winner is... " + chooseWinner(peopleArray) + ".");
    }
    public static void  enterName(ArrayList people) {
        Scanner myInput = new Scanner(System.in);
        while(true) {
            System.out.print("Enter a name: ");
            String s = myInput.nextLine();
            if (s.length() < 1) {
                break;
            }
            addEmp(people, s);
        }
    }

    public static void addEmp(ArrayList people, String name) {
        people.add(name);
    }

    public static String chooseWinner(ArrayList people)
    {
        int value = (int) (Math.random() * people.size());
        return (String) people.get(value);
    }
}