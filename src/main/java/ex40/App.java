package ex40;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rithvik Dinesh
 */
import java.util.*;
import java.lang.Math;

public class App {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> multiValueMap = new HashMap<String, ArrayList<String>>();
        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter a search string: ");
        String search = myInput.nextLine();
        System.out.println("Name \t\t\t\t\t\t   | Position\t\t\t\t | Separation Date");
        System.out.println("----------------------------------------------------------------------------");
        controller(multiValueMap,search);
    }
    public static void putIn(Map<String, ArrayList<String>> ourMap, int number, String firstName[], String lastName[],
                             String position[], String separationDate[]) {
        ourMap.put(lastName[number], new ArrayList<String>());
        ourMap.get(lastName[number]).add(firstName[number]);
        ourMap.get(lastName[number]).add(position[number]);
        ourMap.get(lastName[number]).add(separationDate[number]);
    }
    public static void printIng(Map<String, ArrayList<String>> multiValueMap, String lastName[],ArrayList<Integer> people)
    {
        for(Integer i: people)
        {
            System.out.format("%-15s %-15s|%-25s|%-10s",multiValueMap.get(lastName[i]).get(0),
                    lastName[i], multiValueMap.get(lastName[i]).get(1),
                    multiValueMap.get(lastName[i]).get(2));
            System.out.println();
        }
    }
    public static void controller(Map<String, ArrayList<String>> multiValueMap,String search) {
        String firstName[] = {"John", "Tou", "Michaela", "Jake", "Jacquelyn","Sally"};
        String lastName[] = {"Johnson","Xiong","Michaelson","Jacobson","Jackson","Webber"};
        String position[] = {"Manager","Software Engineer", "District Manager", "Programmer", "DBA","Web Developer"};
        String separationDate[] = {"2016-12-31","2016-10-05","2015-12-19","","","2015-12-18"};
        for(int i = 0;i <lastName.length;i++)
        {
            putIn(multiValueMap, i, firstName,lastName,position,separationDate);
        }
        printIng(multiValueMap,lastName,filtering(search,multiValueMap,lastName,firstName));
    }
    public static ArrayList<Integer> filtering(String search, Map<String, ArrayList<String>> multiValueMap, String lastname[],
                                               String firstName[])
    {
        ArrayList<Integer> people = new ArrayList<Integer>();
        for(int i = 0;i< lastname.length;i++) {
            if (lastname[i].contains(search) || firstName[i].contains(search))
                people.add(i);
        }
        return people;
    }
}
