package com.example.lion;

import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;


public class LionGetKittensTest {


    @Test
    public void lionGetKittensCheck() throws Exception {
        Lion lion = new Lion("Самец");
        int expected = 1;
        int actual = lion.getKittens();
        assertEquals(expected, actual);
    }

    @Test
    public void lionGetKittensCountCheck() throws Exception {
        Lion lion = new Lion("Самец");
        int expected = 5;
        int actual = lion.getKittens(5);
        assertEquals(expected, actual);
    }
}
