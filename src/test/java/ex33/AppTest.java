package ex33;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void randomValue() {
        int x = App.randomValue();
        int low = 0;
        int high = 3;
        assertTrue(x>= low && x <= high);
    }
}