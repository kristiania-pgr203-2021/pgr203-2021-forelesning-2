package no.kristiania;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanTest {

    @Test
    void shouldTranslateOneToI() {
        assertEquals("I", RomanNumbers.toRoman(1));
    }

}
