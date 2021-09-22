package ex24;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void convertStr() {
        char[] testArray = new char[]{'H','e','l','l','o'};
        assertArrayEquals(testArray, App.convertStr("Hello"));
    }

    @Test
    void isAnagram() {
        char[] testArray1 = new char[]{'H','e','l','l','o'};
        char[] testArray2 = new char[]{'e','l','H','l','o'};
        assertTrue(App.isAnagram(testArray1,testArray2));
    }
}