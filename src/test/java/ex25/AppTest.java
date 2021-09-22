package ex25;

import ex25.App;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void veryWeak() {
        assertEquals(1,App.veryWeak("12345"));
    }

    @Test
    void weak() {
        assertEquals(2,App.Weak("abcdef"));
    }

    @Test
    void strong() {
        assertEquals(3,App.Strong("abc123xyz"));
    }

    @Test
    void veryStrong() {
        assertEquals(4,App.veryStrong("1337h@xor!"));
    }

    @Test
    void passwordValidator() {
        assertEquals(3,App.passwordValidator("abc123xyz"));
    }
}