package no.kristiania;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanTest {

    @Test
    void shouldTranslateOneToI() {
        assertEquals("I", RomanNumbers.toRoman(1));
    }

    @Test
    void shouldTranslateTwoToII() {
        assertEquals("II", RomanNumbers.toRoman(2));
    }

    @Test
    void shouldTranslateThreeToIII() {
        assertEquals("III", RomanNumbers.toRoman(3));
    }

}
