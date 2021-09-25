package ex38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void createNewArr() {
        int [] newArr = new int []{1,2,3,4};
        assertArrayEquals(newArr,App.createNewArr(newArr,4));
    }
}