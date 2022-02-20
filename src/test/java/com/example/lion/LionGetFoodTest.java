package com.example.lion;

import com.example.Lion;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionGetFoodTest {

    @Test
    public void LionGetFoodTest() throws Exception {
        Lion lion = new Lion("Самец");
        List<String> expected = List.of(new String[]{"Животные", "Птицы", "Рыба"});
        List<String> actual = lion.getFood();
        assertEquals(expected, actual);

    }
}
