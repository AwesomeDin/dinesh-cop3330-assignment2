package ex37;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    String specialLetters = "!@#$";
    String numbers = "1234567890";

    @Test
    void randomize() {
        char[] testArr = new char[]{'a'};
        char[] realArr = new char[]{'h','e','l','l','o'};
        assertFalse(Arrays.equals(App.randomize(realArr),testArr));
    }

    @Test
    void checkAtLeast() {
        assertEquals(16,App.checkAtLeast(8,4,4));
    }

    @Test
    void letters() {
        char[] testArr = new char[]{'a'};
        char[] password = new char[8];
        assertFalse(Arrays.equals(App.letters(8,2,2,password,
                numbers),testArr));
    }

    @Test
    void specletters() {
        char[] testArr = new char[]{'a'};
        char[] password = new char[8];
        assertFalse(Arrays.equals(App.specletters(8,2,2,password,
                numbers),testArr));
    }

    @Test
    void nums() {
        char[] testArr = new char[]{'a'};
        char[] password = new char[8];
        assertFalse(Arrays.equals(App.nums(8,2,2,password,
                numbers),testArr));
    }

    @Test
    void randomValue() {
        char[] testArr = new char[]{'a','b','c'};
        int x = App.randomValue(testArr);
        int low = 0;
        int high = 3;
        assertTrue(x>= low && x <= high);
    }
}