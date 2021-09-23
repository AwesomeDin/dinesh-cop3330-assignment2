package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void checkforZero() {
        assertEquals(10, App.checkforZero(10));
    }

    @Test
    void targetRate() {
        assertEquals(138,App.targetRate(22,65,55));
    }
}