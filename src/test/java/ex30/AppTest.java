package ex30;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    //This exercise didn't really have anything actually complicated since it was
    //only printing which doesn't need a unit test so I just made the one computation there is a
    //method so I could add a unit test.
    @Test
    void multiply() {
        assertEquals(2,App.multiply(1,2));
    }
}