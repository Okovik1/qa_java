package com.example.lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionGetFoodTest {

    @Mock
    Feline feline;

    @Test
    public void lionGetFoodTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of(new String[]{"Животные", "Птицы", "Рыба"}));
        List<String> expected = List.of(new String[]{"Животные", "Птицы", "Рыба"});
        List<String> actual = lion.getFood();
        assertEquals(expected, actual);
    }
}
