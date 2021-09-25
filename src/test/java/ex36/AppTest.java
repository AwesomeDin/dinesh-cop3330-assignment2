package ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void addEmp() {
        ArrayList<Double> numberArray = new ArrayList<>();
        ArrayList<Double> testArray = new ArrayList<>();
        testArray.add(2.0);
        assertEquals(testArray,App.addEmp(numberArray,2.0));

    }

    @Test
    void findAvg() {
        ArrayList<Double> testArray = new ArrayList<>();
        testArray.add(2.0);
        testArray.add(2.0);
        assertEquals(2.0,App.findAvg(testArray));
    }

    @Test
    void findMax() {
        ArrayList<Double> testArray = new ArrayList<>();
        testArray.add(2.0);
        testArray.add(1.0);
        assertEquals(2.0,App.findMax(testArray));
    }

    @Test
    void findMin() {
        ArrayList<Double> testArray = new ArrayList<>();
        testArray.add(2.0);
        testArray.add(1.0);
        assertEquals(1.0,App.findMin(testArray));
    }

    @Test
    void findStdev() {
        ArrayList<Double> testArray = new ArrayList<>();
        testArray.add(2.0);
        testArray.add(1.0);
        assertEquals(0.5,App.findStdev(testArray));
    }
}