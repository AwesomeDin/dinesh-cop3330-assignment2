package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void calculatePayment() {
        assertEquals(70,App.calculatePayment(5000,(12.0/100.0)/365.0,100));
    }
}