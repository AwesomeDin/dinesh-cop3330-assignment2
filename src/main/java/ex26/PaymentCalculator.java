package ex26;
import java.lang.Math;
public class PaymentCalculator {
    //Uses the formula given to us to calculate the number and then returns it
    public static double calculateMonthsUntilPaidOff(double b, double p, double i) {
        return (-(1.0/30.0) * Math.log(1 + b/p * (1 - Math.pow(1+i, 30.0))) / Math.log(1 + i));
    }
}