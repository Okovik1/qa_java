package com.example.lion;

import com.example.Lion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LionDoesHaveManeErrorTest {
    private final String EXPECTED = "Используйте допустимые значения пола животного - самей или самка";

    @Test
    public void lionDoesHaveManeErrorCheck() {
        try {
            Lion lion = new Lion("Самец1");
            boolean actual = lion.doesHaveMane();
        } catch (java.lang.Exception exception) {
            assertEquals(EXPECTED, exception.getMessage());
        }
    }
}
