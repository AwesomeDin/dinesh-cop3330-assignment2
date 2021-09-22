package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void validateInput() {
        assertEquals("There were no errors found.",App.validateInput("John","Johnson","55555","TK-4321"));
    }

    @Test
    void validateFirst() {
        assertEquals("",App.validateFirst("John"));
    }

    @Test
    void validateLast() {
        assertEquals("",App.validateFirst("Johnson"));
    }

    @Test
    void validateZIP() {
        assertEquals("",App.validateZIP("55555"));
    }

    @Test
    void validateEmp() {
        assertEquals("",App.validateEmp("TK-4321"));
    }
}