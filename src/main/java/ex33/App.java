package ex33;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rithvik Dinesh
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("What's your question?");
        String newAnswer = myInput.next();
        System.out.println("\n" + magicRandom());
    }
    public static String magicRandom() {
        String answers[] = {"Yes", "No", "Maybe", "Ask again later."};
        int value = (int) (Math.random() * 4);
        return answers[value];
    }
}
