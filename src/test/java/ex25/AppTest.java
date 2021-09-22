package ex25;

import ex25.App;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void veryWeak() {
        App app = new App();
        assertEquals(1,App.veryWeak("12345"));
    }

    @Test
    void weak() {
        App app = new App();
        assertEquals(2,App.Weak("abcdef"));
    }

    @Test
    void strong() {
        App app = new App();
        assertEquals(3,App.Strong("abc123xyz"));
    }

    @Test
    void veryStrong() {
        App app = new App();
        assertEquals(4,App.veryStrong("1337h@xor!"));
    }

    @Test
    void passwordValidator() {
        App app = new App();
        assertEquals(3,App.passwordValidator("abc123xyz"));
    }
}