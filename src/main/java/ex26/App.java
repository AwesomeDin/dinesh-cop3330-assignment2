package ex26;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rithvik Dinesh
 */
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.print("What is your balance? ");
        double balance = myInput.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        double APR = myInput.nextDouble();
        APR = (APR/100)/365;

        System.out.print("What is the monthly payment you can make? ");
        double monthlyPay = myInput.nextDouble();

        PaymentCalculator n = new PaymentCalculator();
        double result = (int)Math.ceil(n.calculateMonthsUntilPaidOff(balance, monthlyPay, APR));
        System.out.format("It will take you %.0f months to pay off this card.",result);
    }
}
