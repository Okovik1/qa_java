package com.example.lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionGetFoodTest {

    @Test
    public void lionGetFoodTest() throws Exception {
        Lion lion = new Lion("Самец", new Feline());
        List<String> expected = List.of(new String[]{"Животные", "Птицы", "Рыба"});
        List<String> actual = lion.getFood();
        assertEquals(expected, actual);
 
    }
}
