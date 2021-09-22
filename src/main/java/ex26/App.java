package ex26;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rithvik Dinesh
 */
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        double balance = scanIn("What is your balance? ");

        double APR = scanIn("What is the APR on the card (as a percent)? ");
        //Divides by 100 and then 365 as dictates by the formula.
        APR = (APR/100)/365;

        double monthlyPay = scanIn("What is the monthly payment you can make? " );

        //output line
        System.out.format("It will take you %d months to pay off this card.", calculatePayment(balance, APR, monthlyPay));
    }
    //Scans in the input from the user and then returns the double
    public static Double scanIn(String x) {
        Scanner myInput = new Scanner(System.in);
        System.out.print(x);
        return myInput.nextDouble();
    }
    //Calculates the payment and then converts it to the amount of years using a separate class.
    public static int calculatePayment(double balance, double APR, double monthlyPay) {
        PaymentCalculator n = new PaymentCalculator();
        return (int)Math.ceil(n.calculateMonthsUntilPaidOff(balance, monthlyPay, APR));
    }
}
