package com.example.lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LionGetKittensTest {


    @Test
    public void lionGetKittensCheck() throws Exception {
        Lion lion = new Lion("Самец", new Feline());
        int expected = 1;
        int actual = lion.getKittens();
        assertEquals(expected, actual);
    }

}
