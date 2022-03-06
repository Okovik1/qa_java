package com.example.feline;

import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void felineEatMeatTest() throws Exception {

        Feline feline = new Feline();
        List<String> expected = List.of(new String[]{"Животные", "Птицы", "Рыба"});

        List<String> actual = feline.eatMeat();
        assertEquals(expected, actual);

    }

    @Test
    public void felineGetFamilyTest() {

        Feline feline = new Feline();
        String expected = "Кошачьи";

        String actual = feline.getFamily();
        assertEquals(expected, actual);

    }

    @Test
    public void felineGetKittensTest() {

        Feline feline = new Feline();
        int expected = 1;

        int actual = feline.getKittens();
        assertEquals(expected, actual);

    }

    @Test
    public void felineGetKittensCountTest() {

        Feline feline = new Feline();
        int expected = 1;

        int actual = feline.getKittens(1);
        assertEquals(expected, actual);

    }

}
