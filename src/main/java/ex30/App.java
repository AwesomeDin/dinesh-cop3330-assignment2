package ex30;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rithvik Dinesh
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        printTable(12);
    }
    public static void printTable(int size) {
        for(int i = 1 ;i<=size;i++) {
            for(int j = 1;j<=size;j++) {
                System.out.format("%5d",i*j);
            }
            System.out.println();
        }
    }
}
