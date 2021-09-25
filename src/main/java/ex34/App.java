package ex34;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rithvik Dinesh
 */

import java.util.Scanner;
import java.util.ArrayList;

public class App {
    //Main function that creates the currentemployees list and calls the functions
    //to add and remove the employee from the userinput
    public static void main(String[] args) {
        ArrayList<String> currentEmployees = new ArrayList<>();
        currentEmployees = addEmp(currentEmployees);
        System.out.println("There are 5 employees:");
        printNames(currentEmployees);
        String s = nameRemove();
        currentEmployees= removeEmp(currentEmployees,s);
        System.out.println("\nThere are 4 employees:");
        printNames(currentEmployees);

    }

    //Prints the names of the employees
    public static void printNames(ArrayList<String> employees) {
        for (String i : employees) {
            System.out.println(i);
        }
    }
    //Gets the name to be removed from the user
    public static String nameRemove() {
        Scanner myInput = new Scanner(System.in);
        System.out.print("\nEnter an employee name to remove: ");
        return myInput.nextLine();
    }

    //adds employees to the arraylist passed in
    public static ArrayList<String> addEmp(ArrayList<String> employees) {
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");
        return employees;
    }
    //removes the employee passed in
    public static ArrayList<String> removeEmp(ArrayList<String> employees,String s) {
        employees.remove(employees.indexOf(s));
        return employees;
    }
}
