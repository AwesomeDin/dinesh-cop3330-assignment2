package ex35;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testLength() {
        assertTrue(App.testLength("123456"));
    }

    @Test
    void statement() {
        ArrayList<String> peopleArray = new ArrayList<>();
        ArrayList<String> testArray = new ArrayList<>();
        testArray.add("Bart");
        assertEquals(testArray,App.statement("Bart",peopleArray));
    }


    @Test
    void addEmp() {
        ArrayList<String> peopleArray = new ArrayList<>();
        ArrayList<String> testArray = new ArrayList<>();
        testArray.add("Bart");
        assertEquals(testArray,App.statement("Bart",peopleArray));
    }

    @Test
    void chooseWinner() {
        ArrayList<String> testArray = new ArrayList<>();
        testArray.add("Bart");
        testArray.add("Lisa");
        assertEquals("Lisa", App.chooseWinner(testArray,1));
    }

    @Test
    void randomValue() {
        ArrayList<String> testArray = new ArrayList<>();
        testArray.add("Bart");
        testArray.add("Lisa");
        int x = App.randomValue(testArray);
        int low = 0;
        int high = 1;
        assertTrue(x>= low && x <= high);
    }
}