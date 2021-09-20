package ex34;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rithvik Dinesh
 */

import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> currentEmployees = new ArrayList<>();
        addEmp(currentEmployees);
        System.out.println("There are 5 employees:");
        for (String i : currentEmployees) {
            System.out.println(i);
        }
        removeEmp(currentEmployees);
        System.out.println("\nThere are 4 employees:");
        for (String i : currentEmployees) {
            System.out.println(i);
        }

    }
    public static String nameRemove() {
        Scanner myInput = new Scanner(System.in);
        System.out.println("\nEnter an employee name to remove: ");
        return myInput.nextLine();
    }
    public static void addEmp(ArrayList<String> employees) {
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");
    }
    public static void removeEmp(ArrayList<String> employees) {
        employees.remove(employees.indexOf(nameRemove()));
    }
}
