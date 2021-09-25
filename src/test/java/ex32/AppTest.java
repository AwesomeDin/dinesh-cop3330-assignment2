package ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void gameLevel() {
        assertEquals(10, App.gameLevel(1));
    }

    @Test
    void gameDifficulties() {
        int x = App.gameDifficulties(10);
        int low = 1;
        int high = 10;
        assertTrue(x>= low && x <= high);
    }

    @Test
    void checkNumber() {
        assertEquals(1,App.checkNumber(5,5,1));
    }
}