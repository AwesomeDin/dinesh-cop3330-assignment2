package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff() {
        assertEquals(69.38218057582237,PaymentCalculator.calculateMonthsUntilPaidOff(5000,100,(12.0/100.0)/365.0));
    }
}