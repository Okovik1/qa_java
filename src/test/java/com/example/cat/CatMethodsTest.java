package com.example.cat;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatMethodsTest {

    @Mock
    Feline feline;

    @Test

    public void catGetSoundCheck() {
        Cat cat = new Cat(feline);
        String expected = "Мяу";
        String actual = cat.getSound();
        assertEquals(expected, actual);
    }

    @Test
    public void catEatFoodCheck() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> expected = List.of(new String[]{"Животные", "Птицы", "Рыба"});

        List<String> actual = cat.getFood();
        assertEquals(expected, actual);
    }


}
